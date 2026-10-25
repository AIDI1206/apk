package com.aheaditec.talsec_security.security.api;

import com.aheaditec.talsec.security.a;
import com.aheaditec.talsec.security.l0;
import com.aheaditec.talsec.security.m0;
import com.aheaditec.talsec.security.n0;
import com.aheaditec.talsec.security.o0;
import com.aheaditec.talsec.security.p0;
import com.aheaditec.talsec.security.q0;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ALL' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class ReasonMode {
    public static final ReasonMode ALL;
    public static final Companion Companion;
    public static final ReasonMode HIGHEST_CONFIDENCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ReasonMode[] f319a;
    public static final /* synthetic */ EnumEntries b;

    public static final class Companion {
        public Companion() {
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

        public final ReasonMode parseReasonMode$TalsecSecurity_v18_3_0_basicRelease(String str) {
            ReasonMode reasonModeValueOf;
            if (str != null) {
                try {
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    byte[] bArr = {SignedBytes.MAX_POWER_OF_TWO, Ascii.SYN, 66, 83, -102, 87, 66, -40, Ascii.NAK, 104, -79, -41, -117, -35, 72, -73};
                    a(bArr, new byte[]{-112, 108, -31, -59, 78, 32, -58, 121, -40, 38, 70, Ascii.DC2, 1, -27, -108, 48});
                    Intrinsics.checkNotNullExpressionValue(upperCase, new String(bArr, StandardCharsets.UTF_8).intern());
                    reasonModeValueOf = ReasonMode.valueOf(upperCase);
                } catch (IllegalArgumentException unused) {
                    reasonModeValueOf = ReasonMode.HIGHEST_CONFIDENCE;
                }
                if (reasonModeValueOf != null) {
                    return reasonModeValueOf;
                }
            }
            return ReasonMode.HIGHEST_CONFIDENCE;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {-17, -44, -2};
        a(bArr, new byte[]{-82, -104, -78, 57, -58, 88, 42, -106});
        Charset charset = StandardCharsets.UTF_8;
        ReasonMode reasonMode = new ReasonMode(new String(bArr, charset).intern(), 0);
        ALL = reasonMode;
        byte[] bArr2 = {Ascii.SI, Ascii.VT, -43, -4, 48, -27, -27, 41, Ascii.DLE, 3, 123, Framer.STDIN_FRAME_PREFIX, -16, -100, -87, -97, -27, 94};
        a(bArr2, new byte[]{94, Ascii.DC2, -88, -101, -116, -122, -57, 93, 106, Ascii.FS, 75, 82, -48, -88, 2, -71, -90, Ascii.ESC});
        ReasonMode reasonMode2 = new ReasonMode(new String(bArr2, charset).intern(), 1);
        HIGHEST_CONFIDENCE = reasonMode2;
        ReasonMode[] reasonModeArr = {reasonMode, reasonMode2};
        f319a = reasonModeArr;
        b = EnumEntriesKt.enumEntries(reasonModeArr);
        Companion = new Companion(null);
    }

    public ReasonMode(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ ReasonMode[] a() {
        return new ReasonMode[]{ALL, HIGHEST_CONFIDENCE};
    }

    public static EnumEntries<ReasonMode> getEntries() {
        return b;
    }

    public static ReasonMode valueOf(String str) {
        return (ReasonMode) Enum.valueOf(ReasonMode.class, str);
    }

    public static ReasonMode[] values() {
        return (ReasonMode[]) f319a.clone();
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
                    byte b2 = bArr3[i8];
                    int length3 = bArr4.length;
                    int i9 = 0 - i7;
                    int i10 = i9 | length3;
                    byte b3 = bArr3[q0.a(i9, 2, i10, (length3 ^ i9) ^ i10)];
                    bArr3[i8] = (byte) (((byte) (((byte) 2) * ((byte) (b3 | b2)))) - ((byte) (b3 ^ b2)));
                    i3 = -746753280;
                    break;
                case -1725904394:
                    length = bArr4.length % 4;
                    i3 = (((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1) == 0 ? -365117735 : -458924450;
                    break;
                case -1399959314:
                    int iA2 = m0.a((-1205100636) & i2, i2, 3, (-1205100633) & i2);
                    byte b4 = bArr3[iA2];
                    int i11 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
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
                    byte b5 = bArr4[iA2];
                    int i21 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
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
                    byte b6 = bArr4[((length9 | i33) * 2) - (length9 ^ i33)];
                    int length10 = bArr4.length;
                    byte b7 = bArr3[(i33 ^ length10) + ((length10 & i33) * 2)];
                    bArr4[(length8 ^ i34) - i35] = (byte) (((byte) (b7 - b6)) + ((byte) (((byte) 2) * ((byte) ((~b7) & b6)))));
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
