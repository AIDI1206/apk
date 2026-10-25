package com.android.apksig.internal.util;

import androidx.collection.SieveCacheKt;
import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import com.android.apksig.util.ReadableDataSink;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class ByteArrayDataSink implements ReadableDataSink {
    private static final int MAX_READ_CHUNK_SIZE = 65536;
    private byte[] mArray;
    private int mSize;

    public ByteArrayDataSink() {
        this(65536);
    }

    public ByteArrayDataSink(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("initial capacity: " + initialCapacity);
        }
        this.mArray = new byte[initialCapacity];
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] buf, int offset, int length) throws IOException {
        if (offset < 0) {
            throw new IndexOutOfBoundsException("offset: " + offset);
        }
        if (offset > buf.length) {
            throw new IndexOutOfBoundsException("offset: " + offset + ", buf.length: " + buf.length);
        }
        if (length == 0) {
            return;
        }
        ensureAvailable(length);
        System.arraycopy(buf, offset, this.mArray, this.mSize, length);
        this.mSize += length;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer buf) throws IOException {
        if (buf.hasRemaining()) {
            if (buf.hasArray()) {
                consume(buf.array(), buf.arrayOffset() + buf.position(), buf.remaining());
                buf.position(buf.limit());
                return;
            }
            ensureAvailable(buf.remaining());
            int iMin = Math.min(buf.remaining(), 65536);
            byte[] bArr = new byte[iMin];
            while (buf.hasRemaining()) {
                int iMin2 = Math.min(buf.remaining(), iMin);
                buf.get(bArr, 0, iMin2);
                System.arraycopy(bArr, 0, this.mArray, this.mSize, iMin2);
                this.mSize += iMin2;
            }
        }
    }

    private void ensureAvailable(int minAvailable) throws IOException {
        if (minAvailable <= 0) {
            return;
        }
        long j = ((long) this.mSize) + ((long) minAvailable);
        byte[] bArr = this.mArray;
        if (j <= bArr.length) {
            return;
        }
        if (j > SieveCacheKt.NodeLinkMask) {
            throw new IOException("Required capacity too large: " + j + ", max: 2147483647");
        }
        this.mArray = Arrays.copyOf(this.mArray, (int) Math.max(j, (int) Math.min(((long) bArr.length) * 2, SieveCacheKt.NodeLinkMask)));
    }

    @Override // com.android.apksig.util.DataSource
    public long size() {
        return this.mSize;
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBuffer getByteBuffer(long offset, int size) {
        checkChunkValid(offset, size);
        return ByteBuffer.wrap(this.mArray, (int) offset, size).slice();
    }

    @Override // com.android.apksig.util.DataSource
    public void feed(long offset, long size, DataSink sink) throws IOException {
        checkChunkValid(offset, size);
        sink.consume(this.mArray, (int) offset, (int) size);
    }

    @Override // com.android.apksig.util.DataSource
    public void copyTo(long offset, int size, ByteBuffer dest) throws IOException {
        checkChunkValid(offset, size);
        dest.put(this.mArray, (int) offset, size);
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

    @Override // com.android.apksig.util.DataSource
    public DataSource slice(long offset, long size) {
        checkChunkValid(offset, size);
        return new SliceDataSource((int) offset, (int) size);
    }

    private class SliceDataSource implements DataSource {
        private final int mSliceOffset;
        private final int mSliceSize;

        private SliceDataSource(int offset, int size) {
            this.mSliceOffset = offset;
            this.mSliceSize = size;
        }

        @Override // com.android.apksig.util.DataSource
        public long size() {
            return this.mSliceSize;
        }

        @Override // com.android.apksig.util.DataSource
        public void feed(long offset, long size, DataSink sink) throws IOException {
            checkChunkValid(offset, size);
            sink.consume(ByteArrayDataSink.this.mArray, (int) (((long) this.mSliceOffset) + offset), (int) size);
        }

        @Override // com.android.apksig.util.DataSource
        public ByteBuffer getByteBuffer(long offset, int size) throws IOException {
            checkChunkValid(offset, size);
            return ByteBuffer.wrap(ByteArrayDataSink.this.mArray, (int) (((long) this.mSliceOffset) + offset), size).slice();
        }

        @Override // com.android.apksig.util.DataSource
        public void copyTo(long offset, int size, ByteBuffer dest) throws IOException {
            checkChunkValid(offset, size);
            dest.put(ByteArrayDataSink.this.mArray, (int) (((long) this.mSliceOffset) + offset), size);
        }

        @Override // com.android.apksig.util.DataSource
        public DataSource slice(long offset, long size) {
            checkChunkValid(offset, size);
            return ByteArrayDataSink.this.new SliceDataSource((int) (((long) this.mSliceOffset) + offset), (int) size);
        }

        private void checkChunkValid(long offset, long size) {
            if (offset < 0) {
                throw new IndexOutOfBoundsException("offset: " + offset);
            }
            if (size < 0) {
                throw new IndexOutOfBoundsException("size: " + size);
            }
            int i = this.mSliceSize;
            if (offset > i) {
                throw new IndexOutOfBoundsException("offset (" + offset + ") > source size (" + this.mSliceSize + ")");
            }
            long j = offset + size;
            if (j < offset) {
                throw new IndexOutOfBoundsException("offset (" + offset + ") + size (" + size + ") overflow");
            }
            if (j > i) {
                throw new IndexOutOfBoundsException("offset (" + offset + ") + size (" + size + ") > source size (" + this.mSliceSize + ")");
            }
        }
    }
}
