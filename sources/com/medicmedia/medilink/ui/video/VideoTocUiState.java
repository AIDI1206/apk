package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoTocViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoTocUiState;", "", "initializeIds", "", "", "scrollToIdOnStart", "showPageIcon", "", "isDisplayPage", "<init>", "(Ljava/util/Set;Ljava/lang/String;ZZ)V", "getInitializeIds", "()Ljava/util/Set;", "getScrollToIdOnStart", "()Ljava/lang/String;", "getShowPageIcon", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoTocUiState {
    private final Set<String> initializeIds;
    private final boolean isDisplayPage;
    private final String scrollToIdOnStart;
    private final boolean showPageIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final VideoTocUiState f190default = new VideoTocUiState(null, null, false, false, 15, null);

    public VideoTocUiState() {
        this(null, null, false, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoTocUiState copy$default(VideoTocUiState videoTocUiState, Set set, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            set = videoTocUiState.initializeIds;
        }
        if ((i & 2) != 0) {
            str = videoTocUiState.scrollToIdOnStart;
        }
        if ((i & 4) != 0) {
            z = videoTocUiState.showPageIcon;
        }
        if ((i & 8) != 0) {
            z2 = videoTocUiState.isDisplayPage;
        }
        return videoTocUiState.copy(set, str, z, z2);
    }

    public final Set<String> component1() {
        return this.initializeIds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScrollToIdOnStart() {
        return this.scrollToIdOnStart;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowPageIcon() {
        return this.showPageIcon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsDisplayPage() {
        return this.isDisplayPage;
    }

    public final VideoTocUiState copy(Set<String> initializeIds, String scrollToIdOnStart, boolean showPageIcon, boolean isDisplayPage) {
        Intrinsics.checkNotNullParameter(initializeIds, "initializeIds");
        return new VideoTocUiState(initializeIds, scrollToIdOnStart, showPageIcon, isDisplayPage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTocUiState)) {
            return false;
        }
        VideoTocUiState videoTocUiState = (VideoTocUiState) other;
        return Intrinsics.areEqual(this.initializeIds, videoTocUiState.initializeIds) && Intrinsics.areEqual(this.scrollToIdOnStart, videoTocUiState.scrollToIdOnStart) && this.showPageIcon == videoTocUiState.showPageIcon && this.isDisplayPage == videoTocUiState.isDisplayPage;
    }

    public int hashCode() {
        int iHashCode = this.initializeIds.hashCode() * 31;
        String str = this.scrollToIdOnStart;
        return ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.showPageIcon)) * 31) + Boolean.hashCode(this.isDisplayPage);
    }

    public String toString() {
        return "VideoTocUiState(initializeIds=" + this.initializeIds + ", scrollToIdOnStart=" + this.scrollToIdOnStart + ", showPageIcon=" + this.showPageIcon + ", isDisplayPage=" + this.isDisplayPage + ")";
    }

    public VideoTocUiState(Set<String> initializeIds, String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(initializeIds, "initializeIds");
        this.initializeIds = initializeIds;
        this.scrollToIdOnStart = str;
        this.showPageIcon = z;
        this.isDisplayPage = z2;
    }

    public /* synthetic */ VideoTocUiState(Set set, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SetsKt.emptySet() : set, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public final Set<String> getInitializeIds() {
        return this.initializeIds;
    }

    public final String getScrollToIdOnStart() {
        return this.scrollToIdOnStart;
    }

    public final boolean getShowPageIcon() {
        return this.showPageIcon;
    }

    public final boolean isDisplayPage() {
        return this.isDisplayPage;
    }

    /* JADX INFO: compiled from: VideoTocViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoTocUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/video/VideoTocUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/video/VideoTocUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoTocUiState getDefault() {
            return VideoTocUiState.f190default;
        }
    }
}
