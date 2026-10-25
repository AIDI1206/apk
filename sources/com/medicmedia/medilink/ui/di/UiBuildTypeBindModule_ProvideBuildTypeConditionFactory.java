package com.medicmedia.medilink.ui.di;

import com.medicmedia.medilink.ui.build.BuildTypeCondition;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class UiBuildTypeBindModule_ProvideBuildTypeConditionFactory implements Factory<BuildTypeCondition> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public BuildTypeCondition get() {
        return provideBuildTypeCondition();
    }

    public static UiBuildTypeBindModule_ProvideBuildTypeConditionFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BuildTypeCondition provideBuildTypeCondition() {
        return (BuildTypeCondition) Preconditions.checkNotNullFromProvides(UiBuildTypeBindModule.INSTANCE.provideBuildTypeCondition());
    }

    private static final class InstanceHolder {
        static final UiBuildTypeBindModule_ProvideBuildTypeConditionFactory INSTANCE = new UiBuildTypeBindModule_ProvideBuildTypeConditionFactory();

        private InstanceHolder() {
        }
    }
}
