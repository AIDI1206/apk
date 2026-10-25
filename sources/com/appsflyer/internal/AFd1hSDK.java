package com.appsflyer.internal;

/* JADX INFO: loaded from: classes3.dex */
public class AFd1hSDK {
    public final long getRevenue;

    public AFd1hSDK(long j) {
        this.getRevenue = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.getRevenue == ((AFd1hSDK) obj).getRevenue;
    }

    public int hashCode() {
        long j = this.getRevenue;
        return (int) (j ^ (j >>> 32));
    }
}
