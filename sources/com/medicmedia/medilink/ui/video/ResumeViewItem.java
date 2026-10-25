package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u0007H×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/ui/video/ResumeViewItem;", "", "courseTitle", "", "videoTitle", "thumbnailUrl", "courseId", "", "videoHash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getCourseTitle", "()Ljava/lang/String;", "getVideoTitle", "getThumbnailUrl", "getCourseId", "()I", "getVideoHash", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ResumeViewItem {
    public static final int $stable = 0;
    private final int courseId;
    private final String courseTitle;
    private final String thumbnailUrl;
    private final String videoHash;
    private final String videoTitle;

    public static /* synthetic */ ResumeViewItem copy$default(ResumeViewItem resumeViewItem, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = resumeViewItem.courseTitle;
        }
        if ((i2 & 2) != 0) {
            str2 = resumeViewItem.videoTitle;
        }
        if ((i2 & 4) != 0) {
            str3 = resumeViewItem.thumbnailUrl;
        }
        if ((i2 & 8) != 0) {
            i = resumeViewItem.courseId;
        }
        if ((i2 & 16) != 0) {
            str4 = resumeViewItem.videoHash;
        }
        String str5 = str4;
        String str6 = str3;
        return resumeViewItem.copy(str, str2, str6, i, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCourseTitle() {
        return this.courseTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVideoTitle() {
        return this.videoTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVideoHash() {
        return this.videoHash;
    }

    public final ResumeViewItem copy(String courseTitle, String videoTitle, String thumbnailUrl, int courseId, String videoHash) {
        Intrinsics.checkNotNullParameter(courseTitle, "courseTitle");
        Intrinsics.checkNotNullParameter(videoTitle, "videoTitle");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        return new ResumeViewItem(courseTitle, videoTitle, thumbnailUrl, courseId, videoHash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResumeViewItem)) {
            return false;
        }
        ResumeViewItem resumeViewItem = (ResumeViewItem) other;
        return Intrinsics.areEqual(this.courseTitle, resumeViewItem.courseTitle) && Intrinsics.areEqual(this.videoTitle, resumeViewItem.videoTitle) && Intrinsics.areEqual(this.thumbnailUrl, resumeViewItem.thumbnailUrl) && this.courseId == resumeViewItem.courseId && Intrinsics.areEqual(this.videoHash, resumeViewItem.videoHash);
    }

    public int hashCode() {
        return (((((((this.courseTitle.hashCode() * 31) + this.videoTitle.hashCode()) * 31) + this.thumbnailUrl.hashCode()) * 31) + Integer.hashCode(this.courseId)) * 31) + this.videoHash.hashCode();
    }

    public String toString() {
        return "ResumeViewItem(courseTitle=" + this.courseTitle + ", videoTitle=" + this.videoTitle + ", thumbnailUrl=" + this.thumbnailUrl + ", courseId=" + this.courseId + ", videoHash=" + this.videoHash + ")";
    }

    public ResumeViewItem(String courseTitle, String videoTitle, String thumbnailUrl, int i, String videoHash) {
        Intrinsics.checkNotNullParameter(courseTitle, "courseTitle");
        Intrinsics.checkNotNullParameter(videoTitle, "videoTitle");
        Intrinsics.checkNotNullParameter(thumbnailUrl, "thumbnailUrl");
        Intrinsics.checkNotNullParameter(videoHash, "videoHash");
        this.courseTitle = courseTitle;
        this.videoTitle = videoTitle;
        this.thumbnailUrl = thumbnailUrl;
        this.courseId = i;
        this.videoHash = videoHash;
    }

    public final String getCourseTitle() {
        return this.courseTitle;
    }

    public final String getVideoTitle() {
        return this.videoTitle;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final String getVideoHash() {
        return this.videoHash;
    }
}
