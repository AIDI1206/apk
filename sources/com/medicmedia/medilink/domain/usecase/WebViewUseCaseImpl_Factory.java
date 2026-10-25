package com.medicmedia.medilink.domain.usecase;

import com.medicmedia.medilink.core.network.cookie.AppCookie;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class WebViewUseCaseImpl_Factory implements Factory<WebViewUseCaseImpl> {
    private final Provider<AppCookie> appCookieProvider;
    private final Provider<LoginDataStore> loginDataStoreProvider;

    public WebViewUseCaseImpl_Factory(Provider<AppCookie> provider, Provider<LoginDataStore> provider2) {
        this.appCookieProvider = provider;
        this.loginDataStoreProvider = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public WebViewUseCaseImpl get() {
        return newInstance(this.appCookieProvider.get(), this.loginDataStoreProvider.get());
    }

    public static WebViewUseCaseImpl_Factory create(Provider<AppCookie> provider, Provider<LoginDataStore> provider2) {
        return new WebViewUseCaseImpl_Factory(provider, provider2);
    }

    public static WebViewUseCaseImpl newInstance(AppCookie appCookie, LoginDataStore loginDataStore) {
        return new WebViewUseCaseImpl(appCookie, loginDataStore);
    }
}
