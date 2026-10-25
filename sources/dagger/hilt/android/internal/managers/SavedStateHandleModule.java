package dagger.hilt.android.internal.managers;

import androidx.lifecycle.SavedStateHandle;
import dagger.Module;
import dagger.Provides;

/* JADX INFO: loaded from: classes6.dex */
@Module
abstract class SavedStateHandleModule {
    SavedStateHandleModule() {
    }

    @Provides
    static SavedStateHandle provideSavedStateHandle(SavedStateHandleHolder savedStateHandleHolder) {
        return savedStateHandleHolder.getSavedStateHandle();
    }
}
