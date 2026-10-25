package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import com.medicmedia.medilink.domain.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StartContentsDetailItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006&"}, d2 = {"Lcom/medicmedia/medilink/domain/model/StartContentsDetailItem;", "", "contentsId", "", "url", BundleKey.THUMBNAIL, "index", "", BundleKey.TAG_ID, "isMemo", "", "noteDataId", SearchIntents.EXTRA_QUERY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getUrl", "getThumbnail", "getIndex", "()I", "getTagId", "()Z", "getNoteDataId", "getQuery", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class StartContentsDetailItem {
    private final String contentsId;
    private final int index;
    private final boolean isMemo;
    private final String noteDataId;
    private final String query;
    private final String tagId;
    private final String thumbnail;
    private final String url;

    public static /* synthetic */ StartContentsDetailItem copy$default(StartContentsDetailItem startContentsDetailItem, String str, String str2, String str3, int i, String str4, boolean z, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = startContentsDetailItem.contentsId;
        }
        if ((i2 & 2) != 0) {
            str2 = startContentsDetailItem.url;
        }
        if ((i2 & 4) != 0) {
            str3 = startContentsDetailItem.thumbnail;
        }
        if ((i2 & 8) != 0) {
            i = startContentsDetailItem.index;
        }
        if ((i2 & 16) != 0) {
            str4 = startContentsDetailItem.tagId;
        }
        if ((i2 & 32) != 0) {
            z = startContentsDetailItem.isMemo;
        }
        if ((i2 & 64) != 0) {
            str5 = startContentsDetailItem.noteDataId;
        }
        if ((i2 & 128) != 0) {
            str6 = startContentsDetailItem.query;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        boolean z2 = z;
        return startContentsDetailItem.copy(str, str2, str3, i, str9, z2, str7, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsMemo() {
        return this.isMemo;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNoteDataId() {
        return this.noteDataId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final StartContentsDetailItem copy(String contentsId, String url, String thumbnail, int index, String tagId, boolean isMemo, String noteDataId, String query) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        return new StartContentsDetailItem(contentsId, url, thumbnail, index, tagId, isMemo, noteDataId, query);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartContentsDetailItem)) {
            return false;
        }
        StartContentsDetailItem startContentsDetailItem = (StartContentsDetailItem) other;
        return Intrinsics.areEqual(this.contentsId, startContentsDetailItem.contentsId) && Intrinsics.areEqual(this.url, startContentsDetailItem.url) && Intrinsics.areEqual(this.thumbnail, startContentsDetailItem.thumbnail) && this.index == startContentsDetailItem.index && Intrinsics.areEqual(this.tagId, startContentsDetailItem.tagId) && this.isMemo == startContentsDetailItem.isMemo && Intrinsics.areEqual(this.noteDataId, startContentsDetailItem.noteDataId) && Intrinsics.areEqual(this.query, startContentsDetailItem.query);
    }

    public int hashCode() {
        int iHashCode = ((((((this.contentsId.hashCode() * 31) + this.url.hashCode()) * 31) + this.thumbnail.hashCode()) * 31) + Integer.hashCode(this.index)) * 31;
        String str = this.tagId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isMemo)) * 31;
        String str2 = this.noteDataId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.query;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "StartContentsDetailItem(contentsId=" + this.contentsId + ", url=" + this.url + ", thumbnail=" + this.thumbnail + ", index=" + this.index + ", tagId=" + this.tagId + ", isMemo=" + this.isMemo + ", noteDataId=" + this.noteDataId + ", query=" + this.query + ")";
    }

    public StartContentsDetailItem(String contentsId, String url, String thumbnail, int i, String str, boolean z, String str2, String str3) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
        this.contentsId = contentsId;
        this.url = url;
        this.thumbnail = thumbnail;
        this.index = i;
        this.tagId = str;
        this.isMemo = z;
        this.noteDataId = str2;
        this.query = str3;
    }

    public /* synthetic */ StartContentsDetailItem(String str, String str2, String str3, int i, String str4, boolean z, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6);
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getTagId() {
        return this.tagId;
    }

    public final boolean isMemo() {
        return this.isMemo;
    }

    public final String getNoteDataId() {
        return this.noteDataId;
    }

    public final String getQuery() {
        return this.query;
    }
}
