package com.medicmedia.medilink.data.repository;

import android.app.DownloadManager;
import android.content.Context;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class DownloadRepositoryImpl_Factory implements Factory<DownloadRepositoryImpl> {
    private final Provider<Context> contextProvider;
    private final Provider<DownloadManager> downloadManagerProvider;
    private final Provider<LoginDataStore> loginDataStoreProvider;

    public DownloadRepositoryImpl_Factory(Provider<Context> provider, Provider<DownloadManager> provider2, Provider<LoginDataStore> provider3) {
        this.contextProvider = provider;
        this.downloadManagerProvider = provider2;
        this.loginDataStoreProvider = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public DownloadRepositoryImpl get() {
        return newInstance(this.contextProvider.get(), this.downloadManagerProvider.get(), this.loginDataStoreProvider.get());
    }

    public static DownloadRepositoryImpl_Factory create(Provider<Context> provider, Provider<DownloadManager> provider2, Provider<LoginDataStore> provider3) {
        return new DownloadRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static DownloadRepositoryImpl newInstance(Context context, DownloadManager downloadManager, LoginDataStore loginDataStore) {
        return new DownloadRepositoryImpl(context, downloadManager, loginDataStore);
    }
}
