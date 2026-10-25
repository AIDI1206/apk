package com.medicmedia.medilink.ui.announce;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class AnnounceViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static AnnounceViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return AnnounceViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final AnnounceViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new AnnounceViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
