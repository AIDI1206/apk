package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFd1aSDK;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ParsingException extends IOException {
    private final AFd1aSDK<String> getMonetizationNetwork;

    public ParsingException(String str, Throwable th, AFd1aSDK<String> aFd1aSDK) {
        super(str, th);
        this.getMonetizationNetwork = aFd1aSDK;
    }

    public AFd1aSDK<String> getRawResponse() {
        return this.getMonetizationNetwork;
    }
}
