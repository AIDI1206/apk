package com.appsflyer.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface AFc1aSDK {
    String AFAdRevenueData(Throwable th, String str);

    void AFAdRevenueData(int i, int i2);

    int getCurrencyIso4217Code();

    List<AFc1cSDK> getMediationNetwork();

    boolean getMonetizationNetwork();

    boolean getRevenue(String... strArr);
}
