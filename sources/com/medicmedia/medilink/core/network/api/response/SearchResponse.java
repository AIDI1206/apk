package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.model.AnalyticsEvent;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0002\u001e\u001fBS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/SearchResponse;", "Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface;", "took", "", "timeOut", "hits", "", "Lcom/medicmedia/medilink/core/network/api/response/SearchResponse$Hits;", "requestInfo", "Lcom/medicmedia/medilink/core/network/api/response/SearchResponse$RequestInfo;", "returnNum", "similarWords", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$ErrorResponse;", "<init>", "(ILjava/lang/Integer;Ljava/util/List;Lcom/medicmedia/medilink/core/network/api/response/SearchResponse$RequestInfo;ILjava/util/List;Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$ErrorResponse;)V", "getTook", "()I", "getTimeOut", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHits", "()Ljava/util/List;", "getRequestInfo", "()Lcom/medicmedia/medilink/core/network/api/response/SearchResponse$RequestInfo;", "getReturnNum", "getSimilarWords", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$ErrorResponse;", "Hits", "RequestInfo", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SearchResponse implements AccountsApiErrorInterface {
    private final AccountsApiErrorInterface.ErrorResponse error;
    private final List<Hits> hits;
    private final RequestInfo requestInfo;
    private final int returnNum;
    private final List<String> similarWords;
    private final Integer timeOut;
    private final int took;

    public SearchResponse(int i, @Json(name = "timed_out") Integer num, List<Hits> hits, @Json(name = "reqinfo") RequestInfo requestInfo, int i2, List<String> similarWords, AccountsApiErrorInterface.ErrorResponse errorResponse) {
        Intrinsics.checkNotNullParameter(hits, "hits");
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(similarWords, "similarWords");
        this.took = i;
        this.timeOut = num;
        this.hits = hits;
        this.requestInfo = requestInfo;
        this.returnNum = i2;
        this.similarWords = similarWords;
        this.error = errorResponse;
    }

    public final int getTook() {
        return this.took;
    }

    public final Integer getTimeOut() {
        return this.timeOut;
    }

    public final List<Hits> getHits() {
        return this.hits;
    }

    public final RequestInfo getRequestInfo() {
        return this.requestInfo;
    }

    public final int getReturnNum() {
        return this.returnNum;
    }

    public final List<String> getSimilarWords() {
        return this.similarWords;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.AccountsApiErrorInterface
    public AccountsApiErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    /* JADX INFO: compiled from: SearchResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001-Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jq\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006."}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/SearchResponse$Hits;", "", "record", "", "contentsCode", "bookName", "fileName", HistoryRepositoryImpl.FieldName.TITLE, "refBody", "refId", FirebaseAnalytics.Param.LEVEL, "highlight", "Lcom/medicmedia/medilink/core/network/api/response/SearchResponse$Hits$Highlight;", "page", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/medicmedia/medilink/core/network/api/response/SearchResponse$Hits$Highlight;Ljava/lang/String;)V", "getRecord", "()Ljava/lang/String;", "getContentsCode", "getBookName", "getFileName", "getTitle", "getRefBody", "getRefId", "getLevel", "getHighlight", "()Lcom/medicmedia/medilink/core/network/api/response/SearchResponse$Hits$Highlight;", "getPage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "Highlight", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Hits {
        private final String bookName;
        private final String contentsCode;
        private final String fileName;
        private final Highlight highlight;
        private final String level;
        private final String page;
        private final String record;
        private final String refBody;
        private final String refId;
        private final String title;

        public static /* synthetic */ Hits copy$default(Hits hits, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Highlight highlight, String str9, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hits.record;
            }
            if ((i & 2) != 0) {
                str2 = hits.contentsCode;
            }
            if ((i & 4) != 0) {
                str3 = hits.bookName;
            }
            if ((i & 8) != 0) {
                str4 = hits.fileName;
            }
            if ((i & 16) != 0) {
                str5 = hits.title;
            }
            if ((i & 32) != 0) {
                str6 = hits.refBody;
            }
            if ((i & 64) != 0) {
                str7 = hits.refId;
            }
            if ((i & 128) != 0) {
                str8 = hits.level;
            }
            if ((i & 256) != 0) {
                highlight = hits.highlight;
            }
            if ((i & 512) != 0) {
                str9 = hits.page;
            }
            Highlight highlight2 = highlight;
            String str10 = str9;
            String str11 = str7;
            String str12 = str8;
            String str13 = str5;
            String str14 = str6;
            return hits.copy(str, str2, str3, str4, str13, str14, str11, str12, highlight2, str10);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRecord() {
            return this.record;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getPage() {
            return this.page;
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
        public final Highlight getHighlight() {
            return this.highlight;
        }

        public final Hits copy(String record, @Json(name = "contents_code") String contentsCode, @Json(name = "book_name") String bookName, @Json(name = "file_name") String fileName, String title, @Json(name = "refbody") String refBody, @Json(name = "refid") String refId, String level, @Json(name = "highlit") Highlight highlight, String page) {
            Intrinsics.checkNotNullParameter(record, "record");
            Intrinsics.checkNotNullParameter(contentsCode, "contentsCode");
            Intrinsics.checkNotNullParameter(bookName, "bookName");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(refBody, "refBody");
            Intrinsics.checkNotNullParameter(refId, "refId");
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(highlight, "highlight");
            return new Hits(record, contentsCode, bookName, fileName, title, refBody, refId, level, highlight, page);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hits)) {
                return false;
            }
            Hits hits = (Hits) other;
            return Intrinsics.areEqual(this.record, hits.record) && Intrinsics.areEqual(this.contentsCode, hits.contentsCode) && Intrinsics.areEqual(this.bookName, hits.bookName) && Intrinsics.areEqual(this.fileName, hits.fileName) && Intrinsics.areEqual(this.title, hits.title) && Intrinsics.areEqual(this.refBody, hits.refBody) && Intrinsics.areEqual(this.refId, hits.refId) && Intrinsics.areEqual(this.level, hits.level) && Intrinsics.areEqual(this.highlight, hits.highlight) && Intrinsics.areEqual(this.page, hits.page);
        }

        public int hashCode() {
            int iHashCode = ((((this.record.hashCode() * 31) + this.contentsCode.hashCode()) * 31) + this.bookName.hashCode()) * 31;
            String str = this.fileName;
            int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + this.refBody.hashCode()) * 31) + this.refId.hashCode()) * 31) + this.level.hashCode()) * 31) + this.highlight.hashCode()) * 31;
            String str2 = this.page;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Hits(record=" + this.record + ", contentsCode=" + this.contentsCode + ", bookName=" + this.bookName + ", fileName=" + this.fileName + ", title=" + this.title + ", refBody=" + this.refBody + ", refId=" + this.refId + ", level=" + this.level + ", highlight=" + this.highlight + ", page=" + this.page + ")";
        }

        public Hits(String record, @Json(name = "contents_code") String contentsCode, @Json(name = "book_name") String bookName, @Json(name = "file_name") String str, String title, @Json(name = "refbody") String refBody, @Json(name = "refid") String refId, String level, @Json(name = "highlit") Highlight highlight, String str2) {
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

        public final Highlight getHighlight() {
            return this.highlight;
        }

        public final String getPage() {
            return this.page;
        }

        /* JADX INFO: compiled from: SearchResponse.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/SearchResponse$Hits$Highlight;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "", "keyword", "refBody", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/util/List;", "getKeyword", "getRefBody", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final /* data */ class Highlight {
            private final List<String> keyword;
            private final List<String> refBody;
            private final List<String> title;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Highlight copy$default(Highlight highlight, List list, List list2, List list3, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = highlight.title;
                }
                if ((i & 2) != 0) {
                    list2 = highlight.keyword;
                }
                if ((i & 4) != 0) {
                    list3 = highlight.refBody;
                }
                return highlight.copy(list, list2, list3);
            }

            public final List<String> component1() {
                return this.title;
            }

            public final List<String> component2() {
                return this.keyword;
            }

            public final List<String> component3() {
                return this.refBody;
            }

            public final Highlight copy(List<String> title, List<String> keyword, @Json(name = "refbody") List<String> refBody) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(keyword, "keyword");
                Intrinsics.checkNotNullParameter(refBody, "refBody");
                return new Highlight(title, keyword, refBody);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Highlight)) {
                    return false;
                }
                Highlight highlight = (Highlight) other;
                return Intrinsics.areEqual(this.title, highlight.title) && Intrinsics.areEqual(this.keyword, highlight.keyword) && Intrinsics.areEqual(this.refBody, highlight.refBody);
            }

            public int hashCode() {
                return (((this.title.hashCode() * 31) + this.keyword.hashCode()) * 31) + this.refBody.hashCode();
            }

            public String toString() {
                return "Highlight(title=" + this.title + ", keyword=" + this.keyword + ", refBody=" + this.refBody + ")";
            }

            public Highlight(List<String> title, List<String> keyword, @Json(name = "refbody") List<String> refBody) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(keyword, "keyword");
                Intrinsics.checkNotNullParameter(refBody, "refBody");
                this.title = title;
                this.keyword = keyword;
                this.refBody = refBody;
            }

            public final List<String> getTitle() {
                return this.title;
            }

            public final List<String> getKeyword() {
                return this.keyword;
            }

            public final List<String> getRefBody() {
                return this.refBody;
            }
        }
    }

    /* JADX INFO: compiled from: SearchResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J`\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006)"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/SearchResponse$RequestInfo;", "", "userId", "", "mode", "", SearchIntents.EXTRA_QUERY, "sortField", "sortOrder", AnalyticsEvent.Param.OPERATION, "from", "size", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getUserId", "()Ljava/lang/String;", "getMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuery", "getSortField", "getSortOrder", "getOperation", "getFrom", "()I", "getSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/medicmedia/medilink/core/network/api/response/SearchResponse$RequestInfo;", "equals", "", "other", "hashCode", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class RequestInfo {
        private final int from;
        private final Integer mode;
        private final String operation;
        private final String query;
        private final int size;
        private final String sortField;
        private final String sortOrder;
        private final String userId;

        public static /* synthetic */ RequestInfo copy$default(RequestInfo requestInfo, String str, Integer num, String str2, String str3, String str4, String str5, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = requestInfo.userId;
            }
            if ((i3 & 2) != 0) {
                num = requestInfo.mode;
            }
            if ((i3 & 4) != 0) {
                str2 = requestInfo.query;
            }
            if ((i3 & 8) != 0) {
                str3 = requestInfo.sortField;
            }
            if ((i3 & 16) != 0) {
                str4 = requestInfo.sortOrder;
            }
            if ((i3 & 32) != 0) {
                str5 = requestInfo.operation;
            }
            if ((i3 & 64) != 0) {
                i = requestInfo.from;
            }
            if ((i3 & 128) != 0) {
                i2 = requestInfo.size;
            }
            int i4 = i;
            int i5 = i2;
            String str6 = str4;
            String str7 = str5;
            return requestInfo.copy(str, num, str2, str3, str6, str7, i4, i5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getQuery() {
            return this.query;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getSortField() {
            return this.sortField;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSortOrder() {
            return this.sortOrder;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getOperation() {
            return this.operation;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final int getFrom() {
            return this.from;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final int getSize() {
            return this.size;
        }

        public final RequestInfo copy(String userId, Integer mode, @Json(name = "q") String query, @Json(name = "sf") String sortField, @Json(name = "so") String sortOrder, @Json(name = "op") String operation, int from, int size) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(query, "query");
            Intrinsics.checkNotNullParameter(sortField, "sortField");
            Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
            Intrinsics.checkNotNullParameter(operation, "operation");
            return new RequestInfo(userId, mode, query, sortField, sortOrder, operation, from, size);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestInfo)) {
                return false;
            }
            RequestInfo requestInfo = (RequestInfo) other;
            return Intrinsics.areEqual(this.userId, requestInfo.userId) && Intrinsics.areEqual(this.mode, requestInfo.mode) && Intrinsics.areEqual(this.query, requestInfo.query) && Intrinsics.areEqual(this.sortField, requestInfo.sortField) && Intrinsics.areEqual(this.sortOrder, requestInfo.sortOrder) && Intrinsics.areEqual(this.operation, requestInfo.operation) && this.from == requestInfo.from && this.size == requestInfo.size;
        }

        public int hashCode() {
            int iHashCode = this.userId.hashCode() * 31;
            Integer num = this.mode;
            return ((((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.query.hashCode()) * 31) + this.sortField.hashCode()) * 31) + this.sortOrder.hashCode()) * 31) + this.operation.hashCode()) * 31) + Integer.hashCode(this.from)) * 31) + Integer.hashCode(this.size);
        }

        public String toString() {
            return "RequestInfo(userId=" + this.userId + ", mode=" + this.mode + ", query=" + this.query + ", sortField=" + this.sortField + ", sortOrder=" + this.sortOrder + ", operation=" + this.operation + ", from=" + this.from + ", size=" + this.size + ")";
        }

        public RequestInfo(String userId, Integer num, @Json(name = "q") String query, @Json(name = "sf") String sortField, @Json(name = "so") String sortOrder, @Json(name = "op") String operation, int i, int i2) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(query, "query");
            Intrinsics.checkNotNullParameter(sortField, "sortField");
            Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.userId = userId;
            this.mode = num;
            this.query = query;
            this.sortField = sortField;
            this.sortOrder = sortOrder;
            this.operation = operation;
            this.from = i;
            this.size = i2;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final Integer getMode() {
            return this.mode;
        }

        public final String getQuery() {
            return this.query;
        }

        public final String getSortField() {
            return this.sortField;
        }

        public final String getSortOrder() {
            return this.sortOrder;
        }

        public final String getOperation() {
            return this.operation;
        }

        public final int getFrom() {
            return this.from;
        }

        public final int getSize() {
            return this.size;
        }
    }
}
