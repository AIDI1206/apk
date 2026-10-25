package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.internal.interop.MemTrackingAllocator;
import io.realm.kotlin.internal.interop.realm_value_t;
import kotlin.Metadata;

/* JADX INFO: compiled from: Converters.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u0005*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/realm/kotlin/internal/StorageTypeConverter;", ExifInterface.GPS_DIRECTION_TRUE, "", "fromRealmValue", "realmValue", "Lio/realm/kotlin/internal/interop/RealmValue;", "fromRealmValue-28b4FhY", "(Lio/realm/kotlin/internal/interop/realm_value_t;)Ljava/lang/Object;", "toRealmValue", "Lio/realm/kotlin/internal/interop/MemTrackingAllocator;", "value", "toRealmValue-399rIkc", "(Lio/realm/kotlin/internal/interop/MemTrackingAllocator;Ljava/lang/Object;)Lio/realm/kotlin/internal/interop/realm_value_t;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface StorageTypeConverter<T> {
    /* JADX INFO: renamed from: fromRealmValue-28b4FhY */
    T mo11262fromRealmValue28b4FhY(realm_value_t realmValue);

    /* JADX INFO: renamed from: toRealmValue-399rIkc */
    realm_value_t mo11264toRealmValue399rIkc(MemTrackingAllocator memTrackingAllocator, T t);
}
