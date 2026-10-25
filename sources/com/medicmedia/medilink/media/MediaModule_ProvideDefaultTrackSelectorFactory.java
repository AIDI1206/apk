package com.medicmedia.medilink.media;

import android.content.Context;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaModule_ProvideDefaultTrackSelectorFactory implements Factory<DefaultTrackSelector> {
    private final Provider<Context> contextProvider;

    public MediaModule_ProvideDefaultTrackSelectorFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DefaultTrackSelector get() {
        return provideDefaultTrackSelector(this.contextProvider.get());
    }

    public static MediaModule_ProvideDefaultTrackSelectorFactory create(Provider<Context> provider) {
        return new MediaModule_ProvideDefaultTrackSelectorFactory(provider);
    }

    public static DefaultTrackSelector provideDefaultTrackSelector(Context context) {
        return (DefaultTrackSelector) Preconditions.checkNotNullFromProvides(MediaModule.INSTANCE.provideDefaultTrackSelector(context));
    }
}
