package com.medicmedia.medilink.datastore.di;

import com.medicmedia.medilink.datastore.model.CryptoClient;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class DataStoreModule_CryptoClientFactory implements Factory<CryptoClient> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CryptoClient get() {
        return cryptoClient();
    }

    public static DataStoreModule_CryptoClientFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CryptoClient cryptoClient() {
        return (CryptoClient) Preconditions.checkNotNullFromProvides(DataStoreModule.INSTANCE.cryptoClient());
    }

    private static final class InstanceHolder {
        static final DataStoreModule_CryptoClientFactory INSTANCE = new DataStoreModule_CryptoClientFactory();

        private InstanceHolder() {
        }
    }
}
