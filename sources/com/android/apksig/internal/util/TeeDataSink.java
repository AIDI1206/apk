package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class TeeDataSink implements DataSink {
    private final DataSink[] mSinks;

    public TeeDataSink(DataSink[] sinks) {
        this.mSinks = sinks;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] buf, int offset, int length) throws IOException {
        for (DataSink dataSink : this.mSinks) {
            dataSink.consume(buf, offset, length);
        }
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer buf) throws IOException {
        int iPosition = buf.position();
        for (int i = 0; i < this.mSinks.length; i++) {
            if (i > 0) {
                buf.position(iPosition);
            }
            this.mSinks[i].consume(buf);
        }
    }
}
