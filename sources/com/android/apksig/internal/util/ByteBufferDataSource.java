package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ByteBufferDataSource implements DataSource {
    private final ByteBuffer mBuffer;
    private final int mSize;

    public ByteBufferDataSource(ByteBuffer buffer) {
        this(buffer, true);
    }

    private ByteBufferDataSource(ByteBuffer buffer, boolean sliceRequired) {
        this.mBuffer = sliceRequired ? buffer.slice() : buffer;
        this.mSize = buffer.remaining();
    }

    @Override // com.android.apksig.util.DataSource
    public long size() {
        return this.mSize;
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBuffer getByteBuffer(long offset, int size) {
        ByteBuffer byteBufferSlice;
        checkChunkValid(offset, size);
        int i = (int) offset;
        int i2 = size + i;
        synchronized (this.mBuffer) {
            this.mBuffer.position(0);
            this.mBuffer.limit(i2);
            this.mBuffer.position(i);
            byteBufferSlice = this.mBuffer.slice();
        }
        return byteBufferSlice;
    }

    @Override // com.android.apksig.util.DataSource
    public void copyTo(long offset, int size, ByteBuffer dest) {
        dest.put(getByteBuffer(offset, size));
    }

    @Override // com.android.apksig.util.DataSource
    public void feed(long offset, long size, DataSink sink) throws IOException {
        if (size < 0 || size > this.mSize) {
            throw new IndexOutOfBoundsException("size: " + size + ", source size: " + this.mSize);
        }
        sink.consume(getByteBuffer(offset, (int) size));
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBufferDataSource slice(long offset, long size) {
        if (offset == 0 && size == this.mSize) {
            return this;
        }
        if (size < 0 || size > this.mSize) {
            throw new IndexOutOfBoundsException("size: " + size + ", source size: " + this.mSize);
        }
        return new ByteBufferDataSource(getByteBuffer(offset, (int) size), false);
    }

    private void checkChunkValid(long offset, long size) {
        if (offset < 0) {
            throw new IndexOutOfBoundsException("offset: " + offset);
        }
        if (size < 0) {
            throw new IndexOutOfBoundsException("size: " + size);
        }
        int i = this.mSize;
        if (offset > i) {
            throw new IndexOutOfBoundsException("offset (" + offset + ") > source size (" + this.mSize + ")");
        }
        long j = offset + size;
        if (j < offset) {
            throw new IndexOutOfBoundsException("offset (" + offset + ") + size (" + size + ") overflow");
        }
        if (j > i) {
            throw new IndexOutOfBoundsException("offset (" + offset + ") + size (" + size + ") > source size (" + this.mSize + ")");
        }
    }
}
