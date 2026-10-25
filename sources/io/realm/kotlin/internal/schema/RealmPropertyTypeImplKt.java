package io.realm.kotlin.internal.schema;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.CollectionType;
import io.realm.kotlin.schema.ListPropertyType;
import io.realm.kotlin.schema.MapPropertyType;
import io.realm.kotlin.schema.RealmPropertyType;
import io.realm.kotlin.schema.SetPropertyType;
import io.realm.kotlin.schema.ValuePropertyType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmPropertyTypeImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"collectionType", "Lio/realm/kotlin/internal/interop/CollectionType;", "Lio/realm/kotlin/schema/RealmPropertyType;", "getCollectionType", "(Lio/realm/kotlin/schema/RealmPropertyType;)Lio/realm/kotlin/internal/interop/CollectionType;", "io.realm.kotlin.library"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RealmPropertyTypeImplKt {
    public static final CollectionType getCollectionType(RealmPropertyType realmPropertyType) {
        Intrinsics.checkNotNullParameter(realmPropertyType, "<this>");
        if (realmPropertyType instanceof ListPropertyType) {
            return CollectionType.RLM_COLLECTION_TYPE_LIST;
        }
        if (realmPropertyType instanceof MapPropertyType) {
            return CollectionType.RLM_COLLECTION_TYPE_DICTIONARY;
        }
        if (realmPropertyType instanceof SetPropertyType) {
            return CollectionType.RLM_COLLECTION_TYPE_SET;
        }
        if (realmPropertyType instanceof ValuePropertyType) {
            return CollectionType.RLM_COLLECTION_TYPE_NONE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
