package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: PropertyType.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lio/realm/kotlin/internal/interop/PropertyType;", "Lio/realm/kotlin/internal/interop/NativeEnumerated;", "", "nativeValue", "", "<init>", "(Ljava/lang/String;II)V", "getNativeValue", "()I", "RLM_PROPERTY_TYPE_INT", "RLM_PROPERTY_TYPE_BOOL", "RLM_PROPERTY_TYPE_STRING", "RLM_PROPERTY_TYPE_BINARY", "RLM_PROPERTY_TYPE_MIXED", "RLM_PROPERTY_TYPE_TIMESTAMP", "RLM_PROPERTY_TYPE_FLOAT", "RLM_PROPERTY_TYPE_DOUBLE", "RLM_PROPERTY_TYPE_OBJECT", "RLM_PROPERTY_TYPE_LINKING_OBJECTS", "RLM_PROPERTY_TYPE_DECIMAL128", "RLM_PROPERTY_TYPE_OBJECT_ID", "RLM_PROPERTY_TYPE_UUID", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum PropertyType implements NativeEnumerated {
    RLM_PROPERTY_TYPE_INT(0),
    RLM_PROPERTY_TYPE_BOOL(1),
    RLM_PROPERTY_TYPE_STRING(2),
    RLM_PROPERTY_TYPE_BINARY(4),
    RLM_PROPERTY_TYPE_MIXED(6),
    RLM_PROPERTY_TYPE_TIMESTAMP(8),
    RLM_PROPERTY_TYPE_FLOAT(9),
    RLM_PROPERTY_TYPE_DOUBLE(10),
    RLM_PROPERTY_TYPE_OBJECT(12),
    RLM_PROPERTY_TYPE_LINKING_OBJECTS(14),
    RLM_PROPERTY_TYPE_DECIMAL128(11),
    RLM_PROPERTY_TYPE_OBJECT_ID(15),
    RLM_PROPERTY_TYPE_UUID(17);

    private final int nativeValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<PropertyType> getEntries() {
        return $ENTRIES;
    }

    PropertyType(int i) {
        this.nativeValue = i;
    }

    @Override // io.realm.kotlin.internal.interop.NativeEnumerated
    public int getNativeValue() {
        return this.nativeValue;
    }

    /* JADX INFO: compiled from: PropertyType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/interop/PropertyType$Companion;", "", "<init>", "()V", "from", "Lio/realm/kotlin/internal/interop/PropertyType;", "nativeValue", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0018  */
        public final PropertyType from(int nativeValue) {
            for (PropertyType propertyType : PropertyType.values()) {
                if (propertyType.getNativeValue() == nativeValue) {
                    if (propertyType != null) {
                        return propertyType;
                    }
                    throw new IllegalStateException(("Unknown property type: " + nativeValue).toString());
                }
            }
            propertyType = null;
            if (propertyType != null) {
                return propertyType;
            }
            throw new IllegalStateException(("Unknown property type: " + nativeValue).toString());
        }
    }
}
