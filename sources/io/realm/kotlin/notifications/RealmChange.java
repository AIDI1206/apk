package io.realm.kotlin.notifications;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.BaseRealm;
import kotlin.Metadata;

/* JADX INFO: compiled from: RealmChange.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lio/realm/kotlin/notifications/RealmChange;", "R", "Lio/realm/kotlin/BaseRealm;", "", "realm", "getRealm", "()Lio/realm/kotlin/BaseRealm;", "Lio/realm/kotlin/notifications/InitialRealm;", "Lio/realm/kotlin/notifications/UpdatedRealm;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmChange<R extends BaseRealm> {
    R getRealm();
}
