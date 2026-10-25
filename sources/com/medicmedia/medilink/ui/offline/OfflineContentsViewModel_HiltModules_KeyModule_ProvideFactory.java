package com.medicmedia.medilink.ui.offline;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class OfflineContentsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static OfflineContentsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return OfflineContentsViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final OfflineContentsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new OfflineContentsViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
