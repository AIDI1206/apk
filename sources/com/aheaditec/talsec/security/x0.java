package com.aheaditec.talsec.security;

import android.content.pm.PackageInfo;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageInfo f302a;
    public final Set<d3> b;
    public Set<String> c;
    public j3 d;
    public String e;
    public final String f;
    public final Integer g;

    public x0(PackageInfo packageInfo, Set<d3> set, Set<String> set2, j3 j3Var, String str, String str2, Integer num) {
        byte[] bArr = {Framer.STDIN_FRAME_PREFIX, 55, 48, -28, 6, Ascii.DLE, Framer.EXIT_FRAME_PREFIX, Ascii.FS, 7, -26, 116};
        a(bArr, new byte[]{116, 38, 105, 118, 126, 71, 51, 60, 105, -128, Ascii.ESC});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(packageInfo, new String(bArr, charset).intern());
        byte[] bArr2 = {-35, -13, -5, -33, -113, 66, -47};
        a(bArr2, new byte[]{-58, 102, -80, -109, -32, 44, -94, 112});
        Intrinsics.checkNotNullParameter(set, new String(bArr2, charset).intern());
        this.f302a = packageInfo;
        this.b = set;
        this.c = set2;
        this.d = j3Var;
        this.e = str;
        this.f = str2;
        this.g = num;
    }

    public final PackageInfo a() {
        return this.f302a;
    }

    public final Set<d3> b() {
        return this.b;
    }

    public final Set<String> c() {
        return this.c;
    }

    public final j3 d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return Intrinsics.areEqual(this.f302a, x0Var.f302a) && Intrinsics.areEqual(this.b, x0Var.b) && Intrinsics.areEqual(this.c, x0Var.c) && Intrinsics.areEqual(this.d, x0Var.d) && Intrinsics.areEqual(this.e, x0Var.e) && Intrinsics.areEqual(this.f, x0Var.f) && Intrinsics.areEqual(this.g, x0Var.g);
    }

    public final String f() {
        return this.f;
    }

    public final Integer g() {
        return this.g;
    }

    public final String h() {
        return this.f;
    }

    public int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f302a.hashCode() * 31)) * 31;
        Set<String> set = this.c;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        j3 j3Var = this.d;
        int iHashCode3 = (iHashCode2 + (j3Var == null ? 0 : j3Var.hashCode())) * 31;
        String str = this.e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final Integer i() {
        return this.g;
    }

    public final String j() {
        return this.e;
    }

    public final j3 k() {
        return this.d;
    }

    public final PackageInfo l() {
        return this.f302a;
    }

    public final Set<d3> m() {
        return this.b;
    }

    public final Set<String> n() {
        return this.c;
    }

    public String toString() {
        PackageInfo packageInfo = this.f302a;
        Set<d3> set = this.b;
        Set<String> set2 = this.c;
        j3 j3Var = this.d;
        String str = this.e;
        String str2 = this.f;
        Integer num = this.g;
        byte[] bArr = {116, 58, -69, -8, -40, -45, -106, 121, 88, -2, -44, Ascii.SYN, 116, 113, -103, -64, -69, 124, 65, -128, Ascii.CAN, -81, 74, 4, 17, 43};
        a(bArr, new byte[]{78, 38, -16, 114, -62, -118, 6, -8, 84, 106, -85, 77, Ascii.ESC, 41, -1, -120, -17, -25, 53, -50, -108, -74, 58, 73, 126, Ascii.SYN});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {-75, -106, 106, -43, -94, -102, 102, Framer.STDIN_FRAME_PREFIX, -75, -16};
        a(bArr2, new byte[]{-80, -122, 46, -105, -38, -71, Ascii.US, 42, -58, -51});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {87, -8, -7, -92, 108, 54, Ascii.NAK, -6, 86, 12, 80, -117, 41, -108, 84, 105, -71, -40, 102, 76, -79, -50, Ascii.SO, 52};
        a(bArr3, new byte[]{-110, -88, -96, -72, 54, Ascii.SYN, -110, -128, 86, 51, 59, -33, -112, -63, 60, -21, -25, 123, 43, 12, -11, 112, -109, -16});
        String strIntern3 = new String(bArr3, charset).intern();
        byte[] bArr4 = {54, 34, Ascii.CR, -19, -110, 90, -76, 83, Utf8.REPLACEMENT_BYTE, -2, -109, 111, Ascii.VT, -128, Ascii.SI};
        a(bArr4, new byte[]{Framer.STDOUT_FRAME_PREFIX, -46, 119, 106, Ascii.NAK, 4, -16, Ascii.GS, -125, 90, 8, 3, 126, -13, Framer.STDERR_FRAME_PREFIX});
        String strIntern4 = new String(bArr4, charset).intern();
        byte[] bArr5 = {-82, 62, -113, 10, 121, -67, 81, Ascii.RS, 87, -112, -54, -117, -93, -50, 126, 38, 77, Ascii.SYN, 107, 118, -23};
        a(bArr5, new byte[]{-103, -18, -5, 75, Framer.ENTER_FRAME_PREFIX, -103, 70, 89, 82, -63, -44, -55, -29, 112, 67, 48, 79, 52, Ascii.RS, -6, -44});
        String strIntern5 = new String(bArr5, charset).intern();
        byte[] bArr6 = {68, Ascii.DC2, -44, -112, -73, 89, 19, 59, -32, -47, -106, 112, Ascii.SO, 107, 125, Ascii.DC2};
        a(bArr6, new byte[]{127, 2, -52, -29, -17, 10, -114, 62, -96, 114, -8, Ascii.US, -122, -24, 42, Ascii.SYN});
        String strIntern6 = new String(bArr6, charset).intern();
        byte[] bArr7 = {-17, 58, 89, 40, -80, Ascii.ETB, 62, 79, -107, -91, -32, 106, 9, -60, -92, -62, 105, -78, -48, -127};
        a(bArr7, new byte[]{-38, -22, 80, 43, -10, 68, 107, 10, 19, -89, -86, Framer.ENTER_FRAME_PREFIX, 125, -121, -29, -99, Ascii.ETB, -83, -44, -93});
        String strIntern7 = new String(bArr7, charset).intern();
        byte[] bArr8 = {10};
        a(bArr8, new byte[]{35, 125, 32, -54, -10, -60, -18, -117});
        return strIntern + packageInfo + strIntern2 + set + strIntern3 + set2 + strIntern4 + j3Var + strIntern5 + str + strIntern6 + str2 + strIntern7 + num + new String(bArr8, charset).intern();
    }

    public /* synthetic */ x0(PackageInfo packageInfo, Set set, Set set2, j3 j3Var, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageInfo, set, (i & 4) != 0 ? null : set2, (i & 8) != 0 ? null : j3Var, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : num);
    }

    public final x0 a(PackageInfo packageInfo, Set<d3> set, Set<String> set2, j3 j3Var, String str, String str2, Integer num) {
        byte[] bArr = {-63, -54, -78, -101, -40, 79, -86, -72, 38, 67, Framer.STDERR_FRAME_PREFIX};
        a(bArr, new byte[]{-56, 123, -25, -41, -48, -8, -28, -40, 72, 37, 93});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(packageInfo, new String(bArr, charset).intern());
        byte[] bArr2 = {94, -58, -76, 71, -30, 80, 2};
        a(bArr2, new byte[]{67, 115, -21, Ascii.ESC, -115, 62, 113, 34});
        Intrinsics.checkNotNullParameter(set, new String(bArr2, charset).intern());
        return new x0(packageInfo, set, set2, j3Var, str, str2, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ x0 a(x0 x0Var, PackageInfo packageInfo, Set set, Set set2, j3 j3Var, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            packageInfo = x0Var.f302a;
        }
        if ((i & 2) != 0) {
            set = x0Var.b;
        }
        if ((i & 4) != 0) {
            set2 = x0Var.c;
        }
        if ((i & 8) != 0) {
            j3Var = x0Var.d;
        }
        if ((i & 16) != 0) {
            str = x0Var.e;
        }
        if ((i & 32) != 0) {
            str2 = x0Var.f;
        }
        if ((i & 64) != 0) {
            num = x0Var.g;
        }
        String str3 = str2;
        Integer num2 = num;
        String str4 = str;
        Set set3 = set2;
        return x0Var.a(packageInfo, set, set3, j3Var, str4, str3, num2);
    }

    public final void a(String str) {
        this.e = str;
    }

    public final void a(j3 j3Var) {
        this.d = j3Var;
    }

    public final void a(Set<String> set) {
        this.c = set;
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
