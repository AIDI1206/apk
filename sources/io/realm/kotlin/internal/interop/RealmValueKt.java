package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: RealmValue.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0003H\u0000*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"RealmValueT", "Lio/realm/kotlin/internal/interop/realm_value_t;", "wrapPtrAsRealmValueT", "", "cinterop_release"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmValueKt {
    public static final realm_value_t wrapPtrAsRealmValueT(long j) {
        return new realm_value_t(j, false);
    }
}
