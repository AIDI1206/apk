package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchResultItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SearchHighlight;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "", "keyword", "refBody", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTitle", "()Ljava/util/List;", "getKeyword", "getRefBody", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SearchHighlight {
    private final List<String> keyword;
    private final List<String> refBody;
    private final List<String> title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchHighlight copy$default(SearchHighlight searchHighlight, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = searchHighlight.title;
        }
        if ((i & 2) != 0) {
            list2 = searchHighlight.keyword;
        }
        if ((i & 4) != 0) {
            list3 = searchHighlight.refBody;
        }
        return searchHighlight.copy(list, list2, list3);
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

    public final SearchHighlight copy(List<String> title, List<String> keyword, List<String> refBody) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(refBody, "refBody");
        return new SearchHighlight(title, keyword, refBody);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchHighlight)) {
            return false;
        }
        SearchHighlight searchHighlight = (SearchHighlight) other;
        return Intrinsics.areEqual(this.title, searchHighlight.title) && Intrinsics.areEqual(this.keyword, searchHighlight.keyword) && Intrinsics.areEqual(this.refBody, searchHighlight.refBody);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.keyword.hashCode()) * 31) + this.refBody.hashCode();
    }

    public String toString() {
        return "SearchHighlight(title=" + this.title + ", keyword=" + this.keyword + ", refBody=" + this.refBody + ")";
    }

    public SearchHighlight(List<String> title, List<String> keyword, List<String> refBody) {
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
