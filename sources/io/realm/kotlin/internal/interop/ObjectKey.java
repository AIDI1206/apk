package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* JADX INFO: compiled from: RealmInterop.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u000f"}, d2 = {"Lio/realm/kotlin/internal/interop/ObjectKey;", "", "key", "", "constructor-impl", "(J)J", "getKey", "()J", "equals", "", "other", "hashCode", "", "toString", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
public final class ObjectKey {
    private final long key;

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ObjectKey m11376boximpl(long j) {
        return new ObjectKey(j);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m11377constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m11378equalsimpl(long j, Object obj) {
        return (obj instanceof ObjectKey) && j == ((ObjectKey) obj).m11382unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11379equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m11380hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m11381toStringimpl(long j) {
        return "ObjectKey(key=" + j + ')';
    }

    public boolean equals(Object other) {
        return m11378equalsimpl(this.key, other);
    }

    public int hashCode() {
        return m11380hashCodeimpl(this.key);
    }

    public String toString() {
        return m11381toStringimpl(this.key);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m11382unboximpl() {
        return this.key;
    }

    private /* synthetic */ ObjectKey(long j) {
        this.key = j;
    }

    public final long getKey() {
        return this.key;
    }
}
