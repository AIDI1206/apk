package com.medicmedia.medilink.ui.chatbot;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class ChatbotHistoryListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ChatbotHistoryListViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ChatbotHistoryListViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ChatbotHistoryListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ChatbotHistoryListViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
