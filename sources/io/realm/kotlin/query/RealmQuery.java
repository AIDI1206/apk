package io.realm.kotlin.query;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.android.gms.actions.SearchIntents;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: RealmQuery.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J3\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\nJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eH&JS\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u00102*\u0010\u0011\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u00100\b\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u0010H&¢\u0006\u0002\u0010\u0012J/\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\u00062\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b\"\u00020\u0006H&¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00020\u0017H&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H&J.\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00010\u001b\"\b\b\u0001\u0010\u0001*\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00010\u001dH&J.\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00010\u001b\"\b\b\u0001\u0010\u0001*\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00010\u001dH&J.\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00010 \"\b\b\u0001\u0010\u0001*\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00010\u001dH&J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0 H&J\b\u0010#\u001a\u00020\u0006H&¨\u0006$"}, d2 = {"Lio/realm/kotlin/query/RealmQuery;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/types/BaseRealmObject;", "Lio/realm/kotlin/query/RealmElementQuery;", SearchIntents.EXTRA_QUERY, "filter", "", "arguments", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Lio/realm/kotlin/query/RealmQuery;", "sort", "property", "sortOrder", "Lio/realm/kotlin/query/Sort;", "propertyAndSortOrder", "Lkotlin/Pair;", "additionalPropertiesAndOrders", "(Lkotlin/Pair;[Lkotlin/Pair;)Lio/realm/kotlin/query/RealmQuery;", "distinct", "extraProperties", "(Ljava/lang/String;[Ljava/lang/String;)Lio/realm/kotlin/query/RealmQuery;", "limit", "", "first", "Lio/realm/kotlin/query/RealmSingleQuery;", "min", "Lio/realm/kotlin/query/RealmScalarNullableQuery;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lkotlin/reflect/KClass;", "max", "sum", "Lio/realm/kotlin/query/RealmScalarQuery;", "count", "", "description", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmQuery<T extends BaseRealmObject> extends RealmElementQuery<T> {
    RealmScalarQuery<Long> count();

    String description();

    RealmQuery<T> distinct(String property, String... extraProperties);

    RealmSingleQuery<T> first();

    RealmQuery<T> limit(int limit);

    <T> RealmScalarNullableQuery<T> max(String property, KClass<T> type);

    <T> RealmScalarNullableQuery<T> min(String property, KClass<T> type);

    RealmQuery<T> query(String filter, Object... arguments);

    RealmQuery<T> sort(String property, Sort sortOrder);

    RealmQuery<T> sort(Pair<String, ? extends Sort> propertyAndSortOrder, Pair<String, ? extends Sort>... additionalPropertiesAndOrders);

    <T> RealmScalarQuery<T> sum(String property, KClass<T> type);

    /* JADX INFO: compiled from: RealmQuery.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ RealmQuery sort$default(RealmQuery realmQuery, String str, Sort sort, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sort");
            }
            if ((i & 2) != 0) {
                sort = Sort.ASCENDING;
            }
            return realmQuery.sort(str, sort);
        }
    }
}
