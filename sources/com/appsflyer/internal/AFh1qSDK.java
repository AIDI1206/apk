package com.appsflyer.internal;

import android.app.Activity;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFh1qSDK {
    public final String getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final Intent getRevenue;

    public AFh1qSDK(Activity activity, AFi1kSDK aFi1kSDK) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(aFi1kSDK, "");
        this.getRevenue = activity.getIntent();
        this.getCurrencyIso4217Code = aFi1kSDK.getMonetizationNetwork(activity);
        this.getMediationNetwork = aFi1kSDK.getCurrencyIso4217Code(activity);
    }
}
