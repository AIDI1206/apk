package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.VideoSubItem;
import com.medicmedia.medilink.ui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoListHeaderItem;", "", "courseId", "", "isContinue", "", "videoItem", "Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "<init>", "(IZLcom/medicmedia/medilink/domain/model/VideoSubItem;)V", "getCourseId", "()I", "()Z", "getVideoItem", "()Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "labelId", "getLabelId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoListHeaderItem {
    public static final int $stable = 8;
    private final int courseId;
    private final boolean isContinue;
    private final VideoSubItem videoItem;

    public static /* synthetic */ VideoListHeaderItem copy$default(VideoListHeaderItem videoListHeaderItem, int i, boolean z, VideoSubItem videoSubItem, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoListHeaderItem.courseId;
        }
        if ((i2 & 2) != 0) {
            z = videoListHeaderItem.isContinue;
        }
        if ((i2 & 4) != 0) {
            videoSubItem = videoListHeaderItem.videoItem;
        }
        return videoListHeaderItem.copy(i, z, videoSubItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsContinue() {
        return this.isContinue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VideoSubItem getVideoItem() {
        return this.videoItem;
    }

    public final VideoListHeaderItem copy(int courseId, boolean isContinue, VideoSubItem videoItem) {
        return new VideoListHeaderItem(courseId, isContinue, videoItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoListHeaderItem)) {
            return false;
        }
        VideoListHeaderItem videoListHeaderItem = (VideoListHeaderItem) other;
        return this.courseId == videoListHeaderItem.courseId && this.isContinue == videoListHeaderItem.isContinue && Intrinsics.areEqual(this.videoItem, videoListHeaderItem.videoItem);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.courseId) * 31) + Boolean.hashCode(this.isContinue)) * 31;
        VideoSubItem videoSubItem = this.videoItem;
        return iHashCode + (videoSubItem == null ? 0 : videoSubItem.hashCode());
    }

    public String toString() {
        return "VideoListHeaderItem(courseId=" + this.courseId + ", isContinue=" + this.isContinue + ", videoItem=" + this.videoItem + ")";
    }

    public VideoListHeaderItem(int i, boolean z, VideoSubItem videoSubItem) {
        this.courseId = i;
        this.isContinue = z;
        this.videoItem = videoSubItem;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final boolean isContinue() {
        return this.isContinue;
    }

    public final VideoSubItem getVideoItem() {
        return this.videoItem;
    }

    public final int getLabelId() {
        if (this.isContinue) {
            return R.string.video_content_header_continue_watching;
        }
        return R.string.video_content_header_first_watching;
    }
}
