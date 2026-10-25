package com.appsflyer.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AFh1nSDK extends AFh1rSDK {
    private final boolean copy;
    private final boolean copydefault;

    AFh1nSDK() {
        this(null, null, null);
    }

    protected AFh1nSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.copy = bool != null ? bool.booleanValue() : true;
        this.copydefault = true;
    }
}
