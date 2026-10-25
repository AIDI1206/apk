package com.aheaditec.talsec.security;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class t4 extends BroadcastReceiver implements m2 {
    public static final a f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final long j = 3000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f292a;
    public final Context b;
    public final LocalBroadcastManager c;
    public final ConcurrentHashMap<String, Runnable> d;
    public final Handler e;

    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {-112, -114, -120, -43, 76, 88, -46, -46, 94, -54, -109, Utf8.REPLACEMENT_BYTE};
        a(bArr, new byte[]{104, -69, 76, 114, -87, Ascii.EM, 3, 103, -90, -28, 38, -110});
        Charset charset = StandardCharsets.UTF_8;
        i = new String(bArr, charset).intern();
        byte[] bArr2 = {-127, -48, Ascii.FS, -120, -9, 112, 73, -123, 109};
        a(bArr2, new byte[]{108, -21, -92, 57, -12, 66, -6, 51, 44});
        h = new String(bArr2, charset).intern();
        byte[] bArr3 = {-84, 41, -1, -119, 19, -29, 36, 112, -97, -5, -82};
        a(bArr3, new byte[]{84, 7, 65, 60, -6, -45, -11, -37, -47, -67, -31});
        g = new String(bArr3, charset).intern();
        f = new a(null);
    }

    public t4(boolean z, Context context) {
        byte[] bArr = {92, -23, -35, -105, -66, 93, -42};
        a(bArr, new byte[]{91, -76, Base64.padSymbol, 65, -37, 37, -94, -112});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(context, new String(bArr, charset).intern());
        this.f292a = z;
        this.b = context;
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        byte[] bArr2 = {-12, -68, 66, Ascii.CR, -123, -39, 81, 80, -73, -106, -79, -47, -104, -53, -86, 70};
        a(bArr2, new byte[]{-1, -17, -92, -90, -105, -72, -73, -109, -91, -57, 102, 91, 74, -48, 10, -51});
        Intrinsics.checkNotNullExpressionValue(localBroadcastManager, new String(bArr2, charset).intern());
        this.c = localBroadcastManager;
        this.d = new ConcurrentHashMap<>();
        this.e = new Handler(Looper.getMainLooper());
        byte[] bArr3 = {-54, -84, -128, -110, 59, 110, 58, -50, Framer.ENTER_FRAME_PREFIX, -95, -1};
        a(bArr3, new byte[]{Framer.STDERR_FRAME_PREFIX, -126, 62, 39, -46, 94, -21, 101, 111, -25, -80});
        localBroadcastManager.registerReceiver(this, new IntentFilter(new String(bArr3, charset).intern()));
    }

    public static /* synthetic */ void a() {
    }

    public final void b() {
        List<ActivityManager.AppTask> appTasks;
        byte[] bArr = {99, Ascii.SYN, 67, 2, -119, Ascii.SO, -57, -24, 122, -38, -75, 4};
        a(bArr, new byte[]{-101, 35, -121, -91, 108, 79, Ascii.SYN, 93, -126, -12, 0, -87});
        Charset charset = StandardCharsets.UTF_8;
        new String(bArr, charset).intern();
        byte[] bArr2 = {-113, SignedBytes.MAX_POWER_OF_TWO, 68, 87, -38, 106, -120, Ascii.VT, 1, -47, -55, -98, -9, -57, -30, -36, -60, 42, 73, -39, 66, -99, -32, -12, -76, -95, -98, -98, -2, -16, 92, -48, 107, 70, -96, -113, 93, -116, -122, 77, -82, -121, -95};
        a(bArr2, new byte[]{99, Ascii.SO, -84, -112, Ascii.RS, Ascii.VT, 105, -119, Ascii.SO, -122, Ascii.ETB, 80, 51, -90, 56, Ascii.ESC, 0, 107, -102, Ascii.ETB, 85, -50, 53, 118, 92, -13, 65, 79, 58, -34, -66, 2, 123, 17, 117, 76, 69, -37, 103, -99, -113, -90, -128});
        new String(bArr2, charset).intern();
        Context context = this.b;
        byte[] bArr3 = {-15, 38, -24, -95, -54, Ascii.CR, -119, -116};
        a(bArr3, new byte[]{-12, 119, Ascii.SO, 106, -48, 90, 111, 87});
        Object systemService = context.getSystemService(new String(bArr3, charset).intern());
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null) {
            Iterator<T> it = appTasks.iterator();
            while (it.hasNext()) {
                ((ActivityManager.AppTask) it.next()).finishAndRemoveTask();
            }
        }
        try {
            System.exit(0);
            byte[] bArr4 = {80, 87, 110, 103, 4, 9, 113, 109, 4, 69, 87, -127, -126, Framer.EXIT_FRAME_PREFIX, 70, 106, -95, 79, -35, -9, 76, Ascii.EM, 104, Ascii.SYN, 69, Ascii.DC2, Ascii.GS, -29, 73, 80, 127, 70, Framer.ENTER_FRAME_PREFIX, 121, 58, 66, -22, -43, 52, -80, -4, -52, Ascii.SUB, -51, -119, Framer.STDERR_FRAME_PREFIX, Framer.ENTER_FRAME_PREFIX, -76, -80, 115, 46, 39, 54, -57, -32, -81, -94, -10, Ascii.NAK, -70, 80, -79, -59, -125, -68};
            a(bArr4, new byte[]{-89, Framer.STDOUT_FRAME_PREFIX, -117, -79, Ascii.CR, 82, -47, -86, Ascii.CAN, Ascii.DC2, -79, 3, -108, 43, -96, -67, -73, 19, 10, Framer.STDOUT_FRAME_PREFIX, -120, 66, -119, -62, 84, 93, -61, Framer.STDIN_FRAME_PREFIX, 84, 74, -19, -97, Framer.STDIN_FRAME_PREFIX, 46, -28, -123, 46, -125, -46, Framer.STDERR_FRAME_PREFIX, -25, -125, -1, 79, -98, 81, -61, 102, -93, Ascii.DC2, -7, -31, -14, -90, 1, Framer.STDIN_FRAME_PREFIX, -82, -71, -53, 108, -108, -122, Ascii.CR, 44, -110});
            throw new RuntimeException(new String(bArr4, StandardCharsets.UTF_8).intern());
        } catch (Exception unused) {
            Process.killProcess(Process.myPid());
        } catch (Throwable th) {
            Process.killProcess(Process.myPid());
            throw th;
        }
    }

    public final void c() {
        this.c.unregisterReceiver(this);
        this.e.removeCallbacksAndMessages(null);
        this.d.clear();
        byte[] bArr = {37, -58, -50, Ascii.SO, -35, -20, 46, Ascii.SO, Framer.STDIN_FRAME_PREFIX, -69, -66, -37};
        a(bArr, new byte[]{-35, -13, 10, -87, 56, -83, -1, -69, -43, -107, Ascii.VT, 118});
        Charset charset = StandardCharsets.UTF_8;
        new String(bArr, charset).intern();
        byte[] bArr2 = {-24, -123, -49, -75, -61, 34, Ascii.US, 98, Ascii.DC4, -90, 69, 97, 117, 100, -81, 73, -81, 8, -32, 109, 117, 41, Ascii.DC2, -48, Ascii.ETB, Base64.padSymbol, -97, 117, 94, -33, 88, 37, 121, -42, -86, 73, 87, -108, -80, -36, -79, 98, -35, Framer.ENTER_FRAME_PREFIX, 39, -120};
        a(bArr2, new byte[]{Ascii.DLE, -48, 43, 114, -58, SignedBytes.MAX_POWER_OF_TWO, -38, -76, 17, -9, -104, -29, 99, 55, 122, -114, -94, 108, 55, -71, -79, 75, -14, 4, Ascii.RS, 104, 68, -96, 70, -116, -68, -30, 113, -40, 79, -98, 80, -59, 103, 9, -90, 54, 58, -17, 75, -15});
        new String(bArr2, charset).intern();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Runnable runnable;
        if (intent != null) {
            byte[] bArr = {-69, 77, 112, -30, -90, -89, -79, 67, 111};
            a(bArr, new byte[]{86, 118, -56, 83, -91, -107, 2, -11, 46});
            String stringExtra = intent.getStringExtra(new String(bArr, StandardCharsets.UTF_8).intern());
            if (stringExtra == null || (runnable = this.d.get(stringExtra)) == null) {
                return;
            }
            this.e.removeCallbacks(runnable);
            this.d.remove(stringExtra);
        }
    }

    @Override // com.aheaditec.talsec.security.m2
    public void a(final String str) {
        byte[] bArr = {57, 41, Ascii.ESC, -69, 83, -121, 82, -103, Ascii.US, 114};
        a(bArr, new byte[]{Framer.ENTER_FRAME_PREFIX, 127, -1, 124, 86, -27, -110, 90, 114, Ascii.ETB});
        Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
        Runnable runnable = new Runnable() { // from class: com.aheaditec.talsec.security.t4$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                t4.a(str, this);
            }
        };
        this.d.put(str, runnable);
        this.e.postDelayed(runnable, 3000L);
    }

    public static final void a(String str, t4 t4Var) {
        byte[] bArr = {-20, 121, 97, Ascii.GS, -99, -103, Ascii.CR, -89, 104, Ascii.SUB, Ascii.DC4};
        a(bArr, new byte[]{36, Ascii.CAN, -69, -55, -108, -42, -21, Ascii.ETB, 9, 119, 113});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        byte[] bArr2 = {-56, 101, -1, 9, 73, Ascii.NAK};
        a(bArr2, new byte[]{-48, 51, 36, -36, 109, 37, -68, 121});
        Intrinsics.checkNotNullParameter(t4Var, new String(bArr2, charset).intern());
        byte[] bArr3 = {-17, -43, 44, 93, 1, 59, 66, -62, Ascii.NAK, -76, 52, -110};
        a(bArr3, new byte[]{Ascii.ETB, -32, -24, -6, -28, 122, -109, 119, -19, -102, -127, Utf8.REPLACEMENT_BYTE});
        new String(bArr3, charset).intern();
        byte[] bArr4 = {107, 89, 81, 109, -95, -72, -37, Base64.padSymbol, -39, -46, -79, -27, -32, 112, -114, -38, -38, -27, -102, 82, 118, 78, -13, 78, -38, 88, -79, 48, 12, -84, -83, -85, 67, Ascii.VT, -109, 91, 101, 87, 37, -56, 102, 121, 87, -80};
        a(bArr4, new byte[]{-115, Utf8.REPLACEMENT_BYTE, -77, -82, -74, -39, 73, -5, -48, -80, 102, 32, -8, 35, 88, 89, Ascii.RS, -34, 123, -48, 112, 46, Ascii.DC2, -115, -46, 9, 98, -27, Ascii.DC4, -94, 73, 108, 68, 88, 72, -125, 108, 5, -73, 0, 117, Ascii.EM, -5, Framer.STDERR_FRAME_PREFIX});
        String strIntern = new String(bArr4, charset).intern();
        byte[] bArr5 = {-77, -61, -93, 101, -35, 17, -8, -107, 46};
        a(bArr5, new byte[]{119, -107, 67, -25, -59, 70, 39, 82, 0});
        String str2 = strIntern + str + new String(bArr5, charset).intern();
        if (t4Var.f292a) {
            t4Var.b();
        }
        t4Var.d.remove(str);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = null;
        int i2 = 0;
        int i3 = 0;
        int length = 0;
        int i4 = -894652659;
        byte[] bArr4 = null;
        while (true) {
            int i5 = ((i4 & 16777216) * (i4 | 16777216)) + ((i4 & (-16777217)) * ((~i4) & 16777216));
            int i6 = i4 >>> 8;
            int i7 = (i6 + i5) - (i6 & i5);
            int i8 = (i7 ^ 1458005263) + ((i7 & 1458005263) * 2);
            int i9 = -34715366;
            switch ((i8 - 1434379843) + (((~i8) & 1434379843) * 2)) {
                case -1970406716:
                    int length2 = bArr4.length;
                    int i10 = 0 - i2;
                    int i11 = ~i10;
                    int i12 = ((length2 | i10) - ((602749225 & i11) & length2)) + ((i10 | 602749225) & length2);
                    byte b = bArr3[i12];
                    int length3 = bArr4.length;
                    byte b2 = bArr3[(length3 ^ i11) + ((i10 | length3) * 2) + 1];
                    int i13 = ((byte) 0) - b;
                    bArr3[i12] = (byte) (((byte) (((byte) 2) * ((byte) (b2 & (~i13))))) - ((byte) (b2 ^ i13)));
                    break;
                case -1882653318:
                    int i14 = (i3 - 1) - (i3 | (-4));
                    byte b3 = bArr3[i14];
                    int i15 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                    int i16 = i3 + 3 + (((-1) - i3) | (-3));
                    int i17 = bArr3[i16] & 255;
                    int i18 = i17 * ((~i17) & 65536);
                    int i19 = ~((i15 | (1169991170 | (~i18))) - ((i18 & 1169991170) | i15));
                    int iA = m0.a(689061172 & i3, i3, 1, 689061173 & i3);
                    int i20 = bArr3[iA] & 255;
                    int i21 = ((~i19) & (i20 * ((~i20) & 256))) + i19;
                    int i22 = (i21 - 1) - ((~(bArr3[i3] & 255)) | i21);
                    byte b4 = bArr4[i14];
                    int i23 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                    int i24 = bArr4[i16] & 255;
                    int i25 = i24 * ((~i24) & 65536);
                    int i26 = ~((i23 | ((-445685625) | (~i25))) - ((i25 & (-445685625)) | i23));
                    int i27 = bArr4[iA] & 255;
                    int i28 = i27 * ((~i27) & 256);
                    int i29 = (i28 + i26) - (i28 & i26);
                    int i30 = bArr4[i3] & 255;
                    int i31 = (i29 & (~i30)) + i30;
                    int i32 = i22 << ((i22 > Double.NaN ? 1 : (i22 == Double.NaN ? 0 : -1)) >>> 31);
                    int i33 = (i32 + i31) - ((i32 & i31) * 2);
                    int i34 = 659933421 - ((i33 & 2) | ((-1983400303) - i33));
                    bArr4[i3] = (byte) i34;
                    bArr4[iA] = (byte) (i34 >>> 8);
                    bArr4[i16] = (byte) (i34 >>> 16);
                    bArr4[i14] = (byte) (i34 >>> 24);
                    i3 = (i3 ^ 4) + ((i3 & 4) * 2);
                    int length4 = bArr4.length;
                    int length5 = 0 - (bArr4.length % 4);
                    int i35 = 1 & ((i3 > ((length4 ^ length5) + ((length4 & length5) * 2)) ? 1 : (i3 == ((length4 ^ length5) + ((length4 & length5) * 2)) ? 0 : -1)) >>> 31);
                    i4 = i35 != 0 ? -826922365 : i35 != 0 ? 196573321 : 145880015;
                    break;
                case -625567707:
                    break;
                case 172635213:
                    int length6 = bArr4.length;
                    int i36 = 0 - length;
                    i4 = (((double) ((byte) bArr3[(length6 ^ i36) + ((length6 & i36) * 2)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[(length6 ^ i36) + ((length6 & i36) * 2)])) == Double.NaN ? 0 : -1)) > -1 ? -34715366 : 196573321;
                    i2 = length;
                    break;
                case 614184219:
                    int length7 = bArr4.length;
                    int i37 = 0 - i2;
                    int i38 = i37 * 3;
                    int iA2 = p0.a(i37, -4, 1, length7);
                    int length8 = bArr4.length;
                    byte b5 = bArr4[(length8 ^ i37) + ((length8 & i37) * 2)];
                    int length9 = bArr4.length;
                    int i39 = 0 - i37;
                    byte b6 = bArr3[(((~i39) & length9) * 2) - (length9 ^ i39)];
                    bArr4[n0.a(0, (length7 & 2) | iA2, i38, 1)] = (byte) (((byte) (b6 + b5)) - ((byte) (((byte) 2) * ((byte) (b6 & b5)))));
                    length = ((-338014207) | i2) + (338014206 | i2);
                    int i40 = ((i2 > 2 ? 1 : (i2 == 2 ? 0 : -1)) >>> 31) & 1;
                    i9 = i40 != 0 ? 196573321 : 1298988808;
                    i4 = i40 == 0 ? i9 : -518432968;
                    break;
                case 835516413:
                    int length10 = bArr.length;
                    int length11 = 0 - (0 - (bArr.length % 4));
                    boolean z = (length10 ^ length11) - (((~length10) & length11) * 2) > 0;
                    i4 = z ? -826922365 : z ? 196573321 : 145880015;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i3 = 0;
                    break;
                case 1888416065:
                    length = bArr4.length % 4;
                    int i41 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                    i9 = i41 != 0 ? 196573321 : 1298988808;
                    if (i41 == 0) {
                    }
                    break;
                default:
                    i4 = 196573321;
                    break;
            }
            return;
        }
    }
}
