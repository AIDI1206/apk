package io.realm.kotlin.internal.schema;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import io.realm.kotlin.internal.interop.CollectionType;
import io.realm.kotlin.internal.interop.PropertyType;
import io.realm.kotlin.types.BaseRealmObject;
import kotlin.Metadata;
import kotlin.reflect.KProperty1;

/* JADX INFO: compiled from: CachedClassKeyMap.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\b\u0010\"\u001a\u00020\u0015H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\"\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0005R\u0012\u0010\u001f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0005R\u0012\u0010!\u001a\u00020\u0015X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0016¨\u0006#"}, d2 = {"Lio/realm/kotlin/internal/schema/PropertyMetadata;", "", "name", "", "getName", "()Ljava/lang/String;", "publicName", "getPublicName", "key", "Lio/realm/kotlin/internal/interop/PropertyKey;", "getKey--EmY2nY", "()J", "collectionType", "Lio/realm/kotlin/internal/interop/CollectionType;", "getCollectionType", "()Lio/realm/kotlin/internal/interop/CollectionType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lio/realm/kotlin/internal/interop/PropertyType;", "getType", "()Lio/realm/kotlin/internal/interop/PropertyType;", "isNullable", "", "()Z", "isPrimaryKey", "accessor", "Lkotlin/reflect/KProperty1;", "Lio/realm/kotlin/types/BaseRealmObject;", "getAccessor", "()Lkotlin/reflect/KProperty1;", "linkTarget", "getLinkTarget", "linkOriginPropertyName", "getLinkOriginPropertyName", "isComputed", "isUserDefined", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface PropertyMetadata {
    KProperty1<BaseRealmObject, Object> getAccessor();

    CollectionType getCollectionType();

    /* JADX INFO: renamed from: getKey--EmY2nY */
    long mo11489getKeyEmY2nY();

    String getLinkOriginPropertyName();

    String getLinkTarget();

    String getName();

    String getPublicName();

    PropertyType getType();

    boolean isComputed();

    boolean isNullable();

    boolean isPrimaryKey();

    boolean isUserDefined();

    /* JADX INFO: compiled from: CachedClassKeyMap.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static boolean isUserDefined(PropertyMetadata propertyMetadata) {
            return propertyMetadata.getAccessor() != null;
        }
    }
}
