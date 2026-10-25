package com.medicmedia.medilink.camera.di;

import android.content.Context;
import com.medicmedia.medilink.camera.CameraClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class CameraModule_ProvideCameraClientFactory implements Factory<CameraClient> {
    private final Provider<Context> contextProvider;

    public CameraModule_ProvideCameraClientFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CameraClient get() {
        return provideCameraClient(this.contextProvider.get());
    }

    public static CameraModule_ProvideCameraClientFactory create(Provider<Context> provider) {
        return new CameraModule_ProvideCameraClientFactory(provider);
    }

    public static CameraClient provideCameraClient(Context context) {
        return (CameraClient) Preconditions.checkNotNullFromProvides(CameraModule.INSTANCE.provideCameraClient(context));
    }
}
