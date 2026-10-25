package io.realm.kotlin.internal.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: CoroutineDispatcherFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lio/realm/kotlin/internal/util/UnmanagedDispatcherHolder;", "Lio/realm/kotlin/internal/util/DispatcherHolder;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "close", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final class UnmanagedDispatcherHolder implements DispatcherHolder {
    private final CoroutineDispatcher dispatcher;

    @Override // io.realm.kotlin.internal.util.DispatcherHolder
    public void close() {
    }

    public UnmanagedDispatcherHolder(CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
    }

    @Override // io.realm.kotlin.internal.util.DispatcherHolder
    public CoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }
}
