package com.medicmedia.medilink.ui.intermediate;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class IntermediatePageViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static IntermediatePageViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return IntermediatePageViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final IntermediatePageViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new IntermediatePageViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
