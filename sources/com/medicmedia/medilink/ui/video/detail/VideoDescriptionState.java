package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoInfoPanelState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoDescriptionState;", "", "description", "", "visible", "", "isSample", "initiallyExpanded", "<init>", "(Ljava/lang/String;ZZZ)V", "getDescription", "()Ljava/lang/String;", "getVisible", "()Z", "getInitiallyExpanded", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoDescriptionState {
    public static final int $stable = 0;
    private final String description;
    private final boolean initiallyExpanded;
    private final boolean isSample;
    private final boolean visible;

    public VideoDescriptionState() {
        this(null, false, false, false, 15, null);
    }

    public static /* synthetic */ VideoDescriptionState copy$default(VideoDescriptionState videoDescriptionState, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoDescriptionState.description;
        }
        if ((i & 2) != 0) {
            z = videoDescriptionState.visible;
        }
        if ((i & 4) != 0) {
            z2 = videoDescriptionState.isSample;
        }
        if ((i & 8) != 0) {
            z3 = videoDescriptionState.initiallyExpanded;
        }
        return videoDescriptionState.copy(str, z, z2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSample() {
        return this.isSample;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getInitiallyExpanded() {
        return this.initiallyExpanded;
    }

    public final VideoDescriptionState copy(String description, boolean visible, boolean isSample, boolean initiallyExpanded) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new VideoDescriptionState(description, visible, isSample, initiallyExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoDescriptionState)) {
            return false;
        }
        VideoDescriptionState videoDescriptionState = (VideoDescriptionState) other;
        return Intrinsics.areEqual(this.description, videoDescriptionState.description) && this.visible == videoDescriptionState.visible && this.isSample == videoDescriptionState.isSample && this.initiallyExpanded == videoDescriptionState.initiallyExpanded;
    }

    public int hashCode() {
        return (((((this.description.hashCode() * 31) + Boolean.hashCode(this.visible)) * 31) + Boolean.hashCode(this.isSample)) * 31) + Boolean.hashCode(this.initiallyExpanded);
    }

    public String toString() {
        return "VideoDescriptionState(description=" + this.description + ", visible=" + this.visible + ", isSample=" + this.isSample + ", initiallyExpanded=" + this.initiallyExpanded + ")";
    }

    public VideoDescriptionState(String description, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.description = description;
        this.visible = z;
        this.isSample = z2;
        this.initiallyExpanded = z3;
    }

    public /* synthetic */ VideoDescriptionState(String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public final boolean isSample() {
        return this.isSample;
    }

    public final boolean getInitiallyExpanded() {
        return this.initiallyExpanded;
    }
}
