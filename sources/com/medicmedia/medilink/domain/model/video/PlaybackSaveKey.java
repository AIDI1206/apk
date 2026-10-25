package com.medicmedia.medilink.domain.model.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoPlayback.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/PlaybackSaveKey;", "", "videoHash", "", "playTimeMillis", "", "historyId", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "getVideoHash", "()Ljava/lang/String;", "getPlayTimeMillis", "()J", "getHistoryId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PlaybackSaveKey {
    private final String historyId;
    private final long playTimeMillis;
    private final String videoHash;

    public static /* synthetic */ PlaybackSaveKey copy$default(PlaybackSaveKey playbackSaveKey, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playbackSaveKey.videoHash;
        }
        if ((i & 2) != 0) {
            j = playbackSaveKey.playTimeMillis;
        }
        if ((i & 4) != 0) {
            str2 = playbackSaveKey.historyId;
        }
        return playbackSaveKey.copy(str, j, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVideoHash() {
        return this.videoHash;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getPlayTimeMillis() {
        return this.playTimeMillis;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHistoryId() {
        return this.historyId;
    }

    public final PlaybackSaveKey copy(String videoHash, long playTimeMillis, String historyId) {
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        Intrinsics.checkNotNullParameter(historyId, "historyId");
        return new PlaybackSaveKey(videoHash, playTimeMillis, historyId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaybackSaveKey)) {
            return false;
        }
        PlaybackSaveKey playbackSaveKey = (PlaybackSaveKey) other;
        return Intrinsics.areEqual(this.videoHash, playbackSaveKey.videoHash) && this.playTimeMillis == playbackSaveKey.playTimeMillis && Intrinsics.areEqual(this.historyId, playbackSaveKey.historyId);
    }

    public int hashCode() {
        return (((this.videoHash.hashCode() * 31) + Long.hashCode(this.playTimeMillis)) * 31) + this.historyId.hashCode();
    }

    public String toString() {
        return "PlaybackSaveKey(videoHash=" + this.videoHash + ", playTimeMillis=" + this.playTimeMillis + ", historyId=" + this.historyId + ")";
    }

    public PlaybackSaveKey(String videoHash, long j, String historyId) {
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        Intrinsics.checkNotNullParameter(historyId, "historyId");
        this.videoHash = videoHash;
        this.playTimeMillis = j;
        this.historyId = historyId;
    }

    public final String getVideoHash() {
        return this.videoHash;
    }

    public final long getPlayTimeMillis() {
        return this.playTimeMillis;
    }

    public final String getHistoryId() {
        return this.historyId;
    }
}
