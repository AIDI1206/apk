package com.medicmedia.medilink;

import com.medicmedia.medilink.ui.navigation.VideoPipDestinationHandler;
import dagger.MembersInjector;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentsDetailHistoryListActivity_MembersInjector implements MembersInjector<ContentsDetailHistoryListActivity> {
    private final Provider<VideoPipDestinationHandler> videoPipDestinationHandlerProvider;

    public ContentsDetailHistoryListActivity_MembersInjector(Provider<VideoPipDestinationHandler> provider) {
        this.videoPipDestinationHandlerProvider = provider;
    }

    public static MembersInjector<ContentsDetailHistoryListActivity> create(Provider<VideoPipDestinationHandler> provider) {
        return new ContentsDetailHistoryListActivity_MembersInjector(provider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ContentsDetailHistoryListActivity contentsDetailHistoryListActivity) {
        injectVideoPipDestinationHandler(contentsDetailHistoryListActivity, this.videoPipDestinationHandlerProvider.get());
    }

    public static void injectVideoPipDestinationHandler(ContentsDetailHistoryListActivity contentsDetailHistoryListActivity, VideoPipDestinationHandler videoPipDestinationHandler) {
        contentsDetailHistoryListActivity.videoPipDestinationHandler = videoPipDestinationHandler;
    }
}
