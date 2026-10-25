package com.medicmedia.medilink.ui.offline;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class OfflineContentsDetailViewModel_HiltModules {
    private OfflineContentsDetailViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(OfflineContentsDetailViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(OfflineContentsDetailViewModel offlineContentsDetailViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(OfflineContentsDetailViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
