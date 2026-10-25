package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l implements f1 {
    public static final a c;
    public static final String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4 f261a;
    public final r4 b;

    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {44, -44, -32, 17, 43, 60, -97, -124, -10, Base64.padSymbol, -25, -81, -9, 58, 17, -98, 41, -25};
        a(bArr, new byte[]{100, -125, -65, 115, 74, Framer.STDIN_REQUEST_FRAME_PREFIX, -12, -31, -110, 98, -116, -54, -114, 73, 101, -15, 91, -126});
        d = new String(bArr, StandardCharsets.UTF_8).intern();
        c = new a(null);
    }

    public l(m4 m4Var, r4 r4Var) {
        byte[] bArr = {-63, -84, Ascii.CR, -102, 43, -42};
        a(bArr, new byte[]{-92, -56, 100, -18, 68, -92, 93, 48});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(m4Var, new String(bArr, charset).intern());
        byte[] bArr2 = {-126, Base64.padSymbol, -10, Ascii.ESC, -10, -105, Framer.STDIN_FRAME_PREFIX, 80};
        a(bArr2, new byte[]{-16, 88, -105, Framer.EXIT_FRAME_PREFIX, -126, -2, 66, 62});
        Intrinsics.checkNotNullParameter(r4Var, new String(bArr2, charset).intern());
        this.f261a = m4Var;
        this.b = r4Var;
    }

    public final void a(boolean z) {
        this.b.a().getClass();
        this.f261a.a(l4.a.j, z);
        if (z) {
            return;
        }
        r4 r4Var = this.b;
        r4Var.a().getClass();
        byte[] bArr = {104, -62, Ascii.DC2, -39, 19, 99, 44, 93, 75, 119, 75, -106, -19, 81, -42, 71, 40, 53};
        a(bArr, new byte[]{32, -107, 77, -69, 114, 0, 71, 56, 47, 40, 32, -13, -108, 34, -94, 40, 90, 80});
        r4Var.a((Integer) 1, new String(bArr, StandardCharsets.UTF_8).intern());
    }

    @Override // com.aheaditec.talsec.security.f1
    public boolean a() {
        return false;
    }

    @Override // com.aheaditec.talsec.security.f1
    public boolean b() {
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        int i = -585497720;
        int i2 = 0;
        int i3 = 0;
        int length = 0;
        byte[] bArr4 = null;
        while (true) {
            int i4 = ((i & 16777216) * (i | 16777216)) + ((i & (-16777217)) * ((~i) & 16777216));
            int i5 = i >>> 8;
            int i6 = ~((((~i5) | (-238348293)) | i4) - ((i5 & (-238348293)) | i4));
            int i7 = (-1081514022) - ((i6 & 2) | ((-10362931) - i6));
            int iA = com.aheaditec.talsec.security.a.a(i7 | (-428181225), 2, i7, -428181225);
            int i8 = -1057239115;
            switch (iA) {
                case -1819084085:
                    int length2 = bArr3.length;
                    int i9 = 0 - i2;
                    int length3 = bArr3.length;
                    int i10 = 0 - i9;
                    byte b = bArr3[(length3 & (~i10)) - ((~length3) & i10)];
                    int length4 = bArr3.length;
                    byte b2 = bArr4[((length4 | i9) - (((-1678010279) & (~i9)) & length4)) + ((i9 | (-1678010279)) & length4)];
                    bArr3[((length2 | i9) * 2) - (length2 ^ i9)] = (byte) (((byte) (((byte) (((byte) 2) * ((byte) (b2 | b)))) - b2)) - b);
                    length = 4 - ((5 - i2) | (i2 & 2));
                    int i11 = ((i2 > 2 ? 1 : (i2 == 2 ? 0 : -1)) >>> 31) & 1;
                    i = i11 != 0 ? 2100390411 : -897645243;
                    if (i11 == 0) {
                    }
                    break;
                case -1350640889:
                    int length5 = bArr.length;
                    int length6 = 0 - (bArr.length % 4);
                    boolean z = ((length5 | length6) - ((942778902 & (~length6)) & length5)) + ((length6 | 942778902) & length5) > 0;
                    i = z ? -1469476344 : z ? -897645243 : 1251644638;
                    bArr4 = bArr2;
                    bArr3 = bArr;
                    i3 = 0;
                    break;
                case -477594107:
                    int length7 = bArr3.length;
                    int i12 = 0 - i2;
                    int i13 = ((length7 | i12) - (((-515406864) & (~i12)) & length7)) + ((i12 | (-515406864)) & length7);
                    byte b3 = bArr4[i13];
                    int length8 = bArr3.length;
                    byte b4 = bArr4[((i12 | length8) * 2) - (length8 ^ i12)];
                    int i14 = ((byte) 0) - b3;
                    int i15 = i14 | b4;
                    bArr4[i13] = (byte) (((byte) (((byte) i15) - ((byte) (((byte) 2) * ((byte) i14))))) + ((byte) ((b4 ^ i14) ^ i15)));
                    break;
                case 769572960:
                    break;
                case 783648904:
                    int i16 = i3 + 4 + (((-1) - i3) | (-4));
                    byte b5 = bArr4[i16];
                    int i17 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
                    int i18 = i3 & 2;
                    int i19 = (i3 + 2) - i18;
                    int i20 = bArr4[i19] & 255;
                    int i21 = i20 * ((~i20) & 65536);
                    int i22 = ~((i17 | ((~i21) | 467314697)) - ((i21 & 467314697) | i17));
                    int i23 = (i3 + 1) - (i3 & 1);
                    int i24 = bArr4[i23] & 255;
                    int i25 = i24 * ((~i24) & 256);
                    int i26 = ~((i22 | ((~i25) | 1328859631)) - ((i25 & 1328859631) | i22));
                    int i27 = bArr4[i3] & 255;
                    int iA2 = l0.a(i26, i27, 1, ((-1) - i26) | ((-1) - i27));
                    byte b6 = bArr3[i16];
                    int i28 = ((b6 & 16777216) * (b6 | 16777216)) + ((b6 & (-16777217)) * ((~b6) & 16777216));
                    int i29 = bArr3[i19] & 255;
                    int i30 = i29 * ((~i29) & 65536);
                    int iA3 = m0.a((~i28) & 1647046022 & i30, i30, i28, (1647046022 | i28) & i30);
                    int i31 = bArr3[i23] & 255;
                    int i32 = i31 * ((~i31) & 256);
                    int i33 = ~((iA3 | ((~i32) | (-2059442874))) - (((-2059442874) & i32) | iA3));
                    int i34 = bArr3[i3] & 255;
                    int iA4 = l0.a(i33, i34, 1, ((-1) - i33) | ((-1) - i34));
                    int i35 = iA2 << ((iA2 > Double.NaN ? 1 : (iA2 == Double.NaN ? 0 : -1)) >>> 31);
                    int i36 = (i35 + iA4) - ((i35 & iA4) * 2);
                    bArr3[i3] = (byte) i36;
                    bArr3[i23] = (byte) (i36 >>> 8);
                    bArr3[i19] = (byte) (i36 >>> 16);
                    bArr3[i16] = (byte) (i36 >>> 24);
                    i3 = (-11) - (((-15) - i3) | i18);
                    int length9 = bArr3.length;
                    int iA5 = w1.a(bArr3.length, 4, 0, 0);
                    int i37 = ((i3 > (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 1 : (i3 == (((length9 & (~iA5)) * 2) - (length9 ^ iA5)) ? 0 : -1)) >>> 31) & 1;
                    i = i37 != 0 ? -897645243 : 1251644638;
                    if (i37 != 0) {
                        i = -1469476344;
                    }
                    break;
                case 1758587480:
                    int length10 = bArr3.length;
                    int i38 = 0 - length;
                    i = (((double) ((byte) bArr4[((length10 | i38) - (((~i38) & 822835569) & length10)) + ((822835569 | i38) & length10)])) > Double.NaN ? 1 : (((double) ((byte) bArr4[((length10 | i38) - (((~i38) & 822835569) & length10)) + ((822835569 | i38) & length10)])) == Double.NaN ? 0 : -1)) > -1 ? -1057239115 : -897645243;
                    i2 = length;
                    break;
                case 2013813686:
                    length = bArr3.length % 4;
                    int i39 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i8 = i39 != 0 ? 2100390411 : -897645243;
                    i = i39 == 0 ? -2079636786 : i8;
                    break;
                default:
                    i = -897645243;
                    break;
            }
            return;
        }
    }
}
