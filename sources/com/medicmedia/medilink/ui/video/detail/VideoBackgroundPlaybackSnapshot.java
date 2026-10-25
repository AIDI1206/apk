package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoBackgroundPlaybackController.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackSnapshot;", "", "resumeIndex", "", "resumePositionMs", "", "resumeMediaId", "", "<init>", "(IJLjava/lang/String;)V", "getResumeIndex", "()I", "getResumePositionMs", "()J", "getResumeMediaId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoBackgroundPlaybackSnapshot {
    public static final int $stable = 0;
    private final int resumeIndex;
    private final String resumeMediaId;
    private final long resumePositionMs;

    public static /* synthetic */ VideoBackgroundPlaybackSnapshot copy$default(VideoBackgroundPlaybackSnapshot videoBackgroundPlaybackSnapshot, int i, long j, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoBackgroundPlaybackSnapshot.resumeIndex;
        }
        if ((i2 & 2) != 0) {
            j = videoBackgroundPlaybackSnapshot.resumePositionMs;
        }
        if ((i2 & 4) != 0) {
            str = videoBackgroundPlaybackSnapshot.resumeMediaId;
        }
        return videoBackgroundPlaybackSnapshot.copy(i, j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getResumeIndex() {
        return this.resumeIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getResumePositionMs() {
        return this.resumePositionMs;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getResumeMediaId() {
        return this.resumeMediaId;
    }

    public final VideoBackgroundPlaybackSnapshot copy(int resumeIndex, long resumePositionMs, String resumeMediaId) {
        return new VideoBackgroundPlaybackSnapshot(resumeIndex, resumePositionMs, resumeMediaId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoBackgroundPlaybackSnapshot)) {
            return false;
        }
        VideoBackgroundPlaybackSnapshot videoBackgroundPlaybackSnapshot = (VideoBackgroundPlaybackSnapshot) other;
        return this.resumeIndex == videoBackgroundPlaybackSnapshot.resumeIndex && this.resumePositionMs == videoBackgroundPlaybackSnapshot.resumePositionMs && Intrinsics.areEqual(this.resumeMediaId, videoBackgroundPlaybackSnapshot.resumeMediaId);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.resumeIndex) * 31) + Long.hashCode(this.resumePositionMs)) * 31;
        String str = this.resumeMediaId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VideoBackgroundPlaybackSnapshot(resumeIndex=" + this.resumeIndex + ", resumePositionMs=" + this.resumePositionMs + ", resumeMediaId=" + this.resumeMediaId + ")";
    }

    public VideoBackgroundPlaybackSnapshot(int i, long j, String str) {
        this.resumeIndex = i;
        this.resumePositionMs = j;
        this.resumeMediaId = str;
    }

    public final int getResumeIndex() {
        return this.resumeIndex;
    }

    public final long getResumePositionMs() {
        return this.resumePositionMs;
    }

    public final String getResumeMediaId() {
        return this.resumeMediaId;
    }
}
