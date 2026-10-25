package com.medicmedia.medilink.datastore.preferences;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class QBPreferences_Factory implements Factory<QBPreferences> {
    private final Provider<SharedPreferences> qbPreferencesProvider;

    public QBPreferences_Factory(Provider<SharedPreferences> provider) {
        this.qbPreferencesProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public QBPreferences get() {
        return newInstance(this.qbPreferencesProvider.get());
    }

    public static QBPreferences_Factory create(Provider<SharedPreferences> provider) {
        return new QBPreferences_Factory(provider);
    }

    public static QBPreferences newInstance(SharedPreferences sharedPreferences) {
        return new QBPreferences(sharedPreferences);
    }
}
