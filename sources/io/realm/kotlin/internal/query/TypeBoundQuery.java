package io.realm.kotlin.internal.query;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.internal.interop.RealmValue;
import io.realm.kotlin.internal.schema.PropertyMetadata;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: ScalarQuery.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/realm/kotlin/internal/query/TypeBoundQuery;", ExifInterface.GPS_DIRECTION_TRUE, "", "propertyMetadata", "Lio/realm/kotlin/internal/schema/PropertyMetadata;", "getPropertyMetadata", "()Lio/realm/kotlin/internal/schema/PropertyMetadata;", "converter", "Lkotlin/Function1;", "Lio/realm/kotlin/internal/interop/RealmValue;", "getConverter", "()Lkotlin/jvm/functions/Function1;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface TypeBoundQuery<T> {
    Function1<RealmValue, T> getConverter();

    PropertyMetadata getPropertyMetadata();
}
