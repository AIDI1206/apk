package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFf1aSDK {
    public final long AFAdRevenueData;
    public final boolean getMediationNetwork;
    public final String getRevenue;

    public AFf1aSDK(String str, long j, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue = str;
        this.AFAdRevenueData = j;
        this.getMediationNetwork = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1aSDK)) {
            return false;
        }
        AFf1aSDK aFf1aSDK = (AFf1aSDK) obj;
        return Intrinsics.areEqual(this.getRevenue, aFf1aSDK.getRevenue) && this.AFAdRevenueData == aFf1aSDK.AFAdRevenueData && this.getMediationNetwork == aFf1aSDK.getMediationNetwork;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        int iHashCode = ((this.getRevenue.hashCode() * 31) + Long.hashCode(this.AFAdRevenueData)) * 31;
        boolean z = this.getMediationNetwork;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        return "AFUninstallToken(token=" + this.getRevenue + ", receivedTime=" + this.AFAdRevenueData + ", isQueued=" + this.getMediationNetwork + ")";
    }
}
