package com.android.apksig.util;

import com.android.apksig.internal.util.ByteBufferDataSource;
import com.android.apksig.internal.util.FileChannelDataSource;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DataSources {
    private DataSources() {
    }

    public static DataSource asDataSource(ByteBuffer buffer) {
        buffer.getClass();
        return new ByteBufferDataSource(buffer);
    }

    public static DataSource asDataSource(RandomAccessFile file) {
        return asDataSource(file.getChannel());
    }

    public static DataSource asDataSource(RandomAccessFile file, long offset, long size) {
        return asDataSource(file.getChannel(), offset, size);
    }

    public static DataSource asDataSource(FileChannel channel) {
        channel.getClass();
        return new FileChannelDataSource(channel);
    }

    public static DataSource asDataSource(FileChannel channel, long offset, long size) {
        channel.getClass();
        return new FileChannelDataSource(channel, offset, size);
    }
}
