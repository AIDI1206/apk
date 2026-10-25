package com.medicmedia.medilink.analytics;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class FirebaseCrashlyticsClient_Factory implements Factory<FirebaseCrashlyticsClient> {
    private final Provider<FirebaseCrashlytics> firebaseCrashlyticsProvider;

    public FirebaseCrashlyticsClient_Factory(Provider<FirebaseCrashlytics> provider) {
        this.firebaseCrashlyticsProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public FirebaseCrashlyticsClient get() {
        return newInstance(this.firebaseCrashlyticsProvider.get());
    }

    public static FirebaseCrashlyticsClient_Factory create(Provider<FirebaseCrashlytics> provider) {
        return new FirebaseCrashlyticsClient_Factory(provider);
    }

    public static FirebaseCrashlyticsClient newInstance(FirebaseCrashlytics firebaseCrashlytics) {
        return new FirebaseCrashlyticsClient(firebaseCrashlytics);
    }
}
