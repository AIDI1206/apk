package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.NoteOptionVideoMemoItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoInfoPanelState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/VideoMemoState;", "", "isLoading", "", "memoItems", "", "Lcom/medicmedia/medilink/domain/model/NoteOptionVideoMemoItem;", "<init>", "(ZLjava/util/List;)V", "()Z", "getMemoItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoMemoState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final List<NoteOptionVideoMemoItem> memoItems;

    public VideoMemoState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoMemoState copy$default(VideoMemoState videoMemoState, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = videoMemoState.isLoading;
        }
        if ((i & 2) != 0) {
            list = videoMemoState.memoItems;
        }
        return videoMemoState.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<NoteOptionVideoMemoItem> component2() {
        return this.memoItems;
    }

    public final VideoMemoState copy(boolean isLoading, List<NoteOptionVideoMemoItem> memoItems) {
        Intrinsics.checkNotNullParameter(memoItems, "memoItems");
        return new VideoMemoState(isLoading, memoItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoMemoState)) {
            return false;
        }
        VideoMemoState videoMemoState = (VideoMemoState) other;
        return this.isLoading == videoMemoState.isLoading && Intrinsics.areEqual(this.memoItems, videoMemoState.memoItems);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isLoading) * 31) + this.memoItems.hashCode();
    }

    public String toString() {
        return "VideoMemoState(isLoading=" + this.isLoading + ", memoItems=" + this.memoItems + ")";
    }

    public VideoMemoState(boolean z, List<NoteOptionVideoMemoItem> memoItems) {
        Intrinsics.checkNotNullParameter(memoItems, "memoItems");
        this.isLoading = z;
        this.memoItems = memoItems;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ VideoMemoState(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<NoteOptionVideoMemoItem> getMemoItems() {
        return this.memoItems;
    }
}
