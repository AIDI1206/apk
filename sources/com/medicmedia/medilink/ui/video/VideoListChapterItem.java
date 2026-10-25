package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0003H×\u0001J\t\u0010\u0016\u001a\u00020\u0006H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoListChapterItem;", "", "chapterId", "", "completeCount", "lastDate", "", "<init>", "(IILjava/lang/String;)V", "getChapterId", "()I", "getCompleteCount", "getLastDate", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoListChapterItem {
    public static final int $stable = 0;
    private final int chapterId;
    private final int completeCount;
    private final String lastDate;

    public static /* synthetic */ VideoListChapterItem copy$default(VideoListChapterItem videoListChapterItem, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = videoListChapterItem.chapterId;
        }
        if ((i3 & 2) != 0) {
            i2 = videoListChapterItem.completeCount;
        }
        if ((i3 & 4) != 0) {
            str = videoListChapterItem.lastDate;
        }
        return videoListChapterItem.copy(i, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getChapterId() {
        return this.chapterId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCompleteCount() {
        return this.completeCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastDate() {
        return this.lastDate;
    }

    public final VideoListChapterItem copy(int chapterId, int completeCount, String lastDate) {
        Intrinsics.checkNotNullParameter(lastDate, "lastDate");
        return new VideoListChapterItem(chapterId, completeCount, lastDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoListChapterItem)) {
            return false;
        }
        VideoListChapterItem videoListChapterItem = (VideoListChapterItem) other;
        return this.chapterId == videoListChapterItem.chapterId && this.completeCount == videoListChapterItem.completeCount && Intrinsics.areEqual(this.lastDate, videoListChapterItem.lastDate);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.chapterId) * 31) + Integer.hashCode(this.completeCount)) * 31) + this.lastDate.hashCode();
    }

    public String toString() {
        return "VideoListChapterItem(chapterId=" + this.chapterId + ", completeCount=" + this.completeCount + ", lastDate=" + this.lastDate + ")";
    }

    public VideoListChapterItem(int i, int i2, String lastDate) {
        Intrinsics.checkNotNullParameter(lastDate, "lastDate");
        this.chapterId = i;
        this.completeCount = i2;
        this.lastDate = lastDate;
    }

    public final int getChapterId() {
        return this.chapterId;
    }

    public final int getCompleteCount() {
        return this.completeCount;
    }

    public final String getLastDate() {
        return this.lastDate;
    }
}
