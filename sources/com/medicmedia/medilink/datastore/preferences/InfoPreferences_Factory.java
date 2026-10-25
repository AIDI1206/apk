package com.medicmedia.medilink.datastore.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class InfoPreferences_Factory implements Factory<InfoPreferences> {
    private final Provider<Context> contextProvider;
    private final Provider<SharedPreferences> preferencesProvider;

    public InfoPreferences_Factory(Provider<Context> provider, Provider<SharedPreferences> provider2) {
        this.contextProvider = provider;
        this.preferencesProvider = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public InfoPreferences get() {
        return newInstance(this.contextProvider.get(), this.preferencesProvider.get());
    }

    public static InfoPreferences_Factory create(Provider<Context> provider, Provider<SharedPreferences> provider2) {
        return new InfoPreferences_Factory(provider, provider2);
    }

    public static InfoPreferences newInstance(Context context, SharedPreferences sharedPreferences) {
        return new InfoPreferences(context, sharedPreferences);
    }
}
