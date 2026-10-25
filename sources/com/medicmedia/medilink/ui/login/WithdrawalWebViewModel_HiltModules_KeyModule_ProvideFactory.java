package com.medicmedia.medilink.ui.login;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class WithdrawalWebViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static WithdrawalWebViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return WithdrawalWebViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final WithdrawalWebViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new WithdrawalWebViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
