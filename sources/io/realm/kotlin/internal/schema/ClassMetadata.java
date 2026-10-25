package io.realm.kotlin.internal.schema;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.types.TypedRealmObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: CachedClassKeyMap.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\bH¦\u0002J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\u001dH¦\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00112\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!H¦\u0002J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010#\u001a\u00020\u0018H\u0016R\u001c\u0010\u0002\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019¨\u0006$"}, d2 = {"Lio/realm/kotlin/internal/schema/ClassMetadata;", "", "clazz", "Lkotlin/reflect/KClass;", "Lio/realm/kotlin/types/TypedRealmObject;", "getClazz", "()Lkotlin/reflect/KClass;", "className", "", "getClassName", "()Ljava/lang/String;", "classKey", "Lio/realm/kotlin/internal/interop/ClassKey;", "getClassKey-QNRHIEo", "()J", "properties", "", "Lio/realm/kotlin/internal/schema/PropertyMetadata;", "getProperties", "()Ljava/util/List;", "primaryKeyProperty", "getPrimaryKeyProperty", "()Lio/realm/kotlin/internal/schema/PropertyMetadata;", "isEmbeddedRealmObject", "", "()Z", "get", "propertyName", "propertyKey", "Lio/realm/kotlin/internal/interop/PropertyKey;", "get-XxIY2SY", "(J)Lio/realm/kotlin/internal/schema/PropertyMetadata;", "property", "Lkotlin/reflect/KProperty;", "getOrThrow", "isUserDefined", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ClassMetadata {
    PropertyMetadata get(String propertyName);

    PropertyMetadata get(KProperty<?> property);

    /* JADX INFO: renamed from: get-XxIY2SY */
    PropertyMetadata mo11487getXxIY2SY(long propertyKey);

    /* JADX INFO: renamed from: getClassKey-QNRHIEo */
    long mo11488getClassKeyQNRHIEo();

    String getClassName();

    KClass<? extends TypedRealmObject> getClazz();

    PropertyMetadata getOrThrow(String propertyName);

    PropertyMetadata getPrimaryKeyProperty();

    List<PropertyMetadata> getProperties();

    boolean isEmbeddedRealmObject();

    boolean isUserDefined();

    /* JADX INFO: compiled from: CachedClassKeyMap.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static PropertyMetadata getOrThrow(ClassMetadata classMetadata, String propertyName) {
            Intrinsics.checkNotNullParameter(propertyName, "propertyName");
            PropertyMetadata propertyMetadata = classMetadata.get(propertyName);
            if (propertyMetadata != null) {
                return propertyMetadata;
            }
            throw new IllegalArgumentException("Schema for type '" + classMetadata.getClassName() + "' doesn't contain a property named '" + propertyName + '\'');
        }

        public static boolean isUserDefined(ClassMetadata classMetadata) {
            return classMetadata.getClazz() != null;
        }
    }
}
