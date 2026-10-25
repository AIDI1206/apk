package com.medicmedia.medilink;

import com.medicmedia.medilink.analytics.AnalyticsClient;
import com.medicmedia.medilink.ui.navigation.AppNavigator;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class ChatbotActivity_MembersInjector implements MembersInjector<ChatbotActivity> {
    private final Provider<AnalyticsClient> analyticsClientProvider;
    private final Provider<AppNavigator> appNavigatorProvider;

    public ChatbotActivity_MembersInjector(Provider<AppNavigator> provider, Provider<AnalyticsClient> provider2) {
        this.appNavigatorProvider = provider;
        this.analyticsClientProvider = provider2;
    }

    public static MembersInjector<ChatbotActivity> create(Provider<AppNavigator> provider, Provider<AnalyticsClient> provider2) {
        return new ChatbotActivity_MembersInjector(provider, provider2);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ChatbotActivity chatbotActivity) {
        injectAppNavigator(chatbotActivity, this.appNavigatorProvider.get());
        injectAnalyticsClient(chatbotActivity, this.analyticsClientProvider.get());
    }

    public static void injectAppNavigator(ChatbotActivity chatbotActivity, AppNavigator appNavigator) {
        chatbotActivity.appNavigator = appNavigator;
    }

    public static void injectAnalyticsClient(ChatbotActivity chatbotActivity, AnalyticsClient analyticsClient) {
        chatbotActivity.analyticsClient = analyticsClient;
    }
}
