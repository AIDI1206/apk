package com.android.apksig.internal.zip;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes3.dex */
public class EocdRecord {
    private static final int CD_OFFSET_OFFSET = 16;
    private static final int CD_RECORD_COUNT_ON_DISK_OFFSET = 8;
    private static final int CD_RECORD_COUNT_TOTAL_OFFSET = 10;
    private static final int CD_SIZE_OFFSET = 12;

    public static ByteBuffer createWithModifiedCentralDirectoryInfo(ByteBuffer original, int centralDirectoryRecordCount, long centralDirectorySizeBytes, long centralDirectoryOffset) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(original.remaining());
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(original.slice());
        byteBufferAllocate.flip();
        ZipUtils.setUnsignedInt16(byteBufferAllocate, 8, centralDirectoryRecordCount);
        ZipUtils.setUnsignedInt16(byteBufferAllocate, 10, centralDirectoryRecordCount);
        ZipUtils.setUnsignedInt32(byteBufferAllocate, 12, centralDirectorySizeBytes);
        ZipUtils.setUnsignedInt32(byteBufferAllocate, 16, centralDirectoryOffset);
        return byteBufferAllocate;
    }

    public static ByteBuffer createWithPaddedComment(ByteBuffer original, int padding) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(original.remaining() + padding);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.put(original.slice());
        byteBufferAllocate.rewind();
        ZipUtils.updateZipEocdCommentLen(byteBufferAllocate);
        return byteBufferAllocate;
    }
}
