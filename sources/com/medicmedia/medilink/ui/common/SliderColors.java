package com.medicmedia.medilink.ui.common;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SeekbarLikeSlider.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\u001aH×\u0001J\t\u0010\u001b\u001a\u00020\u001cH×\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/ui/common/SliderColors;", "", "thumb", "Landroidx/compose/ui/graphics/Color;", "activeTrack", "inactiveTrack", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getThumb-0d7_KjU", "()J", "J", "getActiveTrack-0d7_KjU", "getInactiveTrack-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-ysEtTa8", "(JJJ)Lcom/medicmedia/medilink/ui/common/SliderColors;", "equals", "", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SliderColors {
    public static final int $stable = 0;
    private final long activeTrack;
    private final long inactiveTrack;
    private final long thumb;

    public /* synthetic */ SliderColors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    /* JADX INFO: renamed from: copy-ysEtTa8$default, reason: not valid java name */
    public static /* synthetic */ SliderColors m10702copyysEtTa8$default(SliderColors sliderColors, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sliderColors.thumb;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = sliderColors.activeTrack;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = sliderColors.inactiveTrack;
        }
        return sliderColors.m10706copyysEtTa8(j4, j5, j3);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getThumb() {
        return this.thumb;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveTrack() {
        return this.activeTrack;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveTrack() {
        return this.inactiveTrack;
    }

    /* JADX INFO: renamed from: copy-ysEtTa8, reason: not valid java name */
    public final SliderColors m10706copyysEtTa8(long thumb, long activeTrack, long inactiveTrack) {
        return new SliderColors(thumb, activeTrack, inactiveTrack, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) other;
        return Color.m5960equalsimpl0(this.thumb, sliderColors.thumb) && Color.m5960equalsimpl0(this.activeTrack, sliderColors.activeTrack) && Color.m5960equalsimpl0(this.inactiveTrack, sliderColors.inactiveTrack);
    }

    public int hashCode() {
        return (((Color.m5966hashCodeimpl(this.thumb) * 31) + Color.m5966hashCodeimpl(this.activeTrack)) * 31) + Color.m5966hashCodeimpl(this.inactiveTrack);
    }

    public String toString() {
        return "SliderColors(thumb=" + Color.m5967toStringimpl(this.thumb) + ", activeTrack=" + Color.m5967toStringimpl(this.activeTrack) + ", inactiveTrack=" + Color.m5967toStringimpl(this.inactiveTrack) + ")";
    }

    private SliderColors(long j, long j2, long j3) {
        this.thumb = j;
        this.activeTrack = j2;
        this.inactiveTrack = j3;
    }

    public /* synthetic */ SliderColors(long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ColorKt.getColorPrimary() : j, (i & 2) != 0 ? ColorKt.getColorPrimary() : j2, (i & 4) != 0 ? ColorKt.getInactiveTrackColor() : j3, null);
    }

    /* JADX INFO: renamed from: getThumb-0d7_KjU, reason: not valid java name */
    public final long m10709getThumb0d7_KjU() {
        return this.thumb;
    }

    /* JADX INFO: renamed from: getActiveTrack-0d7_KjU, reason: not valid java name */
    public final long m10707getActiveTrack0d7_KjU() {
        return this.activeTrack;
    }

    /* JADX INFO: renamed from: getInactiveTrack-0d7_KjU, reason: not valid java name */
    public final long m10708getInactiveTrack0d7_KjU() {
        return this.inactiveTrack;
    }
}
