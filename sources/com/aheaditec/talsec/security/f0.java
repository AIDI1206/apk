package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f235a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;

    static {
        byte[] bArr = {-103, 6, -117, -119, -86, -98, 7, -4, 7, -113};
        a(bArr, new byte[]{-100, 88, 105, Framer.STDOUT_FRAME_PREFIX, -93, -2, -30, 55, 104, -31});
        Charset charset = StandardCharsets.UTF_8;
        e = new String(bArr, charset).intern();
        byte[] bArr2 = {68, -124, -25, 86, 119, -110, -78, -80, -107, -46, -104, -27, -59, -87, -126, Ascii.GS, -103, 81};
        a(bArr2, new byte[]{73, -40, 2, -128, 114, -56, 108, 115, -115, -123, 121, 53, Framer.STDERR_FRAME_PREFIX, -11, 101, -55, -6, 52});
        d = new String(bArr2, charset).intern();
        byte[] bArr3 = {-100, -76, -3, 8, 35, 17, -59, -69, 3, 118, -120, 92, -108, -9, 113, Ascii.DLE, -72, 62, Ascii.SYN, -119, -127};
        a(bArr3, new byte[]{-103, -18, Ascii.ESC, -49, 53, 77, Ascii.SYN, 109, Ascii.SO, Ascii.DC2, Framer.STDIN_REQUEST_FRAME_PREFIX, -7, -99, -105, -105, -70, -67, Framer.STDIN_REQUEST_FRAME_PREFIX, -52, 78, -14});
        c = new String(bArr3, charset).intern();
        byte[] bArr4 = {-71, 12, 117, Framer.STDERR_FRAME_PREFIX, -101, 108, -89, 109};
        a(bArr4, new byte[]{-66, Framer.STDIN_REQUEST_FRAME_PREFIX, -111, -28, 119, 34, 66, -89});
        b = new String(bArr4, charset).intern();
        byte[] bArr5 = {-100, -31, -104, -15, -61, -14, Ascii.EM, -125, 71, 0, Ascii.CAN, -112, Ascii.ESC};
        a(bArr5, new byte[]{-103, -65, 122, 90, -53, -95, -7, 85, 74, 84, -61, 87, 105});
        f235a = new String(bArr5, charset).intern();
    }

    public static JSONObject a(f2 f2Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        byte[] bArr = {98, -27, 43, -93, -64, 101, -50, -127, -83, -33, -64, 77, -57};
        a(bArr, new byte[]{103, -69, -55, 8, -56, 54, 46, 87, -96, -117, Ascii.ESC, -118, -75});
        Charset charset = StandardCharsets.UTF_8;
        jSONObject.put(new String(bArr, charset).intern(), f2Var.a().e());
        String[] strArrA = f2Var.a().a();
        if (strArrA.length >= 1) {
            byte[] bArr2 = {-61, -69, -93, 81, 70, 121, 98, 34};
            a(bArr2, new byte[]{-60, -24, 71, -121, -86, 55, -121, -24});
            jSONObject.put(new String(bArr2, charset).intern(), strArrA[0]);
            if (strArrA.length > 1) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 1; i < strArrA.length; i++) {
                    jSONArray.put(strArrA[i]);
                }
                byte[] bArr3 = {77, -117, -76, Framer.STDIN_REQUEST_FRAME_PREFIX, -40, 114, -34, -21, 74, 36, 93, 119, 3, Ascii.CAN, -45, 44, 41, Ascii.SUB, -14, -32, -122};
                a(bArr3, new byte[]{72, -47, 82, -104, -50, 46, Ascii.CR, Base64.padSymbol, 71, SignedBytes.MAX_POWER_OF_TWO, -118, -46, 10, Framer.EXIT_FRAME_PREFIX, 53, -122, 44, 123, 40, 39, -11});
                jSONObject.put(new String(bArr3, StandardCharsets.UTF_8).intern(), jSONArray);
            }
        }
        String strD = f2Var.a().d();
        if (strD == null) {
            strD = "";
        }
        byte[] bArr4 = {-125, -108, Ascii.SI, 43, Framer.STDOUT_FRAME_PREFIX, -90, 100, 38, -117, -25};
        a(bArr4, new byte[]{-122, -54, -19, -109, 56, -58, -127, -19, -28, -119});
        Charset charset2 = StandardCharsets.UTF_8;
        jSONObject.put(new String(bArr4, charset2).intern(), strD);
        String strG = f2Var.a().g();
        if (strG == null) {
            byte[] bArr5 = {-20, -73, 3};
            a(bArr5, new byte[]{-115, -45, 97, -40, 72, 35, -118, 104});
            strG = new String(bArr5, charset2).intern();
        }
        byte[] bArr6 = {47, 55, -100, 59, Ascii.FS, -79, 56, -95, -28, 39, 72, 59, -85, -14, -105, -95, 108, 36};
        a(bArr6, new byte[]{34, 107, 121, -19, Ascii.EM, -21, -26, 98, -4, 112, -87, -21, 92, -82, 112, 117, Ascii.SI, 65});
        jSONObject.put(new String(bArr6, charset2).intern(), strG);
        return jSONObject;
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
}
