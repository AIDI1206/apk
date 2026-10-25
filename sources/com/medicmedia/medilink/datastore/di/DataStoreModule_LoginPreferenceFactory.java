package com.medicmedia.medilink.datastore.di;

import android.content.Context;
import android.content.SharedPreferences;
import com.medicmedia.medilink.datastore.model.CryptoClient;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class DataStoreModule_LoginPreferenceFactory implements Factory<LoginDataStore> {
    private final Provider<Context> contextProvider;
    private final Provider<CryptoClient> cryptoClientProvider;
    private final Provider<SharedPreferences> preferencesProvider;

    public DataStoreModule_LoginPreferenceFactory(Provider<Context> provider, Provider<SharedPreferences> provider2, Provider<CryptoClient> provider3) {
        this.contextProvider = provider;
        this.preferencesProvider = provider2;
        this.cryptoClientProvider = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LoginDataStore get() {
        return loginPreference(this.contextProvider.get(), this.preferencesProvider.get(), this.cryptoClientProvider.get());
    }

    public static DataStoreModule_LoginPreferenceFactory create(Provider<Context> provider, Provider<SharedPreferences> provider2, Provider<CryptoClient> provider3) {
        return new DataStoreModule_LoginPreferenceFactory(provider, provider2, provider3);
    }

    public static LoginDataStore loginPreference(Context context, SharedPreferences sharedPreferences, CryptoClient cryptoClient) {
        return (LoginDataStore) Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.loginPreference(context, sharedPreferences, cryptoClient));
    }
}
