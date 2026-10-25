package com.medicmedia.medilink.ui.offline;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class OfflineContentsDetailViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static OfflineContentsDetailViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return OfflineContentsDetailViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final OfflineContentsDetailViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new OfflineContentsDetailViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
