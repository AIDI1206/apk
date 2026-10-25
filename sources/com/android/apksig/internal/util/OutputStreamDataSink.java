package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class OutputStreamDataSink implements DataSink {
    private static final int MAX_READ_CHUNK_SIZE = 65536;
    private final OutputStream mOut;

    public OutputStreamDataSink(OutputStream out) {
        if (out == null) {
            throw new NullPointerException("out == null");
        }
        this.mOut = out;
    }

    public OutputStream getOutputStream() {
        return this.mOut;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] buf, int offset, int length) throws IOException {
        this.mOut.write(buf, offset, length);
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer buf) throws IOException {
        if (buf.hasRemaining()) {
            if (buf.hasArray()) {
                this.mOut.write(buf.array(), buf.arrayOffset() + buf.position(), buf.remaining());
                buf.position(buf.limit());
                return;
            }
            int iMin = Math.min(buf.remaining(), 65536);
            byte[] bArr = new byte[iMin];
            while (buf.hasRemaining()) {
                int iMin2 = Math.min(buf.remaining(), iMin);
                buf.get(bArr, 0, iMin2);
                this.mOut.write(bArr, 0, iMin2);
            }
        }
    }
}
