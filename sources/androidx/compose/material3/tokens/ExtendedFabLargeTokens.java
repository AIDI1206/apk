package androidx.compose.material3.tokens;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: ExtendedFabLargeTokens.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007R\u0013\u0010\u0013\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/tokens/ExtendedFabLargeTokens;", "", "<init>", "()V", "ContainerHeight", "Landroidx/compose/ui/unit/Dp;", "getContainerHeight-D9Ej5fM", "()F", "F", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "IconLabelSpace", "getIconLabelSpace-D9Ej5fM", "IconSize", "getIconSize-D9Ej5fM", "LeadingSpace", "getLeadingSpace-D9Ej5fM", "TrailingSpace", "getTrailingSpace-D9Ej5fM", "material3"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ExtendedFabLargeTokens {
    public static final int $stable = 0;
    private static final float LeadingSpace;
    private static final float TrailingSpace;
    public static final ExtendedFabLargeTokens INSTANCE = new ExtendedFabLargeTokens();
    private static final float ContainerHeight = Dp.m8703constructorimpl((float) 96.0d);
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraLarge;
    private static final float IconLabelSpace = Dp.m8703constructorimpl((float) 20.0d);
    private static final float IconSize = Dp.m8703constructorimpl((float) 32.0d);

    private ExtendedFabLargeTokens() {
    }

    /* JADX INFO: renamed from: getContainerHeight-D9Ej5fM, reason: not valid java name */
    public final float m4609getContainerHeightD9Ej5fM() {
        return ContainerHeight;
    }

    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    /* JADX INFO: renamed from: getIconLabelSpace-D9Ej5fM, reason: not valid java name */
    public final float m4610getIconLabelSpaceD9Ej5fM() {
        return IconLabelSpace;
    }

    /* JADX INFO: renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m4611getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* JADX INFO: renamed from: getLeadingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4612getLeadingSpaceD9Ej5fM() {
        return LeadingSpace;
    }

    /* JADX INFO: renamed from: getTrailingSpace-D9Ej5fM, reason: not valid java name */
    public final float m4613getTrailingSpaceD9Ej5fM() {
        return TrailingSpace;
    }

    static {
        float f = (float) 28.0d;
        LeadingSpace = Dp.m8703constructorimpl(f);
        TrailingSpace = Dp.m8703constructorimpl(f);
    }
}
