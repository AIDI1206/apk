package com.medicmedia.medilink.ui.chatbot;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class ChatbotMessageListViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static ChatbotMessageListViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provide() {
        return ChatbotMessageListViewModel_HiltModules.KeyModule.provide();
    }

    private static final class InstanceHolder {
        static final ChatbotMessageListViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ChatbotMessageListViewModel_HiltModules_KeyModule_ProvideFactory();

        private InstanceHolder() {
        }
    }
}
