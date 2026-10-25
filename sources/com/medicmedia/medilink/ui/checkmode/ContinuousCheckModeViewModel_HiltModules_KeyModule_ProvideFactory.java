package com.medicmedia.medilink.ui.checkmode;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class ContinuousCheckModeViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ContinuousCheckModeViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ContinuousCheckModeViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ContinuousCheckModeViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ContinuousCheckModeViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
