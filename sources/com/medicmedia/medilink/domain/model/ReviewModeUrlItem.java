package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsUrlItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ReviewModeUrlItem;", "", "noteId", "", "url", "isLongClick", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getNoteId", "()Ljava/lang/String;", "getUrl", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ReviewModeUrlItem {
    private final boolean isLongClick;
    private final String noteId;
    private final String url;

    public static /* synthetic */ ReviewModeUrlItem copy$default(ReviewModeUrlItem reviewModeUrlItem, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reviewModeUrlItem.noteId;
        }
        if ((i & 2) != 0) {
            str2 = reviewModeUrlItem.url;
        }
        if ((i & 4) != 0) {
            z = reviewModeUrlItem.isLongClick;
        }
        return reviewModeUrlItem.copy(str, str2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNoteId() {
        return this.noteId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsLongClick() {
        return this.isLongClick;
    }

    public final ReviewModeUrlItem copy(String noteId, String url, boolean isLongClick) {
        Intrinsics.checkNotNullParameter(noteId, "noteId");
        Intrinsics.checkNotNullParameter(url, "url");
        return new ReviewModeUrlItem(noteId, url, isLongClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewModeUrlItem)) {
            return false;
        }
        ReviewModeUrlItem reviewModeUrlItem = (ReviewModeUrlItem) other;
        return Intrinsics.areEqual(this.noteId, reviewModeUrlItem.noteId) && Intrinsics.areEqual(this.url, reviewModeUrlItem.url) && this.isLongClick == reviewModeUrlItem.isLongClick;
    }

    public int hashCode() {
        return (((this.noteId.hashCode() * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.isLongClick);
    }

    public String toString() {
        return "ReviewModeUrlItem(noteId=" + this.noteId + ", url=" + this.url + ", isLongClick=" + this.isLongClick + ")";
    }

    public ReviewModeUrlItem(String noteId, String url, boolean z) {
        Intrinsics.checkNotNullParameter(noteId, "noteId");
        Intrinsics.checkNotNullParameter(url, "url");
        this.noteId = noteId;
        this.url = url;
        this.isLongClick = z;
    }

    public final String getNoteId() {
        return this.noteId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isLongClick() {
        return this.isLongClick;
    }
}
