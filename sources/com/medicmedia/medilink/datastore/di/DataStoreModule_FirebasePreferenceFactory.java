package com.medicmedia.medilink.datastore.di;

import android.content.Context;
import android.content.SharedPreferences;
import com.medicmedia.medilink.datastore.firebase.FirebaseDataStore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class DataStoreModule_FirebasePreferenceFactory implements Factory<FirebaseDataStore> {
    private final Provider<Context> contextProvider;
    private final Provider<SharedPreferences> preferencesProvider;

    public DataStoreModule_FirebasePreferenceFactory(Provider<Context> provider, Provider<SharedPreferences> provider2) {
        this.contextProvider = provider;
        this.preferencesProvider = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public FirebaseDataStore get() {
        return firebasePreference(this.contextProvider.get(), this.preferencesProvider.get());
    }

    public static DataStoreModule_FirebasePreferenceFactory create(Provider<Context> provider, Provider<SharedPreferences> provider2) {
        return new DataStoreModule_FirebasePreferenceFactory(provider, provider2);
    }

    public static FirebaseDataStore firebasePreference(Context context, SharedPreferences sharedPreferences) {
        return (FirebaseDataStore) Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.firebasePreference(context, sharedPreferences));
    }
}
