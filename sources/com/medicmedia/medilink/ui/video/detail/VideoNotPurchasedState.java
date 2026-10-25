package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoInfoPanelState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoNotPurchasedState;", "", BundleKey.THUMBNAIL, "", "infoHeader", "Lcom/medicmedia/medilink/ui/video/detail/VideoInfoHeaderState;", "<init>", "(Ljava/lang/String;Lcom/medicmedia/medilink/ui/video/detail/VideoInfoHeaderState;)V", "getThumbnail", "()Ljava/lang/String;", "getInfoHeader", "()Lcom/medicmedia/medilink/ui/video/detail/VideoInfoHeaderState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoNotPurchasedState {
    public static final int $stable = 8;
    private final VideoInfoHeaderState infoHeader;
    private final String thumbnail;

    public VideoNotPurchasedState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ VideoNotPurchasedState copy$default(VideoNotPurchasedState videoNotPurchasedState, String str, VideoInfoHeaderState videoInfoHeaderState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoNotPurchasedState.thumbnail;
        }
        if ((i & 2) != 0) {
            videoInfoHeaderState = videoNotPurchasedState.infoHeader;
        }
        return videoNotPurchasedState.copy(str, videoInfoHeaderState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoInfoHeaderState getInfoHeader() {
        return this.infoHeader;
    }

    public final VideoNotPurchasedState copy(String thumbnail, VideoInfoHeaderState infoHeader) {
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(infoHeader, "infoHeader");
        return new VideoNotPurchasedState(thumbnail, infoHeader);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoNotPurchasedState)) {
            return false;
        }
        VideoNotPurchasedState videoNotPurchasedState = (VideoNotPurchasedState) other;
        return Intrinsics.areEqual(this.thumbnail, videoNotPurchasedState.thumbnail) && Intrinsics.areEqual(this.infoHeader, videoNotPurchasedState.infoHeader);
    }

    public int hashCode() {
        return (this.thumbnail.hashCode() * 31) + this.infoHeader.hashCode();
    }

    public String toString() {
        return "VideoNotPurchasedState(thumbnail=" + this.thumbnail + ", infoHeader=" + this.infoHeader + ")";
    }

    public VideoNotPurchasedState(String thumbnail, VideoInfoHeaderState infoHeader) {
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter(infoHeader, "infoHeader");
        this.thumbnail = thumbnail;
        this.infoHeader = infoHeader;
    }

    public /* synthetic */ VideoNotPurchasedState(String str, VideoInfoHeaderState videoInfoHeaderState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new VideoInfoHeaderState(null, null, 0.0f, false, false, 31, null) : videoInfoHeaderState);
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final VideoInfoHeaderState getInfoHeader() {
        return this.infoHeader;
    }
}
