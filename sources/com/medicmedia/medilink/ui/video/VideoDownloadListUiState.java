package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: VideoDownloadListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\r\u001a\u00020\u000eH×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoDownloadListUiState;", "", "isLoading", "", "isRefresh", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoDownloadListUiState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final VideoDownloadListUiState f188default;
    private final boolean isLoading;
    private final boolean isRefresh;

    /* JADX WARN: Illegal instructions before constructor call */
    public VideoDownloadListUiState() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static /* synthetic */ VideoDownloadListUiState copy$default(VideoDownloadListUiState videoDownloadListUiState, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = videoDownloadListUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = videoDownloadListUiState.isRefresh;
        }
        return videoDownloadListUiState.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsRefresh() {
        return this.isRefresh;
    }

    public final VideoDownloadListUiState copy(boolean isLoading, boolean isRefresh) {
        return new VideoDownloadListUiState(isLoading, isRefresh);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoDownloadListUiState)) {
            return false;
        }
        VideoDownloadListUiState videoDownloadListUiState = (VideoDownloadListUiState) other;
        return this.isLoading == videoDownloadListUiState.isLoading && this.isRefresh == videoDownloadListUiState.isRefresh;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isRefresh);
    }

    public String toString() {
        return "VideoDownloadListUiState(isLoading=" + this.isLoading + ", isRefresh=" + this.isRefresh + ")";
    }

    public VideoDownloadListUiState(boolean z, boolean z2) {
        this.isLoading = z;
        this.isRefresh = z2;
    }

    public /* synthetic */ VideoDownloadListUiState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isRefresh() {
        return this.isRefresh;
    }

    /* JADX INFO: compiled from: VideoDownloadListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoDownloadListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/video/VideoDownloadListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/video/VideoDownloadListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoDownloadListUiState getDefault() {
            return VideoDownloadListUiState.f188default;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        boolean z = false;
        f188default = new VideoDownloadListUiState(z, z, 3, defaultConstructorMarker);
    }
}
