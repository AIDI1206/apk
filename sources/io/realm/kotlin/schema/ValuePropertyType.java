package io.realm.kotlin.schema;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmPropertyType.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\r¨\u0006\u001b"}, d2 = {"Lio/realm/kotlin/schema/ValuePropertyType;", "Lio/realm/kotlin/schema/RealmPropertyType;", "storageType", "Lio/realm/kotlin/schema/RealmStorageType;", "isNullable", "", "isPrimaryKey", "isIndexed", "isFullTextIndexed", "<init>", "(Lio/realm/kotlin/schema/RealmStorageType;ZZZZ)V", "getStorageType", "()Lio/realm/kotlin/schema/RealmStorageType;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ValuePropertyType implements RealmPropertyType {
    private final boolean isFullTextIndexed;
    private final boolean isIndexed;
    private final boolean isNullable;
    private final boolean isPrimaryKey;
    private final RealmStorageType storageType;

    public static /* synthetic */ ValuePropertyType copy$default(ValuePropertyType valuePropertyType, RealmStorageType realmStorageType, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            realmStorageType = valuePropertyType.storageType;
        }
        if ((i & 2) != 0) {
            z = valuePropertyType.isNullable;
        }
        if ((i & 4) != 0) {
            z2 = valuePropertyType.isPrimaryKey;
        }
        if ((i & 8) != 0) {
            z3 = valuePropertyType.isIndexed;
        }
        if ((i & 16) != 0) {
            z4 = valuePropertyType.isFullTextIndexed;
        }
        boolean z5 = z4;
        boolean z6 = z2;
        return valuePropertyType.copy(realmStorageType, z, z6, z3, z5);
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
    public final boolean getIsPrimaryKey() {
        return this.isPrimaryKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsIndexed() {
        return this.isIndexed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsFullTextIndexed() {
        return this.isFullTextIndexed;
    }

    public final ValuePropertyType copy(RealmStorageType storageType, boolean isNullable, boolean isPrimaryKey, boolean isIndexed, boolean isFullTextIndexed) {
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        return new ValuePropertyType(storageType, isNullable, isPrimaryKey, isIndexed, isFullTextIndexed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValuePropertyType)) {
            return false;
        }
        ValuePropertyType valuePropertyType = (ValuePropertyType) other;
        return this.storageType == valuePropertyType.storageType && this.isNullable == valuePropertyType.isNullable && this.isPrimaryKey == valuePropertyType.isPrimaryKey && this.isIndexed == valuePropertyType.isIndexed && this.isFullTextIndexed == valuePropertyType.isFullTextIndexed;
    }

    public int hashCode() {
        return (((((((this.storageType.hashCode() * 31) + Boolean.hashCode(this.isNullable)) * 31) + Boolean.hashCode(this.isPrimaryKey)) * 31) + Boolean.hashCode(this.isIndexed)) * 31) + Boolean.hashCode(this.isFullTextIndexed);
    }

    public String toString() {
        return "ValuePropertyType(storageType=" + this.storageType + ", isNullable=" + this.isNullable + ", isPrimaryKey=" + this.isPrimaryKey + ", isIndexed=" + this.isIndexed + ", isFullTextIndexed=" + this.isFullTextIndexed + ')';
    }

    public ValuePropertyType(RealmStorageType storageType, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(storageType, "storageType");
        this.storageType = storageType;
        this.isNullable = z;
        this.isPrimaryKey = z2;
        this.isIndexed = z3;
        this.isFullTextIndexed = z4;
    }

    @Override // io.realm.kotlin.schema.RealmPropertyType
    public RealmStorageType getStorageType() {
        return this.storageType;
    }

    @Override // io.realm.kotlin.schema.RealmPropertyType
    public boolean isNullable() {
        return this.isNullable;
    }

    public final boolean isPrimaryKey() {
        return this.isPrimaryKey;
    }

    public final boolean isIndexed() {
        return this.isIndexed;
    }

    public final boolean isFullTextIndexed() {
        return this.isFullTextIndexed;
    }
}
