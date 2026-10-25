package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u0003H×\u0001J\t\u0010\u001c\u001a\u00020\u0006H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoListCategoryRowItem;", "", "totalCount", "", "viewedCount", "lastViewDate", "", "bgColor", "textColor", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTotalCount", "()I", "getViewedCount", "getLastViewDate", "()Ljava/lang/String;", "getBgColor", "getTextColor", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoListCategoryRowItem {
    public static final int $stable = 0;
    private final String bgColor;
    private final String lastViewDate;
    private final String textColor;
    private final int totalCount;
    private final int viewedCount;

    public static /* synthetic */ VideoListCategoryRowItem copy$default(VideoListCategoryRowItem videoListCategoryRowItem, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = videoListCategoryRowItem.totalCount;
        }
        if ((i3 & 2) != 0) {
            i2 = videoListCategoryRowItem.viewedCount;
        }
        if ((i3 & 4) != 0) {
            str = videoListCategoryRowItem.lastViewDate;
        }
        if ((i3 & 8) != 0) {
            str2 = videoListCategoryRowItem.bgColor;
        }
        if ((i3 & 16) != 0) {
            str3 = videoListCategoryRowItem.textColor;
        }
        String str4 = str3;
        String str5 = str;
        return videoListCategoryRowItem.copy(i, i2, str5, str2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getViewedCount() {
        return this.viewedCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastViewDate() {
        return this.lastViewDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTextColor() {
        return this.textColor;
    }

    public final VideoListCategoryRowItem copy(int totalCount, int viewedCount, String lastViewDate, String bgColor, String textColor) {
        return new VideoListCategoryRowItem(totalCount, viewedCount, lastViewDate, bgColor, textColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoListCategoryRowItem)) {
            return false;
        }
        VideoListCategoryRowItem videoListCategoryRowItem = (VideoListCategoryRowItem) other;
        return this.totalCount == videoListCategoryRowItem.totalCount && this.viewedCount == videoListCategoryRowItem.viewedCount && Intrinsics.areEqual(this.lastViewDate, videoListCategoryRowItem.lastViewDate) && Intrinsics.areEqual(this.bgColor, videoListCategoryRowItem.bgColor) && Intrinsics.areEqual(this.textColor, videoListCategoryRowItem.textColor);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.totalCount) * 31) + Integer.hashCode(this.viewedCount)) * 31;
        String str = this.lastViewDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bgColor;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textColor;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "VideoListCategoryRowItem(totalCount=" + this.totalCount + ", viewedCount=" + this.viewedCount + ", lastViewDate=" + this.lastViewDate + ", bgColor=" + this.bgColor + ", textColor=" + this.textColor + ")";
    }

    public VideoListCategoryRowItem(int i, int i2, String str, String str2, String str3) {
        this.totalCount = i;
        this.viewedCount = i2;
        this.lastViewDate = str;
        this.bgColor = str2;
        this.textColor = str3;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final int getViewedCount() {
        return this.viewedCount;
    }

    public final String getLastViewDate() {
        return this.lastViewDate;
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getTextColor() {
        return this.textColor;
    }
}
