package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsUrlItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentsUrlItem;", "", "contentsId", "", BundleKey.TAG_ID, HistoryRepositoryImpl.FieldName.TITLE, "fileName", "searchQuery", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "getTagId", "getTitle", "getFileName", "getSearchQuery", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsUrlItem {
    private final String contentsId;
    private final String fileName;
    private final String searchQuery;
    private final String tagId;
    private final String title;

    public ContentsUrlItem() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ContentsUrlItem copy$default(ContentsUrlItem contentsUrlItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentsUrlItem.contentsId;
        }
        if ((i & 2) != 0) {
            str2 = contentsUrlItem.tagId;
        }
        if ((i & 4) != 0) {
            str3 = contentsUrlItem.title;
        }
        if ((i & 8) != 0) {
            str4 = contentsUrlItem.fileName;
        }
        if ((i & 16) != 0) {
            str5 = contentsUrlItem.searchQuery;
        }
        String str6 = str5;
        String str7 = str3;
        return contentsUrlItem.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTagId() {
        return this.tagId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSearchQuery() {
        return this.searchQuery;
    }

    public final ContentsUrlItem copy(String contentsId, String tagId, String title, String fileName, String searchQuery) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new ContentsUrlItem(contentsId, tagId, title, fileName, searchQuery);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentsUrlItem)) {
            return false;
        }
        ContentsUrlItem contentsUrlItem = (ContentsUrlItem) other;
        return Intrinsics.areEqual(this.contentsId, contentsUrlItem.contentsId) && Intrinsics.areEqual(this.tagId, contentsUrlItem.tagId) && Intrinsics.areEqual(this.title, contentsUrlItem.title) && Intrinsics.areEqual(this.fileName, contentsUrlItem.fileName) && Intrinsics.areEqual(this.searchQuery, contentsUrlItem.searchQuery);
    }

    public int hashCode() {
        int iHashCode = ((((((this.contentsId.hashCode() * 31) + this.tagId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.fileName.hashCode()) * 31;
        String str = this.searchQuery;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ContentsUrlItem(contentsId=" + this.contentsId + ", tagId=" + this.tagId + ", title=" + this.title + ", fileName=" + this.fileName + ", searchQuery=" + this.searchQuery + ")";
    }

    public ContentsUrlItem(String contentsId, String tagId, String title, String fileName, String str) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(tagId, "tagId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.contentsId = contentsId;
        this.tagId = tagId;
        this.title = title;
        this.fileName = fileName;
        this.searchQuery = str;
    }

    public /* synthetic */ ContentsUrlItem(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : str5);
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final String getTagId() {
        return this.tagId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getSearchQuery() {
        return this.searchQuery;
    }
}
