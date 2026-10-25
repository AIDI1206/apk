package io.realm.kotlin.notifications.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.notifications.SetChangeSet;
import io.realm.kotlin.notifications.UpdatedSet;
import io.realm.kotlin.types.RealmSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SetChangeImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lio/realm/kotlin/notifications/internal/UpdatedSetImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/notifications/UpdatedSet;", "Lio/realm/kotlin/notifications/SetChangeSet;", "set", "Lio/realm/kotlin/types/RealmSet;", "setChangeSet", "<init>", "(Lio/realm/kotlin/types/RealmSet;Lio/realm/kotlin/notifications/SetChangeSet;)V", "getSet", "()Lio/realm/kotlin/types/RealmSet;", "deletions", "", "getDeletions", "()I", "insertions", "getInsertions", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UpdatedSetImpl<T> implements UpdatedSet<T>, SetChangeSet {
    private final /* synthetic */ SetChangeSet $$delegate_0;
    private final RealmSet<T> set;

    @Override // io.realm.kotlin.notifications.SetChangeSet
    public int getDeletions() {
        return this.$$delegate_0.getDeletions();
    }

    @Override // io.realm.kotlin.notifications.SetChangeSet
    public int getInsertions() {
        return this.$$delegate_0.getInsertions();
    }

    public UpdatedSetImpl(RealmSet<T> set, SetChangeSet setChangeSet) {
        Intrinsics.checkNotNullParameter(set, "set");
        Intrinsics.checkNotNullParameter(setChangeSet, "setChangeSet");
        this.$$delegate_0 = setChangeSet;
        this.set = set;
    }

    @Override // io.realm.kotlin.notifications.SetChange
    public RealmSet<T> getSet() {
        return this.set;
    }
}
