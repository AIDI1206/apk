package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFb1gSDK {
    public final int AFAdRevenueData;
    public final String getMonetizationNetwork;

    public AFb1gSDK(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFAdRevenueData = i;
        this.getMonetizationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFb1gSDK)) {
            return false;
        }
        AFb1gSDK aFb1gSDK = (AFb1gSDK) obj;
        return this.AFAdRevenueData == aFb1gSDK.AFAdRevenueData && Intrinsics.areEqual(this.getMonetizationNetwork, aFb1gSDK.getMonetizationNetwork);
    }

    public final int hashCode() {
        return (Integer.hashCode(this.AFAdRevenueData) * 31) + this.getMonetizationNetwork.hashCode();
    }

    public final String toString() {
        return "AppSetIdModel(scope=" + this.AFAdRevenueData + ", id=" + this.getMonetizationNetwork + ")";
    }
}
