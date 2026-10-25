package com.medicmedia.medilink.analytics.di;

import com.appsflyer.AppsFlyerLib;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class AnalyticsModule_ProvideAppsFlyerLibFactory implements Factory<AppsFlyerLib> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public AppsFlyerLib get() {
        return provideAppsFlyerLib();
    }

    public static AnalyticsModule_ProvideAppsFlyerLibFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AppsFlyerLib provideAppsFlyerLib() {
        return (AppsFlyerLib) Preconditions.checkNotNullFromProvides(AnalyticsModule.INSTANCE.provideAppsFlyerLib());
    }

    private static final class InstanceHolder {
        static final AnalyticsModule_ProvideAppsFlyerLibFactory INSTANCE = new AnalyticsModule_ProvideAppsFlyerLibFactory();

        private InstanceHolder() {
        }
    }
}
