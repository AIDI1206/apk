package io.realm.kotlin.types;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.Deleteable;
import io.realm.kotlin.notifications.ListChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableList;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: RealmList.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J\u001e\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H¦\u0002¢\u0006\u0002\u0010\bJ&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH&¨\u0006\u000f"}, d2 = {"Lio/realm/kotlin/types/RealmList;", ExifInterface.LONGITUDE_EAST, "", "Lio/realm/kotlin/Deleteable;", "set", "index", "", "element", "(ILjava/lang/Object;)Ljava/lang/Object;", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/kotlin/notifications/ListChange;", "keyPaths", "", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmList<E> extends List<E>, Deleteable, KMutableList {
    Flow<ListChange<E>> asFlow(List<String> keyPaths);

    @Override // java.util.List
    E set(int index, E element);

    /* JADX INFO: compiled from: RealmList.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow asFlow$default(RealmList realmList, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asFlow");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return realmList.asFlow(list);
        }
    }
}
