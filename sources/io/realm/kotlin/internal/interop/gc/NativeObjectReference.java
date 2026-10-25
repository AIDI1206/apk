package io.realm.kotlin.internal.interop.gc;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmc;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NativeObjectReference.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00122\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0002\u0012\u0013B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\n\b\u0000\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lio/realm/kotlin/internal/interop/gc/NativeObjectReference;", "Ljava/lang/ref/PhantomReference;", "Lio/realm/kotlin/internal/interop/LongPointerWrapper;", "context", "Lio/realm/kotlin/internal/interop/gc/NativeContext;", "referent", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "<init>", "(Lio/realm/kotlin/internal/interop/gc/NativeContext;Lio/realm/kotlin/internal/interop/LongPointerWrapper;Ljava/lang/ref/ReferenceQueue;)V", "isReleased", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ptr", "", "prev", "next", "cleanup", "", "Companion", "ReferencePool", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class NativeObjectReference extends PhantomReference<LongPointerWrapper<?>> {
    private static final ReferencePool referencePool = new ReferencePool();
    private final NativeContext context;
    private final AtomicBoolean isReleased;
    private NativeObjectReference next;
    private NativeObjectReference prev;
    private final long ptr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeObjectReference(NativeContext context, LongPointerWrapper<?> referent, ReferenceQueue<? super LongPointerWrapper<?>> referenceQueue) {
        super(referent, referenceQueue);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(referent, "referent");
        this.context = context;
        this.isReleased = referent.getReleased();
        this.ptr = referent.getPtr$cinterop_release();
        referencePool.add(this);
    }

    public final void cleanup() {
        synchronized (this.context) {
            if (this.isReleased.compareAndSet(false, true)) {
                realmc.realm_release(this.ptr);
            }
            Unit unit = Unit.INSTANCE;
        }
        referencePool.remove(this);
    }

    /* JADX INFO: compiled from: NativeObjectReference.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lio/realm/kotlin/internal/interop/gc/NativeObjectReference$ReferencePool;", "", "<init>", "()V", TtmlNode.TAG_HEAD, "Lio/realm/kotlin/internal/interop/gc/NativeObjectReference;", "getHead", "()Lio/realm/kotlin/internal/interop/gc/NativeObjectReference;", "setHead", "(Lio/realm/kotlin/internal/interop/gc/NativeObjectReference;)V", "add", "", "ref", "remove", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    private static final class ReferencePool {
        private NativeObjectReference head;

        public final NativeObjectReference getHead() {
            return this.head;
        }

        public final void setHead(NativeObjectReference nativeObjectReference) {
            this.head = nativeObjectReference;
        }

        public final synchronized void add(NativeObjectReference ref) {
            Intrinsics.checkNotNullParameter(ref, "ref");
            ref.prev = null;
            ref.next = this.head;
            NativeObjectReference nativeObjectReference = this.head;
            if (nativeObjectReference != null) {
                Intrinsics.checkNotNull(nativeObjectReference);
                nativeObjectReference.prev = ref;
            }
            this.head = ref;
        }

        public final synchronized void remove(NativeObjectReference ref) {
            Intrinsics.checkNotNullParameter(ref, "ref");
            NativeObjectReference nativeObjectReference = ref.next;
            NativeObjectReference nativeObjectReference2 = ref.prev;
            ref.next = null;
            ref.prev = null;
            if (nativeObjectReference2 != null) {
                nativeObjectReference2.next = nativeObjectReference;
            } else {
                this.head = nativeObjectReference;
            }
            if (nativeObjectReference != null) {
                nativeObjectReference.prev = nativeObjectReference2;
            }
        }
    }
}
