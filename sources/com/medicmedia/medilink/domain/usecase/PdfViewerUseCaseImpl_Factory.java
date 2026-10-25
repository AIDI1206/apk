package com.medicmedia.medilink.domain.usecase;

import com.medicmedia.medilink.datastore.firebase.FirebaseDataStore;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class PdfViewerUseCaseImpl_Factory implements Factory<PdfViewerUseCaseImpl> {
    private final Provider<FirebaseDataStore> firebaseDataStoreProvider;

    public PdfViewerUseCaseImpl_Factory(Provider<FirebaseDataStore> provider) {
        this.firebaseDataStoreProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public PdfViewerUseCaseImpl get() {
        return newInstance(this.firebaseDataStoreProvider.get());
    }

    public static PdfViewerUseCaseImpl_Factory create(Provider<FirebaseDataStore> provider) {
        return new PdfViewerUseCaseImpl_Factory(provider);
    }

    public static PdfViewerUseCaseImpl newInstance(FirebaseDataStore firebaseDataStore) {
        return new PdfViewerUseCaseImpl(firebaseDataStore);
    }
}
