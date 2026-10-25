package com.appsflyer.internal;

import android.content.Context;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AFj1qSDK extends Observable {
    public final String areAllFieldsValid;
    long component1;
    public final String component2;
    final Runnable getRevenue;
    public final Map<String, Object> AFAdRevenueData = new HashMap();
    public AFa1ySDK component4 = AFa1ySDK.NOT_STARTED;

    public enum AFa1ySDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public abstract void getRevenue(Context context);

    public AFj1qSDK(String str, String str2, Runnable runnable) {
        this.getRevenue = runnable;
        this.component2 = str2;
        this.areAllFieldsValid = str;
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFj1qSDK$5, reason: invalid class name */
    final class AnonymousClass5 implements Observer {
        AnonymousClass5() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFj1qSDK.this.getRevenue.run();
        }
    }

    public final void getMediationNetwork() {
        this.AFAdRevenueData.put("source", this.component2);
        this.AFAdRevenueData.put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, this.areAllFieldsValid);
        getMonetizationNetwork();
        this.component4 = AFa1ySDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    protected void getMonetizationNetwork() {
        this.AFAdRevenueData.put("latency", Long.valueOf(System.currentTimeMillis() - this.component1));
    }
}
