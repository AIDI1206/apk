package com.aheaditec.talsec.security;

import android.os.Build;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f233a;
    public static final String b;
    public static final int c = 16;
    public static final String d;

    static {
        byte[] bArr = {-115, 67, -48};
        a(bArr, new byte[]{-52, 6, -125, 71, 60, 90, 89, 90});
        Charset charset = StandardCharsets.UTF_8;
        d = new String(bArr, charset).intern();
        byte[] bArr2 = {65, 91, Ascii.DC4, -79, 79, 102, 5, 17, 86, -8, -115, Framer.STDOUT_FRAME_PREFIX, -32, -57, -59, -15, -117, -92, 110, 36, Ascii.DC4, -46, 80, 81, -79, Ascii.ESC, -90, 62, 59, Ascii.ETB, 55, -95, 113, -5, Ascii.US, -52, -43, -17, 72, Ascii.ESC, 72, 121, 102, 82, 78, 66, 17, Framer.EXIT_FRAME_PREFIX, 38, -89, -107, Utf8.REPLACEMENT_BYTE, -120, 54, -76, -14, Ascii.SO, -100, Framer.STDOUT_FRAME_PREFIX, -18, -99, -127, 71, 110};
        a(bArr2, new byte[]{114, 106, 119, -44, Framer.EXIT_FRAME_PREFIX, 84, 99, 32, 48, -51, -21, 0, -41, -94, -95, -110, -77, -108, 92, Ascii.GS, 44, -29, 105, 52, -127, 125, -57, 92, 2, 32, Ascii.SI, -110, Ascii.DC2, -104, 47, -4, -30, -41, 112, 34, 42, 65, 84, 48, 127, 116, 41, 73, Ascii.ETB, -98, -84, Ascii.SO, -71, Ascii.SO, -47, -108, 58, -6, 3, -37, -88, -76, 115, 93});
        b = new String(bArr2, charset).intern();
        f233a = new e0();
    }

    public final z a(String str, KeyStore keyStore) {
        return new b0(a(str), keyStore);
    }

    public final z b(String str, KeyStore keyStore) {
        return new c0(a(str), keyStore);
    }

    public final z c(String str, KeyStore keyStore) {
        return new d0(a(str), keyStore);
    }

    public final z a() throws c4 {
        KeyStore keyStoreB = b();
        if (Build.VERSION.SDK_INT >= 31) {
            byte[] bArr = {-79, -76, -28, 118, -85, Ascii.DC2, -56, 76, 127, -116, 0, 54, 90, -16, 9, -67, Ascii.EM, 105, -42, -70, -63, Utf8.REPLACEMENT_BYTE, 82, 104, -104, 1, -125, 115, 79, -28, -127, -34, 59, -38, 114, -105, 35, -71, -39, Ascii.RS, Ascii.SUB, Framer.STDOUT_FRAME_PREFIX, Ascii.RS, -86, -66, 62, Ascii.EM, -120, -37, 75, Ascii.SUB, 59, 109, Ascii.DLE, -104, 110, -52, -33, -90, 100, 116, -1, -104, -106};
            a(bArr, new byte[]{-126, -123, -121, 19, -100, 32, -82, 125, Ascii.EM, -71, 102, 7, 109, -107, 109, -34, Framer.ENTER_FRAME_PREFIX, 89, -28, -125, -7, Ascii.SO, 107, Ascii.CR, -88, 103, -30, 17, 118, -45, -71, -19, 88, -71, 66, -89, Ascii.DC4, -127, -31, 39, Framer.EXIT_FRAME_PREFIX, 9, 44, -56, -113, 8, Framer.ENTER_FRAME_PREFIX, -71, -22, 114, 35, 10, 92, 40, -3, 8, -8, -71, -108, 81, 65, -54, -84, -91});
            return new d0(a(new String(bArr, StandardCharsets.UTF_8).intern()), keyStoreB);
        }
        byte[] bArr2 = {97, Ascii.US, 92, 99, 66, 1, 62, -40, -49, -84, -69, -91, -81, Base64.padSymbol, 80, -78, 97, 44, 105, 62, 107, -51, Ascii.SUB, -92, 88, 39, -11, Ascii.US, -24, -40, 105, 1, -77, -113, 41, Ascii.ETB, -82, -100, -75, -96, -65, -90, 108, -35, -103, 100, -47, -2, 83, -96, Ascii.CR, -48, -125, -17, Ascii.NAK, -41, -94, 44, Ascii.EM, -33, -92, 78, -85, -45};
        a(bArr2, new byte[]{82, 46, Utf8.REPLACEMENT_BYTE, 6, 117, 51, 88, -23, -87, -103, -35, -108, -104, 88, 52, -47, 89, Ascii.FS, 91, 7, 83, -4, 35, -63, 104, 65, -108, 125, -47, -17, 81, Framer.STDERR_FRAME_PREFIX, -48, -20, Ascii.EM, 39, -103, -92, -115, -103, -35, -98, 94, -65, -88, 82, -23, -49, 98, -103, 52, -31, -78, -41, 112, -79, -106, 74, 43, -22, -111, 123, -97, -32});
        return new c0(a(new String(bArr2, StandardCharsets.UTF_8).intern()), keyStoreB);
    }

    public final KeyStore b() throws c4 {
        try {
            byte[] bArr = {109, 56, -79, -43, 1, 90, -72, 9, -95, -36, 37, -88, 103, -123, -4};
            a(bArr, new byte[]{44, 86, -43, -89, 110, 51, -36, 66, -60, -91, 118, -36, 8, -9, -103});
            KeyStore keyStore = KeyStore.getInstance(new String(bArr, StandardCharsets.UTF_8).intern());
            keyStore.load(null);
            Intrinsics.checkNotNull(keyStore);
            return keyStore;
        } catch (IOException e) {
            byte[] bArr2 = {70, -2, 85, -8, -100, -93, -120, -121, -103, 42, 76, -89, -12, -26, Ascii.DC4, -120, -46, -57, -78, 93, 102, -52, 104};
            a(bArr2, new byte[]{3, -116, 39, -105, -18, -125, -1, -17, -16, 70, 41, -121, -104, -119, 117, -20, -69, -87, -43, 125, 39, -121, 59});
            throw new c4(c4.b, new String(bArr2, StandardCharsets.UTF_8).intern(), e);
        } catch (KeyStoreException e2) {
            byte[] bArr3 = {10, -119, 116, Ascii.ETB, -87, -40, -127, -11, -89, -24, -51, -69, -27, -17, 76, 114, -39, 56, 93, 126, 112, 7, -19};
            a(bArr3, new byte[]{79, -5, 6, Framer.EXIT_FRAME_PREFIX, -37, -8, -10, -99, -50, -124, -88, -101, -119, -128, Framer.STDIN_FRAME_PREFIX, Ascii.SYN, -80, 86, 58, 94, Framer.STDOUT_FRAME_PREFIX, 76, -66});
            throw new c4(c4.b, new String(bArr3, StandardCharsets.UTF_8).intern(), e2);
        } catch (NoSuchAlgorithmException e3) {
            byte[] bArr4 = {12, -51, 60, 92, -124, 99, 93, Base64.padSymbol, 125, 127, Ascii.SI, 103, 113, 68, 111, 121, -83, 73, 100, 47, 87, SignedBytes.MAX_POWER_OF_TWO, -25};
            a(bArr4, new byte[]{73, -65, 78, 51, -10, 67, 42, 85, Ascii.DC4, 19, 106, 71, Ascii.GS, 43, Ascii.SO, Ascii.GS, -60, 39, 3, Ascii.SI, Ascii.SYN, Ascii.VT, -76});
            throw new c4(c4.b, new String(bArr4, StandardCharsets.UTF_8).intern(), e3);
        } catch (CertificateException e4) {
            byte[] bArr5 = {3, Framer.EXIT_FRAME_PREFIX, -121, 92, 65, 109, Ascii.NAK, -62, 88, -105, -8, -57, 57, 114, Ascii.DC4, Ascii.SYN, -111, -36, 123, Ascii.DLE, -62, Ascii.CR, 82};
            a(bArr5, new byte[]{70, 10, -11, 51, 51, 77, 98, -86, Framer.STDOUT_FRAME_PREFIX, -5, -99, -25, 85, Ascii.GS, 117, 114, -8, -78, Ascii.FS, 48, -125, 70, 1});
            throw new c4(c4.b, new String(bArr5, StandardCharsets.UTF_8).intern(), e4);
        }
    }

    public final b0.a a(String str) {
        byte[] bArr = {-44, -4, -10};
        a(bArr, new byte[]{-107, -71, -91, -89, -117, -36, 125, Ascii.US});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {76, -72, -101};
        a(bArr2, new byte[]{Ascii.SI, -6, -40, -108, 4, -64, -20, -72});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {80, 35, 118, 44, Ascii.EM, 86, -64, Framer.STDERR_FRAME_PREFIX, -82};
        a(bArr3, new byte[]{Ascii.RS, 76, 38, 77, 125, Framer.STDERR_FRAME_PREFIX, -87, 92, -55});
        return new b0.a(str, 16, strIntern, 1, strIntern2, new String(bArr3, charset).intern());
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
                    byte b2 = bArr3[(length3 & (~i10)) - ((~length3) & i10)];
                    int length4 = bArr3.length;
                    byte b3 = bArr4[((length4 | i9) - (((-1678010279) & (~i9)) & length4)) + ((i9 | (-1678010279)) & length4)];
                    bArr3[((length2 | i9) * 2) - (length2 ^ i9)] = (byte) (((byte) (((byte) (((byte) 2) * ((byte) (b3 | b2)))) - b3)) - b2);
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
                    byte b4 = bArr4[i13];
                    int length8 = bArr3.length;
                    byte b5 = bArr4[((i12 | length8) * 2) - (length8 ^ i12)];
                    int i14 = ((byte) 0) - b4;
                    int i15 = i14 | b5;
                    bArr4[i13] = (byte) (((byte) (((byte) i15) - ((byte) (((byte) 2) * ((byte) i14))))) + ((byte) ((b5 ^ i14) ^ i15)));
                    break;
                case 769572960:
                    break;
                case 783648904:
                    int i16 = i3 + 4 + (((-1) - i3) | (-4));
                    byte b6 = bArr4[i16];
                    int i17 = ((b6 & 16777216) * (b6 | 16777216)) + ((b6 & (-16777217)) * ((~b6) & 16777216));
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
                    byte b7 = bArr3[i16];
                    int i28 = ((b7 & 16777216) * (b7 | 16777216)) + ((b7 & (-16777217)) * ((~b7) & 16777216));
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
