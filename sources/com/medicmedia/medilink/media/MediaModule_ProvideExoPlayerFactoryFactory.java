package com.medicmedia.medilink.media;

import android.content.Context;
import com.medicmedia.medilink.media.video.ExoPlayerFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaModule_ProvideExoPlayerFactoryFactory implements Factory<ExoPlayerFactory> {
    private final Provider<Context> contextProvider;

    public MediaModule_ProvideExoPlayerFactoryFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ExoPlayerFactory get() {
        return provideExoPlayerFactory(this.contextProvider.get());
    }

    public static MediaModule_ProvideExoPlayerFactoryFactory create(Provider<Context> provider) {
        return new MediaModule_ProvideExoPlayerFactoryFactory(provider);
    }

    public static ExoPlayerFactory provideExoPlayerFactory(Context context) {
        return (ExoPlayerFactory) Preconditions.checkNotNullFromProvides(MediaModule.INSTANCE.provideExoPlayerFactory(context));
    }
}
