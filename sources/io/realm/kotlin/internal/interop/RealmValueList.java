package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmValue.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lio/realm/kotlin/internal/interop/RealmValueList;", "", "size", "", TtmlNode.TAG_HEAD, "Lio/realm/kotlin/internal/interop/realm_value_t;", "<init>", "(ILio/realm/kotlin/internal/interop/realm_value_t;)V", "getSize", "()I", "getHead", "()Lio/realm/kotlin/internal/interop/realm_value_t;", "set", "", "index", "value", "Lio/realm/kotlin/internal/interop/RealmValue;", "set-7Gcd38g", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmValueList {
    private final realm_value_t head;
    private final int size;

    public RealmValueList(int i, realm_value_t head) {
        Intrinsics.checkNotNullParameter(head, "head");
        this.size = i;
        this.head = head;
    }

    public final realm_value_t getHead() {
        return this.head;
    }

    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: set-7Gcd38g, reason: not valid java name */
    public final void m11469set7Gcd38g(int index, realm_value_t value) {
        Intrinsics.checkNotNullParameter(value, "value");
        realmc.valueArray_setitem(this.head, index, value);
    }
}
