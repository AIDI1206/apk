package com.medicmedia.medilink.ui.edit;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentsDeleteListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ContentsDeleteListViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ContentsDeleteListViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ContentsDeleteListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ContentsDeleteListViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
