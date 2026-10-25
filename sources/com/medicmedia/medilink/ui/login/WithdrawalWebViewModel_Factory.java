package com.medicmedia.medilink.ui.login;

import com.medicmedia.medilink.domain.usecase.LaunchUseCase;
import com.medicmedia.medilink.domain.usecase.WebViewUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class WithdrawalWebViewModel_Factory implements Factory<WithdrawalWebViewModel> {
    private final Provider<LaunchUseCase> launchUseCaseProvider;
    private final Provider<WebViewUseCase> webViewUseCaseProvider;

    public WithdrawalWebViewModel_Factory(Provider<LaunchUseCase> provider, Provider<WebViewUseCase> provider2) {
        this.launchUseCaseProvider = provider;
        this.webViewUseCaseProvider = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public WithdrawalWebViewModel get() {
        return newInstance(this.launchUseCaseProvider.get(), this.webViewUseCaseProvider.get());
    }

    public static WithdrawalWebViewModel_Factory create(Provider<LaunchUseCase> provider, Provider<WebViewUseCase> provider2) {
        return new WithdrawalWebViewModel_Factory(provider, provider2);
    }

    public static WithdrawalWebViewModel newInstance(LaunchUseCase launchUseCase, WebViewUseCase webViewUseCase) {
        return new WithdrawalWebViewModel(launchUseCase, webViewUseCase);
    }
}
