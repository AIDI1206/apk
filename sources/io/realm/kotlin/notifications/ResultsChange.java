package io.realm.kotlin.notifications;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.query.RealmResults;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;

/* JADX INFO: compiled from: ResultsChange.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lio/realm/kotlin/notifications/ResultsChange;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/types/BaseRealmObject;", "", "list", "Lio/realm/kotlin/query/RealmResults;", "getList", "()Lio/realm/kotlin/query/RealmResults;", "Lio/realm/kotlin/notifications/InitialResults;", "Lio/realm/kotlin/notifications/UpdatedResults;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ResultsChange<T extends BaseRealmObject> {
    RealmResults<T> getList();
}
