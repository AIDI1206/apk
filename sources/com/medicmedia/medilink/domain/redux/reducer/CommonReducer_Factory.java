package com.medicmedia.medilink.domain.redux.reducer;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class CommonReducer_Factory implements Factory<CommonReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CommonReducer get() {
        return newInstance();
    }

    public static CommonReducer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CommonReducer newInstance() {
        return new CommonReducer();
    }

    private static final class InstanceHolder {
        static final CommonReducer_Factory INSTANCE = new CommonReducer_Factory();

        private InstanceHolder() {
        }
    }
}
