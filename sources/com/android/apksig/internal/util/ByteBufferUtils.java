package com.android.apksig.internal.util;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteBufferUtils {
    private ByteBufferUtils() {
    }

    public static byte[] toByteArray(ByteBuffer buf) {
        byte[] bArr = new byte[buf.remaining()];
        buf.get(bArr);
        return bArr;
    }
}
