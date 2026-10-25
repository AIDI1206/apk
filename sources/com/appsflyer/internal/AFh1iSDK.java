package com.appsflyer.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class AFh1iSDK extends AFh1rSDK {
    @Override // com.appsflyer.internal.AFh1rSDK
    public final boolean areAllFieldsValid() {
        return true;
    }

    @Override // com.appsflyer.internal.AFh1rSDK
    public final AFe1mSDK getCurrencyIso4217Code() {
        if (this.component2 == 1) {
            return AFe1mSDK.CONVERSION;
        }
        return AFe1mSDK.LAUNCH;
    }
}
