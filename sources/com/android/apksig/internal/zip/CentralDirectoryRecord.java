package com.android.apksig.internal.zip;

import com.android.apksig.zip.ZipFormatException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public class CentralDirectoryRecord {
    public static final Comparator<CentralDirectoryRecord> BY_LOCAL_FILE_HEADER_OFFSET_COMPARATOR = new ByLocalFileHeaderOffsetComparator();
    private static final int GP_FLAGS_OFFSET = 8;
    private static final int HEADER_SIZE_BYTES = 46;
    private static final int LOCAL_FILE_HEADER_OFFSET_OFFSET = 42;
    private static final int NAME_OFFSET = 46;
    private static final int RECORD_SIGNATURE = 33639248;
    private final long mCompressedSize;
    private final short mCompressionMethod;
    private final long mCrc32;
    private final ByteBuffer mData;
    private final short mGpFlags;
    private final int mLastModificationDate;
    private final int mLastModificationTime;
    private final long mLocalFileHeaderOffset;
    private final String mName;
    private final int mNameSizeBytes;
    private final long mUncompressedSize;

    private CentralDirectoryRecord(ByteBuffer data, short gpFlags, short compressionMethod, int lastModificationTime, int lastModificationDate, long crc32, long compressedSize, long uncompressedSize, long localFileHeaderOffset, String name, int nameSizeBytes) {
        this.mData = data;
        this.mGpFlags = gpFlags;
        this.mCompressionMethod = compressionMethod;
        this.mLastModificationDate = lastModificationDate;
        this.mLastModificationTime = lastModificationTime;
        this.mCrc32 = crc32;
        this.mCompressedSize = compressedSize;
        this.mUncompressedSize = uncompressedSize;
        this.mLocalFileHeaderOffset = localFileHeaderOffset;
        this.mName = name;
        this.mNameSizeBytes = nameSizeBytes;
    }

    public int getSize() {
        return this.mData.remaining();
    }

    public String getName() {
        return this.mName;
    }

    public int getNameSizeBytes() {
        return this.mNameSizeBytes;
    }

    public short getGpFlags() {
        return this.mGpFlags;
    }

    public short getCompressionMethod() {
        return this.mCompressionMethod;
    }

    public int getLastModificationTime() {
        return this.mLastModificationTime;
    }

    public int getLastModificationDate() {
        return this.mLastModificationDate;
    }

    public long getCrc32() {
        return this.mCrc32;
    }

    public long getCompressedSize() {
        return this.mCompressedSize;
    }

    public long getUncompressedSize() {
        return this.mUncompressedSize;
    }

    public long getLocalFileHeaderOffset() {
        return this.mLocalFileHeaderOffset;
    }

    public static CentralDirectoryRecord getRecord(ByteBuffer buf) throws ZipFormatException {
        ZipUtils.assertByteOrderLittleEndian(buf);
        if (buf.remaining() < 46) {
            throw new ZipFormatException("Input too short. Need at least: 46 bytes, available: " + buf.remaining() + " bytes", new BufferUnderflowException());
        }
        int iPosition = buf.position();
        int i = buf.getInt();
        if (i != RECORD_SIGNATURE) {
            throw new ZipFormatException("Not a Central Directory record. Signature: 0x" + Long.toHexString(((long) i) & 4294967295L));
        }
        buf.position(iPosition + 8);
        short s = buf.getShort();
        short s2 = buf.getShort();
        int unsignedInt16 = ZipUtils.getUnsignedInt16(buf);
        int unsignedInt17 = ZipUtils.getUnsignedInt16(buf);
        long unsignedInt32 = ZipUtils.getUnsignedInt32(buf);
        long unsignedInt33 = ZipUtils.getUnsignedInt32(buf);
        long unsignedInt34 = ZipUtils.getUnsignedInt32(buf);
        int unsignedInt18 = ZipUtils.getUnsignedInt16(buf);
        int unsignedInt19 = ZipUtils.getUnsignedInt16(buf);
        int unsignedInt110 = ZipUtils.getUnsignedInt16(buf);
        buf.position(iPosition + 42);
        long unsignedInt35 = ZipUtils.getUnsignedInt32(buf);
        buf.position(iPosition);
        int i2 = unsignedInt18 + 46 + unsignedInt19 + unsignedInt110;
        if (i2 > buf.remaining()) {
            throw new ZipFormatException("Input too short. Need: " + i2 + " bytes, available: " + buf.remaining() + " bytes", new BufferUnderflowException());
        }
        String name = getName(buf, iPosition + 46, unsignedInt18);
        buf.position(iPosition);
        int iLimit = buf.limit();
        int i3 = iPosition + i2;
        try {
            buf.limit(i3);
            ByteBuffer byteBufferSlice = buf.slice();
            buf.limit(iLimit);
            buf.position(i3);
            return new CentralDirectoryRecord(byteBufferSlice, s, s2, unsignedInt16, unsignedInt17, unsignedInt32, unsignedInt33, unsignedInt34, unsignedInt35, name, unsignedInt18);
        } catch (Throwable th) {
            buf.limit(iLimit);
            throw th;
        }
    }

    public void copyTo(ByteBuffer output) {
        output.put(this.mData.slice());
    }

    public CentralDirectoryRecord createWithModifiedLocalFileHeaderOffset(long localFileHeaderOffset) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.mData.remaining());
        byteBufferAllocate.put(this.mData.slice());
        byteBufferAllocate.flip();
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        ZipUtils.setUnsignedInt32(byteBufferAllocate, 42, localFileHeaderOffset);
        return new CentralDirectoryRecord(byteBufferAllocate, this.mGpFlags, this.mCompressionMethod, this.mLastModificationTime, this.mLastModificationDate, this.mCrc32, this.mCompressedSize, this.mUncompressedSize, localFileHeaderOffset, this.mName, this.mNameSizeBytes);
    }

    public static CentralDirectoryRecord createWithDeflateCompressedData(String name, int lastModifiedTime, int lastModifiedDate, long crc32, long compressedSize, long uncompressedSize, long localFileHeaderOffset) {
        byte[] bytes = name.getBytes(StandardCharsets.UTF_8);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bytes.length + 46);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(RECORD_SIGNATURE);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, 20);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, 20);
        byteBufferAllocate.putShort(ZipUtils.GP_FLAG_EFS);
        byteBufferAllocate.putShort((short) 8);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, lastModifiedTime);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, lastModifiedDate);
        ZipUtils.putUnsignedInt32(byteBufferAllocate, crc32);
        ZipUtils.putUnsignedInt32(byteBufferAllocate, compressedSize);
        ZipUtils.putUnsignedInt32(byteBufferAllocate, uncompressedSize);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, bytes.length);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, 0);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, 0);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, 0);
        ZipUtils.putUnsignedInt16(byteBufferAllocate, 0);
        ZipUtils.putUnsignedInt32(byteBufferAllocate, 0L);
        ZipUtils.putUnsignedInt32(byteBufferAllocate, localFileHeaderOffset);
        byteBufferAllocate.put(bytes);
        if (byteBufferAllocate.hasRemaining()) {
            throw new RuntimeException("pos: " + byteBufferAllocate.position() + ", limit: " + byteBufferAllocate.limit());
        }
        byteBufferAllocate.flip();
        return new CentralDirectoryRecord(byteBufferAllocate, ZipUtils.GP_FLAG_EFS, (short) 8, lastModifiedTime, lastModifiedDate, crc32, compressedSize, uncompressedSize, localFileHeaderOffset, name, bytes.length);
    }

    static String getName(ByteBuffer record, int position, int nameLengthBytes) {
        byte[] bArrArray;
        int iArrayOffset;
        if (record.hasArray()) {
            bArrArray = record.array();
            iArrayOffset = record.arrayOffset() + position;
        } else {
            bArrArray = new byte[nameLengthBytes];
            int iPosition = record.position();
            try {
                record.position(position);
                record.get(bArrArray);
                record.position(iPosition);
                iArrayOffset = 0;
            } catch (Throwable th) {
                record.position(iPosition);
                throw th;
            }
        }
        return new String(bArrArray, iArrayOffset, nameLengthBytes, StandardCharsets.UTF_8);
    }

    private static class ByLocalFileHeaderOffsetComparator implements Comparator<CentralDirectoryRecord> {
        private ByLocalFileHeaderOffsetComparator() {
        }

        @Override // java.util.Comparator
        public int compare(CentralDirectoryRecord r1, CentralDirectoryRecord r2) {
            long localFileHeaderOffset = r1.getLocalFileHeaderOffset();
            long localFileHeaderOffset2 = r2.getLocalFileHeaderOffset();
            if (localFileHeaderOffset > localFileHeaderOffset2) {
                return 1;
            }
            return localFileHeaderOffset < localFileHeaderOffset2 ? -1 : 0;
        }
    }
}
