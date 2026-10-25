package com.aheaditec.talsec.security;

import android.security.keystore.KeyInfo;
import android.security.keystore.KeyProtection;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class b0 extends a0 {
    public final a d;

    public static class a extends a0.a {
        public final int c;
        public final int d;
        public final String e;
        public final String f;

        public a(String str, int i, String str2, int i2, String str3, String str4) {
            super(str, str2);
            if (i <= 0) {
                byte[] bArr = {108, 6, -97, -38, 40, -86, 84, -9, -99, -8, 104, -23, -27, -83, -87, -10, -68, 100, 74, -54, 76, Framer.STDOUT_FRAME_PREFIX, -99, 43, 125, 88, 119, 52, 58, -22, -42, 99, 103, -12, 10};
                a(bArr, new byte[]{124, 85, 127, 19, 48, -4, -58, 37, -104, -104, -69, 38, Framer.ENTER_FRAME_PREFIX, -9, 78, 35, -92, 106, -98, Ascii.CR, -120, 101, 121, -20, Framer.EXIT_FRAME_PREFIX, 58, -96, -32, -2, -117, 12, -96, 9, -44, 58});
                throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
            }
            this.c = i;
            this.d = i2;
            this.e = str3;
            this.f = str4;
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

        public String c() {
            return this.e;
        }

        public int d() {
            return this.c;
        }

        public String e() {
            return this.f;
        }

        public int f() {
            return this.d;
        }
    }

    public b0(a aVar, KeyStore keyStore) {
        super(aVar, keyStore);
        this.d = aVar;
    }

    @Override // com.aheaditec.talsec.security.a0
    public KeyStore.Entry a(Date date) {
        return new KeyStore.SecretKeyEntry(new SecretKeySpec(new byte[this.d.d()], this.d.a()));
    }

    @Override // com.aheaditec.talsec.security.a0
    public KeyStore.ProtectionParameter b(Date date) throws c4 {
        try {
            return new KeyProtection.Builder(this.d.f()).setBlockModes(this.d.c()).setEncryptionPaddings(this.d.e()).setUserAuthenticationRequired(false).setUserAuthenticationValidityDurationSeconds(Integer.MAX_VALUE).build();
        } catch (NoSuchMethodError unused) {
            byte[] bArr = {102, 111, -128, 106, Ascii.CAN, 118, -62, 44, -104, -78, -43, -69, 124, 116, -7, Ascii.SI, -100, -80, -108, 43, 115, Ascii.CAN, 78, -79, 111, 43, 72, -75, -122, 65, 7, -124, 118, -127, -38, 74, -81, -28, 116, -86, 8, 0, -96, 125};
            b(bArr, new byte[]{-127, Framer.ENTER_FRAME_PREFIX, 96, -70, Ascii.VT, Ascii.DC4, 80, -23, -114, -31, 6, 109, 117, 122, 68, -56, -127, -15, 114, -6, 101, 75, -36, 99, 121, 118, -82, 114, -127, 35, -36, 85, 100, -113, 56, -119, -71, -85, -85, 109, Ascii.DLE, 83, 68, -19});
            throw new c4(c4.g, new String(bArr, StandardCharsets.UTF_8).intern());
        }
    }

    @Override // com.aheaditec.talsec.security.z
    public boolean d() throws c4 {
        return l().isInsideSecureHardware();
    }

    @Override // com.aheaditec.talsec.security.a0
    public Class<? extends KeyStore.Entry> g() {
        return KeyStore.SecretKeyEntry.class;
    }

    public KeyInfo l() throws c4 {
        Key keyA = a();
        KeyInfo keyInfoA = a((SecretKey) keyA);
        a(keyA, keyInfoA);
        return keyInfoA;
    }

    @Override // com.aheaditec.talsec.security.a0
    public Key a(KeyStore.Entry entry) {
        return ((KeyStore.SecretKeyEntry) entry).getSecretKey();
    }

    @Override // com.aheaditec.talsec.security.a0
    public void b(Key key) throws UnsupportedOperationException, NoSuchPaddingException, InterruptedException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArr = {105, -92, -29, -72, -104, 106, 93, -117, -100, 4, -29, 112, 1, -26, -121, Ascii.NAK, 78};
        b(bArr, new byte[]{-116, -106, 38, 41, 127, 69, -24, Ascii.SUB, 110, 88, Framer.ENTER_FRAME_PREFIX, -77, 9, -76, 92, -59, 41});
        Cipher cipher = Cipher.getInstance(new String(bArr, StandardCharsets.UTF_8).intern());
        w0.f301a.a(cipher, 1, key);
        try {
            cipher.doFinal(new byte[0]);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0037. Please report as an issue. */
    public static void b(byte[] bArr, byte[] bArr2) {
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

    public final KeyInfo a(SecretKey secretKey) throws c4 {
        try {
            String algorithm = secretKey.getAlgorithm();
            byte[] bArr = {-55, -86, 105, 89, -16, 65, 41, -35, -84, -94, -85, 60, -2, -48, 10};
            b(bArr, new byte[]{44, -15, -65, -115, -29, Ascii.SYN, -1, 112, -91, -59, 110, -22, -111, -94, 111});
            return (KeyInfo) SecretKeyFactory.getInstance(algorithm, new String(bArr, StandardCharsets.UTF_8).intern()).getKeySpec(secretKey, KeyInfo.class);
        } catch (NoSuchAlgorithmException e) {
            e = e;
            throw super.b(e);
        } catch (NoSuchProviderException e2) {
            e = e2;
            throw super.b(e);
        } catch (ProviderException e3) {
            e = e3;
            throw super.b(e);
        } catch (InvalidKeySpecException e4) {
            throw super.a(e4);
        }
    }

    public final void a(Key key, KeyInfo keyInfo) throws c4 {
        int purposes = keyInfo.getPurposes();
        int keySize = keyInfo.getKeySize() / 8;
        String algorithm = key.getAlgorithm();
        if (purposes != this.d.f() || keySize != this.d.d() || !this.d.a().equals(algorithm)) {
            throw new c4(c4.f, null);
        }
    }
}
