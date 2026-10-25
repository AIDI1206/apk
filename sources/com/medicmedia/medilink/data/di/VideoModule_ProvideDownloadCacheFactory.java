package com.medicmedia.medilink.data.di;

import android.content.Context;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.upstream.cache.Cache;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoModule_ProvideDownloadCacheFactory implements Factory<Cache> {
    private final Provider<Context> contextProvider;
    private final Provider<DatabaseProvider> databaseProvider;

    public VideoModule_ProvideDownloadCacheFactory(Provider<Context> provider, Provider<DatabaseProvider> provider2) {
        this.contextProvider = provider;
        this.databaseProvider = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Cache get() {
        return provideDownloadCache(this.contextProvider.get(), this.databaseProvider.get());
    }

    public static VideoModule_ProvideDownloadCacheFactory create(Provider<Context> provider, Provider<DatabaseProvider> provider2) {
        return new VideoModule_ProvideDownloadCacheFactory(provider, provider2);
    }

    public static Cache provideDownloadCache(Context context, DatabaseProvider databaseProvider) {
        return (Cache) Preconditions.checkNotNullFromProvides(VideoModule.INSTANCE.provideDownloadCache(context, databaseProvider));
    }
}
