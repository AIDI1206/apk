package com.medicmedia.medilink.ui.edit;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentsDisplayListViewModel_HiltModules {
    private ContentsDisplayListViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ContentsDisplayListViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ContentsDisplayListViewModel contentsDisplayListViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(ContentsDisplayListViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
