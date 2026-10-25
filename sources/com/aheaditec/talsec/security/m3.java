package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264a;
    public final String[] b;

    public m3(String str, String[] strArr) {
        byte[] bArr = {-55, 0, Framer.STDERR_FRAME_PREFIX, 91};
        a(bArr, new byte[]{-66, Framer.STDOUT_FRAME_PREFIX, 117, 37, -23, -32, 71, 126});
        Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
        this.f264a = str;
        this.b = strArr;
    }

    public final String a() {
        return this.f264a;
    }

    public final String[] b() {
        return this.b;
    }

    public final String c() {
        return this.f264a;
    }

    public final String[] d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(m3.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        byte[] bArr = {-75, 73, Ascii.FS, 100, -42, -65, -21, -40, 73, 38, -48, 75, 78, 83, -45, -19, 39, 81, 109, 47, -91, -73, -44, -47, 124, -114, 8, 57, 32, -85, -110, SignedBytes.MAX_POWER_OF_TWO, -64, -53, -78, 98, Ascii.SI, -5, -88, 98, -128, Framer.STDERR_FRAME_PREFIX, 71, 94, 9, Framer.STDERR_FRAME_PREFIX, 100, -36, -48, -113, 19, 114, -96, 114, 9, -22, -104, Framer.EXIT_FRAME_PREFIX, 127, 36, -115, -110, -91, -58, -72, -48, -57, -1, -39, Framer.EXIT_FRAME_PREFIX, 57, -28, -39, 77, 37, 99, 68, -67, -91, 6, Ascii.ETB, -123, -28, 119, -86, -118, 97, -15, -95, -105, -122, -117, -81};
        a(bArr, new byte[]{-14, 12, -122, -17, Ascii.CR, -83, -96, -99, 62, Ascii.EM, -70, 82, 67, 6, 9, 118, 93, -14, 46, -10, -24, -88, 10, -89, 42, -80, 59, 62, 108, -105, Ascii.DC4, 72, -53, -126, -40, -18, 70, 104, -35, -10, -59, 35, 69, 34, 127, 38, 35, -113, -52, -68, 83, -19, -40, -18, -113, 118, Ascii.DC2, -8, Framer.ENTER_FRAME_PREFIX, 40, 5, -72, -19, -106, -29, 121, -1, 115, -45, -21, 97, 125, -57, 9, 114, 52, 56, -96, -26, 81, -115, -63, -95, -20, -101, -86, 41, -123, -24, -62, 10, -25, -42});
        Intrinsics.checkNotNull(obj, new String(bArr, StandardCharsets.UTF_8).intern());
        m3 m3Var = (m3) obj;
        if (!Intrinsics.areEqual(this.f264a, m3Var.f264a)) {
            return false;
        }
        String[] strArr = this.b;
        String[] strArr2 = m3Var.b;
        if (strArr != null) {
            if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                return false;
            }
        } else if (strArr2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int iHashCode = this.f264a.hashCode() * 31;
        String[] strArr = this.b;
        return iHashCode + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public String toString() {
        String str = this.f264a;
        String string = Arrays.toString(this.b);
        byte[] bArr = {91, -68, 112, -104, 102, 48, 114, 89, -89, -71, -104, 81, -26, -94};
        a(bArr, new byte[]{34, -98, 53, -49, Ascii.SUB, Ascii.DC2, Ascii.FS, 7, -90, -89, Ascii.SI, 36, -125, -97});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {-22, -75, 9, Framer.EXIT_FRAME_PREFIX, 105, -26, 94, -128};
        a(bArr2, new byte[]{-35, 101, -107, 0, Ascii.FS, 99, 81, -92});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {87};
        a(bArr3, new byte[]{126, 65, -35, -94, 42, -74, 90, 87});
        return strIntern + str + strIntern2 + string + new String(bArr3, charset).intern();
    }

    public final m3 a(String str, String[] strArr) {
        byte[] bArr = {Ascii.SI, 8, -13, -34};
        a(bArr, new byte[]{Framer.EXIT_FRAME_PREFIX, 57, -76, -94, 99, -101, 10, -106});
        Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
        return new m3(str, strArr);
    }

    public static /* synthetic */ m3 a(m3 m3Var, String str, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = m3Var.f264a;
        }
        if ((i & 2) != 0) {
            strArr = m3Var.b;
        }
        return m3Var.a(str, strArr);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        boolean z;
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        int length = 0;
        int i3 = 1516727821;
        byte[] bArr4 = null;
        while (true) {
            int i4 = ((i3 & 16777216) * (i3 | 16777216)) + ((i3 & (-16777217)) * ((~i3) & 16777216));
            int i5 = i3 >>> 8;
            int iA = m0.a(650911840 & (~i4) & i5, i5, i4, (i4 | 650911840) & i5);
            int i6 = (iA ^ 642535957) + ((iA & 642535957) * 2);
            switch (((~i6) + ((i6 | 1) * 2)) ^ 962785775) {
                case -1896910703:
                    int length2 = bArr4.length;
                    int i7 = 0 - i;
                    int i8 = (length2 ^ i7) + ((length2 & i7) * 2);
                    byte b = bArr3[i8];
                    int length3 = bArr4.length;
                    int i9 = 0 - i7;
                    int i10 = i9 | length3;
                    byte b2 = bArr3[q0.a(i9, 2, i10, (length3 ^ i9) ^ i10)];
                    bArr3[i8] = (byte) (((byte) (((byte) 2) * ((byte) (b2 | b)))) - ((byte) (b2 ^ b)));
                    i3 = -746753280;
                    break;
                case -1725904394:
                    length = bArr4.length % 4;
                    i3 = (((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1) == 0 ? -365117735 : -458924450;
                    break;
                case -1399959314:
                    int iA2 = m0.a((-1205100636) & i2, i2, 3, (-1205100633) & i2);
                    byte b3 = bArr3[iA2];
                    int i11 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                    int i12 = i2 - 1;
                    int i13 = i12 - (i2 | (-3));
                    int i14 = bArr3[i13] & 255;
                    int i15 = i14 * ((~i14) & 65536);
                    int iA3 = l0.a(i15, i11, 1, ((-1) - i15) | ((-1) - i11));
                    int i16 = i12 - (i2 | (-2));
                    int i17 = bArr3[i16] & 255;
                    int i18 = i17 * ((~i17) & 256);
                    int i19 = (i18 - 1) - ((~iA3) | i18);
                    int i20 = bArr3[i2] & 255;
                    int iA4 = l0.a(i19, i20, 1, ((-1) - i19) | ((-1) - i20));
                    byte b4 = bArr4[iA2];
                    int i21 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                    int i22 = bArr4[i13] & 255;
                    int i23 = ((i22 * ((~i22) & 65536)) & (~i21)) + i21;
                    int i24 = bArr4[i16] & 255;
                    int i25 = i24 * ((~i24) & 256);
                    int i26 = ~((((~i25) | 911399251) | i23) - ((i25 & 911399251) | i23));
                    int i27 = bArr4[i2] & 255;
                    int i28 = ~((((~i26) | 1433568692) | i27) - ((i26 & 1433568692) | i27));
                    int i29 = iA4 << ((iA4 > Double.NaN ? 1 : (iA4 == Double.NaN ? 0 : -1)) >>> 31);
                    int i30 = (-1254002618) - ((i29 & 2) | ((-1672003491) - i29));
                    int i31 = (i30 + i28) - ((i30 & i28) * 2);
                    bArr4[i2] = (byte) i31;
                    bArr4[i16] = (byte) (i31 >>> 8);
                    bArr4[i13] = (byte) (i31 >>> 16);
                    bArr4[iA2] = (byte) (i31 >>> 24);
                    i2 = (i2 ^ 4) + ((i2 & 4) * 2);
                    int length4 = bArr4.length;
                    int length5 = 0 - (bArr4.length % 4);
                    int i32 = ((i2 > n0.a(0, (length4 & 2) | p0.a(length5, -4, 1, length4), length5 * 3, 1) ? 1 : (i2 == n0.a(0, (length4 & 2) | p0.a(length5, -4, 1, length4), length5 * 3, 1) ? 0 : -1)) >>> 31) & 1;
                    i3 = i32 != 0 ? i32 != 0 ? -1605440657 : -365117735 : -169475207;
                    break;
                case -1135475043:
                    break;
                case 180635757:
                    int length6 = bArr.length;
                    int length7 = 0 - (bArr.length % 4);
                    z = ((length6 ^ (~length7)) + ((length6 | length7) * 2)) + 1 > 0;
                    i3 = z ? z ? -1605440657 : -365117735 : -169475207;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i2 = 0;
                    break;
                case 511524454:
                    int length8 = bArr4.length;
                    int i33 = 0 - i;
                    int i34 = 0 - i33;
                    int i35 = ((~length8) & i34) * 2;
                    int length9 = bArr4.length;
                    byte b5 = bArr4[((length9 | i33) * 2) - (length9 ^ i33)];
                    int length10 = bArr4.length;
                    byte b6 = bArr3[(i33 ^ length10) + ((length10 & i33) * 2)];
                    bArr4[(length8 ^ i34) - i35] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
                    length = o0.a(i, 3, (~i) * 2, 1);
                    if ((((i > 2 ? 1 : (i == 2 ? 0 : -1)) >>> 31) & 1) == 0) {
                    }
                    break;
                case 961838909:
                    int length11 = bArr4.length;
                    int i36 = 0 - length;
                    z = (((double) ((byte) bArr3[((length11 | i36) - ((165327505 & (~i36)) & length11)) + ((i36 | 165327505) & length11)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length11 | i36) - ((165327505 & (~i36)) & length11)) + ((i36 | 165327505) & length11)])) == Double.NaN ? 0 : -1)) > -1;
                    i3 = z ? -746753280 : z ? -365117735 : 1093626513;
                    i = length;
                    break;
                default:
                    break;
            }
            return;
        }
    }
}
