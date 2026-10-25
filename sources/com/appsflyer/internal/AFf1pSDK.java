package com.appsflyer.internal;

import android.text.TextUtils;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1pSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFAdRevenueData = 0;
    private static int getCurrencyIso4217Code = 1;
    private static int[] getMediationNetwork;

    /* JADX WARN: Code duplicated, block: B:10:0x0019 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    public final AFi1uSDK getRevenue(AFi1wSDK aFi1wSDK, String str, String str2, String str3) {
        int i;
        int i2 = 2 % 2;
        if (aFi1wSDK != null) {
            int i3 = AFAdRevenueData;
            int i4 = i3 + 29;
            getCurrencyIso4217Code = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 9 / 0;
                if (str2 != null) {
                    if (str3 != null) {
                        int i6 = i3 + 67;
                        getCurrencyIso4217Code = i6 % 128;
                        int i7 = i6 % 2;
                        AFi1uSDK mediationNetwork = getMediationNetwork(aFi1wSDK, str, str2, str3);
                        i = getCurrencyIso4217Code + 51;
                        AFAdRevenueData = i % 128;
                        if (i % 2 != 0) {
                            int i8 = 27 / 0;
                        }
                        return mediationNetwork;
                    }
                }
            } else if (str2 != null) {
                if (str3 != null) {
                    int i9 = i3 + 67;
                    getCurrencyIso4217Code = i9 % 128;
                    int i10 = i9 % 2;
                    AFi1uSDK mediationNetwork2 = getMediationNetwork(aFi1wSDK, str, str2, str3);
                    i = getCurrencyIso4217Code + 51;
                    AFAdRevenueData = i % 128;
                    if (i % 2 != 0) {
                        int i11 = 27 / 0;
                    }
                    return mediationNetwork2;
                }
            }
        }
        int i12 = AFAdRevenueData + 21;
        getCurrencyIso4217Code = i12 % 128;
        int i13 = i12 % 2;
        return new AFi1uSDK(false, AFi1ySDK.INTERNAL_ERROR);
    }

    private static AFi1uSDK getMediationNetwork(AFi1wSDK aFi1wSDK, String str, String str2, String str3) {
        String string;
        if (str == null) {
            return new AFi1uSDK(aFi1wSDK.AFAdRevenueData == AFh1aSDK.DEFAULT, AFi1ySDK.NA);
        }
        Object[] objArr = new Object[1];
        a(new int[]{-643013363, -1773125790, -901337036, 656549561, -1731661770, 1258424067, -1532942264, 934407696, -1450123275, -1059473533, 82834636, 73705576, -1221507016, 1763733418, -1711569501, 1840946075, -1493249449, -1523654642, 594617170, -836811800, 1195240337, 1166309858, 1004762227, 96245697, 395058159, 64877192, 56299164, -104828535, -4786395, 2101942765, -285338731, 1554123850}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 64, objArr);
        String strIntern = ((String) objArr[0]).intern();
        if (aFi1wSDK.AFAdRevenueData != AFh1aSDK.CUSTOM) {
            string = "";
            str3 = strIntern;
        } else {
            string = new StringBuilder(str2).reverse().toString();
        }
        boolean zEquals = AFAdRevenueData(new StringBuilder(str3).reverse().toString(), aFi1wSDK.getCurrencyIso4217Code, "android", "v1", string).equals(str);
        return new AFi1uSDK(zEquals, zEquals ? AFi1ySDK.SUCCESS : AFi1ySDK.FAILURE);
    }

    private static String AFAdRevenueData(String str, String str2, String str3, String str4, String str5) {
        String revenue;
        int i = 2 % 2;
        int i2 = AFAdRevenueData + 85;
        getCurrencyIso4217Code = i2 % 128;
        if (i2 % 2 == 0) {
            String[] strArr = new String[2];
            strArr[0] = str2;
            strArr[1] = str3;
            strArr[5] = str4;
            strArr[5] = str5;
            strArr[4] = "";
            revenue = AFj1cSDK.getRevenue(TextUtils.join("\u2063", strArr), str);
            if (revenue.length() < 63) {
                return revenue;
            }
        } else {
            revenue = AFj1cSDK.getRevenue(TextUtils.join("\u2063", new String[]{str2, str3, str4, str5, ""}), str);
            if (revenue.length() < 12) {
                return revenue;
            }
        }
        String strSubstring = revenue.substring(0, 12);
        int i3 = AFAdRevenueData + 47;
        getCurrencyIso4217Code = i3 % 128;
        if (i3 % 2 != 0) {
            return strSubstring;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getMediationNetwork;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i3 = $11 + 59;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 39;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    iArr3[i5] = (int) (((long) iArr2[i5]) * 3670241895213185600L);
                    i5 %= 1;
                } else {
                    iArr3[i5] = (int) (((long) iArr2[i5]) ^ 3670241895213185600L);
                    i5++;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getMediationNetwork;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i7 = 0; i7 < length3; i7++) {
                int i8 = $10 + 79;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                iArr6[i7] = (int) (((long) iArr5[i7]) ^ 3670241895213185600L);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1kSDK.getCurrencyIso4217Code = 0;
        while (aFk1kSDK.getCurrencyIso4217Code < iArr.length) {
            int i10 = $10 + 51;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[aFk1kSDK.getCurrencyIso4217Code] >> 16);
            cArr[1] = (char) iArr[aFk1kSDK.getCurrencyIso4217Code];
            cArr[2] = (char) (iArr[aFk1kSDK.getCurrencyIso4217Code + 1] >> 16);
            cArr[3] = (char) iArr[aFk1kSDK.getCurrencyIso4217Code + 1];
            aFk1kSDK.AFAdRevenueData = (cArr[0] << 16) + cArr[1];
            aFk1kSDK.getMonetizationNetwork = (cArr[2] << 16) + cArr[3];
            AFk1kSDK.getMediationNetwork(iArr4);
            for (int i12 = 0; i12 < 16; i12++) {
                int i13 = $11 + 9;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                aFk1kSDK.AFAdRevenueData ^= iArr4[i12];
                aFk1kSDK.getMonetizationNetwork = AFk1kSDK.AFAdRevenueData(aFk1kSDK.AFAdRevenueData) ^ aFk1kSDK.getMonetizationNetwork;
                int i15 = aFk1kSDK.AFAdRevenueData;
                aFk1kSDK.AFAdRevenueData = aFk1kSDK.getMonetizationNetwork;
                aFk1kSDK.getMonetizationNetwork = i15;
            }
            int i16 = aFk1kSDK.AFAdRevenueData;
            aFk1kSDK.AFAdRevenueData = aFk1kSDK.getMonetizationNetwork;
            aFk1kSDK.getMonetizationNetwork = i16;
            aFk1kSDK.getMonetizationNetwork ^= iArr4[16];
            aFk1kSDK.AFAdRevenueData ^= iArr4[17];
            int i17 = aFk1kSDK.AFAdRevenueData;
            int i18 = aFk1kSDK.getMonetizationNetwork;
            cArr[0] = (char) (aFk1kSDK.AFAdRevenueData >>> 16);
            cArr[1] = (char) aFk1kSDK.AFAdRevenueData;
            cArr[2] = (char) (aFk1kSDK.getMonetizationNetwork >>> 16);
            cArr[3] = (char) aFk1kSDK.getMonetizationNetwork;
            AFk1kSDK.getMediationNetwork(iArr4);
            cArr2[aFk1kSDK.getCurrencyIso4217Code * 2] = cArr[0];
            cArr2[(aFk1kSDK.getCurrencyIso4217Code * 2) + 1] = cArr[1];
            cArr2[(aFk1kSDK.getCurrencyIso4217Code * 2) + 2] = cArr[2];
            cArr2[(aFk1kSDK.getCurrencyIso4217Code * 2) + 3] = cArr[3];
            aFk1kSDK.getCurrencyIso4217Code += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static void getMediationNetwork() {
        getMediationNetwork = new int[]{-1667361725, -1699441632, 432593808, 251732126, -1427520749, -699397331, 585070146, 1483439762, 1609066215, 453290560, -192666392, -1278453714, -213940739, 2102241028, -1309214613, 1294459639, 1092066826, -1216170440};
    }

    static {
        getMediationNetwork();
        ViewConfiguration.getLongPressTimeout();
        int i = getCurrencyIso4217Code + 3;
        AFAdRevenueData = i % 128;
        if (i % 2 != 0) {
            int i2 = 75 / 0;
        }
    }
}
