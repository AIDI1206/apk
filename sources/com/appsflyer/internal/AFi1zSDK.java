package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

/* JADX INFO: loaded from: classes3.dex */
public final class AFi1zSDK extends AFh1hSDK {
    public AFi1zSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final AFe1mSDK getCurrencyIso4217Code() {
        return AFe1mSDK.PURCHASE_VALIDATE;
    }
}
