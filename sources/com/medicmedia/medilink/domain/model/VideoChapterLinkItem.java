package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DeepLinkItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoChapterLinkItem;", "", "isExistsItem", "", "courseId", "", "chapterId", "", "chapter", "Lcom/medicmedia/medilink/domain/model/VideoChapter;", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;Lcom/medicmedia/medilink/domain/model/VideoChapter;)V", "()Z", "getCourseId", "()Ljava/lang/String;", "getChapterId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChapter", "()Lcom/medicmedia/medilink/domain/model/VideoChapter;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;Lcom/medicmedia/medilink/domain/model/VideoChapter;)Lcom/medicmedia/medilink/domain/model/VideoChapterLinkItem;", "equals", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoChapterLinkItem {
    private final VideoChapter chapter;
    private final Integer chapterId;
    private final String courseId;
    private final boolean isExistsItem;

    public static /* synthetic */ VideoChapterLinkItem copy$default(VideoChapterLinkItem videoChapterLinkItem, boolean z, String str, Integer num, VideoChapter videoChapter, int i, Object obj) {
        if ((i & 1) != 0) {
            z = videoChapterLinkItem.isExistsItem;
        }
        if ((i & 2) != 0) {
            str = videoChapterLinkItem.courseId;
        }
        if ((i & 4) != 0) {
            num = videoChapterLinkItem.chapterId;
        }
        if ((i & 8) != 0) {
            videoChapter = videoChapterLinkItem.chapter;
        }
        return videoChapterLinkItem.copy(z, str, num, videoChapter);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsExistsItem() {
        return this.isExistsItem;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getChapterId() {
        return this.chapterId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VideoChapter getChapter() {
        return this.chapter;
    }

    public final VideoChapterLinkItem copy(boolean isExistsItem, String courseId, Integer chapterId, VideoChapter chapter) {
        return new VideoChapterLinkItem(isExistsItem, courseId, chapterId, chapter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoChapterLinkItem)) {
            return false;
        }
        VideoChapterLinkItem videoChapterLinkItem = (VideoChapterLinkItem) other;
        return this.isExistsItem == videoChapterLinkItem.isExistsItem && Intrinsics.areEqual(this.courseId, videoChapterLinkItem.courseId) && Intrinsics.areEqual(this.chapterId, videoChapterLinkItem.chapterId) && Intrinsics.areEqual(this.chapter, videoChapterLinkItem.chapter);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isExistsItem) * 31;
        String str = this.courseId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.chapterId;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        VideoChapter videoChapter = this.chapter;
        return iHashCode3 + (videoChapter != null ? videoChapter.hashCode() : 0);
    }

    public String toString() {
        return "VideoChapterLinkItem(isExistsItem=" + this.isExistsItem + ", courseId=" + this.courseId + ", chapterId=" + this.chapterId + ", chapter=" + this.chapter + ")";
    }

    public VideoChapterLinkItem(boolean z, String str, Integer num, VideoChapter videoChapter) {
        this.isExistsItem = z;
        this.courseId = str;
        this.chapterId = num;
        this.chapter = videoChapter;
    }

    public final boolean isExistsItem() {
        return this.isExistsItem;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final Integer getChapterId() {
        return this.chapterId;
    }

    public final VideoChapter getChapter() {
        return this.chapter;
    }
}
