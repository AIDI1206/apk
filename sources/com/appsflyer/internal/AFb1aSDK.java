package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFb1aSDK implements AFb1bSDK {
    private AFb1lSDK AFAdRevenueData;
    private final ScheduledExecutorService getCurrencyIso4217Code;
    private final AFa1oSDK getMediationNetwork;
    private final AFi1kSDK getMonetizationNetwork;
    private final Executor getRevenue;

    public AFb1aSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFa1oSDK aFa1oSDK, AFi1kSDK aFi1kSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        this.getRevenue = executor;
        this.getCurrencyIso4217Code = scheduledExecutorService;
        this.getMediationNetwork = aFa1oSDK;
        this.getMonetizationNetwork = aFi1kSDK;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFAdRevenueData(Context context, AFb1bSDK.AFa1zSDK aFa1zSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.AFAdRevenueData != null) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "");
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
        this.AFAdRevenueData = null;
        AFb1lSDK aFb1lSDK = new AFb1lSDK(this.getRevenue, this.getCurrencyIso4217Code, this.getMediationNetwork, this.getMonetizationNetwork, aFa1zSDK);
        this.AFAdRevenueData = aFb1lSDK;
        if (context instanceof Activity) {
            aFb1lSDK.onActivityResumed((Activity) context);
        }
        Application applicationO_ = AFj1iSDK.O_(context);
        if (applicationO_ != null) {
            applicationO_.registerActivityLifecycleCallbacks(this.AFAdRevenueData);
        }
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final boolean getCurrencyIso4217Code() {
        return this.AFAdRevenueData != null;
    }

    @Override // com.appsflyer.internal.AFb1bSDK
    public final void AFAdRevenueData() {
        AFb1bSDK.AFa1zSDK aFa1zSDK;
        AFb1lSDK aFb1lSDK = this.AFAdRevenueData;
        if (aFb1lSDK == null || (aFa1zSDK = aFb1lSDK.getCurrencyIso4217Code) == null) {
            return;
        }
        aFa1zSDK.getCurrencyIso4217Code();
    }
}
