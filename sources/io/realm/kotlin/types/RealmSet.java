package io.realm.kotlin.types;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.Deleteable;
import io.realm.kotlin.notifications.SetChange;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableSet;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: RealmSet.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&¨\u0006\n"}, d2 = {"Lio/realm/kotlin/types/RealmSet;", ExifInterface.LONGITUDE_EAST, "", "Lio/realm/kotlin/Deleteable;", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/kotlin/notifications/SetChange;", "keyPaths", "", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmSet<E> extends Set<E>, Deleteable, KMutableSet {
    Flow<SetChange<E>> asFlow(List<String> keyPaths);

    /* JADX INFO: compiled from: RealmSet.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow asFlow$default(RealmSet realmSet, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asFlow");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return realmSet.asFlow(list);
        }
    }
}
