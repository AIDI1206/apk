package com.medicmedia.medilink.ui;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: MainTabItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\rJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\rJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\rJ\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\rJ\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\rJ\u0010\u0010%\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\rJV\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010-\u001a\u00020.H×\u0001J\t\u0010/\u001a\u000200H×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\t\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\rR\u0013\u0010\u0015\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0016\u0010\rR\u0013\u0010\u0017\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0018\u0010\r¨\u00061"}, d2 = {"Lcom/medicmedia/medilink/ui/MainTabLayoutParam;", "", "barHeight", "Landroidx/compose/ui/unit/Dp;", "fabSize", "fabIconSize", "fabEndMargin", "cradleMargin", "cutoutVerticalOffset", "fabVerticalMargin", "<init>", "(FFFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBarHeight-D9Ej5fM", "()F", "F", "getFabSize-D9Ej5fM", "getFabIconSize-D9Ej5fM", "getFabEndMargin-D9Ej5fM", "getCradleMargin-D9Ej5fM", "getCutoutVerticalOffset-D9Ej5fM", "getFabVerticalMargin-D9Ej5fM", "fabBottomMargin", "getFabBottomMargin-D9Ej5fM", "bookListPaddingBottom", "getBookListPaddingBottom-D9Ej5fM", "component1", "component1-D9Ej5fM", "component2", "component2-D9Ej5fM", "component3", "component3-D9Ej5fM", "component4", "component4-D9Ej5fM", "component5", "component5-D9Ej5fM", "component6", "component6-D9Ej5fM", "component7", "component7-D9Ej5fM", "copy", "copy-oRJhP44", "(FFFFFFF)Lcom/medicmedia/medilink/ui/MainTabLayoutParam;", "equals", "", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class MainTabLayoutParam {
    public static final int $stable = 0;
    private final float barHeight;
    private final float bookListPaddingBottom;
    private final float cradleMargin;
    private final float cutoutVerticalOffset;
    private final float fabBottomMargin;
    private final float fabEndMargin;
    private final float fabIconSize;
    private final float fabSize;
    private final float fabVerticalMargin;

    public /* synthetic */ MainTabLayoutParam(float f, float f2, float f3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7);
    }

    /* JADX INFO: renamed from: copy-oRJhP44$default, reason: not valid java name */
    public static /* synthetic */ MainTabLayoutParam m10476copyoRJhP44$default(MainTabLayoutParam mainTabLayoutParam, float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, Object obj) {
        if ((i & 1) != 0) {
            f = mainTabLayoutParam.barHeight;
        }
        if ((i & 2) != 0) {
            f2 = mainTabLayoutParam.fabSize;
        }
        if ((i & 4) != 0) {
            f3 = mainTabLayoutParam.fabIconSize;
        }
        if ((i & 8) != 0) {
            f4 = mainTabLayoutParam.fabEndMargin;
        }
        if ((i & 16) != 0) {
            f5 = mainTabLayoutParam.cradleMargin;
        }
        if ((i & 32) != 0) {
            f6 = mainTabLayoutParam.cutoutVerticalOffset;
        }
        if ((i & 64) != 0) {
            f7 = mainTabLayoutParam.fabVerticalMargin;
        }
        float f8 = f6;
        float f9 = f7;
        float f10 = f5;
        float f11 = f3;
        return mainTabLayoutParam.m10484copyoRJhP44(f, f2, f11, f4, f10, f8, f9);
    }

    /* JADX INFO: renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBarHeight() {
        return this.barHeight;
    }

    /* JADX INFO: renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFabSize() {
        return this.fabSize;
    }

    /* JADX INFO: renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFabIconSize() {
        return this.fabIconSize;
    }

    /* JADX INFO: renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFabEndMargin() {
        return this.fabEndMargin;
    }

    /* JADX INFO: renamed from: component5-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCradleMargin() {
        return this.cradleMargin;
    }

    /* JADX INFO: renamed from: component6-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCutoutVerticalOffset() {
        return this.cutoutVerticalOffset;
    }

    /* JADX INFO: renamed from: component7-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFabVerticalMargin() {
        return this.fabVerticalMargin;
    }

    /* JADX INFO: renamed from: copy-oRJhP44, reason: not valid java name */
    public final MainTabLayoutParam m10484copyoRJhP44(float barHeight, float fabSize, float fabIconSize, float fabEndMargin, float cradleMargin, float cutoutVerticalOffset, float fabVerticalMargin) {
        return new MainTabLayoutParam(barHeight, fabSize, fabIconSize, fabEndMargin, cradleMargin, cutoutVerticalOffset, fabVerticalMargin, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainTabLayoutParam)) {
            return false;
        }
        MainTabLayoutParam mainTabLayoutParam = (MainTabLayoutParam) other;
        return Dp.m8708equalsimpl0(this.barHeight, mainTabLayoutParam.barHeight) && Dp.m8708equalsimpl0(this.fabSize, mainTabLayoutParam.fabSize) && Dp.m8708equalsimpl0(this.fabIconSize, mainTabLayoutParam.fabIconSize) && Dp.m8708equalsimpl0(this.fabEndMargin, mainTabLayoutParam.fabEndMargin) && Dp.m8708equalsimpl0(this.cradleMargin, mainTabLayoutParam.cradleMargin) && Dp.m8708equalsimpl0(this.cutoutVerticalOffset, mainTabLayoutParam.cutoutVerticalOffset) && Dp.m8708equalsimpl0(this.fabVerticalMargin, mainTabLayoutParam.fabVerticalMargin);
    }

    public int hashCode() {
        return (((((((((((Dp.m8709hashCodeimpl(this.barHeight) * 31) + Dp.m8709hashCodeimpl(this.fabSize)) * 31) + Dp.m8709hashCodeimpl(this.fabIconSize)) * 31) + Dp.m8709hashCodeimpl(this.fabEndMargin)) * 31) + Dp.m8709hashCodeimpl(this.cradleMargin)) * 31) + Dp.m8709hashCodeimpl(this.cutoutVerticalOffset)) * 31) + Dp.m8709hashCodeimpl(this.fabVerticalMargin);
    }

    public String toString() {
        return "MainTabLayoutParam(barHeight=" + Dp.m8714toStringimpl(this.barHeight) + ", fabSize=" + Dp.m8714toStringimpl(this.fabSize) + ", fabIconSize=" + Dp.m8714toStringimpl(this.fabIconSize) + ", fabEndMargin=" + Dp.m8714toStringimpl(this.fabEndMargin) + ", cradleMargin=" + Dp.m8714toStringimpl(this.cradleMargin) + ", cutoutVerticalOffset=" + Dp.m8714toStringimpl(this.cutoutVerticalOffset) + ", fabVerticalMargin=" + Dp.m8714toStringimpl(this.fabVerticalMargin) + ")";
    }

    private MainTabLayoutParam(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.barHeight = f;
        this.fabSize = f2;
        this.fabIconSize = f3;
        this.fabEndMargin = f4;
        this.cradleMargin = f5;
        this.cutoutVerticalOffset = f6;
        this.fabVerticalMargin = f7;
        float f8 = 2;
        this.fabBottomMargin = Dp.m8703constructorimpl(f - Dp.m8703constructorimpl(f2 / f8));
        this.bookListPaddingBottom = Dp.m8703constructorimpl(Dp.m8703constructorimpl(Dp.m8703constructorimpl(f4 * 3) + Dp.m8703constructorimpl(f7 * f8)) + f);
    }

    /* JADX INFO: renamed from: getBarHeight-D9Ej5fM, reason: not valid java name */
    public final float m10485getBarHeightD9Ej5fM() {
        return this.barHeight;
    }

    /* JADX INFO: renamed from: getFabSize-D9Ej5fM, reason: not valid java name */
    public final float m10492getFabSizeD9Ej5fM() {
        return this.fabSize;
    }

    /* JADX INFO: renamed from: getFabIconSize-D9Ej5fM, reason: not valid java name */
    public final float m10491getFabIconSizeD9Ej5fM() {
        return this.fabIconSize;
    }

    /* JADX INFO: renamed from: getFabEndMargin-D9Ej5fM, reason: not valid java name */
    public final float m10490getFabEndMarginD9Ej5fM() {
        return this.fabEndMargin;
    }

    /* JADX INFO: renamed from: getCradleMargin-D9Ej5fM, reason: not valid java name */
    public final float m10487getCradleMarginD9Ej5fM() {
        return this.cradleMargin;
    }

    /* JADX INFO: renamed from: getCutoutVerticalOffset-D9Ej5fM, reason: not valid java name */
    public final float m10488getCutoutVerticalOffsetD9Ej5fM() {
        return this.cutoutVerticalOffset;
    }

    /* JADX INFO: renamed from: getFabVerticalMargin-D9Ej5fM, reason: not valid java name */
    public final float m10493getFabVerticalMarginD9Ej5fM() {
        return this.fabVerticalMargin;
    }

    /* JADX INFO: renamed from: getFabBottomMargin-D9Ej5fM, reason: not valid java name and from getter */
    public final float getFabBottomMargin() {
        return this.fabBottomMargin;
    }

    /* JADX INFO: renamed from: getBookListPaddingBottom-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBookListPaddingBottom() {
        return this.bookListPaddingBottom;
    }

    public /* synthetic */ MainTabLayoutParam(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m8703constructorimpl(50) : f, (i & 2) != 0 ? Dp.m8703constructorimpl(56) : f2, (i & 4) != 0 ? Dp.m8703constructorimpl(22) : f3, (i & 8) != 0 ? Dp.m8703constructorimpl(28) : f4, (i & 16) != 0 ? Dp.m8703constructorimpl(4) : f5, (i & 32) != 0 ? Dp.m8703constructorimpl(1) : f6, (i & 64) != 0 ? Dp.m8703constructorimpl(12) : f7, null);
    }
}
