package com.medicmedia.medilink.core.security.di;

import android.content.Context;
import com.medicmedia.medilink.core.security.device.ThreatDetectionHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class SecurityModule_ProvideThreatDetectionHelperFactory implements Factory<ThreatDetectionHelper> {
    private final Provider<Context> contextProvider;

    public SecurityModule_ProvideThreatDetectionHelperFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ThreatDetectionHelper get() {
        return provideThreatDetectionHelper(this.contextProvider.get());
    }

    public static SecurityModule_ProvideThreatDetectionHelperFactory create(Provider<Context> provider) {
        return new SecurityModule_ProvideThreatDetectionHelperFactory(provider);
    }

    public static ThreatDetectionHelper provideThreatDetectionHelper(Context context) {
        return (ThreatDetectionHelper) Preconditions.checkNotNullFromProvides(SecurityModule.INSTANCE.provideThreatDetectionHelper(context));
    }
}
