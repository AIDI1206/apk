package com.appsflyer.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class AFg1kSDK {
    public static boolean getMediationNetwork(Context context) {
        return context.getPackageManager().isInstantApp();
    }
}
