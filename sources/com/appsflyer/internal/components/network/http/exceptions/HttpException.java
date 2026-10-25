package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFd1hSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class HttpException extends IOException {
    private final AFd1hSDK getRevenue;

    public HttpException(Throwable th, AFd1hSDK aFd1hSDK) {
        super(th.getMessage(), th);
        this.getRevenue = aFd1hSDK;
    }

    public AFd1hSDK getMetrics() {
        return this.getRevenue;
    }
}
