package com.medicmedia.medilink.media;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaModule_ProvideAudioPlayerFactory implements Factory<AudioPlayer> {
    private final Provider<Context> contextProvider;

    public MediaModule_ProvideAudioPlayerFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AudioPlayer get() {
        return provideAudioPlayer(this.contextProvider.get());
    }

    public static MediaModule_ProvideAudioPlayerFactory create(Provider<Context> provider) {
        return new MediaModule_ProvideAudioPlayerFactory(provider);
    }

    public static AudioPlayer provideAudioPlayer(Context context) {
        return (AudioPlayer) Preconditions.checkNotNullFromProvides(MediaModule.INSTANCE.provideAudioPlayer(context));
    }
}
