package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.internal.interop.MemTrackingAllocator;
import io.realm.kotlin.internal.interop.realm_value_t;
import kotlin.Metadata;

/* JADX INFO: compiled from: Converters.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00018\u00002\u0006\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/realm/kotlin/internal/RealmValueConverter;", ExifInterface.GPS_DIRECTION_TRUE, "", "publicToRealmValue", "Lio/realm/kotlin/internal/interop/RealmValue;", "Lio/realm/kotlin/internal/interop/MemTrackingAllocator;", "value", "publicToRealmValue-399rIkc", "(Lio/realm/kotlin/internal/interop/MemTrackingAllocator;Ljava/lang/Object;)Lio/realm/kotlin/internal/interop/realm_value_t;", "realmValueToPublic", "realmValue", "realmValueToPublic-28b4FhY", "(Lio/realm/kotlin/internal/interop/realm_value_t;)Ljava/lang/Object;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmValueConverter<T> {
    /* JADX INFO: renamed from: publicToRealmValue-399rIkc */
    realm_value_t mo11267publicToRealmValue399rIkc(MemTrackingAllocator memTrackingAllocator, T t);

    /* JADX INFO: renamed from: realmValueToPublic-28b4FhY */
    T mo11268realmValueToPublic28b4FhY(realm_value_t realmValue);
}
