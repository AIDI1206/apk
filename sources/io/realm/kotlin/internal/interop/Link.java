package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Link.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lio/realm/kotlin/internal/interop/Link;", "", "classKey", "Lio/realm/kotlin/internal/interop/ClassKey;", "objKey", "", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getClassKey-QNRHIEo", "()J", "setClassKey-JXC-ZB4", "(J)V", "J", "getObjKey", "setObjKey", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class Link {
    private long classKey;
    private long objKey;

    public /* synthetic */ Link(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    private Link(long j, long j2) {
        this.classKey = j;
        this.objKey = j2;
    }

    /* JADX INFO: renamed from: getClassKey-QNRHIEo, reason: not valid java name and from getter */
    public final long getClassKey() {
        return this.classKey;
    }

    /* JADX INFO: renamed from: setClassKey-JXC-ZB4, reason: not valid java name */
    public final void m11375setClassKeyJXCZB4(long j) {
        this.classKey = j;
    }

    public final long getObjKey() {
        return this.objKey;
    }

    public final void setObjKey(long j) {
        this.objKey = j;
    }
}
