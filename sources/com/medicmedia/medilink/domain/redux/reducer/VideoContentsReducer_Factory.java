package com.medicmedia.medilink.domain.redux.reducer;

import dagger.internal.Factory;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoContentsReducer_Factory implements Factory<VideoContentsReducer> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public VideoContentsReducer get() {
        return newInstance();
    }

    public static VideoContentsReducer_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static VideoContentsReducer newInstance() {
        return new VideoContentsReducer();
    }

    private static final class InstanceHolder {
        static final VideoContentsReducer_Factory INSTANCE = new VideoContentsReducer_Factory();

        private InstanceHolder() {
        }
    }
}
