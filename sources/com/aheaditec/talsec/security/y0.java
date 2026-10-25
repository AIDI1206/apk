package com.aheaditec.talsec.security;

import com.aheaditec.talsec_security.security.api.TalsecLoggable;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f305a;
    public static final String b;
    public static final String c;
    public static final Map<String, Long> d;
    public static final ReentrantLock e;
    public static volatile TalsecLoggable f;

    static {
        byte[] bArr = {110, 123, 8, 2, 58, -20, Ascii.CAN, 60, 97, -61, -32, 90, 0};
        a(bArr, new byte[]{Ascii.SYN, 71, 75, -128, Base64.padSymbol, -56, 62, 108, -17, -45, 115, 77, 103});
        Charset charset = StandardCharsets.UTF_8;
        c = new String(bArr, charset).intern();
        byte[] bArr2 = {-128, -43, -98, -39, 102, 0, -27, -36, -63, -79, 38, -27, -72, -20, -45, 59, 5, 66, -24};
        a(bArr2, new byte[]{-72, -43, -27, -60, -16, -93, 118, -52, -104, -63, 59, -91, -75, -76, -35, 110, 100, 47, -115});
        b = new String(bArr2, charset).intern();
        f305a = new y0();
        Map<String, Long> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        byte[] bArr3 = {118, -31, 65, -108, -91, 81, -57, Ascii.CAN, -73, -12, 51, -127, -110, Ascii.DLE, -84, -105, 57, -29, 39, 125};
        a(bArr3, new byte[]{-18, -57, Ascii.EM, Ascii.DLE, -74, 83, -110, -113, -57, -66, SignedBytes.MAX_POWER_OF_TWO, -2, -56, -95, -58, -40, 0, -3, -13, 108});
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, new String(bArr3, charset).intern());
        d = mapSynchronizedMap;
        e = new ReentrantLock();
    }

    public final void a(String str) {
        StringBuilder sbAppend;
        byte[] bArr = {Framer.STDERR_FRAME_PREFIX, -105, -111, Ascii.NAK, -108, 5, -36, 94, 106, 9, 2, Ascii.US, -41};
        a(bArr, new byte[]{70, Ascii.ETB, -33, -128, -34, -95, -97, 74, -19, 118, 77, -117, -78});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        Map<String, Long> map = d;
        Long l = map.get(str);
        if (l != null) {
            long jLongValue = l.longValue();
            map.remove(str);
            long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
            try {
                TalsecLoggable talsecLoggable = f;
                if (talsecLoggable != null) {
                    talsecLoggable.operationLog(jCurrentTimeMillis, str);
                    return;
                }
                return;
            } catch (Exception e2) {
                byte[] bArr2 = {35, 59, -30, -101, -55, 94, Ascii.DC4, 53, -78, 37, -64, -110, Ascii.NAK};
                a(bArr2, new byte[]{73, -121, 117, Ascii.ETB, -112, 90, 66, 115, -66, 114, -109, Ascii.NAK, 114});
                Charset charset2 = StandardCharsets.UTF_8;
                new String(bArr2, charset2).intern();
                String message = e2.getMessage();
                byte[] bArr3 = {Ascii.CR, -102, -125, Ascii.RS, -70, -69, -45, -124, 127, 5, -36, Framer.STDERR_FRAME_PREFIX, -50, 126, 41, 111, Ascii.SO, 77, -54, 77, 70, -54, -103, -26, -122, Ascii.DLE, 99, -114, 9, 86, -95, 105};
                a(bArr3, new byte[]{55, 43, -38, -117, -63, 10, -101, 8, 72, -95, -98, 89, -108, 57, -13, 38, 73, -99, -103, 78, Ascii.SO, -33, -45, -85, -40, -81, -9, -58, 88, 105, -67, 98});
                String strIntern = new String(bArr3, charset2).intern();
                byte[] bArr4 = {47, -81};
                a(bArr4, new byte[]{Ascii.NAK, -113, 88, -107, 108, 81, Framer.STDERR_FRAME_PREFIX, -34});
                sbAppend = new StringBuilder().append(strIntern).append(str).append(new String(bArr4, charset2).intern()).append(message);
            }
        } else {
            byte[] bArr5 = {91, Ascii.NAK, 117, 74, 38, 6, Ascii.SO, 88, 54, Ascii.SI, 80, 44, -112};
            a(bArr5, new byte[]{1, -87, 6, 72, Framer.STDOUT_FRAME_PREFIX, -94, 44, 80, 58, -104, 35, 91, -9});
            new String(bArr5, charset).intern();
            byte[] bArr6 = {74, Framer.STDERR_FRAME_PREFIX, -13, -103, 17, -53, -101, Base64.padSymbol, -103, -85, 19, -112, 76, -9, -59, -57, -8, -101, 1, -73};
            a(bArr6, new byte[]{-18, 113, -128, 4, 89, -17, -36, 107, -32, -69, 78, Ascii.DC2, Framer.ENTER_FRAME_PREFIX, -49, -49, -62, -126, 38, 79, -80});
            String strIntern2 = new String(bArr6, charset).intern();
            byte[] bArr7 = {-18, Ascii.SYN, -117, -103, -88, Ascii.NAK, -110, -119, 112, 111, -128, Ascii.DLE, Ascii.NAK, -2, -121, -14, -48, 107, 55, -118, -73, -10, SignedBytes.MAX_POWER_OF_TWO, -88, -83, 12, -10};
            a(bArr7, new byte[]{-73, -81, -30, -46, -81, -86, -48, -62, -23, 76, -49, 124, 89, -64, -35, -21, -94, 53, 1, Ascii.ETB, -56, -61, 74, -34, -52, 124, -40});
            sbAppend = new StringBuilder().append(strIntern2).append(str).append(new String(bArr7, charset).intern());
        }
        sbAppend.toString();
    }

    public final void b(String str) {
        byte[] bArr = {-113, -36, -20, -108, -98, -57, 38, -99, -40, 41, -116, -43, -104};
        a(bArr, new byte[]{-55, -36, 115, -1, -24, -29, 57, Ascii.VT, -97, -105, -41, -47, -3});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
        Map<String, Long> map = d;
        if (!map.containsKey(str)) {
            map.put(str, Long.valueOf(System.currentTimeMillis()));
            return;
        }
        byte[] bArr2 = {12, -128, -116, -102, 37, -9, 94, 6, -55, -66, 113, 54, 105};
        a(bArr2, new byte[]{56, Ascii.FS, -48, Ascii.CAN, 52, -77, -4, -127, -105, 9, 3, 113, Ascii.SO});
        new String(bArr2, charset).intern();
        byte[] bArr3 = {114, 19, -18, 96, -8, -55, -93, 54, 104, -50, -65, Base64.padSymbol, 57, 65, Ascii.DC4, Ascii.RS, -5, -10, 7, 58};
        a(bArr3, new byte[]{38, -109, 117, 43, -126, -19, -76, 114, -17, Ascii.GS, -77, 109, 54, 89, Ascii.RS, -119, -125, -53, 76, 51});
        String strIntern = new String(bArr3, charset).intern();
        byte[] bArr4 = {-79, -120, -11, Ascii.DC2, 43, -48, -13, -99, -35, -50, -115, 92, -10, -55, -73, 71, -23, -60, 6, -65, 70, Ascii.FS, -74};
        a(bArr4, new byte[]{122, 17, 113, 75, 51, -20, 107, 17, -91, -38, -34, -107, -120, -41, -127, 76, 106, -47, Ascii.DLE, -21, 39, 108, -104});
        String str2 = strIntern + str + new String(bArr4, charset).intern();
    }

    public final void a(TalsecLoggable talsecLoggable) {
        ReentrantLock reentrantLock = e;
        reentrantLock.lock();
        try {
            f = talsecLoggable;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
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
                    byte b2 = bArr3[i9];
                    int i10 = ((b2 & 16777216) * (b2 | 16777216)) + ((b2 & (-16777217)) * ((~b2) & 16777216));
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
                    byte b3 = bArr4[i9];
                    int i20 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
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
                    byte b4 = bArr3[iA5];
                    int length5 = bArr4.length;
                    int i32 = 0 - i31;
                    int i33 = i32 | length5;
                    byte b5 = bArr3[q0.a(i32, 2, i33, (length5 ^ i32) ^ i33)];
                    bArr3[iA5] = (byte) (((byte) (b5 ^ b4)) + ((byte) (((byte) 2) * ((byte) (b5 & b4)))));
                    i4 = 1565752577;
                    break;
                case 373627814:
                    break;
                case 975213712:
                    int length6 = bArr4.length;
                    int i34 = 0 - i3;
                    int length7 = bArr4.length;
                    int i35 = ~i34;
                    byte b6 = bArr4[((length7 | i34) - (((-656070458) & i35) & length7)) + (((-656070458) | i34) & length7)];
                    int length8 = bArr4.length;
                    byte b7 = bArr3[(length8 ^ i35) + ((length8 | i34) * 2) + 1];
                    bArr4[((length6 | i34) * 2) - (length6 ^ i34)] = (byte) (((byte) (b7 - b6)) + ((byte) (((byte) 2) * ((byte) ((~b7) & b6)))));
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
