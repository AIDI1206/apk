package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ValueType.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, d2 = {"Lio/realm/kotlin/internal/interop/ValueType;", "Lio/realm/kotlin/internal/interop/NativeEnumerated;", "", "nativeValue", "", "<init>", "(Ljava/lang/String;II)V", "getNativeValue", "()I", "RLM_TYPE_NULL", "RLM_TYPE_INT", "RLM_TYPE_BOOL", "RLM_TYPE_STRING", "RLM_TYPE_BINARY", "RLM_TYPE_TIMESTAMP", "RLM_TYPE_FLOAT", "RLM_TYPE_DOUBLE", "RLM_TYPE_DECIMAL128", "RLM_TYPE_OBJECT_ID", "RLM_TYPE_LINK", "RLM_TYPE_UUID", "RLM_TYPE_LIST", "RLM_TYPE_DICTIONARY", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum ValueType implements NativeEnumerated {
    RLM_TYPE_NULL(0),
    RLM_TYPE_INT(1),
    RLM_TYPE_BOOL(2),
    RLM_TYPE_STRING(3),
    RLM_TYPE_BINARY(4),
    RLM_TYPE_TIMESTAMP(5),
    RLM_TYPE_FLOAT(6),
    RLM_TYPE_DOUBLE(7),
    RLM_TYPE_DECIMAL128(8),
    RLM_TYPE_OBJECT_ID(9),
    RLM_TYPE_LINK(10),
    RLM_TYPE_UUID(11),
    RLM_TYPE_LIST(12),
    RLM_TYPE_DICTIONARY(13);

    private final int nativeValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<ValueType> getEntries() {
        return $ENTRIES;
    }

    ValueType(int i) {
        this.nativeValue = i;
    }

    @Override // io.realm.kotlin.internal.interop.NativeEnumerated
    public int getNativeValue() {
        return this.nativeValue;
    }

    /* JADX INFO: compiled from: ValueType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/interop/ValueType$Companion;", "", "<init>", "()V", "from", "Lio/realm/kotlin/internal/interop/ValueType;", "nativeValue", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0018  */
        public final ValueType from(int nativeValue) {
            for (ValueType valueType : ValueType.values()) {
                if (valueType.getNativeValue() == nativeValue) {
                    if (valueType != null) {
                        return valueType;
                    }
                    throw new IllegalStateException(("Unknown value type: " + nativeValue).toString());
                }
            }
            valueType = null;
            if (valueType != null) {
                return valueType;
            }
            throw new IllegalStateException(("Unknown value type: " + nativeValue).toString());
        }
    }
}
