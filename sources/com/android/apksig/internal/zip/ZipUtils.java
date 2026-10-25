package com.android.apksig.internal.zip;

import androidx.collection.SieveCacheKt;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.android.apksig.apk.ApkFormatException;
import com.android.apksig.internal.util.Pair;
import com.android.apksig.util.DataSource;
import com.android.apksig.zip.ZipFormatException;
import com.android.apksig.zip.ZipSections;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.UShort;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZipUtils {
    public static final short COMPRESSION_METHOD_DEFLATED = 8;
    public static final short COMPRESSION_METHOD_STORED = 0;
    public static final short GP_FLAG_DATA_DESCRIPTOR_USED = 8;
    public static final short GP_FLAG_EFS = 2048;
    private static final int UINT16_MAX_VALUE = 65535;
    private static final int ZIP_EOCD_CENTRAL_DIR_OFFSET_FIELD_OFFSET = 16;
    private static final int ZIP_EOCD_CENTRAL_DIR_SIZE_FIELD_OFFSET = 12;
    private static final int ZIP_EOCD_CENTRAL_DIR_TOTAL_RECORD_COUNT_OFFSET = 10;
    private static final int ZIP_EOCD_COMMENT_LENGTH_FIELD_OFFSET = 20;
    private static final int ZIP_EOCD_REC_MIN_SIZE = 22;
    private static final int ZIP_EOCD_REC_SIG = 101010256;

    private ZipUtils() {
    }

    public static void setZipEocdCentralDirectoryOffset(ByteBuffer zipEndOfCentralDirectory, long offset) {
        assertByteOrderLittleEndian(zipEndOfCentralDirectory);
        setUnsignedInt32(zipEndOfCentralDirectory, zipEndOfCentralDirectory.position() + 16, offset);
    }

    public static void updateZipEocdCommentLen(ByteBuffer zipEndOfCentralDirectory) {
        assertByteOrderLittleEndian(zipEndOfCentralDirectory);
        setUnsignedInt16(zipEndOfCentralDirectory, zipEndOfCentralDirectory.position() + 20, zipEndOfCentralDirectory.remaining() - 22);
    }

    public static long getZipEocdCentralDirectoryOffset(ByteBuffer zipEndOfCentralDirectory) {
        assertByteOrderLittleEndian(zipEndOfCentralDirectory);
        return getUnsignedInt32(zipEndOfCentralDirectory, zipEndOfCentralDirectory.position() + 16);
    }

    public static long getZipEocdCentralDirectorySizeBytes(ByteBuffer zipEndOfCentralDirectory) {
        assertByteOrderLittleEndian(zipEndOfCentralDirectory);
        return getUnsignedInt32(zipEndOfCentralDirectory, zipEndOfCentralDirectory.position() + 12);
    }

    public static int getZipEocdCentralDirectoryTotalRecordCount(ByteBuffer zipEndOfCentralDirectory) {
        assertByteOrderLittleEndian(zipEndOfCentralDirectory);
        return getUnsignedInt16(zipEndOfCentralDirectory, zipEndOfCentralDirectory.position() + 10);
    }

    public static Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord(DataSource zip) throws IOException {
        if (zip.size() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> pairFindZipEndOfCentralDirectoryRecord = findZipEndOfCentralDirectoryRecord(zip, 0);
        return pairFindZipEndOfCentralDirectoryRecord != null ? pairFindZipEndOfCentralDirectoryRecord : findZipEndOfCentralDirectoryRecord(zip, 65535);
    }

    private static Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord(DataSource zip, int maxCommentSize) throws IOException {
        if (maxCommentSize < 0 || maxCommentSize > 65535) {
            throw new IllegalArgumentException("maxCommentSize: " + maxCommentSize);
        }
        long size = zip.size();
        if (size < 22) {
            return null;
        }
        int iMin = ((int) Math.min(maxCommentSize, size - 22)) + 22;
        long j = size - ((long) iMin);
        ByteBuffer byteBuffer = zip.getByteBuffer(j, iMin);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int iFindZipEndOfCentralDirectoryRecord = findZipEndOfCentralDirectoryRecord(byteBuffer);
        if (iFindZipEndOfCentralDirectoryRecord == -1) {
            return null;
        }
        byteBuffer.position(iFindZipEndOfCentralDirectoryRecord);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.of(byteBufferSlice, Long.valueOf(j + ((long) iFindZipEndOfCentralDirectoryRecord)));
    }

    private static int findZipEndOfCentralDirectoryRecord(ByteBuffer zipContents) {
        assertByteOrderLittleEndian(zipContents);
        int iCapacity = zipContents.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i = iCapacity - 22;
        int iMin = Math.min(i, 65535);
        for (int i2 = 0; i2 <= iMin; i2++) {
            int i3 = i - i2;
            if (zipContents.getInt(i3) == ZIP_EOCD_REC_SIG && getUnsignedInt16(zipContents, i3 + 20) == i2) {
                return i3;
            }
        }
        return -1;
    }

    static void assertByteOrderLittleEndian(ByteBuffer buffer) {
        if (buffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int getUnsignedInt16(ByteBuffer buffer, int offset) {
        return buffer.getShort(offset) & UShort.MAX_VALUE;
    }

    public static int getUnsignedInt16(ByteBuffer buffer) {
        return buffer.getShort() & UShort.MAX_VALUE;
    }

    public static List<CentralDirectoryRecord> parseZipCentralDirectory(DataSource apk, ZipSections apkSections) throws IOException, ApkFormatException {
        long zipCentralDirectorySizeBytes = apkSections.getZipCentralDirectorySizeBytes();
        if (zipCentralDirectorySizeBytes > SieveCacheKt.NodeLinkMask) {
            throw new ApkFormatException("ZIP Central Directory too large: " + zipCentralDirectorySizeBytes);
        }
        long zipCentralDirectoryOffset = apkSections.getZipCentralDirectoryOffset();
        ByteBuffer byteBuffer = apk.getByteBuffer(zipCentralDirectoryOffset, (int) zipCentralDirectorySizeBytes);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int zipCentralDirectoryRecordCount = apkSections.getZipCentralDirectoryRecordCount();
        ArrayList arrayList = new ArrayList(zipCentralDirectoryRecordCount);
        for (int i = 0; i < zipCentralDirectoryRecordCount; i++) {
            int iPosition = byteBuffer.position();
            try {
                CentralDirectoryRecord record = CentralDirectoryRecord.getRecord(byteBuffer);
                if (!record.getName().endsWith(DomExceptionUtils.SEPARATOR)) {
                    arrayList.add(record);
                }
            } catch (ZipFormatException e) {
                throw new ApkFormatException("Malformed ZIP Central Directory record #" + (i + 1) + " at file offset " + (zipCentralDirectoryOffset + ((long) iPosition)), e);
            }
        }
        return arrayList;
    }

    static void setUnsignedInt16(ByteBuffer buffer, int offset, int value) {
        if (value < 0 || value > 65535) {
            throw new IllegalArgumentException("uint16 value of out range: " + value);
        }
        buffer.putShort(offset, (short) value);
    }

    static void setUnsignedInt32(ByteBuffer buffer, int offset, long value) {
        if (value < 0 || value > 4294967295L) {
            throw new IllegalArgumentException("uint32 value of out range: " + value);
        }
        buffer.putInt(offset, (int) value);
    }

    public static void putUnsignedInt16(ByteBuffer buffer, int value) {
        if (value < 0 || value > 65535) {
            throw new IllegalArgumentException("uint16 value of out range: " + value);
        }
        buffer.putShort((short) value);
    }

    static long getUnsignedInt32(ByteBuffer buffer, int offset) {
        return ((long) buffer.getInt(offset)) & 4294967295L;
    }

    static long getUnsignedInt32(ByteBuffer buffer) {
        return ((long) buffer.getInt()) & 4294967295L;
    }

    static void putUnsignedInt32(ByteBuffer buffer, long value) {
        if (value < 0 || value > 4294967295L) {
            throw new IllegalArgumentException("uint32 value of out range: " + value);
        }
        buffer.putInt((int) value);
    }

    public static DeflateResult deflate(ByteBuffer input) {
        byte[] bArrArray;
        int iArrayOffset;
        int iRemaining = input.remaining();
        if (input.hasArray()) {
            bArrArray = input.array();
            iArrayOffset = input.arrayOffset() + input.position();
            input.position(input.limit());
        } else {
            bArrArray = new byte[iRemaining];
            input.get(bArrArray);
            iArrayOffset = 0;
        }
        CRC32 crc32 = new CRC32();
        crc32.update(bArrArray, iArrayOffset, iRemaining);
        long value = crc32.getValue();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater(9, true);
        deflater.setInput(bArrArray, iArrayOffset, iRemaining);
        deflater.finish();
        byte[] bArr = new byte[65536];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr, 0, deflater.deflate(bArr));
        }
        return new DeflateResult(iRemaining, value, byteArrayOutputStream.toByteArray());
    }

    public static class DeflateResult {
        public final long inputCrc32;
        public final int inputSizeBytes;
        public final byte[] output;

        public DeflateResult(int inputSizeBytes, long inputCrc32, byte[] output) {
            this.inputSizeBytes = inputSizeBytes;
            this.inputCrc32 = inputCrc32;
            this.output = output;
        }
    }
}
