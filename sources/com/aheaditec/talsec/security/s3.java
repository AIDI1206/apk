package com.aheaditec.talsec.security;

import android.content.Context;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s3 f286a = new s3();
    public static final ReentrantLock b = new ReentrantLock();
    public static d2 c;
    public static d2 d;
    public static d2 e;
    public static boolean f;

    public final void a(String str) {
        byte[] bArr = {-115, -81, 104, 96, -50, 2, -10, 69, -120, 56, 3};
        a(bArr, new byte[]{65, -4, -71, -87, 19, -105, 2, -26, -23, 85, 102});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        d2 d2Var = d;
        if (d2Var == null) {
            byte[] bArr2 = {-71, -73, -125, Ascii.US, 41, -54, -29, Ascii.DLE, 97};
            a(bArr2, new byte[]{42, -51, -100, -11, -88, -37, 60, 0, Ascii.NAK});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr2, charset).intern());
            d2Var = null;
        }
        byte[] bArr3 = {-108};
        a(bArr3, new byte[]{-91, 89, -71, 83, -17, -93, 67, -110});
        d2Var.a(str, new String(bArr3, charset).intern());
    }

    public final void b() {
        d2 d2Var = d;
        if (d2Var == null) {
            byte[] bArr = {Ascii.EM, -68, -94, -48, 112, -126, -7, -14, -121};
            a(bArr, new byte[]{-54, -63, 125, 71, 113, Ascii.FS, 2, 38, -13});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
            d2Var = null;
        }
        d2Var.a();
    }

    public final boolean c(String str) {
        byte[] bArr = {90, 7, Ascii.DLE, -88, -20, -120, -128, -94, -40, 2, -99};
        a(bArr, new byte[]{-114, -107, -30, 97, -15, 17, -105, 74, -71, 111, -8});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        d2 d2Var = d;
        if (d2Var == null) {
            byte[] bArr2 = {106, 51, 98, -87, -88, -39, Ascii.NAK, 69, -104};
            a(bArr2, new byte[]{121, 73, -67, 127, 41, -85, -18, -44, -20});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr2, charset).intern());
            d2Var = null;
        }
        return d2Var.b(str);
    }

    public final void d(String str) {
        byte[] bArr = {52, -57, 106, 105};
        a(bArr, new byte[]{-68, -43, -88, -86, 9, -110, 0, -105});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        d2 d2Var = e;
        d2 d2Var2 = null;
        if (d2Var == null) {
            byte[] bArr2 = {-81, -91, 89, -113, 47, -98, 106, -14, -126, 52, -51, -8, -5, -71, -82, 124, 91, Ascii.CAN, -72, Ascii.ESC, -9, Ascii.SUB, -18, -12};
            a(bArr2, new byte[]{53, -31, -82, -108, -95, -22, -81, 36, 100, 78, 94, 56, -12, -53, 73, -84, -117, 83, 79, 12, -24, 97, Ascii.SI, 57});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr2, charset).intern());
            d2Var = null;
        }
        d2Var.a();
        d2 d2Var3 = e;
        if (d2Var3 == null) {
            byte[] bArr3 = {41, -92, -69, -94, Ascii.CAN, -99, 65, -90, 60, 113, Ascii.FS, 69, -114, -30, 46, 65, -33, -16, Ascii.US, -106, -11, -29, 125, 69};
            a(bArr3, new byte[]{-85, -29, 72, 96, -50, -21, -64, Framer.EXIT_FRAME_PREFIX, -94, Framer.STDERR_FRAME_PREFIX, -17, -60, 89, -68, -55, -48, -9, -120, -12, -118, -22, -72, -128, -55});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr3, charset).intern());
        } else {
            d2Var2 = d2Var3;
        }
        byte[] bArr4 = {102};
        a(bArr4, new byte[]{87, -104, -100, 10, -13, 99, -72, 89});
        d2Var2.a(str, new String(bArr4, charset).intern());
    }

    public final void a() {
        d2 d2Var = c;
        if (d2Var == null) {
            byte[] bArr = {55, 109, -48, 4, 123, 67, 118, 96, -75, -78, 78, -99, -38, -54};
            a(bArr, new byte[]{-72, Framer.STDERR_FRAME_PREFIX, 39, 4, 116, 84, -116, -112, 60, -48, -81, -115, -82, -71});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
            d2Var = null;
        }
        d2Var.a();
    }

    public final String b(String str) {
        byte[] bArr = {-19, -48, 56, -25};
        a(bArr, new byte[]{-11, -33, -34, 40, 12, -53, 7, -87});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        d2 d2Var = e;
        if (d2Var == null) {
            byte[] bArr2 = {34, -83, 76, Framer.STDIN_REQUEST_FRAME_PREFIX, -80, 57, 93, -14, 124, -127, 10, -71, 1, -57, -46, 85, -120, Ascii.SYN, -21, -62, 3, 96, -113, 41};
            a(bArr2, new byte[]{-96, -24, -37, -92, 38, 70, -68, 36, 98, 3, Ascii.GS, Framer.EXIT_FRAME_PREFIX, -50, -40, Framer.STDIN_FRAME_PREFIX, -53, 88, 82, 56, 87, -44, 36, 110, -30});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr2, charset).intern());
            d2Var = null;
        }
        return d2Var.a(str);
    }

    public final void a(Context context) {
        byte[] bArr = {-7, 96, -114, -31, -13, -5, 125};
        a(bArr, new byte[]{-2, Framer.ENTER_FRAME_PREFIX, 110, 48, -106, -125, 9, -20});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            if (!f) {
                byte[] bArr2 = {-44, -61, -68, 8, 67, 90, 19, 32, Ascii.SUB, -54};
                a(bArr2, new byte[]{34, -16, 90, 36, -124, Ascii.CR, -1, -23, Framer.STDIN_REQUEST_FRAME_PREFIX, -127});
                c = new d2(context, new String(bArr2, charset).intern(), d4.d);
                byte[] bArr3 = {Ascii.VT, -107, 40, -14, 62, -119, -47, -36, -55, 69};
                a(bArr3, new byte[]{-11, -59, -50, Ascii.SO, -88, 39, 47, 89, -89, 7});
                d = new d2(context, new String(bArr3, charset).intern(), d4.e);
                byte[] bArr4 = {-38, -103, Base64.padSymbol, 38, -106, -69, -77, -20, 97, 10};
                a(bArr4, new byte[]{47, -52, -38, -32, 98, -57, 67, Ascii.SUB, 5, 104});
                e = new d2(context, new String(bArr4, charset).intern(), d4.f);
                f = true;
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b(String str, long j) {
        byte[] bArr = {-49, 37, -6, 76, -16, 81, 1, Framer.STDIN_FRAME_PREFIX, -38, -44, Framer.STDERR_FRAME_PREFIX};
        a(bArr, new byte[]{3, 114, Ascii.SI, -60, -11, 88, Ascii.SYN, -63, -69, -71, 87});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        d2 d2Var = c;
        if (d2Var == null) {
            byte[] bArr2 = {115, -92, -28, -97, 35, -114, 81, -3, -81, Ascii.CR, -21, -5, 122, -12};
            a(bArr2, new byte[]{116, -6, 51, 97, -84, Ascii.RS, -89, Ascii.CR, 54, -117, 51, 44, Ascii.SO, -121});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr2, charset).intern());
            d2Var = null;
        }
        return Intrinsics.areEqual(d2Var.a(str), String.valueOf(j));
    }

    public final void a(String str, long j) {
        byte[] bArr = {-46, Ascii.SUB, 116, 121, -30, 62, -41, 38, -56, 39, -46};
        a(bArr, new byte[]{6, 105, -123, -80, -25, 75, 44, -57, -87, 74, -73});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        d2 d2Var = c;
        if (d2Var == null) {
            byte[] bArr2 = {-49, 110, -48, -115, 71, 47, 67, -88, -127, -79, -59, -1, 127, 62};
            a(bArr2, new byte[]{Ascii.DLE, 52, 39, -109, -128, 121, -47, 88, SignedBytes.MAX_POWER_OF_TWO, -17, 88, Ascii.DLE, Ascii.VT, 77});
            Intrinsics.throwUninitializedPropertyAccessException(new String(bArr2, charset).intern());
            d2Var = null;
        }
        d2Var.a(str, String.valueOf(j));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0040. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4 = null;
        int i = -1003175592;
        int length = 0;
        int i2 = 0;
        int i3 = 0;
        byte[] bArr5 = null;
        while (true) {
            int i4 = ((i & 16777216) * (i | 16777216)) + ((i & (-16777217)) * ((~i) & 16777216));
            int i5 = i >>> 8;
            int i6 = ~((((~i5) | (-1095531540)) | i4) - ((i5 & (-1095531540)) | i4));
            int i7 = (-1171264002) - ((i6 & 2) | ((-130029571) - i6));
            int i8 = 935800592;
            switch ((-1109882652) ^ ((~i7) + ((i7 | 1) * 2))) {
                case -1922532006:
                    bArr3 = bArr4;
                    int length2 = bArr5.length;
                    int i9 = 0 - length;
                    i = (((double) ((byte) bArr3[n0.a(0, (length2 & 2) | p0.a(i9, -4, 1, length2), i9 * 3, 1)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[n0.a(0, (length2 & 2) | p0.a(i9, -4, 1, length2), i9 * 3, 1)])) == Double.NaN ? 0 : -1)) > -1 ? 935800592 : -1671996003;
                    i2 = length;
                    bArr4 = bArr3;
                    break;
                case -1486048729:
                    int length3 = bArr.length;
                    int length4 = 0 - (0 - (bArr.length % 4));
                    boolean z = (length3 & (~length4)) - ((~length3) & length4) > 0;
                    i = z ? z ? -1515449616 : 935800592 : -10521562;
                    bArr4 = bArr2;
                    bArr5 = bArr;
                    i3 = 0;
                    break;
                case -497756741:
                    bArr3 = bArr4;
                    int length5 = bArr5.length;
                    int i10 = 0 - i2;
                    int i11 = ((length5 | i10) * 2) - (length5 ^ i10);
                    byte b2 = bArr3[i11];
                    int length6 = bArr5.length;
                    byte b3 = bArr3[((i10 | length6) - ((1163302289 & (~i10)) & length6)) + ((i10 | 1163302289) & length6)];
                    bArr3[i11] = (byte) (((byte) (((byte) (b3 ^ (~b2))) + ((byte) (((byte) 2) * ((byte) (b3 | b2)))))) + ((byte) 1));
                    i = 935800592;
                    bArr4 = bArr3;
                    break;
                case 256719606:
                    int i12 = (i3 - 1) - (i3 | (-4));
                    byte b4 = bArr4[i12];
                    int i13 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                    int i14 = i3 + 2;
                    int i15 = i14 - (i3 & 2);
                    int i16 = bArr4[i15] & 255;
                    int i17 = i16 * ((~i16) & 65536);
                    int iA = l0.a(i17, i13, 1, ((-1) - i17) | ((-1) - i13));
                    int i18 = i14 + (((-1) - i3) | (-2));
                    int i19 = bArr4[i18] & 255;
                    int i20 = i19 * ((~i19) & 256);
                    int i21 = (i20 - 1) - ((~iA) | i20);
                    int i22 = bArr4[i3] & 255;
                    int i23 = ~((i22 | ((~i21) | (-755325340))) - ((i21 & (-755325340)) | i22));
                    byte b5 = bArr5[i12];
                    int i24 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
                    int i25 = bArr5[i15] & 255;
                    int i26 = i25 * ((~i25) & 65536);
                    int i27 = bArr5[i18] & 255;
                    int i28 = i27 * ((~i27) & 256);
                    int i29 = bArr5[i3] & 255;
                    bArr3 = bArr4;
                    int i30 = i23 << ((i23 > Double.NaN ? 1 : (i23 == Double.NaN ? 0 : -1)) >>> 31);
                    int i31 = (-659933419) - ((1983400305 - i24) | (i24 & 2));
                    int i32 = (i31 ^ (~i26)) + ((i31 | i26) * 2) + 1;
                    int i33 = (i32 ^ i29) + ((i32 & i29) * 2);
                    int i34 = ((i33 | i28) - (((-2109111237) & (~i28)) & i33)) + ((i28 | (-2109111237)) & i33);
                    int iA2 = a.a(i30 | i34, 2, i30, i34);
                    bArr5[i3] = (byte) iA2;
                    bArr5[i18] = (byte) (iA2 >>> 8);
                    bArr5[i15] = (byte) (iA2 >>> 16);
                    bArr5[i12] = (byte) (iA2 >>> 24);
                    i3 = (i3 ^ 4) + ((i3 & 4) * 2);
                    int length7 = bArr5.length;
                    int length8 = 0 - (bArr5.length % 4);
                    int i35 = ((i3 > (((length7 | length8) * 2) - (length7 ^ length8)) ? 1 : (i3 == (((length7 | length8) * 2) - (length7 ^ length8)) ? 0 : -1)) >>> 31) & 1;
                    i = i35 != 0 ? -1515449616 : 935800592;
                    if (i35 == 0) {
                        i = -10521562;
                    }
                    bArr4 = bArr3;
                    break;
                case 1429728656:
                    length = bArr5.length % 4;
                    int i36 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i8 = i36 != 0 ? -1216566512 : 935800592;
                    i = i36 == 0 ? -1058029970 : i8;
                    break;
                case 1870596681:
                    break;
                case 1879000533:
                    int length9 = bArr5.length;
                    int i37 = 0 - i2;
                    int i38 = 0 - i37;
                    int i39 = i38 | length9;
                    int i40 = (length9 ^ i38) ^ i39;
                    int i41 = i38 * 2;
                    int length10 = bArr5.length;
                    byte b6 = bArr5[(i38 ^ length10) - (((~length10) & i38) * 2)];
                    int length11 = bArr5.length;
                    byte b7 = bArr4[((i37 | length11) * 2) - (length11 ^ i37)];
                    bArr5[(i39 - i41) + i40] = (byte) (((((byte) (~b7)) + ((byte) (((byte) 2) * ((byte) (b7 | 1))))) ^ b6) ^ 1);
                    length = (~i2) + (i2 * 2);
                    int i42 = ((i2 > 2 ? 1 : (i2 == 2 ? 0 : -1)) >>> 31) & 1;
                    i8 = i42 != 0 ? -1216566512 : 935800592;
                    if (i42 == 0) {
                    }
                    break;
                default:
                    break;
            }
            return;
        }
    }
}
