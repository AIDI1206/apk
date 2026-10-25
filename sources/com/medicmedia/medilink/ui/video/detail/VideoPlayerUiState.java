package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.Player;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.model.VideoPipMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoPlayerUiState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0007HÆ\u0003J\t\u0010A\u001a\u00020\u0007HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\fHÆ\u0003J\t\u0010E\u001a\u00020\fHÆ\u0003J\t\u0010F\u001a\u00020\fHÆ\u0003J\t\u0010G\u001a\u00020\u0010HÆ\u0003J\t\u0010H\u001a\u00020\u0012HÆ\u0003J\t\u0010I\u001a\u00020\u0014HÆ\u0003J\t\u0010J\u001a\u00020\u0014HÆ\u0003J\t\u0010K\u001a\u00020\u0017HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u00105JÐ\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014HÇ\u0001¢\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020\u00032\b\u0010T\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010U\u001a\u00020\u0014H×\u0001J\t\u0010V\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001fR\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0011\u00107\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b7\u0010\u001fR\u0011\u00108\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b8\u0010\u001fR\u0011\u00109\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b9\u0010\u001fR\u0011\u0010:\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b;\u0010\u001fR\u0011\u0010<\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b=\u0010\u001f¨\u0006W"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerUiState;", "", "isLoading", "", "player", "Lcom/google/android/exoplayer2/Player;", HistoryRepositoryImpl.FieldName.TITLE, "", "subtitle", "isPlaying", "isControllerVisible", "currentPositionMs", "", "durationMs", "bufferedPositionMs", "playbackSpeed", "", "fullscreenMode", "Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode;", "playableMediaCount", "", "currentMediaIndex", "pipMode", "Lcom/medicmedia/medilink/domain/model/VideoPipMode;", "isPipEnabled", "canShowToc", "canShowMemo", "isVerticalVideo", "errorMessage", "<init>", "(ZLcom/google/android/exoplayer2/Player;Ljava/lang/String;Ljava/lang/String;ZZJJJFLcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode;IILcom/medicmedia/medilink/domain/model/VideoPipMode;ZZZZLjava/lang/Integer;)V", "()Z", "getPlayer", "()Lcom/google/android/exoplayer2/Player;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getCurrentPositionMs", "()J", "getDurationMs", "getBufferedPositionMs", "getPlaybackSpeed", "()F", "getFullscreenMode", "()Lcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode;", "getPlayableMediaCount", "()I", "getCurrentMediaIndex", "getPipMode", "()Lcom/medicmedia/medilink/domain/model/VideoPipMode;", "getCanShowToc", "getCanShowMemo", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "isFullscreen", "isAutoFullscreen", "isInPipMode", "canSkipPrevious", "getCanSkipPrevious", "canSkipNext", "getCanSkipNext", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(ZLcom/google/android/exoplayer2/Player;Ljava/lang/String;Ljava/lang/String;ZZJJJFLcom/medicmedia/medilink/ui/video/detail/VideoFullscreenMode;IILcom/medicmedia/medilink/domain/model/VideoPipMode;ZZZZLjava/lang/Integer;)Lcom/medicmedia/medilink/ui/video/detail/VideoPlayerUiState;", "equals", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoPlayerUiState {
    public static final int $stable = 8;
    private final long bufferedPositionMs;
    private final boolean canShowMemo;
    private final boolean canShowToc;
    private final int currentMediaIndex;
    private final long currentPositionMs;
    private final long durationMs;
    private final Integer errorMessage;
    private final VideoFullscreenMode fullscreenMode;
    private final boolean isControllerVisible;
    private final boolean isLoading;
    private final boolean isPipEnabled;
    private final boolean isPlaying;
    private final boolean isVerticalVideo;
    private final VideoPipMode pipMode;
    private final int playableMediaCount;
    private final float playbackSpeed;
    private final Player player;
    private final String subtitle;
    private final String title;

    public VideoPlayerUiState() {
        this(false, null, null, null, false, false, 0L, 0L, 0L, 0.0f, null, 0, 0, null, false, false, false, false, null, 524287, null);
    }

    public static /* synthetic */ VideoPlayerUiState copy$default(VideoPlayerUiState videoPlayerUiState, boolean z, Player player, String str, String str2, boolean z2, boolean z3, long j, long j2, long j3, float f, VideoFullscreenMode videoFullscreenMode, int i, int i2, VideoPipMode videoPipMode, boolean z4, boolean z5, boolean z6, boolean z7, Integer num, int i3, Object obj) {
        Integer num2;
        boolean z8;
        boolean z9 = (i3 & 1) != 0 ? videoPlayerUiState.isLoading : z;
        Player player2 = (i3 & 2) != 0 ? videoPlayerUiState.player : player;
        String str3 = (i3 & 4) != 0 ? videoPlayerUiState.title : str;
        String str4 = (i3 & 8) != 0 ? videoPlayerUiState.subtitle : str2;
        boolean z10 = (i3 & 16) != 0 ? videoPlayerUiState.isPlaying : z2;
        boolean z11 = (i3 & 32) != 0 ? videoPlayerUiState.isControllerVisible : z3;
        long j4 = (i3 & 64) != 0 ? videoPlayerUiState.currentPositionMs : j;
        long j5 = (i3 & 128) != 0 ? videoPlayerUiState.durationMs : j2;
        long j6 = (i3 & 256) != 0 ? videoPlayerUiState.bufferedPositionMs : j3;
        float f2 = (i3 & 512) != 0 ? videoPlayerUiState.playbackSpeed : f;
        VideoFullscreenMode videoFullscreenMode2 = (i3 & 1024) != 0 ? videoPlayerUiState.fullscreenMode : videoFullscreenMode;
        boolean z12 = z9;
        int i4 = (i3 & 2048) != 0 ? videoPlayerUiState.playableMediaCount : i;
        int i5 = (i3 & 4096) != 0 ? videoPlayerUiState.currentMediaIndex : i2;
        VideoPipMode videoPipMode2 = (i3 & 8192) != 0 ? videoPlayerUiState.pipMode : videoPipMode;
        boolean z13 = (i3 & 16384) != 0 ? videoPlayerUiState.isPipEnabled : z4;
        boolean z14 = (i3 & 32768) != 0 ? videoPlayerUiState.canShowToc : z5;
        boolean z15 = (i3 & 65536) != 0 ? videoPlayerUiState.canShowMemo : z6;
        boolean z16 = (i3 & 131072) != 0 ? videoPlayerUiState.isVerticalVideo : z7;
        if ((i3 & 262144) != 0) {
            z8 = z16;
            num2 = videoPlayerUiState.errorMessage;
        } else {
            num2 = num;
            z8 = z16;
        }
        return videoPlayerUiState.copy(z12, player2, str3, str4, z10, z11, j4, j5, j6, f2, videoFullscreenMode2, i4, i5, videoPipMode2, z13, z14, z15, z8, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final VideoFullscreenMode getFullscreenMode() {
        return this.fullscreenMode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getPlayableMediaCount() {
        return this.playableMediaCount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getCurrentMediaIndex() {
        return this.currentMediaIndex;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final VideoPipMode getPipMode() {
        return this.pipMode;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsPipEnabled() {
        return this.isPipEnabled;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getCanShowToc() {
        return this.canShowToc;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getCanShowMemo() {
        return this.canShowMemo;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsVerticalVideo() {
        return this.isVerticalVideo;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsControllerVisible() {
        return this.isControllerVisible;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getCurrentPositionMs() {
        return this.currentPositionMs;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getBufferedPositionMs() {
        return this.bufferedPositionMs;
    }

    public final VideoPlayerUiState copy(boolean isLoading, Player player, String title, String subtitle, boolean isPlaying, boolean isControllerVisible, long currentPositionMs, long durationMs, long bufferedPositionMs, float playbackSpeed, VideoFullscreenMode fullscreenMode, int playableMediaCount, int currentMediaIndex, VideoPipMode pipMode, boolean isPipEnabled, boolean canShowToc, boolean canShowMemo, boolean isVerticalVideo, Integer errorMessage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(fullscreenMode, "fullscreenMode");
        Intrinsics.checkNotNullParameter(pipMode, "pipMode");
        return new VideoPlayerUiState(isLoading, player, title, subtitle, isPlaying, isControllerVisible, currentPositionMs, durationMs, bufferedPositionMs, playbackSpeed, fullscreenMode, playableMediaCount, currentMediaIndex, pipMode, isPipEnabled, canShowToc, canShowMemo, isVerticalVideo, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoPlayerUiState)) {
            return false;
        }
        VideoPlayerUiState videoPlayerUiState = (VideoPlayerUiState) other;
        return this.isLoading == videoPlayerUiState.isLoading && Intrinsics.areEqual(this.player, videoPlayerUiState.player) && Intrinsics.areEqual(this.title, videoPlayerUiState.title) && Intrinsics.areEqual(this.subtitle, videoPlayerUiState.subtitle) && this.isPlaying == videoPlayerUiState.isPlaying && this.isControllerVisible == videoPlayerUiState.isControllerVisible && this.currentPositionMs == videoPlayerUiState.currentPositionMs && this.durationMs == videoPlayerUiState.durationMs && this.bufferedPositionMs == videoPlayerUiState.bufferedPositionMs && Float.compare(this.playbackSpeed, videoPlayerUiState.playbackSpeed) == 0 && Intrinsics.areEqual(this.fullscreenMode, videoPlayerUiState.fullscreenMode) && this.playableMediaCount == videoPlayerUiState.playableMediaCount && this.currentMediaIndex == videoPlayerUiState.currentMediaIndex && this.pipMode == videoPlayerUiState.pipMode && this.isPipEnabled == videoPlayerUiState.isPipEnabled && this.canShowToc == videoPlayerUiState.canShowToc && this.canShowMemo == videoPlayerUiState.canShowMemo && this.isVerticalVideo == videoPlayerUiState.isVerticalVideo && Intrinsics.areEqual(this.errorMessage, videoPlayerUiState.errorMessage);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        Player player = this.player;
        int iHashCode2 = (((((((((((((((((((((((((((((((((iHashCode + (player == null ? 0 : player.hashCode())) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.isPlaying)) * 31) + Boolean.hashCode(this.isControllerVisible)) * 31) + Long.hashCode(this.currentPositionMs)) * 31) + Long.hashCode(this.durationMs)) * 31) + Long.hashCode(this.bufferedPositionMs)) * 31) + Float.hashCode(this.playbackSpeed)) * 31) + this.fullscreenMode.hashCode()) * 31) + Integer.hashCode(this.playableMediaCount)) * 31) + Integer.hashCode(this.currentMediaIndex)) * 31) + this.pipMode.hashCode()) * 31) + Boolean.hashCode(this.isPipEnabled)) * 31) + Boolean.hashCode(this.canShowToc)) * 31) + Boolean.hashCode(this.canShowMemo)) * 31) + Boolean.hashCode(this.isVerticalVideo)) * 31;
        Integer num = this.errorMessage;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "VideoPlayerUiState(isLoading=" + this.isLoading + ", player=" + this.player + ", title=" + this.title + ", subtitle=" + this.subtitle + ", isPlaying=" + this.isPlaying + ", isControllerVisible=" + this.isControllerVisible + ", currentPositionMs=" + this.currentPositionMs + ", durationMs=" + this.durationMs + ", bufferedPositionMs=" + this.bufferedPositionMs + ", playbackSpeed=" + this.playbackSpeed + ", fullscreenMode=" + this.fullscreenMode + ", playableMediaCount=" + this.playableMediaCount + ", currentMediaIndex=" + this.currentMediaIndex + ", pipMode=" + this.pipMode + ", isPipEnabled=" + this.isPipEnabled + ", canShowToc=" + this.canShowToc + ", canShowMemo=" + this.canShowMemo + ", isVerticalVideo=" + this.isVerticalVideo + ", errorMessage=" + this.errorMessage + ")";
    }

    public VideoPlayerUiState(boolean z, Player player, String title, String subtitle, boolean z2, boolean z3, long j, long j2, long j3, float f, VideoFullscreenMode fullscreenMode, int i, int i2, VideoPipMode pipMode, boolean z4, boolean z5, boolean z6, boolean z7, Integer num) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(fullscreenMode, "fullscreenMode");
        Intrinsics.checkNotNullParameter(pipMode, "pipMode");
        this.isLoading = z;
        this.player = player;
        this.title = title;
        this.subtitle = subtitle;
        this.isPlaying = z2;
        this.isControllerVisible = z3;
        this.currentPositionMs = j;
        this.durationMs = j2;
        this.bufferedPositionMs = j3;
        this.playbackSpeed = f;
        this.fullscreenMode = fullscreenMode;
        this.playableMediaCount = i;
        this.currentMediaIndex = i2;
        this.pipMode = pipMode;
        this.isPipEnabled = z4;
        this.canShowToc = z5;
        this.canShowMemo = z6;
        this.isVerticalVideo = z7;
        this.errorMessage = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VideoPlayerUiState(boolean z, Player player, String str, String str2, boolean z2, boolean z3, long j, long j2, long j3, float f, VideoFullscreenMode videoFullscreenMode, int i, int i2, VideoPipMode videoPipMode, boolean z4, boolean z5, boolean z6, boolean z7, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z8 = (i3 & 1) != 0 ? true : z;
        Player player2 = (i3 & 2) != 0 ? null : player;
        String str3 = (i3 & 4) != 0 ? "" : str;
        String str4 = (i3 & 8) == 0 ? str2 : "";
        boolean z9 = (i3 & 16) != 0 ? false : z2;
        boolean z10 = (i3 & 32) != 0 ? false : z3;
        long j4 = (i3 & 64) != 0 ? 0L : j;
        long j5 = (i3 & 128) != 0 ? 0L : j2;
        this(z8, player2, str3, str4, z9, z10, j4, j5, (i3 & 256) == 0 ? j3 : 0L, (i3 & 512) != 0 ? 1.0f : f, (i3 & 1024) != 0 ? VideoFullscreenMode.Normal.INSTANCE : videoFullscreenMode, (i3 & 2048) != 0 ? 0 : i, (i3 & 4096) != 0 ? 0 : i2, (i3 & 8192) != 0 ? VideoPipMode.Normal : videoPipMode, (i3 & 16384) != 0 ? true : z4, (i3 & 32768) != 0 ? true : z5, (i3 & 65536) != 0 ? true : z6, (i3 & 131072) != 0 ? false : z7, (i3 & 262144) != 0 ? null : num);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Player getPlayer() {
        return this.player;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final boolean isControllerVisible() {
        return this.isControllerVisible;
    }

    public final long getCurrentPositionMs() {
        return this.currentPositionMs;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final long getBufferedPositionMs() {
        return this.bufferedPositionMs;
    }

    public final float getPlaybackSpeed() {
        return this.playbackSpeed;
    }

    public final VideoFullscreenMode getFullscreenMode() {
        return this.fullscreenMode;
    }

    public final int getPlayableMediaCount() {
        return this.playableMediaCount;
    }

    public final int getCurrentMediaIndex() {
        return this.currentMediaIndex;
    }

    public final VideoPipMode getPipMode() {
        return this.pipMode;
    }

    public final boolean isPipEnabled() {
        return this.isPipEnabled;
    }

    public final boolean getCanShowToc() {
        return this.canShowToc;
    }

    public final boolean getCanShowMemo() {
        return this.canShowMemo;
    }

    public final boolean isVerticalVideo() {
        return this.isVerticalVideo;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean isFullscreen() {
        VideoFullscreenMode videoFullscreenMode = this.fullscreenMode;
        return (videoFullscreenMode instanceof VideoFullscreenMode.ManualFullscreen) || (videoFullscreenMode instanceof VideoFullscreenMode.AutoFullscreen) || (videoFullscreenMode instanceof VideoFullscreenMode.InfoExpanded);
    }

    public final boolean isAutoFullscreen() {
        return this.fullscreenMode instanceof VideoFullscreenMode.AutoFullscreen;
    }

    public final boolean isInPipMode() {
        return this.pipMode == VideoPipMode.PictureInPicture;
    }

    public final boolean getCanSkipPrevious() {
        return this.playableMediaCount == 1 || this.currentMediaIndex > 0;
    }

    public final boolean getCanSkipNext() {
        return this.currentMediaIndex < this.playableMediaCount - 1;
    }
}
