package com.aheaditec.talsec.security;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.aheaditec.talsec_security.security.api.Talsec;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import io.realm.kotlin.internal.interop.realm_errno_e;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Consumer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class v3 {
    public static final a b = new a(null);
    public static final boolean c;
    public static final String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f300a;

    public static final class a {
        public a() {
        }

        public final v3 a(Context context, String str) {
            byte[] bArr = {99, -59, -90, Ascii.FS, 67, 103, -38};
            a(bArr, new byte[]{Ascii.ETB, 122, -34, 79, 38, Ascii.US, -82, Framer.STDOUT_FRAME_PREFIX});
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
            byte[] bArr2 = {41, -50, 48};
            a(bArr2, new byte[]{93, -81, 87, -57, SignedBytes.MAX_POWER_OF_TWO, 72, 3, -94});
            Intrinsics.checkNotNullParameter(str, new String(bArr2, charset).intern());
            if (!v3.c) {
                byte[] bArr3 = {-57, 58, Ascii.FS, 110, -52, -7, 41, 62, Ascii.SI, -92, -68, -30, -32, -24, -67, 60, -116, -44, -98, -32, 10, -94, 109, -74, -105, -109, 38, -97, -55, -42, 118, 116, -88, 42, -127, -60, -17, -7, 60, 55, Utf8.REPLACEMENT_BYTE, -85, 118, Ascii.SYN, -63, 4, 4, 6, 104, -111, Framer.ENTER_FRAME_PREFIX, -14, -96, Ascii.SUB, Ascii.SUB, 73, 107};
                a(bArr3, new byte[]{-104, 43, -117, -23, -64, 109, Ascii.US, Framer.STDOUT_FRAME_PREFIX, 119, 84, -28, 110, -98, 81, -28, 47, 0, 119, -44, 122, -128, -96, Ascii.RS, -70, Ascii.DLE, -124, 106, -31, -63, -119, Ascii.SUB, -9, -97, Ascii.EM, -10, -113, -102, 107, 115, 59, 107, 91, 116, 44, -100, Ascii.US, 113, 54, Base64.padSymbol, -107, Ascii.ETB, -75, -105, -7, 68, 71, 69});
                Log.e(str, new String(bArr3, charset).intern());
                return null;
            }
            String str2 = v3.d;
            if (ContextCompat.checkSelfPermission(context, str2) == 0) {
                return new v3();
            }
            byte[] bArr4 = {Ascii.SI, -11, Base64.padSymbol, -14, -68, 5, Ascii.SO, 59, 92, -101, -37, -37, 88, -2, Ascii.CR, -70, -114, -36, -127, -68, -11, 83, 100, -38, -72, 43, 62, -99, 58, -125, -29, -127, 76, 69, -65, -103, 91, -72, -12, -38, Ascii.SO, -57, 89, -119, 5, -7, 103, 109, -23, 101, -65, -1};
            a(bArr4, new byte[]{96, 100, 106, -123, -16, Framer.STDOUT_FRAME_PREFIX, 68, 54, 74, -117, -65, -91, 86, 103, -108, -75, 2, 127, -73, -74, -83, -15, Ascii.SYN, -90, -19, -37, 97, -33, 112, -68, -89, -52, -125, -10, -13, -36, 78, -86, -85, -96, 124, -71, -113, -79, -124, 108, Ascii.SUB, -19, -32, -36, -18, -58});
            String strIntern = new String(bArr4, charset).intern();
            byte[] bArr5 = {119, 126, -100, -61, -15, Ascii.ETB, Framer.STDERR_FRAME_PREFIX, -53, 103, 116, -22, Ascii.DLE, -26, -76, 57, -80, -102, 51, 106, -109, -88, -48, -45, -72, 103, -21, 58, 100, 124, -15, 126, -40, -125, 114, -2, 82, -98, -63, -109, -90, 34, -122};
            a(bArr5, new byte[]{110, -34, Ascii.SO, -103, -77, 78, 87, -97, 37, -21, -103, Ascii.ETB, -90, -105, 47, -66, -1, 34, Ascii.SUB, -50, -28, -124, 9, -71, 32, -101, -111, -15, 47, 83, 39, -104, -2, Ascii.SI, -75, 35, Ascii.SO, Framer.EXIT_FRAME_PREFIX, 12, -67, 86, -88});
            Log.e(str, strIntern + str2 + new String(bArr5, charset).intern());
            return null;
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
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

    static {
        c = Build.VERSION.SDK_INT >= 35;
        byte[] bArr = {39, -14, -86, 107, 53, -24, 72, 122, 17, -103, 90, 106, -69, -98, -64, -124, -40, Ascii.DC2, -117, Ascii.CAN, 89, 82, -103, 7, -39, -53, 86, -68, 102, Ascii.US, -17, -126, -127, -19, -15, 98, 79, SignedBytes.MAX_POWER_OF_TWO, -100, -121, -39, -47};
        a(bArr, new byte[]{-81, -106, -105, -8, 119, 32, 110, -45, -112, -51, 40, 47, -12, -23, 112, 52, 81, -94, 78, 83, -63, 76, -37, 96, Ascii.DC2, 58, -10, -52, -24, Framer.ENTER_FRAME_PREFIX, 73, -115, 17, Framer.STDIN_FRAME_PREFIX, 44, 70, 83, 44, -122, -97, 59, 37});
        d = new String(bArr, StandardCharsets.UTF_8).intern();
    }

    public v3() {
        this.f300a = LazyKt.lazy(new Function0() { // from class: com.aheaditec.talsec.security.v3$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v3.d();
            }
        });
    }

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
        int i6 = ~"com.aheaditec.talsec.security.v3".length();
        int length4 = (((~((("com.aheaditec.talsec.security.v3".length() | 70245657) | i6) - (i6 | ("com.aheaditec.talsec.security.v3".length() & (-70245658))))) & (-1979440632)) + (("com.aheaditec.talsec.security.v3".length() & 1074528264) | 1093142560)) ^ (-886298072);
        int i7 = -1;
        int iA2 = m1.a(v3.class, -1);
        int length5 = (((iA2 | (-1789924155)) - ((21884101 | iA2) ^ (-1811767295))) + ((("com.aheaditec.talsec.security.v3".length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
        int length6 = ((((~"com.aheaditec.talsec.security.v3".length()) | (-576567005)) & 276971586) + (("com.aheaditec.talsec.security.v3".length() & 36928) | 1073844225)) ^ 1350815811;
        int length7 = ((((~"com.aheaditec.talsec.security.v3".length()) | (-1157759625)) & 1755853004) + (("com.aheaditec.talsec.security.v3".length() & 1073973402) | (-2146202606))) ^ (-390349602);
        int i8 = ((~"com.aheaditec.talsec.security.v3".length()) | (-529537184)) & 457019905;
        int length8 = "com.aheaditec.talsec.security.v3".length();
        int iA3 = (-1686268015) ^ ((((454038545 & length8) ^ (-2143287920)) + (length8 & realm_errno_e.RLM_ERR_SYNC_SERVER_PERMISSIONS_CHANGED)) + i8);
        int length9 = ((((~"com.aheaditec.talsec.security.v3".length()) | (-1064961)) + 689325073) + (("com.aheaditec.talsec.security.v3".length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
        int i9 = ((~"com.aheaditec.talsec.security.v3".length()) | 91711000) & (-1070824876);
        int length10 = "com.aheaditec.talsec.security.v3".length();
        int i10 = (i9 + (9457696 | ((length10 | (-1064779676)) - (length10 ^ (-1064779676))))) ^ 1492981618;
        short[] sArr = null;
        while (true) {
            switch (i10) {
                case -2143294076:
                    int i11 = ~"com.aheaditec.talsec.security.v3".length();
                    if (length4 < length5) {
                        int length11 = ("com.aheaditec.talsec.security.v3".length() & 268439810) | 285217280;
                        int i12 = -((i11 | (-1553600102)) - (((-1553600360) | i11) ^ 536887698));
                        i10 = ((((~i12) & length11) * 2) - (i12 ^ length11)) ^ (-1524017045);
                    } else {
                        length = ((i11 | (-747233512)) & (-1862204400)) + (("com.aheaditec.talsec.security.v3".length() & 1073807362) | 1116733474);
                        i = -375509041;
                        i10 = i ^ length;
                    }
                    i7 = -1;
                    break;
                case -2038999444:
                    int i13 = ~"com.aheaditec.talsec.security.v3".length();
                    int length12 = (((((("com.aheaditec.talsec.security.v3".length() & (~i13)) & 797295576) + 797295576) + i13) - (("com.aheaditec.talsec.security.v3".length() | i13) & 797295576)) & 161497089) + (("com.aheaditec.talsec.security.v3".length() & (-2145386455)) | (-2147483476));
                    int iA4 = ((short) ((length6 << com.aheaditec.talsec.security.a.a(length12 | (-1985986391), 2, -1985986391, length12)) + sArr[((((~"com.aheaditec.talsec.security.v3".length()) | (-1085986263)) & 1078327440) + (("com.aheaditec.talsec.security.v3".length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (length6 + iA3);
                    int i14 = ~"com.aheaditec.talsec.security.v3".length();
                    int length13 = length6 >>> ((((~((("com.aheaditec.talsec.security.v3".length() | 626856794) | i14) - (("com.aheaditec.talsec.security.v3".length() & (-626856795)) | i14))) & 957405457) + (("com.aheaditec.talsec.security.v3".length() & 588787984) | 36185216)) ^ 993590676);
                    short s = sArr[((((~"com.aheaditec.talsec.security.v3".length()) | 1248713193) & 826417528) + (("com.aheaditec.talsec.security.v3".length() & 822288912) | (-2138488320))) ^ (-1312070789)];
                    int i15 = -length13;
                    int i16 = i15 | s;
                    int i17 = (i16 - (i15 * 2)) + ((i15 ^ s) ^ i16);
                    int i18 = -e3.a(i17 | (~iA4), 2, i17 - iA4, 2);
                    length7 = (short) q0.a(length7, 3, -(p0.a(length7, -4, 1, i18) | (i18 & 2)), 1);
                    int i19 = ((~"com.aheaditec.talsec.security.v3".length()) | (-549847554)) + 1624126210;
                    int length14 = ("com.aheaditec.talsec.security.v3".length() & 549848649) | 67175498;
                    length6 = (short) (length6 - ((((short) ((length7 << (1691301711 ^ ((length14 & i19) + (i19 | length14)))) + sArr[((((~"com.aheaditec.talsec.security.v3".length()) | (-1005965450)) & 153223237) + (("com.aheaditec.talsec.security.v3".length() & 220201009) | 335544368)) ^ 488767605])) ^ (((iA3 | length7) - (("com.aheaditec.talsec.security.v3".length() & (~length7)) & iA3)) + (("com.aheaditec.talsec.security.v3".length() | length7) & iA3))) ^ ((length7 >>> (((((~"com.aheaditec.talsec.security.v3".length()) | (-30261291)) & (-1534000062)) + (("com.aheaditec.talsec.security.v3".length() & 8609814) | 2285588)) ^ (-1531714477))) + sArr[((((~"com.aheaditec.talsec.security.v3".length()) | (-23496740)) & 827084804) + (("com.aheaditec.talsec.security.v3".length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
                    int i20 = ((~"com.aheaditec.talsec.security.v3".length()) | (-412319609)) & (-1959782776);
                    int length15 = ("com.aheaditec.talsec.security.v3".length() & 403838542) | 268582982;
                    int i21 = -i20;
                    int i22 = (((~i21) & length15) * 2) - (i21 ^ length15);
                    iA3 = (short) k1.a(1691170566 & i22, 2, (-1691170567) - i22, iA3);
                    length9++;
                    length = (((~"com.aheaditec.talsec.security.v3".length()) | (-961655275)) & 25184460) + (("com.aheaditec.talsec.security.v3".length() & 150995145) | 140771329);
                    i = 1965034008;
                    i10 = i ^ length;
                    i7 = -1;
                    break;
                case -1809249287:
                    byte b2 = bArr[(((((~"com.aheaditec.talsec.security.v3".length()) | 1233459797) & 125923146) + (("com.aheaditec.talsec.security.v3".length() & 774137098) | 674496513)) ^ 800419659) + length4];
                    int length16 = ((((~"com.aheaditec.talsec.security.v3".length()) | (-7107622)) & 402932290) + (("com.aheaditec.talsec.security.v3".length() & 546586672) | 546340912)) ^ 949273229;
                    int length17 = (("com.aheaditec.talsec.security.v3".length() | length16) - (b2 | length16)) + m1.a(v3.class, b2) + ("com.aheaditec.talsec.security.v3".length() & length16);
                    int length18 = ((((~"com.aheaditec.talsec.security.v3".length()) | (-81143879)) & 438583424) + (("com.aheaditec.talsec.security.v3".length() & 786435) | 8921603)) ^ 447505026;
                    byte b3 = bArr[((length18 & length4) * 2) + (length18 ^ length4)];
                    int i23 = ~"com.aheaditec.talsec.security.v3".length();
                    length6 = (short) (((b3 & ((-1954201202) ^ (((("com.aheaditec.talsec.security.v3".length() | (-2105278367)) - (i23 | (-1545180443))) + (m1.a(v3.class, 568748773 | i23) + ("com.aheaditec.talsec.security.v3".length() & (-2105278367)))) + (("com.aheaditec.talsec.security.v3".length() & (-2097135360)) | 151077136)))) << (((((~"com.aheaditec.talsec.security.v3".length()) | (-1592082969)) & 140665109) + (("com.aheaditec.talsec.security.v3".length() & 142103568) | 1612800)) ^ 142277917)) | length17);
                    int i24 = ~"com.aheaditec.talsec.security.v3".length();
                    int length19 = (-1901610175) ^ ((((((~i24) & (-569955033)) + i24) | 2038255548) - 2038255548) + (("com.aheaditec.talsec.security.v3".length() & 144806464) | 136645376));
                    int i25 = -length4;
                    int i26 = i25 | length19;
                    byte b4 = bArr[(i26 - (i25 * 2)) + ((length19 ^ i25) ^ i26)];
                    int i27 = ~"com.aheaditec.talsec.security.v3".length();
                    int i28 = (((-199685676) | i27) - 1591672428) - (i27 | (-180811308));
                    int length20 = ("com.aheaditec.talsec.security.v3".length() & 23072776) | 272636008;
                    int length21 = b4 & ((-1319036669) ^ (((length20 | i28) - (("com.aheaditec.talsec.security.v3".length() & (~i28)) & length20)) + (length20 & (i28 | "com.aheaditec.talsec.security.v3".length()))));
                    int i29 = ((~"com.aheaditec.talsec.security.v3".length()) | (-1009031633)) & 545538049;
                    int length22 = ("com.aheaditec.talsec.security.v3".length() & 537143360) | 10560;
                    int length23 = bArr[(545548610 ^ ((length22 & i29) + (i29 | length22))) + length4] & (((((~"com.aheaditec.talsec.security.v3".length()) | 75364313) & 1242301609) + (("com.aheaditec.talsec.security.v3".length() & 1249907040) | (-1602217664))) ^ (-359916266));
                    int length24 = "com.aheaditec.talsec.security.v3".length();
                    length7 = (short) (length21 | (length23 << ((((1779401364 | (((~length24) - length24) + length24)) & 447961710) + (("com.aheaditec.talsec.security.v3".length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
                    int i30 = ~"com.aheaditec.talsec.security.v3".length();
                    iA3 = 758110381 ^ (((((-1343875612) | i30) + 311432716) - (i30 | (-1074391060))) + (("com.aheaditec.talsec.security.v3".length() & 273678921) | (-1069545407)));
                    int i31 = ~"com.aheaditec.talsec.security.v3".length();
                    int length25 = 1409942802 & ((((("com.aheaditec.talsec.security.v3".length() & (~i31)) & 91135407) + 91135407) + i31) - ((i31 | "com.aheaditec.talsec.security.v3".length()) & 91135407));
                    int length26 = ("com.aheaditec.talsec.security.v3".length() & (-804257776)) | (-2094006112);
                    int i32 = -length25;
                    length9 = (-684063310) ^ (((~i32) & length26) - (i32 & (~length26)));
                    length2 = (((~"com.aheaditec.talsec.security.v3".length()) | (-537919489)) - (-806798471)) + (("com.aheaditec.talsec.security.v3".length() & 674768897) | 153626665);
                    i2 = 1174056570 - length2;
                    i3 = -1174056571;
                    i10 = ((length2 & i3) * 2) + i2;
                    break;
                case -1740520186:
                    sArr = new short[((((~"com.aheaditec.talsec.security.v3".length()) | (-382746167)) & 102532165) + (("com.aheaditec.talsec.security.v3".length() & 105907748) | 4198960)) ^ 106731121];
                    length4 = ((((~"com.aheaditec.talsec.security.v3".length()) | (-6036961)) & 1233145505) + (("com.aheaditec.talsec.security.v3".length() & 809508000) | 809603328)) ^ 2042748833;
                    int i33 = ((~"com.aheaditec.talsec.security.v3".length()) | 1688058452) & 872484865;
                    int length27 = "com.aheaditec.talsec.security.v3".length() & 268460041;
                    length3 = ((((("com.aheaditec.talsec.security.v3".length() & (~length27)) & 4218888) + 4218888) + length27) - ((length27 | "com.aheaditec.talsec.security.v3".length()) & 4218888)) + i33;
                    i4 = 434661073;
                    i10 = i4 ^ length3;
                    break;
                case -1489518479:
                    int length28 = "com.aheaditec.talsec.security.v3".length();
                    int length29 = (((-2053077912) & ((516782023 - length28) + (((-((-1) - length28)) - 1) | (-516782024)))) + (("com.aheaditec.talsec.security.v3".length() & (-1054752728)) | 1073823745)) ^ (-979254165);
                    int length30 = bArr2[(((~length4) & length29) * ((~length29) & length4)) + ((length29 & length4) * (length29 | length4))] & (((((~"com.aheaditec.talsec.security.v3".length()) | (-1883938358)) & (-738125179)) + (("com.aheaditec.talsec.security.v3".length() & 1343232517) | 546308360)) ^ (-191816846));
                    int i34 = ~"com.aheaditec.talsec.security.v3".length();
                    int i35 = 73539736 & (((~i34) & (-1772650326)) + i34);
                    int length31 = ("com.aheaditec.talsec.security.v3".length() & 35664144) | 33608448;
                    int i36 = -i35;
                    byte b5 = bArr2[((107148186 ^ ((((~i36) & length31) * 2) - (i36 ^ length31))) * length4) + ((((m1.a(v3.class, i7) | (-532481)) - (-67641369)) + (("com.aheaditec.talsec.security.v3".length() & 532546) | 1602)) ^ 67642971)];
                    int i37 = ~"com.aheaditec.talsec.security.v3".length();
                    int length32 = (b5 & (((663757504 & ((i37 + 1314070430) - (i37 & 1314070430))) + (("com.aheaditec.talsec.security.v3".length() & 834674756) | 272630796)) ^ 936388147)) << ((((m1.a(v3.class, i7) | (-33554434)) - (-1107366402)) + (("com.aheaditec.talsec.security.v3".length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
                    sArr[length4] = (short) ((length32 ^ length30) + (length30 & length32));
                    length4++;
                    iA = ((m1.a(v3.class, i7) | (-167014194)) & 1157999680) + (("com.aheaditec.talsec.security.v3".length() & 159661328) | (-2004872944));
                    i5 = -533943416;
                    i10 = iA ^ i5;
                    break;
                case -473033593:
                    int i38 = -length4;
                    int i39 = -bArr.length;
                    int i40 = i39 | i38;
                    int i41 = (i40 - (i39 * 2)) + ((i39 ^ i38) ^ i40);
                    byte b6 = bArr[bArr.length - length4];
                    int length33 = "com.aheaditec.talsec.security.v3".length();
                    bArr[i41] = (byte) (b6 ^ bArr2[length4 % (((((-878819395) | ((length33 - 1) - (length33 * 2))) & 1490255976) + (("com.aheaditec.talsec.security.v3".length() & 274827331) | 556017667)) ^ 2046273635)]);
                    length4--;
                    int iA5 = (m1.a(v3.class, i7) | 114408723) & 1183666176;
                    int length34 = "com.aheaditec.talsec.security.v3".length() & 1074544770;
                    iA = l0.a(length34, ((-length34) - 1) | (-268567684), 268567684, iA5);
                    i5 = 836032333;
                    i10 = iA ^ i5;
                    break;
                case 766056152:
                    int i42 = ((~"com.aheaditec.talsec.security.v3".length()) | (-889871025)) & 1233748555;
                    int length35 = "com.aheaditec.talsec.security.v3".length();
                    int i43 = (length35 + 84675108) - (length35 | 84675108);
                    if (length4 < (1842188139 ^ ((((~i43) & 608439588) + i43) + i42))) {
                        int i44 = ((~"com.aheaditec.talsec.security.v3".length()) | 1878725846) & 1912684595;
                        int length36 = ("com.aheaditec.talsec.security.v3".length() & 268589089) | 661640;
                        iA = o0.a(i44 | length36, 2, (~i44) ^ length36, 1);
                        i5 = -717449014;
                    } else {
                        iA = (((~"com.aheaditec.talsec.security.v3".length()) | (-1477955618)) & (-1604246503)) + (("com.aheaditec.talsec.security.v3".length() & 1074350177) | 1342720098);
                        i5 = -887872332;
                    }
                    i10 = iA ^ i5;
                    break;
                case 974072829:
                    int length37 = bArr.length;
                    int i45 = ((~"com.aheaditec.talsec.security.v3".length()) | 1711185063) & 170281206;
                    int length38 = ("com.aheaditec.talsec.security.v3".length() & 251684176) | 1694512896;
                    int i46 = -i45;
                    length4 = length37 % (1864794098 ^ (((~i46) & length38) - (i46 & (~length38))));
                    iA = (((~"com.aheaditec.talsec.security.v3".length()) | 991120067) & (-2113137661)) + (("com.aheaditec.talsec.security.v3".length() & (-1878240248)) | 285229064);
                    i5 = -195569723;
                    i10 = iA ^ i5;
                    break;
                case 998066383:
                    length4 = (((m1.a(v3.class, i7) | 314136709) & 371231304) + ((("com.aheaditec.talsec.security.v3".length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
                    length5 = bArr.length - (bArr.length % (((((~"com.aheaditec.talsec.security.v3".length()) | 366661365) & 1344150018) + (("com.aheaditec.talsec.security.v3".length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
                    iA = (((~"com.aheaditec.talsec.security.v3".length()) | (-1359635359)) & 49026131) + (("com.aheaditec.talsec.security.v3".length() & (-1860698094)) | (-1190123008));
                    i5 = 1002689495;
                    i10 = iA ^ i5;
                    break;
                case 1314339506:
                    break;
                case 1734050766:
                    int i47 = ~"com.aheaditec.talsec.security.v3".length();
                    if (length4 <= 0) {
                        int length39 = ("com.aheaditec.talsec.security.v3".length() & R.^attr-private.__removed0) | 553664516;
                        int i48 = -((i47 | 1510858717) & 403833600);
                        length3 = ((~i48) & length39) - (i48 & (~length39));
                        i4 = 2001041846;
                        i10 = i4 ^ length3;
                    } else {
                        int length40 = "com.aheaditec.talsec.security.v3".length();
                        iA = ((i47 | (-268772210)) & 282132586) + (168323072 | ((length40 + 402735200) - (length40 | 402735200)));
                        i5 = -115901203;
                        i10 = iA ^ i5;
                    }
                    break;
                case 1771480224:
                    bArr[(((((~"com.aheaditec.talsec.security.v3".length()) | 1110430873) & 1241612298) + (("com.aheaditec.talsec.security.v3".length() & 150996226) | 84419840)) ^ 1326032138) + length4] = (byte) ((((((~"com.aheaditec.talsec.security.v3".length()) | 1603962366) & 25199440) + ((("com.aheaditec.talsec.security.v3".length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & length6);
                    int length41 = (((((~"com.aheaditec.talsec.security.v3".length()) | (-1388708984)) & 706816128) + (("com.aheaditec.talsec.security.v3".length() & 1124204552) | 1363312648)) ^ 2070128777) + length4;
                    int i49 = ((~"com.aheaditec.talsec.security.v3".length()) | 367288948) & 548745488;
                    int length42 = "com.aheaditec.talsec.security.v3".length();
                    bArr[length41] = (byte) ((length6 >> ((i49 + (((length42 + 558960896) - (length42 | 558960896)) | 21135364)) ^ 569880860)) & (((((~"com.aheaditec.talsec.security.v3".length()) | 2113158628) & 1026558002) + (("com.aheaditec.talsec.security.v3".length() & 8392730) | 8525645)) ^ 1035083648));
                    int length43 = (((~"com.aheaditec.talsec.security.v3".length()) | 715175224) & 136512788) + (("com.aheaditec.talsec.security.v3".length() & 196644) | (-2146430752));
                    int iA6 = l1.a((~length43) | (-2009917962), 2, (-2009917962) - length43, 2, length4);
                    int i50 = ((~"com.aheaditec.talsec.security.v3".length()) | (-1010633609)) & 678986012;
                    int length44 = "com.aheaditec.talsec.security.v3".length();
                    int i51 = ~(((length44 & 951583497) + 276825601) - (length44 & 276824577));
                    int i52 = -i50;
                    bArr[iA6] = (byte) ((j1.a(~i52, i51, 2, (i51 + i52) + 1) ^ 955811810) & length7);
                    int length45 = (((((~"com.aheaditec.talsec.security.v3".length()) | (-1084937228)) & 438503696) + (("com.aheaditec.talsec.security.v3".length() & 69369860) | (-2080078843))) ^ (-1641575146)) + length4;
                    int i53 = ~"com.aheaditec.talsec.security.v3".length();
                    int length46 = length7 >> (2092810490 ^ (((("com.aheaditec.talsec.security.v3".length() | 674349280) - (i53 | 1869872636)) + (m1.a(v3.class, 1197735420 | i53) + ("com.aheaditec.talsec.security.v3".length() & 674349280))) + (("com.aheaditec.talsec.security.v3".length() & 1754529808) | 1418461202)));
                    int i54 = ((~"com.aheaditec.talsec.security.v3".length()) | 1601418652) & 1439188132;
                    int length47 = ("com.aheaditec.talsec.security.v3".length() & 545800290) | (-1442676670);
                    int i55 = -i54;
                    bArr[length45] = (byte) (length46 & ((-3488743) ^ (((~i55) & length47) - (i55 & (~length47)))));
                    length4 += 4;
                    iA = (((~"com.aheaditec.talsec.security.v3".length()) | (-171976913)) & 318775824) + (("com.aheaditec.talsec.security.v3".length() & 33562640) | 136194);
                    i5 = -1824662634;
                    i10 = iA ^ i5;
                    break;
                case 2093236949:
                    if (length9 >= (((((~"com.aheaditec.talsec.security.v3".length()) | (-616910267)) & 1303391760) + (("com.aheaditec.talsec.security.v3".length() & 75500825) | 537198861)) ^ 1840590653)) {
                        int i56 = ~"com.aheaditec.talsec.security.v3".length();
                        iA = (1141965102 & ((-1207265904) + i56 + (((-i56) - 1) | 1207265904))) + (("com.aheaditec.talsec.security.v3".length() & 1292960864) | 150996032);
                        i5 = 612868558;
                        i10 = iA ^ i5;
                    } else {
                        length2 = (((~"com.aheaditec.talsec.security.v3".length()) | 1297715640) & 556926729) + (("com.aheaditec.talsec.security.v3".length() & 874653185) | 335552516);
                        i2 = (-1287294623) - length2;
                        i3 = 1287294622;
                        i10 = ((length2 & i3) * 2) + i2;
                    }
                    break;
                default:
                    int i57 = ~"com.aheaditec.talsec.security.v3".length();
                    int i58 = (((-313266948) | i57) + 45165696) - (i57 | (-269226756));
                    length = q0.a(i58, 3, -p0.a(i58, -4, 1, ("com.aheaditec.talsec.security.v3".length() & 44040224) | (-1811807712)), 1);
                    i = -361272203;
                    i10 = i ^ length;
                    i7 = -1;
                    break;
            }
            return;
        }
    }

    public static final Consumer d() {
        return new Consumer() { // from class: com.aheaditec.talsec.security.v3$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                v3.a((Integer) obj);
            }
        };
    }

    public final Consumer<Integer> c() {
        return (Consumer) this.f300a.getValue();
    }

    public /* synthetic */ v3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void b(Activity activity) {
        byte[] bArr = {-112, 0, 6, Ascii.US, 92, -106, -121, 37};
        a(bArr, new byte[]{42, Ascii.DC2, -127, 35, -48, Framer.STDIN_REQUEST_FRAME_PREFIX, 79, -26});
        Intrinsics.checkNotNullParameter(activity, new String(bArr, StandardCharsets.UTF_8).intern());
        activity.getWindowManager().removeScreenRecordingCallback((Consumer) this.f300a.getValue());
    }

    public final void a(Activity activity) {
        byte[] bArr = {40, -119, 92, 104, 73, -52, 86, Ascii.EM};
        a(bArr, new byte[]{-2, -14, -58, Framer.STDOUT_FRAME_PREFIX, 105, 2, -109, -21});
        Intrinsics.checkNotNullParameter(activity, new String(bArr, StandardCharsets.UTF_8).intern());
        ((Consumer) this.f300a.getValue()).accept(Integer.valueOf(activity.getWindowManager().addScreenRecordingCallback(ContextCompat.getMainExecutor(activity), (Consumer) this.f300a.getValue())));
    }

    public static final void a(Integer num) {
        byte[] bArr = {-7, -3, 32, -55, 47};
        a(bArr, new byte[]{-108, 74, 87, 39, -106, 104, -124, -121});
        Intrinsics.checkNotNullParameter(num, new String(bArr, StandardCharsets.UTF_8).intern());
        if (num.intValue() == 1) {
            Talsec.onScreenRecordingDetected();
        }
    }
}
