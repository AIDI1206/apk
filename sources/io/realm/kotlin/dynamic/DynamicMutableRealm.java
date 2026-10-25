package io.realm.kotlin.dynamic;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import io.realm.kotlin.Deleteable;
import io.realm.kotlin.UpdatePolicy;
import io.realm.kotlin.query.RealmQuery;
import kotlin.Metadata;

/* JADX INFO: compiled from: DynamicMutableRealm.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J;\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0\r\"\u0004\u0018\u00010\u000eH&¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\u0015\u001a\u00020\u0012H&¨\u0006\u0016"}, d2 = {"Lio/realm/kotlin/dynamic/DynamicMutableRealm;", "Lio/realm/kotlin/dynamic/DynamicRealm;", "copyToRealm", "Lio/realm/kotlin/dynamic/DynamicMutableRealmObject;", "obj", "Lio/realm/kotlin/dynamic/DynamicRealmObject;", "updatePolicy", "Lio/realm/kotlin/UpdatePolicy;", SearchIntents.EXTRA_QUERY, "Lio/realm/kotlin/query/RealmQuery;", "className", "", "args", "", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Lio/realm/kotlin/query/RealmQuery;", "findLatest", "delete", "", "deleteable", "Lio/realm/kotlin/Deleteable;", "deleteAll", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface DynamicMutableRealm extends DynamicRealm {
    DynamicMutableRealmObject copyToRealm(DynamicRealmObject obj, UpdatePolicy updatePolicy);

    void delete(Deleteable deleteable);

    void delete(String className);

    void deleteAll();

    DynamicMutableRealmObject findLatest(DynamicRealmObject obj);

    @Override // io.realm.kotlin.dynamic.DynamicRealm
    RealmQuery<DynamicMutableRealmObject> query(String className, String query, Object... args);

    /* JADX INFO: compiled from: DynamicMutableRealm.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ DynamicMutableRealmObject copyToRealm$default(DynamicMutableRealm dynamicMutableRealm, DynamicRealmObject dynamicRealmObject, UpdatePolicy updatePolicy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyToRealm");
            }
            if ((i & 2) != 0) {
                updatePolicy = UpdatePolicy.ERROR;
            }
            return dynamicMutableRealm.copyToRealm(dynamicRealmObject, updatePolicy);
        }
    }
}
