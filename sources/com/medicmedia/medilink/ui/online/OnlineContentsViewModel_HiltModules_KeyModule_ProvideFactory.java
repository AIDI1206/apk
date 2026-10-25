package com.medicmedia.medilink.ui.online;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class OnlineContentsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static OnlineContentsViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return OnlineContentsViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final OnlineContentsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new OnlineContentsViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
