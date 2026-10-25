package com.medicmedia.medilink.ui.login;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class WithdrawalWebViewModel_HiltModules {
    private WithdrawalWebViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(WithdrawalWebViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(WithdrawalWebViewModel withdrawalWebViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(WithdrawalWebViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
