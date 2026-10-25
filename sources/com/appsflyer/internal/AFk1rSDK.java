package com.appsflyer.internal;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class AFk1rSDK {
    public final WeakReference<Context> AFAdRevenueData;
    public String getMonetizationNetwork;

    public AFk1rSDK(Context context) {
        this.AFAdRevenueData = new WeakReference<>(context);
    }
}
