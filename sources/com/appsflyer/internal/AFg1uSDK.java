package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public interface AFg1uSDK {
    AFa1uSDK getRevenue(Context context);

    public static final class AFa1uSDK {
        final String getMediationNetwork;
        final float getRevenue;

        public AFa1uSDK(float f, String str) {
            this.getRevenue = f;
            this.getMediationNetwork = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Float.compare(this.getRevenue, aFa1uSDK.getRevenue) == 0 && Intrinsics.areEqual(this.getMediationNetwork, aFa1uSDK.getMediationNetwork);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.getRevenue) * 31;
            String str = this.getMediationNetwork;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "BatteryData(level=" + this.getRevenue + ", charging=" + this.getMediationNetwork + ")";
        }
    }
}
