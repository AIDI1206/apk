package com.medicmedia.medilink.domain.redux;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class CommonUiReducer_Factory implements Factory<CommonUiReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CommonUiReducer get() {
        return newInstance();
    }

    public static CommonUiReducer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static CommonUiReducer newInstance() {
        return new CommonUiReducer();
    }

    private static final class InstanceHolder {
        static final CommonUiReducer_Factory INSTANCE = new CommonUiReducer_Factory();

        private InstanceHolder() {
        }
    }
}
