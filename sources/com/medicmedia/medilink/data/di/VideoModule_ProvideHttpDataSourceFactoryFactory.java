package com.medicmedia.medilink.data.di;

import android.content.Context;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoModule_ProvideHttpDataSourceFactoryFactory implements Factory<HttpDataSource.Factory> {
    private final Provider<Context> contextProvider;

    public VideoModule_ProvideHttpDataSourceFactoryFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public HttpDataSource.Factory get() {
        return provideHttpDataSourceFactory(this.contextProvider.get());
    }

    public static VideoModule_ProvideHttpDataSourceFactoryFactory create(Provider<Context> provider) {
        return new VideoModule_ProvideHttpDataSourceFactoryFactory(provider);
    }

    public static HttpDataSource.Factory provideHttpDataSourceFactory(Context context) {
        return (HttpDataSource.Factory) Preconditions.checkNotNullFromProvides(VideoModule.INSTANCE.provideHttpDataSourceFactory(context));
    }
}
