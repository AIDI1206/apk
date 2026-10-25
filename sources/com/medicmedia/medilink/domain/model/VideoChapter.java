package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: VideoCourseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u00ad\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012¢\u0006\u0004\b\u0018\u0010\u0019J*\u00104\u001a\u00020\u00002\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012J\u0010\u00105\u001a\u0004\u0018\u00010\u00132\u0006\u00106\u001a\u00020\u0004J\t\u00107\u001a\u00020\u0004HÆ\u0003J\t\u00108\u001a\u00020\u0004HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010;\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010<\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010=\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0011\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0011\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012HÆ\u0003J\u0011\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012HÆ\u0003J¸\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\f2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020\u0004HÖ\u0001J\t\u0010I\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b#\u0010 R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0013\u0010/\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00102\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b3\u0010\u001e¨\u0006J"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoChapter;", "Lcom/medicmedia/medilink/domain/model/VideoItemInterface;", "Lcom/medicmedia/medilink/domain/model/RecyclerViewItem;", "chapterId", "", "courseId", "chaptersTitle", "", "displayOrder", "videoTimeSec", "videoNumber", "hasCategory", "", "revisionText", "revisionStartDate", "Ljava/util/Date;", "revisionEndDate", "videoIds", "", "Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "categories", "Lcom/medicmedia/medilink/domain/model/VideoCategory;", "pdfFiles", "Lcom/medicmedia/medilink/domain/model/VideoPDFFile;", "<init>", "(IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getChapterId", "()I", "getCourseId", "getChaptersTitle", "()Ljava/lang/String;", "getDisplayOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVideoTimeSec", "getVideoNumber", "getHasCategory", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getRevisionText", "getRevisionStartDate", "()Ljava/util/Date;", "getRevisionEndDate", "getVideoIds", "()Ljava/util/List;", "getCategories", "getPdfFiles", "firstVideoItem", "getFirstVideoItem", "()Lcom/medicmedia/medilink/domain/model/VideoSubItem;", "displayPlayTime", "getDisplayPlayTime", "copy", "findSubVideo", "courseVideoId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "(IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/medicmedia/medilink/domain/model/VideoChapter;", "equals", "other", "", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoChapter extends RecyclerViewItem implements VideoItemInterface {
    private final List<VideoCategory> categories;
    private final int chapterId;
    private final String chaptersTitle;
    private final int courseId;
    private final Integer displayOrder;
    private final Boolean hasCategory;
    private final List<VideoPDFFile> pdfFiles;
    private final Date revisionEndDate;
    private final Date revisionStartDate;
    private final String revisionText;
    private final List<VideoSubItem> videoIds;
    private final Integer videoNumber;
    private final Integer videoTimeSec;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoChapter copy$default(VideoChapter videoChapter, int i, int i2, String str, Integer num, Integer num2, Integer num3, Boolean bool, String str2, Date date, Date date2, List list, List list2, List list3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = videoChapter.chapterId;
        }
        return videoChapter.copy(i, (i3 & 2) != 0 ? videoChapter.courseId : i2, (i3 & 4) != 0 ? videoChapter.chaptersTitle : str, (i3 & 8) != 0 ? videoChapter.displayOrder : num, (i3 & 16) != 0 ? videoChapter.videoTimeSec : num2, (i3 & 32) != 0 ? videoChapter.videoNumber : num3, (i3 & 64) != 0 ? videoChapter.hasCategory : bool, (i3 & 128) != 0 ? videoChapter.revisionText : str2, (i3 & 256) != 0 ? videoChapter.revisionStartDate : date, (i3 & 512) != 0 ? videoChapter.revisionEndDate : date2, (i3 & 1024) != 0 ? videoChapter.videoIds : list, (i3 & 2048) != 0 ? videoChapter.categories : list2, (i3 & 4096) != 0 ? videoChapter.pdfFiles : list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getChapterId() {
        return this.chapterId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Date getRevisionEndDate() {
        return this.revisionEndDate;
    }

    public final List<VideoSubItem> component11() {
        return this.videoIds;
    }

    public final List<VideoCategory> component12() {
        return this.categories;
    }

    public final List<VideoPDFFile> component13() {
        return this.pdfFiles;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChaptersTitle() {
        return this.chaptersTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getVideoTimeSec() {
        return this.videoTimeSec;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getVideoNumber() {
        return this.videoNumber;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getHasCategory() {
        return this.hasCategory;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRevisionText() {
        return this.revisionText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Date getRevisionStartDate() {
        return this.revisionStartDate;
    }

    public final VideoChapter copy(int chapterId, int courseId, String chaptersTitle, Integer displayOrder, Integer videoTimeSec, Integer videoNumber, Boolean hasCategory, String revisionText, Date revisionStartDate, Date revisionEndDate, List<VideoSubItem> videoIds, List<VideoCategory> categories, List<VideoPDFFile> pdfFiles) {
        return new VideoChapter(chapterId, courseId, chaptersTitle, displayOrder, videoTimeSec, videoNumber, hasCategory, revisionText, revisionStartDate, revisionEndDate, videoIds, categories, pdfFiles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoChapter)) {
            return false;
        }
        VideoChapter videoChapter = (VideoChapter) other;
        return this.chapterId == videoChapter.chapterId && this.courseId == videoChapter.courseId && Intrinsics.areEqual(this.chaptersTitle, videoChapter.chaptersTitle) && Intrinsics.areEqual(this.displayOrder, videoChapter.displayOrder) && Intrinsics.areEqual(this.videoTimeSec, videoChapter.videoTimeSec) && Intrinsics.areEqual(this.videoNumber, videoChapter.videoNumber) && Intrinsics.areEqual(this.hasCategory, videoChapter.hasCategory) && Intrinsics.areEqual(this.revisionText, videoChapter.revisionText) && Intrinsics.areEqual(this.revisionStartDate, videoChapter.revisionStartDate) && Intrinsics.areEqual(this.revisionEndDate, videoChapter.revisionEndDate) && Intrinsics.areEqual(this.videoIds, videoChapter.videoIds) && Intrinsics.areEqual(this.categories, videoChapter.categories) && Intrinsics.areEqual(this.pdfFiles, videoChapter.pdfFiles);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.chapterId) * 31) + Integer.hashCode(this.courseId)) * 31;
        String str = this.chaptersTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.displayOrder;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.videoTimeSec;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.videoNumber;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.hasCategory;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.revisionText;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Date date = this.revisionStartDate;
        int iHashCode8 = (iHashCode7 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.revisionEndDate;
        int iHashCode9 = (iHashCode8 + (date2 == null ? 0 : date2.hashCode())) * 31;
        List<VideoSubItem> list = this.videoIds;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        List<VideoCategory> list2 = this.categories;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<VideoPDFFile> list3 = this.pdfFiles;
        return iHashCode11 + (list3 != null ? list3.hashCode() : 0);
    }

    public String toString() {
        return "VideoChapter(chapterId=" + this.chapterId + ", courseId=" + this.courseId + ", chaptersTitle=" + this.chaptersTitle + ", displayOrder=" + this.displayOrder + ", videoTimeSec=" + this.videoTimeSec + ", videoNumber=" + this.videoNumber + ", hasCategory=" + this.hasCategory + ", revisionText=" + this.revisionText + ", revisionStartDate=" + this.revisionStartDate + ", revisionEndDate=" + this.revisionEndDate + ", videoIds=" + this.videoIds + ", categories=" + this.categories + ", pdfFiles=" + this.pdfFiles + ")";
    }

    public /* synthetic */ VideoChapter(int i, int i2, String str, Integer num, Integer num2, Integer num3, Boolean bool, String str2, Date date, Date date2, List list, List list2, List list3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : num2, (i3 & 32) != 0 ? null : num3, (i3 & 64) != 0 ? null : bool, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? null : date, (i3 & 512) != 0 ? null : date2, (i3 & 1024) != 0 ? null : list, (i3 & 2048) != 0 ? null : list2, (i3 & 4096) != 0 ? null : list3);
    }

    public final int getChapterId() {
        return this.chapterId;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final String getChaptersTitle() {
        return this.chaptersTitle;
    }

    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public final Integer getVideoTimeSec() {
        return this.videoTimeSec;
    }

    public final Integer getVideoNumber() {
        return this.videoNumber;
    }

    public final Boolean getHasCategory() {
        return this.hasCategory;
    }

    public final String getRevisionText() {
        return this.revisionText;
    }

    public final Date getRevisionStartDate() {
        return this.revisionStartDate;
    }

    public final Date getRevisionEndDate() {
        return this.revisionEndDate;
    }

    public final List<VideoSubItem> getVideoIds() {
        return this.videoIds;
    }

    public final List<VideoCategory> getCategories() {
        return this.categories;
    }

    public final List<VideoPDFFile> getPdfFiles() {
        return this.pdfFiles;
    }

    public VideoChapter(int i, int i2, String str, Integer num, Integer num2, Integer num3, Boolean bool, String str2, Date date, Date date2, List<VideoSubItem> list, List<VideoCategory> list2, List<VideoPDFFile> list3) {
        super(ContentsItemLevel.CHAPTER.getValue());
        this.chapterId = i;
        this.courseId = i2;
        this.chaptersTitle = str;
        this.displayOrder = num;
        this.videoTimeSec = num2;
        this.videoNumber = num3;
        this.hasCategory = bool;
        this.revisionText = str2;
        this.revisionStartDate = date;
        this.revisionEndDate = date2;
        this.videoIds = list;
        this.categories = list2;
        this.pdfFiles = list3;
    }

    public final VideoSubItem getFirstVideoItem() {
        Object next;
        List<VideoSubItem> videoIds;
        List<VideoCategory> list = this.categories;
        Object next2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Integer displayOrder = ((VideoCategory) next).getDisplayOrder();
                int iIntValue = displayOrder != null ? displayOrder.intValue() : Integer.MAX_VALUE;
                do {
                    Object next3 = it.next();
                    Integer displayOrder2 = ((VideoCategory) next3).getDisplayOrder();
                    int iIntValue2 = displayOrder2 != null ? displayOrder2.intValue() : Integer.MAX_VALUE;
                    if (iIntValue > iIntValue2) {
                        next = next3;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        VideoCategory videoCategory = (VideoCategory) next;
        if (videoCategory == null || (videoIds = videoCategory.getVideoIds()) == null) {
            return null;
        }
        Iterator<T> it2 = videoIds.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int displayOrder3 = ((VideoSubItem) next2).getDisplayOrder();
                do {
                    Object next4 = it2.next();
                    int displayOrder4 = ((VideoSubItem) next4).getDisplayOrder();
                    if (displayOrder3 > displayOrder4) {
                        next2 = next4;
                        displayOrder3 = displayOrder4;
                    }
                } while (it2.hasNext());
            }
        }
        return (VideoSubItem) next2;
    }

    public final String getDisplayPlayTime() {
        Integer num = this.videoTimeSec;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.JAPAN, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf((iIntValue / 3600) % 24), Integer.valueOf((iIntValue / 60) % 60), Integer.valueOf(iIntValue % 60)}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoChapter copy$default(VideoChapter videoChapter, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        return videoChapter.copy(list, list2);
    }

    public final VideoChapter copy(List<VideoSubItem> videoIds, List<VideoCategory> categories) {
        int i = this.chapterId;
        int i2 = this.courseId;
        String str = this.chaptersTitle;
        Integer num = this.displayOrder;
        Integer num2 = this.videoTimeSec;
        Integer num3 = this.videoNumber;
        Boolean bool = this.hasCategory;
        String str2 = this.revisionText;
        Date date = this.revisionStartDate;
        Date date2 = this.revisionEndDate;
        if (videoIds == null) {
            videoIds = this.videoIds;
        }
        return new VideoChapter(i, i2, str, num, num2, num3, bool, str2, date, date2, videoIds, categories == null ? this.categories : categories, this.pdfFiles);
    }

    public final VideoSubItem findSubVideo(int courseVideoId) {
        Object obj = null;
        if (!Intrinsics.areEqual((Object) this.hasCategory, (Object) true)) {
            List<VideoSubItem> list = this.videoIds;
            if (list == null) {
                return null;
            }
            for (Object obj2 : list) {
                Integer courseVideoId2 = ((VideoSubItem) obj2).getCourseVideoId();
                if (courseVideoId2 != null && courseVideoId2.intValue() == courseVideoId) {
                    obj = obj2;
                    break;
                }
            }
            return (VideoSubItem) obj;
        }
        List<VideoCategory> list2 = this.categories;
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            List<VideoSubItem> videoIds = ((VideoCategory) it.next()).getVideoIds();
            if (videoIds != null) {
                arrayList.add(videoIds);
            }
        }
        List listFlatten = CollectionsKt.flatten(arrayList);
        if (listFlatten == null) {
            return null;
        }
        for (Object obj3 : listFlatten) {
            Integer courseVideoId3 = ((VideoSubItem) obj3).getCourseVideoId();
            if (courseVideoId3 != null && courseVideoId3.intValue() == courseVideoId) {
                obj = obj3;
                break;
            }
        }
        return (VideoSubItem) obj;
    }
}
