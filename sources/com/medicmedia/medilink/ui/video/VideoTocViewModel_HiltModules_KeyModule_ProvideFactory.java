package com.medicmedia.medilink.ui.video;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoTocViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static VideoTocViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return VideoTocViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final VideoTocViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new VideoTocViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
