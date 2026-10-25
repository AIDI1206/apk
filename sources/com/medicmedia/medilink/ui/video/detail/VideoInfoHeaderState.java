package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoInfoPanelState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÇ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u001fH×\u0001J\t\u0010 \u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006!"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoInfoHeaderState;", "", "breadcrumbs", "", "", HistoryRepositoryImpl.FieldName.TITLE, "rating", "", "showRating", "", "showCbtLabel", "<init>", "(Ljava/util/List;Ljava/lang/String;FZZ)V", "getBreadcrumbs", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getRating", "()F", "getShowRating", "()Z", "getShowCbtLabel", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoInfoHeaderState {
    public static final int $stable = 8;
    private final List<String> breadcrumbs;
    private final float rating;
    private final boolean showCbtLabel;
    private final boolean showRating;
    private final String title;

    public VideoInfoHeaderState() {
        this(null, null, 0.0f, false, false, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoInfoHeaderState copy$default(VideoInfoHeaderState videoInfoHeaderState, List list, String str, float f, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = videoInfoHeaderState.breadcrumbs;
        }
        if ((i & 2) != 0) {
            str = videoInfoHeaderState.title;
        }
        if ((i & 4) != 0) {
            f = videoInfoHeaderState.rating;
        }
        if ((i & 8) != 0) {
            z = videoInfoHeaderState.showRating;
        }
        if ((i & 16) != 0) {
            z2 = videoInfoHeaderState.showCbtLabel;
        }
        boolean z3 = z2;
        float f2 = f;
        return videoInfoHeaderState.copy(list, str, f2, z, z3);
    }

    public final List<String> component1() {
        return this.breadcrumbs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowRating() {
        return this.showRating;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowCbtLabel() {
        return this.showCbtLabel;
    }

    public final VideoInfoHeaderState copy(List<String> breadcrumbs, String title, float rating, boolean showRating, boolean showCbtLabel) {
        Intrinsics.checkNotNullParameter(breadcrumbs, "breadcrumbs");
        Intrinsics.checkNotNullParameter(title, "title");
        return new VideoInfoHeaderState(breadcrumbs, title, rating, showRating, showCbtLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoInfoHeaderState)) {
            return false;
        }
        VideoInfoHeaderState videoInfoHeaderState = (VideoInfoHeaderState) other;
        return Intrinsics.areEqual(this.breadcrumbs, videoInfoHeaderState.breadcrumbs) && Intrinsics.areEqual(this.title, videoInfoHeaderState.title) && Float.compare(this.rating, videoInfoHeaderState.rating) == 0 && this.showRating == videoInfoHeaderState.showRating && this.showCbtLabel == videoInfoHeaderState.showCbtLabel;
    }

    public int hashCode() {
        return (((((((this.breadcrumbs.hashCode() * 31) + this.title.hashCode()) * 31) + Float.hashCode(this.rating)) * 31) + Boolean.hashCode(this.showRating)) * 31) + Boolean.hashCode(this.showCbtLabel);
    }

    public String toString() {
        return "VideoInfoHeaderState(breadcrumbs=" + this.breadcrumbs + ", title=" + this.title + ", rating=" + this.rating + ", showRating=" + this.showRating + ", showCbtLabel=" + this.showCbtLabel + ")";
    }

    public VideoInfoHeaderState(List<String> breadcrumbs, String title, float f, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(breadcrumbs, "breadcrumbs");
        Intrinsics.checkNotNullParameter(title, "title");
        this.breadcrumbs = breadcrumbs;
        this.title = title;
        this.rating = f;
        this.showRating = z;
        this.showCbtLabel = z2;
    }

    public /* synthetic */ VideoInfoHeaderState(List list, String str, float f, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2);
    }

    public final List<String> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    public final String getTitle() {
        return this.title;
    }

    public final float getRating() {
        return this.rating;
    }

    public final boolean getShowRating() {
        return this.showRating;
    }

    public final boolean getShowCbtLabel() {
        return this.showCbtLabel;
    }
}
