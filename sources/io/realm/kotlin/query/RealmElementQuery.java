package io.realm.kotlin.query;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.Deleteable;
import io.realm.kotlin.notifications.ResultsChange;
import io.realm.kotlin.types.BaseRealmObject;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: RealmElementQuery.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H&J&\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH&¨\u0006\f"}, d2 = {"Lio/realm/kotlin/query/RealmElementQuery;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/realm/kotlin/types/BaseRealmObject;", "Lio/realm/kotlin/Deleteable;", "find", "Lio/realm/kotlin/query/RealmResults;", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/kotlin/notifications/ResultsChange;", "keyPath", "", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmElementQuery<T extends BaseRealmObject> extends Deleteable {
    Flow<ResultsChange<T>> asFlow(List<String> keyPath);

    RealmResults<T> find();

    /* JADX INFO: compiled from: RealmElementQuery.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow asFlow$default(RealmElementQuery realmElementQuery, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asFlow");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return realmElementQuery.asFlow(list);
        }
    }
}
