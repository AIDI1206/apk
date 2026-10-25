package com.medicmedia.medilink.ui.edit;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoEditListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static VideoEditListViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return VideoEditListViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final VideoEditListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new VideoEditListViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
