package com.medicmedia.medilink.media.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.C;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoPlayerItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/media/video/VideoPlaybackSnapshot;", "", "playWhenReady", "", "windowIndex", "", "positionMs", "", "mediaId", "", "<init>", "(ZIJLjava/lang/String;)V", "getPlayWhenReady", "()Z", "getWindowIndex", "()I", "getPositionMs", "()J", "getMediaId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "media_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoPlaybackSnapshot {
    private final String mediaId;
    private final boolean playWhenReady;
    private final long positionMs;
    private final int windowIndex;

    public VideoPlaybackSnapshot() {
        this(false, 0, 0L, null, 15, null);
    }

    public static /* synthetic */ VideoPlaybackSnapshot copy$default(VideoPlaybackSnapshot videoPlaybackSnapshot, boolean z, int i, long j, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = videoPlaybackSnapshot.playWhenReady;
        }
        if ((i2 & 2) != 0) {
            i = videoPlaybackSnapshot.windowIndex;
        }
        if ((i2 & 4) != 0) {
            j = videoPlaybackSnapshot.positionMs;
        }
        if ((i2 & 8) != 0) {
            str = videoPlaybackSnapshot.mediaId;
        }
        String str2 = str;
        return videoPlaybackSnapshot.copy(z, i, j, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWindowIndex() {
        return this.windowIndex;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getPositionMs() {
        return this.positionMs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMediaId() {
        return this.mediaId;
    }

    public final VideoPlaybackSnapshot copy(boolean playWhenReady, int windowIndex, long positionMs, String mediaId) {
        return new VideoPlaybackSnapshot(playWhenReady, windowIndex, positionMs, mediaId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoPlaybackSnapshot)) {
            return false;
        }
        VideoPlaybackSnapshot videoPlaybackSnapshot = (VideoPlaybackSnapshot) other;
        return this.playWhenReady == videoPlaybackSnapshot.playWhenReady && this.windowIndex == videoPlaybackSnapshot.windowIndex && this.positionMs == videoPlaybackSnapshot.positionMs && Intrinsics.areEqual(this.mediaId, videoPlaybackSnapshot.mediaId);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.playWhenReady) * 31) + Integer.hashCode(this.windowIndex)) * 31) + Long.hashCode(this.positionMs)) * 31;
        String str = this.mediaId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "VideoPlaybackSnapshot(playWhenReady=" + this.playWhenReady + ", windowIndex=" + this.windowIndex + ", positionMs=" + this.positionMs + ", mediaId=" + this.mediaId + ")";
    }

    public VideoPlaybackSnapshot(boolean z, int i, long j, String str) {
        this.playWhenReady = z;
        this.windowIndex = i;
        this.positionMs = j;
        this.mediaId = str;
    }

    public /* synthetic */ VideoPlaybackSnapshot(boolean z, int i, long j, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? C.TIME_UNSET : j, (i2 & 8) != 0 ? null : str);
    }

    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    public final int getWindowIndex() {
        return this.windowIndex;
    }

    public final long getPositionMs() {
        return this.positionMs;
    }

    public final String getMediaId() {
        return this.mediaId;
    }
}
