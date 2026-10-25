package com.android.apksig.internal.apk;

import androidx.collection.SieveCacheKt;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.apk.ApkSigningBlockNotFoundException;
import com.android.apksig.apk.ApkUtilsLite;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.ZipSections;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ApkSigningBlockUtilsLite {
    private static final char[] HEX_DIGITS = "0123456789abcdef".toCharArray();

    private ApkSigningBlockUtilsLite() {
    }

    public static SignatureInfo findSignature(DataSource apk, ZipSections zipSections, int blockId) throws SignatureNotFoundException, IOException {
        try {
            ApkUtilsLite.ApkSigningBlock apkSigningBlockFindApkSigningBlock = ApkUtilsLite.findApkSigningBlock(apk, zipSections);
            long startOffset = apkSigningBlockFindApkSigningBlock.getStartOffset();
            DataSource contents = apkSigningBlockFindApkSigningBlock.getContents();
            ByteBuffer byteBuffer = contents.getByteBuffer(0L, (int) contents.size());
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            return new SignatureInfo(findApkSignatureSchemeBlock(byteBuffer, blockId), startOffset, zipSections.getZipCentralDirectoryOffset(), zipSections.getZipEndOfCentralDirectoryOffset(), zipSections.getZipEndOfCentralDirectory());
        } catch (ApkSigningBlockNotFoundException e) {
            throw new SignatureNotFoundException(e.getMessage(), e);
        }
    }

    public static ByteBuffer findApkSignatureSchemeBlock(ByteBuffer apkSigningBlock, int blockId) throws SignatureNotFoundException {
        checkByteOrderLittleEndian(apkSigningBlock);
        ByteBuffer byteBufferSliceFromTo = sliceFromTo(apkSigningBlock, 8, apkSigningBlock.capacity() - 24);
        int i = 0;
        while (byteBufferSliceFromTo.hasRemaining()) {
            i++;
            if (byteBufferSliceFromTo.remaining() < 8) {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i);
            }
            long j = byteBufferSliceFromTo.getLong();
            if (j < 4 || j > SieveCacheKt.NodeLinkMask) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + j);
            }
            int i2 = (int) j;
            int iPosition = byteBufferSliceFromTo.position() + i2;
            if (i2 > byteBufferSliceFromTo.remaining()) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + byteBufferSliceFromTo.remaining());
            }
            if (byteBufferSliceFromTo.getInt() == blockId) {
                return getByteBuffer(byteBufferSliceFromTo, i2 - 4);
            }
            byteBufferSliceFromTo.position(iPosition);
        }
        throw new SignatureNotFoundException("No APK Signature Scheme block in APK Signing Block with ID: " + blockId);
    }

    public static void checkByteOrderLittleEndian(ByteBuffer buffer) {
        if (buffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static <T extends ApkSupportedSignature> List<T> getSignaturesToVerify(List<T> signatures, int minSdkVersion, int maxSdkVersion) throws NoApkSupportedSignaturesException {
        return getSignaturesToVerify(signatures, minSdkVersion, maxSdkVersion, false);
    }

    public static <T extends ApkSupportedSignature> List<T> getSignaturesToVerify(List<T> signatures, int minSdkVersion, int maxSdkVersion, boolean onlyRequireJcaSupport) throws NoApkSupportedSignaturesException {
        int minSdkVersion2;
        HashMap map = new HashMap();
        int i = Integer.MAX_VALUE;
        for (T t : signatures) {
            SignatureAlgorithm signatureAlgorithm = t.algorithm;
            if (onlyRequireJcaSupport) {
                minSdkVersion2 = signatureAlgorithm.getJcaSigAlgMinSdkVersion();
            } else {
                minSdkVersion2 = signatureAlgorithm.getMinSdkVersion();
            }
            if (minSdkVersion2 <= maxSdkVersion) {
                if (minSdkVersion2 < i) {
                    i = minSdkVersion2;
                }
                ApkSupportedSignature apkSupportedSignature = (ApkSupportedSignature) map.get(Integer.valueOf(minSdkVersion2));
                if (apkSupportedSignature == null || compareSignatureAlgorithm(signatureAlgorithm, apkSupportedSignature.algorithm) > 0) {
                    map.put(Integer.valueOf(minSdkVersion2), t);
                }
            }
        }
        if (minSdkVersion < i) {
            throw new NoApkSupportedSignaturesException("Minimum provided signature version " + i + " > minSdkVersion " + minSdkVersion);
        }
        if (map.isEmpty()) {
            throw new NoApkSupportedSignaturesException("No supported signature");
        }
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList, new Comparator() { // from class: com.android.apksig.internal.apk.ApkSigningBlockUtilsLite$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((ApkSupportedSignature) obj).algorithm.getId(), ((ApkSupportedSignature) obj2).algorithm.getId());
            }
        });
        return arrayList;
    }

    public static int compareSignatureAlgorithm(SignatureAlgorithm alg1, SignatureAlgorithm alg2) {
        return compareContentDigestAlgorithm(alg1.getContentDigestAlgorithm(), alg2.getContentDigestAlgorithm());
    }

    private static int compareContentDigestAlgorithm(ContentDigestAlgorithm alg1, ContentDigestAlgorithm alg2) {
        int i = AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm[alg1.ordinal()];
        if (i == 1) {
            int i2 = AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm[alg2.ordinal()];
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2 || i2 == 3) {
                return -1;
            }
            throw new IllegalArgumentException("Unknown alg2: " + alg2);
        }
        if (i == 2) {
            int i3 = AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm[alg2.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    return 0;
                }
                if (i3 != 3) {
                    throw new IllegalArgumentException("Unknown alg2: " + alg2);
                }
            }
            return 1;
        }
        if (i == 3) {
            int i4 = AnonymousClass1.$SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm[alg2.ordinal()];
            if (i4 == 1) {
                return 1;
            }
            if (i4 == 2) {
                return -1;
            }
            if (i4 == 3) {
                return 0;
            }
            throw new IllegalArgumentException("Unknown alg2: " + alg2);
        }
        throw new IllegalArgumentException("Unknown alg1: " + alg1);
    }

    /* JADX INFO: renamed from: com.android.apksig.internal.apk.ApkSigningBlockUtilsLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm;

        static {
            int[] iArr = new int[ContentDigestAlgorithm.values().length];
            $SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm = iArr;
            try {
                iArr[ContentDigestAlgorithm.CHUNKED_SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm[ContentDigestAlgorithm.CHUNKED_SHA512.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$android$apksig$internal$apk$ContentDigestAlgorithm[ContentDigestAlgorithm.VERITY_CHUNKED_SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static ByteBuffer sliceFromTo(ByteBuffer source, int start, int end) {
        if (start < 0) {
            throw new IllegalArgumentException("start: " + start);
        }
        if (end < start) {
            throw new IllegalArgumentException("end < start: " + end + " < " + start);
        }
        int iCapacity = source.capacity();
        if (end > source.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + end + " > " + iCapacity);
        }
        int iLimit = source.limit();
        int iPosition = source.position();
        try {
            source.position(0);
            source.limit(end);
            source.position(start);
            ByteBuffer byteBufferSlice = source.slice();
            byteBufferSlice.order(source.order());
            return byteBufferSlice;
        } finally {
            source.position(0);
            source.limit(iLimit);
            source.position(iPosition);
        }
    }

    private static ByteBuffer getByteBuffer(ByteBuffer source, int size) {
        if (size < 0) {
            throw new IllegalArgumentException("size: " + size);
        }
        int iLimit = source.limit();
        int iPosition = source.position();
        int i = size + iPosition;
        if (i < iPosition || i > iLimit) {
            throw new BufferUnderflowException();
        }
        source.limit(i);
        try {
            ByteBuffer byteBufferSlice = source.slice();
            byteBufferSlice.order(source.order());
            source.position(i);
            return byteBufferSlice;
        } finally {
            source.limit(iLimit);
        }
    }

    public static String toHex(byte[] value) {
        StringBuilder sb = new StringBuilder(value.length * 2);
        for (byte b : value) {
            int i = (b & 255) >>> 4;
            int i2 = b & Ascii.SI;
            char[] cArr = HEX_DIGITS;
            sb.append(cArr[i]).append(cArr[i2]);
        }
        return sb.toString();
    }

    public static ByteBuffer getLengthPrefixedSlice(ByteBuffer source) throws ApkFormatException {
        if (source.remaining() < 4) {
            throw new ApkFormatException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + source.remaining());
        }
        int i = source.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > source.remaining()) {
            throw new ApkFormatException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + source.remaining());
        }
        return getByteBuffer(source, i);
    }

    public static byte[] readLengthPrefixedByteArray(ByteBuffer buf) throws ApkFormatException {
        int i = buf.getInt();
        if (i < 0) {
            throw new ApkFormatException("Negative length");
        }
        if (i > buf.remaining()) {
            throw new ApkFormatException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + buf.remaining());
        }
        byte[] bArr = new byte[i];
        buf.get(bArr);
        return bArr;
    }

    public static byte[] encodeAsSequenceOfLengthPrefixedPairsOfIntAndLengthPrefixedBytes(List<Pair<Integer, byte[]>> sequence) {
        Iterator<Pair<Integer, byte[]>> it = sequence.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += it.next().getSecond().length + 12;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        for (Pair<Integer, byte[]> pair : sequence) {
            byte[] second = pair.getSecond();
            byteBufferAllocate.putInt(second.length + 8);
            byteBufferAllocate.putInt(pair.getFirst().intValue());
            byteBufferAllocate.putInt(second.length);
            byteBufferAllocate.put(second);
        }
        return byteBufferAllocate.array();
    }
}
