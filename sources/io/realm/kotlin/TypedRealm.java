package io.realm.kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.actions.SearchIntents;
import io.realm.kotlin.query.RealmQuery;
import io.realm.kotlin.query.RealmQueryKt;
import io.realm.kotlin.types.RealmDictionary;
import io.realm.kotlin.types.TypedRealmObject;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: TypedRealm.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JM\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00072\b\b\u0002\u0010\u0002\u001a\u00020\b2\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010\fJ+\u0010\r\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\u0006\u0010\u000e\u001a\u0002H\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0013\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00152\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0016JA\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\u0017\"\b\b\u0000\u0010\u0004*\u00020\u00052\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00040\u00192\b\b\u0002\u0010\u000f\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u001a¨\u0006\u001b"}, d2 = {"Lio/realm/kotlin/TypedRealm;", "Lio/realm/kotlin/BaseRealm;", SearchIntents.EXTRA_QUERY, "Lio/realm/kotlin/query/RealmQuery;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/types/TypedRealmObject;", "clazz", "Lkotlin/reflect/KClass;", "", "args", "", "", "(Lkotlin/reflect/KClass;Ljava/lang/String;[Ljava/lang/Object;)Lio/realm/kotlin/query/RealmQuery;", "copyFromRealm", "obj", "depth", "Lkotlin/UInt;", "copyFromRealm-Qn1smSk", "(Lio/realm/kotlin/types/TypedRealmObject;I)Lio/realm/kotlin/types/TypedRealmObject;", "", "collection", "", "(Ljava/lang/Iterable;I)Ljava/util/List;", "", "dictionary", "Lio/realm/kotlin/types/RealmDictionary;", "(Lio/realm/kotlin/types/RealmDictionary;I)Ljava/util/Map;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface TypedRealm extends BaseRealm {
    /* JADX INFO: renamed from: copyFromRealm-Qn1smSk, reason: not valid java name */
    <T extends TypedRealmObject> T mo11243copyFromRealmQn1smSk(T obj, int depth);

    /* JADX INFO: renamed from: copyFromRealm-Qn1smSk, reason: not valid java name */
    <T extends TypedRealmObject> List<T> mo11244copyFromRealmQn1smSk(Iterable<? extends T> collection, int depth);

    /* JADX INFO: renamed from: copyFromRealm-Qn1smSk, reason: not valid java name */
    <T extends TypedRealmObject> Map<String, T> mo11245copyFromRealmQn1smSk(RealmDictionary<T> dictionary, int depth);

    <T extends TypedRealmObject> RealmQuery<T> query(KClass<T> clazz, String query, Object... args);

    /* JADX INFO: compiled from: TypedRealm.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ RealmQuery query$default(TypedRealm typedRealm, KClass kClass, String str, Object[] objArr, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
            }
            if ((i & 2) != 0) {
                str = RealmQueryKt.TRUE_PREDICATE;
            }
            return typedRealm.query(kClass, str, objArr);
        }

        /* JADX INFO: renamed from: copyFromRealm-Qn1smSk$default, reason: not valid java name */
        public static /* synthetic */ TypedRealmObject m11246copyFromRealmQn1smSk$default(TypedRealm typedRealm, TypedRealmObject typedRealmObject, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyFromRealm-Qn1smSk");
            }
            if ((i2 & 2) != 0) {
                i = -1;
            }
            return typedRealm.mo11243copyFromRealmQn1smSk(typedRealmObject, i);
        }

        /* JADX INFO: renamed from: copyFromRealm-Qn1smSk$default, reason: not valid java name */
        public static /* synthetic */ List m11247copyFromRealmQn1smSk$default(TypedRealm typedRealm, Iterable iterable, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyFromRealm-Qn1smSk");
            }
            if ((i2 & 2) != 0) {
                i = -1;
            }
            return typedRealm.mo11244copyFromRealmQn1smSk(iterable, i);
        }

        /* JADX INFO: renamed from: copyFromRealm-Qn1smSk$default, reason: not valid java name */
        public static /* synthetic */ Map m11248copyFromRealmQn1smSk$default(TypedRealm typedRealm, RealmDictionary realmDictionary, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyFromRealm-Qn1smSk");
            }
            if ((i2 & 2) != 0) {
                i = -1;
            }
            return typedRealm.mo11245copyFromRealmQn1smSk(realmDictionary, i);
        }
    }
}
