package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.ConstKt;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VideoLicenseItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/domain/model/VideoLicenseItem;", "", "courseId", "", "userLimitTo", "Ljava/util/Date;", "available", "", "<init>", "(Ljava/lang/String;Ljava/util/Date;Z)V", "getCourseId", "()Ljava/lang/String;", "getUserLimitTo", "()Ljava/util/Date;", "getAvailable", "()Z", "isNotMaxDate", "limitDate", "getLimitDate", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VideoLicenseItem {
    private final boolean available;
    private final String courseId;
    private final Date userLimitTo;

    public static /* synthetic */ VideoLicenseItem copy$default(VideoLicenseItem videoLicenseItem, String str, Date date, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoLicenseItem.courseId;
        }
        if ((i & 2) != 0) {
            date = videoLicenseItem.userLimitTo;
        }
        if ((i & 4) != 0) {
            z = videoLicenseItem.available;
        }
        return videoLicenseItem.copy(str, date, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Date getUserLimitTo() {
        return this.userLimitTo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    public final VideoLicenseItem copy(String courseId, Date userLimitTo, boolean available) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        return new VideoLicenseItem(courseId, userLimitTo, available);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoLicenseItem)) {
            return false;
        }
        VideoLicenseItem videoLicenseItem = (VideoLicenseItem) other;
        return Intrinsics.areEqual(this.courseId, videoLicenseItem.courseId) && Intrinsics.areEqual(this.userLimitTo, videoLicenseItem.userLimitTo) && this.available == videoLicenseItem.available;
    }

    public int hashCode() {
        int iHashCode = this.courseId.hashCode() * 31;
        Date date = this.userLimitTo;
        return ((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + Boolean.hashCode(this.available);
    }

    public String toString() {
        return "VideoLicenseItem(courseId=" + this.courseId + ", userLimitTo=" + this.userLimitTo + ", available=" + this.available + ")";
    }

    public VideoLicenseItem(String courseId, Date date, boolean z) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        this.courseId = courseId;
        this.userLimitTo = date;
        this.available = z;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final Date getUserLimitTo() {
        return this.userLimitTo;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    public final boolean isNotMaxDate() {
        Date date = this.userLimitTo;
        return (this.userLimitTo == null || Intrinsics.areEqual(date != null ? ConstKt.getDateFormatSlashYYYYMMDD().format(date) : null, ConstKt.movieLicenseMaxDate)) ? false : true;
    }

    public final String getLimitDate() {
        Date date = this.userLimitTo;
        if (date != null) {
            return ConstKt.getDateFormatYYYYMMDDJP().format(date);
        }
        return null;
    }
}
