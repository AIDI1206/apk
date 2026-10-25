package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: ClassFlags.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lio/realm/kotlin/internal/interop/ClassFlags;", "", "<init>", "()V", "RLM_CLASS_NORMAL", "", "getRLM_CLASS_NORMAL", "()I", "RLM_CLASS_EMBEDDED", "getRLM_CLASS_EMBEDDED", "RLM_CLASS_ASYMMETRIC", "getRLM_CLASS_ASYMMETRIC", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ClassFlags {
    private static final int RLM_CLASS_NORMAL = 0;
    public static final ClassFlags INSTANCE = new ClassFlags();
    private static final int RLM_CLASS_EMBEDDED = 1;
    private static final int RLM_CLASS_ASYMMETRIC = 2;

    private ClassFlags() {
    }

    public final int getRLM_CLASS_NORMAL() {
        return RLM_CLASS_NORMAL;
    }

    public final int getRLM_CLASS_EMBEDDED() {
        return RLM_CLASS_EMBEDDED;
    }

    public final int getRLM_CLASS_ASYMMETRIC() {
        return RLM_CLASS_ASYMMETRIC;
    }
}
