package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: PropertyFlags.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lio/realm/kotlin/internal/interop/PropertyFlags;", "", "<init>", "()V", "RLM_PROPERTY_NORMAL", "", "getRLM_PROPERTY_NORMAL", "()I", "RLM_PROPERTY_NULLABLE", "getRLM_PROPERTY_NULLABLE", "RLM_PROPERTY_PRIMARY_KEY", "getRLM_PROPERTY_PRIMARY_KEY", "RLM_PROPERTY_INDEXED", "getRLM_PROPERTY_INDEXED", "RLM_PROPERTY_FULLTEXT_INDEXED", "getRLM_PROPERTY_FULLTEXT_INDEXED", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class PropertyFlags {
    private static final int RLM_PROPERTY_NORMAL = 0;
    public static final PropertyFlags INSTANCE = new PropertyFlags();
    private static final int RLM_PROPERTY_NULLABLE = 1;
    private static final int RLM_PROPERTY_PRIMARY_KEY = 2;
    private static final int RLM_PROPERTY_INDEXED = 4;
    private static final int RLM_PROPERTY_FULLTEXT_INDEXED = 8;

    private PropertyFlags() {
    }

    public final int getRLM_PROPERTY_NORMAL() {
        return RLM_PROPERTY_NORMAL;
    }

    public final int getRLM_PROPERTY_NULLABLE() {
        return RLM_PROPERTY_NULLABLE;
    }

    public final int getRLM_PROPERTY_PRIMARY_KEY() {
        return RLM_PROPERTY_PRIMARY_KEY;
    }

    public final int getRLM_PROPERTY_INDEXED() {
        return RLM_PROPERTY_INDEXED;
    }

    public final int getRLM_PROPERTY_FULLTEXT_INDEXED() {
        return RLM_PROPERTY_FULLTEXT_INDEXED;
    }
}
