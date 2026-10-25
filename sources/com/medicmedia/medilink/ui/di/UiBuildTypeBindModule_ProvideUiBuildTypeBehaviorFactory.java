package com.medicmedia.medilink.ui.di;

import com.medicmedia.medilink.ui.build.UiBuildTypeBehavior;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class UiBuildTypeBindModule_ProvideUiBuildTypeBehaviorFactory implements Factory<UiBuildTypeBehavior> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public UiBuildTypeBehavior get() {
        return provideUiBuildTypeBehavior();
    }

    public static UiBuildTypeBindModule_ProvideUiBuildTypeBehaviorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static UiBuildTypeBehavior provideUiBuildTypeBehavior() {
        return (UiBuildTypeBehavior) Preconditions.checkNotNullFromProvides(UiBuildTypeBindModule.INSTANCE.provideUiBuildTypeBehavior());
    }

    private static final class InstanceHolder {
        static final UiBuildTypeBindModule_ProvideUiBuildTypeBehaviorFactory INSTANCE = new UiBuildTypeBindModule_ProvideUiBuildTypeBehaviorFactory();

        private InstanceHolder() {
        }
    }
}
