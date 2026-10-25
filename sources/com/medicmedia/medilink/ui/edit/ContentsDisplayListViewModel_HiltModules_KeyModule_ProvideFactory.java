package com.medicmedia.medilink.ui.edit;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentsDisplayListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ContentsDisplayListViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ContentsDisplayListViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ContentsDisplayListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ContentsDisplayListViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
