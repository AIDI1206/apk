package com.aheaditec.talsec.security;

import android.R;
import android.content.Context;
import com.aheaditec.talsec_security.security.api.TalsecConfig;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import io.realm.kotlin.internal.interop.realm_errno_e;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b2 implements a2 {
    public static b2 h;
    public final TalsecConfig c;
    public final c d;
    public final a e;
    public final d f;
    public static final b g = new b(null);
    public static final ReentrantLock i = new ReentrantLock();

    public static final class b {
        public b() {
        }

        public final b2 a(TalsecConfig talsecConfig) {
            byte[] bArr = {76, 62, 91, -54, Ascii.RS, -116};
            a(bArr, new byte[]{-109, 68, -93, 74, 119, -21, -89, Ascii.GS});
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullParameter(talsecConfig, new String(bArr, charset).intern());
            ReentrantLock reentrantLock = b2.i;
            reentrantLock.lock();
            try {
                if (b2.h == null) {
                    b bVar = b2.g;
                    b2.h = new b2(talsecConfig);
                }
                b2 b2Var = b2.h;
                if (b2Var == null) {
                    byte[] bArr2 = {43, -102, 66, -115, -110, 82, 57, Framer.STDERR_FRAME_PREFIX};
                    a(bArr2, new byte[]{-90, -23, -57, -101, 87, 46, -56, -15});
                    Intrinsics.throwUninitializedPropertyAccessException(new String(bArr2, charset).intern());
                    b2Var = null;
                }
                return b2Var;
            } finally {
                reentrantLock.unlock();
            }
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
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
                        int iA2 = com.aheaditec.talsec.security.a.a(i30 | i34, 2, i30, i34);
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

    public final class c implements a2.d {
        public c() {
        }

        @Override // com.aheaditec.talsec.security.a2.d
        public boolean a() {
            return false;
        }

        @Override // com.aheaditec.talsec.security.a2.d
        public boolean b() {
            return false;
        }

        @Override // com.aheaditec.talsec.security.a2.d
        public k2 c() {
            return null;
        }

        @Override // com.aheaditec.talsec.security.a2.d
        public String d() {
            String str;
            if (b2.this.c.isProd()) {
                byte[] bArr = {94, 109, Framer.ENTER_FRAME_PREFIX, -99, -124, -101, -6, -111, 54, 94, -95, -26, 118, -21, -68, 116, 10, 111, -58, -113, -45, 113, -108, 43, -115, 54, -34, -8, -121, Ascii.ESC, 65, 67};
                a(bArr, new byte[]{77, -23, 106, -44, Ascii.SO, 114, -21, -91, 94, -5, -39, 123, 38, -107, -13, -25, 122, -37, -72, -32, -73, 47, Ascii.CR, 44, -9, -23, -65, 123, Ascii.SO, 75, Base64.padSymbol, Ascii.ESC});
                str = new String(bArr, StandardCharsets.UTF_8);
            } else {
                byte[] bArr2 = {Framer.STDOUT_FRAME_PREFIX, -44, -41, 8, Ascii.ETB, -12, 35, -42, -117, 118, -32, -82, -38, -12, 83, 117, 71, -91, -37, 125, -79, -13, Ascii.SI, -40, -50, -91, 86, 42, -128, 0, -45, -8};
                a(bArr2, new byte[]{112, 112, -71, Framer.STDIN_REQUEST_FRAME_PREFIX, 123, -98, 34, -32, 17, -44, -102, -61, -70, -86, 72, -24, 69, -111, -44, -14, -39, -83, -126, -98, -70, 90, 56, Framer.STDIN_FRAME_PREFIX, -5, Framer.STDOUT_FRAME_PREFIX, -53, 118});
                str = new String(bArr2, StandardCharsets.UTF_8);
            }
            return str.intern();
        }

        @Override // com.aheaditec.talsec.security.a2.d
        public String e() {
            return null;
        }

        @Override // com.aheaditec.talsec.security.a2.d
        public boolean f() {
            return true;
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

    public final class d implements a2.f {
        public d() {
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer a() {
            return 1;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer b() {
            return r0.r;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer c() {
            return Integer.valueOf(b2.this.c.isProd() ? 1 : 0);
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer d() {
            return 1;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer e() {
            return r0.u;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer f() {
            if (b2.this.c.isProd()) {
                return r0.z;
            }
            return 0;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer g() {
            if (b2.this.c.isProd()) {
                return r0.v;
            }
            return 0;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer getRoot() {
            return r0.A;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer h() {
            return Integer.valueOf(b2.this.c.isProd() ? 1 : 0);
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer i() {
            if (b2.this.c.isProd()) {
                return r0.H;
            }
            return 0;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer j() {
            return r0.F;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer k() {
            return r0.G;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer l() {
            return r0.y;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer m() {
            return r0.w;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer n() {
            return r0.C;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer o() {
            if (b2.this.c.isProd()) {
                return r0.s;
            }
            return 0;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer p() {
            return r0.x;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer q() {
            return 1;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer r() {
            if (b2.this.c.isProd()) {
                return r0.E;
            }
            return 0;
        }

        @Override // com.aheaditec.talsec.security.a2.f
        public Integer s() {
            return r0.B;
        }
    }

    public b2(TalsecConfig talsecConfig) {
        this.c = talsecConfig;
        this.d = new c();
        this.e = new a();
        this.f = new d();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x00fb. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        int length;
        int i2;
        int length2;
        int i3;
        int i4;
        int length3;
        int i5;
        int iA;
        int i6;
        int i7 = ~"com.aheaditec.talsec.security.b2".length();
        int length4 = (((~((("com.aheaditec.talsec.security.b2".length() | 70245657) | i7) - (i7 | ("com.aheaditec.talsec.security.b2".length() & (-70245658))))) & (-1979440632)) + (("com.aheaditec.talsec.security.b2".length() & 1074528264) | 1093142560)) ^ (-886298072);
        int i8 = -1;
        int iA2 = m1.a(b2.class, -1);
        int length5 = (((iA2 | (-1789924155)) - ((21884101 | iA2) ^ (-1811767295))) + ((("com.aheaditec.talsec.security.b2".length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
        int length6 = ((((~"com.aheaditec.talsec.security.b2".length()) | (-576567005)) & 276971586) + (("com.aheaditec.talsec.security.b2".length() & 36928) | 1073844225)) ^ 1350815811;
        int length7 = ((((~"com.aheaditec.talsec.security.b2".length()) | (-1157759625)) & 1755853004) + (("com.aheaditec.talsec.security.b2".length() & 1073973402) | (-2146202606))) ^ (-390349602);
        int i9 = ((~"com.aheaditec.talsec.security.b2".length()) | (-529537184)) & 457019905;
        int length8 = "com.aheaditec.talsec.security.b2".length();
        int iA3 = (-1686268015) ^ ((((454038545 & length8) ^ (-2143287920)) + (length8 & realm_errno_e.RLM_ERR_SYNC_SERVER_PERMISSIONS_CHANGED)) + i9);
        int length9 = ((((~"com.aheaditec.talsec.security.b2".length()) | (-1064961)) + 689325073) + (("com.aheaditec.talsec.security.b2".length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
        int i10 = ((~"com.aheaditec.talsec.security.b2".length()) | 91711000) & (-1070824876);
        int length10 = "com.aheaditec.talsec.security.b2".length();
        int i11 = (i10 + (9457696 | ((length10 | (-1064779676)) - (length10 ^ (-1064779676))))) ^ 1492981618;
        short[] sArr = null;
        while (true) {
            switch (i11) {
                case -2143294076:
                    int i12 = ~"com.aheaditec.talsec.security.b2".length();
                    if (length4 < length5) {
                        int length11 = ("com.aheaditec.talsec.security.b2".length() & 268439810) | 285217280;
                        int i13 = -((i12 | (-1553600102)) - (((-1553600360) | i12) ^ 536887698));
                        i11 = ((((~i13) & length11) * 2) - (i13 ^ length11)) ^ (-1524017045);
                    } else {
                        length = ((i12 | (-747233512)) & (-1862204400)) + (("com.aheaditec.talsec.security.b2".length() & 1073807362) | 1116733474);
                        i2 = -375509041;
                        i11 = i2 ^ length;
                    }
                    i8 = -1;
                    break;
                case -2038999444:
                    int i14 = ~"com.aheaditec.talsec.security.b2".length();
                    int length12 = (((((("com.aheaditec.talsec.security.b2".length() & (~i14)) & 797295576) + 797295576) + i14) - (("com.aheaditec.talsec.security.b2".length() | i14) & 797295576)) & 161497089) + (("com.aheaditec.talsec.security.b2".length() & (-2145386455)) | (-2147483476));
                    int iA4 = ((short) ((length6 << com.aheaditec.talsec.security.a.a(length12 | (-1985986391), 2, -1985986391, length12)) + sArr[((((~"com.aheaditec.talsec.security.b2".length()) | (-1085986263)) & 1078327440) + (("com.aheaditec.talsec.security.b2".length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (length6 + iA3);
                    int i15 = ~"com.aheaditec.talsec.security.b2".length();
                    int length13 = length6 >>> ((((~((("com.aheaditec.talsec.security.b2".length() | 626856794) | i15) - (("com.aheaditec.talsec.security.b2".length() & (-626856795)) | i15))) & 957405457) + (("com.aheaditec.talsec.security.b2".length() & 588787984) | 36185216)) ^ 993590676);
                    short s = sArr[((((~"com.aheaditec.talsec.security.b2".length()) | 1248713193) & 826417528) + (("com.aheaditec.talsec.security.b2".length() & 822288912) | (-2138488320))) ^ (-1312070789)];
                    int i16 = -length13;
                    int i17 = i16 | s;
                    int i18 = (i17 - (i16 * 2)) + ((i16 ^ s) ^ i17);
                    int i19 = -e3.a(i18 | (~iA4), 2, i18 - iA4, 2);
                    length7 = (short) q0.a(length7, 3, -(p0.a(length7, -4, 1, i19) | (i19 & 2)), 1);
                    int i20 = ((~"com.aheaditec.talsec.security.b2".length()) | (-549847554)) + 1624126210;
                    int length14 = ("com.aheaditec.talsec.security.b2".length() & 549848649) | 67175498;
                    length6 = (short) (length6 - ((((short) ((length7 << (1691301711 ^ ((length14 & i20) + (i20 | length14)))) + sArr[((((~"com.aheaditec.talsec.security.b2".length()) | (-1005965450)) & 153223237) + (("com.aheaditec.talsec.security.b2".length() & 220201009) | 335544368)) ^ 488767605])) ^ (((iA3 | length7) - (("com.aheaditec.talsec.security.b2".length() & (~length7)) & iA3)) + (("com.aheaditec.talsec.security.b2".length() | length7) & iA3))) ^ ((length7 >>> (((((~"com.aheaditec.talsec.security.b2".length()) | (-30261291)) & (-1534000062)) + (("com.aheaditec.talsec.security.b2".length() & 8609814) | 2285588)) ^ (-1531714477))) + sArr[((((~"com.aheaditec.talsec.security.b2".length()) | (-23496740)) & 827084804) + (("com.aheaditec.talsec.security.b2".length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
                    int i21 = ((~"com.aheaditec.talsec.security.b2".length()) | (-412319609)) & (-1959782776);
                    int length15 = ("com.aheaditec.talsec.security.b2".length() & 403838542) | 268582982;
                    int i22 = -i21;
                    int i23 = (((~i22) & length15) * 2) - (i22 ^ length15);
                    iA3 = (short) k1.a(1691170566 & i23, 2, (-1691170567) - i23, iA3);
                    length9++;
                    length = (((~"com.aheaditec.talsec.security.b2".length()) | (-961655275)) & 25184460) + (("com.aheaditec.talsec.security.b2".length() & 150995145) | 140771329);
                    i2 = 1965034008;
                    i11 = i2 ^ length;
                    i8 = -1;
                    break;
                case -1809249287:
                    byte b2 = bArr[(((((~"com.aheaditec.talsec.security.b2".length()) | 1233459797) & 125923146) + (("com.aheaditec.talsec.security.b2".length() & 774137098) | 674496513)) ^ 800419659) + length4];
                    int length16 = ((((~"com.aheaditec.talsec.security.b2".length()) | (-7107622)) & 402932290) + (("com.aheaditec.talsec.security.b2".length() & 546586672) | 546340912)) ^ 949273229;
                    int length17 = (("com.aheaditec.talsec.security.b2".length() | length16) - (b2 | length16)) + m1.a(b2.class, b2) + ("com.aheaditec.talsec.security.b2".length() & length16);
                    int length18 = ((((~"com.aheaditec.talsec.security.b2".length()) | (-81143879)) & 438583424) + (("com.aheaditec.talsec.security.b2".length() & 786435) | 8921603)) ^ 447505026;
                    byte b3 = bArr[((length18 & length4) * 2) + (length18 ^ length4)];
                    int i24 = ~"com.aheaditec.talsec.security.b2".length();
                    length6 = (short) (((b3 & ((-1954201202) ^ (((("com.aheaditec.talsec.security.b2".length() | (-2105278367)) - (i24 | (-1545180443))) + (m1.a(b2.class, 568748773 | i24) + ("com.aheaditec.talsec.security.b2".length() & (-2105278367)))) + (("com.aheaditec.talsec.security.b2".length() & (-2097135360)) | 151077136)))) << (((((~"com.aheaditec.talsec.security.b2".length()) | (-1592082969)) & 140665109) + (("com.aheaditec.talsec.security.b2".length() & 142103568) | 1612800)) ^ 142277917)) | length17);
                    int i25 = ~"com.aheaditec.talsec.security.b2".length();
                    int length19 = (-1901610175) ^ ((((((~i25) & (-569955033)) + i25) | 2038255548) - 2038255548) + (("com.aheaditec.talsec.security.b2".length() & 144806464) | 136645376));
                    int i26 = -length4;
                    int i27 = i26 | length19;
                    byte b4 = bArr[(i27 - (i26 * 2)) + ((length19 ^ i26) ^ i27)];
                    int i28 = ~"com.aheaditec.talsec.security.b2".length();
                    int i29 = (((-199685676) | i28) - 1591672428) - (i28 | (-180811308));
                    int length20 = ("com.aheaditec.talsec.security.b2".length() & 23072776) | 272636008;
                    int length21 = b4 & ((-1319036669) ^ (((length20 | i29) - (("com.aheaditec.talsec.security.b2".length() & (~i29)) & length20)) + (length20 & (i29 | "com.aheaditec.talsec.security.b2".length()))));
                    int i30 = ((~"com.aheaditec.talsec.security.b2".length()) | (-1009031633)) & 545538049;
                    int length22 = ("com.aheaditec.talsec.security.b2".length() & 537143360) | 10560;
                    int length23 = bArr[(545548610 ^ ((length22 & i30) + (i30 | length22))) + length4] & (((((~"com.aheaditec.talsec.security.b2".length()) | 75364313) & 1242301609) + (("com.aheaditec.talsec.security.b2".length() & 1249907040) | (-1602217664))) ^ (-359916266));
                    int length24 = "com.aheaditec.talsec.security.b2".length();
                    length7 = (short) (length21 | (length23 << ((((1779401364 | (((~length24) - length24) + length24)) & 447961710) + (("com.aheaditec.talsec.security.b2".length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
                    int i31 = ~"com.aheaditec.talsec.security.b2".length();
                    iA3 = 758110381 ^ (((((-1343875612) | i31) + 311432716) - (i31 | (-1074391060))) + (("com.aheaditec.talsec.security.b2".length() & 273678921) | (-1069545407)));
                    int i32 = ~"com.aheaditec.talsec.security.b2".length();
                    int length25 = 1409942802 & ((((("com.aheaditec.talsec.security.b2".length() & (~i32)) & 91135407) + 91135407) + i32) - ((i32 | "com.aheaditec.talsec.security.b2".length()) & 91135407));
                    int length26 = ("com.aheaditec.talsec.security.b2".length() & (-804257776)) | (-2094006112);
                    int i33 = -length25;
                    length9 = (-684063310) ^ (((~i33) & length26) - (i33 & (~length26)));
                    length2 = (((~"com.aheaditec.talsec.security.b2".length()) | (-537919489)) - (-806798471)) + (("com.aheaditec.talsec.security.b2".length() & 674768897) | 153626665);
                    i3 = 1174056570 - length2;
                    i4 = -1174056571;
                    i11 = ((length2 & i4) * 2) + i3;
                    break;
                case -1740520186:
                    sArr = new short[((((~"com.aheaditec.talsec.security.b2".length()) | (-382746167)) & 102532165) + (("com.aheaditec.talsec.security.b2".length() & 105907748) | 4198960)) ^ 106731121];
                    length4 = ((((~"com.aheaditec.talsec.security.b2".length()) | (-6036961)) & 1233145505) + (("com.aheaditec.talsec.security.b2".length() & 809508000) | 809603328)) ^ 2042748833;
                    int i34 = ((~"com.aheaditec.talsec.security.b2".length()) | 1688058452) & 872484865;
                    int length27 = "com.aheaditec.talsec.security.b2".length() & 268460041;
                    length3 = ((((("com.aheaditec.talsec.security.b2".length() & (~length27)) & 4218888) + 4218888) + length27) - ((length27 | "com.aheaditec.talsec.security.b2".length()) & 4218888)) + i34;
                    i5 = 434661073;
                    i11 = i5 ^ length3;
                    break;
                case -1489518479:
                    int length28 = "com.aheaditec.talsec.security.b2".length();
                    int length29 = (((-2053077912) & ((516782023 - length28) + (((-((-1) - length28)) - 1) | (-516782024)))) + (("com.aheaditec.talsec.security.b2".length() & (-1054752728)) | 1073823745)) ^ (-979254165);
                    int length30 = bArr2[(((~length4) & length29) * ((~length29) & length4)) + ((length29 & length4) * (length29 | length4))] & (((((~"com.aheaditec.talsec.security.b2".length()) | (-1883938358)) & (-738125179)) + (("com.aheaditec.talsec.security.b2".length() & 1343232517) | 546308360)) ^ (-191816846));
                    int i35 = ~"com.aheaditec.talsec.security.b2".length();
                    int i36 = 73539736 & (((~i35) & (-1772650326)) + i35);
                    int length31 = ("com.aheaditec.talsec.security.b2".length() & 35664144) | 33608448;
                    int i37 = -i36;
                    byte b5 = bArr2[((107148186 ^ ((((~i37) & length31) * 2) - (i37 ^ length31))) * length4) + ((((m1.a(b2.class, i8) | (-532481)) - (-67641369)) + (("com.aheaditec.talsec.security.b2".length() & 532546) | 1602)) ^ 67642971)];
                    int i38 = ~"com.aheaditec.talsec.security.b2".length();
                    int length32 = (b5 & (((663757504 & ((i38 + 1314070430) - (i38 & 1314070430))) + (("com.aheaditec.talsec.security.b2".length() & 834674756) | 272630796)) ^ 936388147)) << ((((m1.a(b2.class, i8) | (-33554434)) - (-1107366402)) + (("com.aheaditec.talsec.security.b2".length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
                    sArr[length4] = (short) ((length32 ^ length30) + (length30 & length32));
                    length4++;
                    iA = ((m1.a(b2.class, i8) | (-167014194)) & 1157999680) + (("com.aheaditec.talsec.security.b2".length() & 159661328) | (-2004872944));
                    i6 = -533943416;
                    i11 = iA ^ i6;
                    break;
                case -473033593:
                    int i39 = -length4;
                    int i40 = -bArr.length;
                    int i41 = i40 | i39;
                    int i42 = (i41 - (i40 * 2)) + ((i40 ^ i39) ^ i41);
                    byte b6 = bArr[bArr.length - length4];
                    int length33 = "com.aheaditec.talsec.security.b2".length();
                    bArr[i42] = (byte) (b6 ^ bArr2[length4 % (((((-878819395) | ((length33 - 1) - (length33 * 2))) & 1490255976) + (("com.aheaditec.talsec.security.b2".length() & 274827331) | 556017667)) ^ 2046273635)]);
                    length4--;
                    int iA5 = (m1.a(b2.class, i8) | 114408723) & 1183666176;
                    int length34 = "com.aheaditec.talsec.security.b2".length() & 1074544770;
                    iA = l0.a(length34, ((-length34) - 1) | (-268567684), 268567684, iA5);
                    i6 = 836032333;
                    i11 = iA ^ i6;
                    break;
                case 766056152:
                    int i43 = ((~"com.aheaditec.talsec.security.b2".length()) | (-889871025)) & 1233748555;
                    int length35 = "com.aheaditec.talsec.security.b2".length();
                    int i44 = (length35 + 84675108) - (length35 | 84675108);
                    if (length4 < (1842188139 ^ ((((~i44) & 608439588) + i44) + i43))) {
                        int i45 = ((~"com.aheaditec.talsec.security.b2".length()) | 1878725846) & 1912684595;
                        int length36 = ("com.aheaditec.talsec.security.b2".length() & 268589089) | 661640;
                        iA = o0.a(i45 | length36, 2, (~i45) ^ length36, 1);
                        i6 = -717449014;
                    } else {
                        iA = (((~"com.aheaditec.talsec.security.b2".length()) | (-1477955618)) & (-1604246503)) + (("com.aheaditec.talsec.security.b2".length() & 1074350177) | 1342720098);
                        i6 = -887872332;
                    }
                    i11 = iA ^ i6;
                    break;
                case 974072829:
                    int length37 = bArr.length;
                    int i46 = ((~"com.aheaditec.talsec.security.b2".length()) | 1711185063) & 170281206;
                    int length38 = ("com.aheaditec.talsec.security.b2".length() & 251684176) | 1694512896;
                    int i47 = -i46;
                    length4 = length37 % (1864794098 ^ (((~i47) & length38) - (i47 & (~length38))));
                    iA = (((~"com.aheaditec.talsec.security.b2".length()) | 991120067) & (-2113137661)) + (("com.aheaditec.talsec.security.b2".length() & (-1878240248)) | 285229064);
                    i6 = -195569723;
                    i11 = iA ^ i6;
                    break;
                case 998066383:
                    length4 = (((m1.a(b2.class, i8) | 314136709) & 371231304) + ((("com.aheaditec.talsec.security.b2".length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
                    length5 = bArr.length - (bArr.length % (((((~"com.aheaditec.talsec.security.b2".length()) | 366661365) & 1344150018) + (("com.aheaditec.talsec.security.b2".length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
                    iA = (((~"com.aheaditec.talsec.security.b2".length()) | (-1359635359)) & 49026131) + (("com.aheaditec.talsec.security.b2".length() & (-1860698094)) | (-1190123008));
                    i6 = 1002689495;
                    i11 = iA ^ i6;
                    break;
                case 1314339506:
                    break;
                case 1734050766:
                    int i48 = ~"com.aheaditec.talsec.security.b2".length();
                    if (length4 <= 0) {
                        int length39 = ("com.aheaditec.talsec.security.b2".length() & R.^attr-private.__removed0) | 553664516;
                        int i49 = -((i48 | 1510858717) & 403833600);
                        length3 = ((~i49) & length39) - (i49 & (~length39));
                        i5 = 2001041846;
                        i11 = i5 ^ length3;
                    } else {
                        int length40 = "com.aheaditec.talsec.security.b2".length();
                        iA = ((i48 | (-268772210)) & 282132586) + (168323072 | ((length40 + 402735200) - (length40 | 402735200)));
                        i6 = -115901203;
                        i11 = iA ^ i6;
                    }
                    break;
                case 1771480224:
                    bArr[(((((~"com.aheaditec.talsec.security.b2".length()) | 1110430873) & 1241612298) + (("com.aheaditec.talsec.security.b2".length() & 150996226) | 84419840)) ^ 1326032138) + length4] = (byte) ((((((~"com.aheaditec.talsec.security.b2".length()) | 1603962366) & 25199440) + ((("com.aheaditec.talsec.security.b2".length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & length6);
                    int length41 = (((((~"com.aheaditec.talsec.security.b2".length()) | (-1388708984)) & 706816128) + (("com.aheaditec.talsec.security.b2".length() & 1124204552) | 1363312648)) ^ 2070128777) + length4;
                    int i50 = ((~"com.aheaditec.talsec.security.b2".length()) | 367288948) & 548745488;
                    int length42 = "com.aheaditec.talsec.security.b2".length();
                    bArr[length41] = (byte) ((length6 >> ((i50 + (((length42 + 558960896) - (length42 | 558960896)) | 21135364)) ^ 569880860)) & (((((~"com.aheaditec.talsec.security.b2".length()) | 2113158628) & 1026558002) + (("com.aheaditec.talsec.security.b2".length() & 8392730) | 8525645)) ^ 1035083648));
                    int length43 = (((~"com.aheaditec.talsec.security.b2".length()) | 715175224) & 136512788) + (("com.aheaditec.talsec.security.b2".length() & 196644) | (-2146430752));
                    int iA6 = l1.a((~length43) | (-2009917962), 2, (-2009917962) - length43, 2, length4);
                    int i51 = ((~"com.aheaditec.talsec.security.b2".length()) | (-1010633609)) & 678986012;
                    int length44 = "com.aheaditec.talsec.security.b2".length();
                    int i52 = ~(((length44 & 951583497) + 276825601) - (length44 & 276824577));
                    int i53 = -i51;
                    bArr[iA6] = (byte) ((j1.a(~i53, i52, 2, (i52 + i53) + 1) ^ 955811810) & length7);
                    int length45 = (((((~"com.aheaditec.talsec.security.b2".length()) | (-1084937228)) & 438503696) + (("com.aheaditec.talsec.security.b2".length() & 69369860) | (-2080078843))) ^ (-1641575146)) + length4;
                    int i54 = ~"com.aheaditec.talsec.security.b2".length();
                    int length46 = length7 >> (2092810490 ^ (((("com.aheaditec.talsec.security.b2".length() | 674349280) - (i54 | 1869872636)) + (m1.a(b2.class, 1197735420 | i54) + ("com.aheaditec.talsec.security.b2".length() & 674349280))) + (("com.aheaditec.talsec.security.b2".length() & 1754529808) | 1418461202)));
                    int i55 = ((~"com.aheaditec.talsec.security.b2".length()) | 1601418652) & 1439188132;
                    int length47 = ("com.aheaditec.talsec.security.b2".length() & 545800290) | (-1442676670);
                    int i56 = -i55;
                    bArr[length45] = (byte) (length46 & ((-3488743) ^ (((~i56) & length47) - (i56 & (~length47)))));
                    length4 += 4;
                    iA = (((~"com.aheaditec.talsec.security.b2".length()) | (-171976913)) & 318775824) + (("com.aheaditec.talsec.security.b2".length() & 33562640) | 136194);
                    i6 = -1824662634;
                    i11 = iA ^ i6;
                    break;
                case 2093236949:
                    if (length9 >= (((((~"com.aheaditec.talsec.security.b2".length()) | (-616910267)) & 1303391760) + (("com.aheaditec.talsec.security.b2".length() & 75500825) | 537198861)) ^ 1840590653)) {
                        int i57 = ~"com.aheaditec.talsec.security.b2".length();
                        iA = (1141965102 & ((-1207265904) + i57 + (((-i57) - 1) | 1207265904))) + (("com.aheaditec.talsec.security.b2".length() & 1292960864) | 150996032);
                        i6 = 612868558;
                        i11 = iA ^ i6;
                    } else {
                        length2 = (((~"com.aheaditec.talsec.security.b2".length()) | 1297715640) & 556926729) + (("com.aheaditec.talsec.security.b2".length() & 874653185) | 335552516);
                        i3 = (-1287294623) - length2;
                        i4 = 1287294622;
                        i11 = ((length2 & i4) * 2) + i3;
                    }
                    break;
                default:
                    int i58 = ~"com.aheaditec.talsec.security.b2".length();
                    int i59 = (((-313266948) | i58) + 45165696) - (i58 | (-269226756));
                    length = q0.a(i59, 3, -p0.a(i59, -4, 1, ("com.aheaditec.talsec.security.b2".length() & 44040224) | (-1811807712)), 1);
                    i2 = -361272203;
                    i11 = i2 ^ length;
                    i8 = -1;
                    break;
            }
            return;
        }
    }

    @Override // com.aheaditec.talsec.security.a2
    public a2.h b() {
        return null;
    }

    @Override // com.aheaditec.talsec.security.a2
    public long c() {
        return 60L;
    }

    @Override // com.aheaditec.talsec.security.a2
    public a2.e d() {
        return null;
    }

    @Override // com.aheaditec.talsec.security.a2
    public a2.b e() {
        return null;
    }

    @Override // com.aheaditec.talsec.security.a2
    public a2.g f() {
        return null;
    }

    @Override // com.aheaditec.talsec.security.a2
    public String g() {
        return null;
    }

    @Override // com.aheaditec.talsec.security.a2
    public a2.a h() {
        return this.e;
    }

    @Override // com.aheaditec.talsec.security.u2
    public String i() {
        return null;
    }

    @Override // com.aheaditec.talsec.security.a2
    public a2.d j() {
        return this.d;
    }

    public final boolean m() {
        return this.c.isProd();
    }

    public final TalsecConfig n() {
        return this.c;
    }

    public final class a implements a2.a {
        public a() {
        }

        @Override // com.aheaditec.talsec.security.a2.a
        public String[] a() {
            String[] expectedSigningCertificateHashes = b2.this.c.getExpectedSigningCertificateHashes();
            byte[] bArr = {51, 39, Framer.STDOUT_FRAME_PREFIX, 69, 90, Ascii.SUB, -79, 110, -95, 69, 118, -14, 17, -48, 93, 101, 62, -10, -71, 4, -43, -33, 92, Framer.EXIT_FRAME_PREFIX, -14, -123, 46, -71, -24, -45, 60, -77, -40, -115, -7, 126, 127, 108, -67, 126};
            a(bArr, new byte[]{-80, 113, -41, -30, -122, 119, 70, -78, Framer.STDOUT_FRAME_PREFIX, 86, -116, 7, -36, -38, -95, -82, -116, -124, 104, 2, Ascii.VT, -71, -89, -68, -1, Ascii.DLE, -63, 111, -23, -119, -49, 102, Ascii.DC4, Ascii.RS, Ascii.CAN, -55, Ascii.CR, 116, 1, -56});
            Intrinsics.checkNotNullExpressionValue(expectedSigningCertificateHashes, new String(bArr, StandardCharsets.UTF_8).intern());
            return expectedSigningCertificateHashes;
        }

        @Override // com.aheaditec.talsec.security.a2.a
        public String[] b() {
            return b2.this.c.getSupportedAlternativeStores();
        }

        @Override // com.aheaditec.talsec.security.a2.a
        public String[] c() {
            return new String[]{b2.this.c.getExpectedPackageName()};
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
                        int iA2 = com.aheaditec.talsec.security.a.a(i30 | i34, 2, i30, i34);
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

    public /* synthetic */ b2(TalsecConfig talsecConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(talsecConfig);
    }

    @Override // com.aheaditec.talsec.security.u2
    public void a(String str, String str2, Context context) {
        byte[] bArr = {Framer.STDIN_FRAME_PREFIX, 41, -5, Ascii.DC2};
        a(bArr, new byte[]{109, -88, -47, -75, 41, -101, Framer.STDOUT_FRAME_PREFIX, 76});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {112, 0, 35, -103, -115, -74, -15};
        a(bArr2, new byte[]{-30, -97, -39, -28, 98, Framer.EXIT_FRAME_PREFIX, -118, -65});
        Intrinsics.checkNotNullParameter(str2, new String(bArr2, charset).intern());
        byte[] bArr3 = {-109, 89, -94, 84, 84, Ascii.SO, -81};
        a(bArr3, new byte[]{Framer.STDIN_FRAME_PREFIX, -37, 118, Framer.STDOUT_FRAME_PREFIX, 17, Ascii.SO, -75, -102});
        Intrinsics.checkNotNullParameter(context, new String(bArr3, charset).intern());
    }

    @Override // com.aheaditec.talsec.security.a2
    public a2.f a() {
        return this.f;
    }
}
