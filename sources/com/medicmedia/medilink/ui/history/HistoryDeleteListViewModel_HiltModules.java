package com.medicmedia.medilink.ui.history;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class HistoryDeleteListViewModel_HiltModules {
    private HistoryDeleteListViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(HistoryDeleteListViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(HistoryDeleteListViewModel historyDeleteListViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(HistoryDeleteListViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
