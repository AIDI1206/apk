package com.medicmedia.medilink.core.network.cookie;

import android.webkit.CookieManager;
import android.webkit.WebStorage;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class AppCookieClient_Factory implements Factory<AppCookieClient> {
    private final Provider<CookieManager> cookieManagerProvider;
    private final Provider<WebStorage> webStorageProvider;

    public AppCookieClient_Factory(Provider<CookieManager> provider, Provider<WebStorage> provider2) {
        this.cookieManagerProvider = provider;
        this.webStorageProvider = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AppCookieClient get() {
        return newInstance(this.cookieManagerProvider.get(), this.webStorageProvider.get());
    }

    public static AppCookieClient_Factory create(Provider<CookieManager> provider, Provider<WebStorage> provider2) {
        return new AppCookieClient_Factory(provider, provider2);
    }

    public static AppCookieClient newInstance(CookieManager cookieManager, WebStorage webStorage) {
        return new AppCookieClient(cookieManager, webStorage);
    }
}
