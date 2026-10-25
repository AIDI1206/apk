package com.medicmedia.medilink.ui.offline;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class OfflineContentsTocViewModel_HiltModules {
    private OfflineContentsTocViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(OfflineContentsTocViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(OfflineContentsTocViewModel offlineContentsTocViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(OfflineContentsTocViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
