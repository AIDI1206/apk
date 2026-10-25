package io.realm.kotlin.notifications;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;

/* JADX INFO: compiled from: ObjectChange.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/realm/kotlin/notifications/InitialObject;", "O", "Lio/realm/kotlin/types/BaseRealmObject;", "Lio/realm/kotlin/notifications/ObjectChange;", "obj", "getObj", "()Lio/realm/kotlin/types/BaseRealmObject;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface InitialObject<O extends BaseRealmObject> extends ObjectChange<O> {
    @Override // io.realm.kotlin.notifications.ObjectChange, io.realm.kotlin.notifications.SingleQueryChange
    O getObj();
}
