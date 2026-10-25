package com.aheaditec.talsec.security;

import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.security.keystore.UserNotAuthenticatedException;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.UnrecoverableEntryException;
import java.util.Date;
import javax.crypto.NoSuchPaddingException;
import kotlin.io.encoding.Base64;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 implements z {
    public static final String c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f214a;
    public final KeyStore b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f215a;
        public final String b;

        public a(String str, String str2) {
            this.f215a = str;
            this.b = str2;
        }

        public String a() {
            return this.b;
        }

        public String b() {
            return this.f215a;
        }
    }

    static {
        byte[] bArr = {-56, Framer.STDIN_REQUEST_FRAME_PREFIX, -51, -7, -44, Ascii.CAN, -127, -106, -32, -65, -120, -97, -40, Ascii.FS, -62};
        a(bArr, new byte[]{Framer.STDIN_FRAME_PREFIX, 35, 91, 46, Ascii.ETB, 111, -105, -77, -31, -44, -87, 117, -73, 110, -89});
        c = new String(bArr, StandardCharsets.UTF_8).intern();
    }

    public a0(a aVar, KeyStore keyStore) {
        this.f214a = aVar;
        if (a(keyStore)) {
            this.b = keyStore;
        } else {
            byte[] bArr = {1, -51, -17, -29, 104, -67, -112, -1, 97, -31, 38, 101, -57, 7, -82, -91, -14, 8, 93, 39, 54, 7, 17, -69, -83, 101, -45};
            a(bArr, new byte[]{-11, -37, Ascii.DC2, 53, 105, -49, 34, Ascii.ETB, 107, -68, -19, -73, Ascii.ESC, -102, 109, 124, -13, -110, -18, -30, -65, -115, -15, 105, -62, Ascii.ETB, -74});
            throw new IllegalArgumentException(new String(bArr, StandardCharsets.UTF_8).intern());
        }
    }

    public final c4 a(String str, Exception exc) {
        return new c4(c4.b, str, exc);
    }

    public abstract Key a(KeyStore.Entry entry);

    public abstract KeyStore.Entry a(Date date) throws c4;

    public c4 b(Exception exc) {
        byte[] bArr = {-15, 66, Ascii.RS, -14, 82, -62, 110, 7, 114, 90, -60, 39, 113, -111, 54, 9, -106, 48, 86, 79, -82, -101, 79, 10, 41, 108, 41, -101, -54, 109, 67, -38, 96, Ascii.CAN, 51, -6, -40, Ascii.ESC, 107, 73, -43, 100, -102, -56, -79, -107, -124, -64, -28, 0, 107, -112, 77, -60};
        a(bArr, new byte[]{-48, 66, -30, 59, -124, -113, -113, 10, 117, Base64.padSymbol, 68, -8, 112, Ascii.ESC, -120, Ascii.FS, 82, 119, -92, -44, 114, -5, -92, Ascii.CAN, -65, 48, -2, -117, 7, 53, -46, Ascii.FS, 111, 99, -36, 124, Ascii.NAK, 103, -69, -60, 89, 52, 126, 68, 56, -93, -99, 71, -15, -99, -88, -99, Utf8.REPLACEMENT_BYTE, -95});
        return new c4(c4.c, new String(bArr, StandardCharsets.UTF_8).intern(), exc);
    }

    public abstract KeyStore.ProtectionParameter b(Date date) throws c4;

    public abstract void b(Key key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException;

    @Override // com.aheaditec.talsec.security.z
    public boolean c() throws c4 {
        return e();
    }

    public final boolean e() throws c4 {
        try {
            return f();
        } catch (NullPointerException e) {
            byte[] bArr = {76, 70, 60, 32, 125, -113, -2, 124, -12, -88, 102, -26, 90, 17, 66, -28, -74, -64, -76, Ascii.DLE, -5, -111, 100, -35, -8, Ascii.RS, -85, -26, 113, -35, 17, -24, 94, 77, 17, -112, 121, Ascii.ESC, -109, 66, 75, 104, 3, 87};
            a(bArr, new byte[]{-75, 65, -36, -19, 83, 93, Ascii.US, -68, -5, -29, -86, 58, -101, -102, -109, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, -57, 74, Ascii.SYN, -65, Ascii.FS, -66, 90, -1, 103, 116, 39, 114, -21, -24, 47, 123, 72, -9, -99, 111, 108, 37, -60, -125, 60, Ascii.DC4, -54});
            throw new c4(c4.b, new String(bArr, StandardCharsets.UTF_8).intern(), e);
        } catch (KeyStoreException e2) {
            byte[] bArr2 = {Ascii.SYN, -105, 93, 97, 119, 1, -26, -52, -114, Utf8.REPLACEMENT_BYTE, -57, Framer.EXIT_FRAME_PREFIX, -1, 76, -33, -70, -88, SignedBytes.MAX_POWER_OF_TWO, -41, 86, Ascii.DC4, 103, 68, -95, Ascii.NAK, 37, 58, -34, 117, -98, -121, -31, 88, 100, -55, -118, -30, -22, 55, -60, Framer.STDOUT_FRAME_PREFIX, 99, 4, -92, -60, -23, Ascii.SO, Framer.STDIN_REQUEST_FRAME_PREFIX, -122, 107};
            a(bArr2, new byte[]{-1, -10, -67, -84, 105, -49, 56, 76, 81, 88, 75, -87, -58, 94, 113, 106, 36, 71, 37, -36, -104, 38, -45, 119, -53, 123, -55, 54, 112, -30, -98, 99, -104, 48, 79, -116, -90, -66, -37, 73, -72, 112, Ascii.GS, 99, 17, -92, -12, -82, -12, Ascii.SO});
            throw new c4(c4.b, new String(bArr2, StandardCharsets.UTF_8).intern(), e2);
        }
    }

    public boolean f() throws KeyStoreException {
        return this.b.containsAlias(this.f214a.b()) && this.b.entryInstanceOf(this.f214a.b(), KeyStore.SecretKeyEntry.class);
    }

    public abstract Class<? extends KeyStore.Entry> g();

    public c4 h() {
        return new c4(c4.f, null);
    }

    public KeyStore.Entry i() throws c4 {
        try {
            return j();
        } catch (NullPointerException | UnsupportedOperationException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e) {
            byte[] bArr = {-61, Ascii.SI, -28, 105, 77, 126, -68, -24, -2, -58, Framer.STDERR_FRAME_PREFIX, -66, Ascii.CAN, -28, -52, -29, -116, -65, -93, 113, -113, -55, -54, -128, -9, 0, -25, 117, 39, -74, -26, Framer.EXIT_FRAME_PREFIX, -31, -58, -94, -41, Ascii.NAK, 86, 60, -128, -89, 51, 103, -41, 127, Ascii.GS, -2, -73, 105, -99};
            a(bArr, new byte[]{34, -113, 39, -93, -125, 75, 65, 40, -63, -63, -42, 82, -39, -75, Ascii.RS, Framer.STDOUT_FRAME_PREFIX, 88, -60, 121, -79, 19, -59, 89, -105, -23, -121, Base64.padSymbol, -82, -94, -51, Utf8.REPLACEMENT_BYTE, -5, -31, -43, 96, 91, -103, 37, -36, -115, 38, 1, -78, 92, 90, Framer.EXIT_FRAME_PREFIX, 4, 117, Ascii.ESC, -8});
            throw new c4(c4.b, new String(bArr, StandardCharsets.UTF_8).intern(), e);
        }
    }

    public KeyStore.Entry j() throws UnsupportedOperationException, NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException, c4 {
        try {
            KeyStore.Entry entry = this.b.getEntry(this.f214a.b(), null);
            if (entry != null) {
                return entry;
            }
            throw a((Exception) null);
        } catch (NullPointerException e) {
            byte[] bArr = {-40, Ascii.ESC, -2, -11, -59, -105, -60, 101, 80, 99, -124, 117, 81, -42, 87, 44, -3, 116, Framer.ENTER_FRAME_PREFIX, 108, -49, -7, -71, -12, -78, 51, -26, -113, -114, 62, 96, Ascii.SO, 110, 67, -128, -4};
            a(bArr, new byte[]{53, 103, 6, 57, 5, -20, 82, -24, -102, 37, -102, -69, -43, -86, -89, -2, -44, Ascii.SYN, -77, -89, Ascii.GS, -57, SignedBytes.MAX_POWER_OF_TWO, Framer.STDERR_FRAME_PREFIX, 47, 82, 44, -99, SignedBytes.MAX_POWER_OF_TWO, 73, -14, Ascii.NAK, 124, 69, -128, 39});
            throw new c4(c4.b, new String(bArr, StandardCharsets.UTF_8).intern(), e);
        }
    }

    public final void k() throws KeyStoreException {
        this.b.deleteEntry(this.f214a.b());
    }

    @Override // com.aheaditec.talsec.security.z
    public void remove() throws c4 {
        try {
            this.b.deleteEntry(this.f214a.b());
        } catch (NullPointerException | KeyStoreException e) {
            byte[] bArr = {-55, 47, -42, -102, 125, -104, 44, 82, 121, -90, -27, -85, 87, Framer.STDIN_FRAME_PREFIX, -98, -47, 101, 37, -23, -41, 101, 47, -112, -87, -39, -116, -8, -122, -100, -115, -72, -54, 55, Ascii.EM, -60, 35, 108, -10, -77, 109, -51, -103, 77, 35, -126, 41, -55, -27};
            a(bArr, new byte[]{40, 111, 58, -110, 83, -90, -15, -41, 126, -31, 37, 124, -98, 126, 48, 67, 97, 122, 55, Framer.STDIN_REQUEST_FRAME_PREFIX, 41, 111, 103, 97, Ascii.DC2, 12, 3, -121, 39, 91, 78, 76, -81, 103, Ascii.SYN, -32, 98, -117, 72, -16, Ascii.SUB, -30, -58, -10, 82, Framer.EXIT_FRAME_PREFIX, 73, Framer.STDIN_FRAME_PREFIX});
            throw new c4(c4.b, new String(bArr, StandardCharsets.UTF_8).intern(), e);
        }
    }

    public c4 a(Exception exc) {
        byte[] bArr = {114, 41, -124, 85, -78, -26, -53, 90, -96, 0, -88, -121, Ascii.DC2, 117, 124, -45, -9, Ascii.FS, -109, -101, 90, -56, 53, -60, 36, 104, 118, 90, 87, -87, -101, 19, -102, 34, -86, -110, 100, 87, 74, -97, Framer.STDOUT_FRAME_PREFIX, -128, 57, 8, 89, -71, -47, -119, Ascii.NAK, -37};
        a(bArr, new byte[]{83, 101, -124, -40, 36, -12, 82, -34, 39, -101, 107, -104, -45, 6, -50, 66, -13, 99, 105, -101, -34, -57, -62, 82, -70, 60, -115, -54, -110, -8, 106, 86, 90, 113, 104, -108, 40, 35, -50, 110, -72, 77, -64, Ascii.SI, -124, -43, 55, -125, 103, -66});
        return new c4(c4.e, new String(bArr, StandardCharsets.UTF_8).intern(), exc);
    }

    @Override // com.aheaditec.talsec.security.z
    public void b() throws c4 {
        Date date = new Date();
        a(a(date), b(date));
    }

    public final boolean a(KeyStore keyStore) {
        try {
            Provider provider = keyStore.getProvider();
            if (provider != null) {
                byte[] bArr = {-102, 54, 54, 8, Framer.ENTER_FRAME_PREFIX, 60, 86, -22, -28, -74, 43, 86, 96, 102, 115};
                a(bArr, new byte[]{127, 74, -52, Ascii.CAN, -86, SignedBytes.MAX_POWER_OF_TWO, -84, 7, -19, -35, -50, -52, Ascii.SI, Ascii.DC4, Ascii.SYN});
                if (new String(bArr, StandardCharsets.UTF_8).intern().equals(provider.getName())) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    @Override // com.aheaditec.talsec.security.z
    public Key a() throws c4 {
        if (!e()) {
            throw a((Exception) null);
        }
        Key keyA = a(i());
        a(keyA);
        return keyA;
    }

    public final void a(KeyStore.Entry entry, KeyStore.ProtectionParameter protectionParameter) throws c4 {
        try {
            this.b.setEntry(this.f214a.b(), entry, protectionParameter);
        } catch (NullPointerException | KeyStoreException e) {
            byte[] bArr = {119, -72, Ascii.ESC, Ascii.NAK, 56, -105, -67, -97, 69, 101, -81, -117, -85, -101, 101, Ascii.CR, 106, 2, -92, 87, -42, -79, 93, Framer.STDIN_REQUEST_FRAME_PREFIX, 19, -78, -117, 99, Ascii.EM, -98, Ascii.CAN, -65, -105, 66, -45, 105, 6, -110, 113, -78, 35, 55, -70, -33, -31};
            a(bArr, new byte[]{94, -44, -1, Ascii.CAN, -82, -92, SignedBytes.MAX_POWER_OF_TWO, 97, -118, 39, 83, -100, 42, -19, -9, Ascii.CAN, 102, -103, 121, -33, 90, -20, -69, -82, -59, -10, -109, -94, -99, -17, -21, 85, 90, Ascii.DLE, Framer.STDOUT_FRAME_PREFIX, -93, -118, Ascii.DC4, -122, 109, -76, 80, 67, 48, -124});
            throw new c4(c4.b, new String(bArr, StandardCharsets.UTF_8).intern(), e);
        }
    }

    public final void a(Key key) throws c4 {
        try {
            b(key);
        } catch (InvalidKeyException e) {
            if (e instanceof UserNotAuthenticatedException) {
                return;
            }
            if (e instanceof KeyPermanentlyInvalidatedException) {
                throw h();
            }
            byte[] bArr = {93, 101, 19, 87, 109, 79, -124, Ascii.CR, 126, 119, -101, 75, Ascii.SI, -93, -28, 70, 42, -33, 119, 2, 57, -123, -64, -128, -127, Ascii.DC4, -12, -37, 114, -101, Ascii.DLE, -45, 62, 46, 7, -63, 60, 0, Ascii.NAK, -82, -2, -113, -117, -68, -125, -113, -67, 76, Framer.EXIT_FRAME_PREFIX, -43};
            a(bArr, new byte[]{68, Framer.ENTER_FRAME_PREFIX, -9, -42, 99, Ascii.GS, -103, 12, 65, Ascii.DLE, 127, -36, -42, -12, 118, -34, -90, -91, -123, 1, -3, 4, 83, -113, 76, 102, 7, 74, 127, -25, -27, Ascii.NAK, -122, 122, Ascii.CR, 66, -64, -117, -23, 98, -49, 93, -106, 123, 94, Ascii.SO, 91, -64, 10, -80});
            throw new c4(c4.b, new String(bArr, StandardCharsets.UTF_8).intern(), e);
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            throw b(e);
        } catch (NoSuchPaddingException e3) {
            e = e3;
            throw b(e);
        } catch (Exception e4) {
            byte[] bArr2 = {-1, 17, 77, -123, -12, -106, 89, 114, -46, 7, Framer.ENTER_FRAME_PREFIX, 8, -101, Ascii.FS, -110, 1, 83, 56, -83, 8, -37, 83, 51, -3, -43, -58, 37, -24, 99, 67, -66, 8, 0, -31, -53, -123, -35, 10, -88, 93, -50, 117, Ascii.DC2};
            a(bArr2, new byte[]{-27, -98, -41, -117, -3, -32, -21, -96, Ascii.EM, -43, -15, 5, 82, 103, 113, 10, -98, 70, 126, Ascii.US, Ascii.SUB, 97, -46, 54, Ascii.CR, -36, -73, Framer.ENTER_FRAME_PREFIX, 98, 72, 67, Ascii.US, -53, -68, 88, -56, -14, -99, 107, -74, -89, Ascii.SYN, 119});
            throw new c4(c4.b, new String(bArr2, StandardCharsets.UTF_8).intern(), e4);
        }
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
