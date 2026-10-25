package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class AFb1lSDK implements Application.ActivityLifecycleCallbacks {
    private final Executor AFAdRevenueData;
    private boolean component1;
    private boolean component3;
    final AFb1bSDK.AFa1zSDK getCurrencyIso4217Code;
    private final AFi1kSDK getMediationNetwork;
    private final ScheduledExecutorService getMonetizationNetwork;
    private final AFa1oSDK getRevenue;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public AFb1lSDK(Executor executor, ScheduledExecutorService scheduledExecutorService, AFa1oSDK aFa1oSDK, AFi1kSDK aFi1kSDK, AFb1bSDK.AFa1zSDK aFa1zSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1oSDK, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        Intrinsics.checkNotNullParameter(aFa1zSDK, "");
        this.AFAdRevenueData = executor;
        this.getMonetizationNetwork = scheduledExecutorService;
        this.getRevenue = aFa1oSDK;
        this.getMediationNetwork = aFi1kSDK;
        this.getCurrencyIso4217Code = aFa1zSDK;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        final AFh1qSDK aFh1qSDK = new AFh1qSDK(activity, this.getMediationNetwork);
        this.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1lSDK$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AFb1lSDK.getCurrencyIso4217Code(this.f$0, aFh1qSDK);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFb1lSDK aFb1lSDK, AFh1qSDK aFh1qSDK) {
        Intrinsics.checkNotNullParameter(aFb1lSDK, "");
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        if (!aFb1lSDK.component1) {
            try {
                aFb1lSDK.getCurrencyIso4217Code.getRevenue(aFh1qSDK);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
            }
        }
        aFb1lSDK.component3 = false;
        aFb1lSDK.component1 = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AFAdRevenueData.execute(new Runnable() { // from class: com.appsflyer.internal.AFb1lSDK$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AFb1lSDK.getRevenue(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getRevenue(final AFb1lSDK aFb1lSDK) {
        Intrinsics.checkNotNullParameter(aFb1lSDK, "");
        aFb1lSDK.component3 = true;
        try {
            ScheduledExecutorService scheduledExecutorService = aFb1lSDK.getMonetizationNetwork;
            Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.AFb1lSDK$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    AFb1lSDK.AFAdRevenueData(this.f$0);
                }
            };
            AFb1bSDK.Companion companion = AFb1bSDK.INSTANCE;
            scheduledExecutorService.schedule(runnable, AFb1bSDK.Companion.getRevenue(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFAdRevenueData(AFb1lSDK aFb1lSDK) {
        Intrinsics.checkNotNullParameter(aFb1lSDK, "");
        if (aFb1lSDK.component1 && aFb1lSDK.component3) {
            aFb1lSDK.component1 = false;
            try {
                aFb1lSDK.getCurrencyIso4217Code.getCurrencyIso4217Code();
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFa1oSDK aFa1oSDK = this.getRevenue;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1oSDK.AFAdRevenueData) {
            aFa1oSDK.AFAdRevenueData = intent;
        }
        this.getMediationNetwork.getMediationNetwork(activity);
    }
}
