package com.aheaditec.talsec.security;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 {
    public static final a d = new a(null);
    public static final double e = 1000.0d;
    public static final double f = 3.6d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f280a;
    public final LocationManager b;
    public b c;

    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Location f281a;
        public final long b;

        public b(Location location, long j) {
            byte[] bArr = {101, 54, -114, -39, 7, -34, -40, -103};
            a(bArr, new byte[]{9, 89, -19, -72, 115, -73, -73, -9});
            Intrinsics.checkNotNullParameter(location, new String(bArr, StandardCharsets.UTF_8).intern());
            this.f281a = location;
            this.b = j;
        }

        public final Location a() {
            return this.f281a;
        }

        public final long b() {
            return this.b;
        }

        public final Location c() {
            return this.f281a;
        }

        public final long d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f281a, bVar.f281a) && this.b == bVar.b;
        }

        public int hashCode() {
            return Long.hashCode(this.b) + (this.f281a.hashCode() * 31);
        }

        public String toString() {
            Location location = this.f281a;
            long j = this.b;
            byte[] bArr = {-95, -4, -38, 98, -90, -104, 101, -31, 42, 78, -84, Ascii.SUB, -7, 110, -30, 55, 119, Ascii.CR, -102, -114, -95, -87, 17, 9, -77, -75};
            a(bArr, new byte[]{-19, -109, -71, 3, -46, -15, 10, -113, 121, 32, -51, 106, -118, 6, -115, 67, Framer.STDIN_REQUEST_FRAME_PREFIX, 97, -11, -19, -64, -35, Framer.EXIT_FRAME_PREFIX, 102, -35, -120});
            Charset charset = StandardCharsets.UTF_8;
            String strIntern = new String(bArr, charset).intern();
            byte[] bArr2 = {-118, Framer.EXIT_FRAME_PREFIX, 8, -22, -24, 80, -80, 121, -3, 1, -24, Ascii.DC4, -72, -51, -84, -29, 72, 6};
            a(bArr2, new byte[]{-90, 88, 124, -125, -123, 53, -61, Ascii.CR, -100, 108, -104, 89, -47, -95, -64, -118, 59, 59});
            String strIntern2 = new String(bArr2, charset).intern();
            byte[] bArr3 = {-36};
            a(bArr3, new byte[]{-11, 91, 70, 59, 44, 36, 59, -17});
            return strIntern + location + strIntern2 + j + new String(bArr3, charset).intern();
        }

        public final b a(Location location, long j) {
            byte[] bArr = {-15, -103, -28, -24, -112, -100, 60, -93};
            a(bArr, new byte[]{-99, -10, -121, -119, -28, -11, 83, -51});
            Intrinsics.checkNotNullParameter(location, new String(bArr, StandardCharsets.UTF_8).intern());
            return new b(location, j);
        }

        public static /* synthetic */ b a(b bVar, Location location, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                location = bVar.f281a;
            }
            if ((i & 2) != 0) {
                j = bVar.b;
            }
            return bVar.a(location, j);
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

    public r2(Context context, LocationManager locationManager) {
        byte[] bArr = {-68, 91, -25, -124, -97, -17, -103};
        a(bArr, new byte[]{-10, 4, -97, -41, -6, -105, -19, -121});
        Intrinsics.checkNotNullParameter(context, new String(bArr, StandardCharsets.UTF_8).intern());
        this.f280a = context;
        this.b = locationManager;
    }

    public final double a() {
        b bVar;
        Location locationB;
        if (!c() || (bVar = this.c) == null || (locationB = b()) == null) {
            return 0.0d;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        float fDistanceTo = bVar.f281a.distanceTo(locationB);
        double d2 = (jCurrentTimeMillis - bVar.b) / 1000.0d;
        this.c = new b(locationB, jCurrentTimeMillis);
        if (d2 <= 0.0d) {
            return 0.0d;
        }
        return (((double) fDistanceTo) / d2) * 3.6d;
    }

    public final Location b() {
        LocationManager locationManager = this.b;
        if (locationManager == null) {
            return null;
        }
        byte[] bArr = {12, -29, 117};
        a(bArr, new byte[]{107, -109, 6, -33, 123, 54, 69, 39});
        return locationManager.getLastKnownLocation(new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public final boolean c() {
        Context context = this.f280a;
        byte[] bArr = {-27, Ascii.US, Ascii.EM, -96, 73, -66, -116, 60, 40, -103, 114, 79, -80, -48, 123, -45, 53, Ascii.ESC, 86, -3, -87, -118, -32, 70, 53, Ascii.NAK, 62, Ascii.SI, 60, Ascii.RS, -83, 5, 75, 72, 102, 110, 48, -125, -12};
        a(bArr, new byte[]{-101, 65, -109, -71, Base64.padSymbol, -89, -2, -7, 111, -52, Ascii.SYN, 9, -16, 115, Ascii.RS, -95, 113, 69, -114, -93, 1, -102, -69, -4, 125, Ascii.SUB, -114, Framer.STDIN_FRAME_PREFIX, -119, 43, 8, Framer.STDOUT_FRAME_PREFIX, Ascii.ESC, -37, 60, Framer.ENTER_FRAME_PREFIX, 121, -52, -70});
        return w4.a(context, new String(bArr, StandardCharsets.UTF_8).intern());
    }

    public final boolean d() {
        return this.c != null;
    }

    public final void e() {
        if (c()) {
            Location locationB = b();
            this.c = locationB != null ? new b(locationB, System.currentTimeMillis()) : null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0041. Please report as an issue. */
    public static void a(byte[] bArr, byte[] bArr2) {
        boolean z;
        byte[] bArr3 = null;
        int i = 0;
        int i2 = 0;
        int length = 0;
        int i3 = 1516727821;
        byte[] bArr4 = null;
        while (true) {
            int i4 = ((i3 & 16777216) * (i3 | 16777216)) + ((i3 & (-16777217)) * ((~i3) & 16777216));
            int i5 = i3 >>> 8;
            int iA = m0.a(650911840 & (~i4) & i5, i5, i4, (i4 | 650911840) & i5);
            int i6 = (iA ^ 642535957) + ((iA & 642535957) * 2);
            switch (((~i6) + ((i6 | 1) * 2)) ^ 962785775) {
                case -1896910703:
                    int length2 = bArr4.length;
                    int i7 = 0 - i;
                    int i8 = (length2 ^ i7) + ((length2 & i7) * 2);
                    byte b2 = bArr3[i8];
                    int length3 = bArr4.length;
                    int i9 = 0 - i7;
                    int i10 = i9 | length3;
                    byte b3 = bArr3[q0.a(i9, 2, i10, (length3 ^ i9) ^ i10)];
                    bArr3[i8] = (byte) (((byte) (((byte) 2) * ((byte) (b3 | b2)))) - ((byte) (b3 ^ b2)));
                    i3 = -746753280;
                    break;
                case -1725904394:
                    length = bArr4.length % 4;
                    i3 = (((length > 1 ? 1 : (length == 1 ? 0 : -1)) >>> 31) & 1) == 0 ? -365117735 : -458924450;
                    break;
                case -1399959314:
                    int iA2 = m0.a((-1205100636) & i2, i2, 3, (-1205100633) & i2);
                    byte b4 = bArr3[iA2];
                    int i11 = ((b4 & 16777216) * (b4 | 16777216)) + ((b4 & (-16777217)) * ((~b4) & 16777216));
                    int i12 = i2 - 1;
                    int i13 = i12 - (i2 | (-3));
                    int i14 = bArr3[i13] & 255;
                    int i15 = i14 * ((~i14) & 65536);
                    int iA3 = l0.a(i15, i11, 1, ((-1) - i15) | ((-1) - i11));
                    int i16 = i12 - (i2 | (-2));
                    int i17 = bArr3[i16] & 255;
                    int i18 = i17 * ((~i17) & 256);
                    int i19 = (i18 - 1) - ((~iA3) | i18);
                    int i20 = bArr3[i2] & 255;
                    int iA4 = l0.a(i19, i20, 1, ((-1) - i19) | ((-1) - i20));
                    byte b5 = bArr4[iA2];
                    int i21 = ((b5 & 16777216) * (b5 | 16777216)) + ((b5 & (-16777217)) * ((~b5) & 16777216));
                    int i22 = bArr4[i13] & 255;
                    int i23 = ((i22 * ((~i22) & 65536)) & (~i21)) + i21;
                    int i24 = bArr4[i16] & 255;
                    int i25 = i24 * ((~i24) & 256);
                    int i26 = ~((((~i25) | 911399251) | i23) - ((i25 & 911399251) | i23));
                    int i27 = bArr4[i2] & 255;
                    int i28 = ~((((~i26) | 1433568692) | i27) - ((i26 & 1433568692) | i27));
                    int i29 = iA4 << ((iA4 > Double.NaN ? 1 : (iA4 == Double.NaN ? 0 : -1)) >>> 31);
                    int i30 = (-1254002618) - ((i29 & 2) | ((-1672003491) - i29));
                    int i31 = (i30 + i28) - ((i30 & i28) * 2);
                    bArr4[i2] = (byte) i31;
                    bArr4[i16] = (byte) (i31 >>> 8);
                    bArr4[i13] = (byte) (i31 >>> 16);
                    bArr4[iA2] = (byte) (i31 >>> 24);
                    i2 = (i2 ^ 4) + ((i2 & 4) * 2);
                    int length4 = bArr4.length;
                    int length5 = 0 - (bArr4.length % 4);
                    int i32 = ((i2 > n0.a(0, (length4 & 2) | p0.a(length5, -4, 1, length4), length5 * 3, 1) ? 1 : (i2 == n0.a(0, (length4 & 2) | p0.a(length5, -4, 1, length4), length5 * 3, 1) ? 0 : -1)) >>> 31) & 1;
                    i3 = i32 != 0 ? i32 != 0 ? -1605440657 : -365117735 : -169475207;
                    break;
                case -1135475043:
                    break;
                case 180635757:
                    int length6 = bArr.length;
                    int length7 = 0 - (bArr.length % 4);
                    z = ((length6 ^ (~length7)) + ((length6 | length7) * 2)) + 1 > 0;
                    i3 = z ? z ? -1605440657 : -365117735 : -169475207;
                    bArr3 = bArr2;
                    bArr4 = bArr;
                    i2 = 0;
                    break;
                case 511524454:
                    int length8 = bArr4.length;
                    int i33 = 0 - i;
                    int i34 = 0 - i33;
                    int i35 = ((~length8) & i34) * 2;
                    int length9 = bArr4.length;
                    byte b6 = bArr4[((length9 | i33) * 2) - (length9 ^ i33)];
                    int length10 = bArr4.length;
                    byte b7 = bArr3[(i33 ^ length10) + ((length10 & i33) * 2)];
                    bArr4[(length8 ^ i34) - i35] = (byte) (((byte) (b7 - b6)) + ((byte) (((byte) 2) * ((byte) ((~b7) & b6)))));
                    length = o0.a(i, 3, (~i) * 2, 1);
                    if ((((i > 2 ? 1 : (i == 2 ? 0 : -1)) >>> 31) & 1) == 0) {
                    }
                    break;
                case 961838909:
                    int length11 = bArr4.length;
                    int i36 = 0 - length;
                    z = (((double) ((byte) bArr3[((length11 | i36) - ((165327505 & (~i36)) & length11)) + ((i36 | 165327505) & length11)])) > Double.NaN ? 1 : (((double) ((byte) bArr3[((length11 | i36) - ((165327505 & (~i36)) & length11)) + ((i36 | 165327505) & length11)])) == Double.NaN ? 0 : -1)) > -1;
                    i3 = z ? -746753280 : z ? -365117735 : 1093626513;
                    i = length;
                    break;
                default:
                    break;
            }
            return;
        }
    }
}
