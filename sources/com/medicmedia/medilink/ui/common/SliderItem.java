package com.medicmedia.medilink.ui.common;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SeekbarLikeSlider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/common/SliderItem;", "", "sliderValue", "", "sliderRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "<init>", "(FLkotlin/ranges/ClosedFloatingPointRange;)V", "getSliderValue", "()F", "getSliderRange", "()Lkotlin/ranges/ClosedFloatingPointRange;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SliderItem {
    public static final int $stable = 0;
    private final ClosedFloatingPointRange<Float> sliderRange;
    private final float sliderValue;

    public SliderItem() {
        this(0.0f, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SliderItem copy$default(SliderItem sliderItem, float f, ClosedFloatingPointRange closedFloatingPointRange, int i, Object obj) {
        if ((i & 1) != 0) {
            f = sliderItem.sliderValue;
        }
        if ((i & 2) != 0) {
            closedFloatingPointRange = sliderItem.sliderRange;
        }
        return sliderItem.copy(f, closedFloatingPointRange);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getSliderValue() {
        return this.sliderValue;
    }

    public final ClosedFloatingPointRange<Float> component2() {
        return this.sliderRange;
    }

    public final SliderItem copy(float sliderValue, ClosedFloatingPointRange<Float> sliderRange) {
        Intrinsics.checkNotNullParameter(sliderRange, "sliderRange");
        return new SliderItem(sliderValue, sliderRange);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderItem)) {
            return false;
        }
        SliderItem sliderItem = (SliderItem) other;
        return Float.compare(this.sliderValue, sliderItem.sliderValue) == 0 && Intrinsics.areEqual(this.sliderRange, sliderItem.sliderRange);
    }

    public int hashCode() {
        return (Float.hashCode(this.sliderValue) * 31) + this.sliderRange.hashCode();
    }

    public String toString() {
        return "SliderItem(sliderValue=" + this.sliderValue + ", sliderRange=" + this.sliderRange + ")";
    }

    public SliderItem(float f, ClosedFloatingPointRange<Float> sliderRange) {
        Intrinsics.checkNotNullParameter(sliderRange, "sliderRange");
        this.sliderValue = f;
        this.sliderRange = sliderRange;
    }

    public final float getSliderValue() {
        return this.sliderValue;
    }

    public /* synthetic */ SliderItem(float f, ClosedFloatingPointRange closedFloatingPointRange, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? RangesKt.rangeTo(0.0f, 100.0f) : closedFloatingPointRange);
    }

    public final ClosedFloatingPointRange<Float> getSliderRange() {
        return this.sliderRange;
    }
}
