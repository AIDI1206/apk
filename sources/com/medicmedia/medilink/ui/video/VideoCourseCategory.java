package com.medicmedia.medilink.ui.video;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.medicmedia.medilink.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoCourseCategory;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "textColor", "Landroidx/compose/ui/graphics/Color;", "bgColor", "<init>", "(Ljava/lang/String;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLabel", "()Ljava/lang/String;", "getTextColor-0d7_KjU", "()J", "J", "getBgColor-0d7_KjU", "component1", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "copy", "copy-WkMS-hQ", "(Ljava/lang/String;JJ)Lcom/medicmedia/medilink/ui/video/VideoCourseCategory;", "equals", "", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoCourseCategory {
    public static final int $stable = 0;
    private final long bgColor;
    private final String label;
    private final long textColor;

    public /* synthetic */ VideoCourseCategory(String str, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2);
    }

    /* JADX INFO: renamed from: copy-WkMS-hQ$default, reason: not valid java name */
    public static /* synthetic */ VideoCourseCategory m11046copyWkMShQ$default(VideoCourseCategory videoCourseCategory, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoCourseCategory.label;
        }
        if ((i & 2) != 0) {
            j = videoCourseCategory.textColor;
        }
        if ((i & 4) != 0) {
            j2 = videoCourseCategory.bgColor;
        }
        return videoCourseCategory.m11049copyWkMShQ(str, j, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: copy-WkMS-hQ, reason: not valid java name */
    public final VideoCourseCategory m11049copyWkMShQ(String label, long textColor, long bgColor) {
        Intrinsics.checkNotNullParameter(label, "label");
        return new VideoCourseCategory(label, textColor, bgColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCourseCategory)) {
            return false;
        }
        VideoCourseCategory videoCourseCategory = (VideoCourseCategory) other;
        return Intrinsics.areEqual(this.label, videoCourseCategory.label) && Color.m5960equalsimpl0(this.textColor, videoCourseCategory.textColor) && Color.m5960equalsimpl0(this.bgColor, videoCourseCategory.bgColor);
    }

    public int hashCode() {
        return (((this.label.hashCode() * 31) + Color.m5966hashCodeimpl(this.textColor)) * 31) + Color.m5966hashCodeimpl(this.bgColor);
    }

    public String toString() {
        return "VideoCourseCategory(label=" + this.label + ", textColor=" + Color.m5967toStringimpl(this.textColor) + ", bgColor=" + Color.m5967toStringimpl(this.bgColor) + ")";
    }

    private VideoCourseCategory(String label, long j, long j2) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.textColor = j;
        this.bgColor = j2;
    }

    public /* synthetic */ VideoCourseCategory(String str, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ColorKt.getBlack50() : j, (i & 4) != 0 ? ColorKt.getOuterCardColor() : j2, null);
    }

    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: getTextColor-0d7_KjU, reason: not valid java name */
    public final long m11051getTextColor0d7_KjU() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: getBgColor-0d7_KjU, reason: not valid java name */
    public final long m11050getBgColor0d7_KjU() {
        return this.bgColor;
    }
}
