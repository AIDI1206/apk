package com.medicmedia.medilink.datastore.preferences.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class PreferencesModule_PrefLoginFactory implements Factory<SharedPreferences> {
    private final Provider<Context> contextProvider;

    public PreferencesModule_PrefLoginFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public SharedPreferences get() {
        return prefLogin(this.contextProvider.get());
    }

    public static PreferencesModule_PrefLoginFactory create(Provider<Context> provider) {
        return new PreferencesModule_PrefLoginFactory(provider);
    }

    public static SharedPreferences prefLogin(Context context) {
        return (SharedPreferences) Preconditions.checkNotNullFromProvides(PreferencesModule.INSTANCE.prefLogin(context));
    }
}
