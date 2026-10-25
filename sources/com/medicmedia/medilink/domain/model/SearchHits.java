package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.OtherCode;
import com.medicmedia.medilink.domain.VideoCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchResultItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001HBq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u000fHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0087\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010C\u001a\u00020\u000f2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\u0015R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0015R\u0013\u0010'\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010+\u001a\u0004\u0018\u00010(8F¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0011\u0010-\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b-\u0010 R\u0011\u0010.\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010 R\u0011\u0010/\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b/\u0010 R\u0011\u00100\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b0\u0010 R\u0011\u00101\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b2\u0010 R\u0011\u00103\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b4\u0010 ¨\u0006I"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SearchHits;", "", "record", "", "contentsCode", "bookName", "fileName", HistoryRepositoryImpl.FieldName.TITLE, "refBody", "refId", FirebaseAnalytics.Param.LEVEL, "highlight", "Lcom/medicmedia/medilink/domain/model/SearchHighlight;", "page", "isImageSearch", "", "contentsInfo", "Lcom/medicmedia/medilink/domain/model/SearchHits$ContentsInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/medicmedia/medilink/domain/model/SearchHighlight;Ljava/lang/String;ZLcom/medicmedia/medilink/domain/model/SearchHits$ContentsInfo;)V", "getRecord", "()Ljava/lang/String;", "getContentsCode", "getBookName", "getFileName", "getTitle", "getRefBody", "getRefId", "getLevel", "getHighlight", "()Lcom/medicmedia/medilink/domain/model/SearchHighlight;", "getPage", "()Z", "getContentsInfo", "()Lcom/medicmedia/medilink/domain/model/SearchHits$ContentsInfo;", "displayTitle", "getDisplayTitle", "displayBody", "getDisplayBody", "searchLabel", "Lcom/medicmedia/medilink/domain/model/SearchLabelType;", "getSearchLabel", "()Lcom/medicmedia/medilink/domain/model/SearchLabelType;", "imageLabel", "getImageLabel", "isDownloaded", "isVideoContent", "isEnableImageSearch", "isQuickReference", "showNotPurchase", "getShowNotPurchase", "showDownloadIcon", "getShowDownloadIcon", "copyItem", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "", "toString", "ContentsInfo", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SearchHits {
    private final String bookName;
    private final String contentsCode;
    private final ContentsInfo contentsInfo;
    private final String fileName;
    private final SearchHighlight highlight;
    private final boolean isImageSearch;
    private final String level;
    private final String page;
    private final String record;
    private final String refBody;
    private final String refId;
    private final String title;

    public static /* synthetic */ SearchHits copy$default(SearchHits searchHits, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SearchHighlight searchHighlight, String str9, boolean z, ContentsInfo contentsInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchHits.record;
        }
        if ((i & 2) != 0) {
            str2 = searchHits.contentsCode;
        }
        if ((i & 4) != 0) {
            str3 = searchHits.bookName;
        }
        if ((i & 8) != 0) {
            str4 = searchHits.fileName;
        }
        if ((i & 16) != 0) {
            str5 = searchHits.title;
        }
        if ((i & 32) != 0) {
            str6 = searchHits.refBody;
        }
        if ((i & 64) != 0) {
            str7 = searchHits.refId;
        }
        if ((i & 128) != 0) {
            str8 = searchHits.level;
        }
        if ((i & 256) != 0) {
            searchHighlight = searchHits.highlight;
        }
        if ((i & 512) != 0) {
            str9 = searchHits.page;
        }
        if ((i & 1024) != 0) {
            z = searchHits.isImageSearch;
        }
        if ((i & 2048) != 0) {
            contentsInfo = searchHits.contentsInfo;
        }
        boolean z2 = z;
        ContentsInfo contentsInfo2 = contentsInfo;
        SearchHighlight searchHighlight2 = searchHighlight;
        String str10 = str9;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        return searchHits.copy(str, str2, str3, str4, str13, str14, str11, str12, searchHighlight2, str10, z2, contentsInfo2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRecord() {
        return this.record;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPage() {
        return this.page;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsImageSearch() {
        return this.isImageSearch;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ContentsInfo getContentsInfo() {
        return this.contentsInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentsCode() {
        return this.contentsCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBookName() {
        return this.bookName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRefBody() {
        return this.refBody;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRefId() {
        return this.refId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SearchHighlight getHighlight() {
        return this.highlight;
    }

    public final SearchHits copy(String record, String contentsCode, String bookName, String fileName, String title, String refBody, String refId, String level, SearchHighlight highlight, String page, boolean isImageSearch, ContentsInfo contentsInfo) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(contentsCode, "contentsCode");
        Intrinsics.checkNotNullParameter(bookName, "bookName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(refBody, "refBody");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        return new SearchHits(record, contentsCode, bookName, fileName, title, refBody, refId, level, highlight, page, isImageSearch, contentsInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHits)) {
            return false;
        }
        SearchHits searchHits = (SearchHits) other;
        return Intrinsics.areEqual(this.record, searchHits.record) && Intrinsics.areEqual(this.contentsCode, searchHits.contentsCode) && Intrinsics.areEqual(this.bookName, searchHits.bookName) && Intrinsics.areEqual(this.fileName, searchHits.fileName) && Intrinsics.areEqual(this.title, searchHits.title) && Intrinsics.areEqual(this.refBody, searchHits.refBody) && Intrinsics.areEqual(this.refId, searchHits.refId) && Intrinsics.areEqual(this.level, searchHits.level) && Intrinsics.areEqual(this.highlight, searchHits.highlight) && Intrinsics.areEqual(this.page, searchHits.page) && this.isImageSearch == searchHits.isImageSearch && Intrinsics.areEqual(this.contentsInfo, searchHits.contentsInfo);
    }

    public int hashCode() {
        int iHashCode = ((((this.record.hashCode() * 31) + this.contentsCode.hashCode()) * 31) + this.bookName.hashCode()) * 31;
        String str = this.fileName;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + this.refBody.hashCode()) * 31) + this.refId.hashCode()) * 31) + this.level.hashCode()) * 31) + this.highlight.hashCode()) * 31;
        String str2 = this.page;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isImageSearch)) * 31;
        ContentsInfo contentsInfo = this.contentsInfo;
        return iHashCode3 + (contentsInfo != null ? contentsInfo.hashCode() : 0);
    }

    public String toString() {
        return "SearchHits(record=" + this.record + ", contentsCode=" + this.contentsCode + ", bookName=" + this.bookName + ", fileName=" + this.fileName + ", title=" + this.title + ", refBody=" + this.refBody + ", refId=" + this.refId + ", level=" + this.level + ", highlight=" + this.highlight + ", page=" + this.page + ", isImageSearch=" + this.isImageSearch + ", contentsInfo=" + this.contentsInfo + ")";
    }

    public SearchHits(String record, String contentsCode, String bookName, String str, String title, String refBody, String refId, String level, SearchHighlight highlight, String str2, boolean z, ContentsInfo contentsInfo) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(contentsCode, "contentsCode");
        Intrinsics.checkNotNullParameter(bookName, "bookName");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(refBody, "refBody");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(highlight, "highlight");
        this.record = record;
        this.contentsCode = contentsCode;
        this.bookName = bookName;
        this.fileName = str;
        this.title = title;
        this.refBody = refBody;
        this.refId = refId;
        this.level = level;
        this.highlight = highlight;
        this.page = str2;
        this.isImageSearch = z;
        this.contentsInfo = contentsInfo;
    }

    public /* synthetic */ SearchHits(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, SearchHighlight searchHighlight, String str9, boolean z, ContentsInfo contentsInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, searchHighlight, str9, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : contentsInfo);
    }

    public final String getRecord() {
        return this.record;
    }

    public final String getContentsCode() {
        return this.contentsCode;
    }

    public final String getBookName() {
        return this.bookName;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getRefBody() {
        return this.refBody;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final String getLevel() {
        return this.level;
    }

    public final SearchHighlight getHighlight() {
        return this.highlight;
    }

    public final String getPage() {
        return this.page;
    }

    public final boolean isImageSearch() {
        return this.isImageSearch;
    }

    public final ContentsInfo getContentsInfo() {
        return this.contentsInfo;
    }

    public final String getDisplayTitle() {
        String str = (String) CollectionsKt.firstOrNull((List) this.highlight.getTitle());
        return str == null ? this.title : str;
    }

    public final String getDisplayBody() {
        String str = (String) CollectionsKt.firstOrNull((List) this.highlight.getRefBody());
        return str == null ? this.refBody : str;
    }

    public final SearchLabelType getSearchLabel() {
        if (isVideoContent()) {
            return null;
        }
        return SearchLabelType.INSTANCE.find(this.record);
    }

    public final SearchLabelType getImageLabel() {
        if (this.isImageSearch) {
            return SearchLabelType.IMAGE;
        }
        return null;
    }

    public final boolean isDownloaded() {
        ContentsInfo contentsInfo = this.contentsInfo;
        return contentsInfo != null && contentsInfo.isDownloaded();
    }

    public final boolean isVideoContent() {
        return VideoCode.INSTANCE.contains(this.contentsCode);
    }

    public final boolean isEnableImageSearch() {
        if (this.refId.length() > 8) {
            return this.refId.charAt(8) == 'G' || this.refId.charAt(8) == 'H';
        }
        return false;
    }

    public final boolean isQuickReference() {
        return Intrinsics.areEqual(this.contentsCode, OtherCode.QUICK_REFERENCE.getValue());
    }

    public final boolean getShowNotPurchase() {
        ContentsInfo contentsInfo = this.contentsInfo;
        boolean z = false;
        if (contentsInfo != null && contentsInfo.isPurchased()) {
            z = true;
        }
        return !z;
    }

    public final boolean getShowDownloadIcon() {
        return (isDownloaded() || isVideoContent() || getShowNotPurchase()) ? false : true;
    }

    /* JADX INFO: compiled from: SearchResultItems.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003JY\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013¨\u0006!"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SearchHits$ContentsInfo;", "", "thumbnailUrl", "", "previewImageUrl", "category", "titleCode", "storeUrl", "isPurchased", "", "isDownloaded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getThumbnailUrl", "()Ljava/lang/String;", "getPreviewImageUrl", "getCategory", "getTitleCode", "getStoreUrl", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ContentsInfo {
        private final String category;
        private final boolean isDownloaded;
        private final boolean isPurchased;
        private final String previewImageUrl;
        private final String storeUrl;
        private final String thumbnailUrl;
        private final String titleCode;

        public ContentsInfo() {
            this(null, null, null, null, null, false, false, 127, null);
        }

        public static /* synthetic */ ContentsInfo copy$default(ContentsInfo contentsInfo, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contentsInfo.thumbnailUrl;
            }
            if ((i & 2) != 0) {
                str2 = contentsInfo.previewImageUrl;
            }
            if ((i & 4) != 0) {
                str3 = contentsInfo.category;
            }
            if ((i & 8) != 0) {
                str4 = contentsInfo.titleCode;
            }
            if ((i & 16) != 0) {
                str5 = contentsInfo.storeUrl;
            }
            if ((i & 32) != 0) {
                z = contentsInfo.isPurchased;
            }
            if ((i & 64) != 0) {
                z2 = contentsInfo.isDownloaded;
            }
            boolean z3 = z;
            boolean z4 = z2;
            String str6 = str5;
            String str7 = str3;
            return contentsInfo.copy(str, str2, str7, str4, str6, z3, z4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPreviewImageUrl() {
            return this.previewImageUrl;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCategory() {
            return this.category;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getTitleCode() {
            return this.titleCode;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getStoreUrl() {
            return this.storeUrl;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final boolean getIsPurchased() {
            return this.isPurchased;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsDownloaded() {
            return this.isDownloaded;
        }

        public final ContentsInfo copy(String thumbnailUrl, String previewImageUrl, String category, String titleCode, String storeUrl, boolean isPurchased, boolean isDownloaded) {
            return new ContentsInfo(thumbnailUrl, previewImageUrl, category, titleCode, storeUrl, isPurchased, isDownloaded);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentsInfo)) {
                return false;
            }
            ContentsInfo contentsInfo = (ContentsInfo) other;
            return Intrinsics.areEqual(this.thumbnailUrl, contentsInfo.thumbnailUrl) && Intrinsics.areEqual(this.previewImageUrl, contentsInfo.previewImageUrl) && Intrinsics.areEqual(this.category, contentsInfo.category) && Intrinsics.areEqual(this.titleCode, contentsInfo.titleCode) && Intrinsics.areEqual(this.storeUrl, contentsInfo.storeUrl) && this.isPurchased == contentsInfo.isPurchased && this.isDownloaded == contentsInfo.isDownloaded;
        }

        public int hashCode() {
            String str = this.thumbnailUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.previewImageUrl;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.category;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.titleCode;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.storeUrl;
            return ((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.isPurchased)) * 31) + Boolean.hashCode(this.isDownloaded);
        }

        public String toString() {
            return "ContentsInfo(thumbnailUrl=" + this.thumbnailUrl + ", previewImageUrl=" + this.previewImageUrl + ", category=" + this.category + ", titleCode=" + this.titleCode + ", storeUrl=" + this.storeUrl + ", isPurchased=" + this.isPurchased + ", isDownloaded=" + this.isDownloaded + ")";
        }

        public ContentsInfo(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
            this.thumbnailUrl = str;
            this.previewImageUrl = str2;
            this.category = str3;
            this.titleCode = str4;
            this.storeUrl = str5;
            this.isPurchased = z;
            this.isDownloaded = z2;
        }

        public /* synthetic */ ContentsInfo(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
        }

        public final String getThumbnailUrl() {
            return this.thumbnailUrl;
        }

        public final String getPreviewImageUrl() {
            return this.previewImageUrl;
        }

        public final String getCategory() {
            return this.category;
        }

        public final String getTitleCode() {
            return this.titleCode;
        }

        public final String getStoreUrl() {
            return this.storeUrl;
        }

        public final boolean isPurchased() {
            return this.isPurchased;
        }

        public final boolean isDownloaded() {
            return this.isDownloaded;
        }
    }

    public static /* synthetic */ SearchHits copyItem$default(SearchHits searchHits, boolean z, ContentsInfo contentsInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return searchHits.copyItem(z, contentsInfo);
    }

    public final SearchHits copyItem(boolean isImageSearch, ContentsInfo contentsInfo) {
        Intrinsics.checkNotNullParameter(contentsInfo, "contentsInfo");
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, isImageSearch, contentsInfo, 1023, null);
    }
}
