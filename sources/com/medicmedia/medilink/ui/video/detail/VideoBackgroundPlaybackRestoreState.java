package com.medicmedia.medilink.ui.video.detail;

import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoBackgroundPlaybackRestoreState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J_\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÇ\u0001J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010&\u001a\u00020\bH×\u0001J\t\u0010'\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001a¨\u0006)"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackRestoreState;", "", "contentsId", "", "videoHash", "courseId", "chapterId", "resumeIndex", "", "resumePositionMs", "", "resumeMediaId", "isPlayList", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Z)V", "getContentsId", "()Ljava/lang/String;", "getVideoHash", "getCourseId", "getChapterId", "getResumeIndex", "()I", "getResumePositionMs", "()J", "getResumeMediaId", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoBackgroundPlaybackRestoreState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String chapterId;
    private final String contentsId;
    private final String courseId;
    private final boolean isPlayList;
    private final int resumeIndex;
    private final String resumeMediaId;
    private final long resumePositionMs;
    private final String videoHash;

    public static /* synthetic */ VideoBackgroundPlaybackRestoreState copy$default(VideoBackgroundPlaybackRestoreState videoBackgroundPlaybackRestoreState, String str, String str2, String str3, String str4, int i, long j, String str5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = videoBackgroundPlaybackRestoreState.contentsId;
        }
        if ((i2 & 2) != 0) {
            str2 = videoBackgroundPlaybackRestoreState.videoHash;
        }
        if ((i2 & 4) != 0) {
            str3 = videoBackgroundPlaybackRestoreState.courseId;
        }
        if ((i2 & 8) != 0) {
            str4 = videoBackgroundPlaybackRestoreState.chapterId;
        }
        if ((i2 & 16) != 0) {
            i = videoBackgroundPlaybackRestoreState.resumeIndex;
        }
        if ((i2 & 32) != 0) {
            j = videoBackgroundPlaybackRestoreState.resumePositionMs;
        }
        if ((i2 & 64) != 0) {
            str5 = videoBackgroundPlaybackRestoreState.resumeMediaId;
        }
        if ((i2 & 128) != 0) {
            z = videoBackgroundPlaybackRestoreState.isPlayList;
        }
        long j2 = j;
        String str6 = str4;
        int i3 = i;
        String str7 = str3;
        return videoBackgroundPlaybackRestoreState.copy(str, str2, str7, str6, i3, j2, str5, z);
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
    public final String getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChapterId() {
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

    public final VideoBackgroundPlaybackRestoreState copy(String contentsId, String videoHash, String courseId, String chapterId, int resumeIndex, long resumePositionMs, String resumeMediaId, boolean isPlayList) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        return new VideoBackgroundPlaybackRestoreState(contentsId, videoHash, courseId, chapterId, resumeIndex, resumePositionMs, resumeMediaId, isPlayList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoBackgroundPlaybackRestoreState)) {
            return false;
        }
        VideoBackgroundPlaybackRestoreState videoBackgroundPlaybackRestoreState = (VideoBackgroundPlaybackRestoreState) other;
        return Intrinsics.areEqual(this.contentsId, videoBackgroundPlaybackRestoreState.contentsId) && Intrinsics.areEqual(this.videoHash, videoBackgroundPlaybackRestoreState.videoHash) && Intrinsics.areEqual(this.courseId, videoBackgroundPlaybackRestoreState.courseId) && Intrinsics.areEqual(this.chapterId, videoBackgroundPlaybackRestoreState.chapterId) && this.resumeIndex == videoBackgroundPlaybackRestoreState.resumeIndex && this.resumePositionMs == videoBackgroundPlaybackRestoreState.resumePositionMs && Intrinsics.areEqual(this.resumeMediaId, videoBackgroundPlaybackRestoreState.resumeMediaId) && this.isPlayList == videoBackgroundPlaybackRestoreState.isPlayList;
    }

    public int hashCode() {
        int iHashCode = ((this.contentsId.hashCode() * 31) + this.videoHash.hashCode()) * 31;
        String str = this.courseId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.chapterId;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.resumeIndex)) * 31) + Long.hashCode(this.resumePositionMs)) * 31;
        String str3 = this.resumeMediaId;
        return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPlayList);
    }

    public String toString() {
        return "VideoBackgroundPlaybackRestoreState(contentsId=" + this.contentsId + ", videoHash=" + this.videoHash + ", courseId=" + this.courseId + ", chapterId=" + this.chapterId + ", resumeIndex=" + this.resumeIndex + ", resumePositionMs=" + this.resumePositionMs + ", resumeMediaId=" + this.resumeMediaId + ", isPlayList=" + this.isPlayList + ")";
    }

    public VideoBackgroundPlaybackRestoreState(String contentsId, String videoHash, String str, String str2, int i, long j, String str3, boolean z) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        this.contentsId = contentsId;
        this.videoHash = videoHash;
        this.courseId = str;
        this.chapterId = str2;
        this.resumeIndex = i;
        this.resumePositionMs = j;
        this.resumeMediaId = str3;
        this.isPlayList = z;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final String getVideoHash() {
        return this.videoHash;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final String getChapterId() {
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

    /* JADX INFO: compiled from: VideoBackgroundPlaybackRestoreState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackRestoreState$Companion;", "", "<init>", "()V", "from", "Lcom/medicmedia/medilink/ui/video/detail/VideoBackgroundPlaybackRestoreState;", "intent", "Landroid/content/Intent;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoBackgroundPlaybackRestoreState from(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra = intent.getStringExtra("contents_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            String stringExtra2 = intent.getStringExtra("video_hash");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            return new VideoBackgroundPlaybackRestoreState(stringExtra, stringExtra2, intent.getStringExtra(BundleKey.COURSE_ID), intent.getStringExtra("chapter_id"), intent.getIntExtra(BundleKey.RESUME_INDEX, 0), intent.getLongExtra(BundleKey.PLAY_MS, 0L), intent.getStringExtra(BundleKey.RESUME_MEDIA_ID), intent.getBooleanExtra(BundleKey.PLAY_LIST, false));
        }
    }
}
