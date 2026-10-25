package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: VideoDetailItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0014\u001a\u00020\u0005H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlaybackKey;", "", "videoHash", "", "courseId", "", "<init>", "(Ljava/lang/String;I)V", "getVideoHash", "()Ljava/lang/String;", "getCourseId", "()I", "isValid", "", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoPlaybackKey {
    public static final int $stable = 0;
    private final int courseId;
    private final String videoHash;

    public static /* synthetic */ VideoPlaybackKey copy$default(VideoPlaybackKey videoPlaybackKey, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = videoPlaybackKey.videoHash;
        }
        if ((i2 & 2) != 0) {
            i = videoPlaybackKey.courseId;
        }
        return videoPlaybackKey.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVideoHash() {
        return this.videoHash;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    public final VideoPlaybackKey copy(String videoHash, int courseId) {
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        return new VideoPlaybackKey(videoHash, courseId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoPlaybackKey)) {
            return false;
        }
        VideoPlaybackKey videoPlaybackKey = (VideoPlaybackKey) other;
        return Intrinsics.areEqual(this.videoHash, videoPlaybackKey.videoHash) && this.courseId == videoPlaybackKey.courseId;
    }

    public int hashCode() {
        return (this.videoHash.hashCode() * 31) + Integer.hashCode(this.courseId);
    }

    public String toString() {
        return "VideoPlaybackKey(videoHash=" + this.videoHash + ", courseId=" + this.courseId + ")";
    }

    public VideoPlaybackKey(String videoHash, int i) {
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        this.videoHash = videoHash;
        this.courseId = i;
    }

    public final String getVideoHash() {
        return this.videoHash;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final boolean isValid() {
        return !StringsKt.isBlank(this.videoHash);
    }
}
