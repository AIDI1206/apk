package com.medicmedia.medilink.domain.redux.store;

import com.medicmedia.medilink.domain.redux.Reducer;
import com.medicmedia.medilink.domain.redux.state.VideoContentsState;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoContentsStore_Factory implements Factory<VideoContentsStore> {
    private final Provider<Reducer<VideoContentsState>> reducerProvider;

    public VideoContentsStore_Factory(Provider<Reducer<VideoContentsState>> provider) {
        this.reducerProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public VideoContentsStore get() {
        return newInstance(this.reducerProvider.get());
    }

    public static VideoContentsStore_Factory create(Provider<Reducer<VideoContentsState>> provider) {
        return new VideoContentsStore_Factory(provider);
    }

    public static VideoContentsStore newInstance(Reducer<VideoContentsState> reducer) {
        return new VideoContentsStore(reducer);
    }
}
