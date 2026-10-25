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
public abstract class e4 extends k0 {
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final f2 n;
    public final t1 o;
    public final v0 p;
    public final String q;

    static {
        byte[] bArr = {-23, 101, -48, 76, -36, -10, 117, 103, Framer.STDOUT_FRAME_PREFIX, 4, -42, -128, 85, Ascii.ESC, 111, -128, 116, 77, 111, -23};
        b(bArr, new byte[]{118, 76, -88, 70, -102, -49, 0, Base64.padSymbol, 71, -102, -102, 2, Ascii.ESC, 125, -12, 10, -16, 83, -22, -97});
        Charset charset = StandardCharsets.UTF_8;
        z = new String(bArr, charset).intern();
        byte[] bArr2 = {Ascii.SUB, -106, -81, 60, -35, Ascii.SO, -3, 79, -116, 80, -77, -113, -55};
        b(bArr2, new byte[]{98, 41, -84, 115, -99, -103, -107, 67, -25, 83, -60, -7, -89});
        y = new String(bArr2, charset).intern();
        byte[] bArr3 = {122, 54, -39, 69, -74, -12, Ascii.DC4, 60, Ascii.GS, Framer.STDERR_FRAME_PREFIX, -34, 55, -126};
        b(bArr3, new byte[]{-14, -127, -100, 37, -69, -63, 100, 97, 93, -124, -95, 107, -16});
        x = new String(bArr3, charset).intern();
        byte[] bArr4 = {-85, Ascii.ESC, -128, -104, 108, -18, 6, 102, 43, -97, SignedBytes.MAX_POWER_OF_TWO};
        b(bArr4, new byte[]{-63, -81, -43, -31, -23, -66, 92, Ascii.EM, 68, -19, Framer.STDIN_FRAME_PREFIX});
        w = new String(bArr4, charset).intern();
        byte[] bArr5 = {3, 10, -127, -15, -68, 43, -31, 106, -125};
        b(bArr5, new byte[]{89, -97, -36, -101, -66, 116, 121, 60, -25});
        v = new String(bArr5, charset).intern();
        byte[] bArr6 = {Framer.ENTER_FRAME_PREFIX, -47, 38, -38, -14, 105, Base64.padSymbol, 84, 62, -128, -56};
        b(bArr6, new byte[]{Utf8.REPLACEMENT_BYTE, -32, 60, -46, -125, 60, 57, Framer.STDERR_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX, -23, -92});
        u = new String(bArr6, charset).intern();
        byte[] bArr7 = {90, -119, 96, -46, 113, 122};
        b(bArr7, new byte[]{34, 17, -16, -55, Ascii.SUB, 9, -47, 79});
        t = new String(bArr7, charset).intern();
        byte[] bArr8 = {-5, -50, -126, 17, Ascii.FS, -13, 98};
        b(bArr8, new byte[]{-125, -18, -36, 113, 114, -107, Ascii.CR, -117});
        s = new String(bArr8, charset).intern();
        byte[] bArr9 = {87, 107, -80, -65, -17, 17, -90, 90, Ascii.US, 96, 54};
        b(bArr9, new byte[]{Ascii.FS, 62, -80, -17, 117, -92, -33, 71, 126, Ascii.DC4, 83});
        r = new String(bArr9, charset).intern();
    }

    public e4(f2 f2Var, t1 t1Var, v0 v0Var, String str, boolean z2) {
        super(f2Var, z2);
        this.n = f2Var;
        this.o = t1Var;
        this.p = v0Var;
        this.q = str;
    }

