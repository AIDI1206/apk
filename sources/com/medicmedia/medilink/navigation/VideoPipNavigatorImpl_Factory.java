package com.medicmedia.medilink.navigation;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoPipNavigatorImpl_Factory implements Factory<VideoPipNavigatorImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public VideoPipNavigatorImpl get() {
        return newInstance();
    }

    public static VideoPipNavigatorImpl_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static VideoPipNavigatorImpl newInstance() {
        return new VideoPipNavigatorImpl();
    }

    private static final class InstanceHolder {
        static final VideoPipNavigatorImpl_Factory INSTANCE = new VideoPipNavigatorImpl_Factory();

        private InstanceHolder() {
        }
    }
}
