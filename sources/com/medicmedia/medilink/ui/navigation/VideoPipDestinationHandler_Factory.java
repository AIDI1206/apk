package com.medicmedia.medilink.ui.navigation;

import com.medicmedia.medilink.domain.redux.store.VideoPipStateStore;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoPipDestinationHandler_Factory implements Factory<VideoPipDestinationHandler> {
    private final Provider<VideoPipNavigator> navigatorProvider;
    private final Provider<VideoPipStateStore> videoPipStateStoreProvider;

    public VideoPipDestinationHandler_Factory(Provider<VideoPipStateStore> provider, Provider<VideoPipNavigator> provider2) {
        this.videoPipStateStoreProvider = provider;
        this.navigatorProvider = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public VideoPipDestinationHandler get() {
        return newInstance(this.videoPipStateStoreProvider.get(), this.navigatorProvider.get());
    }

    public static VideoPipDestinationHandler_Factory create(Provider<VideoPipStateStore> provider, Provider<VideoPipNavigator> provider2) {
        return new VideoPipDestinationHandler_Factory(provider, provider2);
    }

    public static VideoPipDestinationHandler newInstance(VideoPipStateStore videoPipStateStore, VideoPipNavigator videoPipNavigator) {
        return new VideoPipDestinationHandler(videoPipStateStore, videoPipNavigator);
    }
}
