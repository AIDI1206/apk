package com.medicmedia.medilink.analytics;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class AppsFlyerTrackerImpl_Factory implements Factory<AppsFlyerTrackerImpl> {
    private final Provider<AppsFlyerLib> appsFlyerProvider;
    private final Provider<Context> contextProvider;

    public AppsFlyerTrackerImpl_Factory(Provider<Context> provider, Provider<AppsFlyerLib> provider2) {
        this.contextProvider = provider;
        this.appsFlyerProvider = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AppsFlyerTrackerImpl get() {
        return newInstance(this.contextProvider.get(), this.appsFlyerProvider.get());
    }

    public static AppsFlyerTrackerImpl_Factory create(Provider<Context> provider, Provider<AppsFlyerLib> provider2) {
        return new AppsFlyerTrackerImpl_Factory(provider, provider2);
    }

    public static AppsFlyerTrackerImpl newInstance(Context context, AppsFlyerLib appsFlyerLib) {
        return new AppsFlyerTrackerImpl(context, appsFlyerLib);
    }
}
