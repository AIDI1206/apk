package com.medicmedia.medilink.di;

import com.medicmedia.medilink.build.AppBuildTypeBehavior;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class AppBuildTypeBindModule_ProvideAppBuildTypeBehaviorFactory implements Factory<AppBuildTypeBehavior> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AppBuildTypeBehavior get() {
        return provideAppBuildTypeBehavior();
    }

    public static AppBuildTypeBindModule_ProvideAppBuildTypeBehaviorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AppBuildTypeBehavior provideAppBuildTypeBehavior() {
        return (AppBuildTypeBehavior) Preconditions.checkNotNullFromProvides(AppBuildTypeBindModule.INSTANCE.provideAppBuildTypeBehavior());
    }

    private static final class InstanceHolder {
        static final AppBuildTypeBindModule_ProvideAppBuildTypeBehaviorFactory INSTANCE = new AppBuildTypeBindModule_ProvideAppBuildTypeBehaviorFactory();

        private InstanceHolder() {
        }
    }
}
