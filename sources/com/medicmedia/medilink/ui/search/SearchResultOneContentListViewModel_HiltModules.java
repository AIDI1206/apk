package com.medicmedia.medilink.ui.search;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class SearchResultOneContentListViewModel_HiltModules {
    private SearchResultOneContentListViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(SearchResultOneContentListViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(SearchResultOneContentListViewModel searchResultOneContentListViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(SearchResultOneContentListViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
