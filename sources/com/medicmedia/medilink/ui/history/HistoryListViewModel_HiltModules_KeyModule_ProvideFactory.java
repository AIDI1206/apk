package com.medicmedia.medilink.ui.history;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class HistoryListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static HistoryListViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return HistoryListViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final HistoryListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new HistoryListViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
