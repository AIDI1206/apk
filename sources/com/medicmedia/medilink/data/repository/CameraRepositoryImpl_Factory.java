package com.medicmedia.medilink.data.repository;

import com.medicmedia.medilink.camera.CameraClient;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class CameraRepositoryImpl_Factory implements Factory<CameraRepositoryImpl> {
    private final Provider<CameraClient> cameraClientProvider;

    public CameraRepositoryImpl_Factory(Provider<CameraClient> provider) {
        this.cameraClientProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CameraRepositoryImpl get() {
        return newInstance(this.cameraClientProvider.get());
    }

    public static CameraRepositoryImpl_Factory create(Provider<CameraClient> provider) {
        return new CameraRepositoryImpl_Factory(provider);
    }

    public static CameraRepositoryImpl newInstance(CameraClient cameraClient) {
        return new CameraRepositoryImpl(cameraClient);
    }
}
