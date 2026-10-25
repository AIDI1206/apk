package com.medicmedia.medilink.analytics.di;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.medicmedia.medilink.analytics.AppsFlyerTracker;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class AnalyticsModule_ProvideAppsFlyerTrackerFactory implements Factory<AppsFlyerTracker> {
    private final Provider<AppsFlyerLib> appsFlyerLibProvider;
    private final Provider<Context> contextProvider;

    public AnalyticsModule_ProvideAppsFlyerTrackerFactory(Provider<Context> provider, Provider<AppsFlyerLib> provider2) {
        this.contextProvider = provider;
        this.appsFlyerLibProvider = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AppsFlyerTracker get() {
        return provideAppsFlyerTracker(this.contextProvider.get(), this.appsFlyerLibProvider.get());
    }

    public static AnalyticsModule_ProvideAppsFlyerTrackerFactory create(Provider<Context> provider, Provider<AppsFlyerLib> provider2) {
        return new AnalyticsModule_ProvideAppsFlyerTrackerFactory(provider, provider2);
    }

    public static AppsFlyerTracker provideAppsFlyerTracker(Context context, AppsFlyerLib appsFlyerLib) {
        return (AppsFlyerTracker) Preconditions.checkNotNullFromProvides(AnalyticsModule.INSTANCE.provideAppsFlyerTracker(context, appsFlyerLib));
    }
}
