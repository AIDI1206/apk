package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmValue.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/realm/kotlin/internal/interop/RealmQueryArgumentList;", "", "size", "", TtmlNode.TAG_HEAD, "Lio/realm/kotlin/internal/interop/realm_query_arg_t;", "<init>", "(JLio/realm/kotlin/internal/interop/realm_query_arg_t;)V", "getSize", "()J", "getHead", "()Lio/realm/kotlin/internal/interop/realm_query_arg_t;", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmQueryArgumentList {
    private final realm_query_arg_t head;
    private final long size;

    public RealmQueryArgumentList(long j, realm_query_arg_t head) {
        Intrinsics.checkNotNullParameter(head, "head");
        this.size = j;
        this.head = head;
    }

    public final realm_query_arg_t getHead() {
        return this.head;
    }

    public final long getSize() {
        return this.size;
    }
}
