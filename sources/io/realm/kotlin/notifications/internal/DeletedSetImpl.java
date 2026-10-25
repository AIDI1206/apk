package io.realm.kotlin.notifications.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.notifications.DeletedSet;
import io.realm.kotlin.types.RealmSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SetChangeImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/realm/kotlin/notifications/internal/DeletedSetImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/notifications/DeletedSet;", "set", "Lio/realm/kotlin/types/RealmSet;", "<init>", "(Lio/realm/kotlin/types/RealmSet;)V", "getSet", "()Lio/realm/kotlin/types/RealmSet;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DeletedSetImpl<T> implements DeletedSet<T> {
    private final RealmSet<T> set;

    public DeletedSetImpl(RealmSet<T> set) {
        Intrinsics.checkNotNullParameter(set, "set");
        this.set = set;
    }

    @Override // io.realm.kotlin.notifications.SetChange
    public RealmSet<T> getSet() {
        return this.set;
    }
}
