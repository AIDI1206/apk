package com.aheaditec.talsec_security.security.api;

import com.aheaditec.talsec.security.e3;
import com.aheaditec.talsec.security.p0;
import com.aheaditec.talsec.security.q0;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Random;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MemoryRewrite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f318a = 'a';
    public static final int b = 26;
    public static final MemoryRewrite INSTANCE = new MemoryRewrite();
    public static final Random c = new Random(new Date().getTime());

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001d. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        short[] sArr = null;
        byte b2 = -1740520186;
        int length = 0;
        int length2 = 0;
        short s = 0;
        short s2 = 0;
        short sA = 0;
        int i = 0;
        while (true) {
            switch (b2) {
                case -2143294076:
                    b2 = length < length2 ? (byte) -1809249287 : (byte) 974072829;
                    break;
                case -2038999444:
                    int i2 = ((short) ((s2 << 4) + sArr[2])) ^ (s2 + s);
                    short s3 = sArr[3];
                    int i3 = -(s2 >>> 5);
                    int i4 = i3 | s3;
                    int i5 = (i4 - (i3 * 2)) + ((i3 ^ s3) ^ i4);
                    int i6 = -e3.a(i5 | (~i2), 2, i5 - i2, 2);
                    sA = (short) q0.a(sA, 3, -(p0.a(sA, -4, 1, i6) | (i6 & 2)), 1);
                    s2 = (short) (s2 - ((((short) ((sA << 4) + sArr[0])) ^ (((s | sA) - (((~sA) & 56) & s)) + ((sA | 56) & s))) ^ ((sA >>> 5) + sArr[1])));
                    s = (short) (s - 40503);
                    i++;
                    b2 = 2093236949;
                    break;
                case -1809249287:
                    byte b3 = bArr[length];
                    s2 = (short) (((bArr[((length & 1) * 2) + (length ^ 1)] & 255) << 8) | ((255 - (b3 | 255)) + b3));
                    int i7 = -length;
                    int i8 = i7 | 2;
                    sA = (short) ((bArr[(i8 - (i7 * 2)) + ((2 ^ i7) ^ i8)] & 255) | ((bArr[length + 3] & 255) << 8));
                    s = -14624;
                    b2 = 2093236949;
                    i = 0;
                    break;
                case -1740520186:
                    sArr = new short[4];
                    b2 = 766056152;
                    length = 0;
                    break;
                case -1489518479:
                    sArr[length] = (short) ((bArr2[((2 & (~length)) * (length & (-3))) + ((length & 2) * (length | 2))] & 255) ^ ((bArr2[(length * 2) + 1] & 255) << 8));
                    length++;
                    b2 = 766056152;
                    break;
                case -473033593:
                    int i9 = -length;
                    int i10 = -bArr.length;
                    int i11 = i10 | i9;
                    bArr[(i11 - (i10 * 2)) + ((i10 ^ i9) ^ i11)] = (byte) (bArr[bArr.length - length] ^ bArr2[length % 8]);
                    length--;
                    b2 = 1734050766;
                    break;
                case 766056152:
                    b2 = length < 4 ? (byte) -1489518479 : (byte) 998066383;
                    break;
                case 974072829:
                    length = bArr.length % 4;
                    b2 = 1734050766;
                    break;
                case 998066383:
                    length2 = bArr.length - (bArr.length % 4);
                    b2 = -2143294076;
                    length = 0;
                    break;
                case 1314339506:
                    break;
                case 1734050766:
                    b2 = length > 0 ? (byte) -473033593 : (byte) 1314339506;
                    break;
                case 1771480224:
                    bArr[length] = (byte) (s2 & 255);
                    bArr[length + 1] = (byte) ((s2 >> 8) & 255);
                    bArr[length + 2] = (byte) (sA & 255);
                    bArr[length + 3] = (byte) ((sA >> 8) & 255);
                    length += 4;
                    b2 = -2143294076;
                    break;
                case 2093236949:
                    b2 = i < 32 ? (byte) -2038999444 : (byte) 1771480224;
                    break;
                default:
                    b2 = 2093236949;
                    break;
            }
            return;
        }
    }

    @JvmStatic
    public static final void rewriteWithRandomness(byte[] bArr) {
        if (bArr != null) {
            c.nextBytes(bArr);
        }
    }

    @JvmStatic
    public static final void rewriteWithRandomness(char[] cArr) {
        byte[] bArr = {-31, 96, 59, 17, -76};
        a(bArr, new byte[]{126, -51, 67, -127, 62, -16, -56, -60});
        Intrinsics.checkNotNullParameter(cArr, new String(bArr, StandardCharsets.UTF_8).intern());
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = cArr[i];
            cArr[i2] = (char) (c.nextInt(26) + 97);
            i++;
            i2++;
        }
    }
}
