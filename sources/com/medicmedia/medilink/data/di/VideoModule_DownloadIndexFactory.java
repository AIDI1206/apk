package com.medicmedia.medilink.data.di;

import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.offline.DefaultDownloadIndex;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoModule_DownloadIndexFactory implements Factory<DefaultDownloadIndex> {
    private final Provider<DatabaseProvider> databaseProvider;

    public VideoModule_DownloadIndexFactory(Provider<DatabaseProvider> provider) {
        this.databaseProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DefaultDownloadIndex get() {
        return downloadIndex(this.databaseProvider.get());
    }

    public static VideoModule_DownloadIndexFactory create(Provider<DatabaseProvider> provider) {
        return new VideoModule_DownloadIndexFactory(provider);
    }

    public static DefaultDownloadIndex downloadIndex(DatabaseProvider databaseProvider) {
        return (DefaultDownloadIndex) Preconditions.checkNotNullFromProvides(VideoModule.INSTANCE.downloadIndex(databaseProvider));
    }
}
