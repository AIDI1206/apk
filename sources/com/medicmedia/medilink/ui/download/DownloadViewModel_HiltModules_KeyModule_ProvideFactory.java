package com.medicmedia.medilink.ui.download;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class DownloadViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static DownloadViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return DownloadViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final DownloadViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new DownloadViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
