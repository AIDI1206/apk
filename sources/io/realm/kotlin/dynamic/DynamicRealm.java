package io.realm.kotlin.dynamic;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import io.realm.kotlin.BaseRealm;
import io.realm.kotlin.query.RealmQuery;
import io.realm.kotlin.query.RealmQueryKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: DynamicRealm.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00062\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lio/realm/kotlin/dynamic/DynamicRealm;", "Lio/realm/kotlin/BaseRealm;", SearchIntents.EXTRA_QUERY, "Lio/realm/kotlin/query/RealmQuery;", "Lio/realm/kotlin/dynamic/DynamicRealmObject;", "className", "", "args", "", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Lio/realm/kotlin/query/RealmQuery;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface DynamicRealm extends BaseRealm {
    RealmQuery<? extends DynamicRealmObject> query(String className, String query, Object... args);

    /* JADX INFO: compiled from: DynamicRealm.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ RealmQuery query$default(DynamicRealm dynamicRealm, String str, String str2, Object[] objArr, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
            }
            if ((i & 2) != 0) {
                str2 = RealmQueryKt.TRUE_PREDICATE;
            }
            return dynamicRealm.query(str, str2, objArr);
        }
    }
}
