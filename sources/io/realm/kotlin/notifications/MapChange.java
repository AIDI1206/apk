package io.realm.kotlin.notifications;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.types.RealmMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: MapChange.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003R\u001e\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lio/realm/kotlin/notifications/MapChange;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "map", "Lio/realm/kotlin/types/RealmMap;", "getMap", "()Lio/realm/kotlin/types/RealmMap;", "Lio/realm/kotlin/notifications/DeletedMap;", "Lio/realm/kotlin/notifications/InitialMap;", "Lio/realm/kotlin/notifications/UpdatedMap;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface MapChange<K, V> {
    RealmMap<K, V> getMap();
}
