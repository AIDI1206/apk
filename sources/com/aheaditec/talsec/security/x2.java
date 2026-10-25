package com.aheaditec.talsec.security;

import com.aheaditec.talsec_security.security.api.SuspiciousAppInfo;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuspiciousAppInfo f303a;
    public final long b;
    public final String c;

    public x2(SuspiciousAppInfo suspiciousAppInfo, long j, String str) {
        byte[] bArr = {Framer.STDIN_FRAME_PREFIX, -125, -88, 81, -34, 127, 105, 126, 92, Utf8.REPLACEMENT_BYTE, 67, 91, 102, 98, 99, 66, -2};
        a(bArr, new byte[]{117, -58, -15, 8, -50, -20, Ascii.NAK, -8, SignedBytes.MAX_POWER_OF_TWO, Ascii.FS, Ascii.CAN, Ascii.DC2, Framer.STDIN_FRAME_PREFIX, -5, 34, Ascii.VT, -111});
        Intrinsics.checkNotNullParameter(suspiciousAppInfo, new String(bArr, StandardCharsets.UTF_8).intern());
        this.f303a = suspiciousAppInfo;
        this.b = j;
        this.c = str;
    }

    public final SuspiciousAppInfo a() {
        return this.f303a;
    }

    public final long b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.c;
    }

    public final long e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return Intrinsics.areEqual(this.f303a, x2Var.f303a) && this.b == x2Var.b && Intrinsics.areEqual(this.c, x2Var.c);
    }

    public final SuspiciousAppInfo f() {
        return this.f303a;
    }

    public int hashCode() {
        int iHashCode = (Long.hashCode(this.b) + (this.f303a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        SuspiciousAppInfo suspiciousAppInfo = this.f303a;
        long j = this.b;
        String str = this.c;
        byte[] bArr = {-41, -29, -95, -28, 42, Ascii.EM, -61, 59, -22, 84, 69, -37, 114, 10, 82, 85, Ascii.CAN, 32, -121, 106, Framer.ENTER_FRAME_PREFIX, Ascii.SUB, -69, 86, -3, 68, 55, 57, 7, -73, -17, 127, 1, 70};
        a(bArr, new byte[]{-79, 82, -29, 122, 98, 59, -68, Framer.STDIN_REQUEST_FRAME_PREFIX, -94, -16, 53, -93, 52, 72, 65, 100, -126, 37, 10, 2, Framer.STDIN_REQUEST_FRAME_PREFIX, 73, -24, 32, -97, 7, -116, 48, -114, -50, -105, 0, 110, 123});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {80, 58, 56, 60, 37, 102, -94, 43, 123, 104, 114, -60, -72, Ascii.FS, 89, -124, 6};
        a(bArr2, new byte[]{-109, -22, 93, 53, 97, -43, -36, Utf8.REPLACEMENT_BYTE, Ascii.US, -47, Framer.STDOUT_FRAME_PREFIX, -118, 3, 70, 74, -56, 59});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {-109, 122, -59, 60, -94, -75, -1, 66, -108, -126, -105, -99, -1, 35, 70, 127, 17, 82, 59, -51, 123};
        a(bArr3, new byte[]{-42, 42, -62, 57, -24, -111, -76, Ascii.NAK, Ascii.SI, -76, -7, -37, -89, Ascii.GS, 43, -9, 123, -16, 109, -113, 70});
        String strIntern3 = new String(bArr3, charset).intern();
        byte[] bArr4 = {-113};
        a(bArr4, new byte[]{-90, 57, Framer.STDOUT_FRAME_PREFIX, 106, -11, -10, Ascii.DC2, 79});
        return strIntern + suspiciousAppInfo + strIntern2 + j + strIntern3 + str + new String(bArr4, charset).intern();
    }

    public final x2 a(SuspiciousAppInfo suspiciousAppInfo, long j, String str) {
        byte[] bArr = {-42, -50, 92, -21, 2, 76, 106, -15, -11, Ascii.US, 9, -42, 43, -9, -96, Framer.EXIT_FRAME_PREFIX, -24};
        a(bArr, new byte[]{-68, -117, 69, -126, -126, -1, Ascii.CAN, -123, -105, 60, 94, -115, 114, -114, -28, 5, -121});
        Intrinsics.checkNotNullParameter(suspiciousAppInfo, new String(bArr, StandardCharsets.UTF_8).intern());
        return new x2(suspiciousAppInfo, j, str);
    }

    public static /* synthetic */ x2 a(x2 x2Var, SuspiciousAppInfo suspiciousAppInfo, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            suspiciousAppInfo = x2Var.f303a;
        }
        if ((i & 2) != 0) {
            j = x2Var.b;
        }
        if ((i & 4) != 0) {
            str = x2Var.c;
        }
        return x2Var.a(suspiciousAppInfo, j, str);
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
