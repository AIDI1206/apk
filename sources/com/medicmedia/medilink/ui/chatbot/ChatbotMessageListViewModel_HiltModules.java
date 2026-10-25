package com.medicmedia.medilink.ui.chatbot;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

/* JADX INFO: loaded from: classes6.dex */
public final class ChatbotMessageListViewModel_HiltModules {
    private ChatbotMessageListViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(ChatbotMessageListViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(ChatbotMessageListViewModel chatbotMessageListViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(ChatbotMessageListViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
