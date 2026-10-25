package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: SchemaMode.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lio/realm/kotlin/internal/interop/SchemaMode;", "Lio/realm/kotlin/internal/interop/NativeEnumerated;", "", "nativeValue", "", "<init>", "(Ljava/lang/String;II)V", "getNativeValue", "()I", "RLM_SCHEMA_MODE_AUTOMATIC", "RLM_SCHEMA_MODE_IMMUTABLE", "RLM_SCHEMA_MODE_READ_ONLY", "RLM_SCHEMA_MODE_SOFT_RESET_FILE", "RLM_SCHEMA_MODE_HARD_RESET_FILE", "RLM_SCHEMA_MODE_ADDITIVE_DISCOVERED", "RLM_SCHEMA_MODE_ADDITIVE_EXPLICIT", "RLM_SCHEMA_MODE_MANUAL", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum SchemaMode implements NativeEnumerated {
    RLM_SCHEMA_MODE_AUTOMATIC(0),
    RLM_SCHEMA_MODE_IMMUTABLE(1),
    RLM_SCHEMA_MODE_READ_ONLY(2),
    RLM_SCHEMA_MODE_SOFT_RESET_FILE(3),
    RLM_SCHEMA_MODE_HARD_RESET_FILE(4),
    RLM_SCHEMA_MODE_ADDITIVE_DISCOVERED(5),
    RLM_SCHEMA_MODE_ADDITIVE_EXPLICIT(6),
    RLM_SCHEMA_MODE_MANUAL(7);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int nativeValue;

    public static EnumEntries<SchemaMode> getEntries() {
        return $ENTRIES;
    }

    SchemaMode(int i) {
        this.nativeValue = i;
    }

    @Override // io.realm.kotlin.internal.interop.NativeEnumerated
    public int getNativeValue() {
        return this.nativeValue;
    }
}
