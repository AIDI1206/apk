package com.medicmedia.medilink.ui.video.detail.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.VideoSubItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoBookmarkCoordinator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/util/VideoBookmarkToggleRequest;", "", "contentsId", "", "videoSubItem", "Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "bookmarked", "", "<init>", "(Ljava/lang/String;Lcom/medicmedia/medilink/domain/model/VideoSubItem;Z)V", "getContentsId", "()Ljava/lang/String;", "getVideoSubItem", "()Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "getBookmarked", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoBookmarkToggleRequest {
    public static final int $stable = 8;
    private final boolean bookmarked;
    private final String contentsId;
    private final VideoSubItem videoSubItem;

    public static /* synthetic */ VideoBookmarkToggleRequest copy$default(VideoBookmarkToggleRequest videoBookmarkToggleRequest, String str, VideoSubItem videoSubItem, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoBookmarkToggleRequest.contentsId;
        }
        if ((i & 2) != 0) {
            videoSubItem = videoBookmarkToggleRequest.videoSubItem;
        }
        if ((i & 4) != 0) {
            z = videoBookmarkToggleRequest.bookmarked;
        }
        return videoBookmarkToggleRequest.copy(str, videoSubItem, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoSubItem getVideoSubItem() {
        return this.videoSubItem;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getBookmarked() {
        return this.bookmarked;
    }

    public final VideoBookmarkToggleRequest copy(String contentsId, VideoSubItem videoSubItem, boolean bookmarked) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(videoSubItem, "videoSubItem");
        return new VideoBookmarkToggleRequest(contentsId, videoSubItem, bookmarked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoBookmarkToggleRequest)) {
            return false;
        }
        VideoBookmarkToggleRequest videoBookmarkToggleRequest = (VideoBookmarkToggleRequest) other;
        return Intrinsics.areEqual(this.contentsId, videoBookmarkToggleRequest.contentsId) && Intrinsics.areEqual(this.videoSubItem, videoBookmarkToggleRequest.videoSubItem) && this.bookmarked == videoBookmarkToggleRequest.bookmarked;
    }

    public int hashCode() {
        return (((this.contentsId.hashCode() * 31) + this.videoSubItem.hashCode()) * 31) + Boolean.hashCode(this.bookmarked);
    }

    public String toString() {
        return "VideoBookmarkToggleRequest(contentsId=" + this.contentsId + ", videoSubItem=" + this.videoSubItem + ", bookmarked=" + this.bookmarked + ")";
    }

    public VideoBookmarkToggleRequest(String contentsId, VideoSubItem videoSubItem, boolean z) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(videoSubItem, "videoSubItem");
        this.contentsId = contentsId;
        this.videoSubItem = videoSubItem;
        this.bookmarked = z;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final VideoSubItem getVideoSubItem() {
        return this.videoSubItem;
    }

    public final boolean getBookmarked() {
        return this.bookmarked;
    }
}
