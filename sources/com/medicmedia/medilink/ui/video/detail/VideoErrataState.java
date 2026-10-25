package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoInfoPanelState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoErrataState;", "", "errata", "", "<init>", "(Ljava/lang/String;)V", "getErrata", "()Ljava/lang/String;", "visible", "", "getVisible", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoErrataState {
    public static final int $stable = 0;
    private final String errata;

    public VideoErrataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VideoErrataState copy$default(VideoErrataState videoErrataState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoErrataState.errata;
        }
        return videoErrataState.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getErrata() {
        return this.errata;
    }

    public final VideoErrataState copy(String errata) {
        Intrinsics.checkNotNullParameter(errata, "errata");
        return new VideoErrataState(errata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VideoErrataState) && Intrinsics.areEqual(this.errata, ((VideoErrataState) other).errata);
    }

    public int hashCode() {
        return this.errata.hashCode();
    }

    public String toString() {
        return "VideoErrataState(errata=" + this.errata + ")";
    }

    public VideoErrataState(String errata) {
        Intrinsics.checkNotNullParameter(errata, "errata");
        this.errata = errata;
    }

    public /* synthetic */ VideoErrataState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    public final String getErrata() {
        return this.errata;
    }

    public final boolean getVisible() {
        return this.errata.length() > 0;
    }
}
