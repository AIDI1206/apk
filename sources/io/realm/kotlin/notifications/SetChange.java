package io.realm.kotlin.notifications;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.types.RealmSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: SetChange.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lio/realm/kotlin/notifications/SetChange;", ExifInterface.GPS_DIRECTION_TRUE, "", "set", "Lio/realm/kotlin/types/RealmSet;", "getSet", "()Lio/realm/kotlin/types/RealmSet;", "Lio/realm/kotlin/notifications/DeletedSet;", "Lio/realm/kotlin/notifications/InitialSet;", "Lio/realm/kotlin/notifications/UpdatedSet;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SetChange<T> {
    RealmSet<T> getSet();
}
