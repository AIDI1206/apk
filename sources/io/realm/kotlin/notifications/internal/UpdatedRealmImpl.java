package io.realm.kotlin.notifications.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.BaseRealm;
import io.realm.kotlin.notifications.UpdatedRealm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmChangeImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lio/realm/kotlin/notifications/internal/UpdatedRealmImpl;", "R", "Lio/realm/kotlin/BaseRealm;", "Lio/realm/kotlin/notifications/UpdatedRealm;", "realm", "<init>", "(Lio/realm/kotlin/BaseRealm;)V", "getRealm", "()Lio/realm/kotlin/BaseRealm;", "Lio/realm/kotlin/BaseRealm;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UpdatedRealmImpl<R extends BaseRealm> implements UpdatedRealm<R> {
    private final R realm;

    public UpdatedRealmImpl(R realm) {
        Intrinsics.checkNotNullParameter(realm, "realm");
        this.realm = realm;
    }

    @Override // io.realm.kotlin.notifications.RealmChange
    public R getRealm() {
        return this.realm;
    }
}
