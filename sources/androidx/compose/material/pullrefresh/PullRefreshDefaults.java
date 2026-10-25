package androidx.compose.material.pullrefresh;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: PullRefreshState.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshDefaults;", "", "<init>", "()V", "RefreshThreshold", "Landroidx/compose/ui/unit/Dp;", "getRefreshThreshold-D9Ej5fM", "()F", "F", "RefreshingOffset", "getRefreshingOffset-D9Ej5fM", "material"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class PullRefreshDefaults {
    public static final int $stable = 0;
    public static final PullRefreshDefaults INSTANCE = new PullRefreshDefaults();
    private static final float RefreshThreshold = Dp.m8703constructorimpl(80);
    private static final float RefreshingOffset = Dp.m8703constructorimpl(56);

    private PullRefreshDefaults() {
    }

    /* JADX INFO: renamed from: getRefreshThreshold-D9Ej5fM, reason: not valid java name */
    public final float m2556getRefreshThresholdD9Ej5fM() {
        return RefreshThreshold;
    }

    /* JADX INFO: renamed from: getRefreshingOffset-D9Ej5fM, reason: not valid java name */
    public final float m2557getRefreshingOffsetD9Ej5fM() {
        return RefreshingOffset;
    }
}
