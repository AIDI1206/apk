package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 {
    public static final Integer A;
    public static final Integer B;
    public static final Integer C;
    public static final Integer D;
    public static final Integer E;
    public static final Integer F;
    public static final Integer G;
    public static final Integer H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f279a = false;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final boolean f = true;
    public static final boolean g = true;
    public static final boolean h = true;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 0;
    public static final int l = 3;
    public static final boolean m = false;
    public static final boolean n = false;
    public static final String o;
    public static final String p;
    public static final Integer q;
    public static final Integer r;
    public static final Integer s;
    public static final Integer t;
    public static final Integer u;
    public static final Integer v;
    public static final Integer w;
    public static final Integer x;
    public static final Integer y;
    public static final Integer z;

    static {
        byte[] bArr = {-3, -67, -89, -11, 114, -52};
        a(bArr, new byte[]{-29, 85, -97, -83, 92, -4, 82, 117});
        Charset charset = StandardCharsets.UTF_8;
        p = new String(bArr, charset).intern();
        byte[] bArr2 = {-3, Framer.ENTER_FRAME_PREFIX, -118, -127, -33, -20};
        a(bArr2, new byte[]{-54, Ascii.DLE, Ascii.DC4, -48, -87, -119, -99, Ascii.US});
        o = new String(bArr2, charset).intern();
        byte[] bArr3 = {103, -30, 12, -90};
        a(bArr3, new byte[]{32, 103, 118, -79, -22, -72, 98, 105});
        e = new String(bArr3, charset).intern();
        byte[] bArr4 = {-85, 9, 83, -104, -106};
        a(bArr4, new byte[]{-32, 56, 54, -40, -11, Ascii.DC2, 6, -38});
        d = new String(bArr4, charset).intern();
        byte[] bArr5 = {-27, -111, 93, -62, 93, -58, 71};
        a(bArr5, new byte[]{-82, -60, 71, -114, 60, -75, 34, 72});
        c = new String(bArr5, charset).intern();
        byte[] bArr6 = {93, 78, Framer.STDIN_REQUEST_FRAME_PREFIX, -117, 82, 127, 118, -35, -75, 3, 59, Ascii.SI, -44, -25, -97, 92, 106, Framer.EXIT_FRAME_PREFIX, -40, -104, 124, Ascii.CR, 99, 1, 111, 54, -105, Ascii.DC4, -17};
        a(bArr6, new byte[]{85, -15, 71, -116, 74, -25, 40, -93, -24, 58, 101, 81, -50, -103, 1, 37, Ascii.GS, -37, -46, -30, 58, 78, Ascii.FS, 73, Framer.STDOUT_FRAME_PREFIX, Ascii.DC4, Ascii.DC4, 72, -106});
        b = new String(bArr6, charset).intern();
        q = null;
        r = null;
        s = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
        y = null;
        z = null;
        A = null;
        B = null;
        C = null;
        D = null;
        E = null;
        F = null;
        G = null;
        H = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        boolean z2;
        byte[] bArr3 = null;
        int i2 = 0;
        int i3 = 0;
        int length = 0;
        int i4 = 1516727821;
        byte[] bArr4 = null;
        while (true) {
            int i5 = ((i4 & 16777216) * (i4 | 16777216)) + ((i4 & (-16777217)) * ((~i4) & 16777216));
            int i6 = i4 >>> 8;
            int iA = m0.a(650911840 & (~i5) & i6, i6, i5, (i5 | 650911840) & i6);
            int i7 = (iA ^ 642535957) + ((iA & 642535957) * 2);
            switch (((~i7) + ((i7 | 1) * 2)) ^ 962785775) {
                case -1896910703:
                    int length2 = bArr4.length;
                    int i8 = 0 - i2;
                    int i9 = (length2 ^ i8) + ((length2 & i8) * 2);
                    byte b2 = bArr3[i9];
                    int length3 = bArr4.length;
                    int i10 = 0 - i8;
                    int i11 = i10 | length3;
                    byte b3 = bArr3[q0.a(i10, 2, i11, (length3 ^ i10) ^ i11)];
                    bArr3[i9] = (byte) (((byte) (((byte) 2) * ((byte) (b3 | b2)))) - ((byte) (b3 ^ b2)));
                    i4 = -746753280;
                    break;
                case -1725904394:
                    length = bArr4.length % 4;
                    i4 = (((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1) == 0 ? -365117735 : -458924450;
                    break;
                case -1399959314:
                    int iA2 = m0.a((-1205100636) & i3, i3, 3, (-1205100633) & i3);
                    byte b4 = bArr3[iA2];
                    int i12 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                    int i13 = i3 - 1;
                    int i14 = i13 - (i3 | (-3));
                    int i15 = bArr3[i14] & 255;
                    int i16 = i15 * ((~i15) & 65536);
                    int iA3 = l0.a(i16, i12, 1, ((-1) - i16) | ((-1) - i12));
                    int i17 = i13 - (i3 | (-2));
                    int i18 = bArr3[i17] & 255;
                    int i19 = i18 * ((~i18) & 256);
                    int i20 = (i19 - 1) - ((~iA3) | i19);
                    int i21 = bArr3[i3] & 255;
                    int iA4 = l0.a(i20, i21, 1, ((-1) - i20) | ((-1) - i21));
                    byte b5 = bArr4[iA2];
                    int i22 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
                    int i23 = bArr4[i14] & 255;
                    int i24 = ((i23 * ((~i23) & 65536)) & (~i22)) + i22;
                    int i25 = bArr4[i17] & 255;
                    int i26 = i25 * ((~i25) & 256);
                    int i27 = ~((((~i26) | 911399251) | i24) - ((i26 & 911399251) | i24));
                    int i28 = bArr4[i3] & 255;
                    int i29 = ~((((~i27) | 1433568692) | i28) - ((i27 & 1433568692) | i28));
                    int i30 = iA4 << ((iA4 > Double.NaN ? 1 : (iA4 == Double.NaN ? 0 : -1)) >>> 31);
                    int i31 = (-1254002618) - ((i30 & 2) | ((-1672003491) - i30));
                    int i32 = (i31 + i29) - ((i31 & i29) * 2);
                    bArr4[i3] = (byte) i32;
                    bArr4[i17] = (byte) (i32 >>> 8);
                    bArr4[i14] = (byte) (i32 >>> 16);
                    bArr4[iA2] = (byte) (i32 >>> 24);
                    i3 = (i3 ^ 4) + ((i3 & 4) * 2);
                    int length4 = bArr4.length;
                    int length5 = 0 - (bArr4.length % 4);
                    int i33 = ((i3 > n0.a(0, (length4 & 2) | p0.a(length5, -4, 1, length4), length5 * 3, 1) ? 1 : (i3 == n0.a(0, (length4 & 2) | p0.a(length5, -4, 1, length4), length5 * 3, 1) ? 0 : -1)) >>> 31) & 1;
                    i4 = i33 != 0 ? i33 != 0 ? -1605440657 : -365117735 : -169475207;
                    break;
                case -1135475043:
                    break;
                case 180635757:
                    int length6 = bArr.length;
                    int length7 = 0 - (bArr.length % 4);
                    z2 = ((length6 ^ (~length7)) + ((length6 | length7) * 2)) + 1 > 0;
                    i4 = z2 ? z2 ? -1605440657 : -365117735 : -169475207;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i3 = 0;
                    break;
                case 511524454:
                    int length8 = bArr4.length;
                    int i34 = 0 - i2;
                    int i35 = 0 - i34;
                    int i36 = ((~length8) & i35) * 2;
                    int length9 = bArr4.length;
                    byte b6 = bArr4[((length9 | i34) * 2) - (length9 ^ i34)];
                    int length10 = bArr4.length;
                    byte b7 = bArr3[(i34 ^ length10) + ((length10 & i34) * 2)];
                    bArr4[(length8 ^ i35) - i36] = (byte) (((byte) (b7 - b6)) + ((byte) (((byte) 2) * ((byte) ((~b7) & b6)))));
                    length = o0.a(i2, 3, (~i2) * 2, 1);
                    if ((((i2 > 2 ? 1 : (i2 == 2 ? 0 : -1)) >>> 31) & 1) == 0) {
                    }
                    break;
                case 961838909:
                    int length11 = bArr4.length;
                    int i37 = 0 - length;
                    z2 = (((double) ((byte) bArr3[((length11 | i37) - ((165327505 & (~i37)) & length11)) + ((i37 | 165327505) & length11)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length11 | i37) - ((165327505 & (~i37)) & length11)) + ((i37 | 165327505) & length11)])) == Double.NaN ? 0 : -1)) > -1;
                    i4 = z2 ? -746753280 : z2 ? -365117735 : 1093626513;
                    i2 = length;
                    break;
                default:
                    break;
            }
            return;
        }
    }
}
