package com.medicmedia.medilink.domain.redux.store;

import com.medicmedia.medilink.domain.redux.Reducer;
import com.medicmedia.medilink.domain.redux.state.ContentsState;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentsStore_Factory implements Factory<ContentsStore> {
    private final Provider<Reducer<ContentsState>> reducerProvider;

    public ContentsStore_Factory(Provider<Reducer<ContentsState>> provider) {
        this.reducerProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ContentsStore get() {
        return newInstance(this.reducerProvider.get());
    }

    public static ContentsStore_Factory create(Provider<Reducer<ContentsState>> provider) {
        return new ContentsStore_Factory(provider);
    }

    public static ContentsStore newInstance(Reducer<ContentsState> reducer) {
        return new ContentsStore(reducer);
    }
}
