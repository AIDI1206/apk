package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: VideoInfoPanelState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000f\u001a\u00020\u0010H×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoRelatedNavigationState;", "", "showQb", "", "showInput", "<init>", "(ZZ)V", "getShowQb", "()Z", "getShowInput", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoRelatedNavigationState {
    public static final int $stable = 0;
    private final boolean showInput;
    private final boolean showQb;

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoRelatedNavigationState() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ VideoRelatedNavigationState copy$default(VideoRelatedNavigationState videoRelatedNavigationState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = videoRelatedNavigationState.showQb;
        }
        if ((i & 2) != 0) {
            z2 = videoRelatedNavigationState.showInput;
        }
        return videoRelatedNavigationState.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowQb() {
        return this.showQb;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowInput() {
        return this.showInput;
    }

    public final VideoRelatedNavigationState copy(boolean showQb, boolean showInput) {
        return new VideoRelatedNavigationState(showQb, showInput);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoRelatedNavigationState)) {
            return false;
        }
        VideoRelatedNavigationState videoRelatedNavigationState = (VideoRelatedNavigationState) other;
        return this.showQb == videoRelatedNavigationState.showQb && this.showInput == videoRelatedNavigationState.showInput;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.showQb) * 31) + Boolean.hashCode(this.showInput);
    }

    public String toString() {
        return "VideoRelatedNavigationState(showQb=" + this.showQb + ", showInput=" + this.showInput + ")";
    }

    public VideoRelatedNavigationState(boolean z, boolean z2) {
        this.showQb = z;
        this.showInput = z2;
    }

    public /* synthetic */ VideoRelatedNavigationState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean getShowQb() {
        return this.showQb;
    }

    public final boolean getShowInput() {
        return this.showInput;
    }
}
