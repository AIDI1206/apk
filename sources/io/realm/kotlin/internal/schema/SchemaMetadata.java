package io.realm.kotlin.internal.schema;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CachedClassKeyMap.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H¦\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"Lio/realm/kotlin/internal/schema/SchemaMetadata;", "", "get", "Lio/realm/kotlin/internal/schema/ClassMetadata;", "className", "", "classKey", "Lio/realm/kotlin/internal/interop/ClassKey;", "get-JXC-ZB4", "(J)Lio/realm/kotlin/internal/schema/ClassMetadata;", "getOrThrow", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SchemaMetadata {
    ClassMetadata get(String className);

    /* JADX INFO: renamed from: get-JXC-ZB4 */
    ClassMetadata mo11490getJXCZB4(long classKey);

    ClassMetadata getOrThrow(String className);

    /* JADX INFO: compiled from: CachedClassKeyMap.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static ClassMetadata getOrThrow(SchemaMetadata schemaMetadata, String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            ClassMetadata classMetadata = schemaMetadata.get(className);
            if (classMetadata != null) {
                return classMetadata;
            }
            throw new IllegalArgumentException("Schema does not contain a class named '" + className + '\'');
        }
    }
}
