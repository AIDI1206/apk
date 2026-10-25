package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.model.VideoRefItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoInfoPanelState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoReferenceLinksState;", "", "iconBaseUrl", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/medicmedia/medilink/domain/model/VideoRefItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getIconBaseUrl", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoReferenceLinksState {
    public static final int $stable = 8;
    private final String iconBaseUrl;
    private final List<VideoRefItem> items;

    public VideoReferenceLinksState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoReferenceLinksState copy$default(VideoReferenceLinksState videoReferenceLinksState, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoReferenceLinksState.iconBaseUrl;
        }
        if ((i & 2) != 0) {
            list = videoReferenceLinksState.items;
        }
        return videoReferenceLinksState.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIconBaseUrl() {
        return this.iconBaseUrl;
    }

    public final List<VideoRefItem> component2() {
        return this.items;
    }

    public final VideoReferenceLinksState copy(String iconBaseUrl, List<VideoRefItem> items) {
        Intrinsics.checkNotNullParameter(iconBaseUrl, "iconBaseUrl");
        Intrinsics.checkNotNullParameter(items, "items");
        return new VideoReferenceLinksState(iconBaseUrl, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoReferenceLinksState)) {
            return false;
        }
        VideoReferenceLinksState videoReferenceLinksState = (VideoReferenceLinksState) other;
        return Intrinsics.areEqual(this.iconBaseUrl, videoReferenceLinksState.iconBaseUrl) && Intrinsics.areEqual(this.items, videoReferenceLinksState.items);
    }

    public int hashCode() {
        return (this.iconBaseUrl.hashCode() * 31) + this.items.hashCode();
    }

    public String toString() {
        return "VideoReferenceLinksState(iconBaseUrl=" + this.iconBaseUrl + ", items=" + this.items + ")";
    }

    public VideoReferenceLinksState(String iconBaseUrl, List<VideoRefItem> items) {
        Intrinsics.checkNotNullParameter(iconBaseUrl, "iconBaseUrl");
        Intrinsics.checkNotNullParameter(items, "items");
        this.iconBaseUrl = iconBaseUrl;
        this.items = items;
    }

    public /* synthetic */ VideoReferenceLinksState(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getIconBaseUrl() {
        return this.iconBaseUrl;
    }

    public final List<VideoRefItem> getItems() {
        return this.items;
    }
}
