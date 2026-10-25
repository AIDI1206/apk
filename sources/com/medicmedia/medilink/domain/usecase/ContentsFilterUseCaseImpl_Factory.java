package com.medicmedia.medilink.domain.usecase;

import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentsFilterUseCaseImpl_Factory implements Factory<ContentsFilterUseCaseImpl> {
    private final Provider<LoginDataStore> loginDataStoreProvider;

    public ContentsFilterUseCaseImpl_Factory(Provider<LoginDataStore> provider) {
        this.loginDataStoreProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ContentsFilterUseCaseImpl get() {
        return newInstance(this.loginDataStoreProvider.get());
    }

    public static ContentsFilterUseCaseImpl_Factory create(Provider<LoginDataStore> provider) {
        return new ContentsFilterUseCaseImpl_Factory(provider);
    }

    public static ContentsFilterUseCaseImpl newInstance(LoginDataStore loginDataStore) {
        return new ContentsFilterUseCaseImpl(loginDataStore);
    }
}
