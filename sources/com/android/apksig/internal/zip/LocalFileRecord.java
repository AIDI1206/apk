package com.android.apksig.internal.zip;

import androidx.collection.SieveCacheKt;
import com.android.apksig.internal.util.ByteBufferSink;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.ZipFormatException;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public class LocalFileRecord {
    private static final int COMPRESSED_SIZE_OFFSET = 18;
    private static final int CRC32_OFFSET = 14;
    private static final int DATA_DESCRIPTOR_SIGNATURE = 134695760;
    private static final int DATA_DESCRIPTOR_SIZE_BYTES_WITHOUT_SIGNATURE = 12;
    private static final ByteBuffer EMPTY_BYTE_BUFFER = ByteBuffer.allocate(0);
    private static final int EXTRA_LENGTH_OFFSET = 28;
    private static final int GP_FLAGS_OFFSET = 6;
    private static final int HEADER_SIZE_BYTES = 30;
    private static final int NAME_LENGTH_OFFSET = 26;
    private static final int NAME_OFFSET = 30;
    private static final int RECORD_SIGNATURE = 67324752;
    private static final int UNCOMPRESSED_SIZE_OFFSET = 22;
    private final boolean mDataCompressed;
    private final long mDataSize;
    private final int mDataStartOffset;
    private final ByteBuffer mExtra;
    private final String mName;
    private final int mNameSizeBytes;
    private final long mSize;
    private final long mStartOffsetInArchive;
    private final long mUncompressedDataSize;

    private LocalFileRecord(String name, int nameSizeBytes, ByteBuffer extra, long startOffsetInArchive, long size, int dataStartOffset, long dataSize, boolean dataCompressed, long uncompressedDataSize) {
        this.mName = name;
        this.mNameSizeBytes = nameSizeBytes;
        this.mExtra = extra;
        this.mStartOffsetInArchive = startOffsetInArchive;
        this.mSize = size;
        this.mDataStartOffset = dataStartOffset;
        this.mDataSize = dataSize;
        this.mDataCompressed = dataCompressed;
        this.mUncompressedDataSize = uncompressedDataSize;
    }

    public String getName() {
        return this.mName;
    }

    public ByteBuffer getExtra() {
        return this.mExtra.capacity() > 0 ? this.mExtra.slice() : this.mExtra;
    }

    public int getExtraFieldStartOffsetInsideRecord() {
        return this.mNameSizeBytes + 30;
    }

    public long getStartOffsetInArchive() {
        return this.mStartOffsetInArchive;
    }

    public int getDataStartOffsetInRecord() {
        return this.mDataStartOffset;
    }

    public long getSize() {
        return this.mSize;
    }

    public boolean isDataCompressed() {
        return this.mDataCompressed;
    }

    public static LocalFileRecord getRecord(DataSource apk, CentralDirectoryRecord cdRecord, long cdStartOffset) throws IOException, ZipFormatException {
        return getRecord(apk, cdRecord, cdStartOffset, true, true);
    }

    private static LocalFileRecord getRecord(DataSource apk, CentralDirectoryRecord cdRecord, long cdStartOffset, boolean extraFieldContentsNeeded, boolean dataDescriptorIncluded) throws IOException, ZipFormatException {
        String name = cdRecord.getName();
        int nameSizeBytes = cdRecord.getNameSizeBytes();
        int i = nameSizeBytes + 30;
        long localFileHeaderOffset = cdRecord.getLocalFileHeaderOffset();
        long j = ((long) i) + localFileHeaderOffset;
        if (j > cdStartOffset) {
            throw new ZipFormatException("Local File Header of " + name + " extends beyond start of Central Directory. LFH end: " + j + ", CD start: " + cdStartOffset);
        }
        try {
            ByteBuffer byteBuffer = apk.getByteBuffer(localFileHeaderOffset, i);
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            int i2 = byteBuffer.getInt();
            if (i2 != RECORD_SIGNATURE) {
                throw new ZipFormatException("Not a Local File Header record for entry " + name + ". Signature: 0x" + Long.toHexString(((long) i2) & 4294967295L));
            }
            int i3 = byteBuffer.getShort(6) & 8;
            boolean z = i3 != 0;
            boolean z2 = (cdRecord.getGpFlags() & 8) != 0;
            if (z != z2) {
                throw new ZipFormatException("Data Descriptor presence mismatch between Local File Header and Central Directory for entry " + name + ". LFH: " + z + ", CD: " + z2);
            }
            long crc32 = cdRecord.getCrc32();
            long compressedSize = cdRecord.getCompressedSize();
            boolean z3 = z;
            long uncompressedSize = cdRecord.getUncompressedSize();
            if (!z3) {
                long unsignedInt32 = ZipUtils.getUnsignedInt32(byteBuffer, 14);
                if (unsignedInt32 != crc32) {
                    throw new ZipFormatException("CRC-32 mismatch between Local File Header and Central Directory for entry " + name + ". LFH: " + unsignedInt32 + ", CD: " + crc32);
                }
                long unsignedInt33 = ZipUtils.getUnsignedInt32(byteBuffer, 18);
                if (unsignedInt33 != compressedSize) {
                    throw new ZipFormatException("Compressed size mismatch between Local File Header and Central Directory for entry " + name + ". LFH: " + unsignedInt33 + ", CD: " + compressedSize);
                }
                long unsignedInt34 = ZipUtils.getUnsignedInt32(byteBuffer, 22);
                if (unsignedInt34 != uncompressedSize) {
                    throw new ZipFormatException("Uncompressed size mismatch between Local File Header and Central Directory for entry " + name + ". LFH: " + unsignedInt34 + ", CD: " + uncompressedSize);
                }
            }
            int unsignedInt16 = ZipUtils.getUnsignedInt16(byteBuffer, 26);
            if (unsignedInt16 > nameSizeBytes) {
                throw new ZipFormatException("Name mismatch between Local File Header and Central Directory for entry" + name + ". LFH: " + unsignedInt16 + " bytes, CD: " + nameSizeBytes + " bytes");
            }
            String name2 = CentralDirectoryRecord.getName(byteBuffer, 30, unsignedInt16);
            if (!name.equals(name2)) {
                throw new ZipFormatException("Name mismatch between Local File Header and Central Directory. LFH: \"" + name2 + "\", CD: \"" + name + "\"");
            }
            int unsignedInt17 = ZipUtils.getUnsignedInt16(byteBuffer, 28);
            long j2 = localFileHeaderOffset + 30 + ((long) unsignedInt16);
            long j3 = ((long) unsignedInt17) + j2;
            boolean z4 = cdRecord.getCompressionMethod() != 0;
            if (!z4) {
                compressedSize = uncompressedSize;
            }
            long j4 = j3 + compressedSize;
            if (j4 > cdStartOffset) {
                throw new ZipFormatException("Local File Header data of " + name + " overlaps with Central Directory. LFH data start: " + j3 + ", LFH data end: " + j4 + ", CD start: " + cdStartOffset);
            }
            ByteBuffer byteBuffer2 = EMPTY_BYTE_BUFFER;
            if (extraFieldContentsNeeded && unsignedInt17 > 0) {
                byteBuffer2 = apk.getByteBuffer(j2, unsignedInt17);
            }
            if (dataDescriptorIncluded && i3 != 0) {
                long j5 = 12 + j4;
                if (j5 > cdStartOffset) {
                    throw new ZipFormatException("Data Descriptor of " + name + " overlaps with Central Directory. Data Descriptor end: " + j4 + ", CD start: " + cdStartOffset);
                }
                ByteBuffer byteBuffer3 = apk.getByteBuffer(j4, 4);
                byteBuffer3.order(ByteOrder.LITTLE_ENDIAN);
                if (byteBuffer3.getInt() == DATA_DESCRIPTOR_SIGNATURE) {
                    j5 = 16 + j4;
                    if (j5 > cdStartOffset) {
                        throw new ZipFormatException("Data Descriptor of " + name + " overlaps with Central Directory. Data Descriptor end: " + j4 + ", CD start: " + cdStartOffset);
                    }
                }
                j4 = j5;
            }
            return new LocalFileRecord(name, nameSizeBytes, byteBuffer2, localFileHeaderOffset, j4 - localFileHeaderOffset, unsignedInt16 + 30 + unsignedInt17, compressedSize, z4, uncompressedSize);
        } catch (IOException e) {
            throw new IOException("Failed to read Local File Header of " + name, e);
        }
    }

    public long outputRecord(DataSource sourceApk, DataSink output) throws IOException {
        long size = getSize();
        sourceApk.feed(getStartOffsetInArchive(), size, output);
        return size;
    }

    public long outputRecordWithModifiedExtra(DataSource sourceApk, ByteBuffer extra, DataSink output) throws IOException {
        long startOffsetInArchive = getStartOffsetInArchive();
        int extraFieldStartOffsetInsideRecord = getExtraFieldStartOffsetInsideRecord();
        int iRemaining = extra.remaining();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(extraFieldStartOffsetInsideRecord + iRemaining);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        sourceApk.copyTo(startOffsetInArchive, extraFieldStartOffsetInsideRecord, byteBufferAllocate);
        byteBufferAllocate.put(extra.slice());
        byteBufferAllocate.flip();
        ZipUtils.setUnsignedInt16(byteBufferAllocate, 28, iRemaining);
        long jRemaining = byteBufferAllocate.remaining();
        output.consume(byteBufferAllocate);
        long size = getSize();
        int i = this.mDataStartOffset;
        long j = size - ((long) i);
        sourceApk.feed(startOffsetInArchive + ((long) i), j, output);
        return jRemaining + j;
    }

    public static long outputRecordWithDeflateCompressedData(String name, int lastModifiedTime, int lastModifiedDate, byte[] compressedData, long crc32, long uncompressedSize, DataSink output) throws IOException {
        byte[] bytes = name.getBytes(StandardCharsets.UTF_8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 30);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(RECORD_SIGNATURE);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, 20);
        byteBufferAllocate.putShort(ZipUtils.GP_FLAG_EFS);
        byteBufferAllocate.putShort((short) 8);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, lastModifiedTime);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, lastModifiedDate);
        ZipUtils.putUnsignedInt32(byteBufferAllocate, crc32);
        ZipUtils.putUnsignedInt32(byteBufferAllocate, compressedData.length);
        ZipUtils.putUnsignedInt32(byteBufferAllocate, uncompressedSize);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, bytes.length);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, 0);
        byteBufferAllocate.put(bytes);
        if (byteBufferAllocate.hasRemaining()) {
            throw new RuntimeException("pos: " + byteBufferAllocate.position() + ", limit: " + byteBufferAllocate.limit());
        }
        byteBufferAllocate.flip();
        long jRemaining = byteBufferAllocate.remaining();
        output.consume(byteBufferAllocate);
        long length = jRemaining + ((long) compressedData.length);
        output.consume(compressedData, 0, compressedData.length);
        return length;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0070 A[Catch: IOException -> 0x0094, TryCatch #2 {IOException -> 0x0094, blocks: (B:3:0x000b, B:28:0x008c, B:23:0x0068, B:25:0x0070, B:26:0x008a, B:27:0x008b, B:5:0x000f, B:9:0x0025, B:20:0x0065, B:19:0x0062, B:15:0x005c, B:6:0x0015, B:11:0x0029, B:12:0x0059), top: B:40:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x008b A[Catch: IOException -> 0x0094, TryCatch #2 {IOException -> 0x0094, blocks: (B:3:0x000b, B:28:0x008c, B:23:0x0068, B:25:0x0070, B:26:0x008a, B:27:0x008b, B:5:0x000f, B:9:0x0025, B:20:0x0065, B:19:0x0062, B:15:0x005c, B:6:0x0015, B:11:0x0029, B:12:0x0059), top: B:40:0x000b, inners: #1 }] */
    public void outputUncompressedData(DataSource lfhSection, DataSink sink) throws IOException, ZipFormatException {
        long j = this.mStartOffsetInArchive + ((long) this.mDataStartOffset);
        try {
            if (this.mDataCompressed) {
                try {
                    InflateSinkAdapter inflateSinkAdapter = new InflateSinkAdapter(sink);
                    try {
                        lfhSection.feed(j, this.mDataSize, inflateSinkAdapter);
                        long outputByteCount = inflateSinkAdapter.getOutputByteCount();
                        if (outputByteCount != this.mUncompressedDataSize) {
                            throw new ZipFormatException("Unexpected size of uncompressed data of " + this.mName + ". Expected: " + this.mUncompressedDataSize + " bytes, actual: " + outputByteCount + " bytes");
                        }
                        inflateSinkAdapter.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            inflateSinkAdapter.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    if (e.getCause() instanceof DataFormatException) {
                        throw new ZipFormatException("Data of entry " + this.mName + " malformed", e);
                    }
                    throw e;
                }
                if (e.getCause() instanceof DataFormatException) {
                    throw new ZipFormatException("Data of entry " + this.mName + " malformed", e);
                }
                throw e;
            }
            lfhSection.feed(j, this.mDataSize, sink);
        } catch (IOException e2) {
            throw new IOException("Failed to read data of " + (this.mDataCompressed ? "compressed" : "uncompressed") + " entry " + this.mName, e2);
        }
    }

    public static void outputUncompressedData(DataSource source, CentralDirectoryRecord cdRecord, long cdStartOffsetInArchive, DataSink sink) throws IOException, ZipFormatException {
        getRecord(source, cdRecord, cdStartOffsetInArchive, false, false).outputUncompressedData(source, sink);
    }

    public static byte[] getUncompressedData(DataSource source, CentralDirectoryRecord cdRecord, long cdStartOffsetInArchive) throws IOException, ZipFormatException {
        if (cdRecord.getUncompressedSize() > SieveCacheKt.NodeLinkMask) {
            throw new IOException(cdRecord.getName() + " too large: " + cdRecord.getUncompressedSize());
        }
        try {
            byte[] bArr = new byte[(int) cdRecord.getUncompressedSize()];
            outputUncompressedData(source, cdRecord, cdStartOffsetInArchive, new ByteBufferSink(ByteBuffer.wrap(bArr)));
            return bArr;
        } catch (OutOfMemoryError e) {
            throw new IOException(cdRecord.getName() + " too large: " + cdRecord.getUncompressedSize(), e);
        }
    }

    private static class InflateSinkAdapter implements DataSink, Closeable {
        private boolean mClosed;
        private final DataSink mDelegate;
        private Inflater mInflater;
        private byte[] mInputBuffer;
        private byte[] mOutputBuffer;
        private long mOutputByteCount;

        private InflateSinkAdapter(DataSink delegate) {
            this.mInflater = new Inflater(true);
            this.mDelegate = delegate;
        }

        @Override // com.android.apksig.util.DataSink
        public void consume(byte[] buf, int offset, int length) throws IOException {
            checkNotClosed();
            this.mInflater.setInput(buf, offset, length);
            if (this.mOutputBuffer == null) {
                this.mOutputBuffer = new byte[65536];
            }
            while (!this.mInflater.finished()) {
                try {
                    int iInflate = this.mInflater.inflate(this.mOutputBuffer);
                    if (iInflate == 0) {
                        return;
                    }
                    this.mDelegate.consume(this.mOutputBuffer, 0, iInflate);
                    this.mOutputByteCount += (long) iInflate;
                } catch (DataFormatException e) {
                    throw new IOException("Failed to inflate data", e);
                }
            }
        }

        @Override // com.android.apksig.util.DataSink
        public void consume(ByteBuffer buf) throws IOException {
            checkNotClosed();
            if (buf.hasArray()) {
                consume(buf.array(), buf.arrayOffset() + buf.position(), buf.remaining());
                buf.position(buf.limit());
                return;
            }
            if (this.mInputBuffer == null) {
                this.mInputBuffer = new byte[65536];
            }
            while (buf.hasRemaining()) {
                int iMin = Math.min(buf.remaining(), this.mInputBuffer.length);
                buf.get(this.mInputBuffer, 0, iMin);
                consume(this.mInputBuffer, 0, iMin);
            }
        }

        public long getOutputByteCount() {
            return this.mOutputByteCount;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.mClosed = true;
            this.mInputBuffer = null;
            this.mOutputBuffer = null;
            Inflater inflater = this.mInflater;
            if (inflater != null) {
                inflater.end();
                this.mInflater = null;
            }
        }

        private void checkNotClosed() {
            if (this.mClosed) {
                throw new IllegalStateException("Closed");
            }
        }
    }
}
