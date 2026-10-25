package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PropertyInfo.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u0000 62\u00020\u0001:\u00016BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b-\u0010\u001bJ\t\u0010.\u001a\u00020\u000eHÆ\u0003J`\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b0\u00101J\u0013\u00102\u001a\u00020 2\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u000eHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u00020\f¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010!R\u0011\u0010\"\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010#\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010$\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010%\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!¨\u00067"}, d2 = {"Lio/realm/kotlin/internal/interop/PropertyInfo;", "", "name", "", "publicName", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lio/realm/kotlin/internal/interop/PropertyType;", "collectionType", "Lio/realm/kotlin/internal/interop/CollectionType;", "linkTarget", "linkOriginPropertyName", "key", "Lio/realm/kotlin/internal/interop/PropertyKey;", "flags", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/realm/kotlin/internal/interop/PropertyType;Lio/realm/kotlin/internal/interop/CollectionType;Ljava/lang/String;Ljava/lang/String;JILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getPublicName", "getType", "()Lio/realm/kotlin/internal/interop/PropertyType;", "getCollectionType", "()Lio/realm/kotlin/internal/interop/CollectionType;", "getLinkTarget", "getLinkOriginPropertyName", "getKey--EmY2nY", "()J", "J", "getFlags", "()I", "isNullable", "", "()Z", "isPrimaryKey", "isIndexed", "isFullTextIndexed", "isComputed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component7--EmY2nY", "component8", "copy", "copy-KDgoymI", "(Ljava/lang/String;Ljava/lang/String;Lio/realm/kotlin/internal/interop/PropertyType;Lio/realm/kotlin/internal/interop/CollectionType;Ljava/lang/String;Ljava/lang/String;JI)Lio/realm/kotlin/internal/interop/PropertyInfo;", "equals", "other", "hashCode", "toString", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PropertyInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CollectionType collectionType;
    private final int flags;
    private final boolean isComputed;
    private final boolean isFullTextIndexed;
    private final boolean isIndexed;
    private final boolean isNullable;
    private final boolean isPrimaryKey;
    private final long key;
    private final String linkOriginPropertyName;
    private final String linkTarget;
    private final String name;
    private final String publicName;
    private final PropertyType type;

    public /* synthetic */ PropertyInfo(String str, String str2, PropertyType propertyType, CollectionType collectionType, String str3, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, propertyType, collectionType, str3, str4, j, i);
    }

    /* JADX INFO: renamed from: copy-KDgoymI$default, reason: not valid java name */
    public static /* synthetic */ PropertyInfo m11383copyKDgoymI$default(PropertyInfo propertyInfo, String str, String str2, PropertyType propertyType, CollectionType collectionType, String str3, String str4, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = propertyInfo.name;
        }
        if ((i2 & 2) != 0) {
            str2 = propertyInfo.publicName;
        }
        if ((i2 & 4) != 0) {
            propertyType = propertyInfo.type;
        }
        if ((i2 & 8) != 0) {
            collectionType = propertyInfo.collectionType;
        }
        if ((i2 & 16) != 0) {
            str3 = propertyInfo.linkTarget;
        }
        if ((i2 & 32) != 0) {
            str4 = propertyInfo.linkOriginPropertyName;
        }
        if ((i2 & 64) != 0) {
            j = propertyInfo.key;
        }
        if ((i2 & 128) != 0) {
            i = propertyInfo.flags;
        }
        int i3 = i;
        long j2 = j;
        String str5 = str3;
        String str6 = str4;
        return propertyInfo.m11385copyKDgoymI(str, str2, propertyType, collectionType, str5, str6, j2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPublicName() {
        return this.publicName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PropertyType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CollectionType getCollectionType() {
        return this.collectionType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLinkTarget() {
        return this.linkTarget;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLinkOriginPropertyName() {
        return this.linkOriginPropertyName;
    }

    /* JADX INFO: renamed from: component7--EmY2nY, reason: not valid java name and from getter */
    public final long getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFlags() {
        return this.flags;
    }

    /* JADX INFO: renamed from: copy-KDgoymI, reason: not valid java name */
    public final PropertyInfo m11385copyKDgoymI(String name, String publicName, PropertyType type, CollectionType collectionType, String linkTarget, String linkOriginPropertyName, long key, int flags) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(publicName, "publicName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        Intrinsics.checkNotNullParameter(linkTarget, "linkTarget");
        Intrinsics.checkNotNullParameter(linkOriginPropertyName, "linkOriginPropertyName");
        return new PropertyInfo(name, publicName, type, collectionType, linkTarget, linkOriginPropertyName, key, flags, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PropertyInfo)) {
            return false;
        }
        PropertyInfo propertyInfo = (PropertyInfo) other;
        return Intrinsics.areEqual(this.name, propertyInfo.name) && Intrinsics.areEqual(this.publicName, propertyInfo.publicName) && this.type == propertyInfo.type && this.collectionType == propertyInfo.collectionType && Intrinsics.areEqual(this.linkTarget, propertyInfo.linkTarget) && Intrinsics.areEqual(this.linkOriginPropertyName, propertyInfo.linkOriginPropertyName) && PropertyKey.m11390equalsimpl0(this.key, propertyInfo.key) && this.flags == propertyInfo.flags;
    }

    public int hashCode() {
        return (((((((((((((this.name.hashCode() * 31) + this.publicName.hashCode()) * 31) + this.type.hashCode()) * 31) + this.collectionType.hashCode()) * 31) + this.linkTarget.hashCode()) * 31) + this.linkOriginPropertyName.hashCode()) * 31) + PropertyKey.m11391hashCodeimpl(this.key)) * 31) + Integer.hashCode(this.flags);
    }

    public String toString() {
        return "PropertyInfo(name=" + this.name + ", publicName=" + this.publicName + ", type=" + this.type + ", collectionType=" + this.collectionType + ", linkTarget=" + this.linkTarget + ", linkOriginPropertyName=" + this.linkOriginPropertyName + ", key=" + ((Object) PropertyKey.m11392toStringimpl(this.key)) + ", flags=" + this.flags + ')';
    }

    private PropertyInfo(String name, String publicName, PropertyType type, CollectionType collectionType, String linkTarget, String linkOriginPropertyName, long j, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(publicName, "publicName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        Intrinsics.checkNotNullParameter(linkTarget, "linkTarget");
        Intrinsics.checkNotNullParameter(linkOriginPropertyName, "linkOriginPropertyName");
        this.name = name;
        this.publicName = publicName;
        this.type = type;
        this.collectionType = collectionType;
        this.linkTarget = linkTarget;
        this.linkOriginPropertyName = linkOriginPropertyName;
        this.key = j;
        this.flags = i;
        this.isNullable = (PropertyFlags.INSTANCE.getRLM_PROPERTY_NULLABLE() & i) != 0;
        this.isPrimaryKey = (PropertyFlags.INSTANCE.getRLM_PROPERTY_PRIMARY_KEY() & i) != 0;
        this.isIndexed = (PropertyFlags.INSTANCE.getRLM_PROPERTY_INDEXED() & i) != 0;
        this.isFullTextIndexed = (PropertyFlags.INSTANCE.getRLM_PROPERTY_FULLTEXT_INDEXED() & i) != 0;
        this.isComputed = type == PropertyType.RLM_PROPERTY_TYPE_LINKING_OBJECTS;
    }

    public /* synthetic */ PropertyInfo(String str, String str2, PropertyType propertyType, CollectionType collectionType, String str3, String str4, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, propertyType, (i2 & 8) != 0 ? CollectionType.RLM_COLLECTION_TYPE_NONE : collectionType, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? RealmInteropKt.getINVALID_PROPERTY_KEY() : j, (i2 & 128) != 0 ? PropertyFlags.INSTANCE.getRLM_PROPERTY_NORMAL() : i, null);
    }

    public final String getName() {
        return this.name;
    }

    public final String getPublicName() {
        return this.publicName;
    }

    public final PropertyType getType() {
        return this.type;
    }

    public final CollectionType getCollectionType() {
        return this.collectionType;
    }

    public final String getLinkTarget() {
        return this.linkTarget;
    }

    public final String getLinkOriginPropertyName() {
        return this.linkOriginPropertyName;
    }

    /* JADX INFO: renamed from: getKey--EmY2nY, reason: not valid java name */
    public final long m11386getKeyEmY2nY() {
        return this.key;
    }

    public final int getFlags() {
        return this.flags;
    }

    /* JADX INFO: renamed from: isNullable, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    /* JADX INFO: renamed from: isPrimaryKey, reason: from getter */
    public final boolean getIsPrimaryKey() {
        return this.isPrimaryKey;
    }

    /* JADX INFO: renamed from: isIndexed, reason: from getter */
    public final boolean getIsIndexed() {
        return this.isIndexed;
    }

    /* JADX INFO: renamed from: isFullTextIndexed, reason: from getter */
    public final boolean getIsFullTextIndexed() {
        return this.isFullTextIndexed;
    }

    /* JADX INFO: renamed from: isComputed, reason: from getter */
    public final boolean getIsComputed() {
        return this.isComputed;
    }

    /* JADX INFO: compiled from: PropertyInfo.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\\\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010¨\u0006\u0014"}, d2 = {"Lio/realm/kotlin/internal/interop/PropertyInfo$Companion;", "", "<init>", "()V", "create", "Lio/realm/kotlin/internal/interop/PropertyInfo;", "name", "", "publicName", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lio/realm/kotlin/internal/interop/PropertyType;", "collectionType", "Lio/realm/kotlin/internal/interop/CollectionType;", "linkTarget", "linkOriginPropertyName", "isNullable", "", "isPrimaryKey", "isIndexed", "isFullTextIndexed", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PropertyInfo create(String name, String publicName, PropertyType type, CollectionType collectionType, String linkTarget, String linkOriginPropertyName, boolean isNullable, boolean isPrimaryKey, boolean isIndexed, boolean isFullTextIndexed) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(collectionType, "collectionType");
            return new PropertyInfo(name, publicName == null ? "" : publicName, type, collectionType, linkTarget == null ? "" : linkTarget, linkOriginPropertyName == null ? "" : linkOriginPropertyName, RealmInteropKt.getINVALID_PROPERTY_KEY(), (isNullable ? PropertyFlags.INSTANCE.getRLM_PROPERTY_NULLABLE() : 0) | (isPrimaryKey ? PropertyFlags.INSTANCE.getRLM_PROPERTY_PRIMARY_KEY() : 0) | (isIndexed ? PropertyFlags.INSTANCE.getRLM_PROPERTY_INDEXED() : 0) | (isFullTextIndexed ? PropertyFlags.INSTANCE.getRLM_PROPERTY_FULLTEXT_INDEXED() : 0), null);
        }
    }
}
