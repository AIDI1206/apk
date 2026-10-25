package com.medicmedia.medilink.core.network.di;

import android.webkit.CookieManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class NetworkModule_ProvideCookieManagerFactory implements Factory<CookieManager> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CookieManager get() {
        return provideCookieManager();
    }

    public static NetworkModule_ProvideCookieManagerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CookieManager provideCookieManager() {
        return (CookieManager) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideCookieManager());
    }

    private static final class InstanceHolder {
        static final NetworkModule_ProvideCookieManagerFactory INSTANCE = new NetworkModule_ProvideCookieManagerFactory();

        private InstanceHolder() {
        }
    }
}
