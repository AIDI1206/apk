package com.medicmedia.medilink.core.security.device;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class ThreatDetectionHelperImpl_Factory implements Factory<ThreatDetectionHelperImpl> {
    private final Provider<Context> contextProvider;

    public ThreatDetectionHelperImpl_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ThreatDetectionHelperImpl get() {
        return newInstance(this.contextProvider.get());
    }

    public static ThreatDetectionHelperImpl_Factory create(Provider<Context> provider) {
        return new ThreatDetectionHelperImpl_Factory(provider);
    }

    public static ThreatDetectionHelperImpl newInstance(Context context) {
        return new ThreatDetectionHelperImpl(context);
    }
}
