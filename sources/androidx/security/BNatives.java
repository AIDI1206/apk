package androidx.security;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class BNatives {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BNatives f213a = new BNatives();

    static {
        System.loadLibrary("ts");
    }

    public final native byte[] a(byte b, byte b2);

    public final native byte[] b(byte b, byte b2);

    public final native byte[] c(byte[] bArr, byte b, byte b2);

    public final native byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, byte b, byte b2);

    public final native byte[] e(byte b, byte b2);

    public final native byte[] f(byte b, byte b2);

    public final native byte[] g(byte b, byte b2);

    public final native byte[] h(Context context, byte[] bArr, byte b, byte b2);

    public final native byte[] i(Context context, byte[] bArr, byte b, byte b2);

    public final native byte[] j(Context context, byte[] bArr, byte b, byte b2);

    public final native byte[] l(byte b, byte b2);

    public final native byte[] m(byte b, byte b2);

    public final native byte[] n(byte[] bArr, byte b, byte b2);

    public final native byte[] p(byte[] bArr, byte b, byte b2);

    public final native byte[] q(byte b, byte b2);

    public final native byte[] r(byte b, byte b2);

    public final native byte[] s(byte b, byte b2);

    public final native byte[] t(byte[] bArr, byte b, byte b2);

    public final native boolean u(String str, String str2);

    public final native byte[] v(byte b, byte b2);
}
