package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import java.util.Scanner;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public class o4 {
    public static String a(InputStream inputStream) {
        try {
            Scanner scanner = new Scanner(inputStream);
            byte[] bArr = {-38, Base64.padSymbol};
            a(bArr, new byte[]{-122, 124, -76, -16, -87, 106, -124, -73});
            return scanner.useDelimiter(new String(bArr, StandardCharsets.UTF_8).intern()).next().trim();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public static String b(String str) {
        try {
            return c(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(String str) throws IOException {
        InputStream inputStreamA = a(str);
        if (inputStreamA != null) {
            return a(inputStreamA);
        }
        return null;
    }

    public static int d(String str) {
        try {
            byte[] bArr = {-128, -126, Framer.STDERR_FRAME_PREFIX, -105, Ascii.CR, Ascii.ETB, 81, -119, -93, 104, -22, -75, -88, Framer.STDERR_FRAME_PREFIX, -111, -66, 2, Ascii.GS, -71, SignedBytes.MAX_POWER_OF_TWO, 6, 65, -98, 57, 2, Framer.STDIN_FRAME_PREFIX, -121};
            a(bArr, new byte[]{-31, -20, 86, -27, 98, 126, 53, -89, -52, Ascii.ESC, -60, -26, -47, 65, -27, -37, 111, 77, -53, 47, 118, 36, -20, 77, 107, 72, -12});
            Charset charset = StandardCharsets.UTF_8;
            Class<?> cls = Class.forName(new String(bArr, charset).intern());
            byte[] bArr2 = {105, -35, 1};
            a(bArr2, new byte[]{Ascii.SO, -72, 117, -97, -47, -71, 91, -14});
            String str2 = (String) cls.getMethod(new String(bArr2, charset).intern(), String.class).invoke(null, str);
            if (str2 != null) {
                return Integer.parseInt(str2);
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static InputStream a(String str) throws IOException {
        Process processExec = Runtime.getRuntime().exec(str);
        if (processExec == null) {
            return null;
        }
        return processExec.getInputStream();
    }

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
}
