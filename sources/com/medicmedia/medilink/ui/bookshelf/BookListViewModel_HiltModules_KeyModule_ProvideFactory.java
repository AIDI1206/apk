package com.medicmedia.medilink.ui.bookshelf;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class BookListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static BookListViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return BookListViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final BookListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new BookListViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
