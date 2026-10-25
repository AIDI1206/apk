package io.realm.kotlin.internal.interop.gc;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FinalizerRunnable.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0018\u0010\u0002\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/realm/kotlin/internal/interop/gc/FinalizerRunnable;", "Ljava/lang/Runnable;", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "Lio/realm/kotlin/internal/interop/LongPointerWrapper;", "<init>", "(Ljava/lang/ref/ReferenceQueue;)V", "run", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class FinalizerRunnable implements Runnable {
    private final ReferenceQueue<LongPointerWrapper<?>> referenceQueue;

    public FinalizerRunnable(ReferenceQueue<LongPointerWrapper<?>> referenceQueue) {
        Intrinsics.checkNotNullParameter(referenceQueue, "referenceQueue");
        this.referenceQueue = referenceQueue;
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                Reference<? extends LongPointerWrapper<?>> referenceRemove = this.referenceQueue.remove();
                Intrinsics.checkNotNull(referenceRemove, "null cannot be cast to non-null type io.realm.kotlin.internal.interop.gc.NativeObjectReference");
                ((NativeObjectReference) referenceRemove).cleanup();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                System.out.println((Object) "The FinalizerRunnable thread has been interrupted. Native resources cannot be freed anymore");
                return;
            }
        }
    }
}
