package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public class FileChannelDataSource implements DataSource {
    private static final int MAX_READ_CHUNK_SIZE = 1048576;
    private final FileChannel mChannel;
    private final long mOffset;
    private final long mSize;

    public FileChannelDataSource(FileChannel channel) {
        this.mChannel = channel;
        this.mOffset = 0L;
        this.mSize = -1L;
    }

    public FileChannelDataSource(FileChannel channel, long offset, long size) {
        if (offset < 0) {
            throw new IndexOutOfBoundsException("offset: " + size);
        }
        if (size < 0) {
            throw new IndexOutOfBoundsException("size: " + size);
        }
        this.mChannel = channel;
        this.mOffset = offset;
        this.mSize = size;
    }

    @Override // com.android.apksig.util.DataSource
    public long size() {
        long j = this.mSize;
        if (j != -1) {
            return j;
        }
        try {
            return this.mChannel.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    @Override // com.android.apksig.util.DataSource
    public FileChannelDataSource slice(long offset, long size) {
        long size2 = size();
        checkChunkValid(offset, size, size2);
        return (offset == 0 && size == size2) ? this : new FileChannelDataSource(this.mChannel, this.mOffset + offset, size);
    }

    @Override // com.android.apksig.util.DataSource
    public void feed(long offset, long size, DataSink sink) throws IOException {
        checkChunkValid(offset, size, size());
        if (size == 0) {
            return;
        }
        long j = this.mOffset + offset;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) Math.min(size, 1048576L));
        long j2 = j;
        long j3 = size;
        while (j3 > 0) {
            int iMin = (int) Math.min(j3, byteBufferAllocateDirect.capacity());
            byteBufferAllocateDirect.limit(iMin);
            synchronized (this.mChannel) {
                this.mChannel.position(j2);
                int i = iMin;
                while (i > 0) {
                    int i2 = this.mChannel.read(byteBufferAllocateDirect);
                    if (i2 < 0) {
                        throw new IOException("Unexpected EOF encountered");
                    }
                    i -= i2;
                }
            }
            byteBufferAllocateDirect.flip();
            sink.consume(byteBufferAllocateDirect);
            byteBufferAllocateDirect.clear();
            long j4 = iMin;
            j2 += j4;
            j3 -= j4;
        }
    }

    @Override // com.android.apksig.util.DataSource
    public void copyTo(long offset, int size, ByteBuffer dest) throws IOException {
        int i;
        checkChunkValid(offset, size, size());
        if (size == 0) {
            return;
        }
        if (size > dest.remaining()) {
            throw new BufferOverflowException();
        }
        long j = this.mOffset + offset;
        int iLimit = dest.limit();
        try {
            dest.limit(dest.position() + size);
            while (size > 0) {
                synchronized (this.mChannel) {
                    this.mChannel.position(j);
                    i = this.mChannel.read(dest);
                }
                j += (long) i;
                size -= i;
            }
            dest.limit(iLimit);
        } catch (Throwable th) {
            dest.limit(iLimit);
            throw th;
        }
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBuffer getByteBuffer(long offset, int size) throws IOException {
        if (size < 0) {
            throw new IndexOutOfBoundsException("size: " + size);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size);
        copyTo(offset, size, byteBufferAllocate);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    private static void checkChunkValid(long offset, long size, long sourceSize) {
        if (offset < 0) {
            throw new IndexOutOfBoundsException("offset: " + offset);
        }
        if (size < 0) {
            throw new IndexOutOfBoundsException("size: " + size);
        }
        if (offset > sourceSize) {
            throw new IndexOutOfBoundsException("offset (" + offset + ") > source size (" + sourceSize + ")");
        }
        long j = offset + size;
        if (j < offset) {
            throw new IndexOutOfBoundsException("offset (" + offset + ") + size (" + size + ") overflow");
        }
        if (j > sourceSize) {
            throw new IndexOutOfBoundsException("offset (" + offset + ") + size (" + size + ") > source size (" + sourceSize + ")");
        }
    }
}
