package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchItemArguments.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/medicmedia/medilink/domain/model/SearchItemArguments;", "", "contentId", "", "contentsTitle", "courseTitle", "chapterTitle", BundleKey.THUMBNAIL, "index", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getContentId", "()Ljava/lang/String;", "getContentsTitle", "getCourseTitle", "getChapterTitle", "getThumbnail", "getIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SearchItemArguments {
    private final String chapterTitle;
    private final String contentId;
    private final String contentsTitle;
    private final String courseTitle;
    private final int index;
    private final String thumbnail;

    public static /* synthetic */ SearchItemArguments copy$default(SearchItemArguments searchItemArguments, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = searchItemArguments.contentId;
        }
        if ((i2 & 2) != 0) {
            str2 = searchItemArguments.contentsTitle;
        }
        if ((i2 & 4) != 0) {
            str3 = searchItemArguments.courseTitle;
        }
        if ((i2 & 8) != 0) {
            str4 = searchItemArguments.chapterTitle;
        }
        if ((i2 & 16) != 0) {
            str5 = searchItemArguments.thumbnail;
        }
        if ((i2 & 32) != 0) {
            i = searchItemArguments.index;
        }
        String str6 = str5;
        int i3 = i;
        return searchItemArguments.copy(str, str2, str3, str4, str6, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentsTitle() {
        return this.contentsTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCourseTitle() {
        return this.courseTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChapterTitle() {
        return this.chapterTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final SearchItemArguments copy(String contentId, String contentsTitle, String courseTitle, String chapterTitle, String thumbnail, int index) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(contentsTitle, "contentsTitle");
        Intrinsics.checkNotNullParameter(courseTitle, "courseTitle");
        Intrinsics.checkNotNullParameter(chapterTitle, "chapterTitle");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        return new SearchItemArguments(contentId, contentsTitle, courseTitle, chapterTitle, thumbnail, index);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchItemArguments)) {
            return false;
        }
        SearchItemArguments searchItemArguments = (SearchItemArguments) other;
        return Intrinsics.areEqual(this.contentId, searchItemArguments.contentId) && Intrinsics.areEqual(this.contentsTitle, searchItemArguments.contentsTitle) && Intrinsics.areEqual(this.courseTitle, searchItemArguments.courseTitle) && Intrinsics.areEqual(this.chapterTitle, searchItemArguments.chapterTitle) && Intrinsics.areEqual(this.thumbnail, searchItemArguments.thumbnail) && this.index == searchItemArguments.index;
    }

    public int hashCode() {
        return (((((((((this.contentId.hashCode() * 31) + this.contentsTitle.hashCode()) * 31) + this.courseTitle.hashCode()) * 31) + this.chapterTitle.hashCode()) * 31) + this.thumbnail.hashCode()) * 31) + Integer.hashCode(this.index);
    }

    public String toString() {
        return "SearchItemArguments(contentId=" + this.contentId + ", contentsTitle=" + this.contentsTitle + ", courseTitle=" + this.courseTitle + ", chapterTitle=" + this.chapterTitle + ", thumbnail=" + this.thumbnail + ", index=" + this.index + ")";
    }

    public SearchItemArguments(String contentId, String contentsTitle, String courseTitle, String chapterTitle, String thumbnail, int i) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(contentsTitle, "contentsTitle");
        Intrinsics.checkNotNullParameter(courseTitle, "courseTitle");
        Intrinsics.checkNotNullParameter(chapterTitle, "chapterTitle");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        this.contentId = contentId;
        this.contentsTitle = contentsTitle;
        this.courseTitle = courseTitle;
        this.chapterTitle = chapterTitle;
        this.thumbnail = thumbnail;
        this.index = i;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getContentsTitle() {
        return this.contentsTitle;
    }

    public final String getCourseTitle() {
        return this.courseTitle;
    }

    public final String getChapterTitle() {
        return this.chapterTitle;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final int getIndex() {
        return this.index;
    }
}
