package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OfflineViewArgItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006 "}, d2 = {"Lcom/medicmedia/medilink/domain/model/OfflineViewArgItem;", "", "url", "", "contentsId", "index", "", "toLink", "isReviewFirst", "", SearchIntents.EXTRA_QUERY, "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getContentsId", "getIndex", "()I", "getToLink", "()Z", "getQuery", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class OfflineViewArgItem {
    private final String contentsId;
    private final int index;
    private final boolean isReviewFirst;
    private final String query;
    private final String toLink;
    private final String url;

    public static /* synthetic */ OfflineViewArgItem copy$default(OfflineViewArgItem offlineViewArgItem, String str, String str2, int i, String str3, boolean z, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = offlineViewArgItem.url;
        }
        if ((i2 & 2) != 0) {
            str2 = offlineViewArgItem.contentsId;
        }
        if ((i2 & 4) != 0) {
            i = offlineViewArgItem.index;
        }
        if ((i2 & 8) != 0) {
            str3 = offlineViewArgItem.toLink;
        }
        if ((i2 & 16) != 0) {
            z = offlineViewArgItem.isReviewFirst;
        }
        if ((i2 & 32) != 0) {
            str4 = offlineViewArgItem.query;
        }
        boolean z2 = z;
        String str5 = str4;
        return offlineViewArgItem.copy(str, str2, i, str3, z2, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getToLink() {
        return this.toLink;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsReviewFirst() {
        return this.isReviewFirst;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final OfflineViewArgItem copy(String url, String contentsId, int index, String toLink, boolean isReviewFirst, String query) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(toLink, "toLink");
        Intrinsics.checkNotNullParameter(query, "query");
        return new OfflineViewArgItem(url, contentsId, index, toLink, isReviewFirst, query);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineViewArgItem)) {
            return false;
        }
        OfflineViewArgItem offlineViewArgItem = (OfflineViewArgItem) other;
        return Intrinsics.areEqual(this.url, offlineViewArgItem.url) && Intrinsics.areEqual(this.contentsId, offlineViewArgItem.contentsId) && this.index == offlineViewArgItem.index && Intrinsics.areEqual(this.toLink, offlineViewArgItem.toLink) && this.isReviewFirst == offlineViewArgItem.isReviewFirst && Intrinsics.areEqual(this.query, offlineViewArgItem.query);
    }

    public int hashCode() {
        return (((((((((this.url.hashCode() * 31) + this.contentsId.hashCode()) * 31) + Integer.hashCode(this.index)) * 31) + this.toLink.hashCode()) * 31) + Boolean.hashCode(this.isReviewFirst)) * 31) + this.query.hashCode();
    }

    public String toString() {
        return "OfflineViewArgItem(url=" + this.url + ", contentsId=" + this.contentsId + ", index=" + this.index + ", toLink=" + this.toLink + ", isReviewFirst=" + this.isReviewFirst + ", query=" + this.query + ")";
    }

    public OfflineViewArgItem(String url, String contentsId, int i, String toLink, boolean z, String query) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(toLink, "toLink");
        Intrinsics.checkNotNullParameter(query, "query");
        this.url = url;
        this.contentsId = contentsId;
        this.index = i;
        this.toLink = toLink;
        this.isReviewFirst = z;
        this.query = query;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getToLink() {
        return this.toLink;
    }

    public final boolean isReviewFirst() {
        return this.isReviewFirst;
    }

    public /* synthetic */ OfflineViewArgItem(String str, String str2, int i, String str3, boolean z, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, z, (i2 & 32) != 0 ? "" : str4);
    }

    public final String getQuery() {
        return this.query;
    }
}
