package io.realm.kotlin.query;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.actions.SearchIntents;
import io.realm.kotlin.Deleteable;
import io.realm.kotlin.Versioned;
import io.realm.kotlin.notifications.ResultsChange;
import io.realm.kotlin.types.BaseRealmObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: RealmResults.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u00020\u0005J5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\b\u0002\u0010\u0006\u001a\u00020\b2\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000bH&¢\u0006\u0002\u0010\fJ&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003H&¨\u0006\u0011"}, d2 = {"Lio/realm/kotlin/query/RealmResults;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/types/BaseRealmObject;", "", "Lio/realm/kotlin/Deleteable;", "Lio/realm/kotlin/Versioned;", SearchIntents.EXTRA_QUERY, "Lio/realm/kotlin/query/RealmQuery;", "", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Lio/realm/kotlin/query/RealmQuery;", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/kotlin/notifications/ResultsChange;", "keyPaths", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmResults<T extends BaseRealmObject> extends List<T>, Deleteable, Versioned, KMappedMarker {
    Flow<ResultsChange<T>> asFlow(List<String> keyPaths);

    RealmQuery<T> query(String query, Object... args);

    /* JADX INFO: compiled from: RealmResults.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ RealmQuery query$default(RealmResults realmResults, String str, Object[] objArr, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
            }
            if ((i & 1) != 0) {
                str = RealmQueryKt.TRUE_PREDICATE;
            }
            return realmResults.query(str, objArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow asFlow$default(RealmResults realmResults, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asFlow");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return realmResults.asFlow(list);
        }
    }
}
