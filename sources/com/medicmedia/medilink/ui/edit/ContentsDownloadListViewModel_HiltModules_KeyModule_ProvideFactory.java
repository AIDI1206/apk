package com.medicmedia.medilink.ui.edit;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentsDownloadListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ContentsDownloadListViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ContentsDownloadListViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ContentsDownloadListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ContentsDownloadListViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
