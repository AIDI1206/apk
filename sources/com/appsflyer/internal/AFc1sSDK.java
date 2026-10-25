package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFc1sSDK {
    final List<AFc1uSDK> AFAdRevenueData;

    public AFc1sSDK(List<AFc1uSDK> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AFAdRevenueData = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AFc1sSDK) && Intrinsics.areEqual(this.AFAdRevenueData, ((AFc1sSDK) obj).AFAdRevenueData);
    }

    public final int hashCode() {
        return this.AFAdRevenueData.hashCode();
    }

    public final String toString() {
        return "StorageConfig(typeEntries=" + this.AFAdRevenueData + ")";
    }
}
