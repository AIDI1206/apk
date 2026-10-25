package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchResultItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0003JX\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u0006'"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SearchResultItems;", "", "took", "", "timeOut", "hits", "", "Lcom/medicmedia/medilink/domain/model/SearchHits;", "requestInfo", "Lcom/medicmedia/medilink/domain/model/SearchRequestInfo;", "returnNum", "similarWords", "", "<init>", "(ILjava/lang/Integer;Ljava/util/List;Lcom/medicmedia/medilink/domain/model/SearchRequestInfo;ILjava/util/List;)V", "getTook", "()I", "getTimeOut", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHits", "()Ljava/util/List;", "getRequestInfo", "()Lcom/medicmedia/medilink/domain/model/SearchRequestInfo;", "getReturnNum", "getSimilarWords", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/Integer;Ljava/util/List;Lcom/medicmedia/medilink/domain/model/SearchRequestInfo;ILjava/util/List;)Lcom/medicmedia/medilink/domain/model/SearchResultItems;", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SearchResultItems {
    private final List<SearchHits> hits;
    private final SearchRequestInfo requestInfo;
    private final int returnNum;
    private final List<String> similarWords;
    private final Integer timeOut;
    private final int took;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchResultItems copy$default(SearchResultItems searchResultItems, int i, Integer num, List list, SearchRequestInfo searchRequestInfo, int i2, List list2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = searchResultItems.took;
        }
        if ((i3 & 2) != 0) {
            num = searchResultItems.timeOut;
        }
        if ((i3 & 4) != 0) {
            list = searchResultItems.hits;
        }
        if ((i3 & 8) != 0) {
            searchRequestInfo = searchResultItems.requestInfo;
        }
        if ((i3 & 16) != 0) {
            i2 = searchResultItems.returnNum;
        }
        if ((i3 & 32) != 0) {
            list2 = searchResultItems.similarWords;
        }
        int i4 = i2;
        List list3 = list2;
        return searchResultItems.copy(i, num, list, searchRequestInfo, i4, list3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTook() {
        return this.took;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTimeOut() {
        return this.timeOut;
    }

    public final List<SearchHits> component3() {
        return this.hits;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SearchRequestInfo getRequestInfo() {
        return this.requestInfo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getReturnNum() {
        return this.returnNum;
    }

    public final List<String> component6() {
        return this.similarWords;
    }

    public final SearchResultItems copy(int took, Integer timeOut, List<SearchHits> hits, SearchRequestInfo requestInfo, int returnNum, List<String> similarWords) {
        Intrinsics.checkNotNullParameter(hits, "hits");
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(similarWords, "similarWords");
        return new SearchResultItems(took, timeOut, hits, requestInfo, returnNum, similarWords);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultItems)) {
            return false;
        }
        SearchResultItems searchResultItems = (SearchResultItems) other;
        return this.took == searchResultItems.took && Intrinsics.areEqual(this.timeOut, searchResultItems.timeOut) && Intrinsics.areEqual(this.hits, searchResultItems.hits) && Intrinsics.areEqual(this.requestInfo, searchResultItems.requestInfo) && this.returnNum == searchResultItems.returnNum && Intrinsics.areEqual(this.similarWords, searchResultItems.similarWords);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.took) * 31;
        Integer num = this.timeOut;
        return ((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.hits.hashCode()) * 31) + this.requestInfo.hashCode()) * 31) + Integer.hashCode(this.returnNum)) * 31) + this.similarWords.hashCode();
    }

    public String toString() {
        return "SearchResultItems(took=" + this.took + ", timeOut=" + this.timeOut + ", hits=" + this.hits + ", requestInfo=" + this.requestInfo + ", returnNum=" + this.returnNum + ", similarWords=" + this.similarWords + ")";
    }

    public SearchResultItems(int i, Integer num, List<SearchHits> hits, SearchRequestInfo requestInfo, int i2, List<String> similarWords) {
        Intrinsics.checkNotNullParameter(hits, "hits");
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(similarWords, "similarWords");
        this.took = i;
        this.timeOut = num;
        this.hits = hits;
        this.requestInfo = requestInfo;
        this.returnNum = i2;
        this.similarWords = similarWords;
    }

    public final int getTook() {
        return this.took;
    }

    public final Integer getTimeOut() {
        return this.timeOut;
    }

    public final List<SearchHits> getHits() {
        return this.hits;
    }

    public final SearchRequestInfo getRequestInfo() {
        return this.requestInfo;
    }

    public final int getReturnNum() {
        return this.returnNum;
    }

    public final List<String> getSimilarWords() {
        return this.similarWords;
    }
}
