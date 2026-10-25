package com.aheaditec.talsec.security;

import android.util.Log;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h4 f244a = new h4();

    @JvmStatic
    public static final void a(String str, String str2) {
        byte[] bArr = {-49, -82, 54};
        a(bArr, new byte[]{-69, -49, 81, 121, -32, 3, 10, 74});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {77, 96, -24};
        a(bArr2, new byte[]{32, 19, -113, -127, -11, -13, 3, -17});
        Intrinsics.checkNotNullParameter(str2, new String(bArr2, charset).intern());
        Log.d(str, str2);
    }

    @JvmStatic
    public static final void b(String str, String str2) {
        byte[] bArr = {47, 122, 86};
        a(bArr, new byte[]{91, Ascii.ESC, Framer.STDOUT_FRAME_PREFIX, -66, -42, 70, 113, 117});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {75, 101, -23};
        a(bArr2, new byte[]{38, Ascii.SYN, -114, 19, -84, -68, 44, -87});
        Intrinsics.checkNotNullParameter(str2, new String(bArr2, charset).intern());
        Log.e(str, str2);
    }

    @JvmStatic
    public static final void c(String str, String str2) {
        byte[] bArr = {-81, -115, -44};
        a(bArr, new byte[]{-37, -20, -77, -86, 1, 59, -44, -57});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {96, 121, -11};
        a(bArr2, new byte[]{Ascii.CR, 10, -110, -53, -46, -103, -119, -64});
        Intrinsics.checkNotNullParameter(str2, new String(bArr2, charset).intern());
        Log.i(str, str2);
    }

    @JvmStatic
    public static final void d(String str, String str2) {
        byte[] bArr = {Ascii.CR, 7, Ascii.SYN};
        a(bArr, new byte[]{121, 102, 113, -39, -15, Ascii.VT, -104, Ascii.SYN});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {Framer.STDIN_FRAME_PREFIX, -19, 6};
        a(bArr2, new byte[]{SignedBytes.MAX_POWER_OF_TWO, -98, 97, -67, -71, 4, 88, 98});
        Intrinsics.checkNotNullParameter(str2, new String(bArr2, charset).intern());
        Log.v(str, str2);
    }

    @JvmStatic
    public static final void e(String str, String str2) {
        byte[] bArr = {109, -45, 55};
        a(bArr, new byte[]{Ascii.EM, -78, 80, Ascii.RS, -26, 78, -1, 65});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {43, -46, 7};
        a(bArr2, new byte[]{70, -95, 96, 79, 111, -51, -128, Ascii.FS});
        Intrinsics.checkNotNullParameter(str2, new String(bArr2, charset).intern());
        Log.w(str, str2);
    }

    @JvmStatic
    public static final void a(Throwable th) {
        byte[] bArr = {-44};
        a(bArr, new byte[]{-96, Ascii.SUB, Ascii.SUB, -7, 60, -90, -56, -11});
        Intrinsics.checkNotNullParameter(th, new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1850458006;
        byte[] bArr4 = null;
        while (true) {
            int i4 = ((16777216 & i3) * (i3 | 16777216)) + (((-16777217) & i3) * ((~i3) & 16777216));
            int i5 = i3 >>> 8;
            int i6 = (i5 - 1) - ((~i4) | i5);
            int i7 = (-1700147435) - ((i6 & 2) | (2028104049 - i6));
            switch ((-1363443157) ^ ((~i7) + ((i7 | 1) * 2))) {
                case -1940167324:
                    byte b = bArr3[i];
                    int i8 = ((byte) 0) - b;
                    bArr3[i] = (byte) (((byte) (b & (~i8))) - ((byte) ((~b) & i8)));
                    i3 = 614229416;
                    continue;
                case -360299937:
                    boolean z = (((double) ((byte) bArr3[i2])) > Double.NaN ? 1 : (((double) ((byte) bArr3[i2])) == Double.NaN ? 0 : -1)) > -1;
                    i3 = z ? 614229416 : z ? -1396193641 : 427928065;
                    i = i2;
                    continue;
                case 399486784:
                    return;
                case 585276366:
                    i3 = bArr.length > 0 ? 1985663266 : -1396193641;
                    bArr4 = bArr;
                    bArr3 = bArr2;
                    i2 = 0;
                    continue;
                case 1733787683:
                    byte b2 = bArr4[i];
                    byte b3 = bArr3[i];
                    bArr4[i] = (byte) (((byte) (b3 + b2)) - ((byte) (((byte) 2) * ((byte) (b3 & b2)))));
                    i2 = (i ^ 1) + ((i & 1) * 2);
                    if ((((i2 > bArr4.length ? 1 : (i2 == bArr4.length ? 0 : -1)) >>> 31) & 1) != 0) {
                        i3 = 1985663266;
                    }
                    break;
            }
            i3 = -1396193641;
        }
    }
}
