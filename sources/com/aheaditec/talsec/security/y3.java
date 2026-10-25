package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y3 f309a = new y3();
    public static final Lazy b = LazyKt.lazy(new Function0() { // from class: com.aheaditec.talsec.security.y3$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return y3.b();
        }
    });

    public static final String b() {
        return UUID.randomUUID().toString();
    }

    public final String a() {
        Object value = b.getValue();
        byte[] bArr = {-63, Framer.STDOUT_FRAME_PREFIX, 97, 102, -81, 77, 52, Ascii.FS, 73, 55, -115, 36, -24};
        a(bArr, new byte[]{-113, -124, -1, 72, -73, 81, 43, -110, 74, 73, -115, 35, -63});
        Intrinsics.checkNotNullExpressionValue(value, new String(bArr, StandardCharsets.UTF_8).intern());
        return (String) value;
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
