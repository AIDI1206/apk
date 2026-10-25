package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import io.realm.kotlin.internal.interop.MemTrackingAllocator;
import io.realm.kotlin.internal.interop.realm_value_t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Converters.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\t*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/realm/kotlin/internal/CompositeConverter;", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LATITUDE_SOUTH, "Lio/realm/kotlin/internal/RealmValueConverter;", "Lio/realm/kotlin/internal/PublicConverter;", "Lio/realm/kotlin/internal/StorageTypeConverter;", "<init>", "()V", "publicToRealmValue", "Lio/realm/kotlin/internal/interop/RealmValue;", "Lio/realm/kotlin/internal/interop/MemTrackingAllocator;", "value", "publicToRealmValue-399rIkc", "(Lio/realm/kotlin/internal/interop/MemTrackingAllocator;Ljava/lang/Object;)Lio/realm/kotlin/internal/interop/realm_value_t;", "realmValueToPublic", "realmValue", "realmValueToPublic-28b4FhY", "(Lio/realm/kotlin/internal/interop/realm_value_t;)Ljava/lang/Object;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class CompositeConverter<T, S> implements RealmValueConverter<T>, PublicConverter<T, S>, StorageTypeConverter<S> {
    @Override // io.realm.kotlin.internal.RealmValueConverter
    /* JADX INFO: renamed from: publicToRealmValue-399rIkc, reason: not valid java name */
    public realm_value_t mo11267publicToRealmValue399rIkc(MemTrackingAllocator publicToRealmValue, T t) {
        Intrinsics.checkNotNullParameter(publicToRealmValue, "$this$publicToRealmValue");
        return mo11264toRealmValue399rIkc(publicToRealmValue, fromPublic(t));
    }

    @Override // io.realm.kotlin.internal.RealmValueConverter
    /* JADX INFO: renamed from: realmValueToPublic-28b4FhY, reason: not valid java name */
    public T mo11268realmValueToPublic28b4FhY(realm_value_t realmValue) {
        Intrinsics.checkNotNullParameter(realmValue, "realmValue");
        return toPublic(mo11262fromRealmValue28b4FhY(realmValue));
    }
}
