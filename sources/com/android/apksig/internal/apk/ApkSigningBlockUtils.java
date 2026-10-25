package com.android.apksig.internal.apk;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import com.android.apksig.ApkVerifier;
import com.android.apksig.KeyConfig;
import com.android.apksig.SignerEngineFactory;
import com.android.apksig.SigningCertificateLineage;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkUtils;
import com.android.apksig.internal.asn1.Asn1BerParser;
import com.android.apksig.internal.asn1.Asn1DecodingException;
import com.android.apksig.internal.asn1.Asn1DerEncoder;
import com.android.apksig.internal.asn1.Asn1EncodingException;
import com.android.apksig.internal.asn1.Asn1OpaqueObject;
import com.android.apksig.internal.pkcs7.AlgorithmIdentifier;
import com.android.apksig.internal.pkcs7.ContentInfo;
import com.android.apksig.internal.pkcs7.EncapsulatedContentInfo;
import com.android.apksig.internal.pkcs7.IssuerAndSerialNumber;
import com.android.apksig.internal.pkcs7.Pkcs7Constants;
import com.android.apksig.internal.pkcs7.SignedData;
import com.android.apksig.internal.pkcs7.SignerIdentifier;
import com.android.apksig.internal.pkcs7.SignerInfo;
import com.android.apksig.internal.util.ByteBufferDataSource;
import com.android.apksig.internal.util.ChainedDataSource;
import com.android.apksig.internal.util.GuaranteedEncodedFormX509Certificate;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.internal.util.VerityTreeBuilder;
import com.android.apksig.internal.util.X509CertificateUtils;
import com.android.apksig.internal.x509.RSAPublicKey;
import com.android.apksig.internal.x509.SubjectPublicKeyInfo;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSinks;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.DataSources;
import com.android.apksig.util.RunnablesExecutor;
import com.android.apksig.util.RunnablesProvider;
import com.facebook.stetho.dumpapp.Framer;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public class ApkSigningBlockUtils {
    public static final int ANDROID_COMMON_PAGE_ALIGNMENT_BYTES = 4096;
    private static final long CONTENT_DIGESTED_CHUNK_MAX_SIZE_BYTES = 1048576;
    public static final int VERITY_PADDING_BLOCK_ID = 1114793335;
    public static final int VERSION_APK_SIGNATURE_SCHEME_V2 = 2;
    public static final int VERSION_APK_SIGNATURE_SCHEME_V3 = 3;
    public static final int VERSION_APK_SIGNATURE_SCHEME_V31 = 31;
    public static final int VERSION_APK_SIGNATURE_SCHEME_V4 = 4;
    public static final int VERSION_JAR_SIGNATURE_SCHEME = 1;
    public static final int VERSION_SOURCE_STAMP = 0;
    private static final byte[] APK_SIGNING_BLOCK_MAGIC = {65, 80, 75, 32, 83, 105, 103, 32, 66, 108, 111, 99, 107, 32, 52, Framer.STDERR_FRAME_PREFIX};
    private static final ContentDigestAlgorithm[] V4_CONTENT_DIGEST_ALGORITHMS = {ContentDigestAlgorithm.CHUNKED_SHA512, ContentDigestAlgorithm.VERITY_CHUNKED_SHA256, ContentDigestAlgorithm.CHUNKED_SHA256};

    public static class SignerConfig {
        public List<X509Certificate> certificates;
        public KeyConfig keyConfig;
        public int maxSdkVersion;
        public int minSdkVersion;

        @Deprecated
        public PrivateKey privateKey;
        public List<SignatureAlgorithm> signatureAlgorithms;
        public boolean signerTargetsDevRelease;
        public SigningCertificateLineage signingCertificateLineage;
    }

    public static int compareSignatureAlgorithm(SignatureAlgorithm alg1, SignatureAlgorithm alg2) {
        return ApkSigningBlockUtilsLite.compareSignatureAlgorithm(alg1, alg2);
    }

    public static void verifyIntegrity(RunnablesExecutor executor, DataSource beforeApkSigningBlock, DataSource centralDir, ByteBuffer eocd, Set<ContentDigestAlgorithm> contentDigestAlgorithms, Result result) throws NoSuchAlgorithmException, IOException {
        if (contentDigestAlgorithms.isEmpty()) {
            throw new RuntimeException("No content digests found");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(eocd.remaining());
        int iPosition = eocd.position();
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(eocd);
        byteBufferAllocate.flip();
        eocd.position(iPosition);
        ZipUtils.setZipEocdCentralDirectoryOffset(byteBufferAllocate, beforeApkSigningBlock.size());
        try {
            Map<ContentDigestAlgorithm, byte[]> mapComputeContentDigests = computeContentDigests(executor, contentDigestAlgorithms, beforeApkSigningBlock, centralDir, new ByteBufferDataSource(byteBufferAllocate));
            if (mapComputeContentDigests.containsKey(ContentDigestAlgorithm.VERITY_CHUNKED_SHA256)) {
                if (beforeApkSigningBlock.size() % PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM != 0) {
                    throw new RuntimeException("APK Signing Block is not aligned on 4k boundary: " + beforeApkSigningBlock.size());
                }
                long zipEocdCentralDirectoryOffset = ZipUtils.getZipEocdCentralDirectoryOffset(eocd) - beforeApkSigningBlock.size();
                if (zipEocdCentralDirectoryOffset % PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM != 0) {
                    throw new RuntimeException("APK Signing Block size is not multiple of page size: " + zipEocdCentralDirectoryOffset);
                }
            }
            if (!contentDigestAlgorithms.equals(mapComputeContentDigests.keySet())) {
                throw new RuntimeException("Mismatch between sets of requested and computed content digests . Requested: " + contentDigestAlgorithms + ", computed: " + mapComputeContentDigests.keySet());
            }
            for (Result.SignerInfo signerInfo : result.signers) {
                for (Result.SignerInfo.ContentDigest contentDigest : signerInfo.contentDigests) {
                    SignatureAlgorithm signatureAlgorithmFindById = SignatureAlgorithm.findById(contentDigest.getSignatureAlgorithmId());
                    if (signatureAlgorithmFindById != null) {
                        ContentDigestAlgorithm contentDigestAlgorithm = signatureAlgorithmFindById.getContentDigestAlgorithm();
                        if (contentDigestAlgorithms.contains(contentDigestAlgorithm)) {
                            byte[] value = contentDigest.getValue();
                            byte[] bArr = mapComputeContentDigests.get(contentDigestAlgorithm);
                            if (!Arrays.equals(value, bArr)) {
                                if (result.signatureSchemeVersion == 2) {
                                    signerInfo.addError(ApkVerifier.Issue.V2_SIG_APK_DIGEST_DID_NOT_VERIFY, contentDigestAlgorithm, toHex(value), toHex(bArr));
                                } else if (result.signatureSchemeVersion == 3) {
                                    signerInfo.addError(ApkVerifier.Issue.V3_SIG_APK_DIGEST_DID_NOT_VERIFY, contentDigestAlgorithm, toHex(value), toHex(bArr));
                                }
                            } else {
                                signerInfo.verifiedContentDigests.put(contentDigestAlgorithm, bArr);
                            }
                        }
                    }
                }
            }
        } catch (DigestException e) {
            throw new RuntimeException("Failed to compute content digests", e);
        }
    }

    public static ByteBuffer findApkSignatureSchemeBlock(ByteBuffer apkSigningBlock, int blockId, Result result) throws SignatureNotFoundException {
        try {
            return ApkSigningBlockUtilsLite.findApkSignatureSchemeBlock(apkSigningBlock, blockId);
        } catch (com.android.apksig.internal.apk.SignatureNotFoundException e) {
            throw new SignatureNotFoundException(e.getMessage());
        }
    }

    public static void checkByteOrderLittleEndian(ByteBuffer buffer) {
        ApkSigningBlockUtilsLite.checkByteOrderLittleEndian(buffer);
    }

    public static ByteBuffer getLengthPrefixedSlice(ByteBuffer source) throws ApkFormatException {
        return ApkSigningBlockUtilsLite.getLengthPrefixedSlice(source);
    }

    public static byte[] readLengthPrefixedByteArray(ByteBuffer buf) throws ApkFormatException {
        return ApkSigningBlockUtilsLite.readLengthPrefixedByteArray(buf);
    }

    public static String toHex(byte[] value) {
        return ApkSigningBlockUtilsLite.toHex(value);
    }

    public static Map<ContentDigestAlgorithm, byte[]> computeContentDigests(RunnablesExecutor executor, Set<ContentDigestAlgorithm> digestAlgorithms, DataSource beforeCentralDir, DataSource centralDir, DataSource eocd) throws NoSuchAlgorithmException, DigestException, IOException {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        for (ContentDigestAlgorithm contentDigestAlgorithm : digestAlgorithms) {
            if (contentDigestAlgorithm == ContentDigestAlgorithm.CHUNKED_SHA256 || contentDigestAlgorithm == ContentDigestAlgorithm.CHUNKED_SHA512) {
                hashSet.add(contentDigestAlgorithm);
            }
        }
        computeOneMbChunkContentDigests(executor, hashSet, new DataSource[]{beforeCentralDir, centralDir, eocd}, map);
        if (digestAlgorithms.contains(ContentDigestAlgorithm.VERITY_CHUNKED_SHA256)) {
            computeApkVerityDigest(beforeCentralDir, centralDir, eocd, map);
        }
        return map;
    }

    static void computeOneMbChunkContentDigests(Set<ContentDigestAlgorithm> digestAlgorithms, DataSource[] contents, Map<ContentDigestAlgorithm, byte[]> outputContentDigests) throws NoSuchAlgorithmException, DigestException, IOException {
        long j;
        char c;
        int length = contents.length;
        int i = 0;
        long chunkCount = 0;
        while (true) {
            j = 1048576;
            if (i >= length) {
                break;
            }
            chunkCount += getChunkCount(contents[i].size(), 1048576L);
            i++;
        }
        if (chunkCount > SieveCacheKt.NodeLinkMask) {
            throw new DigestException("Input too long: " + chunkCount + " chunks");
        }
        int i2 = (int) chunkCount;
        ContentDigestAlgorithm[] contentDigestAlgorithmArr = (ContentDigestAlgorithm[]) digestAlgorithms.toArray(new ContentDigestAlgorithm[digestAlgorithms.size()]);
        int length2 = contentDigestAlgorithmArr.length;
        MessageDigest[] messageDigestArr = new MessageDigest[length2];
        byte[][] bArr = new byte[contentDigestAlgorithmArr.length][];
        int[] iArr = new int[contentDigestAlgorithmArr.length];
        int i3 = 0;
        while (true) {
            c = 5;
            if (i3 >= contentDigestAlgorithmArr.length) {
                break;
            }
            ContentDigestAlgorithm contentDigestAlgorithm = contentDigestAlgorithmArr[i3];
            int chunkDigestOutputSizeBytes = contentDigestAlgorithm.getChunkDigestOutputSizeBytes();
            iArr[i3] = chunkDigestOutputSizeBytes;
            byte[] bArr2 = new byte[(chunkDigestOutputSizeBytes * i2) + 5];
            bArr2[0] = 90;
            setUnsignedInt32LittleEndian(i2, bArr2, 1);
            bArr[i3] = bArr2;
            messageDigestArr[i3] = MessageDigest.getInstance(contentDigestAlgorithm.getJcaMessageDigestAlgorithm());
            i3++;
        }
        DataSink dataSinkAsDataSink = DataSinks.asDataSink(messageDigestArr);
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        int length3 = contents.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length3) {
            int i6 = i5;
            DataSource dataSource = contents[i4];
            ContentDigestAlgorithm[] contentDigestAlgorithmArr2 = contentDigestAlgorithmArr;
            int i7 = i6;
            long size = dataSource.size();
            long j2 = 0;
            while (size > 0) {
                byte[][] bArr4 = bArr;
                int[] iArr2 = iArr;
                int iMin = (int) Math.min(size, j);
                setUnsignedInt32LittleEndian(iMin, bArr3, 1);
                for (int i8 = 0; i8 < length2; i8++) {
                    messageDigestArr[i8].update(bArr3);
                }
                long j3 = iMin;
                try {
                    dataSource.feed(j2, j3, dataSinkAsDataSink);
                    int i9 = 0;
                    ContentDigestAlgorithm[] contentDigestAlgorithmArr3 = contentDigestAlgorithmArr2;
                    while (i9 < contentDigestAlgorithmArr3.length) {
                        MessageDigest messageDigest = messageDigestArr[i9];
                        byte[] bArr5 = bArr4[i9];
                        int i10 = iArr2[i9];
                        char c2 = c;
                        int iDigest = messageDigest.digest(bArr5, (i7 * i10) + 5, i10);
                        if (iDigest != i10) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i9++;
                        c = c2;
                    }
                    j2 += j3;
                    size -= j3;
                    i7++;
                    contentDigestAlgorithmArr2 = contentDigestAlgorithmArr3;
                    bArr = bArr4;
                    iArr = iArr2;
                    j = 1048576;
                } catch (IOException e) {
                    throw new IOException("Failed to read chunk #" + i7, e);
                }
            }
            i4++;
            i5 = i7;
            contentDigestAlgorithmArr = contentDigestAlgorithmArr2;
            j = 1048576;
        }
        ContentDigestAlgorithm[] contentDigestAlgorithmArr4 = contentDigestAlgorithmArr;
        byte[][] bArr6 = bArr;
        for (int i11 = 0; i11 < contentDigestAlgorithmArr4.length; i11++) {
            outputContentDigests.put(contentDigestAlgorithmArr4[i11], messageDigestArr[i11].digest(bArr6[i11]));
        }
    }

    static void computeOneMbChunkContentDigests(RunnablesExecutor executor, Set<ContentDigestAlgorithm> digestAlgorithms, DataSource[] contents, Map<ContentDigestAlgorithm, byte[]> outputContentDigests) throws NoSuchAlgorithmException, DigestException {
        long chunkCount = 0;
        for (DataSource dataSource : contents) {
            chunkCount += getChunkCount(dataSource.size(), 1048576L);
        }
        if (chunkCount > SieveCacheKt.NodeLinkMask) {
            throw new DigestException("Input too long: " + chunkCount + " chunks");
        }
        int i = (int) chunkCount;
        final ArrayList<ChunkDigests> arrayList = new ArrayList(digestAlgorithms.size());
        Iterator<ContentDigestAlgorithm> it = digestAlgorithms.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                arrayList.add(new ChunkDigests(it.next(), i));
            }
        }
        final ChunkSupplier chunkSupplier = new ChunkSupplier(contents);
        executor.execute(new RunnablesProvider() { // from class: com.android.apksig.internal.apk.ApkSigningBlockUtils$$ExternalSyntheticLambda0
            @Override // com.android.apksig.util.RunnablesProvider
            public final Runnable createRunnable() {
                return ApkSigningBlockUtils.lambda$computeOneMbChunkContentDigests$0(chunkSupplier, arrayList);
            }
        });
        for (ChunkDigests chunkDigests : arrayList) {
            outputContentDigests.put(chunkDigests.algorithm, chunkDigests.createMessageDigest().digest(chunkDigests.concatOfDigestsOfChunks));
        }
    }

    static /* synthetic */ Runnable lambda$computeOneMbChunkContentDigests$0(ChunkSupplier chunkSupplier, List list) {
        return new ChunkDigester(chunkSupplier, list);
    }

    private static class ChunkDigests {
        private final ContentDigestAlgorithm algorithm;
        private final byte[] concatOfDigestsOfChunks;
        private final int digestOutputSize;

        private ChunkDigests(ContentDigestAlgorithm algorithm, int chunkCount) {
            this.algorithm = algorithm;
            int chunkDigestOutputSizeBytes = algorithm.getChunkDigestOutputSizeBytes();
            this.digestOutputSize = chunkDigestOutputSizeBytes;
            byte[] bArr = new byte[(chunkDigestOutputSizeBytes * chunkCount) + 5];
            this.concatOfDigestsOfChunks = bArr;
            bArr[0] = 90;
            ApkSigningBlockUtils.setUnsignedInt32LittleEndian(chunkCount, bArr, 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MessageDigest createMessageDigest() throws NoSuchAlgorithmException {
            return MessageDigest.getInstance(this.algorithm.getJcaMessageDigestAlgorithm());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getOffset(int chunkIndex) {
            return (chunkIndex * this.digestOutputSize) + 5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class ChunkDigester implements Runnable {
        private final List<ChunkDigests> chunkDigests;
        private final ChunkSupplier dataSupplier;
        private final DataSink mdSink;
        private final List<MessageDigest> messageDigests;

        private ChunkDigester(ChunkSupplier dataSupplier, List<ChunkDigests> chunkDigests) {
            this.dataSupplier = dataSupplier;
            this.chunkDigests = chunkDigests;
            this.messageDigests = new ArrayList(chunkDigests.size());
            Iterator<ChunkDigests> it = chunkDigests.iterator();
            while (it.hasNext()) {
                try {
                    this.messageDigests.add(it.next().createMessageDigest());
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            }
            this.mdSink = DataSinks.asDataSink((MessageDigest[]) this.messageDigests.toArray(new MessageDigest[0]));
        }

        @Override // java.lang.Runnable
        public void run() {
            byte[] bArr = new byte[5];
            bArr[0] = -91;
            try {
                ChunkSupplier.Chunk chunk = this.dataSupplier.get();
                while (chunk != null) {
                    int i = chunk.size;
                    if (i <= 1048576) {
                        ApkSigningBlockUtils.setUnsignedInt32LittleEndian(i, bArr, 1);
                        this.mdSink.consume(bArr, 0, 5);
                        this.mdSink.consume(chunk.data);
                        for (int i2 = 0; i2 < this.chunkDigests.size(); i2++) {
                            ChunkDigests chunkDigests = this.chunkDigests.get(i2);
                            int iDigest = this.messageDigests.get(i2).digest(chunkDigests.concatOfDigestsOfChunks, chunkDigests.getOffset(chunk.chunkIndex), chunkDigests.digestOutputSize);
                            if (iDigest != chunkDigests.digestOutputSize) {
                                throw new RuntimeException("Unexpected output size of " + chunkDigests.algorithm + " digest: " + iDigest);
                            }
                        }
                        chunk = this.dataSupplier.get();
                    } else {
                        throw new RuntimeException("Chunk size greater than expected: " + i);
                    }
                }
            } catch (IOException | DigestException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class ChunkSupplier implements Supplier<Chunk> {
        private final int[] chunkCounts;
        private final DataSource[] dataSources;
        private final AtomicInteger nextIndex;
        private final int totalChunkCount;

        private ChunkSupplier(DataSource[] dataSources) {
            this.dataSources = dataSources;
            this.chunkCounts = new int[dataSources.length];
            int i = 0;
            for (int i2 = 0; i2 < dataSources.length; i2++) {
                long chunkCount = ApkSigningBlockUtils.getChunkCount(dataSources[i2].size(), 1048576L);
                if (chunkCount > SieveCacheKt.NodeLinkMask) {
                    throw new RuntimeException(String.format("Number of chunks in dataSource[%d] is greater than max int.", Integer.valueOf(i2)));
                }
                this.chunkCounts[i2] = (int) chunkCount;
                i = (int) (((long) i) + chunkCount);
            }
            this.totalChunkCount = i;
            this.nextIndex = new AtomicInteger(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.function.Supplier
        public Chunk get() {
            DataSource[] dataSourceArr;
            int andIncrement = this.nextIndex.getAndIncrement();
            if (andIncrement < 0 || andIncrement >= this.totalChunkCount) {
                return null;
            }
            long j = andIncrement;
            int i = 0;
            while (true) {
                dataSourceArr = this.dataSources;
                if (i >= dataSourceArr.length) {
                    break;
                }
                int i2 = this.chunkCounts[i];
                if (j < i2) {
                    break;
                }
                j -= (long) i2;
                i++;
            }
            long j2 = j * 1048576;
            int iMin = (int) Math.min(dataSourceArr[i].size() - j2, 1048576L);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iMin);
            try {
                this.dataSources[i].copyTo(j2, iMin, byteBufferAllocate);
                byteBufferAllocate.rewind();
                return new Chunk(andIncrement, byteBufferAllocate, iMin);
            } catch (IOException e) {
                throw new IllegalStateException("Failed to read chunk", e);
            }
        }

        static class Chunk {
            private final int chunkIndex;
            private final ByteBuffer data;
            private final int size;

            private Chunk(int chunkIndex, ByteBuffer data, int size) {
                this.chunkIndex = chunkIndex;
                this.data = data;
                this.size = size;
            }
        }
    }

    private static void computeApkVerityDigest(DataSource beforeCentralDir, DataSource centralDir, DataSource eocd, Map<ContentDigestAlgorithm, byte[]> outputContentDigests) throws NoSuchAlgorithmException, IOException {
        ByteBuffer byteBufferCreateVerityDigestBuffer = createVerityDigestBuffer(true);
        VerityTreeBuilder verityTreeBuilder = new VerityTreeBuilder(new byte[8]);
        try {
            byteBufferCreateVerityDigestBuffer.put(verityTreeBuilder.generateVerityTreeRootHash(beforeCentralDir, centralDir, eocd));
            byteBufferCreateVerityDigestBuffer.putLong(beforeCentralDir.size() + centralDir.size() + eocd.size());
            outputContentDigests.put(ContentDigestAlgorithm.VERITY_CHUNKED_SHA256, byteBufferCreateVerityDigestBuffer.array());
            verityTreeBuilder.close();
        } catch (Throwable th) {
            try {
                verityTreeBuilder.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static ByteBuffer createVerityDigestBuffer(boolean includeSourceDataSize) {
        int chunkDigestOutputSizeBytes = ContentDigestAlgorithm.VERITY_CHUNKED_SHA256.getChunkDigestOutputSizeBytes();
        if (includeSourceDataSize) {
            chunkDigestOutputSizeBytes += 8;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(chunkDigestOutputSizeBytes);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        return byteBufferAllocate;
    }

    public static class VerityTreeAndDigest {
        public final ContentDigestAlgorithm contentDigestAlgorithm;
        public final byte[] rootHash;
        public final byte[] tree;

        VerityTreeAndDigest(ContentDigestAlgorithm contentDigestAlgorithm, byte[] rootHash, byte[] tree) {
            this.contentDigestAlgorithm = contentDigestAlgorithm;
            this.rootHash = rootHash;
            this.tree = tree;
        }
    }

    public static VerityTreeAndDigest computeChunkVerityTreeAndDigest(DataSource dataSource) throws NoSuchAlgorithmException, IOException {
        ByteBuffer byteBufferCreateVerityDigestBuffer = createVerityDigestBuffer(false);
        VerityTreeBuilder verityTreeBuilder = new VerityTreeBuilder(null);
        try {
            ByteBuffer byteBufferGenerateVerityTree = verityTreeBuilder.generateVerityTree(dataSource);
            byteBufferCreateVerityDigestBuffer.put(verityTreeBuilder.getRootHashFromTree(byteBufferGenerateVerityTree));
            VerityTreeAndDigest verityTreeAndDigest = new VerityTreeAndDigest(ContentDigestAlgorithm.VERITY_CHUNKED_SHA256, byteBufferCreateVerityDigestBuffer.array(), byteBufferGenerateVerityTree.array());
            verityTreeBuilder.close();
            return verityTreeAndDigest;
        } catch (Throwable th) {
            try {
                verityTreeBuilder.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getChunkCount(long inputSize, long chunkSize) {
        return ((inputSize + chunkSize) - 1) / chunkSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setUnsignedInt32LittleEndian(int value, byte[] result, int offset) {
        result[offset] = (byte) (value & 255);
        result[offset + 1] = (byte) ((value >> 8) & 255);
        result[offset + 2] = (byte) ((value >> 16) & 255);
        result[offset + 3] = (byte) ((value >> 24) & 255);
    }

    public static byte[] encodePublicKey(PublicKey publicKey) throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] encoded = null;
        if ("X.509".equals(publicKey.getFormat())) {
            byte[] encoded2 = publicKey.getEncoded();
            String algorithm = publicKey.getAlgorithm();
            if ("RSA".equals(algorithm) || "1.2.840.113549.1.1.1".equals(algorithm)) {
                try {
                    SubjectPublicKeyInfo subjectPublicKeyInfo = (SubjectPublicKeyInfo) Asn1BerParser.parse(ByteBuffer.wrap(encoded2), SubjectPublicKeyInfo.class);
                    ByteBuffer byteBuffer = subjectPublicKeyInfo.subjectPublicKey;
                    byte b = byteBuffer.get();
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) Asn1BerParser.parse(byteBuffer, RSAPublicKey.class);
                    if (rSAPublicKey.modulus.compareTo(BigInteger.ZERO) < 0) {
                        byte[] byteArray = rSAPublicKey.modulus.toByteArray();
                        byte[] bArr = new byte[byteArray.length + 1];
                        bArr[0] = 0;
                        System.arraycopy(byteArray, 0, bArr, 1, byteArray.length);
                        rSAPublicKey.modulus = new BigInteger(bArr);
                        byte[] bArrEncode = Asn1DerEncoder.encode(rSAPublicKey);
                        byte[] bArr2 = new byte[bArrEncode.length + 1];
                        bArr2[0] = b;
                        System.arraycopy(bArrEncode, 0, bArr2, 1, bArrEncode.length);
                        subjectPublicKeyInfo.subjectPublicKey = ByteBuffer.wrap(bArr2);
                        encoded2 = Asn1DerEncoder.encode(subjectPublicKeyInfo);
                    }
                } catch (Asn1DecodingException | Asn1EncodingException e) {
                    System.out.println("Caught a exception encoding the public key: " + e);
                    e.printStackTrace();
                }
            }
            encoded = encoded2;
        }
        if (encoded == null) {
            try {
                encoded = ((X509EncodedKeySpec) KeyFactory.getInstance(publicKey.getAlgorithm()).getKeySpec(publicKey, X509EncodedKeySpec.class)).getEncoded();
            } catch (InvalidKeySpecException e2) {
                throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName(), e2);
            }
        }
        if (encoded == null || encoded.length == 0) {
            throw new InvalidKeyException("Failed to obtain X.509 encoded form of public key " + publicKey + " of class " + publicKey.getClass().getName());
        }
        return encoded;
    }

    public static List<byte[]> encodeCertificates(List<X509Certificate> certificates) throws CertificateEncodingException {
        ArrayList arrayList = new ArrayList(certificates.size());
        Iterator<X509Certificate> it = certificates.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getEncoded());
        }
        return arrayList;
    }

    public static byte[] encodeAsLengthPrefixedElement(byte[] bytes) {
        return encodeAsSequenceOfLengthPrefixedElements(new byte[][]{bytes});
    }

    public static byte[] encodeAsSequenceOfLengthPrefixedElements(List<byte[]> sequence) {
        return encodeAsSequenceOfLengthPrefixedElements((byte[][]) sequence.toArray(new byte[sequence.size()][]));
    }

    public static byte[] encodeAsSequenceOfLengthPrefixedElements(byte[][] sequence) {
        int length = 0;
        for (byte[] bArr : sequence) {
            length += bArr.length + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        for (byte[] bArr2 : sequence) {
            byteBufferAllocate.putInt(bArr2.length);
            byteBufferAllocate.put(bArr2);
        }
        return byteBufferAllocate.array();
    }

    public static byte[] encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(List<Pair<Integer, byte[]>> sequence) {
        return ApkSigningBlockUtilsLite.encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(sequence);
    }

    public static SignatureInfo findSignature(DataSource apk, ApkUtils.ZipSections zipSections, int blockId, Result result) throws SignatureNotFoundException, IOException {
        try {
            return ApkSigningBlockUtilsLite.findSignature(apk, zipSections, blockId);
        } catch (com.android.apksig.internal.apk.SignatureNotFoundException e) {
            throw new SignatureNotFoundException(e.getMessage());
        }
    }

    public static Pair<DataSource, Integer> generateApkSigningBlockPadding(DataSource beforeCentralDir, boolean apkSigningBlockPaddingSupported) {
        int i = 0;
        if (apkSigningBlockPaddingSupported && beforeCentralDir.size() % PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM != 0) {
            int size = (int) (PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM - (beforeCentralDir.size() % PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM));
            i = size;
            beforeCentralDir = new ChainedDataSource(beforeCentralDir, DataSources.asDataSource(ByteBuffer.allocate(size)));
        }
        return Pair.of(beforeCentralDir, Integer.valueOf(i));
    }

    public static DataSource copyWithModifiedCDOffset(DataSource beforeCentralDir, DataSource eocd) throws IOException {
        long size = beforeCentralDir.size();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) eocd.size());
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        eocd.copyTo(0L, (int) eocd.size(), byteBufferAllocate);
        byteBufferAllocate.flip();
        ZipUtils.setZipEocdCentralDirectoryOffset(byteBufferAllocate, size);
        return DataSources.asDataSource(byteBufferAllocate);
    }

    public static byte[] generateApkSigningBlock(List<Pair<byte[], Integer>> apkSignatureSchemeBlockPairs) {
        ByteBuffer byteBufferOrder;
        Iterator<Pair<byte[], Integer>> it = apkSignatureSchemeBlockPairs.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().getFirst().length + 12;
        }
        int i = length + 32;
        int i2 = i % 4096;
        if (i2 != 0) {
            int i3 = 4096 - i2;
            if (i3 < 12) {
                i3 = 8192 - i2;
            }
            byteBufferOrder = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.putLong(i3 - 8);
            byteBufferOrder.putInt(VERITY_PADDING_BLOCK_ID);
            byteBufferOrder.rewind();
            i += i3;
        } else {
            byteBufferOrder = null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long j = ((long) i) - 8;
        byteBufferAllocate.putLong(j);
        for (Pair<byte[], Integer> pair : apkSignatureSchemeBlockPairs) {
            byte[] first = pair.getFirst();
            int iIntValue = pair.getSecond().intValue();
            byteBufferAllocate.putLong(((long) first.length) + 4);
            byteBufferAllocate.putInt(iIntValue);
            byteBufferAllocate.put(first);
        }
        if (byteBufferOrder != null) {
            byteBufferAllocate.put(byteBufferOrder);
        }
        byteBufferAllocate.putLong(j);
        byteBufferAllocate.put(APK_SIGNING_BLOCK_MAGIC);
        return byteBufferAllocate.array();
    }

    public static List<Pair<byte[], Integer>> getApkSignatureBlocks(DataSource apkSigningBlock) throws IOException {
        long size = apkSigningBlock.size();
        if (apkSigningBlock.size() > SieveCacheKt.NodeLinkMask || size < 32) {
            throw new IllegalArgumentException("APK signing block size out of range: " + size);
        }
        ByteBuffer byteBuffer = apkSigningBlock.getByteBuffer(8L, ((int) apkSigningBlock.size()) - 32);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            long j = byteBuffer.getLong();
            if (j > SieveCacheKt.NodeLinkMask || j < 4) {
                throw new IllegalArgumentException("Block index " + (arrayList.size() + 1) + " size out of range: " + j);
            }
            int i = byteBuffer.getInt();
            byte[] bArr = new byte[((int) j) - 4];
            byteBuffer.get(bArr);
            arrayList.add(Pair.of(bArr, Integer.valueOf(i)));
        }
        return arrayList;
    }

    public static List<Pair<List<X509Certificate>, byte[]>> getApkSignatureBlockSigners(byte[] signatureBlock) throws ApkFormatException, CertificateException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(signatureBlock);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        ByteBuffer lengthPrefixedSlice = getLengthPrefixedSlice(byteBufferWrap);
        ArrayList arrayList = new ArrayList();
        while (lengthPrefixedSlice.hasRemaining()) {
            ByteBuffer lengthPrefixedSlice2 = getLengthPrefixedSlice(lengthPrefixedSlice);
            byte[] bArr = new byte[lengthPrefixedSlice2.remaining()];
            lengthPrefixedSlice2.get(bArr);
            lengthPrefixedSlice2.rewind();
            ByteBuffer lengthPrefixedSlice3 = getLengthPrefixedSlice(lengthPrefixedSlice2);
            getLengthPrefixedSlice(lengthPrefixedSlice3);
            ByteBuffer lengthPrefixedSlice4 = getLengthPrefixedSlice(lengthPrefixedSlice3);
            ArrayList arrayList2 = new ArrayList();
            while (lengthPrefixedSlice4.hasRemaining()) {
                int i = lengthPrefixedSlice4.getInt();
                byte[] bArr2 = new byte[i];
                if (i > lengthPrefixedSlice4.remaining()) {
                    throw new IllegalArgumentException("Cert index " + (arrayList2.size() + 1) + " under signer index " + (arrayList.size() + 1) + " size out of range: " + i);
                }
                lengthPrefixedSlice4.get(bArr2);
                arrayList2.add(new GuaranteedEncodedFormX509Certificate(X509CertificateUtils.generateCertificate(bArr2), bArr2));
            }
            arrayList.add(Pair.of(arrayList2, bArr));
        }
        return arrayList;
    }

    public static Pair<List<SignerConfig>, Map<ContentDigestAlgorithm, byte[]>> computeContentDigests(RunnablesExecutor executor, DataSource beforeCentralDir, DataSource centralDir, DataSource eocd, List<SignerConfig> signerConfigs) throws SignatureException, NoSuchAlgorithmException, IOException {
        if (signerConfigs.isEmpty()) {
            throw new IllegalArgumentException("No signer configs provided. At least one is required");
        }
        HashSet hashSet = new HashSet(1);
        Iterator<SignerConfig> it = signerConfigs.iterator();
        while (it.hasNext()) {
            Iterator<SignatureAlgorithm> it2 = it.next().signatureAlgorithms.iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next().getContentDigestAlgorithm());
            }
        }
        try {
            return Pair.of(signerConfigs, computeContentDigests(executor, hashSet, beforeCentralDir, centralDir, eocd));
        } catch (IOException e) {
            throw new IOException("Failed to read APK being signed", e);
        } catch (DigestException e2) {
            throw new SignatureException("Failed to compute digests of APK", e2);
        }
    }

    public static <T extends ApkSupportedSignature> List<T> getSignaturesToVerify(List<T> signatures, int minSdkVersion, int maxSdkVersion) throws NoSupportedSignaturesException {
        return getSignaturesToVerify(signatures, minSdkVersion, maxSdkVersion, false);
    }

    public static <T extends ApkSupportedSignature> List<T> getSignaturesToVerify(List<T> signatures, int minSdkVersion, int maxSdkVersion, boolean onlyRequireJcaSupport) throws NoSupportedSignaturesException {
        try {
            return ApkSigningBlockUtilsLite.getSignaturesToVerify(signatures, minSdkVersion, maxSdkVersion, onlyRequireJcaSupport);
        } catch (NoApkSupportedSignaturesException e) {
            throw new NoSupportedSignaturesException(e.getMessage());
        }
    }

    public static class NoSupportedSignaturesException extends NoApkSupportedSignaturesException {
        public NoSupportedSignaturesException(String message) {
            super(message);
        }
    }

    public static class SignatureNotFoundException extends Exception {
        private static final long serialVersionUID = 1;

        public SignatureNotFoundException(String message) {
            super(message);
        }

        public SignatureNotFoundException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static List<Pair<Integer, byte[]>> generateSignaturesOverData(SignerConfig signerConfig, byte[] data) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        ArrayList arrayList = new ArrayList(signerConfig.signatureAlgorithms.size());
        PublicKey publicKey = signerConfig.certificates.get(0).getPublicKey();
        for (SignatureAlgorithm signatureAlgorithm : signerConfig.signatureAlgorithms) {
            Pair<String, ? extends AlgorithmParameterSpec> jcaSignatureAlgorithmAndParams = signatureAlgorithm.getJcaSignatureAlgorithmAndParams();
            String first = jcaSignatureAlgorithmAndParams.getFirst();
            AlgorithmParameterSpec second = jcaSignatureAlgorithmAndParams.getSecond();
            try {
                byte[] bArrSign = SignerEngineFactory.getImplementation(signerConfig.keyConfig, first, second).sign(data);
                try {
                    Signature signature = Signature.getInstance(first);
                    signature.initVerify(publicKey);
                    if (second != null) {
                        signature.setParameter(second);
                    }
                    signature.update(data);
                    if (!signature.verify(bArrSign)) {
                        throw new SignatureException("Failed to verify generated " + first + " signature using public key from certificate");
                    }
                    arrayList.add(Pair.of(Integer.valueOf(signatureAlgorithm.getId()), bArrSign));
                } catch (InvalidAlgorithmParameterException e) {
                    e = e;
                    throw new SignatureException("Failed to verify generated " + first + " signature using public key from certificate", e);
                } catch (InvalidKeyException e2) {
                    throw new InvalidKeyException("Failed to verify generated " + first + " signature using public key from certificate", e2);
                } catch (SignatureException e3) {
                    e = e3;
                    throw new SignatureException("Failed to verify generated " + first + " signature using public key from certificate", e);
                }
            } catch (InvalidAlgorithmParameterException e4) {
                e = e4;
                throw new SignatureException("Failed to sign using " + first, e);
            } catch (InvalidKeyException e5) {
                throw new InvalidKeyException("Failed to sign using " + first, e5);
            } catch (SignatureException e6) {
                e = e6;
                throw new SignatureException("Failed to sign using " + first, e);
            }
        }
        return arrayList;
    }

    public static byte[] generatePkcs7DerEncodedMessage(byte[] signatureBytes, ByteBuffer data, List<X509Certificate> signerCerts, AlgorithmIdentifier digestAlgorithmId, AlgorithmIdentifier signatureAlgorithmId) throws Asn1EncodingException, CertificateEncodingException {
        SignerInfo signerInfo = new SignerInfo();
        signerInfo.version = 1;
        X509Certificate x509Certificate = signerCerts.get(0);
        signerInfo.sid = new SignerIdentifier(new IssuerAndSerialNumber(new Asn1OpaqueObject(x509Certificate.getIssuerX500Principal().getEncoded()), x509Certificate.getSerialNumber()));
        signerInfo.digestAlgorithm = digestAlgorithmId;
        signerInfo.signatureAlgorithm = signatureAlgorithmId;
        signerInfo.signature = ByteBuffer.wrap(signatureBytes);
        SignedData signedData = new SignedData();
        signedData.certificates = new ArrayList(signerCerts.size());
        Iterator<X509Certificate> it = signerCerts.iterator();
        while (it.hasNext()) {
            signedData.certificates.add(new Asn1OpaqueObject(it.next().getEncoded()));
        }
        signedData.version = 1;
        signedData.digestAlgorithms = Collections.singletonList(digestAlgorithmId);
        signedData.encapContentInfo = new EncapsulatedContentInfo(Pkcs7Constants.OID_DATA);
        signedData.encapContentInfo.content = data;
        signedData.signerInfos = Collections.singletonList(signerInfo);
        ContentInfo contentInfo = new ContentInfo();
        contentInfo.contentType = Pkcs7Constants.OID_SIGNED_DATA;
        contentInfo.content = new Asn1OpaqueObject(Asn1DerEncoder.encode(signedData));
        return Asn1DerEncoder.encode(contentInfo);
    }

    public static byte[] pickBestDigestForV4(Map<ContentDigestAlgorithm, byte[]> contentDigests) {
        for (ContentDigestAlgorithm contentDigestAlgorithm : V4_CONTENT_DIGEST_ALGORITHMS) {
            if (contentDigests.containsKey(contentDigestAlgorithm)) {
                return contentDigests.get(contentDigestAlgorithm);
            }
        }
        return null;
    }

    public static class Result extends ApkSigResult {
        private final List<ApkVerifier.IssueWithParams> mErrors;
        private final List<ApkVerifier.IssueWithParams> mWarnings;
        public final List<SignerInfo> signers;
        public SigningCertificateLineage signingCertificateLineage;

        public Result(int signatureSchemeVersion) {
            super(signatureSchemeVersion);
            this.signingCertificateLineage = null;
            this.signers = new ArrayList();
            this.mWarnings = new ArrayList();
            this.mErrors = new ArrayList();
        }

        @Override // com.android.apksig.internal.apk.ApkSigResult
        public boolean containsErrors() {
            if (!this.mErrors.isEmpty()) {
                return true;
            }
            if (this.signers.isEmpty()) {
                return false;
            }
            Iterator<SignerInfo> it = this.signers.iterator();
            while (it.hasNext()) {
                if (it.next().containsErrors()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.android.apksig.internal.apk.ApkSigResult
        public boolean containsWarnings() {
            if (!this.mWarnings.isEmpty()) {
                return true;
            }
            if (this.signers.isEmpty()) {
                return false;
            }
            Iterator<SignerInfo> it = this.signers.iterator();
            while (it.hasNext()) {
                if (it.next().containsWarnings()) {
                    return true;
                }
            }
            return false;
        }

        public void addError(ApkVerifier.Issue msg, Object... parameters) {
            this.mErrors.add(new ApkVerifier.IssueWithParams(msg, parameters));
        }

        public void addWarning(ApkVerifier.Issue msg, Object... parameters) {
            this.mWarnings.add(new ApkVerifier.IssueWithParams(msg, parameters));
        }

        @Override // com.android.apksig.internal.apk.ApkSigResult
        public List<ApkVerifier.IssueWithParams> getErrors() {
            return this.mErrors;
        }

        @Override // com.android.apksig.internal.apk.ApkSigResult
        public List<ApkVerifier.IssueWithParams> getWarnings() {
            return this.mWarnings;
        }

        public static class SignerInfo extends ApkSignerInfo {
            public int maxSdkVersion;
            public int minSdkVersion;
            public byte[] signedData;
            public SigningCertificateLineage signingCertificateLineage;
            public List<ContentDigest> contentDigests = new ArrayList();
            public Map<ContentDigestAlgorithm, byte[]> verifiedContentDigests = new HashMap();
            public List<Signature> signatures = new ArrayList();
            public Map<SignatureAlgorithm, byte[]> verifiedSignatures = new HashMap();
            public List<AdditionalAttribute> additionalAttributes = new ArrayList();
            private final List<ApkVerifier.IssueWithParams> mWarnings = new ArrayList();
            private final List<ApkVerifier.IssueWithParams> mErrors = new ArrayList();

            public void addError(ApkVerifier.Issue msg, Object... parameters) {
                this.mErrors.add(new ApkVerifier.IssueWithParams(msg, parameters));
            }

            public void addWarning(ApkVerifier.Issue msg, Object... parameters) {
                this.mWarnings.add(new ApkVerifier.IssueWithParams(msg, parameters));
            }

            @Override // com.android.apksig.internal.apk.ApkSignerInfo
            public boolean containsErrors() {
                return !this.mErrors.isEmpty();
            }

            @Override // com.android.apksig.internal.apk.ApkSignerInfo
            public boolean containsWarnings() {
                return !this.mWarnings.isEmpty();
            }

            @Override // com.android.apksig.internal.apk.ApkSignerInfo
            public List<ApkVerifier.IssueWithParams> getErrors() {
                return this.mErrors;
            }

            @Override // com.android.apksig.internal.apk.ApkSignerInfo
            public List<ApkVerifier.IssueWithParams> getWarnings() {
                return this.mWarnings;
            }

            public static class ContentDigest {
                private final int mSignatureAlgorithmId;
                private final byte[] mValue;

                public ContentDigest(int signatureAlgorithmId, byte[] value) {
                    this.mSignatureAlgorithmId = signatureAlgorithmId;
                    this.mValue = value;
                }

                public int getSignatureAlgorithmId() {
                    return this.mSignatureAlgorithmId;
                }

                public byte[] getValue() {
                    return this.mValue;
                }
            }

            public static class Signature {
                private final int mAlgorithmId;
                private final byte[] mValue;

                public Signature(int algorithmId, byte[] value) {
                    this.mAlgorithmId = algorithmId;
                    this.mValue = value;
                }

                public int getAlgorithmId() {
                    return this.mAlgorithmId;
                }

                public byte[] getValue() {
                    return this.mValue;
                }
            }

            public static class AdditionalAttribute {
                private final int mId;
                private final byte[] mValue;

                public AdditionalAttribute(int id, byte[] value) {
                    this.mId = id;
                    this.mValue = (byte[]) value.clone();
                }

                public int getId() {
                    return this.mId;
                }

                public byte[] getValue() {
                    return (byte[]) this.mValue.clone();
                }
            }
        }
    }

    public static class SupportedSignature extends ApkSupportedSignature {
        public SupportedSignature(SignatureAlgorithm algorithm, byte[] signature) {
            super(algorithm, signature);
        }
    }

    public static class SigningSchemeBlockAndDigests {
        public final Map<ContentDigestAlgorithm, byte[]> digestInfo;
        public final Pair<byte[], Integer> signingSchemeBlock;

        public SigningSchemeBlockAndDigests(Pair<byte[], Integer> signingSchemeBlock, Map<ContentDigestAlgorithm, byte[]> digestInfo) {
            this.signingSchemeBlock = signingSchemeBlock;
            this.digestInfo = digestInfo;
        }
    }
}
