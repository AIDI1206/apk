package com.appsflyer.internal;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes3.dex */
public interface AFd1pSDK {
    void AFAdRevenueData();

    boolean component4();

    void getCurrencyIso4217Code();

    void getCurrencyIso4217Code(String str, String str2);

    void getMediationNetwork();

    void getMediationNetwork(String str, String... strArr);

    void getMonetizationNetwork(String str, String str2);

    void getMonetizationNetwork(Throwable th);

    boolean getMonetizationNetwork();

    void getRevenue();

    void getRevenue(String str, int i, String str2);

    void o_(String str, PackageManager packageManager);
}