    @Override // com.aheaditec.talsec.security.k0
    public JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        byte[] bArr = {79, -65, -89, 48, 62, 123, 103};
        b(bArr, new byte[]{Ascii.ETB, -1, -63, -110, 80, Ascii.GS, 8, -39});
        Charset charset = StandardCharsets.UTF_8;
        jSONObjectA.put(new String(bArr, charset).intern(), f0.a(this.n));
        byte[] bArr2 = {-110, -122, 19, 74, -100, 42, 96, Ascii.FS, 32, -82, -49};
        b(bArr2, new byte[]{-33, 19, 80, 60, -24, 127, Ascii.GS, -127, 65, -38, -86});
        jSONObjectA.put(new String(bArr2, charset).intern(), s1.a(this.o));
        byte[] bArr3 = {-124, 106, 109, 115, 39, 60};
        b(bArr3, new byte[]{-48, Framer.STDERR_FRAME_PREFIX, -14, 40, 76, 79, Ascii.DC4, 109});
        jSONObjectA.put(new String(bArr3, charset).intern(), this.p.a());
        byte[] bArr4 = {-114, 17, Ascii.GS, 39, -11, Ascii.SI, 126, 51, 51};
        b(bArr4, new byte[]{-26, -92, 88, 109, -123, -112, -6, -110, 87});
        jSONObjectA.put(new String(bArr4, charset).intern(), this.n.f());
        byte[] bArr5 = {42, -1, -1, -19, -6, 122, 46, -79, -91, -48, 102};
        b(bArr5, new byte[]{66, -53, 126, -42, 127, 75, 68, -16, -54, -94, Ascii.VT});
        String strIntern = new String(bArr5, charset).intern();
        byte[] bArr6 = {58, -17, 75, -109, -56, -128};
        b(bArr6, new byte[]{93, -66, 41, 19, -66, -27, -56, Framer.STDIN_FRAME_PREFIX});
        jSONObjectA.put(strIntern, new String(bArr6, charset).intern());
        byte[] bArr7 = {-93, -34, 71, -16, 66, 8, 86, 40, Ascii.NAK, SignedBytes.MAX_POWER_OF_TWO, -110, -67, 121};
        b(bArr7, new byte[]{-71, -22, Ascii.SYN, -46, Ascii.SI, -99, 34, 117, 101, 86, -27, -15, Ascii.VT});
        jSONObjectA.put(new String(bArr7, charset).intern(), this.n.a().f());
        byte[] bArr8 = {Ascii.VT, -127, -86, 41, -35, -124, -77, -126, 81, -45, 89};
        b(bArr8, new byte[]{101, Ascii.DLE, -55, 99, -98, 17, -84, -24, 48, -70, 53});
        jSONObjectA.put(new String(bArr8, charset).intern(), this.n.b());
        return jSONObjectA;
    }

    public String b() {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = {-116, -67, 81, 43, -5, 32, -85, -95, -67, 51, 127, -94, -12, Ascii.FS, 59, -99};
        b(bArr, new byte[]{-56, 41, 5, Ascii.US, -101, 116, -72, -24, -78, -118, 3, -28, 122, -98, -21, -43});
        return sb.append(new String(bArr, StandardCharsets.UTF_8).intern()).append(this.n.a().f()).toString();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003a. Please report as an issue. */
    public static void b(byte[] bArr, byte[] bArr2) {
        int i;
        byte[] bArr3 = null;
        int length = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1180709023;
        byte[] bArr4 = null;
        while (true) {
            int i5 = ((i4 & 16777216) * (i4 | 16777216)) + ((i4 & (-16777217)) * ((~i4) & 16777216));
            int i6 = i4 >>> 8;
            int iA = l0.a(i6, i5, 1, ((-1) - i6) | ((-1) - i5));
            int i7 = (iA ^ (-201803027)) + ((iA & (-201803027)) * 2);
            switch ((i7 - 814310662) - ((i7 & (-814310662)) * 2)) {
                case -2000520841:
                    int length2 = bArr4.length;
                    int i8 = 0 - (0 - length);
                    boolean z2 = (((double) ((byte) bArr3[((length2 & (~i8)) * 2) - (length2 ^ i8)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length2 & (~i8)) * 2) - (length2 ^ i8)])) == Double.NaN ? 0 : -1)) > -1;
                    i4 = z2 ? z2 ? 1565752577 : 1621215041 : -1164716566;
                    i3 = length;
                    break;
                case -870579640:
                    int i9 = (i2 - 1) - (i2 | (-4));
                    byte b = bArr3[i9];
                    int i10 = ((b & 16777216) * (b | 16777216)) + ((b & (-16777217)) * ((~b) & 16777216));
                    int i11 = i2 + 3 + (((-1) - i2) | (-3));
                    int i12 = bArr3[i11] & 255;
                    int i13 = i12 * ((~i12) & 65536);
                    int i14 = ~((i10 | ((~i13) | (-1268032266))) - ((i13 & (-1268032266)) | i10));
                    int iA2 = m0.a((-132004404) & i2, i2, 1, (-132004403) & i2);
                    int i15 = bArr3[iA2] & 255;
                    int i16 = i15 * ((~i15) & 256);
                    int i17 = (i16 + i14) - (i16 & i14);
                    int i18 = bArr3[i2] & 255;
                    int i19 = (i17 & (~i18)) + i18;
                    byte b2 = bArr4[i9];
                    int i20 = ((b2 & 16777216) * (b2 | 16777216)) + ((b2 & (-16777217)) * ((~b2) & 16777216));
                    int i21 = bArr4[i11] & 255;
                    int i22 = i21 * ((~i21) & 65536);
                    int i23 = ~((i20 | ((~i22) | (-1355861741))) - ((i22 & (-1355861741)) | i20));
                    int i24 = bArr4[iA2] & 255;
                    int i25 = i24 * ((~i24) & 256);
                    int iA3 = l0.a(i25, i23, 1, ((-1) - i25) | ((-1) - i23));
                    int i26 = (iA3 - 1) - ((~(bArr4[i2] & 255)) | iA3);
                    int i27 = i19 << ((i19 > Double.NaN ? 1 : (i19 == Double.NaN ? 0 : -1)) >>> 31);
                    int i28 = (i27 ^ (-418000873)) + ((i27 & (-418000873)) * 2);
                    int i29 = (i28 + i26) - ((i28 & i26) * 2);
                    bArr4[i2] = (byte) i29;
                    bArr4[iA2] = (byte) (i29 >>> 8);
                    bArr4[i11] = (byte) (i29 >>> 16);
                    bArr4[i9] = (byte) (i29 >>> 24);
                    i2 = (i2 ^ 4) + ((i2 & 4) * 2);
                    int length3 = bArr4.length;
                    int iA4 = w1.a(bArr4.length, 4, 0, 0);
                    i4 = (((((long) i2) > ((long) (((length3 & (~iA4)) * 2) - (length3 ^ iA4))) ? 1 : (((long) i2) == ((long) (((length3 & (~iA4)) * 2) - (length3 ^ iA4))) ? 0 : -1)) >>> 31) & 1) != 0 ? 1910359311 : 1621215041;
                    break;
                case -97532338:
                    length = bArr4.length % 4;
                    int i30 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i = i30 != 0 ? 986083301 : 1621215041;
                    i4 = i30 == 0 ? -1138188205 : i;
                    break;
                case 298177592:
                    int length4 = bArr4.length;
                    int i31 = 0 - i3;
                    int iA5 = n0.a(0, (length4 & 2) | p0.a(i31, -4, 1, length4), i31 * 3, 1);
                    byte b3 = bArr3[iA5];
                    int length5 = bArr4.length;
                    int i32 = 0 - i31;
                    int i33 = i32 | length5;
                    byte b4 = bArr3[q0.a(i32, 2, i33, (length5 ^ i32) ^ i33)];
                    bArr3[iA5] = (byte) (((byte) (b4 ^ b3)) + ((byte) (((byte) 2) * ((byte) (b4 & b3)))));
                    i4 = 1565752577;
                    break;
                case 373627814:
                    break;
                case 975213712:
                    int length6 = bArr4.length;
                    int i34 = 0 - i3;
                    int length7 = bArr4.length;
                    int i35 = ~i34;
                    byte b5 = bArr4[((length7 | i34) - (((-656070458) & i35) & length7)) + (((-656070458) | i34) & length7)];
                    int length8 = bArr4.length;
                    byte b6 = bArr3[(length8 ^ i35) + ((length8 | i34) * 2) + 1];
                    bArr4[((length6 | i34) * 2) - (length6 ^ i34)] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
                    length = (~i3) + (i3 * 2);
                    int i36 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                    i = i36 != 0 ? 986083301 : 1621215041;
                    if (i36 == 0) {
                    }
                    break;
                case 1548321255:
                    int length9 = bArr.length;
                    int length10 = 0 - (0 - (bArr.length % 4));
                    i4 = (length9 & (~length10)) - ((~length9) & length10) > 0 ? 1910359311 : 1621215041;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i2 = 0;
                    break;
                default:
                    break;
            }
            return;
        }
    }
}
