package com.medicmedia.medilink;

import com.medicmedia.medilink.ui.navigation.AppNavigator;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class IntermediatePageActivity_MembersInjector implements MembersInjector<IntermediatePageActivity> {
    private final Provider<AppNavigator> appNavigatorProvider;

    public IntermediatePageActivity_MembersInjector(Provider<AppNavigator> provider) {
        this.appNavigatorProvider = provider;
    }

    public static MembersInjector<IntermediatePageActivity> create(Provider<AppNavigator> provider) {
        return new IntermediatePageActivity_MembersInjector(provider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(IntermediatePageActivity intermediatePageActivity) {
        injectAppNavigator(intermediatePageActivity, this.appNavigatorProvider.get());
    }

    public static void injectAppNavigator(IntermediatePageActivity intermediatePageActivity, AppNavigator appNavigator) {
        intermediatePageActivity.appNavigator = appNavigator;
    }
}
