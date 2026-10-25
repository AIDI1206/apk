package com.appsflyer.internal;

import com.appsflyer.AFAdRevenueData;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AFh1lSDK extends AFh1rSDK {
    public final Map<String, Object> copy;
    public final AFAdRevenueData equals;

    public AFh1lSDK(AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.equals = aFAdRevenueData;
        this.copy = map;
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final AFe1mSDK getCurrencyIso4217Code() {
        return AFe1mSDK.ADREVENUE;
    }
}
