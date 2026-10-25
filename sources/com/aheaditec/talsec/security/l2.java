package com.aheaditec.talsec.security;

import android.R;
import android.content.Context;
import android.util.Base64;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import io.realm.kotlin.internal.interop.realm_errno_e;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class l2 extends d2 {
    public static final String i;
    public static final String j;
    public static final String k;
    public final String g;
    public final s0 h;

    static {
        byte[] bArr = {69, 96, -117, -119, -15};
        a(bArr, new byte[]{94, -126, -44, -49, 59, 2, -88, -92});
        Charset charset = StandardCharsets.UTF_8;
        k = new String(bArr, charset).intern();
        byte[] bArr2 = {-109, 91, 5, 81, -121, 77, -66, 57, 36, -68, Framer.EXIT_FRAME_PREFIX, -35, 71, -90, -100, -80, -23, -75, -54, -41, -114, -73, -18, -110, 101, 113, -13};
        a(bArr2, new byte[]{-22, -105, Ascii.DC4, 17, 126, Framer.EXIT_FRAME_PREFIX, 54, 47, 124, -5, 107, 106, -107, -33, 79, Ascii.RS, -37, 85, 66, -53, -24, 43, 6, 101, 99, -2, -68});
        j = new String(bArr2, charset).intern();
        byte[] bArr3 = {54, Framer.STDERR_FRAME_PREFIX, -127, -77, 100, -28, -46, -9, -118, Framer.STDERR_FRAME_PREFIX};
        a(bArr3, new byte[]{Framer.EXIT_FRAME_PREFIX, 86, -61, 123, -7, 102, -17, -72, -69, -89});
        i = new String(bArr3, charset).intern();
    }

    public l2(Context context) {
        super(context);
        byte[] bArr = {44, Ascii.GS, -9, -114, 83, 35, -69, 116, -64, -43};
        a(bArr, new byte[]{Ascii.CR, -79, -119, -105, Framer.STDERR_FRAME_PREFIX, -68, -124, -72, -56, Ascii.GS});
        Charset charset = StandardCharsets.UTF_8;
        String strA = a(new String(bArr, charset).intern());
        if (strA == null) {
            String string = UUID.randomUUID().toString();
            this.g = string;
            byte[] bArr2 = {Ascii.SO, 71, -20, 72, -40, 125, 9, -22, 59, 6};
            a(bArr2, new byte[]{SignedBytes.MAX_POWER_OF_TWO, 98, 114, -52, 115, -74, -92, -126, -39, 119});
            a(new String(bArr2, charset).intern(), string);
        } else {
            this.g = strA;
        }
        this.h = new s0(context);
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
        int i7 = ~"com.aheaditec.talsec.security.l2".length();
        int length4 = (((~((("com.aheaditec.talsec.security.l2".length() | 70245657) | i7) - (i7 | ("com.aheaditec.talsec.security.l2".length() & (-70245658))))) & (-1979440632)) + (("com.aheaditec.talsec.security.l2".length() & 1074528264) | 1093142560)) ^ (-886298072);
        int i8 = -1;
        int iA2 = m1.a(l2.class, -1);
        int length5 = (((iA2 | (-1789924155)) - ((21884101 | iA2) ^ (-1811767295))) + ((("com.aheaditec.talsec.security.l2".length() | 1811808253) - 1811808253) | 537399298)) ^ (-1274367997);
        int length6 = ((((~"com.aheaditec.talsec.security.l2".length()) | (-576567005)) & 276971586) + (("com.aheaditec.talsec.security.l2".length() & 36928) | 1073844225)) ^ 1350815811;
        int length7 = ((((~"com.aheaditec.talsec.security.l2".length()) | (-1157759625)) & 1755853004) + (("com.aheaditec.talsec.security.l2".length() & 1073973402) | (-2146202606))) ^ (-390349602);
        int i9 = ((~"com.aheaditec.talsec.security.l2".length()) | (-529537184)) & 457019905;
        int length8 = "com.aheaditec.talsec.security.l2".length();
        int iA3 = (-1686268015) ^ ((((454038545 & length8) ^ (-2143287920)) + (length8 & realm_errno_e.RLM_ERR_SYNC_SERVER_PERMISSIONS_CHANGED)) + i9);
        int length9 = ((((~"com.aheaditec.talsec.security.l2".length()) | (-1064961)) + 689325073) + (("com.aheaditec.talsec.security.l2".length() & (-2112862208)) | (-2109732696))) ^ (-1420407624);
        int i10 = ((~"com.aheaditec.talsec.security.l2".length()) | 91711000) & (-1070824876);
        int length10 = "com.aheaditec.talsec.security.l2".length();
        int i11 = (i10 + (9457696 | ((length10 | (-1064779676)) - (length10 ^ (-1064779676))))) ^ 1492981618;
        short[] sArr = null;
        while (true) {
            switch (i11) {
                case -2143294076:
                    int i12 = ~"com.aheaditec.talsec.security.l2".length();
                    if (length4 < length5) {
                        int length11 = ("com.aheaditec.talsec.security.l2".length() & 268439810) | 285217280;
                        int i13 = -((i12 | (-1553600102)) - (((-1553600360) | i12) ^ 536887698));
                        i11 = ((((~i13) & length11) * 2) - (i13 ^ length11)) ^ (-1524017045);
                    } else {
                        length = ((i12 | (-747233512)) & (-1862204400)) + (("com.aheaditec.talsec.security.l2".length() & 1073807362) | 1116733474);
                        i2 = -375509041;
                        i11 = i2 ^ length;
                    }
                    i8 = -1;
                    break;
                case -2038999444:
                    int i14 = ~"com.aheaditec.talsec.security.l2".length();
                    int length12 = (((((("com.aheaditec.talsec.security.l2".length() & (~i14)) & 797295576) + 797295576) + i14) - (("com.aheaditec.talsec.security.l2".length() | i14) & 797295576)) & 161497089) + (("com.aheaditec.talsec.security.l2".length() & (-2145386455)) | (-2147483476));
                    int iA4 = ((short) ((length6 << a.a(length12 | (-1985986391), 2, -1985986391, length12)) + sArr[((((~"com.aheaditec.talsec.security.l2".length()) | (-1085986263)) & 1078327440) + (("com.aheaditec.talsec.security.l2".length() & 1612763792) | 674234944)) ^ 1752562386])) ^ (length6 + iA3);
                    int i15 = ~"com.aheaditec.talsec.security.l2".length();
                    int length13 = length6 >>> ((((~((("com.aheaditec.talsec.security.l2".length() | 626856794) | i15) - (("com.aheaditec.talsec.security.l2".length() & (-626856795)) | i15))) & 957405457) + (("com.aheaditec.talsec.security.l2".length() & 588787984) | 36185216)) ^ 993590676);
                    short s = sArr[((((~"com.aheaditec.talsec.security.l2".length()) | 1248713193) & 826417528) + (("com.aheaditec.talsec.security.l2".length() & 822288912) | (-2138488320))) ^ (-1312070789)];
                    int i16 = -length13;
                    int i17 = i16 | s;
                    int i18 = (i17 - (i16 * 2)) + ((i16 ^ s) ^ i17);
                    int i19 = -e3.a(i18 | (~iA4), 2, i18 - iA4, 2);
                    length7 = (short) q0.a(length7, 3, -(p0.a(length7, -4, 1, i19) | (i19 & 2)), 1);
                    int i20 = ((~"com.aheaditec.talsec.security.l2".length()) | (-549847554)) + 1624126210;
                    int length14 = ("com.aheaditec.talsec.security.l2".length() & 549848649) | 67175498;
                    length6 = (short) (length6 - ((((short) ((length7 << (1691301711 ^ ((length14 & i20) + (i20 | length14)))) + sArr[((((~"com.aheaditec.talsec.security.l2".length()) | (-1005965450)) & 153223237) + (("com.aheaditec.talsec.security.l2".length() & 220201009) | 335544368)) ^ 488767605])) ^ (((iA3 | length7) - (("com.aheaditec.talsec.security.l2".length() & (~length7)) & iA3)) + (("com.aheaditec.talsec.security.l2".length() | length7) & iA3))) ^ ((length7 >>> (((((~"com.aheaditec.talsec.security.l2".length()) | (-30261291)) & (-1534000062)) + (("com.aheaditec.talsec.security.l2".length() & 8609814) | 2285588)) ^ (-1531714477))) + sArr[((((~"com.aheaditec.talsec.security.l2".length()) | (-23496740)) & 827084804) + (("com.aheaditec.talsec.security.l2".length() & (-2117787632)) | (-2139021104))) ^ (-1311936299)])));
                    int i21 = ((~"com.aheaditec.talsec.security.l2".length()) | (-412319609)) & (-1959782776);
                    int length15 = ("com.aheaditec.talsec.security.l2".length() & 403838542) | 268582982;
                    int i22 = -i21;
                    int i23 = (((~i22) & length15) * 2) - (i22 ^ length15);
                    iA3 = (short) k1.a(1691170566 & i23, 2, (-1691170567) - i23, iA3);
                    length9++;
                    length = (((~"com.aheaditec.talsec.security.l2".length()) | (-961655275)) & 25184460) + (("com.aheaditec.talsec.security.l2".length() & 150995145) | 140771329);
                    i2 = 1965034008;
                    i11 = i2 ^ length;
                    i8 = -1;
                    break;
                case -1809249287:
                    byte b = bArr[(((((~"com.aheaditec.talsec.security.l2".length()) | 1233459797) & 125923146) + (("com.aheaditec.talsec.security.l2".length() & 774137098) | 674496513)) ^ 800419659) + length4];
                    int length16 = ((((~"com.aheaditec.talsec.security.l2".length()) | (-7107622)) & 402932290) + (("com.aheaditec.talsec.security.l2".length() & 546586672) | 546340912)) ^ 949273229;
                    int length17 = (("com.aheaditec.talsec.security.l2".length() | length16) - (b | length16)) + m1.a(l2.class, b) + ("com.aheaditec.talsec.security.l2".length() & length16);
                    int length18 = ((((~"com.aheaditec.talsec.security.l2".length()) | (-81143879)) & 438583424) + (("com.aheaditec.talsec.security.l2".length() & 786435) | 8921603)) ^ 447505026;
                    byte b2 = bArr[((length18 & length4) * 2) + (length18 ^ length4)];
                    int i24 = ~"com.aheaditec.talsec.security.l2".length();
                    length6 = (short) (((b2 & ((-1954201202) ^ (((("com.aheaditec.talsec.security.l2".length() | (-2105278367)) - (i24 | (-1545180443))) + (m1.a(l2.class, 568748773 | i24) + ("com.aheaditec.talsec.security.l2".length() & (-2105278367)))) + (("com.aheaditec.talsec.security.l2".length() & (-2097135360)) | 151077136)))) << (((((~"com.aheaditec.talsec.security.l2".length()) | (-1592082969)) & 140665109) + (("com.aheaditec.talsec.security.l2".length() & 142103568) | 1612800)) ^ 142277917)) | length17);
                    int i25 = ~"com.aheaditec.talsec.security.l2".length();
                    int length19 = (-1901610175) ^ ((((((~i25) & (-569955033)) + i25) | 2038255548) - 2038255548) + (("com.aheaditec.talsec.security.l2".length() & 144806464) | 136645376));
                    int i26 = -length4;
                    int i27 = i26 | length19;
                    byte b3 = bArr[(i27 - (i26 * 2)) + ((length19 ^ i26) ^ i27)];
                    int i28 = ~"com.aheaditec.talsec.security.l2".length();
                    int i29 = (((-199685676) | i28) - 1591672428) - (i28 | (-180811308));
                    int length20 = ("com.aheaditec.talsec.security.l2".length() & 23072776) | 272636008;
                    int length21 = b3 & ((-1319036669) ^ (((length20 | i29) - (("com.aheaditec.talsec.security.l2".length() & (~i29)) & length20)) + (length20 & (i29 | "com.aheaditec.talsec.security.l2".length()))));
                    int i30 = ((~"com.aheaditec.talsec.security.l2".length()) | (-1009031633)) & 545538049;
                    int length22 = ("com.aheaditec.talsec.security.l2".length() & 537143360) | 10560;
                    int length23 = bArr[(545548610 ^ ((length22 & i30) + (i30 | length22))) + length4] & (((((~"com.aheaditec.talsec.security.l2".length()) | 75364313) & 1242301609) + (("com.aheaditec.talsec.security.l2".length() & 1249907040) | (-1602217664))) ^ (-359916266));
                    int length24 = "com.aheaditec.talsec.security.l2".length();
                    length7 = (short) (length21 | (length23 << ((((1779401364 | (((~length24) - length24) + length24)) & 447961710) + (("com.aheaditec.talsec.security.l2".length() & (-1313580806)) | (-519831408))) ^ (-71869706))));
                    int i31 = ~"com.aheaditec.talsec.security.l2".length();
                    iA3 = 758110381 ^ (((((-1343875612) | i31) + 311432716) - (i31 | (-1074391060))) + (("com.aheaditec.talsec.security.l2".length() & 273678921) | (-1069545407)));
                    int i32 = ~"com.aheaditec.talsec.security.l2".length();
                    int length25 = 1409942802 & ((((("com.aheaditec.talsec.security.l2".length() & (~i32)) & 91135407) + 91135407) + i32) - ((i32 | "com.aheaditec.talsec.security.l2".length()) & 91135407));
                    int length26 = ("com.aheaditec.talsec.security.l2".length() & (-804257776)) | (-2094006112);
                    int i33 = -length25;
                    length9 = (-684063310) ^ (((~i33) & length26) - (i33 & (~length26)));
                    length2 = (((~"com.aheaditec.talsec.security.l2".length()) | (-537919489)) - (-806798471)) + (("com.aheaditec.talsec.security.l2".length() & 674768897) | 153626665);
                    i3 = 1174056570 - length2;
                    i4 = -1174056571;
                    i11 = ((length2 & i4) * 2) + i3;
                    break;
                case -1740520186:
                    sArr = new short[((((~"com.aheaditec.talsec.security.l2".length()) | (-382746167)) & 102532165) + (("com.aheaditec.talsec.security.l2".length() & 105907748) | 4198960)) ^ 106731121];
                    length4 = ((((~"com.aheaditec.talsec.security.l2".length()) | (-6036961)) & 1233145505) + (("com.aheaditec.talsec.security.l2".length() & 809508000) | 809603328)) ^ 2042748833;
                    int i34 = ((~"com.aheaditec.talsec.security.l2".length()) | 1688058452) & 872484865;
                    int length27 = "com.aheaditec.talsec.security.l2".length() & 268460041;
                    length3 = ((((("com.aheaditec.talsec.security.l2".length() & (~length27)) & 4218888) + 4218888) + length27) - ((length27 | "com.aheaditec.talsec.security.l2".length()) & 4218888)) + i34;
                    i5 = 434661073;
                    i11 = i5 ^ length3;
                    break;
                case -1489518479:
                    int length28 = "com.aheaditec.talsec.security.l2".length();
                    int length29 = (((-2053077912) & ((516782023 - length28) + (((-((-1) - length28)) - 1) | (-516782024)))) + (("com.aheaditec.talsec.security.l2".length() & (-1054752728)) | 1073823745)) ^ (-979254165);
                    int length30 = bArr2[(((~length4) & length29) * ((~length29) & length4)) + ((length29 & length4) * (length29 | length4))] & (((((~"com.aheaditec.talsec.security.l2".length()) | (-1883938358)) & (-738125179)) + (("com.aheaditec.talsec.security.l2".length() & 1343232517) | 546308360)) ^ (-191816846));
                    int i35 = ~"com.aheaditec.talsec.security.l2".length();
                    int i36 = 73539736 & (((~i35) & (-1772650326)) + i35);
                    int length31 = ("com.aheaditec.talsec.security.l2".length() & 35664144) | 33608448;
                    int i37 = -i36;
                    byte b4 = bArr2[((107148186 ^ ((((~i37) & length31) * 2) - (i37 ^ length31))) * length4) + ((((m1.a(l2.class, i8) | (-532481)) - (-67641369)) + (("com.aheaditec.talsec.security.l2".length() & 532546) | 1602)) ^ 67642971)];
                    int i38 = ~"com.aheaditec.talsec.security.l2".length();
                    int length32 = (b4 & (((663757504 & ((i38 + 1314070430) - (i38 & 1314070430))) + (("com.aheaditec.talsec.security.l2".length() & 834674756) | 272630796)) ^ 936388147)) << ((((m1.a(l2.class, i8) | (-33554434)) - (-1107366402)) + (("com.aheaditec.talsec.security.l2".length() & (-2113929151)) | (-2147475136))) ^ (-1040108727));
                    sArr[length4] = (short) ((length32 ^ length30) + (length30 & length32));
                    length4++;
                    iA = ((m1.a(l2.class, i8) | (-167014194)) & 1157999680) + (("com.aheaditec.talsec.security.l2".length() & 159661328) | (-2004872944));
                    i6 = -533943416;
                    i11 = iA ^ i6;
                    break;
                case -473033593:
                    int i39 = -length4;
                    int i40 = -bArr.length;
                    int i41 = i40 | i39;
                    int i42 = (i41 - (i40 * 2)) + ((i40 ^ i39) ^ i41);
                    byte b5 = bArr[bArr.length - length4];
                    int length33 = "com.aheaditec.talsec.security.l2".length();
                    bArr[i42] = (byte) (b5 ^ bArr2[length4 % (((((-878819395) | ((length33 - 1) - (length33 * 2))) & 1490255976) + (("com.aheaditec.talsec.security.l2".length() & 274827331) | 556017667)) ^ 2046273635)]);
                    length4--;
                    int iA5 = (m1.a(l2.class, i8) | 114408723) & 1183666176;
                    int length34 = "com.aheaditec.talsec.security.l2".length() & 1074544770;
                    iA = l0.a(length34, ((-length34) - 1) | (-268567684), 268567684, iA5);
                    i6 = 836032333;
                    i11 = iA ^ i6;
                    break;
                case 766056152:
                    int i43 = ((~"com.aheaditec.talsec.security.l2".length()) | (-889871025)) & 1233748555;
                    int length35 = "com.aheaditec.talsec.security.l2".length();
                    int i44 = (length35 + 84675108) - (length35 | 84675108);
                    if (length4 < (1842188139 ^ ((((~i44) & 608439588) + i44) + i43))) {
                        int i45 = ((~"com.aheaditec.talsec.security.l2".length()) | 1878725846) & 1912684595;
                        int length36 = ("com.aheaditec.talsec.security.l2".length() & 268589089) | 661640;
                        iA = o0.a(i45 | length36, 2, (~i45) ^ length36, 1);
                        i6 = -717449014;
                    } else {
                        iA = (((~"com.aheaditec.talsec.security.l2".length()) | (-1477955618)) & (-1604246503)) + (("com.aheaditec.talsec.security.l2".length() & 1074350177) | 1342720098);
                        i6 = -887872332;
                    }
                    i11 = iA ^ i6;
                    break;
                case 974072829:
                    int length37 = bArr.length;
                    int i46 = ((~"com.aheaditec.talsec.security.l2".length()) | 1711185063) & 170281206;
                    int length38 = ("com.aheaditec.talsec.security.l2".length() & 251684176) | 1694512896;
                    int i47 = -i46;
                    length4 = length37 % (1864794098 ^ (((~i47) & length38) - (i47 & (~length38))));
                    iA = (((~"com.aheaditec.talsec.security.l2".length()) | 991120067) & (-2113137661)) + (("com.aheaditec.talsec.security.l2".length() & (-1878240248)) | 285229064);
                    i6 = -195569723;
                    i11 = iA ^ i6;
                    break;
                case 998066383:
                    length4 = (((m1.a(l2.class, i8) | 314136709) & 371231304) + ((("com.aheaditec.talsec.security.l2".length() | (-67142233)) + 67142233) | (-1996488432))) ^ (-1625257128);
                    length5 = bArr.length - (bArr.length % (((((~"com.aheaditec.talsec.security.l2".length()) | 366661365) & 1344150018) + (("com.aheaditec.talsec.security.l2".length() & (-1006333853)) | (-2080341919))) ^ (-736191897)));
                    iA = (((~"com.aheaditec.talsec.security.l2".length()) | (-1359635359)) & 49026131) + (("com.aheaditec.talsec.security.l2".length() & (-1860698094)) | (-1190123008));
                    i6 = 1002689495;
                    i11 = iA ^ i6;
                    break;
                case 1314339506:
                    break;
                case 1734050766:
                    int i48 = ~"com.aheaditec.talsec.security.l2".length();
                    if (length4 <= 0) {
                        int length39 = ("com.aheaditec.talsec.security.l2".length() & R.^attr-private.__removed0) | 553664516;
                        int i49 = -((i48 | 1510858717) & 403833600);
                        length3 = ((~i49) & length39) - (i49 & (~length39));
                        i5 = 2001041846;
                        i11 = i5 ^ length3;
                    } else {
                        int length40 = "com.aheaditec.talsec.security.l2".length();
                        iA = ((i48 | (-268772210)) & 282132586) + (168323072 | ((length40 + 402735200) - (length40 | 402735200)));
                        i6 = -115901203;
                        i11 = iA ^ i6;
                    }
                    break;
                case 1771480224:
                    bArr[(((((~"com.aheaditec.talsec.security.l2".length()) | 1110430873) & 1241612298) + (("com.aheaditec.talsec.security.l2".length() & 150996226) | 84419840)) ^ 1326032138) + length4] = (byte) ((((((~"com.aheaditec.talsec.security.l2".length()) | 1603962366) & 25199440) + ((("com.aheaditec.talsec.security.l2".length() | (-1311235)) + 1311235) | (-2146172766))) ^ (-2120973555)) & length6);
                    int length41 = (((((~"com.aheaditec.talsec.security.l2".length()) | (-1388708984)) & 706816128) + (("com.aheaditec.talsec.security.l2".length() & 1124204552) | 1363312648)) ^ 2070128777) + length4;
                    int i50 = ((~"com.aheaditec.talsec.security.l2".length()) | 367288948) & 548745488;
                    int length42 = "com.aheaditec.talsec.security.l2".length();
                    bArr[length41] = (byte) ((length6 >> ((i50 + (((length42 + 558960896) - (length42 | 558960896)) | 21135364)) ^ 569880860)) & (((((~"com.aheaditec.talsec.security.l2".length()) | 2113158628) & 1026558002) + (("com.aheaditec.talsec.security.l2".length() & 8392730) | 8525645)) ^ 1035083648));
                    int length43 = (((~"com.aheaditec.talsec.security.l2".length()) | 715175224) & 136512788) + (("com.aheaditec.talsec.security.l2".length() & 196644) | (-2146430752));
                    int iA6 = l1.a((~length43) | (-2009917962), 2, (-2009917962) - length43, 2, length4);
                    int i51 = ((~"com.aheaditec.talsec.security.l2".length()) | (-1010633609)) & 678986012;
                    int length44 = "com.aheaditec.talsec.security.l2".length();
                    int i52 = ~(((length44 & 951583497) + 276825601) - (length44 & 276824577));
                    int i53 = -i51;
                    bArr[iA6] = (byte) ((j1.a(~i53, i52, 2, (i52 + i53) + 1) ^ 955811810) & length7);
                    int length45 = (((((~"com.aheaditec.talsec.security.l2".length()) | (-1084937228)) & 438503696) + (("com.aheaditec.talsec.security.l2".length() & 69369860) | (-2080078843))) ^ (-1641575146)) + length4;
                    int i54 = ~"com.aheaditec.talsec.security.l2".length();
                    int length46 = length7 >> (2092810490 ^ (((("com.aheaditec.talsec.security.l2".length() | 674349280) - (i54 | 1869872636)) + (m1.a(l2.class, 1197735420 | i54) + ("com.aheaditec.talsec.security.l2".length() & 674349280))) + (("com.aheaditec.talsec.security.l2".length() & 1754529808) | 1418461202)));
                    int i55 = ((~"com.aheaditec.talsec.security.l2".length()) | 1601418652) & 1439188132;
                    int length47 = ("com.aheaditec.talsec.security.l2".length() & 545800290) | (-1442676670);
                    int i56 = -i55;
                    bArr[length45] = (byte) (length46 & ((-3488743) ^ (((~i56) & length47) - (i56 & (~length47)))));
                    length4 += 4;
                    iA = (((~"com.aheaditec.talsec.security.l2".length()) | (-171976913)) & 318775824) + (("com.aheaditec.talsec.security.l2".length() & 33562640) | 136194);
                    i6 = -1824662634;
                    i11 = iA ^ i6;
                    break;
                case 2093236949:
                    if (length9 >= (((((~"com.aheaditec.talsec.security.l2".length()) | (-616910267)) & 1303391760) + (("com.aheaditec.talsec.security.l2".length() & 75500825) | 537198861)) ^ 1840590653)) {
                        int i57 = ~"com.aheaditec.talsec.security.l2".length();
                        iA = (1141965102 & ((-1207265904) + i57 + (((-i57) - 1) | 1207265904))) + (("com.aheaditec.talsec.security.l2".length() & 1292960864) | 150996032);
                        i6 = 612868558;
                        i11 = iA ^ i6;
                    } else {
                        length2 = (((~"com.aheaditec.talsec.security.l2".length()) | 1297715640) & 556926729) + (("com.aheaditec.talsec.security.l2".length() & 874653185) | 335552516);
                        i3 = (-1287294623) - length2;
                        i4 = 1287294622;
                        i11 = ((length2 & i4) * 2) + i3;
                    }
                    break;
                default:
                    int i58 = ~"com.aheaditec.talsec.security.l2".length();
                    int i59 = (((-313266948) | i58) + 45165696) - (i58 | (-269226756));
                    length = q0.a(i59, 3, -p0.a(i59, -4, 1, ("com.aheaditec.talsec.security.l2".length() & 44040224) | (-1811807712)), 1);
                    i2 = -361272203;
                    i11 = i2 ^ length;
                    i8 = -1;
                    break;
            }
            return;
        }
    }

    public String b() {
        return this.h.f283a;
    }

    public String c() {
        return this.g;
    }

    public byte[] d() {
        byte[] bArr = {-70, -114, -7, 107, -17};
        a(bArr, new byte[]{99, -100, -45, 87, -73, 70, -82, -24});
        Charset charset = StandardCharsets.UTF_8;
        if (!b(new String(bArr, charset).intern())) {
            return new byte[2];
        }
        byte[] bArr2 = {-56, -44, 78, -90, 6};
        a(bArr2, new byte[]{42, 117, 19, -65, 42, -67, 92, 57});
        return Base64.decode(a(new String(bArr2, charset).intern()), 2);
    }

    public void e() {
        byte[] bArr = {-72, -16, -106, -3, 34, SignedBytes.MAX_POWER_OF_TWO, 39, 111, 56, -25, -116, -92, Ascii.CAN, 108, -100, -27, 59, -63, 44, Ascii.ETB, Ascii.NAK, 126, -115, 116, -4, Ascii.SYN, -121};
        a(bArr, new byte[]{Framer.STDOUT_FRAME_PREFIX, -29, 115, -120, -59, Ascii.DC4, -67, -64, 36, 54, -70, -43, -67, 93, 76, -75, 112, kotlin.io.encoding.Base64.padSymbol, -55, 121, 83, 78, 32, 38, 41, 98, -30});
        a(new String(bArr, StandardCharsets.UTF_8).intern(), Boolean.toString(true));
    }

    public boolean f() {
        byte[] bArr = {92, -27, -22, -11, -10, 102, -52, -6, 97, -118, 60, kotlin.io.encoding.Base64.padSymbol, -112, 37, -7, -34, Ascii.SO, -100, 107, -11, -59, 93, 115, 100, 83, Ascii.GS, 100};
        a(bArr, new byte[]{-34, 0, Framer.EXIT_FRAME_PREFIX, 39, 124, -50, -107, -92, Ascii.FS, 89, 92, 73, 92, -16, 68, 52, -22, Framer.STDIN_FRAME_PREFIX, 99, 8, -38, 1, -3, -91, -31, 43, 51});
        String strA = a(new String(bArr, StandardCharsets.UTF_8).intern());
        return strA != null && Boolean.parseBoolean(strA);
    }

    public void a(byte[] bArr) {
        byte[] bArr2 = {112, -115, -36, -109, -112};
        a(bArr2, new byte[]{-66, -29, 90, -106, 100, -6, Ascii.SO, 106});
        a(new String(bArr2, StandardCharsets.UTF_8).intern(), Base64.encodeToString(bArr, 2));
    }
}
