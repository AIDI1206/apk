package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsUrlItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoChapterUrlResult;", "", "contentsId", "", "courseId", "", "chapterId", "<init>", "(Ljava/lang/String;II)V", "getContentsId", "()Ljava/lang/String;", "getCourseId", "()I", "getChapterId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoChapterUrlResult {
    private final int chapterId;
    private final String contentsId;
    private final int courseId;

    public static /* synthetic */ VideoChapterUrlResult copy$default(VideoChapterUrlResult videoChapterUrlResult, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = videoChapterUrlResult.contentsId;
        }
        if ((i3 & 2) != 0) {
            i = videoChapterUrlResult.courseId;
        }
        if ((i3 & 4) != 0) {
            i2 = videoChapterUrlResult.chapterId;
        }
        return videoChapterUrlResult.copy(str, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getChapterId() {
        return this.chapterId;
    }

    public final VideoChapterUrlResult copy(String contentsId, int courseId, int chapterId) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        return new VideoChapterUrlResult(contentsId, courseId, chapterId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoChapterUrlResult)) {
            return false;
        }
        VideoChapterUrlResult videoChapterUrlResult = (VideoChapterUrlResult) other;
        return Intrinsics.areEqual(this.contentsId, videoChapterUrlResult.contentsId) && this.courseId == videoChapterUrlResult.courseId && this.chapterId == videoChapterUrlResult.chapterId;
    }

    public int hashCode() {
        return (((this.contentsId.hashCode() * 31) + Integer.hashCode(this.courseId)) * 31) + Integer.hashCode(this.chapterId);
    }

    public String toString() {
        return "VideoChapterUrlResult(contentsId=" + this.contentsId + ", courseId=" + this.courseId + ", chapterId=" + this.chapterId + ")";
    }

    public VideoChapterUrlResult(String contentsId, int i, int i2) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        this.contentsId = contentsId;
        this.courseId = i;
        this.chapterId = i2;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getChapterId() {
        return this.chapterId;
    }
}
