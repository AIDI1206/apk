package com.appsflyer.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AFd1ySDK implements AFd1xSDK {
    private final AFc1aSDK getRevenue;

    public AFd1ySDK(AFc1aSDK aFc1aSDK) {
        Intrinsics.checkNotNullParameter(aFc1aSDK, "");
        this.getRevenue = aFc1aSDK;
    }

    @Override // com.appsflyer.internal.AFd1xSDK
    public final void getMediationNetwork(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFd1wSDK(bArr, map, 2000).getMonetizationNetwork()) {
            this.getRevenue.getMonetizationNetwork();
        }
    }
}
