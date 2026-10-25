package io.realm.kotlin.internal.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.RealmSchedulerT;
import io.realm.kotlin.internal.platform.CoroutineUtilsSharedJvmKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: CoroutineDispatcherFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/realm/kotlin/internal/util/LiveRealmContext;", "Lio/realm/kotlin/internal/util/DispatcherHolder;", "dispatcherHolder", "<init>", "(Lio/realm/kotlin/internal/util/DispatcherHolder;)V", "scheduler", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/RealmSchedulerT;", "Lio/realm/kotlin/internal/interop/RealmSchedulerPointer;", "getScheduler", "()Lio/realm/kotlin/internal/interop/NativePointer;", "close", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LiveRealmContext implements DispatcherHolder {
    private final DispatcherHolder dispatcherHolder;
    private final NativePointer<RealmSchedulerT> scheduler;

    @Override // io.realm.kotlin.internal.util.DispatcherHolder
    public CoroutineDispatcher getDispatcher() {
        return this.dispatcherHolder.getDispatcher();
    }

    public LiveRealmContext(DispatcherHolder dispatcherHolder) {
        Intrinsics.checkNotNullParameter(dispatcherHolder, "dispatcherHolder");
        this.dispatcherHolder = dispatcherHolder;
        this.scheduler = (NativePointer) CoroutineUtilsSharedJvmKt.runBlocking$default(null, new LiveRealmContext$scheduler$1(this, null), 1, null);
    }

    public final NativePointer<RealmSchedulerT> getScheduler() {
        return this.scheduler;
    }

    @Override // io.realm.kotlin.internal.util.DispatcherHolder
    public void close() {
        this.scheduler.release();
        this.dispatcherHolder.close();
    }
}
