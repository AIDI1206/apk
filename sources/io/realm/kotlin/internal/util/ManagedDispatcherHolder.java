package io.realm.kotlin.internal.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

/* JADX INFO: compiled from: CoroutineDispatcherFactory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016R\u0018\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lio/realm/kotlin/internal/util/ManagedDispatcherHolder;", "Lio/realm/kotlin/internal/util/DispatcherHolder;", "dispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/CloseableCoroutineDispatcher;", "<init>", "(Lkotlinx/coroutines/ExecutorCoroutineDispatcher;)V", "getDispatcher", "()Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "close", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final class ManagedDispatcherHolder implements DispatcherHolder {
    private final ExecutorCoroutineDispatcher dispatcher;

    public ManagedDispatcherHolder(ExecutorCoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
    }

    @Override // io.realm.kotlin.internal.util.DispatcherHolder
    public ExecutorCoroutineDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @Override // io.realm.kotlin.internal.util.DispatcherHolder
    public void close() {
        getDispatcher().close();
    }
}
