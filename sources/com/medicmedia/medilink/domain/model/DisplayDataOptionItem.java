package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.QueryParameterKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QrContentsItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003JV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/medicmedia/medilink/domain/model/DisplayDataOptionItem;", "", "courseVideoId", "", "courseId", "chapterId", "subcategoryId", BundleKey.VIDEO_ID, "videoHashCode", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getCourseVideoId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCourseId", "getChapterId", "getSubcategoryId", "getVideoId", "getVideoHashCode", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/medicmedia/medilink/domain/model/DisplayDataOptionItem;", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DisplayDataOptionItem {

    @SerializedName("chapter_id")
    private final Integer chapterId;

    @SerializedName(BundleKey.COURSE_ID)
    private final Integer courseId;

    @SerializedName(QueryParameterKey.COURSE_VIDEO_ID)
    private final Integer courseVideoId;

    @SerializedName("subcategory_id")
    private final Integer subcategoryId;

    @SerializedName("hash_code")
    private final String videoHashCode;

    @SerializedName(AnalyticsEvent.Param.VIDEO_ID)
    private final Integer videoId;

    public static /* synthetic */ DisplayDataOptionItem copy$default(DisplayDataOptionItem displayDataOptionItem, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = displayDataOptionItem.courseVideoId;
        }
        if ((i & 2) != 0) {
            num2 = displayDataOptionItem.courseId;
        }
        if ((i & 4) != 0) {
            num3 = displayDataOptionItem.chapterId;
        }
        if ((i & 8) != 0) {
            num4 = displayDataOptionItem.subcategoryId;
        }
        if ((i & 16) != 0) {
            num5 = displayDataOptionItem.videoId;
        }
        if ((i & 32) != 0) {
            str = displayDataOptionItem.videoHashCode;
        }
        Integer num6 = num5;
        String str2 = str;
        return displayDataOptionItem.copy(num, num2, num3, num4, num6, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getCourseVideoId() {
        return this.courseVideoId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getChapterId() {
        return this.chapterId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSubcategoryId() {
        return this.subcategoryId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getVideoId() {
        return this.videoId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVideoHashCode() {
        return this.videoHashCode;
    }

    public final DisplayDataOptionItem copy(Integer courseVideoId, Integer courseId, Integer chapterId, Integer subcategoryId, Integer videoId, String videoHashCode) {
        return new DisplayDataOptionItem(courseVideoId, courseId, chapterId, subcategoryId, videoId, videoHashCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayDataOptionItem)) {
            return false;
        }
        DisplayDataOptionItem displayDataOptionItem = (DisplayDataOptionItem) other;
        return Intrinsics.areEqual(this.courseVideoId, displayDataOptionItem.courseVideoId) && Intrinsics.areEqual(this.courseId, displayDataOptionItem.courseId) && Intrinsics.areEqual(this.chapterId, displayDataOptionItem.chapterId) && Intrinsics.areEqual(this.subcategoryId, displayDataOptionItem.subcategoryId) && Intrinsics.areEqual(this.videoId, displayDataOptionItem.videoId) && Intrinsics.areEqual(this.videoHashCode, displayDataOptionItem.videoHashCode);
    }

    public int hashCode() {
        Integer num = this.courseVideoId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.courseId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.chapterId;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.subcategoryId;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.videoId;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str = this.videoHashCode;
        return iHashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "DisplayDataOptionItem(courseVideoId=" + this.courseVideoId + ", courseId=" + this.courseId + ", chapterId=" + this.chapterId + ", subcategoryId=" + this.subcategoryId + ", videoId=" + this.videoId + ", videoHashCode=" + this.videoHashCode + ")";
    }

    public DisplayDataOptionItem(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str) {
        this.courseVideoId = num;
        this.courseId = num2;
        this.chapterId = num3;
        this.subcategoryId = num4;
        this.videoId = num5;
        this.videoHashCode = str;
    }

    public final Integer getCourseVideoId() {
        return this.courseVideoId;
    }

    public final Integer getCourseId() {
        return this.courseId;
    }

    public final Integer getChapterId() {
        return this.chapterId;
    }

    public final Integer getSubcategoryId() {
        return this.subcategoryId;
    }

    public final Integer getVideoId() {
        return this.videoId;
    }

    public final String getVideoHashCode() {
        return this.videoHashCode;
    }
}
