package io.grpc.okhttp.internal;

import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import okio.ByteString;

/* JADX INFO: loaded from: classes6.dex */
public final class Credentials {
    private Credentials() {
    }

    public static String basic(String str, String str2) {
        try {
            return "Basic " + ByteString.of((str + ":" + str2).getBytes(C.ISO88591_NAME)).base64();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
