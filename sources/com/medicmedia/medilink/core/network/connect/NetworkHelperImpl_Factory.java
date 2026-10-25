package com.medicmedia.medilink.core.network.connect;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class NetworkHelperImpl_Factory implements Factory<NetworkHelperImpl> {
    private final Provider<CoroutineScope> appScopeProvider;
    private final Provider<Context> contextProvider;

    public NetworkHelperImpl_Factory(Provider<Context> provider, Provider<CoroutineScope> provider2) {
        this.contextProvider = provider;
        this.appScopeProvider = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public NetworkHelperImpl get() {
        return newInstance(this.contextProvider.get(), this.appScopeProvider.get());
    }

    public static NetworkHelperImpl_Factory create(Provider<Context> provider, Provider<CoroutineScope> provider2) {
        return new NetworkHelperImpl_Factory(provider, provider2);
    }

    public static NetworkHelperImpl newInstance(Context context, CoroutineScope coroutineScope) {
        return new NetworkHelperImpl(context, coroutineScope);
    }
}
