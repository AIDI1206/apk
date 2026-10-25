package androidx.hilt.work;

import androidx.work.ListenableWorker;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkerFactoryModule_ProvideFactoryFactory implements Factory<HiltWorkerFactory> {
    private final Provider<Map<String, javax.inject.Provider<WorkerAssistedFactory<? extends ListenableWorker>>>> workerFactoriesProvider;

    public WorkerFactoryModule_ProvideFactoryFactory(Provider<Map<String, javax.inject.Provider<WorkerAssistedFactory<? extends ListenableWorker>>>> provider) {
        this.workerFactoriesProvider = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public HiltWorkerFactory get() {
        return provideFactory(this.workerFactoriesProvider.get());
    }

    public static WorkerFactoryModule_ProvideFactoryFactory create(javax.inject.Provider<Map<String, javax.inject.Provider<WorkerAssistedFactory<? extends ListenableWorker>>>> provider) {
        return new WorkerFactoryModule_ProvideFactoryFactory(Providers.asDaggerProvider(provider));
    }

    public static WorkerFactoryModule_ProvideFactoryFactory create(Provider<Map<String, javax.inject.Provider<WorkerAssistedFactory<? extends ListenableWorker>>>> provider) {
        return new WorkerFactoryModule_ProvideFactoryFactory(provider);
    }

    public static HiltWorkerFactory provideFactory(Map<String, javax.inject.Provider<WorkerAssistedFactory<? extends ListenableWorker>>> map) {
        return (HiltWorkerFactory) Preconditions.checkNotNullFromProvides(WorkerFactoryModule.provideFactory(map));
    }
}
