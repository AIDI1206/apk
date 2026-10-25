package com.medicmedia.medilink.data.di;

import android.content.Context;
import com.google.android.exoplayer2.database.DatabaseProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoModule_ProvideDatabaseProviderFactory implements Factory<DatabaseProvider> {
    private final Provider<Context> contextProvider;

    public VideoModule_ProvideDatabaseProviderFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DatabaseProvider get() {
        return provideDatabaseProvider(this.contextProvider.get());
    }

    public static VideoModule_ProvideDatabaseProviderFactory create(Provider<Context> provider) {
        return new VideoModule_ProvideDatabaseProviderFactory(provider);
    }

    public static DatabaseProvider provideDatabaseProvider(Context context) {
        return (DatabaseProvider) Preconditions.checkNotNullFromProvides(VideoModule.INSTANCE.provideDatabaseProvider(context));
    }
}
