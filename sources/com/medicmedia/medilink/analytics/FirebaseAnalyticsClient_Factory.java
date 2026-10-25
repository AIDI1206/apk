package com.medicmedia.medilink.analytics;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class FirebaseAnalyticsClient_Factory implements Factory<FirebaseAnalyticsClient> {
    private final Provider<CrashAnalyticsClient> crashAnalyticsClientProvider;
    private final Provider<FirebaseAnalytics> firebaseAnalyticsProvider;
    private final Provider<LoginDataStore> loginDataStoreProvider;

    public FirebaseAnalyticsClient_Factory(Provider<FirebaseAnalytics> provider, Provider<CrashAnalyticsClient> provider2, Provider<LoginDataStore> provider3) {
        this.firebaseAnalyticsProvider = provider;
        this.crashAnalyticsClientProvider = provider2;
        this.loginDataStoreProvider = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public FirebaseAnalyticsClient get() {
        return newInstance(this.firebaseAnalyticsProvider.get(), this.crashAnalyticsClientProvider.get(), this.loginDataStoreProvider.get());
    }

    public static FirebaseAnalyticsClient_Factory create(Provider<FirebaseAnalytics> provider, Provider<CrashAnalyticsClient> provider2, Provider<LoginDataStore> provider3) {
        return new FirebaseAnalyticsClient_Factory(provider, provider2, provider3);
    }

    public static FirebaseAnalyticsClient newInstance(FirebaseAnalytics firebaseAnalytics, CrashAnalyticsClient crashAnalyticsClient, LoginDataStore loginDataStore) {
        return new FirebaseAnalyticsClient(firebaseAnalytics, crashAnalyticsClient, loginDataStore);
    }
}
