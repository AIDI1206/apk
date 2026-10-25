package io.realm.kotlin.schema;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmPropertyType.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lio/realm/kotlin/schema/MapPropertyType;", "Lio/realm/kotlin/schema/RealmPropertyType;", "storageType", "Lio/realm/kotlin/schema/RealmStorageType;", "isNullable", "", "<init>", "(Lio/realm/kotlin/schema/RealmStorageType;Z)V", "getStorageType", "()Lio/realm/kotlin/schema/RealmStorageType;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class MapPropertyType implements RealmPropertyType {
    private final boolean isNullable;
    private final RealmStorageType storageType;

    public static /* synthetic */ MapPropertyType copy$default(MapPropertyType mapPropertyType, RealmStorageType realmStorageType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            realmStorageType = mapPropertyType.storageType;
        }
        if ((i & 2) != 0) {
            z = mapPropertyType.isNullable;
        }
        return mapPropertyType.copy(realmStorageType, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RealmStorageType getStorageType() {
        return this.storageType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    public final MapPropertyType copy(RealmStorageType storageType, boolean isNullable) {
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        return new MapPropertyType(storageType, isNullable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapPropertyType)) {
            return false;
        }
        MapPropertyType mapPropertyType = (MapPropertyType) other;
        return this.storageType == mapPropertyType.storageType && this.isNullable == mapPropertyType.isNullable;
    }

    public int hashCode() {
        return (this.storageType.hashCode() * 31) + Boolean.hashCode(this.isNullable);
    }

    public String toString() {
        return "MapPropertyType(storageType=" + this.storageType + ", isNullable=" + this.isNullable + ')';
    }

    public MapPropertyType(RealmStorageType storageType, boolean z) {
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        this.storageType = storageType;
        this.isNullable = z;
    }

    public /* synthetic */ MapPropertyType(RealmStorageType realmStorageType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(realmStorageType, (i & 2) != 0 ? false : z);
    }

    @Override // io.realm.kotlin.schema.RealmPropertyType
    public RealmStorageType getStorageType() {
        return this.storageType;
    }

    @Override // io.realm.kotlin.schema.RealmPropertyType
    public boolean isNullable() {
        return this.isNullable;
    }
}
