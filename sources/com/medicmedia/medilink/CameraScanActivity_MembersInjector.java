package com.medicmedia.medilink;

import com.medicmedia.medilink.ui.navigation.AppNavigator;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class CameraScanActivity_MembersInjector implements MembersInjector<CameraScanActivity> {
    private final Provider<AppNavigator> appNavigatorProvider;

    public CameraScanActivity_MembersInjector(Provider<AppNavigator> provider) {
        this.appNavigatorProvider = provider;
    }

    public static MembersInjector<CameraScanActivity> create(Provider<AppNavigator> provider) {
        return new CameraScanActivity_MembersInjector(provider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(CameraScanActivity cameraScanActivity) {
        injectAppNavigator(cameraScanActivity, this.appNavigatorProvider.get());
    }

    public static void injectAppNavigator(CameraScanActivity cameraScanActivity, AppNavigator appNavigator) {
        cameraScanActivity.appNavigator = appNavigator;
    }
}
