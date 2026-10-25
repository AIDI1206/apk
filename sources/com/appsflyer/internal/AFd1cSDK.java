package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class AFd1cSDK {
    final Map<String, String> AFAdRevenueData;
    private final byte[] areAllFieldsValid;
    private boolean component1;
    private final boolean component2;
    private final boolean component3;
    public int component4;
    public boolean getCurrencyIso4217Code;
    public boolean getMediationNetwork;
    public final String getMonetizationNetwork;
    final String getRevenue;

    public AFd1cSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z) {
        this(str, bArr, str2, map, z, (byte) 0);
    }

    private AFd1cSDK(String str, byte[] bArr, String str2, Map<String, String> map, boolean z, byte b) {
        this.component1 = true;
        this.getMediationNetwork = false;
        this.getCurrencyIso4217Code = true;
        this.component4 = -1;
        this.getMonetizationNetwork = str;
        this.areAllFieldsValid = bArr;
        this.getRevenue = str2;
        this.AFAdRevenueData = map;
        this.component2 = z;
        this.component3 = true;
    }

    public AFd1cSDK(String str, String str2) {
        this(str, null, str2, new HashMap(), false);
    }

    public final byte[] getRevenue() {
        return this.areAllFieldsValid;
    }

    public final boolean AFAdRevenueData() {
        return this.component2;
    }

    public final boolean getMediationNetwork() {
        return this.component1;
    }

    public final boolean getMonetizationNetwork() {
        return this.getMediationNetwork;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.component3;
    }

    public final boolean component3() {
        return this.getCurrencyIso4217Code;
    }
}
