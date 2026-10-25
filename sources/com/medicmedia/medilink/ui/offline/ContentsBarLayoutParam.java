package com.medicmedia.medilink.ui.offline;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: OfflineContentsItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/ui/offline/ContentsBarLayoutParam;", "", "topBarHeight", "Landroidx/compose/ui/unit/Dp;", "bottomBarHeight", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTopBarHeight-D9Ej5fM", "()F", "F", "getBottomBarHeight-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "copy", "copy-YgX7TsA", "(FF)Lcom/medicmedia/medilink/ui/offline/ContentsBarLayoutParam;", "equals", "", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsBarLayoutParam {
    public static final int $stable = 0;
    private final float bottomBarHeight;
    private final float topBarHeight;

    public /* synthetic */ ContentsBarLayoutParam(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    /* JADX INFO: renamed from: copy-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ ContentsBarLayoutParam m10857copyYgX7TsA$default(ContentsBarLayoutParam contentsBarLayoutParam, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = contentsBarLayoutParam.topBarHeight;
        }
        if ((i & 2) != 0) {
            f2 = contentsBarLayoutParam.bottomBarHeight;
        }
        return contentsBarLayoutParam.m10860copyYgX7TsA(f, f2);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopBarHeight() {
        return this.topBarHeight;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottomBarHeight() {
        return this.bottomBarHeight;
    }

    /* JADX INFO: renamed from: copy-YgX7TsA, reason: not valid java name */
    public final ContentsBarLayoutParam m10860copyYgX7TsA(float topBarHeight, float bottomBarHeight) {
        return new ContentsBarLayoutParam(topBarHeight, bottomBarHeight, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentsBarLayoutParam)) {
            return false;
        }
        ContentsBarLayoutParam contentsBarLayoutParam = (ContentsBarLayoutParam) other;
        return Dp.m8708equalsimpl0(this.topBarHeight, contentsBarLayoutParam.topBarHeight) && Dp.m8708equalsimpl0(this.bottomBarHeight, contentsBarLayoutParam.bottomBarHeight);
    }

    public int hashCode() {
        return (Dp.m8709hashCodeimpl(this.topBarHeight) * 31) + Dp.m8709hashCodeimpl(this.bottomBarHeight);
    }

    public String toString() {
        return "ContentsBarLayoutParam(topBarHeight=" + Dp.m8714toStringimpl(this.topBarHeight) + ", bottomBarHeight=" + Dp.m8714toStringimpl(this.bottomBarHeight) + ")";
    }

    private ContentsBarLayoutParam(float f, float f2) {
        this.topBarHeight = f;
        this.bottomBarHeight = f2;
    }

    /* JADX INFO: renamed from: getTopBarHeight-D9Ej5fM, reason: not valid java name */
    public final float m10862getTopBarHeightD9Ej5fM() {
        return this.topBarHeight;
    }

    /* JADX INFO: renamed from: getBottomBarHeight-D9Ej5fM, reason: not valid java name */
    public final float m10861getBottomBarHeightD9Ej5fM() {
        return this.bottomBarHeight;
    }

    public /* synthetic */ ContentsBarLayoutParam(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m8703constructorimpl(64) : f, (i & 2) != 0 ? Dp.m8703constructorimpl(55) : f2, null);
    }
}
