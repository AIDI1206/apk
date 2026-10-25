package com.medicmedia.medilink.ui.history;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class BrowsingHistoryListViewModel_HiltModules {
    private BrowsingHistoryListViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(BrowsingHistoryListViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(BrowsingHistoryListViewModel browsingHistoryListViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(BrowsingHistoryListViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
