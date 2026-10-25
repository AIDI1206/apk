package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.MemTrackingAllocator;
import io.realm.kotlin.internal.interop.realm_value_t;
import kotlin.Metadata;

/* JADX INFO: compiled from: Converters.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0096\b¢\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0096\b¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lio/realm/kotlin/internal/IntConverter;", "Lio/realm/kotlin/internal/CoreIntConverter;", "Lio/realm/kotlin/internal/CompositeConverter;", "", "", "<init>", "()V", "fromPublic", "value", "(Ljava/lang/Integer;)Ljava/lang/Long;", "toPublic", "(Ljava/lang/Long;)Ljava/lang/Integer;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class IntConverter extends CompositeConverter<Integer, Long> implements CoreIntConverter {
    public static final IntConverter INSTANCE = new IntConverter();

    private IntConverter() {
    }

    @Override // io.realm.kotlin.internal.PublicConverter
    public /* bridge */ /* synthetic */ Object fromPublic(Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            return Long.valueOf(num.intValue());
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.kotlin.internal.StorageTypeConverter
    /* JADX INFO: renamed from: fromRealmValue-28b4FhY */
    public Long mo11262fromRealmValue28b4FhY(realm_value_t realm_value_tVar) {
        return CoreIntConverter.DefaultImpls.m11286fromRealmValue28b4FhY(this, realm_value_tVar);
    }

    @Override // io.realm.kotlin.internal.PublicConverter
    public /* bridge */ /* synthetic */ Object toPublic(Object obj) {
        Long l = (Long) obj;
        if (l != null) {
            return Integer.valueOf((int) l.longValue());
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.realm.kotlin.internal.StorageTypeConverter
    /* JADX INFO: renamed from: toRealmValue-399rIkc */
    public realm_value_t mo11264toRealmValue399rIkc(MemTrackingAllocator memTrackingAllocator, Long l) {
        return CoreIntConverter.DefaultImpls.m11287toRealmValue399rIkc(this, memTrackingAllocator, l);
    }

    public Long fromPublic(Integer value) {
        if (value != null) {
            return Long.valueOf(value.intValue());
        }
        return null;
    }

    public Integer toPublic(Long value) {
        if (value != null) {
            return Integer.valueOf((int) value.longValue());
        }
        return null;
    }
}
