package com.aheaditec.talsec_security.security.api;

import android.util.Base64;
import com.aheaditec.talsec.security.l0;
import com.aheaditec.talsec.security.m0;
import com.aheaditec.talsec.security.n0;
import com.aheaditec.talsec.security.p0;
import com.aheaditec.talsec.security.q0;
import com.aheaditec.talsec.security.w1;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public class TalsecConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325a;
    public final String[] b;
    public final String c;
    public final String[] d;
    public final String[] e;
    public final String[] f;
    public final String[][] g;
    public final String[] h;
    public final SuspiciousAppDetectionConfig i;
    public final boolean j;
    public final boolean k;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f326a;
        public final String[] b;
        public String c;
        public String[] d;
        public String[] e;
        public String[] f;
        public String[][] g;
        public String[] h;
        public SuspiciousAppDetectionConfig i;
        public boolean j = true;
        public boolean k = false;

        public Builder(String str, String[] strArr) {
            if (str == null) {
                byte[] bArr = {70, -82, -126, Ascii.CAN, 1, 98, 44, -128, -75, -17, 19, -31, 93, 76, -26, -96, 9, -90, 59, -35, -83, -104, 10, -127, -63, 103, 52, -64};
                a(bArr, new byte[]{-20, 5, -35, -106, 75, 70, 51, -3, -50, -66, 90, -93, 37, 91, 109, 7, 81, -5, 72, Ascii.SYN, -83, Ascii.ESC, Ascii.NAK, 8, -99, 59, 66, 7});
                throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
            }
            a(strArr);
            this.f326a = str;
            this.b = strArr;
        }

        public static void a(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                byte[] bArr = {-102, -123, 53, 113, 74, -60, -83, -43, Ascii.EM, SignedBytes.MAX_POWER_OF_TWO, -48, Framer.STDIN_REQUEST_FRAME_PREFIX, Ascii.SO, 85, -43, -73, -95, -122, 124, -103, -116, 10, -115, -113, -70, -14, -63, 52, 103, Ascii.DC2, Ascii.GS, 93, 46, -115, -53, -128, -46, -43, 17, -46, -116, -122, 80, Ascii.CR, -40, -108, -128, -59, -51, -21, 80, 60, SignedBytes.MAX_POWER_OF_TWO, 35, -120, 86, -125, -48, 77, 103, 60, -24, 54, -103, -101, -11, -84};
                a(bArr, new byte[]{-56, Framer.STDIN_FRAME_PREFIX, 48, Framer.STDIN_FRAME_PREFIX, Ascii.DC2, -32, -78, -54, 34, 67, -93, 81, 73, 108, -91, -23, 106, -11, 3, 4, -31, -109, -43, -1, -62, -61, -97, 106, 48, -118, 102, 71, 47, Ascii.CAN, -93, -71, -100, -41, 94, Ascii.VT, -53, Ascii.EM, Ascii.SI, 70, -91, Framer.ENTER_FRAME_PREFIX, -47, -59, -116, -66, Ascii.RS, 53, Ascii.DC2, 125, -110, Ascii.ESC, -53, -20, 40, Ascii.ESC, 72, -37, 67, Ascii.DLE, -3, -100, -53});
                throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
            }
            for (String str : strArr) {
                try {
                    if (Base64.decode(str, 2).length != 32) {
                        StringBuilder sb = new StringBuilder();
                        byte[] bArr2 = {2, Ascii.SO, Ascii.SI, -104, -63, 118, -37, 121, 67, -57, -37, -117, -27, -97, -104, -35, 102, Ascii.SYN, -17, 37, -106, -4, -65, Ascii.ETB, 74, -29, 78, 84, Ascii.SYN, -14, kotlin.io.encoding.Base64.padSymbol, 66, -107, 57, -51, 6, -40, -116, -75, -25, -12, 92, -32, 92, -85, -128, 114, -34, -73, -23, -51, Ascii.CAN, -14, 103, Ascii.SO, -42, Ascii.NAK, 98, -98, Ascii.EM, 118, Framer.STDIN_FRAME_PREFIX, -76, 117, 8, -33};
                        a(bArr2, new byte[]{48, -90, 105, Ascii.SYN, -117, Framer.STDERR_FRAME_PREFIX, -88, 54, 76, -60, -100, 5, 116, 38, -31, -45, 47, -123, 116, 112, -53, -59, -61, -105, Ascii.DC2, -78, 36, 74, Ascii.US, -22, 70, 74, -26, -116, -88, Utf8.REPLACEMENT_BYTE, -92, 19, -58, -84, 126, 101, Framer.EXIT_FRAME_PREFIX, -107, -85, Ascii.RS, -17, -41, -60, -80, -109, 81, -128, 57, 100, -67, 85, 124, -88, 117, 1, -119, -80, 37, 40, -29});
                        Charset charset = StandardCharsets.UTF_8;
                        StringBuilder sbAppend = sb.append(new String(bArr2, charset).intern()).append(str);
                        byte[] bArr3 = {110, 76, Utf8.REPLACEMENT_BYTE, Framer.STDERR_FRAME_PREFIX, 71, -106, Ascii.ESC, -72, 127, -23, 121, Utf8.REPLACEMENT_BYTE, 122, -1, 103, -29, 100, Ascii.SO, -10, -58, 42, 126, 38, 65, 5, -101, -104, Ascii.DC2, -76, -69, 112, 76, 1, Ascii.DC4, 37, -58, -18, 113, -82, 36, -104, 44, -35, Ascii.SYN, -2, -86, -23, -82, 122, -56, Framer.STDIN_FRAME_PREFIX, 71, 75, 43, -52, Ascii.ETB, -10, 12, 1, -59, Ascii.SO, Ascii.GS, 97, -123, 99, 19, 97, 48, 36};
                        a(bArr3, new byte[]{57, -100, SignedBytes.MAX_POWER_OF_TWO, 90, 80, 40, Framer.STDIN_REQUEST_FRAME_PREFIX, -27, 72, -22, Ascii.ESC, -105, SignedBytes.MAX_POWER_OF_TWO, -3, 60, -18, Framer.STDIN_FRAME_PREFIX, -84, 125, -49, 65, 75, Utf8.REPLACEMENT_BYTE, kotlin.io.encoding.Base64.padSymbol, 84, Ascii.US, -28, 127, -58, 4, 9, -123, 87, -94, -17, -54, 111, 68, Framer.EXIT_FRAME_PREFIX, 112, -38, 123, -99, -104, 121, -3, -77, -26, 8, -22, 67, 71, Ascii.SYN, 114, -103, -113, 107, -103, Ascii.VT, -59, 73, 109, Ascii.CR, -3, -7, -91, 65, Ascii.GS, 10});
                        throw new IllegalArgumentException(sbAppend.append(new String(bArr3, charset).intern()).toString());
                    }
                } catch (IllegalArgumentException e) {
                    StringBuilder sb2 = new StringBuilder();
                    byte[] bArr4 = {-122, -62, 98, 2, -115, 86, -126, -117, 32, Ascii.DLE, 96, 19, -62, 2, -61, -114, 46, -89, -9, 98, 109, 55, -11, 108, -55, -50, -12, -54, -107, 39, -127, -40, 111, -99, -32, -32, -60, -69, -26, -5, -112, -16, -78, 121, -37, -68, -96, -19, -37, -118, 114, -37, -53, -16, -125, -42, -12, 9, -64, -28, -11, -53, -42, -50, 76, 53};
                    a(bArr4, new byte[]{-84, -22, -4, 127, -41, 82, -47, 8, -23, 114, -13, -116, -107, -101, -105, 2, -9, 19, 125, 41, 2, -114, 125, Ascii.RS, -109, -33, 106, -56, -98, -97, -54, -60, -16, 39, 126, -39, -112, 4, 115, -88, -38, -55, -58, 114, -101, 2, -63, -91, -96, 19, 1, Ascii.DC4, -105, -50, -31, -67, 118, 87, -54, -70, -124, -17, -114, -48, 108, 9});
                    Charset charset2 = StandardCharsets.UTF_8;
                    StringBuilder sbAppend2 = sb2.append(new String(bArr4, charset2).intern()).append(str);
                    byte[] bArr5 = {108, 76, -33, Ascii.CR, -93, 80, 69, Ascii.SUB, 93, -84, -22, -98, -2, 124, 78, -1, -110, 92, Ascii.FS, 121, -105, -79, 77, Utf8.REPLACEMENT_BYTE};
                    a(bArr5, new byte[]{59, -100, -96, -105, 108, 110, Ascii.DC4, -121, 102, -11, 110, -41, -91, 77, 39, -77, -115, -104, 38, 56, -31, -13, 10, 42});
                    throw new IllegalArgumentException(sbAppend2.append(new String(bArr5, charset2).intern()).toString(), e);
                }
            }
        }

        public String[] b() {
            return this.e;
        }

        @Deprecated
        public Builder blacklistedHashes(String[] strArr) {
            this.f = strArr;
            return this;
        }

        @Deprecated
        public Builder blacklistedPackageNames(String[] strArr) {
            this.e = strArr;
            return this;
        }

        public TalsecConfig build() {
            return new TalsecConfig(this);
        }

        public String c() {
            return this.f326a;
        }

        public String[] d() {
            return this.b;
        }

        public boolean e() {
            return this.j;
        }

        public boolean f() {
            return this.k;
        }

        public String[] g() {
            return this.d;
        }

        public SuspiciousAppDetectionConfig h() {
            return this.i;
        }

        public String[][] i() {
            return this.g;
        }

        public String j() {
            return this.c;
        }

        public String[] k() {
            return this.h;
        }

        public Builder killOnBypass(boolean z) {
            this.k = z;
            return this;
        }

        public Builder prod(boolean z) {
            this.j = z;
            return this;
        }

        public Builder supportedAlternativeStores(String[] strArr) {
            this.d = strArr;
            return this;
        }

        public Builder suspiciousAppDetection(SuspiciousAppDetectionConfig suspiciousAppDetectionConfig) {
            this.i = suspiciousAppDetectionConfig;
            return this;
        }

        @Deprecated
        public Builder suspiciousPermissions(String[][] strArr) {
            this.g = strArr;
            return this;
        }

        public Builder watcherMail(String str) {
            this.c = str;
            return this;
        }

        @Deprecated
        public Builder whitelistedInstallationSources(String[] strArr) {
            this.h = strArr;
            return this;
        }

        public String[] a() {
            return this.f;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003a. Please report as an issue. */
        public static void a(byte[] bArr, byte[] bArr2) {
            int i;
            byte[] bArr3 = null;
            int length = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 1180709023;
            byte[] bArr4 = null;
            while (true) {
                int i5 = ((i4 & 16777216) * (i4 | 16777216)) + ((i4 & (-16777217)) * ((~i4) & 16777216));
                int i6 = i4 >>> 8;
                int iA = l0.a(i6, i5, 1, ((-1) - i6) | ((-1) - i5));
                int i7 = (iA ^ (-201803027)) + ((iA & (-201803027)) * 2);
                switch ((i7 - 814310662) - ((i7 & (-814310662)) * 2)) {
                    case -2000520841:
                        int length2 = bArr4.length;
                        int i8 = 0 - (0 - length);
                        boolean z = (((double) ((byte) bArr3[((length2 & (~i8)) * 2) - (length2 ^ i8)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length2 & (~i8)) * 2) - (length2 ^ i8)])) == Double.NaN ? 0 : -1)) > -1;
                        i4 = z ? z ? 1565752577 : 1621215041 : -1164716566;
                        i3 = length;
                        break;
                    case -870579640:
                        int i9 = (i2 - 1) - (i2 | (-4));
                        byte b = bArr3[i9];
                        int i10 = ((b & 16777216) * (b | 16777216)) + ((b & (-16777217)) * ((~b) & 16777216));
                        int i11 = i2 + 3 + (((-1) - i2) | (-3));
                        int i12 = bArr3[i11] & 255;
                        int i13 = i12 * ((~i12) & 65536);
                        int i14 = ~((i10 | ((~i13) | (-1268032266))) - ((i13 & (-1268032266)) | i10));
                        int iA2 = m0.a((-132004404) & i2, i2, 1, (-132004403) & i2);
                        int i15 = bArr3[iA2] & 255;
                        int i16 = i15 * ((~i15) & 256);
                        int i17 = (i16 + i14) - (i16 & i14);
                        int i18 = bArr3[i2] & 255;
                        int i19 = (i17 & (~i18)) + i18;
                        byte b2 = bArr4[i9];
                        int i20 = ((b2 & 16777216) * (b2 | 16777216)) + ((b2 & (-16777217)) * ((~b2) & 16777216));
                        int i21 = bArr4[i11] & 255;
                        int i22 = i21 * ((~i21) & 65536);
                        int i23 = ~((i20 | ((~i22) | (-1355861741))) - ((i22 & (-1355861741)) | i20));
                        int i24 = bArr4[iA2] & 255;
                        int i25 = i24 * ((~i24) & 256);
                        int iA3 = l0.a(i25, i23, 1, ((-1) - i25) | ((-1) - i23));
                        int i26 = (iA3 - 1) - ((~(bArr4[i2] & 255)) | iA3);
                        int i27 = i19 << ((i19 > Double.NaN ? 1 : (i19 == Double.NaN ? 0 : -1)) >>> 31);
                        int i28 = (i27 ^ (-418000873)) + ((i27 & (-418000873)) * 2);
                        int i29 = (i28 + i26) - ((i28 & i26) * 2);
                        bArr4[i2] = (byte) i29;
                        bArr4[iA2] = (byte) (i29 >>> 8);
                        bArr4[i11] = (byte) (i29 >>> 16);
                        bArr4[i9] = (byte) (i29 >>> 24);
                        i2 = (i2 ^ 4) + ((i2 & 4) * 2);
                        int length3 = bArr4.length;
                        int iA4 = w1.a(bArr4.length, 4, 0, 0);
                        i4 = (((((long) i2) > ((long) (((length3 & (~iA4)) * 2) - (length3 ^ iA4))) ? 1 : (((long) i2) == ((long) (((length3 & (~iA4)) * 2) - (length3 ^ iA4))) ? 0 : -1)) >>> 31) & 1) != 0 ? 1910359311 : 1621215041;
                        break;
                    case -97532338:
                        length = bArr4.length % 4;
                        int i30 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                        i = i30 != 0 ? 986083301 : 1621215041;
                        i4 = i30 == 0 ? -1138188205 : i;
                        break;
                    case 298177592:
                        int length4 = bArr4.length;
                        int i31 = 0 - i3;
                        int iA5 = n0.a(0, (length4 & 2) | p0.a(i31, -4, 1, length4), i31 * 3, 1);
                        byte b3 = bArr3[iA5];
                        int length5 = bArr4.length;
                        int i32 = 0 - i31;
                        int i33 = i32 | length5;
                        byte b4 = bArr3[q0.a(i32, 2, i33, (length5 ^ i32) ^ i33)];
                        bArr3[iA5] = (byte) (((byte) (b4 ^ b3)) + ((byte) (((byte) 2) * ((byte) (b4 & b3)))));
                        i4 = 1565752577;
                        break;
                    case 373627814:
                        break;
                    case 975213712:
                        int length6 = bArr4.length;
                        int i34 = 0 - i3;
                        int length7 = bArr4.length;
                        int i35 = ~i34;
                        byte b5 = bArr4[((length7 | i34) - (((-656070458) & i35) & length7)) + (((-656070458) | i34) & length7)];
                        int length8 = bArr4.length;
                        byte b6 = bArr3[(length8 ^ i35) + ((length8 | i34) * 2) + 1];
                        bArr4[((length6 | i34) * 2) - (length6 ^ i34)] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
                        length = (~i3) + (i3 * 2);
                        int i36 = ((i3 > 2 ? 1 : (i3 == 2 ? 0 : -1)) >>> 31) & 1;
                        i = i36 != 0 ? 986083301 : 1621215041;
                        if (i36 == 0) {
                        }
                        break;
                    case 1548321255:
                        int length9 = bArr.length;
                        int length10 = 0 - (0 - (bArr.length % 4));
                        i4 = (length9 & (~length10)) - ((~length9) & length10) > 0 ? 1910359311 : 1621215041;
                        bArr3 = bArr2;
                        bArr4 = bArr;
                        i2 = 0;
                        break;
                    default:
                        break;
                }
                return;
            }
        }
    }

    public TalsecConfig(Builder builder) {
        this.f325a = builder.c();
        this.b = builder.d();
        this.c = builder.j();
        this.d = builder.g();
        this.e = builder.b();
        this.f = builder.a();
        this.g = builder.i();
        this.h = builder.k();
        this.i = builder.h();
        this.j = builder.e();
        this.k = builder.f();
    }

    public String[] getBlacklistedHashes() {
        return this.f;
    }

    public String[] getBlacklistedPackageNames() {
        return this.e;
    }

    public String getExpectedPackageName() {
        return this.f325a;
    }

    public String[] getExpectedSigningCertificateHashes() {
        return this.b;
    }

    public boolean getKillOnBypass() {
        return this.k;
    }

    public String[] getSupportedAlternativeStores() {
        return this.d;
    }

    public SuspiciousAppDetectionConfig getSuspiciousAppDetectionConfig() {
        return this.i;
    }

    public String[][] getSuspiciousPermissions() {
        return this.g;
    }

    public String getWatcherMail() {
        return this.c;
    }

    public String[] getWhitelistedInstallationSources() {
        return this.h;
    }

    public boolean isProd() {
        return this.j;
    }
}
