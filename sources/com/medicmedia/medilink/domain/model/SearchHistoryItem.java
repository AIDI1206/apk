package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchHistoryItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0083\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0006HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00064"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SearchHistoryItem;", "", "inputKeyword", "", "keyword", "index", "", FirebaseAnalytics.Param.LEVEL, "refId", HistoryRepositoryImpl.FieldName.TITLE, AnalyticsEvent.Param.ENTRY, "id", "refBody", "contentsId", "contentsTitle", "updatedDate", "Ljava/util/Date;", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "getInputKeyword", "()Ljava/lang/String;", "getKeyword", "getIndex", "()I", "getLevel", "getRefId", "getTitle", "getEntry", "getId", "getRefBody", "getContentsId", "getContentsTitle", "getUpdatedDate", "()Ljava/util/Date;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SearchHistoryItem {
    private final String contentsId;
    private final String contentsTitle;
    private final String entry;
    private final String id;
    private final int index;
    private final String inputKeyword;
    private final String keyword;
    private final int level;
    private final String refBody;
    private final String refId;
    private final String title;
    private final Date updatedDate;

    public static /* synthetic */ SearchHistoryItem copy$default(SearchHistoryItem searchHistoryItem, String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Date date, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = searchHistoryItem.inputKeyword;
        }
        if ((i3 & 2) != 0) {
            str2 = searchHistoryItem.keyword;
        }
        if ((i3 & 4) != 0) {
            i = searchHistoryItem.index;
        }
        if ((i3 & 8) != 0) {
            i2 = searchHistoryItem.level;
        }
        if ((i3 & 16) != 0) {
            str3 = searchHistoryItem.refId;
        }
        if ((i3 & 32) != 0) {
            str4 = searchHistoryItem.title;
        }
        if ((i3 & 64) != 0) {
            str5 = searchHistoryItem.entry;
        }
        if ((i3 & 128) != 0) {
            str6 = searchHistoryItem.id;
        }
        if ((i3 & 256) != 0) {
            str7 = searchHistoryItem.refBody;
        }
        if ((i3 & 512) != 0) {
            str8 = searchHistoryItem.contentsId;
        }
        if ((i3 & 1024) != 0) {
            str9 = searchHistoryItem.contentsTitle;
        }
        if ((i3 & 2048) != 0) {
            date = searchHistoryItem.updatedDate;
        }
        String str10 = str9;
        Date date2 = date;
        String str11 = str7;
        String str12 = str8;
        String str13 = str5;
        String str14 = str6;
        String str15 = str3;
        String str16 = str4;
        return searchHistoryItem.copy(str, str2, i, i2, str15, str16, str13, str14, str11, str12, str10, date2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInputKeyword() {
        return this.inputKeyword;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getContentsTitle() {
        return this.contentsTitle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getUpdatedDate() {
        return this.updatedDate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRefId() {
        return this.refId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEntry() {
        return this.entry;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRefBody() {
        return this.refBody;
    }

    public final SearchHistoryItem copy(String inputKeyword, String keyword, int index, int level, String refId, String title, String entry, String id, String refBody, String contentsId, String contentsTitle, Date updatedDate) {
        Intrinsics.checkNotNullParameter(inputKeyword, "inputKeyword");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(refBody, "refBody");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(contentsTitle, "contentsTitle");
        return new SearchHistoryItem(inputKeyword, keyword, index, level, refId, title, entry, id, refBody, contentsId, contentsTitle, updatedDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHistoryItem)) {
            return false;
        }
        SearchHistoryItem searchHistoryItem = (SearchHistoryItem) other;
        return Intrinsics.areEqual(this.inputKeyword, searchHistoryItem.inputKeyword) && Intrinsics.areEqual(this.keyword, searchHistoryItem.keyword) && this.index == searchHistoryItem.index && this.level == searchHistoryItem.level && Intrinsics.areEqual(this.refId, searchHistoryItem.refId) && Intrinsics.areEqual(this.title, searchHistoryItem.title) && Intrinsics.areEqual(this.entry, searchHistoryItem.entry) && Intrinsics.areEqual(this.id, searchHistoryItem.id) && Intrinsics.areEqual(this.refBody, searchHistoryItem.refBody) && Intrinsics.areEqual(this.contentsId, searchHistoryItem.contentsId) && Intrinsics.areEqual(this.contentsTitle, searchHistoryItem.contentsTitle) && Intrinsics.areEqual(this.updatedDate, searchHistoryItem.updatedDate);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((this.inputKeyword.hashCode() * 31) + this.keyword.hashCode()) * 31) + Integer.hashCode(this.index)) * 31) + Integer.hashCode(this.level)) * 31) + this.refId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.entry.hashCode()) * 31) + this.id.hashCode()) * 31) + this.refBody.hashCode()) * 31) + this.contentsId.hashCode()) * 31) + this.contentsTitle.hashCode()) * 31;
        Date date = this.updatedDate;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        return "SearchHistoryItem(inputKeyword=" + this.inputKeyword + ", keyword=" + this.keyword + ", index=" + this.index + ", level=" + this.level + ", refId=" + this.refId + ", title=" + this.title + ", entry=" + this.entry + ", id=" + this.id + ", refBody=" + this.refBody + ", contentsId=" + this.contentsId + ", contentsTitle=" + this.contentsTitle + ", updatedDate=" + this.updatedDate + ")";
    }

    public SearchHistoryItem(String inputKeyword, String keyword, int i, int i2, String refId, String title, String entry, String id, String refBody, String contentsId, String contentsTitle, Date date) {
        Intrinsics.checkNotNullParameter(inputKeyword, "inputKeyword");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(refId, "refId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(refBody, "refBody");
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        Intrinsics.checkNotNullParameter(contentsTitle, "contentsTitle");
        this.inputKeyword = inputKeyword;
        this.keyword = keyword;
        this.index = i;
        this.level = i2;
        this.refId = refId;
        this.title = title;
        this.entry = entry;
        this.id = id;
        this.refBody = refBody;
        this.contentsId = contentsId;
        this.contentsTitle = contentsTitle;
        this.updatedDate = date;
    }

    public final String getInputKeyword() {
        return this.inputKeyword;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final int getIndex() {
        return this.index;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getEntry() {
        return this.entry;
    }

    public final String getId() {
        return this.id;
    }

    public final String getRefBody() {
        return this.refBody;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final String getContentsTitle() {
        return this.contentsTitle;
    }

    public final Date getUpdatedDate() {
        return this.updatedDate;
    }
}
