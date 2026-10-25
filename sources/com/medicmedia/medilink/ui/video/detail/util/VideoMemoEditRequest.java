package com.medicmedia.medilink.ui.video.detail.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.model.NoteOptionVideoMemoItem;
import com.medicmedia.medilink.domain.model.VideoSubItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoMemoCoordinator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JA\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010 \u001a\u00020!H×\u0001J\t\u0010\"\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006#"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/util/VideoMemoEditRequest;", "", "contentsId", "", "videoSubItem", "Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "currentMemoItems", "", "Lcom/medicmedia/medilink/domain/model/NoteOptionVideoMemoItem;", "playTime", "", HistoryRepositoryImpl.Path.MEMO, "<init>", "(Ljava/lang/String;Lcom/medicmedia/medilink/domain/model/VideoSubItem;Ljava/util/List;JLjava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getVideoSubItem", "()Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "getCurrentMemoItems", "()Ljava/util/List;", "getPlayTime", "()J", "getMemo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoMemoEditRequest {
    public static final int $stable = 8;
    private final String contentsId;
    private final List<NoteOptionVideoMemoItem> currentMemoItems;
    private final String memo;
    private final long playTime;
    private final VideoSubItem videoSubItem;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoMemoEditRequest copy$default(VideoMemoEditRequest videoMemoEditRequest, String str, VideoSubItem videoSubItem, List list, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoMemoEditRequest.contentsId;
        }
        if ((i & 2) != 0) {
            videoSubItem = videoMemoEditRequest.videoSubItem;
        }
        if ((i & 4) != 0) {
            list = videoMemoEditRequest.currentMemoItems;
        }
        if ((i & 8) != 0) {
            j = videoMemoEditRequest.playTime;
        }
        if ((i & 16) != 0) {
            str2 = videoMemoEditRequest.memo;
        }
        String str3 = str2;
        List list2 = list;
        return videoMemoEditRequest.copy(str, videoSubItem, list2, j, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoSubItem getVideoSubItem() {
        return this.videoSubItem;
    }

    public final List<NoteOptionVideoMemoItem> component3() {
        return this.currentMemoItems;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getPlayTime() {
        return this.playTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMemo() {
        return this.memo;
    }

    public final VideoMemoEditRequest copy(String contentsId, VideoSubItem videoSubItem, List<NoteOptionVideoMemoItem> currentMemoItems, long playTime, String memo) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(videoSubItem, "videoSubItem");
        Intrinsics.checkNotNullParameter(currentMemoItems, "currentMemoItems");
        Intrinsics.checkNotNullParameter(memo, "memo");
        return new VideoMemoEditRequest(contentsId, videoSubItem, currentMemoItems, playTime, memo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoMemoEditRequest)) {
            return false;
        }
        VideoMemoEditRequest videoMemoEditRequest = (VideoMemoEditRequest) other;
        return Intrinsics.areEqual(this.contentsId, videoMemoEditRequest.contentsId) && Intrinsics.areEqual(this.videoSubItem, videoMemoEditRequest.videoSubItem) && Intrinsics.areEqual(this.currentMemoItems, videoMemoEditRequest.currentMemoItems) && this.playTime == videoMemoEditRequest.playTime && Intrinsics.areEqual(this.memo, videoMemoEditRequest.memo);
    }

    public int hashCode() {
        return (((((((this.contentsId.hashCode() * 31) + this.videoSubItem.hashCode()) * 31) + this.currentMemoItems.hashCode()) * 31) + Long.hashCode(this.playTime)) * 31) + this.memo.hashCode();
    }

    public String toString() {
        return "VideoMemoEditRequest(contentsId=" + this.contentsId + ", videoSubItem=" + this.videoSubItem + ", currentMemoItems=" + this.currentMemoItems + ", playTime=" + this.playTime + ", memo=" + this.memo + ")";
    }

    public VideoMemoEditRequest(String contentsId, VideoSubItem videoSubItem, List<NoteOptionVideoMemoItem> currentMemoItems, long j, String memo) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(videoSubItem, "videoSubItem");
        Intrinsics.checkNotNullParameter(currentMemoItems, "currentMemoItems");
        Intrinsics.checkNotNullParameter(memo, "memo");
        this.contentsId = contentsId;
        this.videoSubItem = videoSubItem;
        this.currentMemoItems = currentMemoItems;
        this.playTime = j;
        this.memo = memo;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final VideoSubItem getVideoSubItem() {
        return this.videoSubItem;
    }

    public final List<NoteOptionVideoMemoItem> getCurrentMemoItems() {
        return this.currentMemoItems;
    }

    public final long getPlayTime() {
        return this.playTime;
    }

    public final String getMemo() {
        return this.memo;
    }
}
