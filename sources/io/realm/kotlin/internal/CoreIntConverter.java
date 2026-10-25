package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.MemTrackingAllocator;
import io.realm.kotlin.internal.interop.ValueType;
import io.realm.kotlin.internal.interop.realm_value_t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Converters.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u0005*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/realm/kotlin/internal/CoreIntConverter;", "Lio/realm/kotlin/internal/StorageTypeConverter;", "", "fromRealmValue", "realmValue", "Lio/realm/kotlin/internal/interop/RealmValue;", "fromRealmValue-28b4FhY", "(Lio/realm/kotlin/internal/interop/realm_value_t;)Ljava/lang/Long;", "toRealmValue", "Lio/realm/kotlin/internal/interop/MemTrackingAllocator;", "value", "toRealmValue-399rIkc", "(Lio/realm/kotlin/internal/interop/MemTrackingAllocator;Ljava/lang/Long;)Lio/realm/kotlin/internal/interop/realm_value_t;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface CoreIntConverter extends StorageTypeConverter<Long> {
    @Override // io.realm.kotlin.internal.StorageTypeConverter
    /* JADX INFO: renamed from: fromRealmValue-28b4FhY */
    Long mo11262fromRealmValue28b4FhY(realm_value_t realmValue);

    /* JADX INFO: renamed from: toRealmValue-399rIkc */
    realm_value_t mo11266toRealmValue399rIkc(MemTrackingAllocator memTrackingAllocator, Long l);

    /* JADX INFO: compiled from: Converters.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        /* JADX INFO: renamed from: toRealmValue-399rIkc, reason: not valid java name */
        public static realm_value_t m11287toRealmValue399rIkc(CoreIntConverter coreIntConverter, MemTrackingAllocator receiver, Long l) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver.mo11364longTransportajuLxiE(l);
        }

        /* JADX INFO: renamed from: fromRealmValue-28b4FhY, reason: not valid java name */
        public static Long m11286fromRealmValue28b4FhY(CoreIntConverter coreIntConverter, realm_value_t realmValue) {
            Intrinsics.checkNotNullParameter(realmValue, "realmValue");
            if (realmValue.getType() == ValueType.RLM_TYPE_NULL.getNativeValue()) {
                return null;
            }
            return Long.valueOf(realmValue.getInteger());
        }
    }
}
