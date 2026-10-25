package com.medicmedia.medilink.ui.web;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class OtherWebViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static OtherWebViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return OtherWebViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final OtherWebViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new OtherWebViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
