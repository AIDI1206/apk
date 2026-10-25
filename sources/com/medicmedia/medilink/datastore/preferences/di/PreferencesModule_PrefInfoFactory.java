package com.medicmedia.medilink.datastore.preferences.di;

import android.content.Context;
import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class PreferencesModule_PrefInfoFactory implements Factory<SharedPreferences> {
    private final Provider<Context> contextProvider;

    public PreferencesModule_PrefInfoFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public SharedPreferences get() {
        return prefInfo(this.contextProvider.get());
    }

    public static PreferencesModule_PrefInfoFactory create(Provider<Context> provider) {
        return new PreferencesModule_PrefInfoFactory(provider);
    }

    public static SharedPreferences prefInfo(Context context) {
        return (SharedPreferences) Preconditions.checkNotNullFromProvides(PreferencesModule.INSTANCE.prefInfo(context));
    }
}
