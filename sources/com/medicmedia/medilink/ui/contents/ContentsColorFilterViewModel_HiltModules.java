package com.medicmedia.medilink.ui.contents;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentsColorFilterViewModel_HiltModules {
    private ContentsColorFilterViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ContentsColorFilterViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ContentsColorFilterViewModel contentsColorFilterViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(ContentsColorFilterViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
