package com.android.apksig.util;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface DataSink {
    void consume(ByteBuffer buf) throws IOException;

    void consume(byte[] buf, int offset, int length) throws IOException;
}
