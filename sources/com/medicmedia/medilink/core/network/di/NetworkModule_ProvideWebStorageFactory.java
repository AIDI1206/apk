package com.medicmedia.medilink.core.network.di;

import android.webkit.WebStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class NetworkModule_ProvideWebStorageFactory implements Factory<WebStorage> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public WebStorage get() {
        return provideWebStorage();
    }

    public static NetworkModule_ProvideWebStorageFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static WebStorage provideWebStorage() {
        return (WebStorage) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideWebStorage());
    }

    private static final class InstanceHolder {
        static final NetworkModule_ProvideWebStorageFactory INSTANCE = new NetworkModule_ProvideWebStorageFactory();

        private InstanceHolder() {
        }
    }
}
