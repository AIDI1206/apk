package com.medicmedia.medilink.media;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AudioPlayer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\""}, d2 = {"Lcom/medicmedia/medilink/media/AudioPlayerState;", "", "playingItemId", "", "url", "isPlaying", "", "isPrepared", "progressMs", "", "durationMs", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZIILjava/lang/String;)V", "getPlayingItemId", "()Ljava/lang/String;", "getUrl", "()Z", "getProgressMs", "()I", "getDurationMs", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "media_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class AudioPlayerState {
    private final int durationMs;
    private final String errorMessage;
    private final boolean isPlaying;
    private final boolean isPrepared;
    private final String playingItemId;
    private final int progressMs;
    private final String url;

    public AudioPlayerState() {
        this(null, null, false, false, 0, 0, null, 127, null);
    }

    public static /* synthetic */ AudioPlayerState copy$default(AudioPlayerState audioPlayerState, String str, String str2, boolean z, boolean z2, int i, int i2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = audioPlayerState.playingItemId;
        }
        if ((i3 & 2) != 0) {
            str2 = audioPlayerState.url;
        }
        if ((i3 & 4) != 0) {
            z = audioPlayerState.isPlaying;
        }
        if ((i3 & 8) != 0) {
            z2 = audioPlayerState.isPrepared;
        }
        if ((i3 & 16) != 0) {
            i = audioPlayerState.progressMs;
        }
        if ((i3 & 32) != 0) {
            i2 = audioPlayerState.durationMs;
        }
        if ((i3 & 64) != 0) {
            str3 = audioPlayerState.errorMessage;
        }
        int i4 = i2;
        String str4 = str3;
        int i5 = i;
        boolean z3 = z;
        return audioPlayerState.copy(str, str2, z3, z2, i5, i4, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlayingItemId() {
        return this.playingItemId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsPrepared() {
        return this.isPrepared;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getProgressMs() {
        return this.progressMs;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDurationMs() {
        return this.durationMs;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final AudioPlayerState copy(String playingItemId, String url, boolean isPlaying, boolean isPrepared, int progressMs, int durationMs, String errorMessage) {
        return new AudioPlayerState(playingItemId, url, isPlaying, isPrepared, progressMs, durationMs, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioPlayerState)) {
            return false;
        }
        AudioPlayerState audioPlayerState = (AudioPlayerState) other;
        return Intrinsics.areEqual(this.playingItemId, audioPlayerState.playingItemId) && Intrinsics.areEqual(this.url, audioPlayerState.url) && this.isPlaying == audioPlayerState.isPlaying && this.isPrepared == audioPlayerState.isPrepared && this.progressMs == audioPlayerState.progressMs && this.durationMs == audioPlayerState.durationMs && Intrinsics.areEqual(this.errorMessage, audioPlayerState.errorMessage);
    }

    public int hashCode() {
        String str = this.playingItemId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        int iHashCode2 = (((((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isPlaying)) * 31) + Boolean.hashCode(this.isPrepared)) * 31) + Integer.hashCode(this.progressMs)) * 31) + Integer.hashCode(this.durationMs)) * 31;
        String str3 = this.errorMessage;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AudioPlayerState(playingItemId=" + this.playingItemId + ", url=" + this.url + ", isPlaying=" + this.isPlaying + ", isPrepared=" + this.isPrepared + ", progressMs=" + this.progressMs + ", durationMs=" + this.durationMs + ", errorMessage=" + this.errorMessage + ")";
    }

    public AudioPlayerState(String str, String str2, boolean z, boolean z2, int i, int i2, String str3) {
        this.playingItemId = str;
        this.url = str2;
        this.isPlaying = z;
        this.isPrepared = z2;
        this.progressMs = i;
        this.durationMs = i2;
        this.errorMessage = str3;
    }

    public /* synthetic */ AudioPlayerState(String str, String str2, boolean z, boolean z2, int i, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : str3);
    }

    public final String getPlayingItemId() {
        return this.playingItemId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final boolean isPrepared() {
        return this.isPrepared;
    }

    public final int getProgressMs() {
        return this.progressMs;
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
