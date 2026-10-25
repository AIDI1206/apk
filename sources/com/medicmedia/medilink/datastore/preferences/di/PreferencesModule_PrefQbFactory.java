package com.medicmedia.medilink.datastore.preferences.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class PreferencesModule_PrefQbFactory implements Factory<SharedPreferences> {
    private final Provider<Context> contextProvider;

    public PreferencesModule_PrefQbFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public SharedPreferences get() {
        return prefQb(this.contextProvider.get());
    }

    public static PreferencesModule_PrefQbFactory create(Provider<Context> provider) {
        return new PreferencesModule_PrefQbFactory(provider);
    }

    public static SharedPreferences prefQb(Context context) {
        return (SharedPreferences) Preconditions.checkNotNullFromProvides(PreferencesModule.INSTANCE.prefQb(context));
    }
}
