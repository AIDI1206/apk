package com.medicmedia.medilink.ui.offline;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class OfflineContentsTocViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static OfflineContentsTocViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return OfflineContentsTocViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final OfflineContentsTocViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new OfflineContentsTocViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
