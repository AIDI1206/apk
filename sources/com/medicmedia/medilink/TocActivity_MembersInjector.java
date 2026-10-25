package com.medicmedia.medilink;

import com.medicmedia.medilink.ui.navigation.VideoPipDestinationHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class TocActivity_MembersInjector implements MembersInjector<TocActivity> {
    private final Provider<VideoPipDestinationHandler> videoPipDestinationHandlerProvider;

    public TocActivity_MembersInjector(Provider<VideoPipDestinationHandler> provider) {
        this.videoPipDestinationHandlerProvider = provider;
    }

    public static MembersInjector<TocActivity> create(Provider<VideoPipDestinationHandler> provider) {
        return new TocActivity_MembersInjector(provider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(TocActivity tocActivity) {
        injectVideoPipDestinationHandler(tocActivity, this.videoPipDestinationHandlerProvider.get());
    }

    public static void injectVideoPipDestinationHandler(TocActivity tocActivity, VideoPipDestinationHandler videoPipDestinationHandler) {
        tocActivity.videoPipDestinationHandler = videoPipDestinationHandler;
    }
}
