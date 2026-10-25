package com.medicmedia.medilink.ui;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class MainTabViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static MainTabViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return MainTabViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final MainTabViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new MainTabViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
