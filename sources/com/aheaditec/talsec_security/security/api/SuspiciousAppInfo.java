package com.aheaditec.talsec_security.security.api;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stetho.dumpapp.Framer;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* JADX INFO: loaded from: classes3.dex */
public final class SuspiciousAppInfo implements Parcelable {
    public static final Parcelable.Creator<SuspiciousAppInfo> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageInfo f323a;
    public final Set<String> b;
    public final Set<String> c;

    public static final class Creator implements Parcelable.Creator<SuspiciousAppInfo> {
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

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuspiciousAppInfo createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            byte[] bArr = {-4, -122, -125, 12, -110, -93};
            a(bArr, new byte[]{-116, -25, -15, 111, -9, -49, -104, Framer.EXIT_FRAME_PREFIX});
            Intrinsics.checkNotNullParameter(parcel, new String(bArr, StandardCharsets.UTF_8).intern());
            PackageInfo packageInfo = (PackageInfo) parcel.readParcelable(SuspiciousAppInfo.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet2.add(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    linkedHashSet3.add(parcel.readString());
                }
                linkedHashSet = linkedHashSet3;
            }
            return new SuspiciousAppInfo(packageInfo, linkedHashSet2, linkedHashSet);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SuspiciousAppInfo[] newArray(int i) {
            return new SuspiciousAppInfo[i];
        }
    }

    public SuspiciousAppInfo(PackageInfo packageInfo, Set<String> set, Set<String> set2) {
        byte[] bArr = {71, 77, 79, -119, 55, 87, -6, 2, 127, -45, -11};
        a(bArr, new byte[]{55, 44, 44, -30, 86, 48, -97, 75, 17, -75, -102});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(packageInfo, new String(bArr, charset).intern());
        byte[] bArr2 = {-14, -94, -121, 97, -71, 91, -2};
        a(bArr2, new byte[]{-128, -57, -26, Ascii.DC2, -42, 53, -115, -26});
        Intrinsics.checkNotNullParameter(set, new String(bArr2, charset).intern());
        this.f323a = packageInfo;
        this.b = set;
        this.c = set2;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuspiciousAppInfo copy$default(SuspiciousAppInfo suspiciousAppInfo, PackageInfo packageInfo, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            packageInfo = suspiciousAppInfo.f323a;
        }
        if ((i & 2) != 0) {
            set = suspiciousAppInfo.b;
        }
        if ((i & 4) != 0) {
            set2 = suspiciousAppInfo.c;
        }
        return suspiciousAppInfo.copy(packageInfo, set, set2);
    }

    public final PackageInfo component1() {
        return this.f323a;
    }

    public final Set<String> component2() {
        return this.b;
    }

    public final Set<String> component3() {
        return this.c;
    }

