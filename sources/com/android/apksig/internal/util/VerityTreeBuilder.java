package com.android.apksig.internal.util;

import android.support.v4.media.session.PlaybackStateCompat;
import com.android.apksig.internal.zip.ZipUtils;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.DataSources;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Phaser;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class VerityTreeBuilder implements AutoCloseable {
    private static final int CHUNK_SIZE = 4096;
    private static final int DIGEST_PARALLELISM = Math.min(32, Runtime.getRuntime().availableProcessors());
    private static final String JCA_ALGORITHM = "SHA-256";
    private static final int MAX_OUTSTANDING_CHUNKS = 4;
    private static final int MAX_PREFETCH_CHUNKS = 1024;
    private static final int MIN_CHUNKS_PER_WORKER = 8;
    private final ExecutorService mExecutor;
    private final MessageDigest mMd;
    private final byte[] mSalt;

    public VerityTreeBuilder(byte[] salt) throws NoSuchAlgorithmException {
        int i = DIGEST_PARALLELISM;
        this.mExecutor = new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(4), new ThreadPoolExecutor.CallerRunsPolicy());
        this.mSalt = salt;
        this.mMd = getNewMessageDigest();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.mExecutor.shutdownNow();
    }

    public byte[] generateVerityTreeRootHash(DataSource beforeApkSigningBlock, DataSource centralDir, DataSource eocd) throws IOException {
        if (beforeApkSigningBlock.size() % PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM != 0) {
            throw new IllegalStateException("APK Signing Block size not a multiple of 4096: " + beforeApkSigningBlock.size());
        }
        long size = beforeApkSigningBlock.size();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) eocd.size());
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        eocd.copyTo(0L, (int) eocd.size(), byteBufferAllocate);
        byteBufferAllocate.flip();
        ZipUtils.setZipEocdCentralDirectoryOffset(byteBufferAllocate, size);
        return generateVerityTreeRootHash(new ChainedDataSource(beforeApkSigningBlock, centralDir, DataSources.asDataSource(byteBufferAllocate)));
    }

    public byte[] generateVerityTreeRootHash(DataSource fileSource) throws IOException {
        return getRootHashFromTree(generateVerityTree(fileSource));
    }

    public ByteBuffer generateVerityTree(DataSource fileSource) throws IOException {
        DataSource dataSourceAsDataSource;
        int digestLength = this.mMd.getDigestLength();
        int[] iArrCalculateLevelOffset = calculateLevelOffset(fileSource.size(), digestLength);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iArrCalculateLevelOffset[iArrCalculateLevelOffset.length - 1]);
        for (int length = iArrCalculateLevelOffset.length - 2; length >= 0; length--) {
            int i = length + 1;
            ByteBufferSink byteBufferSink = new ByteBufferSink(slice(byteBufferAllocate, iArrCalculateLevelOffset[length], iArrCalculateLevelOffset[i]));
            if (length == iArrCalculateLevelOffset.length - 2) {
                digestDataByChunks(fileSource, byteBufferSink);
                dataSourceAsDataSource = fileSource;
            } else {
                dataSourceAsDataSource = DataSources.asDataSource(slice(byteBufferAllocate.asReadOnlyBuffer(), iArrCalculateLevelOffset[i], iArrCalculateLevelOffset[length + 2]));
                digestDataByChunks(dataSourceAsDataSource, byteBufferSink);
            }
            int iDivideRoundup = (int) ((divideRoundup(dataSourceAsDataSource.size(), PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) * ((long) digestLength)) % PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            if (iDivideRoundup > 0) {
                int i2 = 4096 - iDivideRoundup;
                byteBufferSink.consume(new byte[i2], 0, i2);
            }
        }
        return byteBufferAllocate;
    }

    public byte[] getRootHashFromTree(ByteBuffer verityBuffer) throws IOException {
        return saltedDigest(slice(verityBuffer.asReadOnlyBuffer(), 0, 4096));
    }

    private static int[] calculateLevelOffset(long dataSize, int digestSize) {
        ArrayList arrayList = new ArrayList();
        do {
            dataSize = divideRoundup(dataSize, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) * ((long) digestSize);
            arrayList.add(Long.valueOf(divideRoundup(dataSize, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) * PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM));
        } while (dataSize > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        int[] iArr = new int[arrayList.size() + 1];
        int i = 0;
        iArr[0] = 0;
        while (i < arrayList.size()) {
            int i2 = i + 1;
            iArr[i2] = iArr[i] + Math.toIntExact(((Long) arrayList.get((arrayList.size() - i) - 1)).longValue());
            i = i2;
        }
        return iArr;
    }

    private void digestDataByChunks(DataSource dataSource, DataSink dataSink) throws IOException {
        long size = dataSource.size();
        long j = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        int iDivideRoundup = (int) divideRoundup(size, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        final byte[][] bArr = new byte[iDivideRoundup][];
        final Phaser phaser = new Phaser(1);
        long j2 = 0;
        final int i = 0;
        while (j2 < size) {
            int iMin = (int) (Math.min(MediaSessionConnector.ACTION_SET_PLAYBACK_SPEED + j2, size) - j2);
            long j3 = iMin;
            int iDivideRoundup2 = (int) divideRoundup(j3, j);
            final ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iDivideRoundup2 * 4096);
            dataSource.copyTo(j2, iMin, byteBufferAllocate);
            byteBufferAllocate.rewind();
            Runnable runnable = new Runnable() { // from class: com.android.apksig.internal.util.VerityTreeBuilder$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m9368x53c710b9(byteBufferAllocate, i, bArr, phaser);
                }
            };
            phaser.register();
            this.mExecutor.execute(runnable);
            i += iDivideRoundup2;
            j2 += j3;
            j = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        }
        phaser.arriveAndAwaitAdvance();
        for (int i2 = 0; i2 < iDivideRoundup; i2++) {
            byte[] bArr2 = bArr[i2];
            dataSink.consume(bArr2, 0, bArr2.length);
        }
    }

    /* JADX INFO: renamed from: lambda$digestDataByChunks$0$com-android-apksig-internal-util-VerityTreeBuilder, reason: not valid java name */
    /* synthetic */ void m9368x53c710b9(ByteBuffer byteBuffer, int i, byte[][] bArr, Phaser phaser) {
        MessageDigest messageDigestCloneMessageDigest = cloneMessageDigest();
        int iCapacity = byteBuffer.capacity();
        int i2 = 0;
        while (i2 < iCapacity) {
            int i3 = i2 + 4096;
            bArr[i] = saltedDigest(messageDigestCloneMessageDigest, slice(byteBuffer, i2, i3));
            i++;
            i2 = i3;
        }
        phaser.arriveAndDeregister();
    }

    private byte[] saltedDigest(ByteBuffer data) {
        return saltedDigest(this.mMd, data);
    }

    private byte[] saltedDigest(MessageDigest md, ByteBuffer data) {
        md.reset();
        byte[] bArr = this.mSalt;
        if (bArr != null) {
            md.update(bArr);
        }
        md.update(data);
        return md.digest();
    }

    private static long divideRoundup(long dividend, long divisor) {
        return ((dividend + divisor) - 1) / divisor;
    }

    private static ByteBuffer slice(ByteBuffer buffer, int begin, int end) {
        ByteBuffer byteBufferDuplicate = buffer.duplicate();
        byteBufferDuplicate.position(0);
        byteBufferDuplicate.limit(end);
        byteBufferDuplicate.position(begin);
        return byteBufferDuplicate.slice();
    }

    private static MessageDigest getNewMessageDigest() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(JCA_ALGORITHM);
    }

    private MessageDigest cloneMessageDigest() {
        try {
            try {
                return (MessageDigest) this.mMd.clone();
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException("Failed to obtain an instance of a previously available message digest", e);
            }
        } catch (CloneNotSupportedException unused) {
            return getNewMessageDigest();
        }
    }
}
