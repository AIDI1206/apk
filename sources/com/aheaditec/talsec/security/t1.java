package com.aheaditec.talsec.security;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import androidx.biometric.BiometricManager;
import com.facebook.stetho.dumpapp.Framer;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public class t1 {
    public static final String p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BiometricManager f288a;
    public final s2 b;
    public final p2 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    static {
        byte[] bArr = {Ascii.NAK, 58, 72, 62, -24};
        a(bArr, new byte[]{112, 72, 58, 81, -102, Base64.padSymbol, -127, -8});
        p = new String(bArr, StandardCharsets.UTF_8).intern();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0048  */
    public t1(Context context) {
        BiometricManager biometricManagerFrom;
        byte[] bArr = {-118, 84, 115, -66, 126, 53, Ascii.SI, Ascii.SYN, -16, 106, 124, -83, 39, 87, Ascii.SUB, 10, 91, 73, -114, 60, -45, Framer.ENTER_FRAME_PREFIX, -66, 111, 48, Ascii.ESC, 119, -33, Ascii.DC4, 66, -106, 108};
        a(bArr, new byte[]{-21, 58, Ascii.ETB, -52, 17, 92, 107, 56, -128, Ascii.SI, Ascii.SO, -64, 78, 36, 105, 99, 52, 39, -96, 105, -128, 100, -31, Framer.STDIN_FRAME_PREFIX, 121, 84, 58, -102, SignedBytes.MAX_POWER_OF_TWO, Ascii.DLE, -33, 47});
        if (context.checkSelfPermission(new String(bArr, StandardCharsets.UTF_8).intern()) != 0) {
            byte[] bArr2 = {-56, 67, 4, -74, -6, -67, -39, 12, Utf8.REPLACEMENT_BYTE, 111, 80, Ascii.SYN, -70, Ascii.SYN, -60, Framer.STDERR_FRAME_PREFIX, 48, 51, 78, 113, -122, -60, 4, 115, -49, -120, Ascii.FS, -13, 7, 19, -104, 5, Ascii.DC4, -20};
            a(bArr2, new byte[]{-87, Framer.STDIN_FRAME_PREFIX, 96, -60, -107, -44, -67, 34, 79, 10, 34, 123, -45, 101, -73, 91, Framer.STDIN_REQUEST_FRAME_PREFIX, 93, 96, 36, -43, -127, 91, 53, -122, -58, 91, -74, 85, 67, -54, 76, 90, -72});
            if (context.checkSelfPermission(new String(bArr2, StandardCharsets.UTF_8).intern()) == 0) {
                biometricManagerFrom = BiometricManager.from(context);
            } else {
                biometricManagerFrom = null;
            }
        } else {
            biometricManagerFrom = BiometricManager.from(context);
        }
        this.f288a = biometricManagerFrom;
        this.b = s2.b.a(context);
        this.c = new p2(context);
        this.f = a(context);
        this.d = b(context);
        this.e = c(context);
        this.g = d(context);
        this.h = e(context);
        this.i = Build.VERSION.SECURITY_PATCH;
        this.j = g();
        this.k = m();
        this.l = e();
        this.m = t();
        byte[] bArr3 = {35, -35, -38, 48, -40, 118, 65, 62, Ascii.SYN, -92, 60, 35, -34, -124, 89, 98};
        a(bArr3, new byte[]{74, -82, -119, 117, -108, Ascii.US, 47, 75, 110, -31, 82, 66, -68, -24, 60, 6});
        Charset charset = StandardCharsets.UTF_8;
        this.n = b(new String(bArr3, charset).intern());
        byte[] bArr4 = {0, -23, 9, -22, -77, 62, -110, -30, 125, 80, 89, -101, -109, 41, 112, -12, -111};
        a(bArr4, new byte[]{105, -102, 90, -81, -1, 87, -4, -105, 5, Ascii.NAK, 55, -3, -4, 91, 19, -111, -11});
        this.o = b(new String(bArr4, charset).intern());
    }

    public final String a(Context context) {
        String str;
        int i = -1;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            byte[] bArr = {92, -111, -30, 76, -59, -100, -12, Ascii.DC2, 73, -96, -86};
            a(bArr, new byte[]{Base64.padSymbol, -11, -128, 19, -96, -14, -107, 112, 37, -59, -50});
            i = Settings.Global.getInt(contentResolver, new String(bArr, StandardCharsets.UTF_8).intern(), -1);
        } catch (Exception unused) {
        }
        if (i == 0) {
            byte[] bArr2 = {-89, -58, 91, -80, 81};
            a(bArr2, new byte[]{-63, -89, 55, -61, 52, -55, 81, 8});
            str = new String(bArr2, StandardCharsets.UTF_8);
        } else {
            if (i != 1) {
                byte[] bArr3 = {116, -99, 90, -58, 65, 112, -81, Framer.ENTER_FRAME_PREFIX, -69};
                a(bArr3, new byte[]{1, -13, 62, -93, 39, Ascii.EM, -63, 68, -33});
                return new String(bArr3, StandardCharsets.UTF_8).intern();
            }
            byte[] bArr4 = {-79, 102, Ascii.DC4, -76};
            a(bArr4, new byte[]{-59, Ascii.DC4, 97, -47, Base64.padSymbol, 112, 106, 105});
            str = new String(bArr4, StandardCharsets.UTF_8);
        }
        return str.intern();
    }

    public String b() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[Catch: SecurityException -> 0x0077, TryCatch #0 {SecurityException -> 0x0077, blocks: (B:6:0x0008, B:13:0x001b, B:14:0x0030, B:16:0x0035, B:17:0x004a, B:18:0x0061), top: B:21:0x0008 }] */
    public String c() {
        String str;
        BiometricManager biometricManager = this.f288a;
        if (biometricManager == null) {
            return null;
        }
        try {
            int iCanAuthenticate = biometricManager.canAuthenticate(255);
            if (iCanAuthenticate == 0) {
                byte[] bArr = {89, -4, -23, -111, -119, -76};
                a(bArr, new byte[]{56, -97, -99, -8, -1, -47, Framer.STDOUT_FRAME_PREFIX, 38});
                str = new String(bArr, StandardCharsets.UTF_8);
            } else if (iCanAuthenticate == 1) {
                byte[] bArr2 = {8, -63, -43, -64, -26, 59, 34, -117, -70, -17};
                a(bArr2, new byte[]{102, -82, -99, -95, -108, Framer.STDIN_REQUEST_FRAME_PREFIX, 85, -22, -56, -118});
                str = new String(bArr2, StandardCharsets.UTF_8);
            } else if (iCanAuthenticate == 11) {
                byte[] bArr3 = {-22, -87, -85, -99, 123, 117, Framer.ENTER_FRAME_PREFIX, -65, 97, 80, -28, Ascii.FS};
                a(bArr3, new byte[]{-124, -58, -59, -8, 62, Ascii.ESC, 83, -48, Ascii.CR, 60, -127, Framer.EXIT_FRAME_PREFIX});
                str = new String(bArr3, StandardCharsets.UTF_8);
            } else if (iCanAuthenticate != 12) {
                byte[] bArr4 = {-9, 100, 10, 101, -3};
                a(bArr4, new byte[]{-110, Ascii.SYN, Framer.EXIT_FRAME_PREFIX, 10, -113, Framer.STDERR_FRAME_PREFIX, 3, 2});
                str = new String(bArr4, StandardCharsets.UTF_8);
            } else {
                byte[] bArr5 = {8, -63, -43, -64, -26, 59, 34, -117, -70, -17};
                a(bArr5, new byte[]{102, -82, -99, -95, -108, Framer.STDIN_REQUEST_FRAME_PREFIX, 85, -22, -56, -118});
                str = new String(bArr5, StandardCharsets.UTF_8);
            }
            return str.intern();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public String d() {
        return this.l;
    }

    public final String e() {
        byte[] bArr = {-75, 94, -96, 40, -54, -54, -30, 59, 126, 60, -91, 19, 0, -39, 97, 8, 86, -93, SignedBytes.MAX_POWER_OF_TWO, 79, -6, -22, -28};
        a(bArr, new byte[]{-46, 59, -44, 88, -72, -91, -110, Ascii.ESC, 12, 83, -117, 113, 111, -74, Ascii.NAK, 38, 37, -58, 44, 38, -108, -97, -100});
        return a(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public String f() {
        return this.j;
    }

    public final String g() {
        byte[] bArr = {126, 10, -57, 125, -63, -7, -111, -112, -14, 100, Framer.EXIT_FRAME_PREFIX, 52, 92, 84, 96, -89, -74, 110, 71, -10, -112, -67, -74, -101};
        a(bArr, new byte[]{Ascii.EM, 111, -77, Ascii.CR, -77, -106, -31, -80, -128, Ascii.VT, 86, 86, 41, Base64.padSymbol, 12, -61, -104, Ascii.GS, 34, -102, -7, -45, -61, -29});
        return a(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public boolean h() {
        return this.d;
    }

    public boolean i() {
        return this.e;
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.c.a().toString();
    }

    public String l() {
        String str;
        s2 s2Var = this.b;
        if (s2Var == null) {
            byte[] bArr = {5, -78, 2, -76, -34};
            a(bArr, new byte[]{96, -64, 112, -37, -84, -25, 55, -84});
            str = new String(bArr, StandardCharsets.UTF_8);
        } else if (s2Var.a()) {
            byte[] bArr2 = {SignedBytes.MAX_POWER_OF_TWO, -121, -68, 124, Ascii.ESC, -95};
            a(bArr2, new byte[]{44, -24, -33, Ascii.ETB, 126, -59, 36, 100});
            str = new String(bArr2, StandardCharsets.UTF_8);
        } else {
            byte[] bArr3 = {Ascii.NAK, 111, 10, 67, 52, -25, -2, -89};
            a(bArr3, new byte[]{96, 1, 102, 44, 87, -116, -101, -61});
            str = new String(bArr3, StandardCharsets.UTF_8);
        }
        return str.intern();
    }

    public final String m() {
        byte[] bArr = {-101, 19, -59, Ascii.SI, -12, -78, SignedBytes.MAX_POWER_OF_TWO, Ascii.CR, -64, 92};
        a(bArr, new byte[]{-4, 118, -79, 106, -102, -44, 47, 127, -93, 57});
        return a(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public final String n() {
        return Build.VERSION.SECURITY_PATCH;
    }

    public String o() {
        return this.i;
    }

    public String p() {
        return this.n;
    }

    public String q() {
        return this.o;
    }

    public String r() {
        return this.m;
    }

    public String s() {
        return this.k;
    }

    public final String t() {
        String str;
        byte[] bArr = {-128, 105, -43, -6, -105, -63, -48, -16, -124, 92, -120, 77, 116, 19, -10, -31, -34, -98, 79, 71, 60, 86, Ascii.DLE};
        a(bArr, new byte[]{-81, Ascii.SUB, -84, -119, -72, -89, -93, -33, -9, 57, -28, 36, Ascii.SUB, 102, -114, -50, -69, -16, 41, 40, 78, 53, 117});
        Charset charset = StandardCharsets.UTF_8;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(new String(bArr, charset).intern())));
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    byte[] bArr2 = {-111, 92, -29, 103};
                    a(bArr2, new byte[]{-1, 51, -115, 2, -95, 69, Ascii.RS, -128});
                    str = new String(bArr2, charset);
                } else {
                    byte[] bArr3 = {-54};
                    a(bArr3, new byte[]{-6, 3, -34, 94, 68, 103, -33, -34});
                    if (line.contains(new String(bArr3, charset).intern())) {
                        byte[] bArr4 = {-8, -127, 110, 32, Ascii.CAN, -80, -90, 5, -100, -97};
                        a(bArr4, new byte[]{-120, -28, Ascii.FS, 77, 113, -61, -43, 108, -22, -6});
                        str = new String(bArr4, charset);
                    } else {
                        byte[] bArr5 = {56};
                        a(bArr5, new byte[]{9, -118, -112, Utf8.REPLACEMENT_BYTE, -15, -59, -27, -59});
                        if (line.contains(new String(bArr5, charset).intern())) {
                            byte[] bArr6 = {-115, 55, -61, 5, 90, -38, 39, -101, Framer.STDIN_REQUEST_FRAME_PREFIX};
                            a(bArr6, new byte[]{-24, 89, -91, 106, 40, -71, 78, -11, 56});
                            str = new String(bArr6, charset);
                        } else {
                            byte[] bArr7 = {-77, Framer.ENTER_FRAME_PREFIX, 125, 100, Ascii.NAK, 62, -7};
                            a(bArr7, new byte[]{-58, 79, Ascii.SYN, 10, 122, 73, -105, 104});
                            str = new String(bArr7, charset);
                        }
                    }
                }
                String strIntern = str.intern();
                bufferedReader.close();
                return strIntern;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            byte[] bArr8 = {88, -23, 41, 67, Ascii.SO};
            a(bArr8, new byte[]{Base64.padSymbol, -101, 91, 44, 124, Framer.STDIN_REQUEST_FRAME_PREFIX, -34, -59});
            return new String(bArr8, StandardCharsets.UTF_8).intern();
        }
    }

    public String a() {
        return this.g;
    }

    public final String b(String str) {
        String str2;
        try {
            byte[] bArr = {-66, 104, -56, 93, 2, -45, -16, 38, 12, 72, -84, 66, -34, -71, -125, Ascii.VT, -9, 110};
            a(bArr, new byte[]{-33, 6, -84, 47, 109, -70, -108, 8, 99, 59, -126, 17, -101, -11, -22, 101, -126, Ascii.SYN});
            return String.valueOf(((Boolean) Class.forName(new String(bArr, StandardCharsets.UTF_8).intern()).getMethod(str, null).invoke(null, null)).booleanValue());
        } catch (Error unused) {
            byte[] bArr2 = {Ascii.NAK, -87, Ascii.VT, 10, -108};
            a(bArr2, new byte[]{112, -37, 121, 101, -26, -86, -1, -84});
            str2 = new String(bArr2, StandardCharsets.UTF_8);
            return str2.intern();
        } catch (Exception unused2) {
            byte[] bArr3 = {-33, 125, 90, 73, -96};
            a(bArr3, new byte[]{-70, Ascii.SI, 40, 38, -46, 59, -46, -75});
            str2 = new String(bArr3, StandardCharsets.UTF_8);
            return str2.intern();
        }
    }

    public final boolean c(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            byte[] bArr = {-21, Ascii.EM, -116, 75, 8, 83, -73, 3, 3, Ascii.FS, -2, -88, 125, 87, -113};
            a(bArr, new byte[]{-120, 118, -31, 101, 96, 38, -42, 116, 102, 117, -48, -64, 10, 62, -21});
            if (packageManager.getPackageInfo(new String(bArr, StandardCharsets.UTF_8).intern(), 128) != null) {
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final String d(Context context) {
        String str;
        int i = -1;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            byte[] bArr = {-14, 43, 42, 117, -41, Framer.STDIN_REQUEST_FRAME_PREFIX, 36, 113, -63};
            a(bArr, new byte[]{-109, 94, 94, Ascii.SUB, -120, 43, 77, Ascii.FS, -92});
            i = Settings.Global.getInt(contentResolver, new String(bArr, StandardCharsets.UTF_8).intern(), -1);
        } catch (Exception unused) {
        }
        if (i == 0) {
            byte[] bArr2 = {122, 109, -103, 92, 4};
            a(bArr2, new byte[]{Ascii.FS, 12, -11, 47, 97, -9, -99, -83});
            str = new String(bArr2, StandardCharsets.UTF_8);
        } else {
            if (i != 1) {
                byte[] bArr3 = {Framer.STDIN_FRAME_PREFIX, 109, 54, -100, -21, 48, 41, 62, -34};
                a(bArr3, new byte[]{88, 3, 82, -7, -115, 89, 71, 91, -70});
                return new String(bArr3, StandardCharsets.UTF_8).intern();
            }
            byte[] bArr4 = {59, 72, -47, -21};
            a(bArr4, new byte[]{79, 58, -92, -114, 117, -73, -122, -26});
            str = new String(bArr4, StandardCharsets.UTF_8);
        }
        return str.intern();
    }

    public final String e(Context context) {
        String str;
        int i = -1;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            byte[] bArr = {-89, -32, -6, 101, 55, Ascii.DC4, -59, 98, 34, -80, -71, -58, 108, Ascii.ESC};
            a(bArr, new byte[]{-58, -107, -114, 10, 104, 96, -84, Ascii.SI, 71, -17, -61, -87, 2, 126});
            i = Settings.Global.getInt(contentResolver, new String(bArr, StandardCharsets.UTF_8).intern(), -1);
        } catch (Exception unused) {
        }
        if (i == 0) {
            byte[] bArr2 = {-52, 4, 111, 38, 71};
            a(bArr2, new byte[]{-86, 101, 3, 85, 34, 60, -90, -74});
            str = new String(bArr2, StandardCharsets.UTF_8);
        } else {
            if (i != 1) {
                byte[] bArr3 = {43, -68, -74, -34, Ascii.FS, Ascii.DC4, 100, Ascii.US, -119};
                a(bArr3, new byte[]{94, -46, -46, -69, 122, 125, 10, 122, -19});
                return new String(bArr3, StandardCharsets.UTF_8).intern();
            }
            byte[] bArr4 = {88, 8, -37, -114};
            a(bArr4, new byte[]{44, 122, -82, -21, -24, -56, 17, Ascii.SI});
            str = new String(bArr4, StandardCharsets.UTF_8);
        }
        return str.intern();
    }

    public final String a(String str) {
        String str2;
        try {
            String strC = o4.c(str);
            if (strC != null && !strC.isEmpty()) {
                return strC;
            }
            byte[] bArr = {-64, 46, 62, -127};
            a(bArr, new byte[]{-82, 65, 80, -28, -109, -73, -99, 75});
            str2 = new String(bArr, StandardCharsets.UTF_8);
            return str2.intern();
        } catch (Exception unused) {
            byte[] bArr2 = {71, -39, Ascii.ESC, -57, -81};
            a(bArr2, new byte[]{34, -85, 105, -88, -35, 115, -80, 72});
            str2 = new String(bArr2, StandardCharsets.UTF_8);
        }
    }

    public final boolean b(Context context) {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
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
            int iA = a.a(i7 | (-428181225), 2, i7, -428181225);
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