    public final SuspiciousAppInfo copy(PackageInfo packageInfo, Set<String> set, Set<String> set2) {
        byte[] bArr = {Framer.EXIT_FRAME_PREFIX, 91, 89, Ascii.ETB, 47, -27, -103, -112, 34, -27, -78};
        a(bArr, new byte[]{8, 58, 58, 124, 78, -126, -4, -39, 76, -125, -35});
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullParameter(packageInfo, new String(bArr, charset).intern());
        byte[] bArr2 = {17, Ascii.ESC, -17, -112, Ascii.EM, 86, -103};
        a(bArr2, new byte[]{99, 126, -114, -29, 118, 56, -22, -9});
        Intrinsics.checkNotNullParameter(set, new String(bArr2, charset).intern());
        return new SuspiciousAppInfo(packageInfo, set, set2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(SuspiciousAppInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        byte[] bArr = {119, -122, 79, 118, 103, -114, Ascii.GS, -42, 92, -74, 122, -53, -33, 119, 94, -89, Framer.EXIT_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, -27, 103, 108, -11, 36, 8, 68, -26, 73, -34, 41, 62, 106, -62, Framer.STDERR_FRAME_PREFIX, 77, -14, 6, 19, 46, 48, 70, -83, -104, -12, 38, -73, 17, -27, -106, -56, -57, 44, 76, 52, -121, -10, 6, -106, -112, -7, 10, -9, 56, Ascii.GS, -125, 116, 57, 1, -91, 81, -98, Ascii.RS, -123, -81, 107, 17, -21, -81, -19, -21, 67, 115, 92, -83, 114, -80, -63, -37, -5, Ascii.GS, 73, -118, -25, 36, 10, -114, -108};
        a(bArr, new byte[]{Ascii.EM, -13, 35, Ascii.SUB, 71, -19, 124, -72, Framer.STDERR_FRAME_PREFIX, -39, Ascii.SO, -21, -67, Ascii.DC2, 126, -60, Ascii.EM, 94, 70, -59, 19, 3, -43, 74, 103, 42, -53, 39, -85, 69, 82, 74, -74, 75, Base64.padSymbol, -105, 38, 112, 65, 93, 104, -52, -16, -111, 71, -45, Framer.EXIT_FRAME_PREFIX, -111, -13, -85, -23, 88, Framer.STDIN_FRAME_PREFIX, 88, -12, -109, 101, -55, -29, -100, 105, -126, 74, 116, -9, Ascii.CR, Ascii.ETB, 114, -64, Framer.STDERR_FRAME_PREFIX, -21, 108, -20, -37, Ascii.DC2, Utf8.REPLACEMENT_BYTE, -118, -33, -124, -59, Ascii.DLE, 6, 47, -35, Ascii.ESC, -45, -88, -76, -114, 110, 8, -6, -105, 109, 100, -24, -5});
        Intrinsics.checkNotNull(obj, new String(bArr, StandardCharsets.UTF_8).intern());
        SuspiciousAppInfo suspiciousAppInfo = (SuspiciousAppInfo) obj;
        return Intrinsics.areEqual(this.f323a, suspiciousAppInfo.f323a) && Intrinsics.areEqual(this.b, suspiciousAppInfo.b) && Intrinsics.areEqual(this.c, suspiciousAppInfo.c);
    }

    public final PackageInfo getPackageInfo() {
        return this.f323a;
    }

    public final Set<String> getPermissions() {
        return this.c;
    }

    public final Set<String> getReasons() {
        return this.b;
    }

    public int hashCode() {
        return this.f323a.packageName.hashCode();
    }

    public String toString() {
        PackageInfo packageInfo = this.f323a;
        Set<String> set = this.b;
        Set<String> set2 = this.c;
        byte[] bArr = {-29, 8, 102, -21, 79, -20, 60, -3, 39, -26, 67, -77, -114, 51, -56, -99, -71, -94, 114, -63, -114, 47, -80, 55, -84, Ascii.DC2, 110, -16, -55, -58};
        a(bArr, new byte[]{-80, 125, Ascii.NAK, -101, 38, -113, 85, -110, 82, -107, 2, -61, -2, 122, -90, -5, -42, -118, 2, -96, -19, 68, -47, 80, -55, 91, 0, -106, -90, -5});
        Charset charset = StandardCharsets.UTF_8;
        String strIntern = new String(bArr, charset).intern();
        byte[] bArr2 = {-40, -74, 107, 73, 123, -24, -119, -121, 7, Ascii.FS};
        a(bArr2, new byte[]{-12, -106, Ascii.EM, 44, Ascii.SUB, -101, -26, -23, 116, Framer.ENTER_FRAME_PREFIX});
        String strIntern2 = new String(bArr2, charset).intern();
        byte[] bArr3 = {Ascii.SI, Framer.ENTER_FRAME_PREFIX, -5, 73, -105, -90, -117, Framer.STDIN_REQUEST_FRAME_PREFIX, -127, 9, -25, 125, 51, -24};
        a(bArr3, new byte[]{35, 1, -117, 44, -27, -53, -30, 44, -14, 96, -120, 19, SignedBytes.MAX_POWER_OF_TWO, -43});
        String strIntern3 = new String(bArr3, charset).intern();
        byte[] bArr4 = {-10};
        a(bArr4, new byte[]{-33, 107, Base64.padSymbol, 93, 91, -93, -117, -45});
        return strIntern + packageInfo + strIntern2 + set + strIntern3 + set2 + new String(bArr4, charset).intern();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = {-41, -79, -13, -103};
        a(bArr, new byte[]{-77, -44, -128, -19, 51, -47, -78, -83});
        Intrinsics.checkNotNullParameter(parcel, new String(bArr, StandardCharsets.UTF_8).intern());
        parcel.writeParcelable(this.f323a, i);
        Set<String> set = this.b;
        parcel.writeInt(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next());
        }
        Set<String> set2 = this.c;
        if (set2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(set2.size());
        Iterator<String> it2 = set2.iterator();
        while (it2.hasNext()) {
            parcel.writeString(it2.next());
        }
    }
}
