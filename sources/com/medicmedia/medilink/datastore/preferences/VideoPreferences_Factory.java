package com.medicmedia.medilink.datastore.preferences;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoPreferences_Factory implements Factory<VideoPreferences> {
    private final Provider<SharedPreferences> videoPreferencesProvider;

    public VideoPreferences_Factory(Provider<SharedPreferences> provider) {
        this.videoPreferencesProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public VideoPreferences get() {
        return newInstance(this.videoPreferencesProvider.get());
    }

    public static VideoPreferences_Factory create(Provider<SharedPreferences> provider) {
        return new VideoPreferences_Factory(provider);
    }

    public static VideoPreferences newInstance(SharedPreferences sharedPreferences) {
        return new VideoPreferences(sharedPreferences);
    }
}
