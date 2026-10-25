package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface AFg1qSDK {
    long AFAdRevenueData();

    void AFAdRevenueData(AFh1rSDK aFh1rSDK);

    void AFAdRevenueData(Map<String, Object> map);

    Long getCurrencyIso4217Code();

    void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK);

    void getCurrencyIso4217Code(Map<String, Object> map);

    void getMediationNetwork(AFh1rSDK aFh1rSDK);

    void getMonetizationNetwork(AFh1rSDK aFh1rSDK);

    void getRevenue(AFh1rSDK aFh1rSDK);

    void getRevenue(Map<String, Object> map);

    void getRevenue(Map<String, Object> map, int i, int i2);
}
