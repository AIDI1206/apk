package com.medicmedia.medilink.ui.reference;

import com.medicmedia.medilink.domain.usecase.ContentsDetailUseCase;
import dagger.internal.Factory;
import dagger.internal.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentsReferenceListViewModel_Factory implements Factory<ContentsReferenceListViewModel> {
    private final Provider<ContentsDetailUseCase> contentsDetailUseCaseProvider;

    public ContentsReferenceListViewModel_Factory(Provider<ContentsDetailUseCase> provider) {
        this.contentsDetailUseCaseProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public ContentsReferenceListViewModel get() {
        return newInstance(this.contentsDetailUseCaseProvider.get());
    }

    public static ContentsReferenceListViewModel_Factory create(Provider<ContentsDetailUseCase> provider) {
        return new ContentsReferenceListViewModel_Factory(provider);
    }

    public static ContentsReferenceListViewModel newInstance(ContentsDetailUseCase contentsDetailUseCase) {
        return new ContentsReferenceListViewModel(contentsDetailUseCase);
    }
}
