package io.realm.kotlin.types;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.notifications.MapChange;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: RealmMap.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003J,\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&¨\u0006\n"}, d2 = {"Lio/realm/kotlin/types/RealmMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/realm/kotlin/notifications/MapChange;", "keyPaths", "", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmMap<K, V> extends Map<K, V>, KMutableMap {
    Flow<MapChange<K, V>> asFlow(List<String> keyPaths);

    /* JADX INFO: compiled from: RealmMap.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow asFlow$default(RealmMap realmMap, List list, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asFlow");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return realmMap.asFlow(list);
        }
    }
}
