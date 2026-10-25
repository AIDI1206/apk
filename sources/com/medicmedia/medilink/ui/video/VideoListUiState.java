package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: VideoListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\tHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0019\u001a\u00020\tH×\u0001J\t\u0010\u001a\u001a\u00020\u001bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoListUiState;", "", "isInitialized", "", "loadingType", "Lcom/medicmedia/medilink/ui/video/VideoListLoadingType;", "isSwipeRefresh", "isFavorite", "selectedTabId", "", "<init>", "(ZLcom/medicmedia/medilink/ui/video/VideoListLoadingType;ZZI)V", "()Z", "getLoadingType", "()Lcom/medicmedia/medilink/ui/video/VideoListLoadingType;", "getSelectedTabId", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoListUiState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final VideoListUiState f189default = new VideoListUiState(false, null, false, false, 0, 31, null);
    private final boolean isFavorite;
    private final boolean isInitialized;
    private final boolean isSwipeRefresh;
    private final VideoListLoadingType loadingType;
    private final int selectedTabId;

    public VideoListUiState() {
        this(false, null, false, false, 0, 31, null);
    }

    public static /* synthetic */ VideoListUiState copy$default(VideoListUiState videoListUiState, boolean z, VideoListLoadingType videoListLoadingType, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = videoListUiState.isInitialized;
        }
        if ((i2 & 2) != 0) {
            videoListLoadingType = videoListUiState.loadingType;
        }
        if ((i2 & 4) != 0) {
            z2 = videoListUiState.isSwipeRefresh;
        }
        if ((i2 & 8) != 0) {
            z3 = videoListUiState.isFavorite;
        }
        if ((i2 & 16) != 0) {
            i = videoListUiState.selectedTabId;
        }
        int i3 = i;
        boolean z4 = z2;
        return videoListUiState.copy(z, videoListLoadingType, z4, z3, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoListLoadingType getLoadingType() {
        return this.loadingType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSwipeRefresh() {
        return this.isSwipeRefresh;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSelectedTabId() {
        return this.selectedTabId;
    }

    public final VideoListUiState copy(boolean isInitialized, VideoListLoadingType loadingType, boolean isSwipeRefresh, boolean isFavorite, int selectedTabId) {
        return new VideoListUiState(isInitialized, loadingType, isSwipeRefresh, isFavorite, selectedTabId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoListUiState)) {
            return false;
        }
        VideoListUiState videoListUiState = (VideoListUiState) other;
        return this.isInitialized == videoListUiState.isInitialized && this.loadingType == videoListUiState.loadingType && this.isSwipeRefresh == videoListUiState.isSwipeRefresh && this.isFavorite == videoListUiState.isFavorite && this.selectedTabId == videoListUiState.selectedTabId;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isInitialized) * 31;
        VideoListLoadingType videoListLoadingType = this.loadingType;
        return ((((((iHashCode + (videoListLoadingType == null ? 0 : videoListLoadingType.hashCode())) * 31) + Boolean.hashCode(this.isSwipeRefresh)) * 31) + Boolean.hashCode(this.isFavorite)) * 31) + Integer.hashCode(this.selectedTabId);
    }

    public String toString() {
        return "VideoListUiState(isInitialized=" + this.isInitialized + ", loadingType=" + this.loadingType + ", isSwipeRefresh=" + this.isSwipeRefresh + ", isFavorite=" + this.isFavorite + ", selectedTabId=" + this.selectedTabId + ")";
    }

    public VideoListUiState(boolean z, VideoListLoadingType videoListLoadingType, boolean z2, boolean z3, int i) {
        this.isInitialized = z;
        this.loadingType = videoListLoadingType;
        this.isSwipeRefresh = z2;
        this.isFavorite = z3;
        this.selectedTabId = i;
    }

    public /* synthetic */ VideoListUiState(boolean z, VideoListLoadingType videoListLoadingType, boolean z2, boolean z3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : videoListLoadingType, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? 0 : i);
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    public final VideoListLoadingType getLoadingType() {
        return this.loadingType;
    }

    public final boolean isSwipeRefresh() {
        return this.isSwipeRefresh;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final int getSelectedTabId() {
        return this.selectedTabId;
    }

    /* JADX INFO: compiled from: VideoListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/video/VideoListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/video/VideoListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoListUiState getDefault() {
            return VideoListUiState.f189default;
        }
    }
}
