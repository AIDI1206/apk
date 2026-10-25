package com.medicmedia.medilink.ui.edit;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentsDownloadListViewModel_HiltModules {
    private ContentsDownloadListViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ContentsDownloadListViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ContentsDownloadListViewModel contentsDownloadListViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(ContentsDownloadListViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
