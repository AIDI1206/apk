package io.realm.kotlin.internal.schema;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import io.realm.kotlin.internal.interop.CollectionType;
import io.realm.kotlin.internal.interop.PropertyInfo;
import io.realm.kotlin.internal.interop.PropertyType;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;

/* JADX INFO: compiled from: CachedClassKeyMap.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR$\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010!R\u0014\u0010\"\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000fR\u0014\u0010%\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000fR\u0014\u0010'\u001a\u00020 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!¨\u0006("}, d2 = {"Lio/realm/kotlin/internal/schema/CachedPropertyMetadata;", "Lio/realm/kotlin/internal/schema/PropertyMetadata;", "propertyInfo", "Lio/realm/kotlin/internal/interop/PropertyInfo;", "accessor", "Lkotlin/reflect/KProperty1;", "Lio/realm/kotlin/types/BaseRealmObject;", "", "<init>", "(Lio/realm/kotlin/internal/interop/PropertyInfo;Lkotlin/reflect/KProperty1;)V", "getAccessor", "()Lkotlin/reflect/KProperty1;", "name", "", "getName", "()Ljava/lang/String;", "publicName", "getPublicName", "key", "Lio/realm/kotlin/internal/interop/PropertyKey;", "getKey--EmY2nY", "()J", "J", "collectionType", "Lio/realm/kotlin/internal/interop/CollectionType;", "getCollectionType", "()Lio/realm/kotlin/internal/interop/CollectionType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lio/realm/kotlin/internal/interop/PropertyType;", "getType", "()Lio/realm/kotlin/internal/interop/PropertyType;", "isNullable", "", "()Z", "isPrimaryKey", "linkTarget", "getLinkTarget", "linkOriginPropertyName", "getLinkOriginPropertyName", "isComputed", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CachedPropertyMetadata implements PropertyMetadata {
    private final KProperty1<BaseRealmObject, Object> accessor;
    private final CollectionType collectionType;
    private final boolean isComputed;
    private final boolean isNullable;
    private final boolean isPrimaryKey;
    private final long key;
    private final String linkOriginPropertyName;
    private final String linkTarget;
    private final String name;
    private final String publicName;
    private final PropertyType type;

    public CachedPropertyMetadata(PropertyInfo propertyInfo, KProperty1<BaseRealmObject, ? extends Object> kProperty1) {
        Intrinsics.checkNotNullParameter(propertyInfo, "propertyInfo");
        this.accessor = kProperty1;
        this.name = propertyInfo.getName();
        this.publicName = propertyInfo.getPublicName();
        this.key = propertyInfo.m11386getKeyEmY2nY();
        this.collectionType = propertyInfo.getCollectionType();
        this.type = propertyInfo.getType();
        this.isNullable = propertyInfo.getIsNullable();
        this.isPrimaryKey = propertyInfo.getIsPrimaryKey();
        this.linkTarget = propertyInfo.getLinkTarget();
        this.linkOriginPropertyName = propertyInfo.getLinkOriginPropertyName();
        this.isComputed = propertyInfo.getIsComputed();
    }

    public /* synthetic */ CachedPropertyMetadata(PropertyInfo propertyInfo, KProperty1 kProperty1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(propertyInfo, (i & 2) != 0 ? null : kProperty1);
    }

    @Override // io.realm.kotlin.internal.schema.PropertyMetadata
    public boolean isUserDefined() {
        return PropertyMetadata.DefaultImpls.isUserDefined(this);
    }

    @Override // io.realm.kotlin.internal.schema.PropertyMetadata
    public KProperty1<BaseRealmObject, Object> getAccessor() {
        return this.accessor;
    }

    @Override // io.realm.kotlin.internal.schema.PropertyMetadata
    public String getName() {
        return this.name;
    }

    @Override // io.realm.kotlin.internal.schema.PropertyMetadata
    public String getPublicName() {
        return this.publicName;
    }

    @Override // io.realm.kotlin.internal.schema.PropertyMetadata
    /* JADX INFO: renamed from: getKey--EmY2nY, reason: not valid java name and from getter */
    public long getKey() {
        return this.key;
    }

    @Override // io.realm.kotlin.internal.schema.PropertyMetadata
    public CollectionType getCollectionType() {
        return this.collectionType;
    }

    @Override // io.realm.kotlin.internal.schema.PropertyMetadata
    public PropertyType getType() {
        return this.type;
    }

    @Override // io.realm.kotlin.internal.schema.PropertyMetadata
    /* JADX INFO: renamed from: isNullable, reason: from getter */
    public boolean getIsNullable() {
        return this.isNullable;
    }

    @Override // io.realm.kotlin.internal.schema.PropertyMetadata
    /* JADX INFO: renamed from: isPrimaryKey, reason: from getter */
    public boolean getIsPrimaryKey() {
        return this.isPrimaryKey;
    }

    @Override // io.realm.kotlin.internal.schema.PropertyMetadata
    public String getLinkTarget() {
        return this.linkTarget;
    }

    @Override // io.realm.kotlin.internal.schema.PropertyMetadata
    public String getLinkOriginPropertyName() {
        return this.linkOriginPropertyName;
    }

    @Override // io.realm.kotlin.internal.schema.PropertyMetadata
    /* JADX INFO: renamed from: isComputed, reason: from getter */
    public boolean getIsComputed() {
        return this.isComputed;
    }
}
