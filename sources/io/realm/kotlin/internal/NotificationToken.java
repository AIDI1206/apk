package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.CapiT;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.notifications.internal.Cancellable;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.atomicfu.AtomicBoolean;
import kotlinx.atomicfu.AtomicFU;

/* JADX INFO: compiled from: NotificationToken.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003j\u0002`\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tj\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lio/realm/kotlin/internal/NotificationToken;", "Lio/realm/kotlin/notifications/internal/Cancellable;", "token", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/CapiT;", "Lio/realm/kotlin/internal/interop/RealmNativePointer;", "<init>", "(Lio/realm/kotlin/internal/interop/NativePointer;)V", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/atomicfu/locks/ReentrantLock;", "observer", "Lkotlinx/atomicfu/AtomicBoolean;", "cancel", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class NotificationToken implements Cancellable {
    private final ReentrantLock lock;
    private final AtomicBoolean observer;
    private final NativePointer<? extends CapiT> token;

    public NotificationToken(NativePointer<? extends CapiT> token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
        this.lock = new ReentrantLock();
        this.observer = AtomicFU.atomic(true);
    }

    @Override // io.realm.kotlin.notifications.internal.Cancellable
    public void cancel() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.observer.getValue()) {
                this.token.release();
            }
            this.observer.setValue(false);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}
