package io.realm.kotlin.schema;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmPropertyType.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/realm/kotlin/schema/ListPropertyType;", "Lio/realm/kotlin/schema/RealmPropertyType;", "storageType", "Lio/realm/kotlin/schema/RealmStorageType;", "isNullable", "", "isComputed", "<init>", "(Lio/realm/kotlin/schema/RealmStorageType;ZZ)V", "getStorageType", "()Lio/realm/kotlin/schema/RealmStorageType;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ListPropertyType implements RealmPropertyType {
    private final boolean isComputed;
    private final boolean isNullable;
    private final RealmStorageType storageType;

    public static /* synthetic */ ListPropertyType copy$default(ListPropertyType listPropertyType, RealmStorageType realmStorageType, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            realmStorageType = listPropertyType.storageType;
        }
        if ((i & 2) != 0) {
            z = listPropertyType.isNullable;
        }
        if ((i & 4) != 0) {
            z2 = listPropertyType.isComputed;
        }
        return listPropertyType.copy(realmStorageType, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RealmStorageType getStorageType() {
        return this.storageType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsComputed() {
        return this.isComputed;
    }

    public final ListPropertyType copy(RealmStorageType storageType, boolean isNullable, boolean isComputed) {
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        return new ListPropertyType(storageType, isNullable, isComputed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListPropertyType)) {
            return false;
        }
        ListPropertyType listPropertyType = (ListPropertyType) other;
        return this.storageType == listPropertyType.storageType && this.isNullable == listPropertyType.isNullable && this.isComputed == listPropertyType.isComputed;
    }

    public int hashCode() {
        return (((this.storageType.hashCode() * 31) + Boolean.hashCode(this.isNullable)) * 31) + Boolean.hashCode(this.isComputed);
    }

    public String toString() {
        return "ListPropertyType(storageType=" + this.storageType + ", isNullable=" + this.isNullable + ", isComputed=" + this.isComputed + ')';
    }

    public ListPropertyType(RealmStorageType storageType, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        this.storageType = storageType;
        this.isNullable = z;
        this.isComputed = z2;
    }

    public /* synthetic */ ListPropertyType(RealmStorageType realmStorageType, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(realmStorageType, (i & 2) != 0 ? false : z, z2);
    }

    @Override // io.realm.kotlin.schema.RealmPropertyType
    public RealmStorageType getStorageType() {
        return this.storageType;
    }

    @Override // io.realm.kotlin.schema.RealmPropertyType
    public boolean isNullable() {
        return this.isNullable;
    }

    public final boolean isComputed() {
        return this.isComputed;
    }
}
