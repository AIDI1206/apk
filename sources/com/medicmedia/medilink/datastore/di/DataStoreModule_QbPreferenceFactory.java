package com.medicmedia.medilink.datastore.di;

import android.content.SharedPreferences;
import com.medicmedia.medilink.datastore.preferences.QBDataStore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class DataStoreModule_QbPreferenceFactory implements Factory<QBDataStore> {
    private final Provider<SharedPreferences> preferencesProvider;

    public DataStoreModule_QbPreferenceFactory(Provider<SharedPreferences> provider) {
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public QBDataStore get() {
        return qbPreference(this.preferencesProvider.get());
    }

    public static DataStoreModule_QbPreferenceFactory create(Provider<SharedPreferences> provider) {
        return new DataStoreModule_QbPreferenceFactory(provider);
    }

    public static QBDataStore qbPreference(SharedPreferences sharedPreferences) {
        return (QBDataStore) Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.qbPreference(sharedPreferences));
    }
}
