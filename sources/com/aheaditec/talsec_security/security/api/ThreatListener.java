package com.aheaditec.talsec_security.security.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.biometric.BiometricManager;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.aheaditec.talsec.security.l0;
import com.aheaditec.talsec.security.n0;
import com.aheaditec.talsec.security.p0;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class ThreatListener extends BroadcastReceiver {
    public static final a d;
    public static final String e;
    public static final String f;
    public static final String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreatDetected f328a;
    public final DeviceState b;
    public final RaspExecutionState c;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NOT_AVAILABLE' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class BiometricState {
        public static final BiometricState ACTIVE;
        public static final BiometricState NONE_ENROLLED;
        public static final BiometricState NOT_AVAILABLE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ BiometricState[] f329a;
        public static final /* synthetic */ EnumEntries b;

        static {
            byte[] bArr = {119, -47, -75, 126, -95, -74, -23, 17, -35, -70, 100, Ascii.DLE, -14};
            a(bArr, new byte[]{85, -16, 115, -66, 4, -14, Ascii.SUB, Base64.padSymbol, -51, -23, -108, 62, -73});
            Charset charset = StandardCharsets.UTF_8;
            BiometricState biometricState = new BiometricState(new String(bArr, charset).intern(), 0);
            NOT_AVAILABLE = biometricState;
            byte[] bArr2 = {-65, -11, 4, 125, Ascii.CAN, -8, 125, -62, Ascii.SUB, -96, 125, -77, -126};
            a(bArr2, new byte[]{Framer.STDIN_FRAME_PREFIX, -84, 56, -102, -29, -96, -95, 118, -15, -63, -93, 80, -58});
            BiometricState biometricState2 = new BiometricState(new String(bArr2, charset).intern(), 1);
            NONE_ENROLLED = biometricState2;
            byte[] bArr3 = {122, 88, Framer.STDIN_FRAME_PREFIX, 91, 4, 89};
            a(bArr3, new byte[]{Framer.STDIN_REQUEST_FRAME_PREFIX, 5, -53, -12, 82, Ascii.FS, -15, -118});
            BiometricState biometricState3 = new BiometricState(new String(bArr3, charset).intern(), 2);
            ACTIVE = biometricState3;
            BiometricState[] biometricStateArr = {biometricState, biometricState2, biometricState3};
            f329a = biometricStateArr;
            b = EnumEntriesKt.enumEntries(biometricStateArr);
        }

        public BiometricState(String str, int i) {
            super(str, i);
        }

        public static final /* synthetic */ BiometricState[] a() {
            return new BiometricState[]{NOT_AVAILABLE, NONE_ENROLLED, ACTIVE};
        }

        public static EnumEntries<BiometricState> getEntries() {
            return b;
        }

        public static BiometricState valueOf(String str) {
            return (BiometricState) Enum.valueOf(BiometricState.class, str);
        }

        public static BiometricState[] values() {
            return (BiometricState[]) f329a.clone();
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
                        byte b2 = bArr3[i11];
                        int length6 = bArr5.length;
                        byte b3 = bArr3[((i10 | length6) - ((1163302289 & (~i10)) & length6)) + ((i10 | 1163302289) & length6)];
                        bArr3[i11] = (byte) (((byte) (((byte) (b3 ^ (~b2))) + ((byte) (((byte) 2) * ((byte) (b3 | b2)))))) + ((byte) 1));
                        i = 935800592;
                        bArr4 = bArr3;
                        break;
                    case 256719606:
                        int i12 = (i3 - 1) - (i3 | (-4));
                        byte b4 = bArr4[i12];
                        int i13 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
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
                        byte b5 = bArr5[i12];
                        int i24 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
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
                        byte b6 = bArr5[(i38 ^ length10) - (((~length10) & i38) * 2)];
                        int length11 = bArr5.length;
                        byte b7 = bArr4[((i37 | length11) * 2) - (length11 ^ i37)];
                        bArr5[(i39 - i41) + i40] = (byte) (((((byte) (~b7)) + ((byte) (((byte) 2) * ((byte) (b7 | 1))))) ^ b6) ^ 1);
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

    public static abstract class DeviceState {
        public void onADBEnabledDetected() {
        }

        public void onDeveloperModeDetected() {
        }

        public void onHardwareBackedKeystoreNotAvailableDetected() {
        }

        public void onSystemVPNDetected() {
        }

        public void onUnlockedDeviceDetected() {
        }
    }

    public static abstract class RaspExecutionState {
        public void onAllChecksFinished() {
        }
    }

    public static abstract class ThreatDetected {
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

        public void onAutomationDetected() {
        }

        public void onDebuggerDetected() {
        }

        public void onDeviceBindingDetected() {
        }

        public void onEmulatorDetected() {
        }

        public void onHookDetected() {
        }

        public void onLocationSpoofingDetected() {
        }

        public void onMalwareDetected(List<SuspiciousAppInfo> list) {
            byte[] bArr = {-3, 12, Framer.EXIT_FRAME_PREFIX, 75, Ascii.ESC, 69, -70, -116, 67, -47, 34};
            a(bArr, new byte[]{-115, 109, Ascii.ESC, 32, 122, 34, -33, -59, Framer.STDIN_FRAME_PREFIX, -73, 77});
            Intrinsics.checkNotNullParameter(list, new String(bArr, StandardCharsets.UTF_8).intern());
        }

        public void onMultiInstanceDetected() {
        }

        public void onObfuscationIssuesDetected() {
        }

        public void onRootDetected() {
        }

        public void onScreenRecordingDetected() {
        }

        public void onScreenshotDetected() {
        }

        public void onTamperDetected() {
        }

        public void onTimeSpoofingDetected() {
        }

        public void onUnsecureWifiDetected() {
        }

        public void onUntrustedInstallationSourceDetected() {
        }
    }

    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {Ascii.ESC, -38, -32, 79, -110, -85, -100, -14, -84, 94, -50, 4};
        a(bArr, new byte[]{-14, -122, Ascii.RS, -27, 119, -53, 75, 10, Ascii.EM, 2, 6, 40});
        Charset charset = StandardCharsets.UTF_8;
        g = new String(bArr, charset).intern();
        byte[] bArr2 = {-120, -45, 85, -43, -64, 117, 86, -20, -126};
        a(bArr2, new byte[]{101, -113, -127, Framer.EXIT_FRAME_PREFIX, 59, 39, -119, Ascii.SUB, -61});
        f = new String(bArr2, charset).intern();
        byte[] bArr3 = {-21, 103, -65, -59, 71, Ascii.DLE, 43, -77, Ascii.VT, -80, -103};
        a(bArr3, new byte[]{-37, Ascii.DC4, 125, 123, -82, -66, -61, 92, 69, -10, -42});
        e = new String(bArr3, charset).intern();
        d = new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreatListener(ThreatDetected threatDetected) {
        this(threatDetected, null, null, 6, null);
        byte[] bArr = {-9, -60, -50, 92, 47, -105, -82};
        a(bArr, new byte[]{-17, -38, Framer.STDERR_FRAME_PREFIX, -38, 78, -29, -35, 109});
        Intrinsics.checkNotNullParameter(threatDetected, new String(bArr, StandardCharsets.UTF_8).intern());
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

    public final BiometricState getBiometricState(Context context) {
        byte[] bArr = {Ascii.ESC, -7, -72, 111, 41, 104, Ascii.DLE};
        a(bArr, new byte[]{-36, -119, 68, -90, 76, Ascii.DLE, 100, -76});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        int iCanAuthenticate = BiometricManager.from(context).canAuthenticate();
        if (iCanAuthenticate != 0) {
            return iCanAuthenticate != 11 ? BiometricState.NOT_AVAILABLE : BiometricState.NONE_ENROLLED;
        }
        return BiometricState.ACTIVE;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        RaspExecutionState raspExecutionState;
        DeviceState deviceState;
        DeviceState deviceState2;
        DeviceState deviceState3;
        DeviceState deviceState4;
        DeviceState deviceState5;
        if (intent != null) {
            byte[] bArr = {-117, 107, Ascii.EM, Ascii.EM, 89, 67, 89, -112, -107};
            a(bArr, new byte[]{102, Ascii.ETB, -51, 52, -94, 116, -118, -90, -44});
            Charset charset = StandardCharsets.UTF_8;
            String stringExtra = intent.getStringExtra(new String(bArr, charset).intern());
            if (stringExtra == null) {
                return;
            }
            switch (stringExtra.hashCode()) {
                case -2000714514:
                    byte[] bArr2 = {40, -90, Ascii.VT, -66, 71, 70, -33, -56, -4, -28, 4, 97, -48};
                    a(bArr2, new byte[]{-95, -26, 17, 84, -126, 122, Utf8.REPLACEMENT_BYTE, 88, -44, -77, Ascii.CAN, -96, -75});
                    if (stringExtra.equals(new String(bArr2, charset).intern())) {
                        this.f328a.onMultiInstanceDetected();
                        break;
                    }
                    break;
                case -1642813682:
                    byte[] bArr3 = {88, -61, -5, 100, 6, -34, -20, 96, -118, -6, -15, -117, 98, -91, 111, Utf8.REPLACEMENT_BYTE};
                    a(bArr3, new byte[]{-112, -33, Ascii.SO, -90, -34, -94, Framer.STDOUT_FRAME_PREFIX, -83, 125, -104, 12, -127, 96, -6, -113, -58});
                    if (stringExtra.equals(new String(bArr3, charset).intern())) {
                        this.f328a.onLocationSpoofingDetected();
                        break;
                    }
                    break;
                case -1492991450:
                    byte[] bArr4 = {79, -127, -59, -118, 12, 90, -8, 92, 19, Ascii.DC2, Framer.STDERR_FRAME_PREFIX, 104};
                    a(bArr4, new byte[]{-121, 7, 90, -120, -29, 55, 5, -48, -47, -106, -51, -83});
                    if (stringExtra.equals(new String(bArr4, charset).intern())) {
                        this.f328a.onTimeSpoofingDetected();
                        break;
                    }
                    break;
                case -1367123171:
                    byte[] bArr5 = {35, 75, Ascii.SYN, Ascii.EM, -5, -11, -116, -40, -31, 108, 71, -15, Ascii.FS, -62, 111, -85, 99};
                    a(bArr5, new byte[]{-88, 90, -18, Ascii.SO, -20, -128, -97, 78, -20, 53, -41, Ascii.SUB, -77, -36, -108, 104, Ascii.DLE});
                    if (stringExtra.equals(new String(bArr5, charset).intern())) {
                        this.f328a.onObfuscationIssuesDetected();
                        break;
                    }
                    break;
                case -1226736817:
                    byte[] bArr6 = {-90, 19, -118, -49, -55, -22, -107, -73, 65, 44, -28, 127, 124};
                    a(bArr6, new byte[]{46, 100, -118, 88, Ascii.SO, -67, 69, 115, -117, 125, Utf8.REPLACEMENT_BYTE, -116, Ascii.ESC});
                    if (stringExtra.equals(new String(bArr6, charset).intern())) {
                        this.f328a.onDeviceBindingDetected();
                        break;
                    }
                    break;
                case -881046147:
                    byte[] bArr7 = {-15, -59, Framer.ENTER_FRAME_PREFIX, 66, 91, 81};
                    a(bArr7, new byte[]{-31, -46, -2, -44, 62, 35, 9, -88});
                    if (stringExtra.equals(new String(bArr7, charset).intern())) {
                        this.f328a.onTamperDetected();
                        break;
                    }
                    break;
                case -748118530:
                    byte[] bArr8 = {-4, 76, 92, -96, -85, -56, 44, 34, -87, 68, -117, -25, 9, -101, -20, -4, -52};
                    a(bArr8, new byte[]{-63, 86, -94, 65, 39, -45, -3, -17, 62, 116, -108, 39, -60, -5, 54, 58, -88});
                    if (stringExtra.equals(new String(bArr8, charset).intern()) && (raspExecutionState = this.c) != null) {
                        raspExecutionState.onAllChecksFinished();
                    }
                    break;
                case -603894139:
                    byte[] bArr9 = {-112, 4, Ascii.SI, 89, 46, -25, -54, -103, Ascii.CR, Ascii.FS, 100, -107};
                    a(bArr9, new byte[]{65, -100, -13, -34, -79, -95, 78, -103, -26, 96, -80, -98});
                    if (stringExtra.equals(new String(bArr9, charset).intern())) {
                        this.f328a.onUnsecureWifiDetected();
                        break;
                    }
                    break;
                case -416447130:
                    byte[] bArr10 = {-85, -5, -105, 73, -98, -84, 98, 119, -17, -56};
                    a(bArr10, new byte[]{60, -118, 123, -55, 39, -12, -89, -79, -128, -68});
                    if (stringExtra.equals(new String(bArr10, charset).intern())) {
                        this.f328a.onScreenshotDetected();
                        break;
                    }
                    break;
                case -328950239:
                    byte[] bArr11 = {117, 99, -79, -108, 122, Ascii.CAN, 116, -37, -47, -59, -46, -80};
                    a(bArr11, new byte[]{105, 48, 80, -124, 125, 105, -126, 88, 42, -64, Framer.ENTER_FRAME_PREFIX, 103});
                    if (stringExtra.equals(new String(bArr11, charset).intern()) && (deviceState = this.b) != null) {
                        deviceState.onUnlockedDeviceDetected();
                    }
                    break;
                case 3506402:
                    byte[] bArr12 = {37, 109, 92, -9};
                    a(bArr12, new byte[]{-69, 53, -95, Framer.STDIN_FRAME_PREFIX, -36, -123, 122, -46});
                    if (stringExtra.equals(new String(bArr12, charset).intern())) {
                        this.f328a.onRootDetected();
                        break;
                    }
                    break;
                case 95458899:
                    byte[] bArr13 = {-107, 76, -32, Framer.ENTER_FRAME_PREFIX, 118};
                    a(bArr13, new byte[]{93, Framer.STDIN_REQUEST_FRAME_PREFIX, 48, -15, 17, -122, 19, -108});
                    if (stringExtra.equals(new String(bArr13, charset).intern())) {
                        this.f328a.onDebuggerDetected();
                        break;
                    }
                    break;
                case 99463088:
                    byte[] bArr14 = {Framer.STDOUT_FRAME_PREFIX, 77, 113, -7, -72};
                    a(bArr14, new byte[]{-67, 85, -116, 48, -53, -119, -111, 89});
                    if (stringExtra.equals(new String(bArr14, charset).intern())) {
                        this.f328a.onHookDetected();
                        break;
                    }
                    break;
                case 344200471:
                    byte[] bArr15 = {Ascii.GS, 83, 80, 59, 4, -62, -22, 42, -48, Ascii.ETB};
                    a(bArr15, new byte[]{-96, 53, -74, -14, -59, -50, 40, -28, -65, 121});
                    if (stringExtra.equals(new String(bArr15, charset).intern())) {
                        this.f328a.onAutomationDetected();
                        break;
                    }
                    break;
                case 639597323:
                    byte[] bArr16 = {-23, -21, 100, 78, 67, 41, 3, 12, -35, 69, -95, -84, -76, 48, -32, -79, 101, -76};
                    a(bArr16, new byte[]{-59, -114, -119, -46, -122, 117, Ascii.RS, Ascii.VT, -27, 108, Framer.EXIT_FRAME_PREFIX, 106, Framer.ENTER_FRAME_PREFIX, 109, 38, 123, Ascii.ETB, -47});
                    if (stringExtra.equals(new String(bArr16, charset).intern()) && (deviceState2 = this.b) != null) {
                        deviceState2.onHardwareBackedKeystoreNotAvailableDetected();
                    }
                    break;
                case 834063317:
                    byte[] bArr17 = {-115, -102, -23, -98, -103, -121, Ascii.FS};
                    a(bArr17, new byte[]{92, -23, 55, 118, -8, -11, 121, Ascii.RS});
                    if (stringExtra.equals(new String(bArr17, charset).intern())) {
                        byte[] bArr18 = {-119, 72, 75, -48, 66, -48, 40, 3, -29, 32, -15, -24};
                        a(bArr18, new byte[]{96, 119, -15, 101, -89, -17, -33, 58, -50, SignedBytes.MAX_POWER_OF_TWO, 37, 4});
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(new String(bArr18, charset).intern());
                        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
                            this.f328a.onMalwareDetected(parcelableArrayListExtra);
                            break;
                        }
                    }
                    break;
                case 1107986850:
                    byte[] bArr19 = {-90, -79, -115, Ascii.RS, -18, -87, -31, -100, Ascii.DLE, -27};
                    a(bArr19, new byte[]{43, -5, -99, -59, -4, -10, Framer.STDOUT_FRAME_PREFIX, -109, 117, -127});
                    if (stringExtra.equals(new String(bArr19, charset).intern()) && (deviceState3 = this.b) != null) {
                        deviceState3.onADBEnabledDetected();
                    }
                    break;
                case 1129117765:
                    byte[] bArr20 = {-37, -108, -54, 58, 99, -63, -36, Ascii.NAK, -11};
                    a(bArr20, new byte[]{12, -5, 79, -23, 98, -62, Ascii.CAN, 40, -69});
                    if (stringExtra.equals(new String(bArr20, charset).intern()) && (deviceState4 = this.b) != null) {
                        deviceState4.onSystemVPNDetected();
                    }
                    break;
                case 1336193813:
                    byte[] bArr21 = {99, -39, 60, -110, Ascii.DC4, 96, Ascii.US, 37};
                    a(bArr21, new byte[]{98, -86, -37, -104, -39, 57, -2, -11});
                    if (stringExtra.equals(new String(bArr21, charset).intern())) {
                        this.f328a.onEmulatorDetected();
                        break;
                    }
                    break;
                case 1556684755:
                    byte[] bArr22 = {71, Framer.ENTER_FRAME_PREFIX, -51, -121, 71, 54, -38, -86, -35, -9, -61, -19, -11, 6, -63, -34, 122, -28, -116, -9, 56, Ascii.DLE, -81, Utf8.REPLACEMENT_BYTE, 60, -125, 76};
                    a(bArr22, new byte[]{-98, 96, 75, -104, -98, 80, 56, 104, -27, -84, 91, 35, -19, -107, 94, Framer.STDIN_FRAME_PREFIX, 127, -90, -105, 54, -78, -82, 79, -41, 78, -32, 41});
                    if (stringExtra.equals(new String(bArr22, charset).intern())) {
                        this.f328a.onUntrustedInstallationSourceDetected();
                        break;
                    }
                    break;
                case 1558978392:
                    byte[] bArr23 = {65, Ascii.DC4, -56, 104, 75, 100, -53};
                    a(bArr23, new byte[]{-127, 100, 76, -122, 36, 0, -82, Framer.STDERR_FRAME_PREFIX});
                    if (stringExtra.equals(new String(bArr23, charset).intern()) && (deviceState5 = this.b) != null) {
                        deviceState5.onDeveloperModeDetected();
                    }
                    break;
                case 1580766949:
                    byte[] bArr24 = {-9, 5, -80, -90, 103, -101, -18, 40, 12, -1, 92, 75, 110, -44, -33};
                    a(bArr24, new byte[]{-24, -112, 83, 108, 110, -25, Framer.STDERR_FRAME_PREFIX, -18, -45, -125, -68, -55, 7, -70, -72});
                    if (stringExtra.equals(new String(bArr24, charset).intern())) {
                        this.f328a.onScreenRecordingDetected();
                        break;
                    }
                    break;
            }
        }
    }

    public final void registerListener(Context context) {
        byte[] bArr = {36, -46, Ascii.ESC, -71, 56, Ascii.DC2, Ascii.RS};
        a(bArr, new byte[]{-85, -48, -29, 111, 93, 106, 106, -118});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        byte[] bArr2 = {-24, 111, 51, -51, Ascii.SUB, -39, -48, 107, -117, -85, 90};
        a(bArr2, new byte[]{-40, Ascii.FS, -23, 124, -5, -123, Ascii.GS, -121, -59, -19, Ascii.NAK});
        localBroadcastManager.registerReceiver(this, new IntentFilter(new String(bArr2, charset).intern()));
    }

    public final void unregisterListener(Context context) {
        byte[] bArr = {-101, -57, 78, -95, -36, 126, -52};
        a(bArr, new byte[]{92, -38, -82, 119, -71, 6, -72, 57});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreatListener(ThreatDetected threatDetected, DeviceState deviceState) {
        this(threatDetected, deviceState, null, 4, null);
        byte[] bArr = {-24, -44, 52, Ascii.SYN, Ascii.RS, -56, Ascii.SYN};
        a(bArr, new byte[]{-8, -86, -44, Ascii.GS, 127, -68, 101, -109});
        Intrinsics.checkNotNullParameter(threatDetected, new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public ThreatListener(ThreatDetected threatDetected, DeviceState deviceState, RaspExecutionState raspExecutionState) {
        byte[] bArr = {-110, -109, -66, -114, 96, 47, 52};
        a(bArr, new byte[]{66, -23, 66, -108, 1, 91, 71, 39});
        Intrinsics.checkNotNullParameter(threatDetected, new String(bArr, StandardCharsets.UTF_8).intern());
        this.f328a = threatDetected;
        this.b = deviceState;
        this.c = raspExecutionState;
    }

    public /* synthetic */ ThreatListener(ThreatDetected threatDetected, DeviceState deviceState, RaspExecutionState raspExecutionState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(threatDetected, (i & 2) != 0 ? null : deviceState, (i & 4) != 0 ? null : raspExecutionState);
    }
}
