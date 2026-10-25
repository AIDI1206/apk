package com.medicmedia.medilink.analytics.di;

import android.content.Context;
import com.medicmedia.medilink.analytics.AnalyticsClient;
import com.medicmedia.medilink.analytics.CrashAnalyticsClient;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class AnalyticsModule_ProvideAnalyticsFactory implements Factory<AnalyticsClient> {
    private final Provider<Context> contextProvider;
    private final Provider<CrashAnalyticsClient> crashAnalyticsClientProvider;
    private final Provider<LoginDataStore> loginDataStoreProvider;

    public AnalyticsModule_ProvideAnalyticsFactory(Provider<Context> provider, Provider<CrashAnalyticsClient> provider2, Provider<LoginDataStore> provider3) {
        this.contextProvider = provider;
        this.crashAnalyticsClientProvider = provider2;
        this.loginDataStoreProvider = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AnalyticsClient get() {
        return provideAnalytics(this.contextProvider.get(), this.crashAnalyticsClientProvider.get(), this.loginDataStoreProvider.get());
    }

    public static AnalyticsModule_ProvideAnalyticsFactory create(Provider<Context> provider, Provider<CrashAnalyticsClient> provider2, Provider<LoginDataStore> provider3) {
        return new AnalyticsModule_ProvideAnalyticsFactory(provider, provider2, provider3);
    }

    public static AnalyticsClient provideAnalytics(Context context, CrashAnalyticsClient crashAnalyticsClient, LoginDataStore loginDataStore) {
        return (AnalyticsClient) Preconditions.checkNotNullFromProvides(AnalyticsModule.INSTANCE.provideAnalytics(context, crashAnalyticsClient, loginDataStore));
    }
}
