package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {
    public static final a c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f253a;
    public final boolean b;

    public static final class a {
        public a() {
        }

        public final String a() {
            Calendar calendar = Calendar.getInstance();
            byte[] bArr = {38, 12, 12, -16, -24, -1, 79, 41, -94, -25, -118, 89, -26, -53, 86, -19, -86, 78, -73, 88, 93, -3, Ascii.SYN, Ascii.NAK, 123, -112};
            a(bArr, new byte[]{Framer.STDIN_REQUEST_FRAME_PREFIX, 117, 117, -119, -59, -78, 2, 4, -58, -125, -83, Ascii.CR, -63, -125, Ascii.RS, -41, -57, 35, -115, 43, 46, -45, 69, 70, 40, -54});
            Charset charset = StandardCharsets.UTF_8;
            String str = new SimpleDateFormat(new String(bArr, charset).intern(), Locale.ENGLISH).format(calendar.getTime());
            byte[] bArr2 = {-127, -91, Ascii.CR, 42, -65, 2, -112, -74, -78, -18, -85};
            a(bArr2, new byte[]{-25, -54, 127, 71, -34, 118, -72, -104, -100, -64, -126});
            Intrinsics.checkNotNullExpressionValue(str, new String(bArr2, charset).intern());
            return str;
        }

        public final String b() {
            byte[] bArr = {37, -51, -125, -128, 125, -51, -22, Ascii.VT, 67, -127, Framer.STDOUT_FRAME_PREFIX, -69, 123, 102, 80, -107, -84, 72, -88, -54, 104, 84, 43, -35, -2, -104};
            a(bArr, new byte[]{92, -76, -6, -7, 80, -128, -89, 38, 39, -27, Ascii.SYN, -17, 92, 46, Ascii.CAN, -81, -63, 37, -110, -71, Ascii.ESC, 122, Framer.EXIT_FRAME_PREFIX, -114, -83, -62});
            Charset charset = StandardCharsets.UTF_8;
            String str = DateTimeFormatter.ofPattern(new String(bArr, charset).intern()).withLocale(Locale.ENGLISH).withZone(ZoneId.systemDefault()).format(Instant.now());
            byte[] bArr2 = {Ascii.US, 55, -30, 3, 72, -96, 85, Framer.STDOUT_FRAME_PREFIX, -18, 113, -113};
            a(bArr2, new byte[]{121, 88, -112, 110, 41, -44, 125, Ascii.US, -64, Framer.STDIN_REQUEST_FRAME_PREFIX, -90});
            Intrinsics.checkNotNullExpressionValue(str, new String(bArr2, charset).intern());
            return str;
        }

        public final String c() {
            return b();
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
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

    static {
        byte[] bArr = {Framer.STDERR_FRAME_PREFIX, 86, Ascii.EM, 60, -84, 70, -125, 89, -34, SignedBytes.MAX_POWER_OF_TWO, -11, -56, -56, 51, 48, 89, -56, -110, -21, Ascii.SUB, -23, -92, 42, 116, Base64.padSymbol, 94};
        a(bArr, new byte[]{98, -1, 117, 44, -104, -37, -29, 91, -47, -12, -25, -125, 6, 76, -114, 74, -68, -49, -25, 80, -79, 90, -113, Ascii.SO, 110, 4});
        Charset charset = StandardCharsets.UTF_8;
        m = new String(bArr, charset).intern();
        byte[] bArr2 = {-91, -28, 110, 36, 83, -58, 76, 75, -86, -114, -101, 125, -49, -98, Framer.STDIN_REQUEST_FRAME_PREFIX, -62, Ascii.CR};
        a(bArr2, new byte[]{-32, 91, Ascii.US, 42, 81, Framer.EXIT_FRAME_PREFIX, 65, -1, -16, -78, -31, -5, -72, -64, 76, -109, 106});
        l = new String(bArr2, charset).intern();
        byte[] bArr3 = {60, -90, -46, 97, -128, -115, Base64.padSymbol};
        a(bArr3, new byte[]{112, -96, -51, -10, -12, -60, 89, Ascii.SUB});
        k = new String(bArr3, charset).intern();
        byte[] bArr4 = {-106, -22, -67, -39, -64, Ascii.SUB, 65, 119, -83, -8};
        a(bArr4, new byte[]{10, 99, -33, -93, -55, 68, 54, 2, -28, -100});
        j = new String(bArr4, charset).intern();
        byte[] bArr5 = {78, 126, 100, -74, Framer.ENTER_FRAME_PREFIX, 55, 71, Ascii.SYN, -59};
        a(bArr5, new byte[]{56, -19, Ascii.FS, -86, 106, 34, Utf8.REPLACEMENT_BYTE, 92, -96});
        i = new String(bArr5, charset).intern();
        byte[] bArr6 = {-14, -91, -99, -83, 51, 109, 40, 3};
        a(bArr6, new byte[]{-103, -103, Ascii.DC2, -63, 108, -46, 111, 85});
        h = new String(bArr6, charset).intern();
        byte[] bArr7 = {32, -99, 4, Ascii.EM, 71, -73, 54, 69};
        a(bArr7, new byte[]{91, -56, -120, 87, 59, -94, -107, 8});
        g = new String(bArr7, charset).intern();
        byte[] bArr8 = {Framer.STDIN_FRAME_PREFIX, 73, -49, 107, -121, 71, SignedBytes.MAX_POWER_OF_TWO, 9, 83, 91};
        a(bArr8, new byte[]{96, -4, -50, -23, -5, -14, Ascii.RS, 78, 53, 52});
        f = new String(bArr8, charset).intern();
        byte[] bArr9 = {-24, 111, -87, 127, 85, 97, -28, Ascii.FS, 58, -124};
        a(bArr9, new byte[]{-78, -37, -41, Ascii.DLE, 71, -29, -84, 92, 85, -22});
        e = new String(bArr9, charset).intern();
        byte[] bArr10 = {-1, 107, 58, 81, -45, -30, 40, 43, -78, -87};
        a(bArr10, new byte[]{-83, -43, 94, 12, -55, 92, 97, 53, -5, -51});
        d = new String(bArr10, charset).intern();
        c = new a(null);
    }

    public k0(f2 f2Var, boolean z) {
        byte[] bArr = {-85, -90, -112, -112, -119, -59, -84, -54, Ascii.DC2, 1, -48};
        a(bArr, new byte[]{-39, -110, Ascii.VT, -26, Ascii.DC4, 125, -32, -118, 119, 115, -93});
        Intrinsics.checkNotNullParameter(f2Var, new String(bArr, StandardCharsets.UTF_8).intern());
        this.f253a = f2Var;
        this.b = z;
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        byte[] bArr = {0, -16, 81, -48, 60, 77, -59, -44, -22, 122};
        a(bArr, new byte[]{-128, 110, 56, -117, 116, -13, -69, -104, -93, Ascii.RS});
        Charset charset = StandardCharsets.UTF_8;
        jSONObject.put(new String(bArr, charset).intern(), this.f253a.c());
        byte[] bArr2 = {-2, -51, -71, -95, 36, -121, 5, 123, 71, -11};
        a(bArr2, new byte[]{-92, 121, -24, -34, 88, -59, -116, -7, 40, -101});
        String strIntern = new String(bArr2, charset).intern();
        byte[] bArr3 = {Ascii.ETB, -91, 74, 127, -20, -123};
        a(bArr3, new byte[]{Base64.padSymbol, 109, 122, 51, -62, -75, 54, -63});
        jSONObject.put(strIntern, new String(bArr3, charset).intern());
        byte[] bArr4 = {-72, -62, -1, -96, Ascii.GS, -63, -73, 101};
        a(bArr4, new byte[]{-33, 126, -76, -69, -110, 126, -37, -17});
        String strIntern2 = new String(bArr4, charset).intern();
        byte[] bArr5 = {101, 85, -43, 54, Ascii.ESC, -22, 57};
        a(bArr5, new byte[]{59, Ascii.VT, -57, 43, 116, -125, 93, 118});
        jSONObject.put(strIntern2, new String(bArr5, charset).intern());
        byte[] bArr6 = {-96, -120, 127, 55, -122, -54, Ascii.ETB, -61, 39, 67};
        a(bArr6, new byte[]{-37, -67, Ascii.US, 69, -4, 127, 116, -108, 65, 44});
        jSONObject.put(new String(bArr6, charset).intern(), q1.f277a.a());
        byte[] bArr7 = {8, -81, 81, -96, Utf8.REPLACEMENT_BYTE, -107, 103, 92};
        a(bArr7, new byte[]{-125, -102, Base64.padSymbol, -80, 115, -64, 68, Ascii.US});
        String strIntern3 = new String(bArr7, charset).intern();
        n1 n1Var = n1.f267a;
        o1 o1VarG = this.f253a.g();
        byte[] bArr8 = {51, 67, 57, -2, -9, -64, Ascii.CR, 8, -116, Framer.ENTER_FRAME_PREFIX, 126, -107, 117, -4, -13, 109, -1, -16, Ascii.DLE, -74, -70, Ascii.GS, -72, 121, -77};
        a(bArr8, new byte[]{107, -10, 98, -95, -87, -122, 122, 82, 0, 57, 48, -41, Framer.STDERR_FRAME_PREFIX, 88, -80, -14, -83, 101, Framer.EXIT_FRAME_PREFIX, -84, -87, 3, -84, 62, -102});
        Intrinsics.checkNotNullExpressionValue(o1VarG, new String(bArr8, charset).intern());
        jSONObject.put(strIntern3, n1Var.a(o1VarG));
        byte[] bArr9 = {Ascii.EM, -28, -54, -70, 74, 76, -43, Ascii.DC4, 99, -111, -12, Ascii.ETB, -53, Ascii.EM, 3, 57, 56};
        a(bArr9, new byte[]{-116, 91, -61, -60, 58, -14, -57, 46, 39, -51, -70, 101, -68, 71, -128, 62, Framer.STDIN_REQUEST_FRAME_PREFIX});
        jSONObject.put(new String(bArr9, charset).intern(), this.b);
        byte[] bArr10 = {-109, -78, -44, -96, -50, 55, -26};
        a(bArr10, new byte[]{Ascii.CR, -107, -57, -75, -70, 126, -126, -2});
        jSONObject.put(new String(bArr10, charset).intern(), UUID.randomUUID().toString());
        String strE = this.f253a.e();
        if (strE != null) {
            byte[] bArr11 = {79, -62, -108, 3, -125, -5, 91, 97, 102, Ascii.SO};
            a(bArr11, new byte[]{65, -118, -10, 77, 8, 102, 80, -12, 47, 106});
            jSONObject.put(new String(bArr11, charset).intern(), strE);
        }
        byte[] bArr12 = {-5, -20, 34, 59, 85, 100, 124, 92, -70};
        a(bArr12, new byte[]{-85, Framer.STDIN_REQUEST_FRAME_PREFIX, 87, 53, 62, -47, 39, 38, -33});
        jSONObject.put(new String(bArr12, charset).intern(), c.c());
        return jSONObject;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        boolean z;
        byte[] bArr3 = null;
        int i2 = 0;
        int i3 = 0;
        int length = 0;
        int i4 = 1516727821;
        byte[] bArr4 = null;
        while (true) {
            int i5 = ((i4 & 16777216) * (i4 | 16777216)) + ((i4 & (-16777217)) * ((~i4) & 16777216));
            int i6 = i4 >>> 8;
            int iA = m0.a(650911840 & (~i5) & i6, i6, i5, (i5 | 650911840) & i6);
            int i7 = (iA ^ 642535957) + ((iA & 642535957) * 2);
            switch (((~i7) + ((i7 | 1) * 2)) ^ 962785775) {
                case -1896910703:
                    int length2 = bArr4.length;
                    int i8 = 0 - i2;
                    int i9 = (length2 ^ i8) + ((length2 & i8) * 2);
                    byte b = bArr3[i9];
                    int length3 = bArr4.length;
                    int i10 = 0 - i8;
                    int i11 = i10 | length3;
                    byte b2 = bArr3[q0.a(i10, 2, i11, (length3 ^ i10) ^ i11)];
                    bArr3[i9] = (byte) (((byte) (((byte) 2) * ((byte) (b2 | b)))) - ((byte) (b2 ^ b)));
                    i4 = -746753280;
                    break;
                case -1725904394:
                    length = bArr4.length % 4;
                    i4 = (((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1) == 0 ? -365117735 : -458924450;
                    break;
                case -1399959314:
                    int iA2 = m0.a((-1205100636) & i3, i3, 3, (-1205100633) & i3);
                    byte b3 = bArr3[iA2];
                    int i12 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                    int i13 = i3 - 1;
                    int i14 = i13 - (i3 | (-3));
                    int i15 = bArr3[i14] & 255;
                    int i16 = i15 * ((~i15) & 65536);
                    int iA3 = l0.a(i16, i12, 1, ((-1) - i16) | ((-1) - i12));
                    int i17 = i13 - (i3 | (-2));
                    int i18 = bArr3[i17] & 255;
                    int i19 = i18 * ((~i18) & 256);
                    int i20 = (i19 - 1) - ((~iA3) | i19);
                    int i21 = bArr3[i3] & 255;
                    int iA4 = l0.a(i20, i21, 1, ((-1) - i20) | ((-1) - i21));
                    byte b4 = bArr4[iA2];
                    int i22 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                    int i23 = bArr4[i14] & 255;
                    int i24 = ((i23 * ((~i23) & 65536)) & (~i22)) + i22;
                    int i25 = bArr4[i17] & 255;
                    int i26 = i25 * ((~i25) & 256);
                    int i27 = ~((((~i26) | 911399251) | i24) - ((i26 & 911399251) | i24));
                    int i28 = bArr4[i3] & 255;
                    int i29 = ~((((~i27) | 1433568692) | i28) - ((i27 & 1433568692) | i28));
                    int i30 = iA4 << ((iA4 > Double.NaN ? 1 : (iA4 == Double.NaN ? 0 : -1)) >>> 31);
                    int i31 = (-1254002618) - ((i30 & 2) | ((-1672003491) - i30));
                    int i32 = (i31 + i29) - ((i31 & i29) * 2);
                    bArr4[i3] = (byte) i32;
                    bArr4[i17] = (byte) (i32 >>> 8);
                    bArr4[i14] = (byte) (i32 >>> 16);
                    bArr4[iA2] = (byte) (i32 >>> 24);
                    i3 = (i3 ^ 4) + ((i3 & 4) * 2);
                    int length4 = bArr4.length;
                    int length5 = 0 - (bArr4.length % 4);
                    int i33 = ((i3 > n0.a(0, (length4 & 2) | p0.a(length5, -4, 1, length4), length5 * 3, 1) ? 1 : (i3 == n0.a(0, (length4 & 2) | p0.a(length5, -4, 1, length4), length5 * 3, 1) ? 0 : -1)) >>> 31) & 1;
                    i4 = i33 != 0 ? i33 != 0 ? -1605440657 : -365117735 : -169475207;
                    break;
                case -1135475043:
                    break;
                case 180635757:
                    int length6 = bArr.length;
                    int length7 = 0 - (bArr.length % 4);
                    z = ((length6 ^ (~length7)) + ((length6 | length7) * 2)) + 1 > 0;
                    i4 = z ? z ? -1605440657 : -365117735 : -169475207;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i3 = 0;
                    break;
                case 511524454:
                    int length8 = bArr4.length;
                    int i34 = 0 - i2;
                    int i35 = 0 - i34;
                    int i36 = ((~length8) & i35) * 2;
                    int length9 = bArr4.length;
                    byte b5 = bArr4[((length9 | i34) * 2) - (length9 ^ i34)];
                    int length10 = bArr4.length;
                    byte b6 = bArr3[(i34 ^ length10) + ((length10 & i34) * 2)];
                    bArr4[(length8 ^ i35) - i36] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
                    length = o0.a(i2, 3, (~i2) * 2, 1);
                    if ((((i2 > 2 ? 1 : (i2 == 2 ? 0 : -1)) >>> 31) & 1) == 0) {
                    }
                    break;
                case 961838909:
                    int length11 = bArr4.length;
                    int i37 = 0 - length;
                    z = (((double) ((byte) bArr3[((length11 | i37) - ((165327505 & (~i37)) & length11)) + ((i37 | 165327505) & length11)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length11 | i37) - ((165327505 & (~i37)) & length11)) + ((i37 | 165327505) & length11)])) == Double.NaN ? 0 : -1)) > -1;
                    i4 = z ? -746753280 : z ? -365117735 : 1093626513;
                    i2 = length;
                    break;
                default:
                    break;
            }
            return;
        }
    }
}
