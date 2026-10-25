package io.realm.kotlin.notifications.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.notifications.ListChangeSet;
import io.realm.kotlin.notifications.UpdatedList;
import io.realm.kotlin.types.RealmList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ListChangeImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0012\u0010\u0016\u001a\u00020\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0012\u0010\u001a\u001a\u00020\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, d2 = {"Lio/realm/kotlin/notifications/internal/UpdatedListImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/notifications/UpdatedList;", "Lio/realm/kotlin/notifications/ListChangeSet;", "list", "Lio/realm/kotlin/types/RealmList;", "listChangeSet", "<init>", "(Lio/realm/kotlin/types/RealmList;Lio/realm/kotlin/notifications/ListChangeSet;)V", "getList", "()Lio/realm/kotlin/types/RealmList;", "changeRanges", "", "Lio/realm/kotlin/notifications/ListChangeSet$Range;", "getChangeRanges", "()[Lio/realm/kotlin/notifications/ListChangeSet$Range;", "changes", "", "getChanges", "()[I", "deletionRanges", "getDeletionRanges", "deletions", "getDeletions", "insertionRanges", "getInsertionRanges", "insertions", "getInsertions", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UpdatedListImpl<T> implements UpdatedList<T>, ListChangeSet {
    private final /* synthetic */ ListChangeSet $$delegate_0;
    private final RealmList<T> list;

    @Override // io.realm.kotlin.notifications.ListChangeSet
    public ListChangeSet.Range[] getChangeRanges() {
        return this.$$delegate_0.getChangeRanges();
    }

    @Override // io.realm.kotlin.notifications.ListChangeSet
    public int[] getChanges() {
        return this.$$delegate_0.getChanges();
    }

    @Override // io.realm.kotlin.notifications.ListChangeSet
    public ListChangeSet.Range[] getDeletionRanges() {
        return this.$$delegate_0.getDeletionRanges();
    }

    @Override // io.realm.kotlin.notifications.ListChangeSet
    public int[] getDeletions() {
        return this.$$delegate_0.getDeletions();
    }

    @Override // io.realm.kotlin.notifications.ListChangeSet
    public ListChangeSet.Range[] getInsertionRanges() {
        return this.$$delegate_0.getInsertionRanges();
    }

    @Override // io.realm.kotlin.notifications.ListChangeSet
    public int[] getInsertions() {
        return this.$$delegate_0.getInsertions();
    }

    public UpdatedListImpl(RealmList<T> list, ListChangeSet listChangeSet) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(listChangeSet, "listChangeSet");
        this.$$delegate_0 = listChangeSet;
        this.list = list;
    }

    @Override // io.realm.kotlin.notifications.ListChange
    public RealmList<T> getList() {
        return this.list;
    }
}
