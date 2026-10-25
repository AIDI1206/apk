package com.medicmedia.medilink.domain.redux;

import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class CommonUiStore_Factory implements Factory<CommonUiStore> {
    private final Provider<CommonUiReducer> reducerProvider;

    public CommonUiStore_Factory(Provider<CommonUiReducer> provider) {
        this.reducerProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CommonUiStore get() {
        return newInstance(this.reducerProvider.get());
    }

    public static CommonUiStore_Factory create(Provider<CommonUiReducer> provider) {
        return new CommonUiStore_Factory(provider);
    }

    public static CommonUiStore newInstance(CommonUiReducer commonUiReducer) {
        return new CommonUiStore(commonUiReducer);
    }
}
