package io.realm.kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.actions.SearchIntents;
import io.realm.kotlin.query.RealmQuery;
import io.realm.kotlin.types.BaseRealmObject;
import io.realm.kotlin.types.RealmObject;
import io.realm.kotlin.types.TypedRealmObject;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: MutableRealm.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H&¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH&J)\u0010\t\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\u00032\b\b\u0002\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u000eJK\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0010\"\b\b\u0000\u0010\u0003*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00132\u0006\u0010\u000f\u001a\u00020\u00142\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00170\u0016\"\u0004\u0018\u00010\u0017H&¢\u0006\u0002\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\bH&J \u0010\u0019\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00112\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0013H&¨\u0006\u001e"}, d2 = {"Lio/realm/kotlin/MutableRealm;", "Lio/realm/kotlin/TypedRealm;", "findLatest", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/types/BaseRealmObject;", "obj", "(Lio/realm/kotlin/types/BaseRealmObject;)Lio/realm/kotlin/types/BaseRealmObject;", "cancelWrite", "", "copyToRealm", "Lio/realm/kotlin/types/RealmObject;", "instance", "updatePolicy", "Lio/realm/kotlin/UpdatePolicy;", "(Lio/realm/kotlin/types/RealmObject;Lio/realm/kotlin/UpdatePolicy;)Lio/realm/kotlin/types/RealmObject;", SearchIntents.EXTRA_QUERY, "Lio/realm/kotlin/query/RealmQuery;", "Lio/realm/kotlin/types/TypedRealmObject;", "clazz", "Lkotlin/reflect/KClass;", "", "args", "", "", "(Lkotlin/reflect/KClass;Ljava/lang/String;[Ljava/lang/Object;)Lio/realm/kotlin/query/RealmQuery;", "delete", "deleteable", "Lio/realm/kotlin/Deleteable;", "deleteAll", "schemaClass", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface MutableRealm extends TypedRealm {
    void cancelWrite();

    <T extends RealmObject> T copyToRealm(T instance, UpdatePolicy updatePolicy);

    void delete(Deleteable deleteable);

    <T extends TypedRealmObject> void delete(KClass<T> schemaClass);

    void deleteAll();

    <T extends BaseRealmObject> T findLatest(T obj);

    @Override // io.realm.kotlin.TypedRealm
    <T extends TypedRealmObject> RealmQuery<T> query(KClass<T> clazz, String query, Object... args);

    /* JADX INFO: compiled from: MutableRealm.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ RealmObject copyToRealm$default(MutableRealm mutableRealm, RealmObject realmObject, UpdatePolicy updatePolicy, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyToRealm");
            }
            if ((i & 2) != 0) {
                updatePolicy = UpdatePolicy.ERROR;
            }
            return mutableRealm.copyToRealm(realmObject, updatePolicy);
        }
    }
}
