package com.medicmedia.medilink.ui.video;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoChapterListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static VideoChapterListViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return VideoChapterListViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final VideoChapterListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new VideoChapterListViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
