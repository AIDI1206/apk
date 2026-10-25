package com.appsflyer.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class AFk1kSDK {
    public int AFAdRevenueData;
    public int getCurrencyIso4217Code;
    public int getMonetizationNetwork;

    public static void getMediationNetwork(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int AFAdRevenueData(int i) {
        AFk1sSDK aFk1sSDK = AFk1sSDK.getMediationNetwork;
        return ((aFk1sSDK.getRevenue[0][(i >>> 24) & 255] + aFk1sSDK.getRevenue[1][(i >>> 16) & 255]) ^ aFk1sSDK.getRevenue[2][(i >>> 8) & 255]) + aFk1sSDK.getRevenue[3][i & 255];
    }
}
