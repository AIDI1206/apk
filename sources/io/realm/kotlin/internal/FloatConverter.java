package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.MemTrackingAllocator;
import io.realm.kotlin.internal.interop.ValueType;
import io.realm.kotlin.internal.interop.realm_value_t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Converters.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u0007*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/realm/kotlin/internal/FloatConverter;", "Lio/realm/kotlin/internal/PassThroughPublicConverter;", "", "<init>", "()V", "fromRealmValue", "realmValue", "Lio/realm/kotlin/internal/interop/RealmValue;", "fromRealmValue-28b4FhY", "(Lio/realm/kotlin/internal/interop/realm_value_t;)Ljava/lang/Float;", "toRealmValue", "Lio/realm/kotlin/internal/interop/MemTrackingAllocator;", "value", "toRealmValue-399rIkc", "(Lio/realm/kotlin/internal/interop/MemTrackingAllocator;Ljava/lang/Float;)Lio/realm/kotlin/internal/interop/realm_value_t;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class FloatConverter extends PassThroughPublicConverter<Float> {
    public static final FloatConverter INSTANCE = new FloatConverter();

    private FloatConverter() {
    }

    @Override // io.realm.kotlin.internal.StorageTypeConverter
    /* JADX INFO: renamed from: toRealmValue-399rIkc, reason: not valid java name and merged with bridge method [inline-methods] */
    public realm_value_t mo11264toRealmValue399rIkc(MemTrackingAllocator toRealmValue, Float f) {
        Intrinsics.checkNotNullParameter(toRealmValue, "$this$toRealmValue");
        return toRealmValue.mo11363floatTransportajuLxiE(f);
    }

    @Override // io.realm.kotlin.internal.StorageTypeConverter
    /* JADX INFO: renamed from: fromRealmValue-28b4FhY */
    public Float mo11262fromRealmValue28b4FhY(realm_value_t realmValue) {
        Intrinsics.checkNotNullParameter(realmValue, "realmValue");
        if (realmValue.getType() == ValueType.RLM_TYPE_NULL.getNativeValue()) {
            return null;
        }
        return Float.valueOf(realmValue.getFnum());
    }
}
