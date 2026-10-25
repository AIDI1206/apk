package com.aheaditec.talsec_security.security.api;

import android.app.Activity;
import android.content.Context;
import com.aheaditec.talsec.security.j4;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class Talsec extends TalsecBridge {
    public static final Talsec INSTANCE = new Talsec();

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

    @JvmStatic
    public static final void addToWhitelist(Context context, String str) {
        byte[] bArr = {108, 92, 126, 88, -112, -54, -7};
        a(bArr, new byte[]{Ascii.SI, 51, Ascii.DLE, 44, -11, -78, -115, -120});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        byte[] bArr2 = {108, -65, Framer.STDIN_REQUEST_FRAME_PREFIX, 56, -66, -96, 7, Ascii.VT, -98, -99, Ascii.ESC};
        a(bArr2, new byte[]{Ascii.FS, -34, 60, 83, -33, -57, 98, 69, -1, -16, 126});
        Intrinsics.checkNotNullParameter(str, new String(bArr2, charset).intern());
        Context applicationContext = context.getApplicationContext();
        byte[] bArr3 = {Framer.STDERR_FRAME_PREFIX, Ascii.ETB, Framer.STDOUT_FRAME_PREFIX, -71, 112, -41, 35, 73, -22, -68, -54, 106, -111, Framer.STDIN_FRAME_PREFIX, -6, Ascii.NAK, 3, -77, -15, 70, 66, Ascii.EM, -118, -105, -119, -66};
        a(bArr3, new byte[]{85, 114, 69, -8, 0, -89, 79, 32, -119, -35, -66, 3, -2, 67, -71, 122, 109, -57, -108, 62, 54, Framer.STDOUT_FRAME_PREFIX, -92, -71, -89, -105});
        Intrinsics.checkNotNullExpressionValue(applicationContext, new String(bArr3, charset).intern());
        TalsecBridge.addToWhitelist(applicationContext, str);
    }

    @JvmStatic
    public static final void blockScreenCapture(Activity activity, boolean z) {
        byte[] bArr = {-63, -81, 65, -101, -1, -1, -95, 56};
        a(bArr, new byte[]{-96, -52, 53, -14, -119, -106, -43, 65});
        Intrinsics.checkNotNullParameter(activity, new String(bArr, StandardCharsets.UTF_8).intern());
        TalsecBridge.blockScreenCapture(activity, z);
    }

    @JvmStatic
    public static final ByteBuffer getTalsecFlags() {
        return TalsecBridge.getTalsecFlags();
    }

    @JvmStatic
    public static final boolean isScreenCaptureBlocked() {
        return TalsecBridge.isScreenCaptureBlocked();
    }

    @JvmStatic
    public static final void onScreenRecordingDetected() {
        TalsecBridge.onScreenRecordingDetected();
    }

    @JvmStatic
    public static final void onScreenshotDetected() {
        TalsecBridge.onScreenshotDetected();
    }

    @JvmStatic
    public static final void removeExternalId(Context context) {
        byte[] bArr = {Ascii.ESC, -96, 78, 57, 12, 91, -5};
        a(bArr, new byte[]{Framer.EXIT_FRAME_PREFIX, -49, 32, 77, 105, 35, -113, 90});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        Context applicationContext = context.getApplicationContext();
        byte[] bArr2 = {67, 84, -36, 39, 79, -115, -9, SignedBytes.MAX_POWER_OF_TWO, -112, 80, Ascii.ETB, -59, 40, -26, -125, 90, -112, -28, SignedBytes.MAX_POWER_OF_TWO, 7, 124, -41, -62, -45, 38, 101};
        a(bArr2, new byte[]{36, Framer.STDOUT_FRAME_PREFIX, -88, 102, Utf8.REPLACEMENT_BYTE, -3, -101, 41, -13, Framer.STDOUT_FRAME_PREFIX, 99, -84, 71, -120, -64, 53, -2, -112, 37, 127, 8, -1, -20, -3, 8, 76});
        Intrinsics.checkNotNullExpressionValue(applicationContext, new String(bArr2, charset).intern());
        TalsecBridge.removeExternalId(applicationContext);
    }

    @JvmStatic
    public static final void start(Context context, TalsecConfig talsecConfig) {
        byte[] bArr = {-39, -66, -48, Ascii.DLE, 124, -114, -18};
        a(bArr, new byte[]{-70, -47, -66, 100, Ascii.EM, -10, -102, 108});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        byte[] bArr2 = {-70, 70, 10, -36, 79, -37};
        a(bArr2, new byte[]{-39, 41, 100, -70, 38, -68, 39, 51});
        Intrinsics.checkNotNullParameter(talsecConfig, new String(bArr2, charset).intern());
        start(context, talsecConfig, TalsecMode.BACKGROUND);
    }

    @JvmStatic
    public static final void stop() {
        TalsecBridge.stop();
    }

    @JvmStatic
    public static final ExternalIdResult storeExternalId(Context context, String str) {
        byte[] bArr = {41, 116, 88, -68, Ascii.GS, 100, -97};
        a(bArr, new byte[]{74, Ascii.ESC, 54, -56, Framer.EXIT_FRAME_PREFIX, Ascii.FS, -21, 114});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        byte[] bArr2 = {Ascii.GS, 56, 34, 9, -36, -10, -19, 65, 19, 51};
        a(bArr2, new byte[]{Framer.EXIT_FRAME_PREFIX, SignedBytes.MAX_POWER_OF_TWO, 86, 108, -82, -104, -116, Framer.STDIN_FRAME_PREFIX, 90, 87});
        Intrinsics.checkNotNullParameter(str, new String(bArr2, charset).intern());
        Context applicationContext = context.getApplicationContext();
        byte[] bArr3 = {69, 93, -106, -67, -122, 117, 124, -73, -59, 70, -69, Utf8.REPLACEMENT_BYTE, -89, -75, 88, 80, Ascii.US, SignedBytes.MAX_POWER_OF_TWO, Ascii.SYN, -123, -128, -124, 78, 67, -95, -97};
        a(bArr3, new byte[]{34, 56, -30, -4, -10, 5, Ascii.DLE, -34, -90, 39, -49, 86, -56, -37, Ascii.ESC, Utf8.REPLACEMENT_BYTE, 113, 52, 115, -3, -12, -84, 96, 109, -113, -74});
        Intrinsics.checkNotNullExpressionValue(applicationContext, new String(bArr3, charset).intern());
        return TalsecBridge.storeExternalId(applicationContext, str);
    }

    @JvmStatic
    public static final void start(Context context, TalsecConfig talsecConfig, TalsecMode talsecMode) {
        byte[] bArr = {115, 41, 81, Ascii.SYN, 40, -61, -48};
        a(bArr, new byte[]{Ascii.DLE, 70, Utf8.REPLACEMENT_BYTE, 98, 77, -69, -92, -67});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        byte[] bArr2 = {7, -32, -80, 106, -124, 81};
        a(bArr2, new byte[]{100, -113, -34, 12, -19, 54, 41, -123});
        Intrinsics.checkNotNullParameter(talsecConfig, new String(bArr2, charset).intern());
        byte[] bArr3 = {Framer.STDIN_FRAME_PREFIX, -57, Ascii.NAK, Ascii.NAK};
        a(bArr3, new byte[]{SignedBytes.MAX_POWER_OF_TWO, -88, 113, 112, 107, 89, -88, 98});
        Intrinsics.checkNotNullParameter(talsecMode, new String(bArr3, charset).intern());
        TalsecBridge.Companion companion = TalsecBridge.Companion;
        j4.b bVar = j4.h;
        Context applicationContext = context.getApplicationContext();
        byte[] bArr4 = {118, -23, -43, 80, -60, 125, 90, 48, 55, 69, 32, -73, Ascii.SO, 8, -94, -69, SignedBytes.MAX_POWER_OF_TWO, 48, 5, -74, -1, -14, -97, 107, Ascii.SYN, -14};
        a(bArr4, new byte[]{17, -116, -95, 17, -76, Ascii.CR, 54, 89, 84, 36, 84, -34, 97, 102, -31, -44, 46, 68, 96, -50, -117, -38, -79, 69, 56, -37});
        Intrinsics.checkNotNullExpressionValue(applicationContext, new String(bArr4, charset).intern());
        companion.setInstance$TalsecSecurity_v18_3_0_basicRelease(bVar.a(applicationContext, talsecConfig, talsecMode));
    }
}
