package com.medicmedia.medilink.domain.model.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.VideoSubItem;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoPlayback.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0005HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/PlaybackProgressSnapshot;", "", "contentsId", "", "courseId", "", "videoHash", "videoSubItem", "Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "playTimeMillis", "", "savedAt", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/medicmedia/medilink/domain/model/VideoSubItem;JLjava/util/Date;)V", "getContentsId", "()Ljava/lang/String;", "getCourseId", "()I", "getVideoHash", "getVideoSubItem", "()Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "getPlayTimeMillis", "()J", "getSavedAt", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlaybackProgressSnapshot {
    private final String contentsId;
    private final int courseId;
    private final long playTimeMillis;
    private final Date savedAt;
    private final String videoHash;
    private final VideoSubItem videoSubItem;

    public static /* synthetic */ PlaybackProgressSnapshot copy$default(PlaybackProgressSnapshot playbackProgressSnapshot, String str, int i, String str2, VideoSubItem videoSubItem, long j, Date date, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = playbackProgressSnapshot.contentsId;
        }
        if ((i2 & 2) != 0) {
            i = playbackProgressSnapshot.courseId;
        }
        if ((i2 & 4) != 0) {
            str2 = playbackProgressSnapshot.videoHash;
        }
        if ((i2 & 8) != 0) {
            videoSubItem = playbackProgressSnapshot.videoSubItem;
        }
        if ((i2 & 16) != 0) {
            j = playbackProgressSnapshot.playTimeMillis;
        }
        if ((i2 & 32) != 0) {
            date = playbackProgressSnapshot.savedAt;
        }
        Date date2 = date;
        long j2 = j;
        return playbackProgressSnapshot.copy(str, i, str2, videoSubItem, j2, date2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVideoHash() {
        return this.videoHash;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VideoSubItem getVideoSubItem() {
        return this.videoSubItem;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPlayTimeMillis() {
        return this.playTimeMillis;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getSavedAt() {
        return this.savedAt;
    }

    public final PlaybackProgressSnapshot copy(String contentsId, int courseId, String videoHash, VideoSubItem videoSubItem, long playTimeMillis, Date savedAt) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        Intrinsics.checkNotNullParameter(videoSubItem, "videoSubItem");
        Intrinsics.checkNotNullParameter(savedAt, "savedAt");
        return new PlaybackProgressSnapshot(contentsId, courseId, videoHash, videoSubItem, playTimeMillis, savedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaybackProgressSnapshot)) {
            return false;
        }
        PlaybackProgressSnapshot playbackProgressSnapshot = (PlaybackProgressSnapshot) other;
        return Intrinsics.areEqual(this.contentsId, playbackProgressSnapshot.contentsId) && this.courseId == playbackProgressSnapshot.courseId && Intrinsics.areEqual(this.videoHash, playbackProgressSnapshot.videoHash) && Intrinsics.areEqual(this.videoSubItem, playbackProgressSnapshot.videoSubItem) && this.playTimeMillis == playbackProgressSnapshot.playTimeMillis && Intrinsics.areEqual(this.savedAt, playbackProgressSnapshot.savedAt);
    }

    public int hashCode() {
        return (((((((((this.contentsId.hashCode() * 31) + Integer.hashCode(this.courseId)) * 31) + this.videoHash.hashCode()) * 31) + this.videoSubItem.hashCode()) * 31) + Long.hashCode(this.playTimeMillis)) * 31) + this.savedAt.hashCode();
    }

    public String toString() {
        return "PlaybackProgressSnapshot(contentsId=" + this.contentsId + ", courseId=" + this.courseId + ", videoHash=" + this.videoHash + ", videoSubItem=" + this.videoSubItem + ", playTimeMillis=" + this.playTimeMillis + ", savedAt=" + this.savedAt + ")";
    }

    public PlaybackProgressSnapshot(String contentsId, int i, String videoHash, VideoSubItem videoSubItem, long j, Date savedAt) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        Intrinsics.checkNotNullParameter(videoSubItem, "videoSubItem");
        Intrinsics.checkNotNullParameter(savedAt, "savedAt");
        this.contentsId = contentsId;
        this.courseId = i;
        this.videoHash = videoHash;
        this.videoSubItem = videoSubItem;
        this.playTimeMillis = j;
        this.savedAt = savedAt;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final String getVideoHash() {
        return this.videoHash;
    }

    public final VideoSubItem getVideoSubItem() {
        return this.videoSubItem;
    }

    public final long getPlayTimeMillis() {
        return this.playTimeMillis;
    }

    public /* synthetic */ PlaybackProgressSnapshot(String str, int i, String str2, VideoSubItem videoSubItem, long j, Date date, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, videoSubItem, j, (i2 & 32) != 0 ? new Date() : date);
    }

    public final Date getSavedAt() {
        return this.savedAt;
    }
}
