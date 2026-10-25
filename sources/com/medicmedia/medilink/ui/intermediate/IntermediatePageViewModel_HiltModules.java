package com.medicmedia.medilink.ui.intermediate;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class IntermediatePageViewModel_HiltModules {
    private IntermediatePageViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(IntermediatePageViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(IntermediatePageViewModel intermediatePageViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(IntermediatePageViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
