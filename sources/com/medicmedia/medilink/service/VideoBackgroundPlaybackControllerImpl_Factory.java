package com.medicmedia.medilink.service;

import android.content.Context;
import com.medicmedia.medilink.analytics.CrashAnalyticsClient;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoBackgroundPlaybackControllerImpl_Factory implements Factory<VideoBackgroundPlaybackControllerImpl> {
    private final Provider<Context> contextProvider;
    private final Provider<CrashAnalyticsClient> crashAnalyticsClientProvider;

    public VideoBackgroundPlaybackControllerImpl_Factory(Provider<Context> provider, Provider<CrashAnalyticsClient> provider2) {
        this.contextProvider = provider;
        this.crashAnalyticsClientProvider = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public VideoBackgroundPlaybackControllerImpl get() {
        return newInstance(this.contextProvider.get(), this.crashAnalyticsClientProvider.get());
    }

    public static VideoBackgroundPlaybackControllerImpl_Factory create(Provider<Context> provider, Provider<CrashAnalyticsClient> provider2) {
        return new VideoBackgroundPlaybackControllerImpl_Factory(provider, provider2);
    }

    public static VideoBackgroundPlaybackControllerImpl newInstance(Context context, CrashAnalyticsClient crashAnalyticsClient) {
        return new VideoBackgroundPlaybackControllerImpl(context, crashAnalyticsClient);
    }
}
