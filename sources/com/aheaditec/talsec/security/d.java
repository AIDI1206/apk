package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.io.encoding.Base64;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f230a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;

    static {
        byte[] bArr = {117, -68, -81, -53, -26, -119, -109, -81, -81};
        a(bArr, new byte[]{106, -33, 67, 68, -17, Ascii.DC4, 113, 91, -53});
        Charset charset = StandardCharsets.UTF_8;
        g = new String(bArr, charset).intern();
        byte[] bArr2 = {-34, -11, 48, -121, 52, 8, 79, 12, 17, -56, 114, Ascii.CAN, -125, 114, -90, 62, 0, -11, -65, Ascii.SYN, -30, -6, -37};
        a(bArr2, new byte[]{-15, -106, -64, -125, -67, -106, -76, 47, -39, -63, -127, 8, 73, 1, 108, -56, -46, -121, 127, Ascii.CAN, -113, -97, -88});
        f = new String(bArr2, charset).intern();
        byte[] bArr3 = {108, 44, Ascii.FS, 0, -64, -83, 73};
        a(bArr3, new byte[]{99, 111, -20, 8, -91, -50, Base64.padSymbol, 101});
        e = new String(bArr3, charset).intern();
        byte[] bArr4 = {-29, 99, 90, -76, 9, -11};
        a(bArr4, new byte[]{-12, 52, -66, 127, 104, -103, -89, 1});
        d = new String(bArr4, charset).intern();
        byte[] bArr5 = {-32, -125, 96, 121, Framer.STDIN_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 60, -15};
        a(bArr5, new byte[]{-19, 2, -95, -82, -76, 109, -25, 55});
        c = new String(bArr5, charset).intern();
        byte[] bArr6 = {-70, -76, -17, -8, 107, -17, 6, 19, -75, Ascii.FS, -27, -81, -10, -70, Framer.ENTER_FRAME_PREFIX, 107, -110, -3, SignedBytes.MAX_POWER_OF_TWO, -106, 112, -23};
        a(bArr6, new byte[]{55, -47, Ascii.DC2, 46, 106, -81, 57, Ascii.EM, Framer.STDIN_FRAME_PREFIX, 111, 37, 124, -5, -36, -6, -69, 83, -91, -45, -107, Ascii.NAK, -102});
        b = new String(bArr6, charset).intern();
        byte[] bArr7 = {-71, -55, 38, 19, 96, -80};
        a(bArr7, new byte[]{52, -60, -21, 0, 5, -62, -17, -56});
        f230a = new String(bArr7, charset).intern();
    }

    public JSONObject a(X509Certificate x509Certificate) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (x509Certificate.getIssuerDN() != null) {
            byte[] bArr = {-27, -78, Ascii.DLE, Ascii.SI, 38, 77};
            a(bArr, new byte[]{-32, -45, -15, 4, 67, Utf8.REPLACEMENT_BYTE, -120, -100});
            jSONObject.put(new String(bArr, StandardCharsets.UTF_8).intern(), x509Certificate.getIssuerDN().getName());
        }
        byte[] bArr2 = {-32, 102, -89, Ascii.DC2, 74, 84, -57, -4, -118, 81, 104, 113, 42, -120, 40, 47, 108, -32, 17, -80, Ascii.DLE, -78};
        a(bArr2, new byte[]{-19, 39, 106, 0, -117, 51, Framer.EXIT_FRAME_PREFIX, 51, 90, 90, -88, -67, -81, 1, -13, -25, 117, -128, -30, 127, 117, -63});
        Charset charset = StandardCharsets.UTF_8;
        jSONObject.put(new String(bArr2, charset).intern(), b(x509Certificate));
        byte[] bArr3 = {Ascii.VT, -64, 57, 2, 91, -92, -51, -31};
        a(bArr3, new byte[]{-58, -34, -40, 17, -102, -29, 118, 32});
        jSONObject.put(new String(bArr3, charset).intern(), a(x509Certificate.getIssuerUniqueID()));
        byte[] bArr4 = {110, -45, Ascii.GS, Framer.EXIT_FRAME_PREFIX, 98, -43};
        a(bArr4, new byte[]{97, -92, -3, -77, 3, -71, 71, -35});
        jSONObject.put(new String(bArr4, charset).intern(), x509Certificate.getSerialNumber());
        if (x509Certificate.getSubjectDN() != null) {
            byte[] bArr5 = {Framer.EXIT_FRAME_PREFIX, 55, -94, 8, 77, -11, -20};
            a(bArr5, new byte[]{111, 80, 118, 1, 40, -106, -104, -72});
            jSONObject.put(new String(bArr5, charset).intern(), x509Certificate.getSubjectDN().getName());
        }
        byte[] bArr6 = {107, -125, 105, 126, -107, -99, -44, 5, -58, 41, 35, Ascii.NAK, 75, 38, 78, -67, Framer.STDERR_FRAME_PREFIX, -90, -83, -22, -92, -86, 90};
        a(bArr6, new byte[]{124, 4, -71, -118, 92, -24, Framer.STDERR_FRAME_PREFIX, 41, 6, 99, -16, 5, -127, 114, -76, 118, -96, -10, 81, 44, -55, -49, 41});
        jSONObject.put(new String(bArr6, charset).intern(), c(x509Certificate));
        byte[] bArr7 = {-32, 5, -44, -113, -116, -38, 126, -58, -54};
        a(bArr7, new byte[]{-9, -122, 39, -104, 85, -85, -124, 97, -82});
        jSONObject.put(new String(bArr7, charset).intern(), a(x509Certificate.getSubjectUniqueID()));
        return jSONObject;
    }

    public final JSONArray b(X509Certificate x509Certificate) {
        try {
            return a(x509Certificate.getIssuerAlternativeNames());
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    public final JSONArray c(X509Certificate x509Certificate) {
        try {
            return a(x509Certificate.getSubjectAlternativeNames());
        } catch (Exception unused) {
            return new JSONArray();
        }
    }

    public final JSONArray a(Collection<List<?>> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            Iterator<List<?>> it = collection.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toString());
            }
        }
        return jSONArray;
    }

    public final String a(boolean[] zArr) {
        String str;
        if (zArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (boolean z : zArr) {
            if (z) {
                byte[] bArr = {79};
                a(bArr, new byte[]{126, -23, -42, -64, 0, -110, 78, -11});
                str = new String(bArr, StandardCharsets.UTF_8);
            } else {
                byte[] bArr2 = {41};
                a(bArr2, new byte[]{Ascii.EM, -71, 39, 68, -82, -52, -4, -60});
                str = new String(bArr2, StandardCharsets.UTF_8);
            }
            sb.append(str.intern());
        }
        return sb.toString();
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
