package com.medicmedia.medilink.ui.scan;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class ScanViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ScanViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ScanViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ScanViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ScanViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
