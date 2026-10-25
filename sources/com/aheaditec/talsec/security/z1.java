package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class z1 implements h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f310a;

    public z1(int[] iArr) {
        byte[] bArr = {77, 12, 44, 70, 39, -46, -11, Ascii.ETB, 108, Ascii.DLE, 88, 114, -9, 60, -106, 67, -106, -73, -126, -35, Ascii.VT, -43, -20};
        a(bArr, new byte[]{-105, -100, -4, -36, -66, -51, 2, 46, 117, -115, -67, -67, -11, 77, 65, -56, 89, -52, -112, 90, 101, -95, -97});
        Intrinsics.checkNotNullParameter(iArr, new String(bArr, StandardCharsets.UTF_8).intern());
        this.f310a = iArr;
    }

    @Override // com.aheaditec.talsec.security.h2
    public void a(JSONObject jSONObject) throws JSONException {
        byte[] bArr = {-13, -28, 78, 92};
        a(bArr, new byte[]{-3, -95, -81, -48, 93, Ascii.US, -83, Framer.STDERR_FRAME_PREFIX});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(jSONObject, new String(bArr, charset).intern());
        byte[] bArr2 = {8, 38, -114, -5, -95, 97, -1, -84, -118, 103, 48, 35, -100, Ascii.DC2, -74, Framer.STDIN_FRAME_PREFIX, -100, -101, -60, -95, 54};
        a(bArr2, new byte[]{-60, 114, 115, Ascii.CAN, 32, 46, 5, 122, 92, 48, -10, -32, 51, 116, 65, -2, 39, -51, 87, 112, 87});
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(new String(bArr2, charset).intern());
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        for (int i : this.f310a) {
            jSONArrayOptJSONArray.put(i);
        }
        byte[] bArr3 = {-66, 62, -127, -57, Ascii.CR, 110, -32, 54, -39, -64, -37, 125, -60, -34, 127, 84, -20, 59, -36, 8, -99};
        a(bArr3, new byte[]{10, 77, -128, 111, -44, 58, 38, -20, Ascii.SI, -53, Ascii.EM, -123, Ascii.ESC, -72, -104, -40, -9, 109, 47, Ascii.US, -4});
        jSONObject.put(new String(bArr3, StandardCharsets.UTF_8).intern(), jSONArrayOptJSONArray);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(z1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        byte[] bArr = {66, -19, -98, -12, 99, 108, Base64.padSymbol, -16, -3, 101, -22, -63, -9, 105, 94, 54, -71, Ascii.VT, -58, -7, Ascii.NAK, -39, -59, 41, Ascii.CAN, -80, -83, 53, -35, -47, -105, Ascii.ETB, -109, -42, -30, -109, 127, -17, -103, -112, 78, 44, -121, 99, -31, 17, -124, -62, -110, -22, -41, -6, -34, 10, 74, 7, -69, 54, 55, -20, 116, -88, -34, 58, 121, 114, 97, -8, -19, 115, -85, -95, 86, Ascii.SYN, 89, 69, -42, -7, -51, -69, -28, -56, 67, 35, 110, -107, 88, -19, 70, 82, -40, -41, -80, -76, 19, Ascii.ESC, -62, -81, 58, 86, -50, 41, -25, -45, -38, -19, 19, 81, -80, -3, 118, -92, Base64.padSymbol, 8, -99, -36};
        a(bArr, new byte[]{-120, -81, 124, 59, 39, 57, -50, 60, -49, 60, 40, 4, -7, Framer.STDERR_FRAME_PREFIX, -16, -5, 60, -118, 67, 124, -51, -87, Ascii.ETB, -30, -45, -13, Framer.STDERR_FRAME_PREFIX, -10, -12, -45, 101, 90, 67, -67, 36, -109, 3, -66, 100, -98, -36, Framer.EXIT_FRAME_PREFIX, -111, -96, -28, -101, -100, 80, 83, -69, 103, 41, -29, -108, -56, 12, 60, 123, -38, 43, 123, -29, 34, -12, 105, Ascii.EM, -3, 41, -12, 2, 104, 118, -109, 119, -78, -119, Ascii.SYN, -120, 88, 121, -19, -60, -101, -21, 119, -9, -67, 32, -104, 84, 100, 124, Framer.STDOUT_FRAME_PREFIX, -61, -15, 8, Ascii.DC4, -8, -8, -35, 1, 99, 48, 88, Ascii.EM, -120, -32, -57, Ascii.GS, -123, -117, 111, -123, -112, 96, 75});
        Intrinsics.checkNotNull(obj, new String(bArr, StandardCharsets.UTF_8).intern());
        return Arrays.equals(this.f310a, ((z1) obj).f310a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f310a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0040. Please report as an issue. */
    private static void a(byte[] bArr, byte[] bArr2) {
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
                    byte b = bArr3[i11];
                    int length6 = bArr5.length;
                    byte b2 = bArr3[((i10 | length6) - ((1163302289 & (~i10)) & length6)) + ((i10 | 1163302289) & length6)];
                    bArr3[i11] = (byte) (((byte) (((byte) (b2 ^ (~b))) + ((byte) (((byte) 2) * ((byte) (b2 | b)))))) + ((byte) 1));
                    i = 935800592;
                    bArr4 = bArr3;
                    break;
                case 256719606:
                    int i12 = (i3 - 1) - (i3 | (-4));
                    byte b3 = bArr4[i12];
                    int i13 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
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
                    byte b4 = bArr5[i12];
                    int i24 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
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
                    byte b5 = bArr5[(i38 ^ length10) - (((~length10) & i38) * 2)];
                    int length11 = bArr5.length;
                    byte b6 = bArr4[((i37 | length11) * 2) - (length11 ^ i37)];
                    bArr5[(i39 - i41) + i40] = (byte) (((((byte) (~b6)) + ((byte) (((byte) 2) * ((byte) (b6 | 1))))) ^ b5) ^ 1);
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
