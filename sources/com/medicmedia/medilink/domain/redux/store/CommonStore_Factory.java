package com.medicmedia.medilink.domain.redux.store;

import com.medicmedia.medilink.domain.redux.Reducer;
import com.medicmedia.medilink.domain.redux.state.CommonState;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class CommonStore_Factory implements Factory<CommonStore> {
    private final Provider<Reducer<CommonState>> reducerProvider;

    public CommonStore_Factory(Provider<Reducer<CommonState>> provider) {
        this.reducerProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public CommonStore get() {
        return newInstance(this.reducerProvider.get());
    }

    public static CommonStore_Factory create(Provider<Reducer<CommonState>> provider) {
        return new CommonStore_Factory(provider);
    }

    public static CommonStore newInstance(Reducer<CommonState> reducer) {
        return new CommonStore(reducer);
    }
}
