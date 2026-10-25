package com.medicmedia.medilink.ui.web;

import com.medicmedia.medilink.domain.usecase.WebViewUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class OtherWebViewModel_Factory implements Factory<OtherWebViewModel> {
    private final Provider<WebViewUseCase> webViewUseCaseProvider;

    public OtherWebViewModel_Factory(Provider<WebViewUseCase> provider) {
        this.webViewUseCaseProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public OtherWebViewModel get() {
        return newInstance(this.webViewUseCaseProvider.get());
    }

    public static OtherWebViewModel_Factory create(Provider<WebViewUseCase> provider) {
        return new OtherWebViewModel_Factory(provider);
    }

    public static OtherWebViewModel newInstance(WebViewUseCase webViewUseCase) {
        return new OtherWebViewModel(webViewUseCase);
    }
}
