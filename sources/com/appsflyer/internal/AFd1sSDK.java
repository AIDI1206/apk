package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFd1sSDK {
    public static boolean getMediationNetwork(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int monetizationNetwork = AFj1aSDK.getMonetizationNetwork(str);
        int monetizationNetwork2 = AFj1aSDK.getMonetizationNetwork(str2);
        Pair<Integer, Integer> revenue = AFd1rSDK.getRevenue(str2);
        Pair<Integer, Integer> mediationNetwork = AFd1rSDK.getMediationNetwork(str2);
        if (monetizationNetwork2 != -1 && revenue == null) {
            return monetizationNetwork2 == monetizationNetwork;
        }
        if (mediationNetwork != null) {
            return mediationNetwork.getFirst().intValue() <= monetizationNetwork && monetizationNetwork <= mediationNetwork.getSecond().intValue();
        }
        return revenue != null && revenue.getFirst().intValue() <= monetizationNetwork && monetizationNetwork <= revenue.getSecond().intValue();
    }
}
