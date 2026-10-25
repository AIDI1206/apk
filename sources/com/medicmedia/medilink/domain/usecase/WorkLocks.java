package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: ContentsDownloadUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00070\u00072\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/WorkLocks;", "", "<init>", "()V", "locks", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlinx/coroutines/sync/Mutex;", "of", "kotlin.jvm.PlatformType", "name", "(Ljava/lang/String;)Lkotlinx/coroutines/sync/Mutex;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class WorkLocks {
    public static final WorkLocks INSTANCE = new WorkLocks();
    private static final ConcurrentHashMap<String, Mutex> locks = new ConcurrentHashMap<>();

    private WorkLocks() {
    }

    public final Mutex of(String name) {
        Mutex mutexPutIfAbsent;
        Intrinsics.checkNotNullParameter(name, "name");
        ConcurrentHashMap<String, Mutex> concurrentHashMap = locks;
        Mutex mutexMutex$default = concurrentHashMap.get(name);
        if (mutexMutex$default == null && (mutexPutIfAbsent = concurrentHashMap.putIfAbsent(name, (mutexMutex$default = MutexKt.Mutex$default(false, 1, null)))) != null) {
            mutexMutex$default = mutexPutIfAbsent;
        }
        return mutexMutex$default;
    }
}
