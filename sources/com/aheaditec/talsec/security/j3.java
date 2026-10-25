package com.aheaditec.talsec.security;

import android.R;
import com.google.common.base.Ascii;
import io.realm.kotlin.internal.interop.realm_errno_e;
import java.nio.charset.StandardCharsets;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public interface j3 {

    public static final class a implements j3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f247a = new a();

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

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1349173744;
        }

        public String toString() {
            byte[] bArr = {Base64.padSymbol, 84, 98, -73, 78, 51, 38};
            a(bArr, new byte[]{-106, 8, 35, -69, 37, 86, 66, -2});
            return new String(bArr, StandardCharsets.UTF_8).intern();
        }
    }

    public static final class b implements j3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f248a = new b();

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

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 194496333;
        }

        public String toString() {
            byte[] bArr = {-52, 123, -7, -1, -87};
            a(bArr, new byte[]{51, 5, Ascii.SO, 3, -57, Ascii.DC4, -65, 34});
            return new String(bArr, StandardCharsets.UTF_8).intern();
        }
    }

    public static final class c implements j3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f249a = new c();

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
            int i6 = ~"com.aheaditec.talsec.security.j3$c".length();
            int length4 = (((~((("com.aheaditec.talsec.security.j3$c".length() | 70245657) | i6) - (i6 | ("com.aheaditec.talsec.security.j3$c".length() & (-70245658))))) & (-1979440632)) + (("com.aheaditec.talsec.security.j3$c".length() & 1074528264) | 1093142560)) ^ (-886298072);
            int i7 = -1;
            int iA2 = m1.a(c.class, -1);
            int length5 = (((iA2 | (-1789924155)) - ((21884101 | iA2) ^ (-1811767295))) + ((("com.aheaditec.talsec.security.j3$c".length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
            int length6 = ((((~"com.aheaditec.talsec.security.j3$c".length()) | (-576567005)) & 276971586) + (("com.aheaditec.talsec.security.j3$c".length() & 36928) | 1073844225)) ^ 1350815811;
            int length7 = ((((~"com.aheaditec.talsec.security.j3$c".length()) | (-1157759625)) & 1755853004) + (("com.aheaditec.talsec.security.j3$c".length() & 1073973402) | (-2146202606))) ^ (-390349602);
            int i8 = ((~"com.aheaditec.talsec.security.j3$c".length()) | (-529537184)) & 457019905;
            int length8 = "com.aheaditec.talsec.security.j3$c".length();
            int iA3 = (-1686268015) ^ ((((454038545 & length8) ^ (-2143287920)) + (length8 & realm_errno_e.RLM_ERR_SYNC_SERVER_PERMISSIONS_CHANGED)) + i8);
            int length9 = ((((~"com.aheaditec.talsec.security.j3$c".length()) | (-1064961)) + 689325073) + (("com.aheaditec.talsec.security.j3$c".length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
            int i9 = ((~"com.aheaditec.talsec.security.j3$c".length()) | 91711000) & (-1070824876);
            int length10 = "com.aheaditec.talsec.security.j3$c".length();
            int i10 = (i9 + (9457696 | ((length10 | (-1064779676)) - (length10 ^ (-1064779676))))) ^ 1492981618;
            short[] sArr = null;
            while (true) {
                switch (i10) {
                    case -2143294076:
                        int i11 = ~"com.aheaditec.talsec.security.j3$c".length();
                        if (length4 < length5) {
                            int length11 = ("com.aheaditec.talsec.security.j3$c".length() & 268439810) | 285217280;
                            int i12 = -((i11 | (-1553600102)) - (((-1553600360) | i11) ^ 536887698));
                            i10 = ((((~i12) & length11) * 2) - (i12 ^ length11)) ^ (-1524017045);
                        } else {
                            length = ((i11 | (-747233512)) & (-1862204400)) + (("com.aheaditec.talsec.security.j3$c".length() & 1073807362) | 1116733474);
                            i = -375509041;
                            i10 = i ^ length;
                        }
                        i7 = -1;
                        break;
                    case -2038999444:
                        int i13 = ~"com.aheaditec.talsec.security.j3$c".length();
                        int length12 = (((((("com.aheaditec.talsec.security.j3$c".length() & (~i13)) & 797295576) + 797295576) + i13) - (("com.aheaditec.talsec.security.j3$c".length() | i13) & 797295576)) & 161497089) + (("com.aheaditec.talsec.security.j3$c".length() & (-2145386455)) | (-2147483476));
                        int iA4 = ((short) ((length6 << com.aheaditec.talsec.security.a.a(length12 | (-1985986391), 2, -1985986391, length12)) + sArr[((((~"com.aheaditec.talsec.security.j3$c".length()) | (-1085986263)) & 1078327440) + (("com.aheaditec.talsec.security.j3$c".length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (length6 + iA3);
                        int i14 = ~"com.aheaditec.talsec.security.j3$c".length();
                        int length13 = length6 >>> ((((~((("com.aheaditec.talsec.security.j3$c".length() | 626856794) | i14) - (("com.aheaditec.talsec.security.j3$c".length() & (-626856795)) | i14))) & 957405457) + (("com.aheaditec.talsec.security.j3$c".length() & 588787984) | 36185216)) ^ 993590676);
                        short s = sArr[((((~"com.aheaditec.talsec.security.j3$c".length()) | 1248713193) & 826417528) + (("com.aheaditec.talsec.security.j3$c".length() & 822288912) | (-2138488320))) ^ (-1312070789)];
                        int i15 = -length13;
                        int i16 = i15 | s;
                        int i17 = (i16 - (i15 * 2)) + ((i15 ^ s) ^ i16);
                        int i18 = -e3.a(i17 | (~iA4), 2, i17 - iA4, 2);
                        length7 = (short) q0.a(length7, 3, -(p0.a(length7, -4, 1, i18) | (i18 & 2)), 1);
                        int i19 = ((~"com.aheaditec.talsec.security.j3$c".length()) | (-549847554)) + 1624126210;
                        int length14 = ("com.aheaditec.talsec.security.j3$c".length() & 549848649) | 67175498;
                        length6 = (short) (length6 - ((((short) ((length7 << (1691301711 ^ ((length14 & i19) + (i19 | length14)))) + sArr[((((~"com.aheaditec.talsec.security.j3$c".length()) | (-1005965450)) & 153223237) + (("com.aheaditec.talsec.security.j3$c".length() & 220201009) | 335544368)) ^ 488767605])) ^ (((iA3 | length7) - (("com.aheaditec.talsec.security.j3$c".length() & (~length7)) & iA3)) + (("com.aheaditec.talsec.security.j3$c".length() | length7) & iA3))) ^ ((length7 >>> (((((~"com.aheaditec.talsec.security.j3$c".length()) | (-30261291)) & (-1534000062)) + (("com.aheaditec.talsec.security.j3$c".length() & 8609814) | 2285588)) ^ (-1531714477))) + sArr[((((~"com.aheaditec.talsec.security.j3$c".length()) | (-23496740)) & 827084804) + (("com.aheaditec.talsec.security.j3$c".length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
                        int i20 = ((~"com.aheaditec.talsec.security.j3$c".length()) | (-412319609)) & (-1959782776);
                        int length15 = ("com.aheaditec.talsec.security.j3$c".length() & 403838542) | 268582982;
                        int i21 = -i20;
                        int i22 = (((~i21) & length15) * 2) - (i21 ^ length15);
                        iA3 = (short) k1.a(1691170566 & i22, 2, (-1691170567) - i22, iA3);
                        length9++;
                        length = (((~"com.aheaditec.talsec.security.j3$c".length()) | (-961655275)) & 25184460) + (("com.aheaditec.talsec.security.j3$c".length() & 150995145) | 140771329);
                        i = 1965034008;
                        i10 = i ^ length;
                        i7 = -1;
                        break;
                    case -1809249287:
                        byte b = bArr[(((((~"com.aheaditec.talsec.security.j3$c".length()) | 1233459797) & 125923146) + (("com.aheaditec.talsec.security.j3$c".length() & 774137098) | 674496513)) ^ 800419659) + length4];
                        int length16 = ((((~"com.aheaditec.talsec.security.j3$c".length()) | (-7107622)) & 402932290) + (("com.aheaditec.talsec.security.j3$c".length() & 546586672) | 546340912)) ^ 949273229;
                        int length17 = (("com.aheaditec.talsec.security.j3$c".length() | length16) - (b | length16)) + m1.a(c.class, b) + ("com.aheaditec.talsec.security.j3$c".length() & length16);
                        int length18 = ((((~"com.aheaditec.talsec.security.j3$c".length()) | (-81143879)) & 438583424) + (("com.aheaditec.talsec.security.j3$c".length() & 786435) | 8921603)) ^ 447505026;
                        byte b2 = bArr[((length18 & length4) * 2) + (length18 ^ length4)];
                        int i23 = ~"com.aheaditec.talsec.security.j3$c".length();
                        length6 = (short) (((b2 & ((-1954201202) ^ (((("com.aheaditec.talsec.security.j3$c".length() | (-2105278367)) - (i23 | (-1545180443))) + (m1.a(c.class, 568748773 | i23) + ("com.aheaditec.talsec.security.j3$c".length() & (-2105278367)))) + (("com.aheaditec.talsec.security.j3$c".length() & (-2097135360)) | 151077136)))) << (((((~"com.aheaditec.talsec.security.j3$c".length()) | (-1592082969)) & 140665109) + (("com.aheaditec.talsec.security.j3$c".length() & 142103568) | 1612800)) ^ 142277917)) | length17);
                        int i24 = ~"com.aheaditec.talsec.security.j3$c".length();
                        int length19 = (-1901610175) ^ ((((((~i24) & (-569955033)) + i24) | 2038255548) - 2038255548) + (("com.aheaditec.talsec.security.j3$c".length() & 144806464) | 136645376));
                        int i25 = -length4;
                        int i26 = i25 | length19;
                        byte b3 = bArr[(i26 - (i25 * 2)) + ((length19 ^ i25) ^ i26)];
                        int i27 = ~"com.aheaditec.talsec.security.j3$c".length();
                        int i28 = (((-199685676) | i27) - 1591672428) - (i27 | (-180811308));
                        int length20 = ("com.aheaditec.talsec.security.j3$c".length() & 23072776) | 272636008;
                        int length21 = b3 & ((-1319036669) ^ (((length20 | i28) - (("com.aheaditec.talsec.security.j3$c".length() & (~i28)) & length20)) + (length20 & (i28 | "com.aheaditec.talsec.security.j3$c".length()))));
                        int i29 = ((~"com.aheaditec.talsec.security.j3$c".length()) | (-1009031633)) & 545538049;
                        int length22 = ("com.aheaditec.talsec.security.j3$c".length() & 537143360) | 10560;
                        int length23 = bArr[(545548610 ^ ((length22 & i29) + (i29 | length22))) + length4] & (((((~"com.aheaditec.talsec.security.j3$c".length()) | 75364313) & 1242301609) + (("com.aheaditec.talsec.security.j3$c".length() & 1249907040) | (-1602217664))) ^ (-359916266));
                        int length24 = "com.aheaditec.talsec.security.j3$c".length();
                        length7 = (short) (length21 | (length23 << ((((1779401364 | (((~length24) - length24) + length24)) & 447961710) + (("com.aheaditec.talsec.security.j3$c".length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
                        int i30 = ~"com.aheaditec.talsec.security.j3$c".length();
                        iA3 = 758110381 ^ (((((-1343875612) | i30) + 311432716) - (i30 | (-1074391060))) + (("com.aheaditec.talsec.security.j3$c".length() & 273678921) | (-1069545407)));
                        int i31 = ~"com.aheaditec.talsec.security.j3$c".length();
                        int length25 = 1409942802 & ((((("com.aheaditec.talsec.security.j3$c".length() & (~i31)) & 91135407) + 91135407) + i31) - ((i31 | "com.aheaditec.talsec.security.j3$c".length()) & 91135407));
                        int length26 = ("com.aheaditec.talsec.security.j3$c".length() & (-804257776)) | (-2094006112);
                        int i32 = -length25;
                        length9 = (-684063310) ^ (((~i32) & length26) - (i32 & (~length26)));
                        length2 = (((~"com.aheaditec.talsec.security.j3$c".length()) | (-537919489)) - (-806798471)) + (("com.aheaditec.talsec.security.j3$c".length() & 674768897) | 153626665);
                        i2 = 1174056570 - length2;
                        i3 = -1174056571;
                        i10 = ((length2 & i3) * 2) + i2;
                        break;
                    case -1740520186:
                        sArr = new short[((((~"com.aheaditec.talsec.security.j3$c".length()) | (-382746167)) & 102532165) + (("com.aheaditec.talsec.security.j3$c".length() & 105907748) | 4198960)) ^ 106731121];
                        length4 = ((((~"com.aheaditec.talsec.security.j3$c".length()) | (-6036961)) & 1233145505) + (("com.aheaditec.talsec.security.j3$c".length() & 809508000) | 809603328)) ^ 2042748833;
                        int i33 = ((~"com.aheaditec.talsec.security.j3$c".length()) | 1688058452) & 872484865;
                        int length27 = "com.aheaditec.talsec.security.j3$c".length() & 268460041;
                        length3 = ((((("com.aheaditec.talsec.security.j3$c".length() & (~length27)) & 4218888) + 4218888) + length27) - ((length27 | "com.aheaditec.talsec.security.j3$c".length()) & 4218888)) + i33;
                        i4 = 434661073;
                        i10 = i4 ^ length3;
                        break;
                    case -1489518479:
                        int length28 = "com.aheaditec.talsec.security.j3$c".length();
                        int length29 = (((-2053077912) & ((516782023 - length28) + (((-((-1) - length28)) - 1) | (-516782024)))) + (("com.aheaditec.talsec.security.j3$c".length() & (-1054752728)) | 1073823745)) ^ (-979254165);
                        int length30 = bArr2[(((~length4) & length29) * ((~length29) & length4)) + ((length29 & length4) * (length29 | length4))] & (((((~"com.aheaditec.talsec.security.j3$c".length()) | (-1883938358)) & (-738125179)) + (("com.aheaditec.talsec.security.j3$c".length() & 1343232517) | 546308360)) ^ (-191816846));
                        int i34 = ~"com.aheaditec.talsec.security.j3$c".length();
                        int i35 = 73539736 & (((~i34) & (-1772650326)) + i34);
                        int length31 = ("com.aheaditec.talsec.security.j3$c".length() & 35664144) | 33608448;
                        int i36 = -i35;
                        byte b4 = bArr2[((107148186 ^ ((((~i36) & length31) * 2) - (i36 ^ length31))) * length4) + ((((m1.a(c.class, i7) | (-532481)) - (-67641369)) + (("com.aheaditec.talsec.security.j3$c".length() & 532546) | 1602)) ^ 67642971)];
                        int i37 = ~"com.aheaditec.talsec.security.j3$c".length();
                        int length32 = (b4 & (((663757504 & ((i37 + 1314070430) - (i37 & 1314070430))) + (("com.aheaditec.talsec.security.j3$c".length() & 834674756) | 272630796)) ^ 936388147)) << ((((m1.a(c.class, i7) | (-33554434)) - (-1107366402)) + (("com.aheaditec.talsec.security.j3$c".length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
                        sArr[length4] = (short) ((length32 ^ length30) + (length30 & length32));
                        length4++;
                        iA = ((m1.a(c.class, i7) | (-167014194)) & 1157999680) + (("com.aheaditec.talsec.security.j3$c".length() & 159661328) | (-2004872944));
                        i5 = -533943416;
                        i10 = iA ^ i5;
                        break;
                    case -473033593:
                        int i38 = -length4;
                        int i39 = -bArr.length;
                        int i40 = i39 | i38;
                        int i41 = (i40 - (i39 * 2)) + ((i39 ^ i38) ^ i40);
                        byte b5 = bArr[bArr.length - length4];
                        int length33 = "com.aheaditec.talsec.security.j3$c".length();
                        bArr[i41] = (byte) (b5 ^ bArr2[length4 % (((((-878819395) | ((length33 - 1) - (length33 * 2))) & 1490255976) + (("com.aheaditec.talsec.security.j3$c".length() & 274827331) | 556017667)) ^ 2046273635)]);
                        length4--;
                        int iA5 = (m1.a(c.class, i7) | 114408723) & 1183666176;
                        int length34 = "com.aheaditec.talsec.security.j3$c".length() & 1074544770;
                        iA = l0.a(length34, ((-length34) - 1) | (-268567684), 268567684, iA5);
                        i5 = 836032333;
                        i10 = iA ^ i5;
                        break;
                    case 766056152:
                        int i42 = ((~"com.aheaditec.talsec.security.j3$c".length()) | (-889871025)) & 1233748555;
                        int length35 = "com.aheaditec.talsec.security.j3$c".length();
                        int i43 = (length35 + 84675108) - (length35 | 84675108);
                        if (length4 < (1842188139 ^ ((((~i43) & 608439588) + i43) + i42))) {
                            int i44 = ((~"com.aheaditec.talsec.security.j3$c".length()) | 1878725846) & 1912684595;
                            int length36 = ("com.aheaditec.talsec.security.j3$c".length() & 268589089) | 661640;
                            iA = o0.a(i44 | length36, 2, (~i44) ^ length36, 1);
                            i5 = -717449014;
                        } else {
                            iA = (((~"com.aheaditec.talsec.security.j3$c".length()) | (-1477955618)) & (-1604246503)) + (("com.aheaditec.talsec.security.j3$c".length() & 1074350177) | 1342720098);
                            i5 = -887872332;
                        }
                        i10 = iA ^ i5;
                        break;
                    case 974072829:
                        int length37 = bArr.length;
                        int i45 = ((~"com.aheaditec.talsec.security.j3$c".length()) | 1711185063) & 170281206;
                        int length38 = ("com.aheaditec.talsec.security.j3$c".length() & 251684176) | 1694512896;
                        int i46 = -i45;
                        length4 = length37 % (1864794098 ^ (((~i46) & length38) - (i46 & (~length38))));
                        iA = (((~"com.aheaditec.talsec.security.j3$c".length()) | 991120067) & (-2113137661)) + (("com.aheaditec.talsec.security.j3$c".length() & (-1878240248)) | 285229064);
                        i5 = -195569723;
                        i10 = iA ^ i5;
                        break;
                    case 998066383:
                        length4 = (((m1.a(c.class, i7) | 314136709) & 371231304) + ((("com.aheaditec.talsec.security.j3$c".length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
                        length5 = bArr.length - (bArr.length % (((((~"com.aheaditec.talsec.security.j3$c".length()) | 366661365) & 1344150018) + (("com.aheaditec.talsec.security.j3$c".length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
                        iA = (((~"com.aheaditec.talsec.security.j3$c".length()) | (-1359635359)) & 49026131) + (("com.aheaditec.talsec.security.j3$c".length() & (-1860698094)) | (-1190123008));
                        i5 = 1002689495;
                        i10 = iA ^ i5;
                        break;
                    case 1314339506:
                        break;
                    case 1734050766:
                        int i47 = ~"com.aheaditec.talsec.security.j3$c".length();
                        if (length4 <= 0) {
                            int length39 = ("com.aheaditec.talsec.security.j3$c".length() & R.^attr-private.__removed0) | 553664516;
                            int i48 = -((i47 | 1510858717) & 403833600);
                            length3 = ((~i48) & length39) - (i48 & (~length39));
                            i4 = 2001041846;
                            i10 = i4 ^ length3;
                        } else {
                            int length40 = "com.aheaditec.talsec.security.j3$c".length();
                            iA = ((i47 | (-268772210)) & 282132586) + (168323072 | ((length40 + 402735200) - (length40 | 402735200)));
                            i5 = -115901203;
                            i10 = iA ^ i5;
                        }
                        break;
                    case 1771480224:
                        bArr[(((((~"com.aheaditec.talsec.security.j3$c".length()) | 1110430873) & 1241612298) + (("com.aheaditec.talsec.security.j3$c".length() & 150996226) | 84419840)) ^ 1326032138) + length4] = (byte) ((((((~"com.aheaditec.talsec.security.j3$c".length()) | 1603962366) & 25199440) + ((("com.aheaditec.talsec.security.j3$c".length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & length6);
                        int length41 = (((((~"com.aheaditec.talsec.security.j3$c".length()) | (-1388708984)) & 706816128) + (("com.aheaditec.talsec.security.j3$c".length() & 1124204552) | 1363312648)) ^ 2070128777) + length4;
                        int i49 = ((~"com.aheaditec.talsec.security.j3$c".length()) | 367288948) & 548745488;
                        int length42 = "com.aheaditec.talsec.security.j3$c".length();
                        bArr[length41] = (byte) ((length6 >> ((i49 + (((length42 + 558960896) - (length42 | 558960896)) | 21135364)) ^ 569880860)) & (((((~"com.aheaditec.talsec.security.j3$c".length()) | 2113158628) & 1026558002) + (("com.aheaditec.talsec.security.j3$c".length() & 8392730) | 8525645)) ^ 1035083648));
                        int length43 = (((~"com.aheaditec.talsec.security.j3$c".length()) | 715175224) & 136512788) + (("com.aheaditec.talsec.security.j3$c".length() & 196644) | (-2146430752));
                        int iA6 = l1.a((~length43) | (-2009917962), 2, (-2009917962) - length43, 2, length4);
                        int i50 = ((~"com.aheaditec.talsec.security.j3$c".length()) | (-1010633609)) & 678986012;
                        int length44 = "com.aheaditec.talsec.security.j3$c".length();
                        int i51 = ~(((length44 & 951583497) + 276825601) - (length44 & 276824577));
                        int i52 = -i50;
                        bArr[iA6] = (byte) ((j1.a(~i52, i51, 2, (i51 + i52) + 1) ^ 955811810) & length7);
                        int length45 = (((((~"com.aheaditec.talsec.security.j3$c".length()) | (-1084937228)) & 438503696) + (("com.aheaditec.talsec.security.j3$c".length() & 69369860) | (-2080078843))) ^ (-1641575146)) + length4;
                        int i53 = ~"com.aheaditec.talsec.security.j3$c".length();
                        int length46 = length7 >> (2092810490 ^ (((("com.aheaditec.talsec.security.j3$c".length() | 674349280) - (i53 | 1869872636)) + (m1.a(c.class, 1197735420 | i53) + ("com.aheaditec.talsec.security.j3$c".length() & 674349280))) + (("com.aheaditec.talsec.security.j3$c".length() & 1754529808) | 1418461202)));
                        int i54 = ((~"com.aheaditec.talsec.security.j3$c".length()) | 1601418652) & 1439188132;
                        int length47 = ("com.aheaditec.talsec.security.j3$c".length() & 545800290) | (-1442676670);
                        int i55 = -i54;
                        bArr[length45] = (byte) (length46 & ((-3488743) ^ (((~i55) & length47) - (i55 & (~length47)))));
                        length4 += 4;
                        iA = (((~"com.aheaditec.talsec.security.j3$c".length()) | (-171976913)) & 318775824) + (("com.aheaditec.talsec.security.j3$c".length() & 33562640) | 136194);
                        i5 = -1824662634;
                        i10 = iA ^ i5;
                        break;
                    case 2093236949:
                        if (length9 >= (((((~"com.aheaditec.talsec.security.j3$c".length()) | (-616910267)) & 1303391760) + (("com.aheaditec.talsec.security.j3$c".length() & 75500825) | 537198861)) ^ 1840590653)) {
                            int i56 = ~"com.aheaditec.talsec.security.j3$c".length();
                            iA = (1141965102 & ((-1207265904) + i56 + (((-i56) - 1) | 1207265904))) + (("com.aheaditec.talsec.security.j3$c".length() & 1292960864) | 150996032);
                            i5 = 612868558;
                            i10 = iA ^ i5;
                        } else {
                            length2 = (((~"com.aheaditec.talsec.security.j3$c".length()) | 1297715640) & 556926729) + (("com.aheaditec.talsec.security.j3$c".length() & 874653185) | 335552516);
                            i2 = (-1287294623) - length2;
                            i3 = 1287294622;
                            i10 = ((length2 & i3) * 2) + i2;
                        }
                        break;
                    default:
                        int i57 = ~"com.aheaditec.talsec.security.j3$c".length();
                        int i58 = (((-313266948) | i57) + 45165696) - (i57 | (-269226756));
                        length = q0.a(i58, 3, -p0.a(i58, -4, 1, ("com.aheaditec.talsec.security.j3$c".length() & 44040224) | (-1811807712)), 1);
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
            return 1085770830;
        }

        public String toString() {
            byte[] bArr = {87, -110, -30, 117, 38, -118, -86};
            a(bArr, new byte[]{108, -60, -3, 73, -104, -67, -60, 41});
            return new String(bArr, StandardCharsets.UTF_8).intern();
        }
    }
}
