package com.medicmedia.medilink.analytics.di;

import android.content.Context;
import com.medicmedia.medilink.analytics.CrashAnalyticsClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class AnalyticsModule_ProvideCrashAnalyticsFactory implements Factory<CrashAnalyticsClient> {
    private final Provider<Context> contextProvider;

    public AnalyticsModule_ProvideCrashAnalyticsFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CrashAnalyticsClient get() {
        return provideCrashAnalytics(this.contextProvider.get());
    }

    public static AnalyticsModule_ProvideCrashAnalyticsFactory create(Provider<Context> provider) {
        return new AnalyticsModule_ProvideCrashAnalyticsFactory(provider);
    }

    public static CrashAnalyticsClient provideCrashAnalytics(Context context) {
        return (CrashAnalyticsClient) Preconditions.checkNotNullFromProvides(AnalyticsModule.INSTANCE.provideCrashAnalytics(context));
    }
}
