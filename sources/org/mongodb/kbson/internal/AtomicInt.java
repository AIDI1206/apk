package org.mongodb.kbson.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: compiled from: AtomicInt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/mongodb/kbson/internal/AtomicInt;", "", "initial", "", "(I)V", "value", "Ljava/util/concurrent/atomic/AtomicInteger;", "addAndGet", "delta", "compareAndSet", "", "expected", "new", "decrement", "", "getValue", "increment", "kbson_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AtomicInt {
    private final AtomicInteger value;

    public AtomicInt(int i) {
        this.value = new AtomicInteger(i);
    }

    public final int getValue() {
        return this.value.get();
    }

    public final int addAndGet(int delta) {
        return this.value.addAndGet(delta);
    }

    public final boolean compareAndSet(int expected, int i) {
        return this.value.compareAndSet(expected, i);
    }

    public final void increment() {
        this.value.incrementAndGet();
    }

    public final void decrement() {
        this.value.decrementAndGet();
    }
}
