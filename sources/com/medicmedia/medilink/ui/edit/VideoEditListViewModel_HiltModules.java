package com.medicmedia.medilink.ui.edit;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoEditListViewModel_HiltModules {
    private VideoEditListViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(VideoEditListViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(VideoEditListViewModel videoEditListViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(VideoEditListViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
