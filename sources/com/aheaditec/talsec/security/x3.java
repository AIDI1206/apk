package com.aheaditec.talsec.security;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.aheaditec.talsec_security.security.api.Talsec;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class x3 {
    public static final a b = new a(null);
    public static final boolean c;
    public static final String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f304a;

    public static final class a {
        public a() {
        }

        public final x3 a(Context context, String str) {
            byte[] bArr = {-88, -22, -102, -29, -61, -39, 96};
            a(bArr, new byte[]{-81, -73, 122, 53, -90, -95, Ascii.DC4, 65});
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
            byte[] bArr2 = {46, -64, -88};
            a(bArr2, new byte[]{90, -95, -49, 102, -37, 47, -36, 106});
            Intrinsics.checkNotNullParameter(str, new String(bArr2, charset).intern());
            if (!x3.c) {
                byte[] bArr3 = {Ascii.GS, -114, -71, 35, Utf8.REPLACEMENT_BYTE, -48, 38, 122, -103, Ascii.US, 113, -84, 19, -58, Framer.ENTER_FRAME_PREFIX, -42, 32, -110, SignedBytes.MAX_POWER_OF_TWO, -63, 98, -18, -48, 81, Utf8.REPLACEMENT_BYTE, -106, 34, 42, 41, -31, 118, -37, 32, 81, 109, -31, -6, -38, 84, 48, 4, -117, -82, -30, -68, 6, -123, -114, -24, -38, -1, -87, 80, 35};
                a(bArr3, new byte[]{-9, -64, 98, -19, 54, -126, -76, -84, -118, 17, -107, 107, Ascii.CAN, -111, -60, 0, 41, -14, -46, Ascii.DC4, 101, -114, 7, -106, Framer.STDIN_FRAME_PREFIX, -9, -8, -5, Framer.STDOUT_FRAME_PREFIX, -17, -93, Ascii.CAN, 48, Ascii.VT, -71, 34, -3, -125, -58, -70, -13, -70, 19, 35, 81, Base64.padSymbol, 67, 12, 8, -41, 90, Utf8.REPLACEMENT_BYTE, 121, Ascii.CR});
                Log.e(str, new String(bArr3, charset).intern());
                return null;
            }
            String str2 = x3.d;
            if (ContextCompat.checkSelfPermission(context, str2) == 0) {
                return new x3();
            }
            byte[] bArr4 = {-111, -3, -29, -47, -123, -42, 126, 6, -81, -75, -126, -23, 74, -67, -20, -57, -6, 124, -66, -61, 73, Ascii.ESC, 41, -73, 71, 125, -63, -90, 58, 87, 59, -76, 52, -8, 108, 107, -84, 112, -109, -103, -29, 37, -99, 113, -16, -125, 77, -21, -28};
            a(bArr4, new byte[]{123, -77, 56, Ascii.US, -116, -124, -20, -48, -68, -69, 102, 46, 65, -22, 9, 17, -13, Ascii.FS, 44, Ascii.SYN, 78, 123, -2, 112, 85, Ascii.FS, Ascii.ESC, 119, 34, 89, -18, 119, 36, -94, -72, -88, -85, 41, 51, Ascii.ESC, 4, 112, 74, -76, -1, -115, -106, 35, -60});
            String strIntern = new String(bArr4, charset).intern();
            byte[] bArr5 = {-71, -104, 100, Framer.EXIT_FRAME_PREFIX, 106, -86, -92, 117, 56, 119, 32, -99, -49, 108, -75, 48, 125, 51, -99, -86, 98, -51, -43, Ascii.GS, 60, 62, -125, Ascii.ETB, 94, Ascii.DC2, -27, -61, -65, 79, -14, -125, -64, 114, Ascii.SUB, 113, -18, 105};
            a(bArr5, new byte[]{125, -59, -77, -84, 123, -3, 65, -96, 53, 42, -64, Ascii.US, -62, Ascii.CR, 39, -7, 107, 124, 125, 124, 107, -97, 71, -42, 46, 48, 48, -57, 86, 114, 4, 8, -73, 116, Framer.ENTER_FRAME_PREFIX, 83, -51, 38, -51, -92, -102, 71});
            Log.e(str, strIntern + str2 + new String(bArr5, charset).intern());
            return null;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
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
                        byte b = bArr3[i11];
                        int length3 = bArr4.length;
                        byte b2 = bArr3[(length3 ^ i10) + ((i9 | length3) * 2) + 1];
                        int i12 = ((byte) 0) - b;
                        bArr3[i11] = (byte) (((byte) (((byte) 2) * ((byte) (b2 & (~i12))))) - ((byte) (b2 ^ i12)));
                        break;
                    case -1882653318:
                        int i13 = (i2 - 1) - (i2 | (-4));
                        byte b3 = bArr3[i13];
                        int i14 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                        int i15 = i2 + 3 + (((-1) - i2) | (-3));
                        int i16 = bArr3[i15] & 255;
                        int i17 = i16 * ((~i16) & 65536);
                        int i18 = ~((i14 | (1169991170 | (~i17))) - ((i17 & 1169991170) | i14));
                        int iA = m0.a(689061172 & i2, i2, 1, 689061173 & i2);
                        int i19 = bArr3[iA] & 255;
                        int i20 = ((~i18) & (i19 * ((~i19) & 256))) + i18;
                        int i21 = (i20 - 1) - ((~(bArr3[i2] & 255)) | i20);
                        byte b4 = bArr4[i13];
                        int i22 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
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
                        byte b5 = bArr4[(length8 ^ i36) + ((length8 & i36) * 2)];
                        int length9 = bArr4.length;
                        int i38 = 0 - i36;
                        byte b6 = bArr3[(((~i38) & length9) * 2) - (length9 ^ i38)];
                        bArr4[n0.a(0, (length7 & 2) | iA2, i37, 1)] = (byte) (((byte) (b6 + b5)) - ((byte) (((byte) 2) * ((byte) (b6 & b5)))));
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
    }

    static {
        c = Build.VERSION.SDK_INT >= 34;
        byte[] bArr = {-97, 59, -122, -55, 55, -4, 10, 5, 4, 44, -67, -14, Ascii.CR, 99, -15, Ascii.EM, 127, -50, 36, 99, -95, -56, Framer.STDIN_FRAME_PREFIX, -84, 102, 5, -22, -38, -93, -110, -42, -105, -82, 0, -57, -31, 100, 12, Ascii.EM, -99};
        a(bArr, new byte[]{-2, 85, -30, -69, 88, -107, 110, 43, 116, 73, -49, -97, 100, Ascii.DLE, -126, 112, Ascii.DLE, -96, 10, 39, -28, -100, 104, -17, Framer.STDERR_FRAME_PREFIX, 90, -71, -103, -15, -41, -109, -39, -15, 67, -122, -79, 48, 89, 75, -40});
        d = new String(bArr, StandardCharsets.UTF_8).intern();
    }

    public x3() {
        this.f304a = LazyKt.lazy(new Function0() { // from class: com.aheaditec.talsec.security.x3$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return x3.d();
            }
        });
    }

    public static final Activity.ScreenCaptureCallback d() {
        return new Activity.ScreenCaptureCallback() { // from class: com.aheaditec.talsec.security.x3$$ExternalSyntheticLambda0
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                x3.e();
            }
        };
    }

    public static final void e() {
        Talsec.onScreenshotDetected();
    }

    public final Activity.ScreenCaptureCallback c() {
        return (Activity.ScreenCaptureCallback) this.f304a.getValue();
    }

    public /* synthetic */ x3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void a(Activity activity) {
        byte[] bArr = {-9, -88, -120, -6, Framer.EXIT_FRAME_PREFIX, -39, -2, 80};
        a(bArr, new byte[]{-106, -53, -4, -109, Ascii.SO, -80, -118, 41});
        Intrinsics.checkNotNullParameter(activity, new String(bArr, StandardCharsets.UTF_8).intern());
        activity.registerScreenCaptureCallback(ContextCompat.getMainExecutor(activity), (Activity.ScreenCaptureCallback) this.f304a.getValue());
    }

    public final void b(Activity activity) {
        byte[] bArr = {-92, Framer.STDERR_FRAME_PREFIX, Ascii.RS, 126, Framer.ENTER_FRAME_PREFIX, -65, 103, Ascii.SUB};
        a(bArr, new byte[]{-59, 81, 106, Ascii.ETB, 87, -42, 19, 99});
        Intrinsics.checkNotNullParameter(activity, new String(bArr, StandardCharsets.UTF_8).intern());
        activity.unregisterScreenCaptureCallback((Activity.ScreenCaptureCallback) this.f304a.getValue());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        int i = -585497720;
        int i2 = 0;
        int i3 = 0;
        int length = 0;
        byte[] bArr4 = null;
        while (true) {
            int i4 = ((i & 16777216) * (i | 16777216)) + ((i & (-16777217)) * ((~i) & 16777216));
            int i5 = i >>> 8;
            int i6 = ~((((~i5) | (-238348293)) | i4) - ((i5 & (-238348293)) | i4));
            int i7 = (-1081514022) - ((i6 & 2) | ((-10362931) - i6));
            int iA = com.aheaditec.talsec.security.a.a(i7 | (-428181225), 2, i7, -428181225);
            int i8 = -1057239115;
            switch (iA) {
                case -1819084085:
                    int length2 = bArr3.length;
                    int i9 = 0 - i2;
                    int length3 = bArr3.length;
                    int i10 = 0 - i9;
                    byte b2 = bArr3[(length3 & (~i10)) - ((~length3) & i10)];
                    int length4 = bArr3.length;
                    byte b3 = bArr4[((length4 | i9) - (((-1678010279) & (~i9)) & length4)) + ((i9 | (-1678010279)) & length4)];
                    bArr3[((length2 | i9) * 2) - (length2 ^ i9)] = (byte) (((byte) (((byte) (((byte) 2) * ((byte) (b3 | b2)))) - b3)) - b2);
                    length = 4 - ((5 - i2) | (i2 & 2));
                    int i11 = ((i2 > 2 ? 1 : (i2 == 2 ? 0 : -1)) >>> 31) & 1;
                    i = i11 != 0 ? 2100390411 : -897645243;
                    if (i11 == 0) {
                    }
                    break;
                case -1350640889:
                    int length5 = bArr.length;
                    int length6 = 0 - (bArr.length % 4);
                    boolean z = ((length5 | length6) - ((942778902 & (~length6)) & length5)) + ((length6 | 942778902) & length5) > 0;
                    i = z ? -1469476344 : z ? -897645243 : 1251644638;
                    bArr4 = bArr2;
                    bArr3 = bArr;
                    i3 = 0;
                    break;
                case -477594107:
                    int length7 = bArr3.length;
                    int i12 = 0 - i2;
                    int i13 = ((length7 | i12) - (((-515406864) & (~i12)) & length7)) + ((i12 | (-515406864)) & length7);
                    byte b4 = bArr4[i13];
                    int length8 = bArr3.length;
                    byte b5 = bArr4[((i12 | length8) * 2) - (length8 ^ i12)];
                    int i14 = ((byte) 0) - b4;
                    int i15 = i14 | b5;
                    bArr4[i13] = (byte) (((byte) (((byte) i15) - ((byte) (((byte) 2) * ((byte) i14))))) + ((byte) ((b5 ^ i14) ^ i15)));
                    break;
                case 769572960:
                    break;
                case 783648904:
                    int i16 = i3 + 4 + (((-1) - i3) | (-4));
                    byte b6 = bArr4[i16];
                    int i17 = ((b6 & 16777216) * (b6 | 16777216)) + ((b6 & (-16777217)) * ((~b6) & 16777216));
                    int i18 = i3 & 2;
                    int i19 = (i3 + 2) - i18;
                    int i20 = bArr4[i19] & 255;
                    int i21 = i20 * ((~i20) & 65536);
                    int i22 = ~((i17 | ((~i21) | 467314697)) - ((i21 & 467314697) | i17));
                    int i23 = (i3 + 1) - (i3 & 1);
                    int i24 = bArr4[i23] & 255;
                    int i25 = i24 * ((~i24) & 256);
                    int i26 = ~((i22 | ((~i25) | 1328859631)) - ((i25 & 1328859631) | i22));
                    int i27 = bArr4[i3] & 255;
                    int iA2 = l0.a(i26, i27, 1, ((-1) - i26) | ((-1) - i27));
                    byte b7 = bArr3[i16];
                    int i28 = ((b7 & 16777216) * (b7 | 16777216)) + ((b7 & (-16777217)) * ((~b7) & 16777216));
                    int i29 = bArr3[i19] & 255;
                    int i30 = i29 * ((~i29) & 65536);
                    int iA3 = m0.a((~i28) & 1647046022 & i30, i30, i28, (1647046022 | i28) & i30);
                    int i31 = bArr3[i23] & 255;
                    int i32 = i31 * ((~i31) & 256);
                    int i33 = ~((iA3 | ((~i32) | (-2059442874))) - (((-2059442874) & i32) | iA3));
                    int i34 = bArr3[i3] & 255;
                    int iA4 = l0.a(i33, i34, 1, ((-1) - i33) | ((-1) - i34));
                    int i35 = iA2 << ((iA2 > Double.NaN ? 1 : (iA2 == Double.NaN ? 0 : -1)) >>> 31);
                    int i36 = (i35 + iA4) - ((i35 & iA4) * 2);
                    bArr3[i3] = (byte) i36;
                    bArr3[i23] = (byte) (i36 >>> 8);
                    bArr3[i19] = (byte) (i36 >>> 16);
                    bArr3[i16] = (byte) (i36 >>> 24);
                    i3 = (-11) - (((-15) - i3) | i18);
                    int length9 = bArr3.length;
                    int iA5 = w1.a(bArr3.length, 4, 0, 0);
                    int i37 = ((i3 > (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 1 : (i3 == (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 0 : -1)) >>> 31) & 1;
                    i = i37 != 0 ? -897645243 : 1251644638;
                    if (i37 != 0) {
                        i = -1469476344;
                    }
                    break;
                case 1758587480:
                    int length10 = bArr3.length;
                    int i38 = 0 - length;
                    i = (((double) ((byte) bArr4[((length10 | i38) - (((~i38) & 822835569) & length10)) + ((822835569 | i38) & length10)])) > Double.NaN ? 1 : (((double) ((byte) bArr4[((length10 | i38) - (((~i38) & 822835569) & length10)) + ((822835569 | i38) & length10)])) == Double.NaN ? 0 : -1)) > -1 ? -1057239115 : -897645243;
                    i2 = length;
                    break;
                case 2013813686:
                    length = bArr3.length % 4;
                    int i39 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i8 = i39 != 0 ? 2100390411 : -897645243;
                    i = i39 == 0 ? -2079636786 : i8;
                    break;
                default:
                    i = -897645243;
                    break;
            }
            return;
        }
    }
}
