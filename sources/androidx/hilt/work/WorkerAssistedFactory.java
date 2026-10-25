package androidx.hilt.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes3.dex */
public interface WorkerAssistedFactory<T extends ListenableWorker> {
    T create(Context context, WorkerParameters workerParameters);
}
