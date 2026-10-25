package io.realm.kotlin.internal.interop.gc;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.CapiT;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import java.lang.ref.ReferenceQueue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeContext.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/realm/kotlin/internal/interop/gc/NativeContext;", "", "<init>", "()V", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "Lio/realm/kotlin/internal/interop/LongPointerWrapper;", "Lio/realm/kotlin/internal/interop/CapiT;", "finalizingThread", "Ljava/lang/Thread;", "addReference", "", "referent", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class NativeContext {
    public static final NativeContext INSTANCE = new NativeContext();
    private static final Thread finalizingThread;
    private static final ReferenceQueue<LongPointerWrapper<? extends CapiT>> referenceQueue;

    private NativeContext() {
    }

    static {
        ReferenceQueue<LongPointerWrapper<? extends CapiT>> referenceQueue2 = new ReferenceQueue<>();
        referenceQueue = referenceQueue2;
        Thread thread = new Thread(new FinalizerRunnable(referenceQueue2));
        finalizingThread = thread;
        thread.setName("RealmFinalizingDaemon");
        thread.setDaemon(true);
        thread.setPriority(5);
        thread.start();
    }

    public final void addReference(LongPointerWrapper<? extends CapiT> referent) {
        Intrinsics.checkNotNullParameter(referent, "referent");
        new NativeObjectReference(this, referent, referenceQueue);
    }
}
