package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFc1uSDK {
    final int AFAdRevenueData;
    final String getCurrencyIso4217Code;
    final List<AFe1mSDK> getRevenue;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1uSDK(String str, List<? extends AFe1mSDK> list, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.getCurrencyIso4217Code = str;
        this.getRevenue = list;
        this.AFAdRevenueData = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1uSDK)) {
            return false;
        }
        AFc1uSDK aFc1uSDK = (AFc1uSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFc1uSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.getRevenue, aFc1uSDK.getRevenue) && this.AFAdRevenueData == aFc1uSDK.AFAdRevenueData;
    }

    public final int hashCode() {
        return (((this.getCurrencyIso4217Code.hashCode() * 31) + this.getRevenue.hashCode()) * 31) + Integer.hashCode(this.AFAdRevenueData);
    }

    public final String toString() {
        return "StorageConfigTypeEntry(cacheDirName=" + this.getCurrencyIso4217Code + ", eventTypes=" + this.getRevenue + ", maxCapacity=" + this.AFAdRevenueData + ")";
    }
}
