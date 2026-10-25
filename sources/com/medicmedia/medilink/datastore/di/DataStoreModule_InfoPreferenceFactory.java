package com.medicmedia.medilink.datastore.di;

import android.content.Context;
import android.content.SharedPreferences;
import com.medicmedia.medilink.datastore.preferences.InfoDataStore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class DataStoreModule_InfoPreferenceFactory implements Factory<InfoDataStore> {
    private final Provider<Context> contextProvider;
    private final Provider<SharedPreferences> preferencesProvider;

    public DataStoreModule_InfoPreferenceFactory(Provider<Context> provider, Provider<SharedPreferences> provider2) {
        this.contextProvider = provider;
        this.preferencesProvider = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public InfoDataStore get() {
        return infoPreference(this.contextProvider.get(), this.preferencesProvider.get());
    }

    public static DataStoreModule_InfoPreferenceFactory create(Provider<Context> provider, Provider<SharedPreferences> provider2) {
        return new DataStoreModule_InfoPreferenceFactory(provider, provider2);
    }

    public static InfoDataStore infoPreference(Context context, SharedPreferences sharedPreferences) {
        return (InfoDataStore) Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.infoPreference(context, sharedPreferences));
    }
}
