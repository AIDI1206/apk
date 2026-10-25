package com.medicmedia.medilink.ui.checkmode;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class ContinuousCheckModeViewModel_HiltModules {
    private ContinuousCheckModeViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ContinuousCheckModeViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ContinuousCheckModeViewModel continuousCheckModeViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(ContinuousCheckModeViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
