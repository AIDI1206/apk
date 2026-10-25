package com.medicmedia.medilink.datastore.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import com.medicmedia.medilink.datastore.model.CryptoClient;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class LoginPreferences_Factory implements Factory<LoginPreferences> {
    private final Provider<Context> contextProvider;
    private final Provider<CryptoClient> cryptoClientProvider;
    private final Provider<SharedPreferences> preferencesProvider;

    public LoginPreferences_Factory(Provider<Context> provider, Provider<SharedPreferences> provider2, Provider<CryptoClient> provider3) {
        this.contextProvider = provider;
        this.preferencesProvider = provider2;
        this.cryptoClientProvider = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public LoginPreferences get() {
        return newInstance(this.contextProvider.get(), this.preferencesProvider.get(), this.cryptoClientProvider.get());
    }

    public static LoginPreferences_Factory create(Provider<Context> provider, Provider<SharedPreferences> provider2, Provider<CryptoClient> provider3) {
        return new LoginPreferences_Factory(provider, provider2, provider3);
    }

    public static LoginPreferences newInstance(Context context, SharedPreferences sharedPreferences, CryptoClient cryptoClient) {
        return new LoginPreferences(context, sharedPreferences, cryptoClient);
    }
}
