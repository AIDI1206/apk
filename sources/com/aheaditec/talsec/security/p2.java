package com.aheaditec.talsec.security;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import io.realm.kotlin.internal.interop.realm_errno_e;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f271a;
    public final ReentrantLock b;
    public z c;

    public interface a {

        /* JADX INFO: renamed from: com.aheaditec.talsec.security.p2$a$a, reason: collision with other inner class name */
        public static final class C0112a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0112a f272a = new C0112a();

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

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0112a);
            }

            public int hashCode() {
                return 2096247911;
            }

            public String toString() {
                byte[] bArr = {SignedBytes.MAX_POWER_OF_TWO, 76, 38, -116, 82};
                a(bArr, new byte[]{5, 62, 84, -29, 32, 3, Ascii.DLE, -127});
                return new String(bArr, StandardCharsets.UTF_8).intern();
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f273a = new b();

            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
            public static void a(byte[] bArr, byte[] bArr2) {
                byte[] bArr3 = null;
                int i = 0;
                int i2 = 0;
                int length = 0;
                int i3 = -894652659;
                byte[] bArr4 = null;
                while (true) {
                    int i4 = ((i3 & 16777216) * (i3 | 16777216)) + ((i3 & (-16777217)) * ((~i3) & 16777216));
                    int i5 = i3 >>> 8;
                    int i6 = (i5 + i4) - (i5 & i4);
                    int i7 = (i6 ^ 1458005263) + ((i6 & 1458005263) * 2);
                    int i8 = -34715366;
                    switch ((i7 - 1434379843) + (((~i7) & 1434379843) * 2)) {
                        case -1970406716:
                            int length2 = bArr4.length;
                            int i9 = 0 - i;
                            int i10 = ~i9;
                            int i11 = ((length2 | i9) - ((602749225 & i10) & length2)) + ((i9 | 602749225) & length2);
                            byte b = bArr3[i11];
                            int length3 = bArr4.length;
                            byte b2 = bArr3[(length3 ^ i10) + ((i9 | length3) * 2) + 1];
                            int i12 = ((byte) 0) - b;
                            bArr3[i11] = (byte) (((byte) (((byte) 2) * ((byte) (b2 & (~i12))))) - ((byte) (b2 ^ i12)));
                            break;
                        case -1882653318:
                            int i13 = (i2 - 1) - (i2 | (-4));
                            byte b3 = bArr3[i13];
                            int i14 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                            int i15 = i2 + 3 + (((-1) - i2) | (-3));
                            int i16 = bArr3[i15] & 255;
                            int i17 = i16 * ((~i16) & 65536);
                            int i18 = ~((i14 | (1169991170 | (~i17))) - ((i17 & 1169991170) | i14));
                            int iA = m0.a(689061172 & i2, i2, 1, 689061173 & i2);
                            int i19 = bArr3[iA] & 255;
                            int i20 = ((~i18) & (i19 * ((~i19) & 256))) + i18;
                            int i21 = (i20 - 1) - ((~(bArr3[i2] & 255)) | i20);
                            byte b4 = bArr4[i13];
                            int i22 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                            int i23 = bArr4[i15] & 255;
                            int i24 = i23 * ((~i23) & 65536);
                            int i25 = ~((i22 | ((-445685625) | (~i24))) - ((i24 & (-445685625)) | i22));
                            int i26 = bArr4[iA] & 255;
                            int i27 = i26 * ((~i26) & 256);
                            int i28 = (i27 + i25) - (i27 & i25);
                            int i29 = bArr4[i2] & 255;
                            int i30 = (i28 & (~i29)) + i29;
                            int i31 = i21 << ((i21 > Double.NaN ? 1 : (i21 == Double.NaN ? 0 : -1)) >>> 31);
                            int i32 = (i31 + i30) - ((i31 & i30) * 2);
                            int i33 = 659933421 - ((i32 & 2) | ((-1983400303) - i32));
                            bArr4[i2] = (byte) i33;
                            bArr4[iA] = (byte) (i33 >>> 8);
                            bArr4[i15] = (byte) (i33 >>> 16);
                            bArr4[i13] = (byte) (i33 >>> 24);
                            i2 = (i2 ^ 4) + ((i2 & 4) * 2);
                            int length4 = bArr4.length;
                            int length5 = 0 - (bArr4.length % 4);
                            int i34 = 1 & ((i2 > ((length4 ^ length5) + ((length4 & length5) * 2)) ? 1 : (i2 == ((length4 ^ length5) + ((length4 & length5) * 2)) ? 0 : -1)) >>> 31);
                            i3 = i34 != 0 ? -826922365 : i34 != 0 ? 196573321 : 145880015;
                            break;
                        case -625567707:
                            break;
                        case 172635213:
                            int length6 = bArr4.length;
                            int i35 = 0 - length;
                            i3 = (((double) ((byte) bArr3[(length6 ^ i35) + ((length6 & i35) * 2)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[(length6 ^ i35) + ((length6 & i35) * 2)])) == Double.NaN ? 0 : -1)) > -1 ? -34715366 : 196573321;
                            i = length;
                            break;
                        case 614184219:
                            int length7 = bArr4.length;
                            int i36 = 0 - i;
                            int i37 = i36 * 3;
                            int iA2 = p0.a(i36, -4, 1, length7);
                            int length8 = bArr4.length;
                            byte b5 = bArr4[(length8 ^ i36) + ((length8 & i36) * 2)];
                            int length9 = bArr4.length;
                            int i38 = 0 - i36;
                            byte b6 = bArr3[(((~i38) & length9) * 2) - (length9 ^ i38)];
                            bArr4[n0.a(0, (length7 & 2) | iA2, i37, 1)] = (byte) (((byte) (b6 + b5)) - ((byte) (((byte) 2) * ((byte) (b6 & b5)))));
                            length = ((-338014207) | i) + (338014206 | i);
                            int i39 = ((i > 2 ? 1 : (i == 2 ? 0 : -1)) >>> 31) & 1;
                            i8 = i39 != 0 ? 196573321 : 1298988808;
                            i3 = i39 == 0 ? i8 : -518432968;
                            break;
                        case 835516413:
                            int length10 = bArr.length;
                            int length11 = 0 - (0 - (bArr.length % 4));
                            boolean z = (length10 ^ length11) - (((~length10) & length11) * 2) > 0;
                            i3 = z ? -826922365 : z ? 196573321 : 145880015;
                            bArr3 = bArr2;
                            bArr4 = bArr;
                            i2 = 0;
                            break;
                        case 1888416065:
                            length = bArr4.length % 4;
                            int i40 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                            i8 = i40 != 0 ? 196573321 : 1298988808;
                            if (i40 == 0) {
                            }
                            break;
                        default:
                            i3 = 196573321;
                            break;
                    }
                    return;
                }
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1733229319;
            }

            public String toString() {
                byte[] bArr = {48, -122, 123, 34};
                a(bArr, new byte[]{-62, -38, -101, -27, -82, -105, -35, Ascii.SI});
                return new String(bArr, StandardCharsets.UTF_8).intern();
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f274a = new c();

            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x00fb. Please report as an issue. */
            public static void a(byte[] bArr, byte[] bArr2) {
                int length;
                int i;
                int length2;
                int i2;
                int i3;
                int length3;
                int i4;
                int iA;
                int i5;
                int i6 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                int length4 = (((~((("com.aheaditec.talsec.security.p2$a$c".length() | 70245657) | i6) - (i6 | ("com.aheaditec.talsec.security.p2$a$c".length() & (-70245658))))) & (-1979440632)) + (("com.aheaditec.talsec.security.p2$a$c".length() & 1074528264) | 1093142560)) ^ (-886298072);
                int i7 = -1;
                int iA2 = m1.a(c.class, -1);
                int length5 = (((iA2 | (-1789924155)) - ((21884101 | iA2) ^ (-1811767295))) + ((("com.aheaditec.talsec.security.p2$a$c".length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
                int length6 = ((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-576567005)) & 276971586) + (("com.aheaditec.talsec.security.p2$a$c".length() & 36928) | 1073844225)) ^ 1350815811;
                int length7 = ((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-1157759625)) & 1755853004) + (("com.aheaditec.talsec.security.p2$a$c".length() & 1073973402) | (-2146202606))) ^ (-390349602);
                int i8 = ((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-529537184)) & 457019905;
                int length8 = "com.aheaditec.talsec.security.p2$a$c".length();
                int iA3 = (-1686268015) ^ ((((454038545 & length8) ^ (-2143287920)) + (length8 & realm_errno_e.RLM_ERR_SYNC_SERVER_PERMISSIONS_CHANGED)) + i8);
                int length9 = ((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-1064961)) + 689325073) + (("com.aheaditec.talsec.security.p2$a$c".length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
                int i9 = ((~"com.aheaditec.talsec.security.p2$a$c".length()) | 91711000) & (-1070824876);
                int length10 = "com.aheaditec.talsec.security.p2$a$c".length();
                int i10 = (i9 + (9457696 | ((length10 | (-1064779676)) - (length10 ^ (-1064779676))))) ^ 1492981618;
                short[] sArr = null;
                while (true) {
                    switch (i10) {
                        case -2143294076:
                            int i11 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            if (length4 < length5) {
                                int length11 = ("com.aheaditec.talsec.security.p2$a$c".length() & 268439810) | 285217280;
                                int i12 = -((i11 | (-1553600102)) - (((-1553600360) | i11) ^ 536887698));
                                i10 = ((((~i12) & length11) * 2) - (i12 ^ length11)) ^ (-1524017045);
                            } else {
                                length = ((i11 | (-747233512)) & (-1862204400)) + (("com.aheaditec.talsec.security.p2$a$c".length() & 1073807362) | 1116733474);
                                i = -375509041;
                                i10 = i ^ length;
                            }
                            i7 = -1;
                            break;
                        case -2038999444:
                            int i13 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            int length12 = (((((("com.aheaditec.talsec.security.p2$a$c".length() & (~i13)) & 797295576) + 797295576) + i13) - (("com.aheaditec.talsec.security.p2$a$c".length() | i13) & 797295576)) & 161497089) + (("com.aheaditec.talsec.security.p2$a$c".length() & (-2145386455)) | (-2147483476));
                            int iA4 = ((short) ((length6 << com.aheaditec.talsec.security.a.a(length12 | (-1985986391), 2, -1985986391, length12)) + sArr[((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-1085986263)) & 1078327440) + (("com.aheaditec.talsec.security.p2$a$c".length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (length6 + iA3);
                            int i14 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            int length13 = length6 >>> ((((~((("com.aheaditec.talsec.security.p2$a$c".length() | 626856794) | i14) - (("com.aheaditec.talsec.security.p2$a$c".length() & (-626856795)) | i14))) & 957405457) + (("com.aheaditec.talsec.security.p2$a$c".length() & 588787984) | 36185216)) ^ 993590676);
                            short s = sArr[((((~"com.aheaditec.talsec.security.p2$a$c".length()) | 1248713193) & 826417528) + (("com.aheaditec.talsec.security.p2$a$c".length() & 822288912) | (-2138488320))) ^ (-1312070789)];
                            int i15 = -length13;
                            int i16 = i15 | s;
                            int i17 = (i16 - (i15 * 2)) + ((i15 ^ s) ^ i16);
                            int i18 = -e3.a(i17 | (~iA4), 2, i17 - iA4, 2);
                            length7 = (short) q0.a(length7, 3, -(p0.a(length7, -4, 1, i18) | (i18 & 2)), 1);
                            int i19 = ((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-549847554)) + 1624126210;
                            int length14 = ("com.aheaditec.talsec.security.p2$a$c".length() & 549848649) | 67175498;
                            length6 = (short) (length6 - ((((short) ((length7 << (1691301711 ^ ((length14 & i19) + (i19 | length14)))) + sArr[((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-1005965450)) & 153223237) + (("com.aheaditec.talsec.security.p2$a$c".length() & 220201009) | 335544368)) ^ 488767605])) ^ (((iA3 | length7) - (("com.aheaditec.talsec.security.p2$a$c".length() & (~length7)) & iA3)) + (("com.aheaditec.talsec.security.p2$a$c".length() | length7) & iA3))) ^ ((length7 >>> (((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-30261291)) & (-1534000062)) + (("com.aheaditec.talsec.security.p2$a$c".length() & 8609814) | 2285588)) ^ (-1531714477))) + sArr[((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-23496740)) & 827084804) + (("com.aheaditec.talsec.security.p2$a$c".length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
                            int i20 = ((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-412319609)) & (-1959782776);
                            int length15 = ("com.aheaditec.talsec.security.p2$a$c".length() & 403838542) | 268582982;
                            int i21 = -i20;
                            int i22 = (((~i21) & length15) * 2) - (i21 ^ length15);
                            iA3 = (short) k1.a(1691170566 & i22, 2, (-1691170567) - i22, iA3);
                            length9++;
                            length = (((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-961655275)) & 25184460) + (("com.aheaditec.talsec.security.p2$a$c".length() & 150995145) | 140771329);
                            i = 1965034008;
                            i10 = i ^ length;
                            i7 = -1;
                            break;
                        case -1809249287:
                            byte b = bArr[(((((~"com.aheaditec.talsec.security.p2$a$c".length()) | 1233459797) & 125923146) + (("com.aheaditec.talsec.security.p2$a$c".length() & 774137098) | 674496513)) ^ 800419659) + length4];
                            int length16 = ((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-7107622)) & 402932290) + (("com.aheaditec.talsec.security.p2$a$c".length() & 546586672) | 546340912)) ^ 949273229;
                            int length17 = (("com.aheaditec.talsec.security.p2$a$c".length() | length16) - (b | length16)) + m1.a(c.class, b) + ("com.aheaditec.talsec.security.p2$a$c".length() & length16);
                            int length18 = ((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-81143879)) & 438583424) + (("com.aheaditec.talsec.security.p2$a$c".length() & 786435) | 8921603)) ^ 447505026;
                            byte b2 = bArr[((length18 & length4) * 2) + (length18 ^ length4)];
                            int i23 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            length6 = (short) (((b2 & ((-1954201202) ^ (((("com.aheaditec.talsec.security.p2$a$c".length() | (-2105278367)) - (i23 | (-1545180443))) + (m1.a(c.class, 568748773 | i23) + ("com.aheaditec.talsec.security.p2$a$c".length() & (-2105278367)))) + (("com.aheaditec.talsec.security.p2$a$c".length() & (-2097135360)) | 151077136)))) << (((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-1592082969)) & 140665109) + (("com.aheaditec.talsec.security.p2$a$c".length() & 142103568) | 1612800)) ^ 142277917)) | length17);
                            int i24 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            int length19 = (-1901610175) ^ ((((((~i24) & (-569955033)) + i24) | 2038255548) - 2038255548) + (("com.aheaditec.talsec.security.p2$a$c".length() & 144806464) | 136645376));
                            int i25 = -length4;
                            int i26 = i25 | length19;
                            byte b3 = bArr[(i26 - (i25 * 2)) + ((length19 ^ i25) ^ i26)];
                            int i27 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            int i28 = (((-199685676) | i27) - 1591672428) - (i27 | (-180811308));
                            int length20 = ("com.aheaditec.talsec.security.p2$a$c".length() & 23072776) | 272636008;
                            int length21 = b3 & ((-1319036669) ^ (((length20 | i28) - (("com.aheaditec.talsec.security.p2$a$c".length() & (~i28)) & length20)) + (length20 & (i28 | "com.aheaditec.talsec.security.p2$a$c".length()))));
                            int i29 = ((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-1009031633)) & 545538049;
                            int length22 = ("com.aheaditec.talsec.security.p2$a$c".length() & 537143360) | 10560;
                            int length23 = bArr[(545548610 ^ ((length22 & i29) + (i29 | length22))) + length4] & (((((~"com.aheaditec.talsec.security.p2$a$c".length()) | 75364313) & 1242301609) + (("com.aheaditec.talsec.security.p2$a$c".length() & 1249907040) | (-1602217664))) ^ (-359916266));
                            int length24 = "com.aheaditec.talsec.security.p2$a$c".length();
                            length7 = (short) (length21 | (length23 << ((((1779401364 | (((~length24) - length24) + length24)) & 447961710) + (("com.aheaditec.talsec.security.p2$a$c".length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
                            int i30 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            iA3 = 758110381 ^ (((((-1343875612) | i30) + 311432716) - (i30 | (-1074391060))) + (("com.aheaditec.talsec.security.p2$a$c".length() & 273678921) | (-1069545407)));
                            int i31 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            int length25 = 1409942802 & ((((("com.aheaditec.talsec.security.p2$a$c".length() & (~i31)) & 91135407) + 91135407) + i31) - ((i31 | "com.aheaditec.talsec.security.p2$a$c".length()) & 91135407));
                            int length26 = ("com.aheaditec.talsec.security.p2$a$c".length() & (-804257776)) | (-2094006112);
                            int i32 = -length25;
                            length9 = (-684063310) ^ (((~i32) & length26) - (i32 & (~length26)));
                            length2 = (((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-537919489)) - (-806798471)) + (("com.aheaditec.talsec.security.p2$a$c".length() & 674768897) | 153626665);
                            i2 = 1174056570 - length2;
                            i3 = -1174056571;
                            i10 = ((length2 & i3) * 2) + i2;
                            break;
                        case -1740520186:
                            sArr = new short[((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-382746167)) & 102532165) + (("com.aheaditec.talsec.security.p2$a$c".length() & 105907748) | 4198960)) ^ 106731121];
                            length4 = ((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-6036961)) & 1233145505) + (("com.aheaditec.talsec.security.p2$a$c".length() & 809508000) | 809603328)) ^ 2042748833;
                            int i33 = ((~"com.aheaditec.talsec.security.p2$a$c".length()) | 1688058452) & 872484865;
                            int length27 = "com.aheaditec.talsec.security.p2$a$c".length() & 268460041;
                            length3 = ((((("com.aheaditec.talsec.security.p2$a$c".length() & (~length27)) & 4218888) + 4218888) + length27) - ((length27 | "com.aheaditec.talsec.security.p2$a$c".length()) & 4218888)) + i33;
                            i4 = 434661073;
                            i10 = i4 ^ length3;
                            break;
                        case -1489518479:
                            int length28 = "com.aheaditec.talsec.security.p2$a$c".length();
                            int length29 = (((-2053077912) & ((516782023 - length28) + (((-((-1) - length28)) - 1) | (-516782024)))) + (("com.aheaditec.talsec.security.p2$a$c".length() & (-1054752728)) | 1073823745)) ^ (-979254165);
                            int length30 = bArr2[(((~length4) & length29) * ((~length29) & length4)) + ((length29 & length4) * (length29 | length4))] & (((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-1883938358)) & (-738125179)) + (("com.aheaditec.talsec.security.p2$a$c".length() & 1343232517) | 546308360)) ^ (-191816846));
                            int i34 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            int i35 = 73539736 & (((~i34) & (-1772650326)) + i34);
                            int length31 = ("com.aheaditec.talsec.security.p2$a$c".length() & 35664144) | 33608448;
                            int i36 = -i35;
                            byte b4 = bArr2[((107148186 ^ ((((~i36) & length31) * 2) - (i36 ^ length31))) * length4) + ((((m1.a(c.class, i7) | (-532481)) - (-67641369)) + (("com.aheaditec.talsec.security.p2$a$c".length() & 532546) | 1602)) ^ 67642971)];
                            int i37 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            int length32 = (b4 & (((663757504 & ((i37 + 1314070430) - (i37 & 1314070430))) + (("com.aheaditec.talsec.security.p2$a$c".length() & 834674756) | 272630796)) ^ 936388147)) << ((((m1.a(c.class, i7) | (-33554434)) - (-1107366402)) + (("com.aheaditec.talsec.security.p2$a$c".length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
                            sArr[length4] = (short) ((length32 ^ length30) + (length30 & length32));
                            length4++;
                            iA = ((m1.a(c.class, i7) | (-167014194)) & 1157999680) + (("com.aheaditec.talsec.security.p2$a$c".length() & 159661328) | (-2004872944));
                            i5 = -533943416;
                            i10 = iA ^ i5;
                            break;
                        case -473033593:
                            int i38 = -length4;
                            int i39 = -bArr.length;
                            int i40 = i39 | i38;
                            int i41 = (i40 - (i39 * 2)) + ((i39 ^ i38) ^ i40);
                            byte b5 = bArr[bArr.length - length4];
                            int length33 = "com.aheaditec.talsec.security.p2$a$c".length();
                            bArr[i41] = (byte) (b5 ^ bArr2[length4 % (((((-878819395) | ((length33 - 1) - (length33 * 2))) & 1490255976) + (("com.aheaditec.talsec.security.p2$a$c".length() & 274827331) | 556017667)) ^ 2046273635)]);
                            length4--;
                            int iA5 = (m1.a(c.class, i7) | 114408723) & 1183666176;
                            int length34 = "com.aheaditec.talsec.security.p2$a$c".length() & 1074544770;
                            iA = l0.a(length34, ((-length34) - 1) | (-268567684), 268567684, iA5);
                            i5 = 836032333;
                            i10 = iA ^ i5;
                            break;
                        case 766056152:
                            int i42 = ((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-889871025)) & 1233748555;
                            int length35 = "com.aheaditec.talsec.security.p2$a$c".length();
                            int i43 = (length35 + 84675108) - (length35 | 84675108);
                            if (length4 < (1842188139 ^ ((((~i43) & 608439588) + i43) + i42))) {
                                int i44 = ((~"com.aheaditec.talsec.security.p2$a$c".length()) | 1878725846) & 1912684595;
                                int length36 = ("com.aheaditec.talsec.security.p2$a$c".length() & 268589089) | 661640;
                                iA = o0.a(i44 | length36, 2, (~i44) ^ length36, 1);
                                i5 = -717449014;
                            } else {
                                iA = (((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-1477955618)) & (-1604246503)) + (("com.aheaditec.talsec.security.p2$a$c".length() & 1074350177) | 1342720098);
                                i5 = -887872332;
                            }
                            i10 = iA ^ i5;
                            break;
                        case 974072829:
                            int length37 = bArr.length;
                            int i45 = ((~"com.aheaditec.talsec.security.p2$a$c".length()) | 1711185063) & 170281206;
                            int length38 = ("com.aheaditec.talsec.security.p2$a$c".length() & 251684176) | 1694512896;
                            int i46 = -i45;
                            length4 = length37 % (1864794098 ^ (((~i46) & length38) - (i46 & (~length38))));
                            iA = (((~"com.aheaditec.talsec.security.p2$a$c".length()) | 991120067) & (-2113137661)) + (("com.aheaditec.talsec.security.p2$a$c".length() & (-1878240248)) | 285229064);
                            i5 = -195569723;
                            i10 = iA ^ i5;
                            break;
                        case 998066383:
                            length4 = (((m1.a(c.class, i7) | 314136709) & 371231304) + ((("com.aheaditec.talsec.security.p2$a$c".length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
                            length5 = bArr.length - (bArr.length % (((((~"com.aheaditec.talsec.security.p2$a$c".length()) | 366661365) & 1344150018) + (("com.aheaditec.talsec.security.p2$a$c".length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
                            iA = (((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-1359635359)) & 49026131) + (("com.aheaditec.talsec.security.p2$a$c".length() & (-1860698094)) | (-1190123008));
                            i5 = 1002689495;
                            i10 = iA ^ i5;
                            break;
                        case 1314339506:
                            break;
                        case 1734050766:
                            int i47 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            if (length4 <= 0) {
                                int length39 = ("com.aheaditec.talsec.security.p2$a$c".length() & R.^attr-private.__removed0) | 553664516;
                                int i48 = -((i47 | 1510858717) & 403833600);
                                length3 = ((~i48) & length39) - (i48 & (~length39));
                                i4 = 2001041846;
                                i10 = i4 ^ length3;
                            } else {
                                int length40 = "com.aheaditec.talsec.security.p2$a$c".length();
                                iA = ((i47 | (-268772210)) & 282132586) + (168323072 | ((length40 + 402735200) - (length40 | 402735200)));
                                i5 = -115901203;
                                i10 = iA ^ i5;
                            }
                            break;
                        case 1771480224:
                            bArr[(((((~"com.aheaditec.talsec.security.p2$a$c".length()) | 1110430873) & 1241612298) + (("com.aheaditec.talsec.security.p2$a$c".length() & 150996226) | 84419840)) ^ 1326032138) + length4] = (byte) ((((((~"com.aheaditec.talsec.security.p2$a$c".length()) | 1603962366) & 25199440) + ((("com.aheaditec.talsec.security.p2$a$c".length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & length6);
                            int length41 = (((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-1388708984)) & 706816128) + (("com.aheaditec.talsec.security.p2$a$c".length() & 1124204552) | 1363312648)) ^ 2070128777) + length4;
                            int i49 = ((~"com.aheaditec.talsec.security.p2$a$c".length()) | 367288948) & 548745488;
                            int length42 = "com.aheaditec.talsec.security.p2$a$c".length();
                            bArr[length41] = (byte) ((length6 >> ((i49 + (((length42 + 558960896) - (length42 | 558960896)) | 21135364)) ^ 569880860)) & (((((~"com.aheaditec.talsec.security.p2$a$c".length()) | 2113158628) & 1026558002) + (("com.aheaditec.talsec.security.p2$a$c".length() & 8392730) | 8525645)) ^ 1035083648));
                            int length43 = (((~"com.aheaditec.talsec.security.p2$a$c".length()) | 715175224) & 136512788) + (("com.aheaditec.talsec.security.p2$a$c".length() & 196644) | (-2146430752));
                            int iA6 = l1.a((~length43) | (-2009917962), 2, (-2009917962) - length43, 2, length4);
                            int i50 = ((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-1010633609)) & 678986012;
                            int length44 = "com.aheaditec.talsec.security.p2$a$c".length();
                            int i51 = ~(((length44 & 951583497) + 276825601) - (length44 & 276824577));
                            int i52 = -i50;
                            bArr[iA6] = (byte) ((j1.a(~i52, i51, 2, (i51 + i52) + 1) ^ 955811810) & length7);
                            int length45 = (((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-1084937228)) & 438503696) + (("com.aheaditec.talsec.security.p2$a$c".length() & 69369860) | (-2080078843))) ^ (-1641575146)) + length4;
                            int i53 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            int length46 = length7 >> (2092810490 ^ (((("com.aheaditec.talsec.security.p2$a$c".length() | 674349280) - (i53 | 1869872636)) + (m1.a(c.class, 1197735420 | i53) + ("com.aheaditec.talsec.security.p2$a$c".length() & 674349280))) + (("com.aheaditec.talsec.security.p2$a$c".length() & 1754529808) | 1418461202)));
                            int i54 = ((~"com.aheaditec.talsec.security.p2$a$c".length()) | 1601418652) & 1439188132;
                            int length47 = ("com.aheaditec.talsec.security.p2$a$c".length() & 545800290) | (-1442676670);
                            int i55 = -i54;
                            bArr[length45] = (byte) (length46 & ((-3488743) ^ (((~i55) & length47) - (i55 & (~length47)))));
                            length4 += 4;
                            iA = (((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-171976913)) & 318775824) + (("com.aheaditec.talsec.security.p2$a$c".length() & 33562640) | 136194);
                            i5 = -1824662634;
                            i10 = iA ^ i5;
                            break;
                        case 2093236949:
                            if (length9 >= (((((~"com.aheaditec.talsec.security.p2$a$c".length()) | (-616910267)) & 1303391760) + (("com.aheaditec.talsec.security.p2$a$c".length() & 75500825) | 537198861)) ^ 1840590653)) {
                                int i56 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                                iA = (1141965102 & ((-1207265904) + i56 + (((-i56) - 1) | 1207265904))) + (("com.aheaditec.talsec.security.p2$a$c".length() & 1292960864) | 150996032);
                                i5 = 612868558;
                                i10 = iA ^ i5;
                            } else {
                                length2 = (((~"com.aheaditec.talsec.security.p2$a$c".length()) | 1297715640) & 556926729) + (("com.aheaditec.talsec.security.p2$a$c".length() & 874653185) | 335552516);
                                i2 = (-1287294623) - length2;
                                i3 = 1287294622;
                                i10 = ((length2 & i3) * 2) + i2;
                            }
                            break;
                        default:
                            int i57 = ~"com.aheaditec.talsec.security.p2$a$c".length();
                            int i58 = (((-313266948) | i57) + 45165696) - (i57 | (-269226756));
                            length = q0.a(i58, 3, -p0.a(i58, -4, 1, ("com.aheaditec.talsec.security.p2$a$c".length() & 44040224) | (-1811807712)), 1);
                            i = -361272203;
                            i10 = i ^ length;
                            i7 = -1;
                            break;
                    }
                    return;
                }
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -2116317549;
            }

            public String toString() {
                byte[] bArr = {2, -31, 89, 41, 38, -23, -115, -115, 102};
                a(bArr, new byte[]{48, Ascii.RS, Ascii.DC4, -14, -71, -19, -109, Ascii.EM, -105});
                return new String(bArr, StandardCharsets.UTF_8).intern();
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f275a = new d();

            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003a. Please report as an issue. */
            public static void a(byte[] bArr, byte[] bArr2) {
                int i;
                byte[] bArr3 = null;
                int length = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 1180709023;
                byte[] bArr4 = null;
                while (true) {
                    int i5 = ((i4 & 16777216) * (i4 | 16777216)) + ((i4 & (-16777217)) * ((~i4) & 16777216));
                    int i6 = i4 >>> 8;
                    int iA = l0.a(i6, i5, 1, ((-1) - i6) | ((-1) - i5));
                    int i7 = (iA ^ (-201803027)) + ((iA & (-201803027)) * 2);
                    switch ((i7 - 814310662) - ((i7 & (-814310662)) * 2)) {
                        case -2000520841:
                            int length2 = bArr4.length;
                            int i8 = 0 - (0 - length);
                            boolean z = (((double) ((byte) bArr3[((length2 & (~i8)) * 2) - (length2 ^ i8)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length2 & (~i8)) * 2) - (length2 ^ i8)])) == Double.NaN ? 0 : -1)) > -1;
                            i4 = z ? z ? 1565752577 : 1621215041 : -1164716566;
                            i3 = length;
                            break;
                        case -870579640:
                            int i9 = (i2 - 1) - (i2 | (-4));
                            byte b = bArr3[i9];
                            int i10 = ((b & 16777216) * (b | 16777216)) + ((b & (-16777217)) * ((~b) & 16777216));
                            int i11 = i2 + 3 + (((-1) - i2) | (-3));
                            int i12 = bArr3[i11] & 255;
                            int i13 = i12 * ((~i12) & 65536);
                            int i14 = ~((i10 | ((~i13) | (-1268032266))) - ((i13 & (-1268032266)) | i10));
                            int iA2 = m0.a((-132004404) & i2, i2, 1, (-132004403) & i2);
                            int i15 = bArr3[iA2] & 255;
                            int i16 = i15 * ((~i15) & 256);
                            int i17 = (i16 + i14) - (i16 & i14);
                            int i18 = bArr3[i2] & 255;
                            int i19 = (i17 & (~i18)) + i18;
                            byte b2 = bArr4[i9];
                            int i20 = ((b2 & 16777216) * (b2 | 16777216)) + ((b2 & (-16777217)) * ((~b2) & 16777216));
                            int i21 = bArr4[i11] & 255;
                            int i22 = i21 * ((~i21) & 65536);
                            int i23 = ~((i20 | ((~i22) | (-1355861741))) - ((i22 & (-1355861741)) | i20));
                            int i24 = bArr4[iA2] & 255;
                            int i25 = i24 * ((~i24) & 256);
                            int iA3 = l0.a(i25, i23, 1, ((-1) - i25) | ((-1) - i23));
                            int i26 = (iA3 - 1) - ((~(bArr4[i2] & 255)) | iA3);
                            int i27 = i19 << ((i19 > Double.NaN ? 1 : (i19 == Double.NaN ? 0 : -1)) >>> 31);
                            int i28 = (i27 ^ (-418000873)) + ((i27 & (-418000873)) * 2);
                            int i29 = (i28 + i26) - ((i28 & i26) * 2);
                            bArr4[i2] = (byte) i29;
                            bArr4[iA2] = (byte) (i29 >>> 8);
                            bArr4[i11] = (byte) (i29 >>> 16);
                            bArr4[i9] = (byte) (i29 >>> 24);
                            i2 = (i2 ^ 4) + ((i2 & 4) * 2);
                            int length3 = bArr4.length;
                            int iA4 = w1.a(bArr4.length, 4, 0, 0);
                            i4 = (((((long) i2) > ((long) (((length3 & (~iA4)) * 2) - (length3 ^ iA4))) ? 1 : (((long) i2) == ((long) (((length3 & (~iA4)) * 2) - (length3 ^ iA4))) ? 0 : -1)) >>> 31) & 1) != 0 ? 1910359311 : 1621215041;
                            break;
                        case -97532338:
                            length = bArr4.length % 4;
                            int i30 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                            i = i30 != 0 ? 986083301 : 1621215041;
                            i4 = i30 == 0 ? -1138188205 : i;
                            break;
                        case 298177592:
                            int length4 = bArr4.length;
                            int i31 = 0 - i3;
                            int iA5 = n0.a(0, (length4 & 2) | p0.a(i31, -4, 1, length4), i31 * 3, 1);
                            byte b3 = bArr3[iA5];
                            int length5 = bArr4.length;
                            int i32 = 0 - i31;
                            int i33 = i32 | length5;
                            byte b4 = bArr3[q0.a(i32, 2, i33, (length5 ^ i32) ^ i33)];
                            bArr3[iA5] = (byte) (((byte) (b4 ^ b3)) + ((byte) (((byte) 2) * ((byte) (b4 & b3)))));
                            i4 = 1565752577;
                            break;
                        case 373627814:
                            break;
                        case 975213712:
                            int length6 = bArr4.length;
                            int i34 = 0 - i3;
                            int length7 = bArr4.length;
                            int i35 = ~i34;
                            byte b5 = bArr4[((length7 | i34) - (((-656070458) & i35) & length7)) + (((-656070458) | i34) & length7)];
                            int length8 = bArr4.length;
                            byte b6 = bArr3[(length8 ^ i35) + ((length8 | i34) * 2) + 1];
                            bArr4[((length6 | i34) * 2) - (length6 ^ i34)] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
                            length = (~i3) + (i3 * 2);
                            int i36 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                            i = i36 != 0 ? 986083301 : 1621215041;
                            if (i36 == 0) {
                            }
                            break;
                        case 1548321255:
                            int length9 = bArr.length;
                            int length10 = 0 - (0 - (bArr.length % 4));
                            i4 = (length9 & (~length10)) - ((~length9) & length10) > 0 ? 1910359311 : 1621215041;
                            bArr3 = bArr2;
                            bArr4 = bArr;
                            i2 = 0;
                            break;
                        default:
                            break;
                    }
                    return;
                }
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1718474189;
            }

            public String toString() {
                byte[] bArr = {-27, Ascii.SUB, -31};
                a(bArr, new byte[]{-79, Framer.STDIN_REQUEST_FRAME_PREFIX, -92, 117, 113, 41, 5, -50});
                return new String(bArr, StandardCharsets.UTF_8).intern();
            }
        }
    }

    public p2(Context context) {
        byte[] bArr = {-28, -57, -96, 83, 4, -42, -95};
        a(bArr, new byte[]{-121, -88, -50, 39, 97, -82, -43, -46});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        this.f271a = context;
        this.b = new ReentrantLock();
    }

    public final a a() {
        if (c()) {
            return a.c.f274a;
        }
        Object objB = b();
        if (Result.m11505isFailureimpl(objB)) {
            objB = null;
        }
        Boolean bool = (Boolean) objB;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            return a.d.f275a;
        }
        return Intrinsics.areEqual(bool, Boolean.FALSE) ? a.b.f273a : a.C0112a.f272a;
    }

    public final Object b() {
        Object objM11499constructorimpl;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            try {
                if (this.c == null) {
                    this.c = e0.f233a.a();
                }
                z zVar = this.c;
                z zVar2 = null;
                if (zVar == null) {
                    byte[] bArr = {-47, -102, Ascii.VT, -104, -8, 2, -74, 82};
                    a(bArr, new byte[]{-75, -17, 102, -11, -127, 73, -45, 43});
                    Intrinsics.throwUninitializedPropertyAccessException(new String(bArr, StandardCharsets.UTF_8).intern());
                    zVar = null;
                }
                if (!zVar.c()) {
                    z zVar3 = this.c;
                    if (zVar3 == null) {
                        byte[] bArr2 = {-10, 97, -6, -23, -41, 102, 19, 89};
                        a(bArr2, new byte[]{-110, Ascii.DC4, -105, -124, -82, Framer.STDIN_FRAME_PREFIX, 118, 32});
                        Intrinsics.throwUninitializedPropertyAccessException(new String(bArr2, StandardCharsets.UTF_8).intern());
                        zVar3 = null;
                    }
                    zVar3.b();
                }
                Result.Companion companion = Result.INSTANCE;
                z zVar4 = this.c;
                if (zVar4 == null) {
                    byte[] bArr3 = {Base64.padSymbol, -72, -27, -89, 5, 7, -64, 39};
                    a(bArr3, new byte[]{89, -51, -120, -54, 124, 76, -91, 94});
                    Intrinsics.throwUninitializedPropertyAccessException(new String(bArr3, StandardCharsets.UTF_8).intern());
                } else {
                    zVar2 = zVar4;
                }
                objM11499constructorimpl = Result.m11499constructorimpl(Boolean.valueOf(zVar2.d()));
            } catch (c4 e) {
                Result.Companion companion2 = Result.INSTANCE;
                objM11499constructorimpl = Result.m11499constructorimpl(ResultKt.createFailure(e));
            }
            return objM11499constructorimpl;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c() {
        PackageManager packageManager = this.f271a.getPackageManager();
        byte[] bArr = {-87, 99, 121, 116, -45, -56, -92, Ascii.SYN, 117, -122, -97, -19, -101, -69, -35, -53, -46, -86, 102, 121, 125, 94, -54, -5, -88, 90, Ascii.DC4, -34, -108, 1, -116, -32, -47, 115, 6};
        a(bArr, new byte[]{-56, Ascii.CR, Ascii.GS, 6, -68, -95, -64, 56, Ascii.GS, -25, -19, -119, -20, -38, -81, -82, -4, -39, Ascii.DC2, Ascii.VT, Ascii.DC2, 48, -83, -103, -57, 34, 75, -75, -15, Framer.EXIT_FRAME_PREFIX, -1, -108, -66, 1, 99});
        return packageManager.hasSystemFeature(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public static void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        int i3 = -1850458006;
        byte[] bArr4 = null;
        while (true) {
            int i4 = ((16777216 & i3) * (i3 | 16777216)) + (((-16777217) & i3) * ((~i3) & 16777216));
            int i5 = i3 >>> 8;
            int i6 = (i5 - 1) - ((~i4) | i5);
            int i7 = (-1700147435) - ((i6 & 2) | (2028104049 - i6));
            switch ((-1363443157) ^ ((~i7) + ((i7 | 1) * 2))) {
                case -1940167324:
                    byte b = bArr3[i];
                    int i8 = ((byte) 0) - b;
                    bArr3[i] = (byte) (((byte) (b & (~i8))) - ((byte) ((~b) & i8)));
                    i3 = 614229416;
                    continue;
                case -360299937:
                    boolean z = (((double) ((byte) bArr3[i2])) > Double.NaN ? 1 : (((double) ((byte) bArr3[i2])) == Double.NaN ? 0 : -1)) > -1;
                    i3 = z ? 614229416 : z ? -1396193641 : 427928065;
                    i = i2;
                    continue;
                case 399486784:
                    return;
                case 585276366:
                    i3 = bArr.length > 0 ? 1985663266 : -1396193641;
                    bArr4 = bArr;
                    bArr3 = bArr2;
                    i2 = 0;
                    continue;
                case 1733787683:
                    byte b2 = bArr4[i];
                    byte b3 = bArr3[i];
                    bArr4[i] = (byte) (((byte) (b3 + b2)) - ((byte) (((byte) 2) * ((byte) (b3 & b2)))));
                    i2 = (i ^ 1) + ((i & 1) * 2);
                    if ((((i2 > bArr4.length ? 1 : (i2 == bArr4.length ? 0 : -1)) >>> 31) & 1) != 0) {
                        i3 = 1985663266;
                    }
                    break;
            }
            i3 = -1396193641;
        }
    }
}
