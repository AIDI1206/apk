package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import com.android.apksig.util.DataSource;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes3.dex */
public class ChainedDataSource implements DataSource {
    private final DataSource[] mSources;
    private final long mTotalSize;

    public ChainedDataSource(DataSource... sources) {
        this.mSources = sources;
        this.mTotalSize = Arrays.stream(sources).mapToLong(new ToLongFunction() { // from class: com.android.apksig.internal.util.ChainedDataSource$$ExternalSyntheticLambda0
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((DataSource) obj).size();
            }
        }).sum();
    }

    @Override // com.android.apksig.util.DataSource
    public long size() {
        return this.mTotalSize;
    }

    @Override // com.android.apksig.util.DataSource
    public void feed(long offset, long size, DataSink sink) throws IOException {
        DataSink dataSink;
        if (offset + size > this.mTotalSize) {
            throw new IndexOutOfBoundsException("Requested more than available");
        }
        DataSource[] dataSourceArr = this.mSources;
        int length = dataSourceArr.length;
        int i = 0;
        long size2 = offset;
        long j = size;
        while (i < length) {
            DataSource dataSource = dataSourceArr[i];
            if (size2 >= dataSource.size()) {
                size2 -= dataSource.size();
                dataSink = sink;
            } else {
                long size3 = dataSource.size() - size2;
                if (size3 >= j) {
                    dataSource.feed(size2, j, sink);
                    return;
                }
                dataSink = sink;
                dataSource.feed(size2, size3, dataSink);
                j -= size3;
                size2 = 0;
            }
            i++;
            sink = dataSink;
        }
    }

    @Override // com.android.apksig.util.DataSource
    public ByteBuffer getByteBuffer(long offset, int size) throws IOException {
        long j = size;
        if (offset + j > this.mTotalSize) {
            throw new IndexOutOfBoundsException("Requested more than available");
        }
        Pair<Integer, Long> pairLocateDataSource = locateDataSource(offset);
        int iIntValue = pairLocateDataSource.getFirst().intValue();
        long jLongValue = pairLocateDataSource.getSecond().longValue();
        if (j + jLongValue <= this.mSources[iIntValue].size()) {
            return this.mSources[iIntValue].getByteBuffer(jLongValue, size);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size);
        while (iIntValue < this.mSources.length && byteBufferAllocate.hasRemaining()) {
            this.mSources[iIntValue].copyTo(jLongValue, Math.toIntExact(Math.min(this.mSources[iIntValue].size() - jLongValue, byteBufferAllocate.remaining())), byteBufferAllocate);
            iIntValue++;
            jLongValue = 0;
        }
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }

    @Override // com.android.apksig.util.DataSource
    public void copyTo(long offset, int size, ByteBuffer dest) throws IOException {
        feed(offset, size, new ByteBufferSink(dest));
    }

    @Override // com.android.apksig.util.DataSource
    public DataSource slice(long offset, long size) {
        Pair<Integer, Long> pairLocateDataSource = locateDataSource(offset);
        int iIntValue = pairLocateDataSource.getFirst().intValue();
        long jLongValue = pairLocateDataSource.getSecond().longValue();
        DataSource dataSource = this.mSources[iIntValue];
        if (jLongValue + size <= dataSource.size()) {
            return dataSource.slice(jLongValue, size);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataSource.slice(jLongValue, dataSource.size() - jLongValue));
        Pair<Integer, Long> pairLocateDataSource2 = locateDataSource((offset + size) - 1);
        int iIntValue2 = pairLocateDataSource2.getFirst().intValue();
        long jLongValue2 = pairLocateDataSource2.getSecond().longValue();
        while (true) {
            iIntValue++;
            if (iIntValue < iIntValue2) {
                arrayList.add(this.mSources[iIntValue]);
            } else {
                arrayList.add(this.mSources[iIntValue2].slice(0L, jLongValue2 + 1));
                return new ChainedDataSource((DataSource[]) arrayList.toArray(new DataSource[0]));
            }
        }
    }

    private Pair<Integer, Long> locateDataSource(long offset) {
        int i = 0;
        long size = offset;
        while (true) {
            DataSource[] dataSourceArr = this.mSources;
            if (i >= dataSourceArr.length) {
                throw new IndexOutOfBoundsException("Access is out of bound, offset: " + offset + ", totalSize: " + this.mTotalSize);
            }
            if (size < dataSourceArr[i].size()) {
                return Pair.of(Integer.valueOf(i), Long.valueOf(size));
            }
            size -= this.mSources[i].size();
            i++;
        }
    }
}
