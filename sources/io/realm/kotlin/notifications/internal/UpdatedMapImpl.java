package io.realm.kotlin.notifications.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.notifications.MapChangeSet;
import io.realm.kotlin.notifications.UpdatedMap;
import io.realm.kotlin.types.RealmMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MapChangeImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\b\u0010\tR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lio/realm/kotlin/notifications/internal/UpdatedMapImpl;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lio/realm/kotlin/notifications/UpdatedMap;", "Lio/realm/kotlin/notifications/MapChangeSet;", "map", "Lio/realm/kotlin/types/RealmMap;", "mapChangeSet", "<init>", "(Lio/realm/kotlin/types/RealmMap;Lio/realm/kotlin/notifications/MapChangeSet;)V", "getMap", "()Lio/realm/kotlin/types/RealmMap;", "changes", "", "getChanges", "()[Ljava/lang/Object;", "deletions", "getDeletions", "insertions", "getInsertions", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UpdatedMapImpl<K, V> implements UpdatedMap<K, V>, MapChangeSet<K> {
    private final /* synthetic */ MapChangeSet<K> $$delegate_0;
    private final RealmMap<K, V> map;

    @Override // io.realm.kotlin.notifications.MapChangeSet
    public K[] getChanges() {
        return this.$$delegate_0.getChanges();
    }

    @Override // io.realm.kotlin.notifications.MapChangeSet
    public K[] getDeletions() {
        return this.$$delegate_0.getDeletions();
    }

    @Override // io.realm.kotlin.notifications.MapChangeSet
    public K[] getInsertions() {
        return this.$$delegate_0.getInsertions();
    }

    public UpdatedMapImpl(RealmMap<K, V> map, MapChangeSet<K> mapChangeSet) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(mapChangeSet, "mapChangeSet");
        this.$$delegate_0 = mapChangeSet;
        this.map = map;
    }

    @Override // io.realm.kotlin.notifications.MapChange
    public RealmMap<K, V> getMap() {
        return this.map;
    }
}
