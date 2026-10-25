package sh.calvin.reorderable;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: ReorderableLazyCollection.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Lsh/calvin/reorderable/ReorderableLazyCollectionDefaults;", "", "()V", "ScrollThreshold", "Landroidx/compose/ui/unit/Dp;", "getScrollThreshold-D9Ej5fM", "()F", "F", "reorderable_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ReorderableLazyCollectionDefaults {
    public static final int $stable = 0;
    public static final ReorderableLazyCollectionDefaults INSTANCE = new ReorderableLazyCollectionDefaults();
    private static final float ScrollThreshold = Dp.m8703constructorimpl(48);

    private ReorderableLazyCollectionDefaults() {
    }

    /* JADX INFO: renamed from: getScrollThreshold-D9Ej5fM, reason: not valid java name */
    public final float m13415getScrollThresholdD9Ej5fM() {
        return ScrollThreshold;
    }
}
