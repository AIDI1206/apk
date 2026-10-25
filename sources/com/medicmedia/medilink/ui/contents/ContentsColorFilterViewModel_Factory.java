package com.medicmedia.medilink.ui.contents;

import com.medicmedia.medilink.domain.usecase.ContentsFilterUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentsColorFilterViewModel_Factory implements Factory<ContentsColorFilterViewModel> {
    private final Provider<ContentsFilterUseCase> contentsFilterUseCaseProvider;

    public ContentsColorFilterViewModel_Factory(Provider<ContentsFilterUseCase> provider) {
        this.contentsFilterUseCaseProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ContentsColorFilterViewModel get() {
        return newInstance(this.contentsFilterUseCaseProvider.get());
    }

    public static ContentsColorFilterViewModel_Factory create(Provider<ContentsFilterUseCase> provider) {
        return new ContentsColorFilterViewModel_Factory(provider);
    }

    public static ContentsColorFilterViewModel newInstance(ContentsFilterUseCase contentsFilterUseCase) {
        return new ContentsColorFilterViewModel(contentsFilterUseCase);
    }
}
