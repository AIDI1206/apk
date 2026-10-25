package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0084\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\u0004HÖ\u0001J\t\u00102\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001c\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001f¨\u00063"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoHeaderItem;", "Lcom/medicmedia/medilink/domain/model/VideoItemInterface;", "Lcom/medicmedia/medilink/domain/model/RecyclerViewItem;", "courseId", "", "courseType", "detail", "", "videogId", "videoHash", "thumbnailXl", "videoNumber", "videoConditionId", "timeLimitTo", "Ljava/util/Date;", "timeLimitFrom", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;)V", "getCourseId", "()I", "getCourseType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDetail", "()Ljava/lang/String;", "getVideogId", "getVideoHash", "getThumbnailXl", "getVideoNumber", "getVideoConditionId", "getTimeLimitTo", "()Ljava/util/Date;", "getTimeLimitFrom", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;)Lcom/medicmedia/medilink/domain/model/VideoHeaderItem;", "equals", "", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoHeaderItem extends RecyclerViewItem implements VideoItemInterface {
    private final int courseId;
    private final Integer courseType;
    private final String detail;
    private final String thumbnailXl;
    private final Date timeLimitFrom;
    private final Date timeLimitTo;
    private final Integer videoConditionId;
    private final String videoHash;
    private final Integer videoNumber;
    private final Integer videogId;

    public static /* synthetic */ VideoHeaderItem copy$default(VideoHeaderItem videoHeaderItem, int i, Integer num, String str, Integer num2, String str2, String str3, Integer num3, Integer num4, Date date, Date date2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = videoHeaderItem.courseId;
        }
        if ((i2 & 2) != 0) {
            num = videoHeaderItem.courseType;
        }
        if ((i2 & 4) != 0) {
            str = videoHeaderItem.detail;
        }
        if ((i2 & 8) != 0) {
            num2 = videoHeaderItem.videogId;
        }
        if ((i2 & 16) != 0) {
            str2 = videoHeaderItem.videoHash;
        }
        if ((i2 & 32) != 0) {
            str3 = videoHeaderItem.thumbnailXl;
        }
        if ((i2 & 64) != 0) {
            num3 = videoHeaderItem.videoNumber;
        }
        if ((i2 & 128) != 0) {
            num4 = videoHeaderItem.videoConditionId;
        }
        if ((i2 & 256) != 0) {
            date = videoHeaderItem.timeLimitTo;
        }
        if ((i2 & 512) != 0) {
            date2 = videoHeaderItem.timeLimitFrom;
        }
        Date date3 = date;
        Date date4 = date2;
        Integer num5 = num3;
        Integer num6 = num4;
        String str4 = str2;
        String str5 = str3;
        return videoHeaderItem.copy(i, num, str, num2, str4, str5, num5, num6, date3, date4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getTimeLimitFrom() {
        return this.timeLimitFrom;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCourseType() {
        return this.courseType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getVideogId() {
        return this.videogId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVideoHash() {
        return this.videoHash;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getThumbnailXl() {
        return this.thumbnailXl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getVideoNumber() {
        return this.videoNumber;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getVideoConditionId() {
        return this.videoConditionId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getTimeLimitTo() {
        return this.timeLimitTo;
    }

    public final VideoHeaderItem copy(int courseId, Integer courseType, String detail, Integer videogId, String videoHash, String thumbnailXl, Integer videoNumber, Integer videoConditionId, Date timeLimitTo, Date timeLimitFrom) {
        return new VideoHeaderItem(courseId, courseType, detail, videogId, videoHash, thumbnailXl, videoNumber, videoConditionId, timeLimitTo, timeLimitFrom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoHeaderItem)) {
            return false;
        }
        VideoHeaderItem videoHeaderItem = (VideoHeaderItem) other;
        return this.courseId == videoHeaderItem.courseId && Intrinsics.areEqual(this.courseType, videoHeaderItem.courseType) && Intrinsics.areEqual(this.detail, videoHeaderItem.detail) && Intrinsics.areEqual(this.videogId, videoHeaderItem.videogId) && Intrinsics.areEqual(this.videoHash, videoHeaderItem.videoHash) && Intrinsics.areEqual(this.thumbnailXl, videoHeaderItem.thumbnailXl) && Intrinsics.areEqual(this.videoNumber, videoHeaderItem.videoNumber) && Intrinsics.areEqual(this.videoConditionId, videoHeaderItem.videoConditionId) && Intrinsics.areEqual(this.timeLimitTo, videoHeaderItem.timeLimitTo) && Intrinsics.areEqual(this.timeLimitFrom, videoHeaderItem.timeLimitFrom);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.courseId) * 31;
        Integer num = this.courseType;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.detail;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.videogId;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.videoHash;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumbnailXl;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.videoNumber;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.videoConditionId;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Date date = this.timeLimitTo;
        int iHashCode9 = (iHashCode8 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.timeLimitFrom;
        return iHashCode9 + (date2 != null ? date2.hashCode() : 0);
    }

    public String toString() {
        return "VideoHeaderItem(courseId=" + this.courseId + ", courseType=" + this.courseType + ", detail=" + this.detail + ", videogId=" + this.videogId + ", videoHash=" + this.videoHash + ", thumbnailXl=" + this.thumbnailXl + ", videoNumber=" + this.videoNumber + ", videoConditionId=" + this.videoConditionId + ", timeLimitTo=" + this.timeLimitTo + ", timeLimitFrom=" + this.timeLimitFrom + ")";
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final Integer getCourseType() {
        return this.courseType;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final Integer getVideogId() {
        return this.videogId;
    }

    public final String getVideoHash() {
        return this.videoHash;
    }

    public final String getThumbnailXl() {
        return this.thumbnailXl;
    }

    public final Integer getVideoNumber() {
        return this.videoNumber;
    }

    public final Integer getVideoConditionId() {
        return this.videoConditionId;
    }

    public final Date getTimeLimitTo() {
        return this.timeLimitTo;
    }

    public final Date getTimeLimitFrom() {
        return this.timeLimitFrom;
    }

    public VideoHeaderItem(int i, Integer num, String str, Integer num2, String str2, String str3, Integer num3, Integer num4, Date date, Date date2) {
        super(ContentsItemLevel.HEADER.getValue());
        this.courseId = i;
        this.courseType = num;
        this.detail = str;
        this.videogId = num2;
        this.videoHash = str2;
        this.thumbnailXl = str3;
        this.videoNumber = num3;
        this.videoConditionId = num4;
        this.timeLimitTo = date;
        this.timeLimitFrom = date2;
    }
}
