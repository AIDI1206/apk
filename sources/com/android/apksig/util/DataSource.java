package com.android.apksig.util;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface DataSource {
    void copyTo(long offset, int size, ByteBuffer dest) throws IOException;

    void feed(long offset, long size, DataSink sink) throws IOException;

    ByteBuffer getByteBuffer(long offset, int size) throws IOException;

    long size();

    DataSource slice(long offset, long size);
}
