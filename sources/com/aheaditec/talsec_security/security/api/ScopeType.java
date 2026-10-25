package com.aheaditec.talsec_security.security.api;

import com.aheaditec.talsec.security.e3;
import com.aheaditec.talsec.security.m0;
import com.aheaditec.talsec.security.n0;
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
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SIDELOADED_ONLY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class ScopeType {
    public static final ScopeType ALL;
    public static final Companion Companion;
    public static final ScopeType SIDELOADED_AND_OEM;
    public static final ScopeType SIDELOADED_AND_SYSTEM_AND_OEM;
    public static final ScopeType SIDELOADED_AND_SYSTEM_EXCLUDE_OEM;
    public static final ScopeType SIDELOADED_ONLY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ScopeType[] f320a;
    public static final /* synthetic */ EnumEntries b;

    public static final class Companion {
        public Companion() {
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001d. Please report as an issue. */
        public static void a(byte[] bArr, byte[] bArr2) {
            short[] sArr = null;
            byte b = -1740520186;
            int length = 0;
            int length2 = 0;
            short s = 0;
            short s2 = 0;
            short sA = 0;
            int i = 0;
            while (true) {
                switch (b) {
                    case -2143294076:
                        b = length < length2 ? (byte) -1809249287 : (byte) 974072829;
                        break;
                    case -2038999444:
                        int i2 = ((short) ((s2 << 4) + sArr[2])) ^ (s2 + s);
                        short s3 = sArr[3];
                        int i3 = -(s2 >>> 5);
                        int i4 = i3 | s3;
                        int i5 = (i4 - (i3 * 2)) + ((i3 ^ s3) ^ i4);
                        int i6 = -e3.a(i5 | (~i2), 2, i5 - i2, 2);
                        sA = (short) q0.a(sA, 3, -(p0.a(sA, -4, 1, i6) | (i6 & 2)), 1);
                        s2 = (short) (s2 - ((((short) ((sA << 4) + sArr[0])) ^ (((s | sA) - (((~sA) & 62) & s)) + ((sA | 62) & s))) ^ ((sA >>> 5) + sArr[1])));
                        s = (short) (s - 40503);
                        i++;
                        b = 2093236949;
                        break;
                    case -1809249287:
                        byte b2 = bArr[length];
                        s2 = (short) (((bArr[((length & 1) * 2) + (length ^ 1)] & 255) << 8) | ((255 - (b2 | 255)) + b2));
                        int i7 = -length;
                        int i8 = i7 | 2;
                        sA = (short) ((bArr[(i8 - (i7 * 2)) + ((2 ^ i7) ^ i8)] & 255) | ((bArr[length + 3] & 255) << 8));
                        s = -14624;
                        b = 2093236949;
                        i = 0;
                        break;
                    case -1740520186:
                        sArr = new short[4];
                        b = 766056152;
                        length = 0;
                        break;
                    case -1489518479:
                        sArr[length] = (short) ((bArr2[((2 & (~length)) * (length & (-3))) + ((length & 2) * (length | 2))] & 255) ^ ((bArr2[(length * 2) + 1] & 255) << 8));
                        length++;
                        b = 766056152;
                        break;
                    case -473033593:
                        int i9 = -length;
                        int i10 = -bArr.length;
                        int i11 = i10 | i9;
                        bArr[(i11 - (i10 * 2)) + ((i10 ^ i9) ^ i11)] = (byte) (bArr[bArr.length - length] ^ bArr2[length % 8]);
                        length--;
                        b = 1734050766;
                        break;
                    case 766056152:
                        b = length < 4 ? (byte) -1489518479 : (byte) 998066383;
                        break;
                    case 974072829:
                        length = bArr.length % 4;
                        b = 1734050766;
                        break;
                    case 998066383:
                        length2 = bArr.length - (bArr.length % 4);
                        b = -2143294076;
                        length = 0;
                        break;
                    case 1314339506:
                        break;
                    case 1734050766:
                        b = length > 0 ? (byte) -473033593 : (byte) 1314339506;
                        break;
                    case 1771480224:
                        bArr[length] = (byte) (s2 & 255);
                        bArr[length + 1] = (byte) ((s2 >> 8) & 255);
                        bArr[length + 2] = (byte) (sA & 255);
                        bArr[length + 3] = (byte) ((sA >> 8) & 255);
                        length += 4;
                        b = -2143294076;
                        break;
                    case 2093236949:
                        b = i < 32 ? (byte) -2038999444 : (byte) 1771480224;
                        break;
                    default:
                        b = 2093236949;
                        break;
                }
                return;
            }
        }

        public final ScopeType parseScopeType$TalsecSecurity_v18_3_0_basicRelease(String str) {
            byte[] bArr = {Ascii.CR, -63, -88, 119, 58};
            a(bArr, new byte[]{89, Framer.STDIN_REQUEST_FRAME_PREFIX, 4, -85, -100, Ascii.EM, 93, -84});
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                byte[] bArr2 = {-76, -108, -21, 84, -78, -93, 96, -63, 110, -22, 115, -52, 53, -122, 65, -85};
                a(bArr2, new byte[]{-43, 111, -19, 82, 107, Ascii.DC4, -108, -82, 17, Ascii.NAK, 76, 43, Ascii.DLE, -5, 103, 100});
                Intrinsics.checkNotNullExpressionValue(upperCase, new String(bArr2, charset).intern());
                return ScopeType.valueOf(upperCase);
            } catch (Exception unused) {
                return ScopeType.SIDELOADED_ONLY;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {79, 67, -67, 115, 1, 118, -81, Ascii.EM, -75, -68, 40, 117, Ascii.US, 48, 69};
        a(bArr, new byte[]{-72, 117, Ascii.VT, -44, -15, 74, Ascii.FS, -65, 92, -115, -7, -60, 81, 124, Ascii.FS});
        Charset charset = StandardCharsets.UTF_8;
        SIDELOADED_ONLY = new ScopeType(new String(bArr, charset).intern(), 0);
        byte[] bArr2 = {46, Ascii.VT, -83, -94, -88, -24, 115, -109, -87, 19, 85, -127, -100, -21, 48, -6, 42, 105, -124, -98, 34, 87, -126, -87, 84, -15, -76, 99, Ascii.EM, -65, 113, SignedBytes.MAX_POWER_OF_TWO, 71};
        a(bArr2, new byte[]{-39, Base64.padSymbol, Ascii.ESC, 5, 88, -44, -64, 53, SignedBytes.MAX_POWER_OF_TWO, 34, -124, 34, 110, -38, -31, 79, -41, 41, 66, 57, -45, Ascii.ESC, 53, 19, -77, -56, 115, -59, -16, -13, -80, -25, 10});
        SIDELOADED_AND_SYSTEM_EXCLUDE_OEM = new ScopeType(new String(bArr2, charset).intern(), 1);
        byte[] bArr3 = {Ascii.VT, 88, -76, 7, 112, -11, -96, -8, -116, -99, 32, -35, 122, 109, Ascii.DC4, -2, 35, -25};
        a(bArr3, new byte[]{-4, 110, 2, -96, -128, -55, 19, 94, 101, -84, -15, 126, -120, 92, -59, 79, 102, -86});
        SIDELOADED_AND_OEM = new ScopeType(new String(bArr3, charset).intern(), 2);
        byte[] bArr4 = {Framer.STDOUT_FRAME_PREFIX, 99, Ascii.DC2, -96, -43, -43, -53, -28, -116, -9, Ascii.NAK, -47, 113, -22, -79, 73, -70, 107, Base64.padSymbol, -112, -66, -114, -78, 97, -26, Framer.EXIT_FRAME_PREFIX, 84, 123, -50};
        a(bArr4, new byte[]{-58, 85, -92, 7, 37, -23, Framer.EXIT_FRAME_PREFIX, 66, 101, -58, -60, 114, -125, -37, 96, -4, 71, 43, -5, 55, 79, -62, 1, -47, Ascii.SO, 52, -107, -36, -125});
        SIDELOADED_AND_SYSTEM_AND_OEM = new ScopeType(new String(bArr4, charset).intern(), 3);
        byte[] bArr5 = {Ascii.CR, SignedBytes.MAX_POWER_OF_TWO, -75};
        a(bArr5, new byte[]{76, 12, -7, 106, -55, -4, -103, 70});
        ALL = new ScopeType(new String(bArr5, charset).intern(), 4);
        ScopeType[] scopeTypeArrA = a();
        f320a = scopeTypeArrA;
        b = EnumEntriesKt.enumEntries(scopeTypeArrA);
        Companion = new Companion(null);
    }

    public ScopeType(String str, int i) {
        super(str, i);
    }

    public static final /* synthetic */ ScopeType[] a() {
        return new ScopeType[]{SIDELOADED_ONLY, SIDELOADED_AND_SYSTEM_EXCLUDE_OEM, SIDELOADED_AND_OEM, SIDELOADED_AND_SYSTEM_AND_OEM, ALL};
    }

    public static EnumEntries<ScopeType> getEntries() {
        return b;
    }

    public static ScopeType valueOf(String str) {
        return (ScopeType) Enum.valueOf(ScopeType.class, str);
    }

    public static ScopeType[] values() {
        return (ScopeType[]) f320a.clone();
    }

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
                    byte b2 = bArr3[i11];
                    int length3 = bArr4.length;
                    byte b3 = bArr3[(length3 ^ i10) + ((i9 | length3) * 2) + 1];
                    int i12 = ((byte) 0) - b2;
                    bArr3[i11] = (byte) (((byte) (((byte) 2) * ((byte) (b3 & (~i12))))) - ((byte) (b3 ^ i12)));
                    break;
                case -1882653318:
                    int i13 = (i2 - 1) - (i2 | (-4));
                    byte b4 = bArr3[i13];
                    int i14 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                    int i15 = i2 + 3 + (((-1) - i2) | (-3));
                    int i16 = bArr3[i15] & 255;
                    int i17 = i16 * ((~i16) & 65536);
                    int i18 = ~((i14 | (1169991170 | (~i17))) - ((i17 & 1169991170) | i14));
                    int iA = m0.a(689061172 & i2, i2, 1, 689061173 & i2);
                    int i19 = bArr3[iA] & 255;
                    int i20 = ((~i18) & (i19 * ((~i19) & 256))) + i18;
                    int i21 = (i20 - 1) - ((~(bArr3[i2] & 255)) | i20);
                    byte b5 = bArr4[i13];
                    int i22 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
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
                    byte b6 = bArr4[(length8 ^ i36) + ((length8 & i36) * 2)];
                    int length9 = bArr4.length;
                    int i38 = 0 - i36;
                    byte b7 = bArr3[(((~i38) & length9) * 2) - (length9 ^ i38)];
                    bArr4[n0.a(0, (length7 & 2) | iA2, i37, 1)] = (byte) (((byte) (b7 + b6)) - ((byte) (((byte) 2) * ((byte) (b7 & b6)))));
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
}
