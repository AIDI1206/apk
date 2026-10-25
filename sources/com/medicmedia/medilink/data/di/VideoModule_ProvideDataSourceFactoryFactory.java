package com.medicmedia.medilink.data.di;

import android.content.Context;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoModule_ProvideDataSourceFactoryFactory implements Factory<DataSource.Factory> {
    private final Provider<Cache> cacheProvider;
    private final Provider<Context> contextProvider;
    private final Provider<HttpDataSource.Factory> httpFactoryProvider;

    public VideoModule_ProvideDataSourceFactoryFactory(Provider<Context> provider, Provider<HttpDataSource.Factory> provider2, Provider<Cache> provider3) {
        this.contextProvider = provider;
        this.httpFactoryProvider = provider2;
        this.cacheProvider = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DataSource.Factory get() {
        return provideDataSourceFactory(this.contextProvider.get(), this.httpFactoryProvider.get(), this.cacheProvider.get());
    }

    public static VideoModule_ProvideDataSourceFactoryFactory create(Provider<Context> provider, Provider<HttpDataSource.Factory> provider2, Provider<Cache> provider3) {
        return new VideoModule_ProvideDataSourceFactoryFactory(provider, provider2, provider3);
    }

    public static DataSource.Factory provideDataSourceFactory(Context context, HttpDataSource.Factory factory, Cache cache) {
        return (DataSource.Factory) Preconditions.checkNotNullFromProvides(VideoModule.INSTANCE.provideDataSourceFactory(context, factory, cache));
    }
}
