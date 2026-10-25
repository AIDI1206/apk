package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f255a;
    public final String b;
    public final String c;

    public k3(boolean z, String str, String str2) {
        byte[] bArr = {93, -32, -71, -66, -83, 105, 9, -52, Ascii.CR, Ascii.SYN, 87, 65, 98};
        a(bArr, new byte[]{108, -81, 71, 86, 48, 37, Ascii.RS, 111, -63, 106, -100, -47, Ascii.SO});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {-104, 102, 58, 109, -8, Framer.ENTER_FRAME_PREFIX, -106, 6, 96, -79, -65, Framer.STDERR_FRAME_PREFIX, 40, -40, -92, Ascii.ETB, -29, -110, -115, -49, -52, -85, 104};
        a(bArr2, new byte[]{81, 53, -64, -72, -3, 125, 109, 40, 116, -10, 112, -32, -72, -83, 121, 8, -18, -6, -98, 69, -91, -60, 6});
        Intrinsics.checkNotNullParameter(str2, new String(bArr2, charset).intern());
        this.f255a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean a() {
        return this.f255a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return this.f255a == k3Var.f255a && Intrinsics.areEqual(this.b, k3Var.b) && Intrinsics.areEqual(this.c, k3Var.c);
    }

    public final boolean f() {
        return this.f255a;
    }

    public int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f255a) * 31)) * 31);
    }

    public String toString() {
        boolean z = this.f255a;
        String str = this.b;
        String str2 = this.c;
        byte[] bArr = {-110, -47, 97, 19, 112, 59, -34, -121, -88, -100, 66, 39, -7, -18, 37, -4, -8, 10, -80, 57, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, Ascii.CR, -44, -29, 55, -48, -120, -96, -99, 127, 117, 118, 69, Framer.STDOUT_FRAME_PREFIX, 39, 113, 86, Utf8.REPLACEMENT_BYTE, -99, 51};
        a(bArr, new byte[]{121, -47, -65, Ascii.FS, 122, 76, Ascii.GS, -117, 32, -3, -43, -5, -8, -104, -10, 42, -3, -102, SignedBytes.MAX_POWER_OF_TWO, -17, -127, 5, 8, 87, -18, 81, 4, -124, 54, -60, -97, -69, 115, 93, -58, -54, 125, Framer.ENTER_FRAME_PREFIX, -46, -108, Ascii.SO});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {125, 99, -53, 32, 51, -17, -76, -6, -113, 62, -24, Ascii.SUB, -45, -32, -31, 39};
        a(bArr2, new byte[]{Ascii.CR, 113, 80, -30, -69, -85, 71, 47, 86, 109, 42, Ascii.DC4, 34, -68, Utf8.REPLACEMENT_BYTE, -73});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {-38, -11, Ascii.CAN, 126, 73, -114, Ascii.EM, -115, -14, -95, 99, 76, Ascii.US, 72, -99, 19, -84, Framer.STDIN_FRAME_PREFIX, -28, -7, 71, -3, -38, -89, 89, -68};
        a(bArr3, new byte[]{82, -61, -25, -127, -127, 12, -22, -99, -13, -50, -91, -57, -126, SignedBytes.MAX_POWER_OF_TWO, 123, Ascii.RS, Utf8.REPLACEMENT_BYTE, 105, Utf8.REPLACEMENT_BYTE, 38, -118, -98, 37, 101, 55, -127});
        String strIntern3 = new String(bArr3, charset).intern();
        byte[] bArr4 = {-8};
        a(bArr4, new byte[]{-47, -116, -96, 115, 60, -65, -49, -32});
        return strIntern + z + strIntern2 + str + strIntern3 + str2 + new String(bArr4, charset).intern();
    }

    public /* synthetic */ k3(boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, str, str2);
    }

    public final k3 a(boolean z, String str, String str2) {
        byte[] bArr = {-47, 67, -35, -63, -116, -11, 74, Framer.STDERR_FRAME_PREFIX, -71, 32, 116, -73, 44};
        a(bArr, new byte[]{Ascii.CAN, 80, 35, 83, 81, -111, -39, -43, Framer.STDIN_FRAME_PREFIX, 103, -77, 107, SignedBytes.MAX_POWER_OF_TWO});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {32, -66, 32, -107, 58, -66, 96, -31, Ascii.ETB, -83, -67, -100, 79, 76, 125, -66, -123, -103, -38, -34, 100, 19, -3};
        a(bArr2, new byte[]{-87, -54, -2, -128, -65, -39, -73, 2, -53, -13, 110, -118, -121, 81, -128, 82, SignedBytes.MAX_POWER_OF_TWO, -3, Framer.STDIN_FRAME_PREFIX, 53, Ascii.CR, 124, -109});
        Intrinsics.checkNotNullParameter(str2, new String(bArr2, charset).intern());
        return new k3(z, str, str2);
    }

    public static /* synthetic */ k3 a(k3 k3Var, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = k3Var.f255a;
        }
        if ((i & 2) != 0) {
            str = k3Var.b;
        }
        if ((i & 4) != 0) {
            str2 = k3Var.c;
        }
        return k3Var.a(z, str, str2);
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
