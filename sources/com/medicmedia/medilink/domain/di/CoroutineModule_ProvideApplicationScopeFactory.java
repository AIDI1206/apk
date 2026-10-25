package com.medicmedia.medilink.domain.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class CoroutineModule_ProvideApplicationScopeFactory implements Factory<CoroutineScope> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CoroutineScope get() {
        return provideApplicationScope();
    }

    public static CoroutineModule_ProvideApplicationScopeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CoroutineScope provideApplicationScope() {
        return (CoroutineScope) Preconditions.checkNotNullFromProvides(CoroutineModule.INSTANCE.provideApplicationScope());
    }

    private static final class InstanceHolder {
        static final CoroutineModule_ProvideApplicationScopeFactory INSTANCE = new CoroutineModule_ProvideApplicationScopeFactory();

        private InstanceHolder() {
        }
    }
}
