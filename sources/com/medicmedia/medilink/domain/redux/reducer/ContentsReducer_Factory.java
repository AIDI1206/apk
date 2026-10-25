package com.medicmedia.medilink.domain.redux.reducer;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentsReducer_Factory implements Factory<ContentsReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ContentsReducer get() {
        return newInstance();
    }

    public static ContentsReducer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ContentsReducer newInstance() {
        return new ContentsReducer();
    }

    private static final class InstanceHolder {
        static final ContentsReducer_Factory INSTANCE = new ContentsReducer_Factory();

        private InstanceHolder() {
        }
    }
}
