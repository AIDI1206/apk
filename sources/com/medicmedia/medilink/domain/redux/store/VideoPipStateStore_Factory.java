package com.medicmedia.medilink.domain.redux.store;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoPipStateStore_Factory implements Factory<VideoPipStateStore> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public VideoPipStateStore get() {
        return newInstance();
    }

    public static VideoPipStateStore_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static VideoPipStateStore newInstance() {
        return new VideoPipStateStore();
    }

    private static final class InstanceHolder {
        static final VideoPipStateStore_Factory INSTANCE = new VideoPipStateStore_Factory();

        private InstanceHolder() {
        }
    }
}
