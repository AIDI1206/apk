package com.android.apksig.internal.util;

import com.android.apksig.util.DataSink;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class MessageDigestSink implements DataSink {
    private final MessageDigest[] mMessageDigests;

    public MessageDigestSink(MessageDigest[] digests) {
        this.mMessageDigests = digests;
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(byte[] buf, int offset, int length) {
        for (MessageDigest messageDigest : this.mMessageDigests) {
            messageDigest.update(buf, offset, length);
        }
    }

    @Override // com.android.apksig.util.DataSink
    public void consume(ByteBuffer buf) {
        int iPosition = buf.position();
        for (MessageDigest messageDigest : this.mMessageDigests) {
            buf.position(iPosition);
            messageDigest.update(buf);
        }
    }
}
