package com.medicmedia.medilink.datastore.di;

import android.content.SharedPreferences;
import com.medicmedia.medilink.datastore.preferences.VideoDataStore;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class DataStoreModule_MoviePreferenceFactory implements Factory<VideoDataStore> {
    private final Provider<SharedPreferences> preferencesProvider;

    public DataStoreModule_MoviePreferenceFactory(Provider<SharedPreferences> provider) {
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public VideoDataStore get() {
        return moviePreference(this.preferencesProvider.get());
    }

    public static DataStoreModule_MoviePreferenceFactory create(Provider<SharedPreferences> provider) {
        return new DataStoreModule_MoviePreferenceFactory(provider);
    }

    public static VideoDataStore moviePreference(SharedPreferences sharedPreferences) {
        return (VideoDataStore) Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.moviePreference(sharedPreferences));
    }
}
