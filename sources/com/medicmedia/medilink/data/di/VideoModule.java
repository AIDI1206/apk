package com.medicmedia.medilink.data.di;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.ExoDatabaseProvider;
import com.google.android.exoplayer2.ext.cronet.CronetDataSource;
import com.google.android.exoplayer2.ext.cronet.CronetEngineWrapper;
import com.google.android.exoplayer2.offline.DefaultDownloadIndex;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.ui.DownloadNotificationHelper;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.NoOpCacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.medicmedia.medilink.data.model.ConstKt;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.io.File;
import java.util.concurrent.Executors;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0005H\u0007J*\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0007J\"\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\tH\u0007J\u0012\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/data/di/VideoModule;", "", "<init>", "()V", "provideDatabaseProvider", "Lcom/google/android/exoplayer2/database/DatabaseProvider;", "context", "Landroid/content/Context;", "provideDownloadCache", "Lcom/google/android/exoplayer2/upstream/cache/Cache;", "databaseProvider", "provideHttpDataSourceFactory", "Lcom/google/android/exoplayer2/upstream/HttpDataSource$Factory;", "downloadIndex", "Lcom/google/android/exoplayer2/offline/DefaultDownloadIndex;", "provideDownloadManager", "Lcom/google/android/exoplayer2/offline/DownloadManager;", "cache", "httpFactory", "provideDataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "provideDownloadNotificationHelper", "Lcom/google/android/exoplayer2/ui/DownloadNotificationHelper;", "repository_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
public final class VideoModule {
    public static final VideoModule INSTANCE = new VideoModule();

    private VideoModule() {
    }

    @Provides
    @Singleton
    public final DatabaseProvider provideDatabaseProvider(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ExoDatabaseProvider(context);
    }

    @Provides
    @Singleton
    public final Cache provideDownloadCache(@ApplicationContext Context context, DatabaseProvider databaseProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        return new SimpleCache(new File(externalFilesDir, ConstKt.downloadContentDirectory), new NoOpCacheEvictor(), databaseProvider);
    }

    @Provides
    @Singleton
    public final HttpDataSource.Factory provideHttpDataSourceFactory(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return new CronetDataSource.Factory(new CronetEngineWrapper(context), Executors.newSingleThreadExecutor());
        } catch (Exception unused) {
            return new DefaultHttpDataSource.Factory();
        }
    }

    @Provides
    @Singleton
    public final DefaultDownloadIndex downloadIndex(DatabaseProvider databaseProvider) {
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        return new DefaultDownloadIndex(databaseProvider);
    }

    @Provides
    @Singleton
    public final DownloadManager provideDownloadManager(@ApplicationContext Context context, DatabaseProvider databaseProvider, Cache cache, HttpDataSource.Factory httpFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(httpFactory, "httpFactory");
        return new DownloadManager(context, databaseProvider, cache, httpFactory, Executors.newFixedThreadPool(6));
    }

    @Provides
    @Singleton
    public final DataSource.Factory provideDataSourceFactory(@ApplicationContext Context context, HttpDataSource.Factory httpFactory, Cache cache) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(httpFactory, "httpFactory");
        Intrinsics.checkNotNullParameter(cache, "cache");
        CacheDataSource.Factory flags = new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(new DefaultDataSourceFactory(context, httpFactory)).setCacheWriteDataSinkFactory(null).setFlags(2);
        Intrinsics.checkNotNullExpressionValue(flags, "setFlags(...)");
        return flags;
    }

    @Provides
    @Singleton
    public final DownloadNotificationHelper provideDownloadNotificationHelper(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DownloadNotificationHelper(context, ConstKt.downloadNotificationChannelId);
    }
}
