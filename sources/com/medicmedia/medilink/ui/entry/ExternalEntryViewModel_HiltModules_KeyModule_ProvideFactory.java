package com.medicmedia.medilink.ui.entry;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class ExternalEntryViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ExternalEntryViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ExternalEntryViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ExternalEntryViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ExternalEntryViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
