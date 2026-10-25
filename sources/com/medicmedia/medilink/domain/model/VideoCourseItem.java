package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bñ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u0014\u0010>\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018J\u000e\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u0015J\t\u0010B\u001a\u00020\u0004HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010F\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010G\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010P\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018HÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018HÆ\u0003J\u000f\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018HÆ\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018HÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010%J¤\u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00182\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00182\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010XJ\u0013\u0010Y\u001a\u00020@2\b\u0010Z\u001a\u0004\u0018\u00010[HÖ\u0003J\t\u0010\\\u001a\u00020\u0004HÖ\u0001J\t\u0010]\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b\u0005\u0010%R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b)\u0010%R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b*\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b-\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b1\u0010%R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b2\u0010%R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b3\u0010%R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b4\u0010%R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018¢\u0006\b\n\u0000\u001a\u0004\b:\u00109R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018¢\u0006\b\n\u0000\u001a\u0004\b;\u00109R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018¢\u0006\b\n\u0000\u001a\u0004\b<\u00109R\u0015\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010&\u001a\u0004\b=\u0010%¨\u0006^"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoCourseItem;", "Lcom/medicmedia/medilink/domain/model/VideoItemInterface;", "Lcom/medicmedia/medilink/domain/model/RecyclerViewItem;", "courseId", "", "isWebinar", "courseTitle", "", "courseType", "fieldTypeId", "detail", "thumb", "videogId", "videoHash", "thumbnailXl", "thumbnailL", "videoNumber", "playTime", "displayOrder", "videoConditionId", "timeLimitTo", "Ljava/util/Date;", "timeLimitFrom", "conditions", "", "Lcom/medicmedia/medilink/domain/model/VideoCondition;", "webinar", "Lcom/medicmedia/medilink/domain/model/VideoWebinar;", "chapters", "Lcom/medicmedia/medilink/domain/model/VideoChapter;", "courseTypes", "Lcom/medicmedia/medilink/domain/model/VideoCourseType;", "purchaseStatus", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "getCourseId", "()I", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCourseTitle", "()Ljava/lang/String;", "getCourseType", "getFieldTypeId", "getDetail", "getThumb", "getVideogId", "getVideoHash", "getThumbnailXl", "getThumbnailL", "getVideoNumber", "getPlayTime", "getDisplayOrder", "getVideoConditionId", "getTimeLimitTo", "()Ljava/util/Date;", "getTimeLimitFrom", "getConditions", "()Ljava/util/List;", "getWebinar", "getChapters", "getCourseTypes", "getPurchaseStatus", "copy", "withinPeriod", "", "date", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/medicmedia/medilink/domain/model/VideoCourseItem;", "equals", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoCourseItem extends RecyclerViewItem implements VideoItemInterface {
    private final List<VideoChapter> chapters;
    private final List<VideoCondition> conditions;
    private final int courseId;
    private final String courseTitle;
    private final Integer courseType;
    private final List<VideoCourseType> courseTypes;
    private final String detail;
    private final Integer displayOrder;
    private final Integer fieldTypeId;
    private final Integer isWebinar;
    private final Integer playTime;
    private final Integer purchaseStatus;
    private final String thumb;
    private final String thumbnailL;
    private final String thumbnailXl;
    private final Date timeLimitFrom;
    private final Date timeLimitTo;
    private final Integer videoConditionId;
    private final String videoHash;
    private final Integer videoNumber;
    private final Integer videogId;
    private final List<VideoWebinar> webinar;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoCourseItem copy$default(VideoCourseItem videoCourseItem, int i, Integer num, String str, Integer num2, Integer num3, String str2, String str3, Integer num4, String str4, String str5, String str6, Integer num5, Integer num6, Integer num7, Integer num8, Date date, Date date2, List list, List list2, List list3, List list4, Integer num9, int i2, Object obj) {
        Integer num10;
        List list5;
        int i3 = (i2 & 1) != 0 ? videoCourseItem.courseId : i;
        Integer num11 = (i2 & 2) != 0 ? videoCourseItem.isWebinar : num;
        String str7 = (i2 & 4) != 0 ? videoCourseItem.courseTitle : str;
        Integer num12 = (i2 & 8) != 0 ? videoCourseItem.courseType : num2;
        Integer num13 = (i2 & 16) != 0 ? videoCourseItem.fieldTypeId : num3;
        String str8 = (i2 & 32) != 0 ? videoCourseItem.detail : str2;
        String str9 = (i2 & 64) != 0 ? videoCourseItem.thumb : str3;
        Integer num14 = (i2 & 128) != 0 ? videoCourseItem.videogId : num4;
        String str10 = (i2 & 256) != 0 ? videoCourseItem.videoHash : str4;
        String str11 = (i2 & 512) != 0 ? videoCourseItem.thumbnailXl : str5;
        String str12 = (i2 & 1024) != 0 ? videoCourseItem.thumbnailL : str6;
        Integer num15 = (i2 & 2048) != 0 ? videoCourseItem.videoNumber : num5;
        Integer num16 = (i2 & 4096) != 0 ? videoCourseItem.playTime : num6;
        Integer num17 = (i2 & 8192) != 0 ? videoCourseItem.displayOrder : num7;
        int i4 = i3;
        Integer num18 = (i2 & 16384) != 0 ? videoCourseItem.videoConditionId : num8;
        Date date3 = (i2 & 32768) != 0 ? videoCourseItem.timeLimitTo : date;
        Date date4 = (i2 & 65536) != 0 ? videoCourseItem.timeLimitFrom : date2;
        List list6 = (i2 & 131072) != 0 ? videoCourseItem.conditions : list;
        List list7 = (i2 & 262144) != 0 ? videoCourseItem.webinar : list2;
        List list8 = (i2 & 524288) != 0 ? videoCourseItem.chapters : list3;
        List list9 = (i2 & 1048576) != 0 ? videoCourseItem.courseTypes : list4;
        if ((i2 & 2097152) != 0) {
            list5 = list9;
            num10 = videoCourseItem.purchaseStatus;
        } else {
            num10 = num9;
            list5 = list9;
        }
        return videoCourseItem.copy(i4, num11, str7, num12, num13, str8, str9, num14, str10, str11, str12, num15, num16, num17, num18, date3, date4, list6, list7, list8, list5, num10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getThumbnailXl() {
        return this.thumbnailXl;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getThumbnailL() {
        return this.thumbnailL;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getVideoNumber() {
        return this.videoNumber;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getPlayTime() {
        return this.playTime;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getVideoConditionId() {
        return this.videoConditionId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Date getTimeLimitTo() {
        return this.timeLimitTo;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Date getTimeLimitFrom() {
        return this.timeLimitFrom;
    }

    public final List<VideoCondition> component18() {
        return this.conditions;
    }

    public final List<VideoWebinar> component19() {
        return this.webinar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getIsWebinar() {
        return this.isWebinar;
    }

    public final List<VideoChapter> component20() {
        return this.chapters;
    }

    public final List<VideoCourseType> component21() {
        return this.courseTypes;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Integer getPurchaseStatus() {
        return this.purchaseStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCourseTitle() {
        return this.courseTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCourseType() {
        return this.courseType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getFieldTypeId() {
        return this.fieldTypeId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getThumb() {
        return this.thumb;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getVideogId() {
        return this.videogId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getVideoHash() {
        return this.videoHash;
    }

    public final VideoCourseItem copy(int courseId, Integer isWebinar, String courseTitle, Integer courseType, Integer fieldTypeId, String detail, String thumb, Integer videogId, String videoHash, String thumbnailXl, String thumbnailL, Integer videoNumber, Integer playTime, Integer displayOrder, Integer videoConditionId, Date timeLimitTo, Date timeLimitFrom, List<VideoCondition> conditions, List<VideoWebinar> webinar, List<VideoChapter> chapters, List<VideoCourseType> courseTypes, Integer purchaseStatus) {
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(webinar, "webinar");
        Intrinsics.checkNotNullParameter(chapters, "chapters");
        Intrinsics.checkNotNullParameter(courseTypes, "courseTypes");
        return new VideoCourseItem(courseId, isWebinar, courseTitle, courseType, fieldTypeId, detail, thumb, videogId, videoHash, thumbnailXl, thumbnailL, videoNumber, playTime, displayOrder, videoConditionId, timeLimitTo, timeLimitFrom, conditions, webinar, chapters, courseTypes, purchaseStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoCourseItem)) {
            return false;
        }
        VideoCourseItem videoCourseItem = (VideoCourseItem) other;
        return this.courseId == videoCourseItem.courseId && Intrinsics.areEqual(this.isWebinar, videoCourseItem.isWebinar) && Intrinsics.areEqual(this.courseTitle, videoCourseItem.courseTitle) && Intrinsics.areEqual(this.courseType, videoCourseItem.courseType) && Intrinsics.areEqual(this.fieldTypeId, videoCourseItem.fieldTypeId) && Intrinsics.areEqual(this.detail, videoCourseItem.detail) && Intrinsics.areEqual(this.thumb, videoCourseItem.thumb) && Intrinsics.areEqual(this.videogId, videoCourseItem.videogId) && Intrinsics.areEqual(this.videoHash, videoCourseItem.videoHash) && Intrinsics.areEqual(this.thumbnailXl, videoCourseItem.thumbnailXl) && Intrinsics.areEqual(this.thumbnailL, videoCourseItem.thumbnailL) && Intrinsics.areEqual(this.videoNumber, videoCourseItem.videoNumber) && Intrinsics.areEqual(this.playTime, videoCourseItem.playTime) && Intrinsics.areEqual(this.displayOrder, videoCourseItem.displayOrder) && Intrinsics.areEqual(this.videoConditionId, videoCourseItem.videoConditionId) && Intrinsics.areEqual(this.timeLimitTo, videoCourseItem.timeLimitTo) && Intrinsics.areEqual(this.timeLimitFrom, videoCourseItem.timeLimitFrom) && Intrinsics.areEqual(this.conditions, videoCourseItem.conditions) && Intrinsics.areEqual(this.webinar, videoCourseItem.webinar) && Intrinsics.areEqual(this.chapters, videoCourseItem.chapters) && Intrinsics.areEqual(this.courseTypes, videoCourseItem.courseTypes) && Intrinsics.areEqual(this.purchaseStatus, videoCourseItem.purchaseStatus);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.courseId) * 31;
        Integer num = this.isWebinar;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.courseTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.courseType;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.fieldTypeId;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.detail;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.thumb;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num4 = this.videogId;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str4 = this.videoHash;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.thumbnailXl;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.thumbnailL;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num5 = this.videoNumber;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.playTime;
        int iHashCode13 = (iHashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.displayOrder;
        int iHashCode14 = (iHashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.videoConditionId;
        int iHashCode15 = (iHashCode14 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Date date = this.timeLimitTo;
        int iHashCode16 = (iHashCode15 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.timeLimitFrom;
        int iHashCode17 = (((((((((iHashCode16 + (date2 == null ? 0 : date2.hashCode())) * 31) + this.conditions.hashCode()) * 31) + this.webinar.hashCode()) * 31) + this.chapters.hashCode()) * 31) + this.courseTypes.hashCode()) * 31;
        Integer num9 = this.purchaseStatus;
        return iHashCode17 + (num9 != null ? num9.hashCode() : 0);
    }

    public String toString() {
        return "VideoCourseItem(courseId=" + this.courseId + ", isWebinar=" + this.isWebinar + ", courseTitle=" + this.courseTitle + ", courseType=" + this.courseType + ", fieldTypeId=" + this.fieldTypeId + ", detail=" + this.detail + ", thumb=" + this.thumb + ", videogId=" + this.videogId + ", videoHash=" + this.videoHash + ", thumbnailXl=" + this.thumbnailXl + ", thumbnailL=" + this.thumbnailL + ", videoNumber=" + this.videoNumber + ", playTime=" + this.playTime + ", displayOrder=" + this.displayOrder + ", videoConditionId=" + this.videoConditionId + ", timeLimitTo=" + this.timeLimitTo + ", timeLimitFrom=" + this.timeLimitFrom + ", conditions=" + this.conditions + ", webinar=" + this.webinar + ", chapters=" + this.chapters + ", courseTypes=" + this.courseTypes + ", purchaseStatus=" + this.purchaseStatus + ")";
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final Integer isWebinar() {
        return this.isWebinar;
    }

    public final String getCourseTitle() {
        return this.courseTitle;
    }

    public final Integer getCourseType() {
        return this.courseType;
    }

    public final Integer getFieldTypeId() {
        return this.fieldTypeId;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getThumb() {
        return this.thumb;
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

    public final String getThumbnailL() {
        return this.thumbnailL;
    }

    public final Integer getVideoNumber() {
        return this.videoNumber;
    }

    public final Integer getPlayTime() {
        return this.playTime;
    }

    public final Integer getDisplayOrder() {
        return this.displayOrder;
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

    public final List<VideoCondition> getConditions() {
        return this.conditions;
    }

    public final List<VideoWebinar> getWebinar() {
        return this.webinar;
    }

    public final List<VideoChapter> getChapters() {
        return this.chapters;
    }

    public final List<VideoCourseType> getCourseTypes() {
        return this.courseTypes;
    }

    public final Integer getPurchaseStatus() {
        return this.purchaseStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCourseItem(int i, Integer num, String str, Integer num2, Integer num3, String str2, String str3, Integer num4, String str4, String str5, String str6, Integer num5, Integer num6, Integer num7, Integer num8, Date date, Date date2, List<VideoCondition> conditions, List<VideoWebinar> webinar, List<VideoChapter> chapters, List<VideoCourseType> courseTypes, Integer num9) {
        super(ContentsItemLevel.COURSE.getValue());
        Intrinsics.checkNotNullParameter(conditions, "conditions");
        Intrinsics.checkNotNullParameter(webinar, "webinar");
        Intrinsics.checkNotNullParameter(chapters, "chapters");
        Intrinsics.checkNotNullParameter(courseTypes, "courseTypes");
        this.courseId = i;
        this.isWebinar = num;
        this.courseTitle = str;
        this.courseType = num2;
        this.fieldTypeId = num3;
        this.detail = str2;
        this.thumb = str3;
        this.videogId = num4;
        this.videoHash = str4;
        this.thumbnailXl = str5;
        this.thumbnailL = str6;
        this.videoNumber = num5;
        this.playTime = num6;
        this.displayOrder = num7;
        this.videoConditionId = num8;
        this.timeLimitTo = date;
        this.timeLimitFrom = date2;
        this.conditions = conditions;
        this.webinar = webinar;
        this.chapters = chapters;
        this.courseTypes = courseTypes;
        this.purchaseStatus = num9;
    }

    public final VideoCourseItem copy(List<VideoChapter> chapters) {
        Intrinsics.checkNotNullParameter(chapters, "chapters");
        return new VideoCourseItem(this.courseId, this.isWebinar, this.courseTitle, this.courseType, this.fieldTypeId, this.detail, this.thumb, this.videogId, this.videoHash, this.thumbnailXl, this.thumbnailL, this.videoNumber, this.playTime, this.displayOrder, this.videoConditionId, this.timeLimitTo, this.timeLimitFrom, this.conditions, this.webinar, chapters, this.courseTypes, this.purchaseStatus);
    }

    public final boolean withinPeriod(Date date) {
        Date date2;
        Intrinsics.checkNotNullParameter(date, "date");
        Date date3 = this.timeLimitFrom;
        return date3 != null && date.after(date3) && (date2 = this.timeLimitTo) != null && date2.after(date);
    }
}
