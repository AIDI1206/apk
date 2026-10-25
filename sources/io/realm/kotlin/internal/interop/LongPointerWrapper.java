package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.internal.interop.CapiT;
import io.realm.kotlin.internal.interop.gc.NativeContext;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LongPointerWrapper.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lio/realm/kotlin/internal/interop/LongPointerWrapper;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/internal/interop/CapiT;", "Lio/realm/kotlin/internal/interop/NativePointer;", "ptr", "", "managed", "", "<init>", "(JZ)V", "released", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getReleased$cinterop_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "_ptr", "getPtr$cinterop_release", "()J", "release", "", "isReleased", "toString", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LongPointerWrapper<T extends CapiT> implements NativePointer<T> {
    private final long _ptr;
    private final AtomicBoolean released;

    public LongPointerWrapper(long j, boolean z) {
        this.released = new AtomicBoolean(false);
        this._ptr = j;
        if (z) {
            NativeContext.INSTANCE.addReference(this);
        }
    }

    public /* synthetic */ LongPointerWrapper(long j, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: getReleased$cinterop_release, reason: from getter */
    public final AtomicBoolean getReleased() {
        return this.released;
    }

    public final long getPtr$cinterop_release() {
        if (!this.released.get()) {
            return this._ptr;
        }
        throw NativePointerKt.getPOINTER_DELETED_ERROR();
    }

    @Override // io.realm.kotlin.internal.interop.NativePointer
    public void release() {
        if (this.released.compareAndSet(false, true)) {
            realmc.realm_release(this._ptr);
        }
    }

    @Override // io.realm.kotlin.internal.interop.NativePointer
    public boolean isReleased() {
        return this.released.get();
    }

    public String toString() {
        String hexString = Long.toHexString(this._ptr);
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
        return hexString;
    }
}
