package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f284a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;

    static {
        byte[] bArr = {-88, -27, 58, 77, 82, 110, 69, 4, -52, -68, -94, -95, 47, -21, 51, -101, 48};
        a(bArr, new byte[]{-37, -128, 86, 36, 60, Ascii.ESC, Base64.padSymbol, 84, -66, -45, -46, -60, 93, -97, 90, -2, 67});
        Charset charset = StandardCharsets.UTF_8;
        p = new String(bArr, charset).intern();
        byte[] bArr2 = {-60, 10, 125, -68, 3, 54, Ascii.DC4, -118, -111, -104, -44, -106, -36, 109, -44, 37, -126, 106, -44, -17, -63, -128};
        a(bArr2, new byte[]{-73, 111, 17, -43, 109, 67, 108, -49, -1, -2, -69, -28, -65, 8, -80, 119, -25, 12, -72, -118, -94, -12});
        o = new String(bArr2, charset).intern();
        byte[] bArr3 = {122, 51, 82, 52, -69, 118, 47, -62, -60, -14, -61, -95, Framer.STDOUT_FRAME_PREFIX, 46, -105, 78, 96, -91, -43, 88, 119};
        a(bArr3, new byte[]{9, 86, 62, 93, -43, 3, 87, -121, -86, -109, -95, -51, 84, 74, -59, 43, 6, -55, -80, 59, 3});
        n = new String(bArr3, charset).intern();
        byte[] bArr4 = {77, -13, -69, -104, -8, 43, 116, -1, 10, 72, 35, -55, -48, 10, -128, 118, 105, -6, -58, -1, 82, 89, -95, -41, 100, -83, -33, Ascii.US, 48};
        a(bArr4, new byte[]{62, -106, -41, -15, -106, 94, 12, -70, 100, 46, 76, -69, -77, 111, -19, 19, 7, -114, -128, -106, 62, 60, -30, -72, 10, -39, -70, 113, 68});
        m = new String(bArr4, charset).intern();
        byte[] bArr5 = {7, -49, -65, -119, 77, 39, 62, -94, Framer.ENTER_FRAME_PREFIX, Ascii.ETB, -46};
        a(bArr5, new byte[]{116, -86, -45, -32, 35, 82, 70, -17, 78, 115, -73});
        l = new String(bArr5, charset).intern();
        byte[] bArr6 = {123, -128, -117, -58, 117, 17, -84, 46, 36, -27, SignedBytes.MAX_POWER_OF_TWO, 91, 19, 110, 112, -121, 52, -72, -67};
        a(bArr6, new byte[]{Ascii.EM, -17, -28, -78, 38, 116, -64, 71, 74, -112, 56, Ascii.VT, 97, 1, 0, -30, 70, -52, -60});
        k = new String(bArr6, charset).intern();
        byte[] bArr7 = {-62, 87, 59, -60, 65, -75, Ascii.SUB, -13, 35, -55, 51, 9, 101, 6, -85, 34, 47, 42, Ascii.VT, 56};
        a(bArr7, new byte[]{-96, 34, 82, -88, 37, -26, 127, -97, 74, -89, 70, 113, 53, 116, -60, 82, 74, 88, 127, 65});
        j = new String(bArr7, charset).intern();
        byte[] bArr8 = {-128, -2, -54, -83, -114, 122, -59, 121, -24, 115, 86, 38, 38};
        a(bArr8, new byte[]{-13, -101, -87, -40, -4, 19, -79, 0, -72, Ascii.DC2, 34, 69, 78});
        i = new String(bArr8, charset).intern();
        byte[] bArr9 = {35, -80, 91, 88, -121, -112, -51, 1, -76, -8, -114, 113, 73, 126, -94, -70, -69, -40, -116, -101, 97};
        a(bArr9, new byte[]{74, -61, Ascii.SUB, Framer.STDIN_FRAME_PREFIX, -13, -1, -103, 104, -39, -99, -44, Ascii.RS, 39, Ascii.ESC, -25, -44, -38, -70, -32, -2, 5});
        h = new String(bArr9, charset).intern();
        byte[] bArr10 = {-11, 101, 98, 58, Framer.STDIN_REQUEST_FRAME_PREFIX, 80, 83, 41, -6, -115, -52, 115, -94, -116, -23, 124, -75};
        a(bArr10, new byte[]{-100, Ascii.SYN, 35, 79, 43, Utf8.REPLACEMENT_BYTE, 7, SignedBytes.MAX_POWER_OF_TWO, -105, -24, -119, Ascii.GS, -61, -18, -123, Ascii.EM, -47});
        g = new String(bArr10, charset).intern();
        byte[] bArr11 = {-78, Framer.ENTER_FRAME_PREFIX, 96, -120, -66, Ascii.SI, -8, -26, -46, Ascii.VT, 53, 59, -68, -105, 121, -4, -49, 77, -37, -30, 112, Ascii.RS, -94};
        a(bArr11, new byte[]{-38, SignedBytes.MAX_POWER_OF_TWO, 19, -64, -53, 110, -113, -125, -69, 70, 90, 89, -43, -5, Ascii.FS, -81, -86, Utf8.REPLACEMENT_BYTE, -83, -117, 19, 123, -47});
        f = new String(bArr11, charset).intern();
        byte[] bArr12 = {-90, 77, -68, 12, -98, 38, -45, -82, -79, -89, 67, -106, 68, -101, -8, Ascii.DC2, -111, 39, 37, -97, 42, -70, 37};
        a(bArr12, new byte[]{-50, 44, -49, 75, -15, 73, -76, -62, -44, -22, 44, -12, Framer.STDIN_FRAME_PREFIX, -9, -99, 65, -12, 85, 83, -10, 73, -33, 86});
        e = new String(bArr12, charset).intern();
        byte[] bArr13 = {-4, -60, 87, -40, -125, 4, Ascii.VT, Base64.padSymbol, -121, 6, 103, 108};
        a(bArr13, new byte[]{-107, -73, Ascii.SYN, -68, -31, 65, 101, 92, -27, 106, 2, 8});
        d = new String(bArr13, charset).intern();
        byte[] bArr14 = {84, 1, 92, -111, Ascii.SI, -66, -33, -23, -5, -37, 40, -21, -43, 60, -112, 6};
        a(bArr14, new byte[]{60, 118, Ascii.RS, -16, 108, -43, -70, -115, -80, -66, 81, -120, -67, 93, -7, 104});
        c = new String(bArr14, charset).intern();
        byte[] bArr15 = {123, -39, Utf8.REPLACEMENT_BYTE, -43, -45, -24, -73, -69, 67, 32};
        a(bArr15, new byte[]{Ascii.EM, -80, 80, -72, -74, -100, -59, -46, 32, 83});
        b = new String(bArr15, charset).intern();
        byte[] bArr16 = {-96, -70, -104, -19, -79, -101, 69, -94};
        a(bArr16, new byte[]{-45, -33, -5, -104, -61, -14, Framer.STDOUT_FRAME_PREFIX, -37});
        f284a = new String(bArr16, charset).intern();
    }

    public static JSONObject a(t1 t1Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        byte[] bArr = {-44, Ascii.DC4, -52, 124, -56, 117, 38, -30};
        a(bArr, new byte[]{-89, 113, -81, 9, -70, Ascii.FS, 82, -101});
        Charset charset = StandardCharsets.UTF_8;
        jSONObject.put(new String(bArr, charset).intern(), t1Var.l());
        byte[] bArr2 = {-103, -89, -15, -11, -97, 76, SignedBytes.MAX_POWER_OF_TWO, 92, 112, 6};
        a(bArr2, new byte[]{-5, -50, -98, -104, -6, 56, Framer.STDERR_FRAME_PREFIX, 53, 19, 117});
        jSONObject.put(new String(bArr2, charset).intern(), t1Var.c());
        byte[] bArr3 = {-45, 54, -15, -91, -5, 112, -127, 76, -3, -39, -24, 36, -103, -74, -107, Framer.ENTER_FRAME_PREFIX};
        a(bArr3, new byte[]{-69, 65, -77, -60, -104, Ascii.ESC, -28, 40, -74, -68, -111, 71, -15, -41, -4, 79});
        jSONObject.put(new String(bArr3, charset).intern(), t1Var.k());
        byte[] bArr4 = {-87, -53, 88, -15, 86, 127, -93, 43, -56, 97, Ascii.SYN, 48};
        a(bArr4, new byte[]{-64, -72, Ascii.EM, -107, 52, 58, -51, 74, -86, Ascii.CR, 115, 84});
        jSONObject.put(new String(bArr4, charset).intern(), t1Var.j());
        byte[] bArr5 = {Framer.STDIN_FRAME_PREFIX, 123, -41, 47, 106, Ascii.NAK, -99, -29, -29, 107, -90, -59, -77, 105, -104, 76, -96, 12, -110, Framer.STDIN_FRAME_PREFIX, -53, 123, -45};
        a(bArr5, new byte[]{69, Ascii.SUB, -92, 104, 5, 122, -6, -113, -122, 38, -55, -89, -38, 5, -3, Ascii.US, -59, 126, -28, 68, -88, Ascii.RS, -96});
        jSONObject.put(new String(bArr5, charset).intern(), t1Var.h());
        byte[] bArr6 = {-79, 109, Ascii.ESC, 111, 84, 114, 97, Ascii.GS, 103, 66, -124, -24, 2, -93, -70, 73, -23, 101, Utf8.REPLACEMENT_BYTE, -15, 75, 42, -122};
        a(bArr6, new byte[]{-39, 12, 104, 39, Framer.ENTER_FRAME_PREFIX, 19, Ascii.SYN, Framer.EXIT_FRAME_PREFIX, Ascii.SO, Ascii.SI, -21, -118, 107, -49, -33, Ascii.SUB, -116, Ascii.ETB, 73, -104, 40, 79, -11});
        jSONObject.put(new String(bArr6, charset).intern(), t1Var.i());
        byte[] bArr7 = {Framer.STDIN_FRAME_PREFIX, -66, -111, 100, 124, Ascii.FS, -26, 113, -8, -116, 118, 43, 127, -83, 32, -24, -82};
        a(bArr7, new byte[]{68, -51, -48, 17, 8, 115, -78, Ascii.CAN, -107, -23, 51, 69, Ascii.RS, -49, 76, -115, -54});
        jSONObject.put(new String(bArr7, charset).intern(), t1Var.a());
        byte[] bArr8 = {82, -28, -30, 70, -90, 116, -98, 10, 96, -116, -31, 114, -98, Ascii.NAK, 122, -51, Ascii.US, 107, -99, -17, -127};
        a(bArr8, new byte[]{59, -105, -93, 51, -46, Ascii.ESC, -54, 99, Ascii.CR, -23, -69, Ascii.GS, -16, 112, Utf8.REPLACEMENT_BYTE, -93, 126, 9, -15, -118, -27});
        jSONObject.put(new String(bArr8, charset).intern(), t1Var.b());
        JSONObject jSONObject2 = new JSONObject();
        byte[] bArr9 = {52, -16, 81, -35, 97, -77, Ascii.SO, 39, 96, 38, 9, -40, 123, Framer.ENTER_FRAME_PREFIX, -84, -15, -91, 72, 19, 96};
        a(bArr9, new byte[]{86, -123, 56, -79, 5, -32, 107, 75, 9, 72, 124, -96, 43, 83, -61, -127, -64, 58, 103, Ascii.EM});
        jSONObject2.put(new String(bArr9, charset).intern(), t1Var.f());
        byte[] bArr10 = {-124, -103, -76, 73, -111, -88, 73, 118, -125, -90, Ascii.EM};
        a(bArr10, new byte[]{-9, -4, -40, 32, -1, -35, Framer.STDOUT_FRAME_PREFIX, 59, -20, -62, 124});
        jSONObject2.put(new String(bArr10, charset).intern(), t1Var.s());
        byte[] bArr11 = {-15, -92, 9, 85, -71, 73, 99, -57, 5, Ascii.SUB, -39, -32, Ascii.DC4, -127, -67, Ascii.DC4, Utf8.REPLACEMENT_BYTE, 46, Framer.ENTER_FRAME_PREFIX};
        a(bArr11, new byte[]{-109, -53, 102, Framer.ENTER_FRAME_PREFIX, -22, 44, Ascii.SI, -82, 107, 111, -95, -80, 102, -18, -51, 113, 77, 90, 88});
        jSONObject2.put(new String(bArr11, charset).intern(), t1Var.d());
        byte[] bArr12 = {-44, Ascii.ETB, -99, 10, 53, -12, Ascii.CR, -35, -89, -100, -88, Framer.STDIN_FRAME_PREFIX, 9, -68, -86, -87, 73, 89, 80, -6, -115, 86, Ascii.ESC, -5, -81, 118, Framer.EXIT_FRAME_PREFIX, -57, 117};
        a(bArr12, new byte[]{-89, 114, -15, 99, 91, -127, 117, -104, -55, -6, -57, Framer.STDIN_REQUEST_FRAME_PREFIX, 106, -39, -57, -52, 39, Framer.STDIN_FRAME_PREFIX, Ascii.SYN, -109, -31, 51, 88, -108, -63, 2, Ascii.GS, -87, 1});
        jSONObject2.put(new String(bArr12, charset).intern(), t1Var.r());
        byte[] bArr13 = {-117, -71, -46, -112, 68, 58, -117, -104, 112, -123, -58, 54, -107, 81, -33, -48, -85, 100, SignedBytes.MAX_POWER_OF_TWO, -32, -31};
        a(bArr13, new byte[]{-8, -36, -66, -7, 42, 79, -13, -35, Ascii.RS, -28, -92, 90, -16, 53, -115, -75, -51, 8, 37, -125, -107});
        jSONObject2.put(new String(bArr13, charset).intern(), t1Var.p());
        byte[] bArr14 = {-60, -5, Ascii.SI, -7, 1, -95, 7, 101, -74, 1, 84, 84, Framer.STDIN_FRAME_PREFIX, 82, 102, Framer.STDOUT_FRAME_PREFIX, 99, 66, 1, -36, -85, 36};
        a(bArr14, new byte[]{-73, -98, 99, -112, 111, -44, 127, 32, -40, 103, 59, 38, 78, 55, 2, 99, 6, 36, 109, -71, -56, 80});
        jSONObject2.put(new String(bArr14, charset).intern(), t1Var.q());
        byte[] bArr15 = {-99, 124, Ascii.VT, Ascii.FS, -59, -83, 9, -50, -72, -49, -80, -59, 107, -18, -126, -22, -27};
        a(bArr15, new byte[]{-18, Ascii.EM, 103, 117, -85, -40, 113, -98, -54, -96, -64, -96, Ascii.EM, -102, -21, -113, -106});
        jSONObject.put(new String(bArr15, charset).intern(), jSONObject2);
        byte[] bArr16 = {-101, 35, 113, -34, 34, Framer.STDERR_FRAME_PREFIX, -1, -16, -18, 43, 106, 74, 105};
        a(bArr16, new byte[]{-24, 70, Ascii.DC2, -85, 80, 91, -117, -119, -66, 74, Ascii.RS, 41, 1});
        jSONObject.put(new String(bArr16, charset).intern(), t1Var.o());
        return jSONObject;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        int i2 = -585497720;
        int i3 = 0;
        int i4 = 0;
        int length = 0;
        byte[] bArr4 = null;
        while (true) {
            int i5 = ((i2 & 16777216) * (i2 | 16777216)) + ((i2 & (-16777217)) * ((~i2) & 16777216));
            int i6 = i2 >>> 8;
            int i7 = ~((((~i6) | (-238348293)) | i5) - ((i6 & (-238348293)) | i5));
            int i8 = (-1081514022) - ((i7 & 2) | ((-10362931) - i7));
            int iA = a.a(i8 | (-428181225), 2, i8, -428181225);
            int i9 = -1057239115;
            switch (iA) {
                case -1819084085:
                    int length2 = bArr3.length;
                    int i10 = 0 - i3;
                    int length3 = bArr3.length;
                    int i11 = 0 - i10;
                    byte b2 = bArr3[(length3 & (~i11)) - ((~length3) & i11)];
                    int length4 = bArr3.length;
                    byte b3 = bArr4[((length4 | i10) - (((-1678010279) & (~i10)) & length4)) + ((i10 | (-1678010279)) & length4)];
                    bArr3[((length2 | i10) * 2) - (length2 ^ i10)] = (byte) (((byte) (((byte) (((byte) 2) * ((byte) (b3 | b2)))) - b3)) - b2);
                    length = 4 - ((5 - i3) | (i3 & 2));
                    int i12 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                    i2 = i12 != 0 ? 2100390411 : -897645243;
                    if (i12 == 0) {
                    }
                    break;
                case -1350640889:
                    int length5 = bArr.length;
                    int length6 = 0 - (bArr.length % 4);
                    boolean z = ((length5 | length6) - ((942778902 & (~length6)) & length5)) + ((length6 | 942778902) & length5) > 0;
                    i2 = z ? -1469476344 : z ? -897645243 : 1251644638;
                    bArr4 = bArr2;
                    bArr3 = bArr;
                    i4 = 0;
                    break;
                case -477594107:
                    int length7 = bArr3.length;
                    int i13 = 0 - i3;
                    int i14 = ((length7 | i13) - (((-515406864) & (~i13)) & length7)) + ((i13 | (-515406864)) & length7);
                    byte b4 = bArr4[i14];
                    int length8 = bArr3.length;
                    byte b5 = bArr4[((i13 | length8) * 2) - (length8 ^ i13)];
                    int i15 = ((byte) 0) - b4;
                    int i16 = i15 | b5;
                    bArr4[i14] = (byte) (((byte) (((byte) i16) - ((byte) (((byte) 2) * ((byte) i15))))) + ((byte) ((b5 ^ i15) ^ i16)));
                    break;
                case 769572960:
                    break;
                case 783648904:
                    int i17 = i4 + 4 + (((-1) - i4) | (-4));
                    byte b6 = bArr4[i17];
                    int i18 = ((b6 & 16777216) * (b6 | 16777216)) + ((b6 & (-16777217)) * ((~b6) & 16777216));
                    int i19 = i4 & 2;
                    int i20 = (i4 + 2) - i19;
                    int i21 = bArr4[i20] & 255;
                    int i22 = i21 * ((~i21) & 65536);
                    int i23 = ~((i18 | ((~i22) | 467314697)) - ((i22 & 467314697) | i18));
                    int i24 = (i4 + 1) - (i4 & 1);
                    int i25 = bArr4[i24] & 255;
                    int i26 = i25 * ((~i25) & 256);
                    int i27 = ~((i23 | ((~i26) | 1328859631)) - ((i26 & 1328859631) | i23));
                    int i28 = bArr4[i4] & 255;
                    int iA2 = l0.a(i27, i28, 1, ((-1) - i27) | ((-1) - i28));
                    byte b7 = bArr3[i17];
                    int i29 = ((b7 & 16777216) * (b7 | 16777216)) + ((b7 & (-16777217)) * ((~b7) & 16777216));
                    int i30 = bArr3[i20] & 255;
                    int i31 = i30 * ((~i30) & 65536);
                    int iA3 = m0.a((~i29) & 1647046022 & i31, i31, i29, (1647046022 | i29) & i31);
                    int i32 = bArr3[i24] & 255;
                    int i33 = i32 * ((~i32) & 256);
                    int i34 = ~((iA3 | ((~i33) | (-2059442874))) - (((-2059442874) & i33) | iA3));
                    int i35 = bArr3[i4] & 255;
                    int iA4 = l0.a(i34, i35, 1, ((-1) - i34) | ((-1) - i35));
                    int i36 = iA2 << ((iA2 > Double.NaN ? 1 : (iA2 == Double.NaN ? 0 : -1)) >>> 31);
                    int i37 = (i36 + iA4) - ((i36 & iA4) * 2);
                    bArr3[i4] = (byte) i37;
                    bArr3[i24] = (byte) (i37 >>> 8);
                    bArr3[i20] = (byte) (i37 >>> 16);
                    bArr3[i17] = (byte) (i37 >>> 24);
                    i4 = (-11) - (((-15) - i4) | i19);
                    int length9 = bArr3.length;
                    int iA5 = w1.a(bArr3.length, 4, 0, 0);
                    int i38 = ((i4 > (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 1 : (i4 == (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 0 : -1)) >>> 31) & 1;
                    i2 = i38 != 0 ? -897645243 : 1251644638;
                    if (i38 != 0) {
                        i2 = -1469476344;
                    }
                    break;
                case 1758587480:
                    int length10 = bArr3.length;
                    int i39 = 0 - length;
                    i2 = (((double) ((byte) bArr4[((length10 | i39) - (((~i39) & 822835569) & length10)) + ((822835569 | i39) & length10)])) > Double.NaN ? 1 : (((double) ((byte) bArr4[((length10 | i39) - (((~i39) & 822835569) & length10)) + ((822835569 | i39) & length10)])) == Double.NaN ? 0 : -1)) > -1 ? -1057239115 : -897645243;
                    i3 = length;
                    break;
                case 2013813686:
                    length = bArr3.length % 4;
                    int i40 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i9 = i40 != 0 ? 2100390411 : -897645243;
                    i2 = i40 == 0 ? -2079636786 : i9;
                    break;
                default:
                    i2 = -897645243;
                    break;
            }
            return;
        }
    }
}
