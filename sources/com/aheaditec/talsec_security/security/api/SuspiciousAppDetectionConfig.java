package com.aheaditec.talsec_security.security.api;

import com.aheaditec.talsec.security.a;
import com.aheaditec.talsec.security.l0;
import com.aheaditec.talsec.security.n0;
import com.aheaditec.talsec.security.p0;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class SuspiciousAppDetectionConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<String> f322a;
    public final Set<String> b;
    public final Set<Set<String>> c;
    public final Set<Set<String>> d;
    public final MalwareScanScope e;
    public final ReasonMode f;

    public SuspiciousAppDetectionConfig() {
        this(null, null, null, null, null, null, 63, null);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuspiciousAppDetectionConfig copy$default(SuspiciousAppDetectionConfig suspiciousAppDetectionConfig, Set set, Set set2, Set set3, Set set4, MalwareScanScope malwareScanScope, ReasonMode reasonMode, int i, Object obj) {
        if ((i & 1) != 0) {
            set = suspiciousAppDetectionConfig.f322a;
        }
        if ((i & 2) != 0) {
            set2 = suspiciousAppDetectionConfig.b;
        }
        if ((i & 4) != 0) {
            set3 = suspiciousAppDetectionConfig.c;
        }
        if ((i & 8) != 0) {
            set4 = suspiciousAppDetectionConfig.d;
        }
        if ((i & 16) != 0) {
            malwareScanScope = suspiciousAppDetectionConfig.e;
        }
        if ((i & 32) != 0) {
            reasonMode = suspiciousAppDetectionConfig.f;
        }
        MalwareScanScope malwareScanScope2 = malwareScanScope;
        ReasonMode reasonMode2 = reasonMode;
        return suspiciousAppDetectionConfig.copy(set, set2, set3, set4, malwareScanScope2, reasonMode2);
    }

    public final String buildV2Fingerprint$TalsecSecurity_v18_3_0_basicRelease() {
        String strIntern;
        String strIntern2;
        String strIntern3;
        StringBuilder sb = new StringBuilder();
        Set<String> set = this.f322a;
        if (set == null || (strIntern = CollectionsKt.joinToString$default(set, null, null, null, 0, null, null, 63, null)) == null) {
            byte[] bArr = {Ascii.DLE, -119, -71, 42};
            a(bArr, new byte[]{-38, 3, 71, -31, -26, 70, -25, 125});
            strIntern = new String(bArr, StandardCharsets.UTF_8).intern();
        }
        sb.append(strIntern);
        Set<String> set2 = this.b;
        if (set2 == null || (strIntern2 = CollectionsKt.joinToString$default(set2, null, null, null, 0, null, null, 63, null)) == null) {
            byte[] bArr2 = {86, Framer.STDOUT_FRAME_PREFIX, -33, 109};
            a(bArr2, new byte[]{-108, 107, Base64.padSymbol, -68, -105, -104, Ascii.SUB, Framer.STDIN_FRAME_PREFIX});
            strIntern2 = new String(bArr2, StandardCharsets.UTF_8).intern();
        }
        sb.append(strIntern2);
        Set<Set<String>> set3 = this.c;
        if (set3 != null) {
            Iterator<T> it = set3.iterator();
            while (it.hasNext()) {
                sb.append(CollectionsKt.joinToString$default((Set) it.next(), null, null, null, 0, null, null, 63, null));
            }
        } else {
            byte[] bArr3 = {118, -121, 75, 116};
            a(bArr3, new byte[]{116, 0, -47, -70, -13, -64, Ascii.DC2, 76});
            sb.append(new String(bArr3, StandardCharsets.UTF_8).intern());
        }
        Set<Set<String>> set4 = this.d;
        if (set4 != null) {
            Iterator<T> it2 = set4.iterator();
            while (it2.hasNext()) {
                sb.append(CollectionsKt.joinToString$default((Set) it2.next(), null, null, null, 0, null, null, 63, null));
            }
        } else {
            byte[] bArr4 = {-15, -110, 78, 121};
            a(bArr4, new byte[]{-5, -11, -84, -73, 62, -4, 0, 113});
            sb.append(new String(bArr4, StandardCharsets.UTF_8).intern());
        }
        sb.append(this.e.getScanScope().name());
        List<String> trustedInstallSources = this.e.getTrustedInstallSources();
        if (trustedInstallSources == null || (strIntern3 = CollectionsKt.joinToString$default(trustedInstallSources, null, null, null, 0, null, null, 63, null)) == null) {
            byte[] bArr5 = {55, -110, -66, -31};
            a(bArr5, new byte[]{-75, 10, 92, 40, 53, -74, 12, 9});
            strIntern3 = new String(bArr5, StandardCharsets.UTF_8).intern();
        }
        sb.append(strIntern3);
        sb.append(this.f.name());
        String string = sb.toString();
        byte[] bArr6 = {-17, Base64.padSymbol, -22, 83, 78, -74, 123, -37, Ascii.NAK, 123, Ascii.DC4, -2, 32};
        a(bArr6, new byte[]{-25, 68, Ascii.SI, -62, -128, -54, -125, 90, -111, 70, -88, 78, 9});
        Intrinsics.checkNotNullExpressionValue(string, new String(bArr6, StandardCharsets.UTF_8).intern());
        return string;
    }

    public final Set<String> component1() {
        return this.f322a;
    }

    public final Set<String> component2() {
        return this.b;
    }

    public final Set<Set<String>> component3() {
        return this.c;
    }

    public final Set<Set<String>> component4() {
        return this.d;
    }

    public final MalwareScanScope component5() {
        return this.e;
    }

    public final ReasonMode component6() {
        return this.f;
    }

    public final SuspiciousAppDetectionConfig copy(Set<String> set, Set<String> set2, Set<? extends Set<String>> set3, Set<? extends Set<String>> set4, MalwareScanScope malwareScanScope, ReasonMode reasonMode) {
        byte[] bArr = {-58, -95, -27, Ascii.ESC, 32, Ascii.ETB, 4, -28, 55, 60, -67, 102, 94, -101, Framer.STDERR_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX};
        a(bArr, new byte[]{7, -18, 59, 9, -91, 118, 19, Ascii.NAK, -72, 72, 65, -102, 97, -26, -44, -22});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(malwareScanScope, new String(bArr, charset).intern());
        byte[] bArr2 = {125, -106, 10, -107, -57, 85, -50, -97, -48, 77};
        a(bArr2, new byte[]{83, -31, Ascii.GS, -124, 4, Framer.STDIN_FRAME_PREFIX, Ascii.CR, 109, -76, 40});
        Intrinsics.checkNotNullParameter(reasonMode, new String(bArr2, charset).intern());
        return new SuspiciousAppDetectionConfig(set, set2, set3, set4, malwareScanScope, reasonMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspiciousAppDetectionConfig)) {
            return false;
        }
        SuspiciousAppDetectionConfig suspiciousAppDetectionConfig = (SuspiciousAppDetectionConfig) obj;
        return Intrinsics.areEqual(this.f322a, suspiciousAppDetectionConfig.f322a) && Intrinsics.areEqual(this.b, suspiciousAppDetectionConfig.b) && Intrinsics.areEqual(this.c, suspiciousAppDetectionConfig.c) && Intrinsics.areEqual(this.d, suspiciousAppDetectionConfig.d) && Intrinsics.areEqual(this.e, suspiciousAppDetectionConfig.e) && this.f == suspiciousAppDetectionConfig.f;
    }

    public final Set<Set<String>> getGrantedPermissions() {
        return this.d;
    }

    public final Set<String> getHashes() {
        return this.b;
    }

    public final MalwareScanScope getMalwareScanScope() {
        return this.e;
    }

    public final Set<String> getPackageNames() {
        return this.f322a;
    }

    public final ReasonMode getReasonMode() {
        return this.f;
    }

    public final Set<Set<String>> getRequestedPermissions() {
        return this.c;
    }

    public int hashCode() {
        Set<String> set = this.f322a;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set<String> set2 = this.b;
        int iHashCode2 = (iHashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set<Set<String>> set3 = this.c;
        int iHashCode3 = (iHashCode2 + (set3 == null ? 0 : set3.hashCode())) * 31;
        Set<Set<String>> set4 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode3 + (set4 != null ? set4.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        Set<String> set = this.f322a;
        Set<String> set2 = this.b;
        Set<Set<String>> set3 = this.c;
        Set<Set<String>> set4 = this.d;
        MalwareScanScope malwareScanScope = this.e;
        ReasonMode reasonMode = this.f;
        byte[] bArr = {-18, Ascii.RS, -97, 3, 58, -66, -27, -109, 46, -70, Utf8.REPLACEMENT_BYTE, -51, 59, -103, -47, -108, 3, 7, -85, 71, -36, -59, 82, -57, 125, 4, 109, -122, -59, -63, 119, 82, -10, 80, -109, -30, -60, 127, 66, -97, 3, -128};
        a(bArr, new byte[]{-63, 121, 98, Ascii.SYN, -73, -56, 62, -103, -89, -44, -16, Framer.STDIN_REQUEST_FRAME_PREFIX, -81, -62, 38, -125, -62, -105, 104, -61, -17, -35, -121, 70, 79, -108, -73, -113, 65, -33, -120, -41, -15, Framer.STDIN_REQUEST_FRAME_PREFIX, 98, 32, 38, 12, -39, 100, 112, -67});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {-33, -8, 99, -115, -63, -79, 40, 87, 115};
        a(bArr2, new byte[]{-81, -58, -67, -114, Ascii.SYN, -9, -1, -54, 78});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {-23, -85, Base64.padSymbol, 86, -95, -82, -121, 100, 9, Ascii.GS, -29, -67, 73, -29, -122, Ascii.ESC, 60, 77, -13, -74, -41, -14, 44};
        a(bArr3, new byte[]{-95, -71, -35, -35, 52, -23, -100, -75, -39, 111, Framer.STDOUT_FRAME_PREFIX, 112, -120, -94, -107, Ascii.DC4, -109, 73, 12, 118, -71, -127, 17});
        String strIntern3 = new String(bArr3, charset).intern();
        byte[] bArr4 = {Framer.ENTER_FRAME_PREFIX, 109, -105, -23, 84, 115, -51, -9, -10, 17, -107, 17, 100, 66, -90, 86, -118, 107, Framer.STDOUT_FRAME_PREFIX, -31, 74};
        a(bArr4, new byte[]{-23, 122, 110, 62, -103, Ascii.SO, 75, Utf8.REPLACEMENT_BYTE, -2, -81, 99, 6, 101, 89, 107, -54, 71, 54, -51, 48, 119});
        String strIntern4 = new String(bArr4, charset).intern();
        byte[] bArr5 = {7, 89, -74, 77, -105, 85, 69, -74, -125, -16, 57, -116, 121, -63, -70, 42, -84, -51, 77};
        a(bArr5, new byte[]{-121, 102, 69, -47, 87, 52, -42, 106, 66, -115, -56, -113, 115, -4, 79, -30, -36, -88, 112});
        String strIntern5 = new String(bArr5, charset).intern();
        byte[] bArr6 = {-58, 82, -106, 65, -105, -84, -117, -63, 127, -6, -63, 37, 98};
        a(bArr6, new byte[]{70, 96, 122, -63, 90, -23, -110, 77, 110, -121, 87, -19, Framer.STDIN_REQUEST_FRAME_PREFIX});
        String strIntern6 = new String(bArr6, charset).intern();
        byte[] bArr7 = {-2};
        a(bArr7, new byte[]{-41, -36, -77, Ascii.NAK, -56, -78, Ascii.EM, 75});
        return strIntern + set + strIntern2 + set2 + strIntern3 + set3 + strIntern4 + set4 + strIntern5 + malwareScanScope + strIntern6 + reasonMode + new String(bArr7, charset).intern();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuspiciousAppDetectionConfig(Set<String> set, Set<String> set2, Set<? extends Set<String>> set3, Set<? extends Set<String>> set4, MalwareScanScope malwareScanScope, ReasonMode reasonMode) {
        byte[] bArr = {32, -5, -59, SignedBytes.MAX_POWER_OF_TWO, -27, 9, 34, Ascii.NAK, -17, -119, Ascii.SO, 110, -118, Framer.EXIT_FRAME_PREFIX, Ascii.VT, Framer.STDIN_REQUEST_FRAME_PREFIX};
        a(bArr, new byte[]{-87, -119, 91, -44, -24, -123, -10, 36, -16, Ascii.SYN, -18, -125, 77, 9, Ascii.CR, -92});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(malwareScanScope, new String(bArr, charset).intern());
        byte[] bArr2 = {82, -103, 34, 124, 124, -68, Ascii.SUB, 88, 40, 90};
        a(bArr2, new byte[]{-124, -29, -11, -83, 79, -60, -63, -43, 76, Utf8.REPLACEMENT_BYTE});
        Intrinsics.checkNotNullParameter(reasonMode, new String(bArr2, charset).intern());
        this.f322a = set;
        this.b = set2;
        this.c = set3;
        this.d = set4;
        this.e = malwareScanScope;
        this.f = reasonMode;
    }

    public /* synthetic */ SuspiciousAppDetectionConfig(Set set, Set set2, Set set3, Set set4, MalwareScanScope malwareScanScope, ReasonMode reasonMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : set, (i & 2) != 0 ? null : set2, (i & 4) != 0 ? null : set3, (i & 8) != 0 ? null : set4, (i & 16) != 0 ? new MalwareScanScope(ScopeType.SIDELOADED_ONLY, CollectionsKt.emptyList()) : malwareScanScope, (i & 32) != 0 ? ReasonMode.HIGHEST_CONFIDENCE : reasonMode);
    }
}
