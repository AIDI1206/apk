package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoStatus.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010#\u001a\u00020\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003Jn\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001a¨\u0006/"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoStatus;", "", BundleKey.VIDEO_ID, "", "courseId", "chapterId", "categoryId", "isComplete", "", "lastViewDate", "Ljava/util/Date;", "playTimeMillis", "", "updatedAt", "syncedAt", "<init>", "(IIILjava/lang/Integer;ZLjava/util/Date;JLjava/util/Date;Ljava/util/Date;)V", "getVideoId", "()I", "getCourseId", "getChapterId", "getCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "getLastViewDate", "()Ljava/util/Date;", "getPlayTimeMillis", "()J", "getUpdatedAt", "getSyncedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IIILjava/lang/Integer;ZLjava/util/Date;JLjava/util/Date;Ljava/util/Date;)Lcom/medicmedia/medilink/domain/model/VideoStatus;", "equals", "other", "hashCode", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoStatus {
    private final Integer categoryId;
    private final int chapterId;
    private final int courseId;
    private final boolean isComplete;
    private final Date lastViewDate;
    private final long playTimeMillis;
    private final Date syncedAt;
    private final Date updatedAt;
    private final int videoId;

    public static /* synthetic */ VideoStatus copy$default(VideoStatus videoStatus, int i, int i2, int i3, Integer num, boolean z, Date date, long j, Date date2, Date date3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = videoStatus.videoId;
        }
        if ((i4 & 2) != 0) {
            i2 = videoStatus.courseId;
        }
        if ((i4 & 4) != 0) {
            i3 = videoStatus.chapterId;
        }
        if ((i4 & 8) != 0) {
            num = videoStatus.categoryId;
        }
        if ((i4 & 16) != 0) {
            z = videoStatus.isComplete;
        }
        if ((i4 & 32) != 0) {
            date = videoStatus.lastViewDate;
        }
        if ((i4 & 64) != 0) {
            j = videoStatus.playTimeMillis;
        }
        if ((i4 & 128) != 0) {
            date2 = videoStatus.updatedAt;
        }
        if ((i4 & 256) != 0) {
            date3 = videoStatus.syncedAt;
        }
        long j2 = j;
        boolean z2 = z;
        Date date4 = date;
        int i5 = i3;
        Integer num2 = num;
        return videoStatus.copy(i, i2, i5, num2, z2, date4, j2, date2, date3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVideoId() {
        return this.videoId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getChapterId() {
        return this.chapterId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Date getLastViewDate() {
        return this.lastViewDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getPlayTimeMillis() {
        return this.playTimeMillis;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getSyncedAt() {
        return this.syncedAt;
    }

    public final VideoStatus copy(int videoId, int courseId, int chapterId, Integer categoryId, boolean isComplete, Date lastViewDate, long playTimeMillis, Date updatedAt, Date syncedAt) {
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new VideoStatus(videoId, courseId, chapterId, categoryId, isComplete, lastViewDate, playTimeMillis, updatedAt, syncedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoStatus)) {
            return false;
        }
        VideoStatus videoStatus = (VideoStatus) other;
        return this.videoId == videoStatus.videoId && this.courseId == videoStatus.courseId && this.chapterId == videoStatus.chapterId && Intrinsics.areEqual(this.categoryId, videoStatus.categoryId) && this.isComplete == videoStatus.isComplete && Intrinsics.areEqual(this.lastViewDate, videoStatus.lastViewDate) && this.playTimeMillis == videoStatus.playTimeMillis && Intrinsics.areEqual(this.updatedAt, videoStatus.updatedAt) && Intrinsics.areEqual(this.syncedAt, videoStatus.syncedAt);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.videoId) * 31) + Integer.hashCode(this.courseId)) * 31) + Integer.hashCode(this.chapterId)) * 31;
        Integer num = this.categoryId;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isComplete)) * 31;
        Date date = this.lastViewDate;
        int iHashCode3 = (((((iHashCode2 + (date == null ? 0 : date.hashCode())) * 31) + Long.hashCode(this.playTimeMillis)) * 31) + this.updatedAt.hashCode()) * 31;
        Date date2 = this.syncedAt;
        return iHashCode3 + (date2 != null ? date2.hashCode() : 0);
    }

    public String toString() {
        return "VideoStatus(videoId=" + this.videoId + ", courseId=" + this.courseId + ", chapterId=" + this.chapterId + ", categoryId=" + this.categoryId + ", isComplete=" + this.isComplete + ", lastViewDate=" + this.lastViewDate + ", playTimeMillis=" + this.playTimeMillis + ", updatedAt=" + this.updatedAt + ", syncedAt=" + this.syncedAt + ")";
    }

    public VideoStatus(int i, int i2, int i3, Integer num, boolean z, Date date, long j, Date updatedAt, Date date2) {
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.videoId = i;
        this.courseId = i2;
        this.chapterId = i3;
        this.categoryId = num;
        this.isComplete = z;
        this.lastViewDate = date;
        this.playTimeMillis = j;
        this.updatedAt = updatedAt;
        this.syncedAt = date2;
    }

    public final int getVideoId() {
        return this.videoId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getChapterId() {
        return this.chapterId;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public final Date getLastViewDate() {
        return this.lastViewDate;
    }

    public final long getPlayTimeMillis() {
        return this.playTimeMillis;
    }

    public final Date getUpdatedAt() {
        return this.updatedAt;
    }

    public final Date getSyncedAt() {
        return this.syncedAt;
    }
}
