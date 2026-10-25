package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public class l4 {
    public static final int b = 0;
    public static final int c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m4 f262a;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final /* synthetic */ a[] m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f263a;
        public final int b;

        static {
            byte[] bArr = {-56, 19, -120, -24};
            a(bArr, new byte[]{-125, -116, -79, -43, Utf8.REPLACEMENT_BYTE, -113, 44, 108});
            Charset charset = StandardCharsets.UTF_8;
            c = new a(new String(bArr, charset).intern(), 0, 0, 0);
            byte[] bArr2 = {-84, 127, 97, 3, Ascii.CAN};
            a(bArr2, new byte[]{-47, 106, Ascii.CR, 111, Framer.STDIN_REQUEST_FRAME_PREFIX, -41, 32, -19});
            d = new a(new String(bArr2, charset).intern(), 1, 0, 1);
            byte[] bArr3 = {Ascii.VT, 113, -127, -89, -51, Ascii.US, -124, 83};
            a(bArr3, new byte[]{55, 108, -66, 4, 117, 123, -75, Ascii.SUB});
            e = new a(new String(bArr3, charset).intern(), 2, 0, 2);
            byte[] bArr4 = {-120, 55, 70, -39, -3, 118, 127, 55, 111, -66, 0, Utf8.REPLACEMENT_BYTE, -68, -26};
            a(bArr4, new byte[]{-80, -95, -22, -88, -89, 111, 40, -108, Ascii.EM, Ascii.GS, Utf8.REPLACEMENT_BYTE, -119, -18, -93});
            f = new a(new String(bArr4, charset).intern(), 3, 0, 3);
            byte[] bArr5 = {66, 84, 52, -85, -22, 54, -8, 56, -29, Framer.STDIN_REQUEST_FRAME_PREFIX, 3, 101, 69, -30, -30};
            a(bArr5, new byte[]{0, 74, 105, -2, -114, -111, -96, -128, -103, SignedBytes.MAX_POWER_OF_TWO, SignedBytes.MAX_POWER_OF_TWO, 80, 6, -89, -79});
            g = new a(new String(bArr5, charset).intern(), 4, 0, 4);
            byte[] bArr6 = {-77, SignedBytes.MAX_POWER_OF_TWO, -124, 80, 90, -109, 56, -113, 32, -92, Ascii.EM, 108, 82};
            a(bArr6, new byte[]{-37, SignedBytes.MAX_POWER_OF_TWO, -71, 40, -14, 9, 106, -38, 74, 32, 55, 87, Ascii.ETB});
            h = new a(new String(bArr6, charset).intern(), 5, 0, 5);
            byte[] bArr7 = {37, -69, 10, -1, 88};
            a(bArr7, new byte[]{86, 36, 48, -51, Ascii.VT, -103, -66, -69});
            i = new a(new String(bArr7, charset).intern(), 6, 0, 6);
            byte[] bArr8 = {105, -83, 46, Utf8.REPLACEMENT_BYTE, Framer.STDERR_FRAME_PREFIX, Ascii.DLE};
            a(bArr8, new byte[]{10, 42, 92, -105, 121, 67, -106, 101});
            j = new a(new String(bArr8, charset).intern(), 7, 0, 7);
            byte[] bArr9 = {-38, -89, -123, -35, -96, 83, -75, Framer.EXIT_FRAME_PREFIX, -99, 94, -35};
            a(bArr9, new byte[]{-121, Ascii.DC2, -66, -83, -52, 70, -44, 77, -46, Ascii.GS, -106});
            k = new a(new String(bArr9, charset).intern(), 8, 1, 0);
            byte[] bArr10 = {-46, Framer.EXIT_FRAME_PREFIX, -52, -112, 32, 9, -30, 37, 2, 65, 70, -72, -26, 10, 125, -20, -25, -92};
            a(bArr10, new byte[]{127, 109, -124, -14, 76, 124, -89, -126, 54, Framer.STDERR_FRAME_PREFIX, -9, -1, -114, 114, 38, -69, -96, -31});
            l = new a(new String(bArr10, charset).intern(), 9, 1, 1);
            m = a();
        }

        public a(String str, int i2, int i3, int i4) {
            super(str, i2);
            this.f263a = i3;
            this.b = i4;
        }

        public static /* synthetic */ a[] a() {
            return new a[]{c, d, e, f, g, h, i, j, k, l};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) m.clone();
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x003a. Please report as an issue. */
        public static void a(byte[] bArr, byte[] bArr2) {
            int i2;
            byte[] bArr3 = null;
            int length = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1180709023;
            byte[] bArr4 = null;
            while (true) {
                int i6 = ((i5 & 16777216) * (i5 | 16777216)) + ((i5 & (-16777217)) * ((~i5) & 16777216));
                int i7 = i5 >>> 8;
                int iA = l0.a(i7, i6, 1, ((-1) - i7) | ((-1) - i6));
                int i8 = (iA ^ (-201803027)) + ((iA & (-201803027)) * 2);
                switch ((i8 - 814310662) - ((i8 & (-814310662)) * 2)) {
                    case -2000520841:
                        int length2 = bArr4.length;
                        int i9 = 0 - (0 - length);
                        boolean z = (((double) ((byte) bArr3[((length2 & (~i9)) * 2) - (length2 ^ i9)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length2 & (~i9)) * 2) - (length2 ^ i9)])) == Double.NaN ? 0 : -1)) > -1;
                        i5 = z ? z ? 1565752577 : 1621215041 : -1164716566;
                        i4 = length;
                        break;
                    case -870579640:
                        int i10 = (i3 - 1) - (i3 | (-4));
                        byte b = bArr3[i10];
                        int i11 = ((b & 16777216) * (b | 16777216)) + ((b & (-16777217)) * ((~b) & 16777216));
                        int i12 = i3 + 3 + (((-1) - i3) | (-3));
                        int i13 = bArr3[i12] & 255;
                        int i14 = i13 * ((~i13) & 65536);
                        int i15 = ~((i11 | ((~i14) | (-1268032266))) - ((i14 & (-1268032266)) | i11));
                        int iA2 = m0.a((-132004404) & i3, i3, 1, (-132004403) & i3);
                        int i16 = bArr3[iA2] & 255;
                        int i17 = i16 * ((~i16) & 256);
                        int i18 = (i17 + i15) - (i17 & i15);
                        int i19 = bArr3[i3] & 255;
                        int i20 = (i18 & (~i19)) + i19;
                        byte b2 = bArr4[i10];
                        int i21 = ((b2 & 16777216) * (b2 | 16777216)) + ((b2 & (-16777217)) * ((~b2) & 16777216));
                        int i22 = bArr4[i12] & 255;
                        int i23 = i22 * ((~i22) & 65536);
                        int i24 = ~((i21 | ((~i23) | (-1355861741))) - ((i23 & (-1355861741)) | i21));
                        int i25 = bArr4[iA2] & 255;
                        int i26 = i25 * ((~i25) & 256);
                        int iA3 = l0.a(i26, i24, 1, ((-1) - i26) | ((-1) - i24));
                        int i27 = (iA3 - 1) - ((~(bArr4[i3] & 255)) | iA3);
                        int i28 = i20 << ((i20 > Double.NaN ? 1 : (i20 == Double.NaN ? 0 : -1)) >>> 31);
                        int i29 = (i28 ^ (-418000873)) + ((i28 & (-418000873)) * 2);
                        int i30 = (i29 + i27) - ((i29 & i27) * 2);
                        bArr4[i3] = (byte) i30;
                        bArr4[iA2] = (byte) (i30 >>> 8);
                        bArr4[i12] = (byte) (i30 >>> 16);
                        bArr4[i10] = (byte) (i30 >>> 24);
                        i3 = (i3 ^ 4) + ((i3 & 4) * 2);
                        int length3 = bArr4.length;
                        int iA4 = w1.a(bArr4.length, 4, 0, 0);
                        i5 = (((((long) i3) > ((long) (((length3 & (~iA4)) * 2) - (length3 ^ iA4))) ? 1 : (((long) i3) == ((long) (((length3 & (~iA4)) * 2) - (length3 ^ iA4))) ? 0 : -1)) >>> 31) & 1) != 0 ? 1910359311 : 1621215041;
                        break;
                    case -97532338:
                        length = bArr4.length % 4;
                        int i31 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                        i2 = i31 != 0 ? 986083301 : 1621215041;
                        i5 = i31 == 0 ? -1138188205 : i2;
                        break;
                    case 298177592:
                        int length4 = bArr4.length;
                        int i32 = 0 - i4;
                        int iA5 = n0.a(0, (length4 & 2) | p0.a(i32, -4, 1, length4), i32 * 3, 1);
                        byte b3 = bArr3[iA5];
                        int length5 = bArr4.length;
                        int i33 = 0 - i32;
                        int i34 = i33 | length5;
                        byte b4 = bArr3[q0.a(i33, 2, i34, (length5 ^ i33) ^ i34)];
                        bArr3[iA5] = (byte) (((byte) (b4 ^ b3)) + ((byte) (((byte) 2) * ((byte) (b4 & b3)))));
                        i5 = 1565752577;
                        break;
                    case 373627814:
                        break;
                    case 975213712:
                        int length6 = bArr4.length;
                        int i35 = 0 - i4;
                        int length7 = bArr4.length;
                        int i36 = ~i35;
                        byte b5 = bArr4[((length7 | i35) - (((-656070458) & i36) & length7)) + (((-656070458) | i35) & length7)];
                        int length8 = bArr4.length;
                        byte b6 = bArr3[(length8 ^ i36) + ((length8 | i35) * 2) + 1];
                        bArr4[((length6 | i35) * 2) - (length6 ^ i35)] = (byte) (((byte) (b6 - b5)) + ((byte) (((byte) 2) * ((byte) ((~b6) & b5)))));
                        length = (~i4) + (i4 * 2);
                        int i37 = ((i4 > 2 ? 1 : (i4 == 2 ? 0 : -1)) >>> 31) & 1;
                        i2 = i37 != 0 ? 986083301 : 1621215041;
                        if (i37 == 0) {
                        }
                        break;
                    case 1548321255:
                        int length9 = bArr.length;
                        int length10 = 0 - (0 - (bArr.length % 4));
                        i5 = (length9 & (~length10)) - ((~length9) & length10) > 0 ? 1910359311 : 1621215041;
                        bArr3 = bArr2;
                        bArr4 = bArr;
                        i3 = 0;
                        break;
                    default:
                        break;
                }
                return;
            }
        }
    }

    public l4(l2 l2Var) {
        this.f262a = new m4(l2Var);
    }

    public ByteBuffer a() {
        return this.f262a.a();
    }

    public m4 b() {
        return this.f262a;
    }
}
