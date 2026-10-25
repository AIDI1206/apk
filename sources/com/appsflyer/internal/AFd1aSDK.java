package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AFd1aSDK<Body> implements ResponseNetwork<Body> {
    final boolean AFAdRevenueData;
    final Map<String, List<String>> getCurrencyIso4217Code;
    final int getMediationNetwork;
    private final Body getMonetizationNetwork;
    public final AFd1hSDK getRevenue;

    public AFd1aSDK(Body body, int i, boolean z, Map<String, List<String>> map, AFd1hSDK aFd1hSDK) {
        this.getMonetizationNetwork = body;
        this.getMediationNetwork = i;
        this.AFAdRevenueData = z;
        this.getCurrencyIso4217Code = new HashMap(map);
        this.getRevenue = aFd1hSDK;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public Body getBody() {
        return this.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public int getStatusCode() {
        return this.getMediationNetwork;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public boolean isSuccessful() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.components.network.http.ResponseNetwork
    public List<String> getHeaderField(String str) {
        for (String str2 : this.getCurrencyIso4217Code.keySet()) {
            if (str2 != null && str2.equalsIgnoreCase(str)) {
                return this.getCurrencyIso4217Code.get(str2);
            }
        }
        return null;
    }

    public final String getCurrencyIso4217Code(String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb.append(", ").append(it.next());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1aSDK aFd1aSDK = (AFd1aSDK) obj;
        if (this.getMediationNetwork == aFd1aSDK.getMediationNetwork && this.AFAdRevenueData == aFd1aSDK.AFAdRevenueData && this.getMonetizationNetwork.equals(aFd1aSDK.getMonetizationNetwork) && this.getCurrencyIso4217Code.equals(aFd1aSDK.getCurrencyIso4217Code)) {
            return this.getRevenue.equals(aFd1aSDK.getRevenue);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.getMonetizationNetwork.hashCode() * 31) + this.getMediationNetwork) * 31) + (this.AFAdRevenueData ? 1 : 0)) * 31) + this.getCurrencyIso4217Code.hashCode()) * 31) + this.getRevenue.hashCode();
    }
}
