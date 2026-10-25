package com.medicmedia.medilink.domain.model.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoDownloadState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/medicmedia/medilink/domain/model/video/VideoDownloadCoordinatorState;", "", "videoHash", "", "downloadState", "Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState;", "isDownloadEnabled", "", "showDownloadOverride", "<init>", "(Ljava/lang/String;Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState;ZLjava/lang/Boolean;)V", "getVideoHash", "()Ljava/lang/String;", "getDownloadState", "()Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState;", "()Z", "getShowDownloadOverride", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/medicmedia/medilink/domain/model/video/VideoDownloadState;ZLjava/lang/Boolean;)Lcom/medicmedia/medilink/domain/model/video/VideoDownloadCoordinatorState;", "equals", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoDownloadCoordinatorState {
    private final VideoDownloadState downloadState;
    private final boolean isDownloadEnabled;
    private final Boolean showDownloadOverride;
    private final String videoHash;

    public VideoDownloadCoordinatorState() {
        this(null, null, false, null, 15, null);
    }

    public static /* synthetic */ VideoDownloadCoordinatorState copy$default(VideoDownloadCoordinatorState videoDownloadCoordinatorState, String str, VideoDownloadState videoDownloadState, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoDownloadCoordinatorState.videoHash;
        }
        if ((i & 2) != 0) {
            videoDownloadState = videoDownloadCoordinatorState.downloadState;
        }
        if ((i & 4) != 0) {
            z = videoDownloadCoordinatorState.isDownloadEnabled;
        }
        if ((i & 8) != 0) {
            bool = videoDownloadCoordinatorState.showDownloadOverride;
        }
        return videoDownloadCoordinatorState.copy(str, videoDownloadState, z, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVideoHash() {
        return this.videoHash;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoDownloadState getDownloadState() {
        return this.downloadState;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsDownloadEnabled() {
        return this.isDownloadEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getShowDownloadOverride() {
        return this.showDownloadOverride;
    }

    public final VideoDownloadCoordinatorState copy(String videoHash, VideoDownloadState downloadState, boolean isDownloadEnabled, Boolean showDownloadOverride) {
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        return new VideoDownloadCoordinatorState(videoHash, downloadState, isDownloadEnabled, showDownloadOverride);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoDownloadCoordinatorState)) {
            return false;
        }
        VideoDownloadCoordinatorState videoDownloadCoordinatorState = (VideoDownloadCoordinatorState) other;
        return Intrinsics.areEqual(this.videoHash, videoDownloadCoordinatorState.videoHash) && Intrinsics.areEqual(this.downloadState, videoDownloadCoordinatorState.downloadState) && this.isDownloadEnabled == videoDownloadCoordinatorState.isDownloadEnabled && Intrinsics.areEqual(this.showDownloadOverride, videoDownloadCoordinatorState.showDownloadOverride);
    }

    public int hashCode() {
        int iHashCode = this.videoHash.hashCode() * 31;
        VideoDownloadState videoDownloadState = this.downloadState;
        int iHashCode2 = (((iHashCode + (videoDownloadState == null ? 0 : videoDownloadState.hashCode())) * 31) + Boolean.hashCode(this.isDownloadEnabled)) * 31;
        Boolean bool = this.showDownloadOverride;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "VideoDownloadCoordinatorState(videoHash=" + this.videoHash + ", downloadState=" + this.downloadState + ", isDownloadEnabled=" + this.isDownloadEnabled + ", showDownloadOverride=" + this.showDownloadOverride + ")";
    }

    public VideoDownloadCoordinatorState(String videoHash, VideoDownloadState videoDownloadState, boolean z, Boolean bool) {
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        this.videoHash = videoHash;
        this.downloadState = videoDownloadState;
        this.isDownloadEnabled = z;
        this.showDownloadOverride = bool;
    }

    public /* synthetic */ VideoDownloadCoordinatorState(String str, VideoDownloadState videoDownloadState, boolean z, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : videoDownloadState, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : bool);
    }

    public final String getVideoHash() {
        return this.videoHash;
    }

    public final VideoDownloadState getDownloadState() {
        return this.downloadState;
    }

    public final boolean isDownloadEnabled() {
        return this.isDownloadEnabled;
    }

    public final Boolean getShowDownloadOverride() {
        return this.showDownloadOverride;
    }
}
