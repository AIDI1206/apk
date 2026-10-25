package com.aheaditec.talsec.security;

import android.content.Context;
import android.util.Base64;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class i1 {
    public static final String b;
    public static final String c;
    public static final String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f245a;

    static {
        byte[] bArr = {-15, 80, -51, Ascii.US, -54, 90, -111, -125, -6, Framer.STDOUT_FRAME_PREFIX, 113, 67, 68, -14, -71, -100, 12, 0, 110, -110, Ascii.ESC, 72, -24};
        a(bArr, new byte[]{-9, 87, 81, -26, 7, 38, 100, -71, -3, 112, -114, -43, -121, -84, 66, -117, -43, -78, -74, -112, 68, 62, -38});
        Charset charset = StandardCharsets.UTF_8;
        d = new String(bArr, charset).intern();
        byte[] bArr2 = {-127, -112, Ascii.CR, 42, -112, 90, 48, 127, -1, -23, -38, -72, 112, -126, -80, 32, -82, Ascii.EM};
        a(bArr2, new byte[]{71, Ascii.ETB, 17, -24, 93, 38, -59, -66, -45, -94, 46, 119, 125, 19, 125, -24, -53, 96});
        c = new String(bArr2, charset).intern();
        byte[] bArr3 = {48, 84, -26, 98, -50, 35, 87, -71, -91, 43, 57, -39, 79, 99, 100, Ascii.DC2, -116, -92};
        a(bArr3, new byte[]{-74, 40, 54, -95, Ascii.ESC, 127, -82, 68, 40, 119, -49, 73, -100, 57, -78, 43, -27, -64});
        b = new String(bArr3, charset).intern();
    }

    public i1(Context context) {
        this.f245a = new d2(context);
    }

    public boolean a() {
        d2 d2Var = this.f245a;
        byte[] bArr = {2, Framer.STDIN_FRAME_PREFIX, -62, -116, 9, -100, -38, -38, 101, -17, 4, -51, -11, 44, 74, 94, -6, -21};
        a(bArr, new byte[]{-60, 115, 90, -117, -60, -25, 43, 98, 104, -77, Ascii.DC2, 93, -10, 115, -40, -97, -109, -113});
        return d2Var.b(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public boolean b() {
        d2 d2Var = this.f245a;
        byte[] bArr = {58, 116, 76, Ascii.SI, 77, 68, 53, 12, Ascii.SI, 37, 98, -41, Ascii.SI, 82, -58, 84, -110, 97, -36, -68, -115, -59, -59};
        a(bArr, new byte[]{-68, 8, -48, Ascii.NAK, -104, Framer.STDIN_REQUEST_FRAME_PREFIX, -64, Framer.STDOUT_FRAME_PREFIX, -48, 125, -71, 73, -36, 76, 81, -61, 83, Ascii.DLE, 39, 123, -46, -77, -9});
        return d2Var.b(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public String c() {
        d2 d2Var = this.f245a;
        byte[] bArr = {-28, -58, 87, 114, -68, 46, 41, 106, 78, -92, 123, 37, -6, 108, -94, 70, -100, Framer.STDIN_FRAME_PREFIX};
        a(bArr, new byte[]{-22, -35, -89, -80, 9, 114, -4, -109, -109, -1, -119, -11, -15, 51, 112, -10, -11, 73});
        Charset charset = StandardCharsets.UTF_8;
        if (!d2Var.b(new String(bArr, charset).intern())) {
            return null;
        }
        d2 d2Var2 = this.f245a;
        byte[] bArr2 = {71, -100, -50, -114, -36, 82, -99, -67, -7, -2, 10, 60, -126, -20, -78, 78, -98, -25};
        a(bArr2, new byte[]{-119, -32, 46, -107, -23, 46, 104, 127, -4, -126, Ascii.CAN, -20, 73, -77, SignedBytes.MAX_POWER_OF_TWO, -18, -9, -125});
        return d2Var2.a(new String(bArr2, charset).intern());
    }

    public String d() {
        d2 d2Var = this.f245a;
        byte[] bArr = {-44, -109, -67, -67, 75, -73, -16, Ascii.NAK, -128, Ascii.RS, -106, 106, 98, 76, 6, -10, -61, -5, 41, Ascii.RS, 42, -115, Ascii.DC4};
        a(bArr, new byte[]{Ascii.SUB, -24, 65, 68, -122, -54, 5, 39, 71, 99, 101, -67, 105, 73, 17, 44, 2, -74, -14, -28, 117, -5, 38});
        Charset charset = StandardCharsets.UTF_8;
        if (!d2Var.b(new String(bArr, charset).intern())) {
            return null;
        }
        d2 d2Var2 = this.f245a;
        byte[] bArr2 = {91, -93, -103, -71, 71, 66, -64, 111, -21, 10, -43, -105, Ascii.VT, 39, -127, -26, -87, 101, 89, 37, 55, -74, 4};
        a(bArr2, new byte[]{-99, -7, 101, Framer.EXIT_FRAME_PREFIX, -126, 65, 85, -115, -20, -105, 43, -118, -64, 103, -102, 60, 40, 12, -94, -29, 104, -64, 54});
        return d2Var2.a(new String(bArr2, charset).intern());
    }

    public PublicKey e() {
        d2 d2Var = this.f245a;
        byte[] bArr = {77, -76, 103, -63, 100, 84, -3, -71, 9, 57, 122, 60, 65, -71, 112, -96, -22, 105};
        a(bArr, new byte[]{-109, -56, -73, 71, 97, 44, 8, 67, -35, 83, -114, -14, -116, -59, -67, 105, -113, Ascii.DLE});
        Charset charset = StandardCharsets.UTF_8;
        if (!d2Var.b(new String(bArr, charset).intern())) {
            return null;
        }
        d2 d2Var2 = this.f245a;
        byte[] bArr2 = {-20, 38, -96, -81, 7, 47, 113, -13, -99, -89, -11, -13, -21, 115, 118, 127, -72, -2};
        a(bArr2, new byte[]{-14, 125, 124, 118, -62, 114, -124, 10, Framer.STDOUT_FRAME_PREFIX, -32, 5, 58, -26, 2, -73, -118, -35, -121});
        byte[] bArrDecode = Base64.decode(d2Var2.a(new String(bArr2, charset).intern()), 2);
        try {
            byte[] bArr3 = {-102, 9, Ascii.US};
            a(bArr3, new byte[]{-56, 90, 94, -14, -47, -118, 102, 74});
            return KeyFactory.getInstance(new String(bArr3, charset).intern()).generatePublic(new X509EncodedKeySpec(bArrDecode));
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(String str) {
        d2 d2Var = this.f245a;
        byte[] bArr = {-41, 106, -108, -32, -48, -46, SignedBytes.MAX_POWER_OF_TWO, -23, 100, -25, Framer.STDIN_REQUEST_FRAME_PREFIX, 57, -127, 121, 114, -99, -84, Ascii.DLE};
        a(bArr, new byte[]{Ascii.EM, Framer.STDOUT_FRAME_PREFIX, 104, 39, Ascii.GS, -82, -43, Ascii.DC4, 105, -69, -75, -23, 74, Ascii.SO, -128, -96, -59, 116});
        d2Var.a(new String(bArr, StandardCharsets.UTF_8).intern(), str);
    }

    public void b(String str) {
        d2 d2Var = this.f245a;
        byte[] bArr = {-3, Ascii.ETB, -47, 101, -66, 10, -118, 89, 89, 35, 38, -117, -113, 116, -25, -37, -102, 106, 37, 46, 111, -85, 96};
        a(bArr, new byte[]{-61, 108, Framer.STDIN_FRAME_PREFIX, -84, Ascii.VT, -106, -100, -28, -98, 127, -11, -99, 92, 17, 48, 74, 91, 7, -2, -12, 48, -35, 82});
        d2Var.a(new String(bArr, StandardCharsets.UTF_8).intern(), str);
    }

    public void a(PublicKey publicKey) {
        String strEncodeToString = Base64.encodeToString(publicKey.getEncoded(), 2);
        d2 d2Var = this.f245a;
        byte[] bArr = {-22, 47, 81, -37, -49, -93, 6, -127, -97, 75, 36, 85, -49, 6, -109, -95, 5, -23};
        a(bArr, new byte[]{-20, 116, -83, 89, Ascii.SUB, -1, Ascii.US, -68, 51, 76, -12, -37, Ascii.SUB, -105, 91, 111, 96, -112});
        d2Var.a(new String(bArr, StandardCharsets.UTF_8).intern(), strEncodeToString);
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
