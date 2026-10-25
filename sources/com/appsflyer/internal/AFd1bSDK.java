package com.appsflyer.internal;

import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class AFd1bSDK implements AFe1ySDK<AFi1wSDK> {
    @Override // com.appsflyer.internal.AFe1ySDK
    public final /* synthetic */ AFi1wSDK getMonetizationNetwork(String str) throws JSONException {
        return new AFi1wSDK(str);
    }
}
