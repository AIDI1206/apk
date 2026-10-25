package com.aheaditec.talsec_security.security.api;

import android.app.Activity;
import com.aheaditec.talsec.security.m0;
import com.aheaditec.talsec.security.n0;
import com.aheaditec.talsec.security.p0;
import com.aheaditec.talsec.security.v3;
import com.aheaditec.talsec.security.x3;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenProtector {
    public static final ScreenProtector INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f321a;
    public static x3 b;
    public static v3 c;
    public static boolean d;

    static {
        byte[] bArr = {-59, -117, -124, -73, -85, -3, -96, 73, Framer.STDERR_FRAME_PREFIX, -18, Ascii.SO, 46, -104, Framer.STDIN_FRAME_PREFIX, 9, -20, -5, Ascii.SO, -11, Framer.EXIT_FRAME_PREFIX, 2};
        a(bArr, new byte[]{Base64.padSymbol, -59, 90, 98, -94, -84, 101, -116, 36, -67, -39, -2, 108, 114, -24, 58, -14, Framer.STDIN_REQUEST_FRAME_PREFIX, 19, -87, 112});
        f321a = new String(bArr, StandardCharsets.UTF_8).intern();
        INSTANCE = new ScreenProtector();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        int length = 0;
        int i3 = -894652659;
        byte[] bArr4 = null;
        while (true) {
            int i4 = ((i3 & 16777216) * (i3 | 16777216)) + ((i3 & (-16777217)) * ((~i3) & 16777216));
            int i5 = i3 >>> 8;
            int i6 = (i5 + i4) - (i5 & i4);
            int i7 = (i6 ^ 1458005263) + ((i6 & 1458005263) * 2);
            int i8 = -34715366;
            switch ((i7 - 1434379843) + (((~i7) & 1434379843) * 2)) {
                case -1970406716:
                    int length2 = bArr4.length;
                    int i9 = 0 - i;
                    int i10 = ~i9;
                    int i11 = ((length2 | i9) - ((602749225 & i10) & length2)) + ((i9 | 602749225) & length2);
                    byte b2 = bArr3[i11];
                    int length3 = bArr4.length;
                    byte b3 = bArr3[(length3 ^ i10) + ((i9 | length3) * 2) + 1];
                    int i12 = ((byte) 0) - b2;
                    bArr3[i11] = (byte) (((byte) (((byte) 2) * ((byte) (b3 & (~i12))))) - ((byte) (b3 ^ i12)));
                    break;
                case -1882653318:
                    int i13 = (i2 - 1) - (i2 | (-4));
                    byte b4 = bArr3[i13];
                    int i14 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                    int i15 = i2 + 3 + (((-1) - i2) | (-3));
                    int i16 = bArr3[i15] & 255;
                    int i17 = i16 * ((~i16) & 65536);
                    int i18 = ~((i14 | (1169991170 | (~i17))) - ((i17 & 1169991170) | i14));
                    int iA = m0.a(689061172 & i2, i2, 1, 689061173 & i2);
                    int i19 = bArr3[iA] & 255;
                    int i20 = ((~i18) & (i19 * ((~i19) & 256))) + i18;
                    int i21 = (i20 - 1) - ((~(bArr3[i2] & 255)) | i20);
                    byte b5 = bArr4[i13];
                    int i22 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
                    int i23 = bArr4[i15] & 255;
                    int i24 = i23 * ((~i23) & 65536);
                    int i25 = ~((i22 | ((-445685625) | (~i24))) - ((i24 & (-445685625)) | i22));
                    int i26 = bArr4[iA] & 255;
                    int i27 = i26 * ((~i26) & 256);
                    int i28 = (i27 + i25) - (i27 & i25);
                    int i29 = bArr4[i2] & 255;
                    int i30 = (i28 & (~i29)) + i29;
                    int i31 = i21 << ((i21 > Double.NaN ? 1 : (i21 == Double.NaN ? 0 : -1)) >>> 31);
                    int i32 = (i31 + i30) - ((i31 & i30) * 2);
                    int i33 = 659933421 - ((i32 & 2) | ((-1983400303) - i32));
                    bArr4[i2] = (byte) i33;
                    bArr4[iA] = (byte) (i33 >>> 8);
                    bArr4[i15] = (byte) (i33 >>> 16);
                    bArr4[i13] = (byte) (i33 >>> 24);
                    i2 = (i2 ^ 4) + ((i2 & 4) * 2);
                    int length4 = bArr4.length;
                    int length5 = 0 - (bArr4.length % 4);
                    int i34 = 1 & ((i2 > ((length4 ^ length5) + ((length4 & length5) * 2)) ? 1 : (i2 == ((length4 ^ length5) + ((length4 & length5) * 2)) ? 0 : -1)) >>> 31);
                    i3 = i34 != 0 ? -826922365 : i34 != 0 ? 196573321 : 145880015;
                    break;
                case -625567707:
                    break;
                case 172635213:
                    int length6 = bArr4.length;
                    int i35 = 0 - length;
                    i3 = (((double) ((byte) bArr3[(length6 ^ i35) + ((length6 & i35) * 2)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[(length6 ^ i35) + ((length6 & i35) * 2)])) == Double.NaN ? 0 : -1)) > -1 ? -34715366 : 196573321;
                    i = length;
                    break;
                case 614184219:
                    int length7 = bArr4.length;
                    int i36 = 0 - i;
                    int i37 = i36 * 3;
                    int iA2 = p0.a(i36, -4, 1, length7);
                    int length8 = bArr4.length;
                    byte b6 = bArr4[(length8 ^ i36) + ((length8 & i36) * 2)];
                    int length9 = bArr4.length;
                    int i38 = 0 - i36;
                    byte b7 = bArr3[(((~i38) & length9) * 2) - (length9 ^ i38)];
                    bArr4[n0.a(0, (length7 & 2) | iA2, i37, 1)] = (byte) (((byte) (b7 + b6)) - ((byte) (((byte) 2) * ((byte) (b7 & b6)))));
                    length = ((-338014207) | i) + (338014206 | i);
                    int i39 = ((i > 2 ? 1 : (i == 2 ? 0 : -1)) >>> 31) & 1;
                    i8 = i39 != 0 ? 196573321 : 1298988808;
                    i3 = i39 == 0 ? i8 : -518432968;
                    break;
                case 835516413:
                    int length10 = bArr.length;
                    int length11 = 0 - (0 - (bArr.length % 4));
                    boolean z = (length10 ^ length11) - (((~length10) & length11) * 2) > 0;
                    i3 = z ? -826922365 : z ? 196573321 : 145880015;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i2 = 0;
                    break;
                case 1888416065:
                    length = bArr4.length % 4;
                    int i40 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i8 = i40 != 0 ? 196573321 : 1298988808;
                    if (i40 == 0) {
                    }
                    break;
                default:
                    i3 = 196573321;
                    break;
            }
            return;
        }
    }

    @JvmStatic
    public static final void registerScreenCallbacks(Activity activity) {
        byte[] bArr = {36, 40, -11, 65, 0, -73, 17, -18};
        a(bArr, new byte[]{Framer.ENTER_FRAME_PREFIX, 121, 19, -118, Ascii.SUB, -32, -9, 53});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(activity, new String(bArr, charset).intern());
        if (!d) {
            d = true;
            x3.a aVar = x3.b;
            byte[] bArr2 = {-60, -86, -116, -36, -67, -41, -57, 39, -110, 41, 78, -13, -121, Ascii.EM, -101, Ascii.EM, 89, -105, -80, 62, -4};
            a(bArr2, new byte[]{60, -28, 82, 9, -76, -122, 2, -30, -124, 122, -103, 35, 115, 70, 122, -49, 80, -58, 86, -17, -114});
            b = aVar.a(activity, new String(bArr2, charset).intern());
            v3.a aVar2 = v3.b;
            byte[] bArr3 = {-8, -12, -28, 73, 3, 9, -89, -114, 124, 99, 92, -59, -90, -16, -52, -96, 60, -44, 126, 116, -99};
            a(bArr3, new byte[]{0, -70, 58, -100, 10, 88, 98, 75, 106, 48, -117, Ascii.NAK, 82, -81, Framer.STDIN_FRAME_PREFIX, 118, 53, -123, -104, -91, -17});
            c = aVar2.a(activity, new String(bArr3, charset).intern());
        }
        x3 x3Var = b;
        if (x3Var != null) {
            x3Var.a(activity);
        }
        v3 v3Var = c;
        if (v3Var != null) {
            v3Var.a(activity);
        }
    }

    @JvmStatic
    public static final void unregisterScreenCallbacks(Activity activity) {
        byte[] bArr = {-63, 108, -61, -73, 118, -44, -70, 126};
        a(bArr, new byte[]{-60, Base64.padSymbol, 37, 124, 108, -125, 92, -91});
        Intrinsics.checkNotNullParameter(activity, new String(bArr, StandardCharsets.UTF_8).intern());
        x3 x3Var = b;
        if (x3Var != null) {
            x3Var.b(activity);
        }
        v3 v3Var = c;
        if (v3Var != null) {
            v3Var.b(activity);
        }
    }
}
