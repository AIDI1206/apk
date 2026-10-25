package io.realm.kotlin.notifications.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.notifications.ListChangeSet;
import io.realm.kotlin.notifications.UpdatedResults;
import io.realm.kotlin.query.RealmResults;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResultsChangeImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0012\u0010\u0017\u001a\u00020\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0010R\u0012\u0010\u001b\u001a\u00020\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014¨\u0006\u001d"}, d2 = {"Lio/realm/kotlin/notifications/internal/UpdatedResultsImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/types/BaseRealmObject;", "Lio/realm/kotlin/notifications/UpdatedResults;", "Lio/realm/kotlin/notifications/ListChangeSet;", "list", "Lio/realm/kotlin/query/RealmResults;", "listChangeSet", "<init>", "(Lio/realm/kotlin/query/RealmResults;Lio/realm/kotlin/notifications/ListChangeSet;)V", "getList", "()Lio/realm/kotlin/query/RealmResults;", "changeRanges", "", "Lio/realm/kotlin/notifications/ListChangeSet$Range;", "getChangeRanges", "()[Lio/realm/kotlin/notifications/ListChangeSet$Range;", "changes", "", "getChanges", "()[I", "deletionRanges", "getDeletionRanges", "deletions", "getDeletions", "insertionRanges", "getInsertionRanges", "insertions", "getInsertions", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UpdatedResultsImpl<T extends BaseRealmObject> implements UpdatedResults<T>, ListChangeSet {
    private final /* synthetic */ ListChangeSet $$delegate_0;
    private final RealmResults<T> list;

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

    public UpdatedResultsImpl(RealmResults<T> list, ListChangeSet listChangeSet) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(listChangeSet, "listChangeSet");
        this.$$delegate_0 = listChangeSet;
        this.list = list;
    }

    @Override // io.realm.kotlin.notifications.ResultsChange
    public RealmResults<T> getList() {
        return this.list;
    }
}
