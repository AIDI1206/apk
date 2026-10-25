package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public interface AFc1dSDK {
    ScheduledExecutorService AFAdRevenueData();

    AFc1vSDK AFInAppEventParameterName();

    AFc1iSDK AFInAppEventType();

    AFe1zSDK AFKeystoreWrapper();

    AFj1sSDK AFLogger();

    AFb1bSDK afDebugLog();

    AFf1dSDK afErrorLog();

    AFh1uSDK afErrorLogForExcManagerOnly();

    AFc1kSDK afInfoLog();

    AFd1vSDK afRDLog();

    AFa1gSDK afVerboseLog();

    AFb1hSDK afWarnLog();

    AFh1vSDK areAllFieldsValid();

    AFf1oSDK component1();

    AFc1qSDK component2();

    AFg1qSDK component3();

    PurchaseHandler component4();

    AFd1pSDK copy();

    AFe1lSDK copydefault();

    AFa1oSDK d();

    AFa1aSDK e();

    AFj1lSDK equals();

    AFi1fSDK force();

    AFd1oSDK getCurrencyIso4217Code();

    AFe1uSDK getMediationNetwork();

    ExecutorService getMonetizationNetwork();

    AFc1pSDK getRevenue();

    AFi1tSDK i();

    AFf1gSDK registerClient();

    AFi1lSDK unregisterClient();

    AFg1bSDK v();

    AFi1kSDK w();
}
