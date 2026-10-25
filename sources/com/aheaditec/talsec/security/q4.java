package com.aheaditec.talsec.security;

import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q4 extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f278a;
    public final Throwable b;

    public static final class a extends q4 {
        public final String c;
        public final Throwable d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Throwable th) {
            super(str, th, null);
            byte[] bArr = {-73, -94, 56, Ascii.DC4, 107, -25};
            a(bArr, new byte[]{41, -11, -53, 5, 4, -119, -7, -82});
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullParameter(str, new String(bArr, charset).intern());
            byte[] bArr2 = {Framer.STDOUT_FRAME_PREFIX, Ascii.RS, 100, -73, 78};
            a(bArr2, new byte[]{-74, 106, -93, 106, 43, -54, 1, -7});
            Intrinsics.checkNotNullParameter(th, new String(bArr2, charset).intern());
            this.c = str;
            this.d = th;
        }

        @Override // com.aheaditec.talsec.security.q4
        public String a() {
            return this.c;
        }

        @Override // com.aheaditec.talsec.security.q4, java.lang.Throwable
        public Throwable getCause() {
            return this.d;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0040. Please report as an issue. */
        public static void a(byte[] bArr, byte[] bArr2) {
            byte[] bArr3;
            byte[] bArr4 = null;
            int i = -1003175592;
            int length = 0;
            int i2 = 0;
            int i3 = 0;
            byte[] bArr5 = null;
            while (true) {
                int i4 = ((i & 16777216) * (i | 16777216)) + ((i & (-16777217)) * ((~i) & 16777216));
                int i5 = i >>> 8;
                int i6 = ~((((~i5) | (-1095531540)) | i4) - ((i5 & (-1095531540)) | i4));
                int i7 = (-1171264002) - ((i6 & 2) | ((-130029571) - i6));
                int i8 = 935800592;
                switch ((-1109882652) ^ ((~i7) + ((i7 | 1) * 2))) {
                    case -1922532006:
                        bArr3 = bArr4;
                        int length2 = bArr5.length;
                        int i9 = 0 - length;
                        i = (((double) ((byte) bArr3[n0.a(0, (length2 & 2) | p0.a(i9, -4, 1, length2), i9 * 3, 1)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[n0.a(0, (length2 & 2) | p0.a(i9, -4, 1, length2), i9 * 3, 1)])) == Double.NaN ? 0 : -1)) > -1 ? 935800592 : -1671996003;
                        i2 = length;
                        bArr4 = bArr3;
                        break;
                    case -1486048729:
                        int length3 = bArr.length;
                        int length4 = 0 - (0 - (bArr.length % 4));
                        boolean z = (length3 & (~length4)) - ((~length3) & length4) > 0;
                        i = z ? z ? -1515449616 : 935800592 : -10521562;
                        bArr4 = bArr2;
                        bArr5 = bArr;
                        i3 = 0;
                        break;
                    case -497756741:
                        bArr3 = bArr4;
                        int length5 = bArr5.length;
                        int i10 = 0 - i2;
                        int i11 = ((length5 | i10) * 2) - (length5 ^ i10);
                        byte b = bArr3[i11];
                        int length6 = bArr5.length;
                        byte b2 = bArr3[((i10 | length6) - ((1163302289 & (~i10)) & length6)) + ((i10 | 1163302289) & length6)];
                        bArr3[i11] = (byte) (((byte) (((byte) (b2 ^ (~b))) + ((byte) (((byte) 2) * ((byte) (b2 | b)))))) + ((byte) 1));
                        i = 935800592;
                        bArr4 = bArr3;
                        break;
                    case 256719606:
                        int i12 = (i3 - 1) - (i3 | (-4));
                        byte b3 = bArr4[i12];
                        int i13 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                        int i14 = i3 + 2;
                        int i15 = i14 - (i3 & 2);
                        int i16 = bArr4[i15] & 255;
                        int i17 = i16 * ((~i16) & 65536);
                        int iA = l0.a(i17, i13, 1, ((-1) - i17) | ((-1) - i13));
                        int i18 = i14 + (((-1) - i3) | (-2));
                        int i19 = bArr4[i18] & 255;
                        int i20 = i19 * ((~i19) & 256);
                        int i21 = (i20 - 1) - ((~iA) | i20);
                        int i22 = bArr4[i3] & 255;
                        int i23 = ~((i22 | ((~i21) | (-755325340))) - ((i21 & (-755325340)) | i22));
                        byte b4 = bArr5[i12];
                        int i24 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                        int i25 = bArr5[i15] & 255;
                        int i26 = i25 * ((~i25) & 65536);
                        int i27 = bArr5[i18] & 255;
                        int i28 = i27 * ((~i27) & 256);
                        int i29 = bArr5[i3] & 255;
                        bArr3 = bArr4;
                        int i30 = i23 << ((i23 > Double.NaN ? 1 : (i23 == Double.NaN ? 0 : -1)) >>> 31);
                        int i31 = (-659933419) - ((1983400305 - i24) | (i24 & 2));
                        int i32 = (i31 ^ (~i26)) + ((i31 | i26) * 2) + 1;
                        int i33 = (i32 ^ i29) + ((i32 & i29) * 2);
                        int i34 = ((i33 | i28) - (((-2109111237) & (~i28)) & i33)) + ((i28 | (-2109111237)) & i33);
                        int iA2 = com.aheaditec.talsec.security.a.a(i30 | i34, 2, i30, i34);
                        bArr5[i3] = (byte) iA2;
                        bArr5[i18] = (byte) (iA2 >>> 8);
                        bArr5[i15] = (byte) (iA2 >>> 16);
                        bArr5[i12] = (byte) (iA2 >>> 24);
                        i3 = (i3 ^ 4) + ((i3 & 4) * 2);
                        int length7 = bArr5.length;
                        int length8 = 0 - (bArr5.length % 4);
                        int i35 = ((i3 > (((length7 | length8) * 2) - (length7 ^ length8)) ? 1 : (i3 == (((length7 | length8) * 2) - (length7 ^ length8)) ? 0 : -1)) >>> 31) & 1;
                        i = i35 != 0 ? -1515449616 : 935800592;
                        if (i35 == 0) {
                            i = -10521562;
                        }
                        bArr4 = bArr3;
                        break;
                    case 1429728656:
                        length = bArr5.length % 4;
                        int i36 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                        i8 = i36 != 0 ? -1216566512 : 935800592;
                        i = i36 == 0 ? -1058029970 : i8;
                        break;
                    case 1870596681:
                        break;
                    case 1879000533:
                        int length9 = bArr5.length;
                        int i37 = 0 - i2;
                        int i38 = 0 - i37;
                        int i39 = i38 | length9;
                        int i40 = (length9 ^ i38) ^ i39;
                        int i41 = i38 * 2;
                        int length10 = bArr5.length;
                        byte b5 = bArr5[(i38 ^ length10) - (((~length10) & i38) * 2)];
                        int length11 = bArr5.length;
                        byte b6 = bArr4[((i37 | length11) * 2) - (length11 ^ i37)];
                        bArr5[(i39 - i41) + i40] = (byte) (((((byte) (~b6)) + ((byte) (((byte) 2) * ((byte) (b6 | 1))))) ^ b5) ^ 1);
                        length = (~i2) + (i2 * 2);
                        int i42 = ((i2 > 2 ? 1 : (i2 == 2 ? 0 : -1)) >>> 31) & 1;
                        i8 = i42 != 0 ? -1216566512 : 935800592;
                        if (i42 == 0) {
                        }
                        break;
                    default:
                        break;
                }
                return;
            }
        }
    }

    public static final class b extends q4 {
        public final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(str, null, 2, null);
            byte[] bArr = {-47, 102, -54, Framer.STDOUT_FRAME_PREFIX, SignedBytes.MAX_POWER_OF_TWO, -9};
            a(bArr, new byte[]{-57, 53, Ascii.EM, -28, 47, -103, -94, -96});
            Intrinsics.checkNotNullParameter(str, new String(bArr, StandardCharsets.UTF_8).intern());
            this.c = str;
        }

        @Override // com.aheaditec.talsec.security.q4
        public String a() {
            return this.c;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
        public static void a(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = null;
            int i = 0;
            int i2 = 0;
            int length = 0;
            int i3 = -894652659;
            byte[] bArr4 = null;
            while (true) {
                int i4 = ((i3 & 16777216) * (i3 | 16777216)) + ((i3 & (-16777217)) * ((~i3) & 16777216));
                int i5 = i3 >>> 8;
                int i6 = (i5 + i4) - (i5 & i4);
                int i7 = (i6 ^ 1458005263) + ((i6 & 1458005263) * 2);
                int i8 = -34715366;
                switch ((i7 - 1434379843) + (((~i7) & 1434379843) * 2)) {
                    case -1970406716:
                        int length2 = bArr4.length;
                        int i9 = 0 - i;
                        int i10 = ~i9;
                        int i11 = ((length2 | i9) - ((602749225 & i10) & length2)) + ((i9 | 602749225) & length2);
                        byte b = bArr3[i11];
                        int length3 = bArr4.length;
                        byte b2 = bArr3[(length3 ^ i10) + ((i9 | length3) * 2) + 1];
                        int i12 = ((byte) 0) - b;
                        bArr3[i11] = (byte) (((byte) (((byte) 2) * ((byte) (b2 & (~i12))))) - ((byte) (b2 ^ i12)));
                        break;
                    case -1882653318:
                        int i13 = (i2 - 1) - (i2 | (-4));
                        byte b3 = bArr3[i13];
                        int i14 = ((b3 & 16777216) * (b3 | 16777216)) + ((b3 & (-16777217)) * ((~b3) & 16777216));
                        int i15 = i2 + 3 + (((-1) - i2) | (-3));
                        int i16 = bArr3[i15] & 255;
                        int i17 = i16 * ((~i16) & 65536);
                        int i18 = ~((i14 | (1169991170 | (~i17))) - ((i17 & 1169991170) | i14));
                        int iA = m0.a(689061172 & i2, i2, 1, 689061173 & i2);
                        int i19 = bArr3[iA] & 255;
                        int i20 = ((~i18) & (i19 * ((~i19) & 256))) + i18;
                        int i21 = (i20 - 1) - ((~(bArr3[i2] & 255)) | i20);
                        byte b4 = bArr4[i13];
                        int i22 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                        int i23 = bArr4[i15] & 255;
                        int i24 = i23 * ((~i23) & 65536);
                        int i25 = ~((i22 | ((-445685625) | (~i24))) - ((i24 & (-445685625)) | i22));
                        int i26 = bArr4[iA] & 255;
                        int i27 = i26 * ((~i26) & 256);
                        int i28 = (i27 + i25) - (i27 & i25);
                        int i29 = bArr4[i2] & 255;
                        int i30 = (i28 & (~i29)) + i29;
                        int i31 = i21 << ((i21 > Double.NaN ? 1 : (i21 == Double.NaN ? 0 : -1)) >>> 31);
                        int i32 = (i31 + i30) - ((i31 & i30) * 2);
                        int i33 = 659933421 - ((i32 & 2) | ((-1983400303) - i32));
                        bArr4[i2] = (byte) i33;
                        bArr4[iA] = (byte) (i33 >>> 8);
                        bArr4[i15] = (byte) (i33 >>> 16);
                        bArr4[i13] = (byte) (i33 >>> 24);
                        i2 = (i2 ^ 4) + ((i2 & 4) * 2);
                        int length4 = bArr4.length;
                        int length5 = 0 - (bArr4.length % 4);
                        int i34 = 1 & ((i2 > ((length4 ^ length5) + ((length4 & length5) * 2)) ? 1 : (i2 == ((length4 ^ length5) + ((length4 & length5) * 2)) ? 0 : -1)) >>> 31);
                        i3 = i34 != 0 ? -826922365 : i34 != 0 ? 196573321 : 145880015;
                        break;
                    case -625567707:
                        break;
                    case 172635213:
                        int length6 = bArr4.length;
                        int i35 = 0 - length;
                        i3 = (((double) ((byte) bArr3[(length6 ^ i35) + ((length6 & i35) * 2)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[(length6 ^ i35) + ((length6 & i35) * 2)])) == Double.NaN ? 0 : -1)) > -1 ? -34715366 : 196573321;
                        i = length;
                        break;
                    case 614184219:
                        int length7 = bArr4.length;
                        int i36 = 0 - i;
                        int i37 = i36 * 3;
                        int iA2 = p0.a(i36, -4, 1, length7);
                        int length8 = bArr4.length;
                        byte b5 = bArr4[(length8 ^ i36) + ((length8 & i36) * 2)];
                        int length9 = bArr4.length;
                        int i38 = 0 - i36;
                        byte b6 = bArr3[(((~i38) & length9) * 2) - (length9 ^ i38)];
                        bArr4[n0.a(0, (length7 & 2) | iA2, i37, 1)] = (byte) (((byte) (b6 + b5)) - ((byte) (((byte) 2) * ((byte) (b6 & b5)))));
                        length = ((-338014207) | i) + (338014206 | i);
                        int i39 = ((i > 2 ? 1 : (i == 2 ? 0 : -1)) >>> 31) & 1;
                        i8 = i39 != 0 ? 196573321 : 1298988808;
                        i3 = i39 == 0 ? i8 : -518432968;
                        break;
                    case 835516413:
                        int length10 = bArr.length;
                        int length11 = 0 - (0 - (bArr.length % 4));
                        boolean z = (length10 ^ length11) - (((~length10) & length11) * 2) > 0;
                        i3 = z ? -826922365 : z ? 196573321 : 145880015;
                        bArr3 = bArr2;
                        bArr4 = bArr;
                        i2 = 0;
                        break;
                    case 1888416065:
                        length = bArr4.length % 4;
                        int i40 = ((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1;
                        i8 = i40 != 0 ? 196573321 : 1298988808;
                        if (i40 == 0) {
                        }
                        break;
                    default:
                        i3 = 196573321;
                        break;
                }
                return;
            }
        }
    }

    public q4(String str, Throwable th) {
        super(str, th);
        this.f278a = str;
        this.b = th;
    }

    public String a() {
        return this.f278a;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q4(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        th = (i & 2) != 0 ? null : th;
        super(str, th);
        this.f278a = str;
        this.b = th;
    }

    public q4(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, th);
        this.f278a = str;
        this.b = th;
    }
}
