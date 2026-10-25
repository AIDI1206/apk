package com.aheaditec.talsec.security;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.io.CloseableKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 {
    public static final a b;
    public static final String c;
    public static final String d;
    public static final String e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283a;

    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        byte[] bArr = {-113, -16, -11, -112, -82, -62, 77, -108, 126, -101, 74, -35, -68, 59, 105, -41, -58, 101, 7, Ascii.NAK, 82, 71, -34, Ascii.VT, 118, -27, 126, 101, -62, 105, 10, 32, 91, 44, 44, 8, -40, -108, 4, -83, -109, -93, -54, 73};
        a(bArr, new byte[]{-22, -122, -83, -60, -32, -128, 56, -94, Ascii.DC4, -52, 8, -72, -41, 74, 10, -124, -89, 87, 65, Framer.EXIT_FRAME_PREFIX, Ascii.GS, 47, -101, 110, 60, -107, 60, 36, -90, Ascii.SO, 115, 70, 43, SignedBytes.MAX_POWER_OF_TWO, 90, Utf8.REPLACEMENT_BYTE, -107, -89, 43, -11, -59, -44, -71, 116});
        Charset charset = StandardCharsets.UTF_8;
        e = new String(bArr, charset).intern();
        byte[] bArr2 = {-18, 82, -52};
        a(bArr2, new byte[]{-102, Framer.STDOUT_FRAME_PREFIX, -82, 80, Framer.EXIT_FRAME_PREFIX, Base64.padSymbol, 124, -80});
        d = new String(bArr2, charset).intern();
        byte[] bArr3 = {-40, -41, -81, -97, -103, -18, -46, 39};
        a(bArr3, new byte[]{-69, -78, -35, -21, -22, -64, -90, 84});
        c = new String(bArr3, charset).intern();
        b = new a(null);
    }

    public s0(Context context) {
        String strA;
        byte[] bArr = {-39, 57, -91, Framer.STDIN_REQUEST_FRAME_PREFIX, -127, -48, -31};
        a(bArr, new byte[]{-70, 86, -53, 43, -28, -88, -107, -89});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        try {
            strA = a(context);
        } catch (Exception unused) {
            strA = null;
        }
        this.f283a = strA;
    }

    public final byte[] a(InputStream inputStream, OutputStream outputStream) throws NoSuchAlgorithmException, IOException {
        byte[] bArr = {17, -89, -80, Ascii.SYN, 9, 5, Ascii.DLE};
        a(bArr, new byte[]{66, -17, -15, 59, 59, 48, 38, 117});
        MessageDigest messageDigest = MessageDigest.getInstance(new String(bArr, StandardCharsets.UTF_8).intern());
        byte[] bArr2 = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr2);
            if (i <= 0) {
                byte[] bArrDigest = messageDigest.digest();
                byte[] bArr3 = {Ascii.EM, -12, -39, 73, 0, 75, -19, -99, -11, -92, -57};
                a(bArr3, new byte[]{125, -99, -66, 44, 115, Utf8.REPLACEMENT_BYTE, -59, -77, -37, -118, -18});
                Intrinsics.checkNotNullExpressionValue(bArrDigest, new String(bArr3, StandardCharsets.UTF_8).intern());
                return bArrDigest;
            }
            outputStream.write(bArr2, 0, i);
            messageDigest.update(bArr2, 0, i);
        }
    }

    public final String a() {
        return this.f283a;
    }

    public final String a(Context context) {
        File filesDir = context.getFilesDir();
        byte[] bArr = {111, -33, -40};
        a(bArr, new byte[]{Ascii.ESC, -68, -70, -113, 10, SignedBytes.MAX_POWER_OF_TWO, Ascii.ETB, Ascii.DLE});
        Charset charset = StandardCharsets.UTF_8;
        File file = new File(filesDir, new String(bArr, charset).intern());
        if (file.exists() && !file.delete()) {
            return null;
        }
        try {
            AssetManager assets = context.getAssets();
            byte[] bArr2 = {58, -50, Ascii.SYN, Ascii.US, -124, -53, 3, 81};
            a(bArr2, new byte[]{89, -85, 100, 107, -9, -27, 119, 34});
            InputStream inputStreamOpen = assets.open(new String(bArr2, charset).intern());
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        Intrinsics.checkNotNull(inputStreamOpen);
                        String strEncodeToString = android.util.Base64.encodeToString(a(inputStreamOpen, fileOutputStream), 2);
                        byte[] bArr3 = {-50, 127, 44, 78, 101, 41, Base64.padSymbol, -55, -33, -76, 74, -51, 105, Utf8.REPLACEMENT_BYTE, -32, -56, -38, -89, 127, 113, -117, 10, -9, -69, 115, 96, -104, -32, 40, 65, 100, 66, -37, 108, 89, Ascii.SUB, -104, -11, Ascii.ESC, 60, 105, 102, 19, -76};
                        a(bArr3, new byte[]{-85, 9, 116, Ascii.SUB, 43, 107, 72, -1, -75, -29, 8, -88, 2, 78, -125, -101, -69, -107, 57, Ascii.FS, -60, 98, -78, -34, 57, Ascii.DLE, -38, -95, 76, 38, Ascii.GS, 36, -85, 0, 47, Framer.STDIN_FRAME_PREFIX, -43, -58, 52, 100, Utf8.REPLACEMENT_BYTE, 17, 96, -119});
                        if (!Intrinsics.areEqual(new String(bArr3, charset).intern(), strEncodeToString)) {
                            CloseableKt.closeFinally(fileOutputStream, null);
                            CloseableKt.closeFinally(inputStreamOpen, null);
                            return null;
                        }
                        fileOutputStream.flush();
                        String absolutePath = file.getAbsolutePath();
                        CloseableKt.closeFinally(fileOutputStream, null);
                        CloseableKt.closeFinally(inputStreamOpen, null);
                        return absolutePath;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(inputStreamOpen, th3);
                throw th4;
            }
        } catch (Exception unused) {
            return null;
        }
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
