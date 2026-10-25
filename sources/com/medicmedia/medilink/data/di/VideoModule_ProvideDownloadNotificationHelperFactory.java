package com.medicmedia.medilink.data.di;

import android.content.Context;
import com.google.android.exoplayer2.ui.DownloadNotificationHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoModule_ProvideDownloadNotificationHelperFactory implements Factory<DownloadNotificationHelper> {
    private final Provider<Context> contextProvider;

    public VideoModule_ProvideDownloadNotificationHelperFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DownloadNotificationHelper get() {
        return provideDownloadNotificationHelper(this.contextProvider.get());
    }

    public static VideoModule_ProvideDownloadNotificationHelperFactory create(Provider<Context> provider) {
        return new VideoModule_ProvideDownloadNotificationHelperFactory(provider);
    }

    public static DownloadNotificationHelper provideDownloadNotificationHelper(Context context) {
        return (DownloadNotificationHelper) Preconditions.checkNotNullFromProvides(VideoModule.INSTANCE.provideDownloadNotificationHelper(context));
    }
}
