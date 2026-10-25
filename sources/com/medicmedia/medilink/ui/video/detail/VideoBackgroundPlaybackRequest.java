package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.MediaItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoBackgroundPlaybackController.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Jk\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÇ\u0001J\u0013\u0010*\u001a\u00020\r2\b\u0010+\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010,\u001a\u00020\u0006H×\u0001J\t\u0010-\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackRequest;", "", "contentsId", "", "videoHash", "courseId", "", "chapterId", "resumeIndex", "resumePositionMs", "", "resumeMediaId", "isPlayList", "", "mediaItems", "", "Lcom/google/android/exoplayer2/MediaItem;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIJLjava/lang/String;ZLjava/util/List;)V", "getContentsId", "()Ljava/lang/String;", "getVideoHash", "getCourseId", "()I", "getChapterId", "getResumeIndex", "getResumePositionMs", "()J", "getResumeMediaId", "()Z", "getMediaItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoBackgroundPlaybackRequest {
    public static final int $stable = 8;
    private final int chapterId;
    private final String contentsId;
    private final int courseId;
    private final boolean isPlayList;
    private final List<MediaItem> mediaItems;
    private final int resumeIndex;
    private final String resumeMediaId;
    private final long resumePositionMs;
    private final String videoHash;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoBackgroundPlaybackRequest copy$default(VideoBackgroundPlaybackRequest videoBackgroundPlaybackRequest, String str, String str2, int i, int i2, int i3, long j, String str3, boolean z, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = videoBackgroundPlaybackRequest.contentsId;
        }
        if ((i4 & 2) != 0) {
            str2 = videoBackgroundPlaybackRequest.videoHash;
        }
        if ((i4 & 4) != 0) {
            i = videoBackgroundPlaybackRequest.courseId;
        }
        if ((i4 & 8) != 0) {
            i2 = videoBackgroundPlaybackRequest.chapterId;
        }
        if ((i4 & 16) != 0) {
            i3 = videoBackgroundPlaybackRequest.resumeIndex;
        }
        if ((i4 & 32) != 0) {
            j = videoBackgroundPlaybackRequest.resumePositionMs;
        }
        if ((i4 & 64) != 0) {
            str3 = videoBackgroundPlaybackRequest.resumeMediaId;
        }
        if ((i4 & 128) != 0) {
            z = videoBackgroundPlaybackRequest.isPlayList;
        }
        if ((i4 & 256) != 0) {
            list = videoBackgroundPlaybackRequest.mediaItems;
        }
        List list2 = list;
        String str4 = str3;
        long j2 = j;
        int i5 = i2;
        int i6 = i3;
        int i7 = i;
        return videoBackgroundPlaybackRequest.copy(str, str2, i7, i5, i6, j2, str4, z, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVideoHash() {
        return this.videoHash;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getChapterId() {
        return this.chapterId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getResumeIndex() {
        return this.resumeIndex;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getResumePositionMs() {
        return this.resumePositionMs;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getResumeMediaId() {
        return this.resumeMediaId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsPlayList() {
        return this.isPlayList;
    }

    public final List<MediaItem> component9() {
        return this.mediaItems;
    }

    public final VideoBackgroundPlaybackRequest copy(String contentsId, String videoHash, int courseId, int chapterId, int resumeIndex, long resumePositionMs, String resumeMediaId, boolean isPlayList, List<MediaItem> mediaItems) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
        return new VideoBackgroundPlaybackRequest(contentsId, videoHash, courseId, chapterId, resumeIndex, resumePositionMs, resumeMediaId, isPlayList, mediaItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoBackgroundPlaybackRequest)) {
            return false;
        }
        VideoBackgroundPlaybackRequest videoBackgroundPlaybackRequest = (VideoBackgroundPlaybackRequest) other;
        return Intrinsics.areEqual(this.contentsId, videoBackgroundPlaybackRequest.contentsId) && Intrinsics.areEqual(this.videoHash, videoBackgroundPlaybackRequest.videoHash) && this.courseId == videoBackgroundPlaybackRequest.courseId && this.chapterId == videoBackgroundPlaybackRequest.chapterId && this.resumeIndex == videoBackgroundPlaybackRequest.resumeIndex && this.resumePositionMs == videoBackgroundPlaybackRequest.resumePositionMs && Intrinsics.areEqual(this.resumeMediaId, videoBackgroundPlaybackRequest.resumeMediaId) && this.isPlayList == videoBackgroundPlaybackRequest.isPlayList && Intrinsics.areEqual(this.mediaItems, videoBackgroundPlaybackRequest.mediaItems);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.contentsId.hashCode() * 31) + this.videoHash.hashCode()) * 31) + Integer.hashCode(this.courseId)) * 31) + Integer.hashCode(this.chapterId)) * 31) + Integer.hashCode(this.resumeIndex)) * 31) + Long.hashCode(this.resumePositionMs)) * 31;
        String str = this.resumeMediaId;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isPlayList)) * 31) + this.mediaItems.hashCode();
    }

    public String toString() {
        return "VideoBackgroundPlaybackRequest(contentsId=" + this.contentsId + ", videoHash=" + this.videoHash + ", courseId=" + this.courseId + ", chapterId=" + this.chapterId + ", resumeIndex=" + this.resumeIndex + ", resumePositionMs=" + this.resumePositionMs + ", resumeMediaId=" + this.resumeMediaId + ", isPlayList=" + this.isPlayList + ", mediaItems=" + this.mediaItems + ")";
    }

    public VideoBackgroundPlaybackRequest(String contentsId, String videoHash, int i, int i2, int i3, long j, String str, boolean z, List<MediaItem> mediaItems) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        Intrinsics.checkNotNullParameter(mediaItems, "mediaItems");
        this.contentsId = contentsId;
        this.videoHash = videoHash;
        this.courseId = i;
        this.chapterId = i2;
        this.resumeIndex = i3;
        this.resumePositionMs = j;
        this.resumeMediaId = str;
        this.isPlayList = z;
        this.mediaItems = mediaItems;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final String getVideoHash() {
        return this.videoHash;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getChapterId() {
        return this.chapterId;
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

    public final boolean isPlayList() {
        return this.isPlayList;
    }

    public final List<MediaItem> getMediaItems() {
        return this.mediaItems;
    }
}
