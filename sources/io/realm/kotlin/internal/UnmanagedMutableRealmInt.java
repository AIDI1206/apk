package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.types.MutableRealmInt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MutableRealmIntInternal.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lio/realm/kotlin/internal/UnmanagedMutableRealmInt;", "Lio/realm/kotlin/types/MutableRealmInt;", "value", "", "<init>", "(J)V", "get", "set", "", "", "increment", "decrement", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UnmanagedMutableRealmInt extends MutableRealmInt {
    private long value;

    public UnmanagedMutableRealmInt() {
        this(0L, 1, null);
    }

    public /* synthetic */ UnmanagedMutableRealmInt(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }

    public UnmanagedMutableRealmInt(long j) {
        this.value = j;
    }

    @Override // io.realm.kotlin.types.MutableRealmInt
    /* JADX INFO: renamed from: get, reason: from getter */
    public long getValue() {
        return this.value;
    }

    @Override // io.realm.kotlin.types.MutableRealmInt
    public void set(Number value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value.longValue();
    }

    @Override // io.realm.kotlin.types.MutableRealmInt
    public void increment(Number value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value += value.longValue();
    }

    @Override // io.realm.kotlin.types.MutableRealmInt
    public void decrement(Number value) {
        Intrinsics.checkNotNullParameter(value, "value");
        increment(Long.valueOf(-value.longValue()));
    }
}
