package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchResultItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J`\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006)"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SearchRequestInfo;", "", "userId", "", "mode", "", SearchIntents.EXTRA_QUERY, "sortField", "sortOrder", AnalyticsEvent.Param.OPERATION, "from", "size", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getUserId", "()Ljava/lang/String;", "getMode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuery", "getSortField", "getSortOrder", "getOperation", "getFrom", "()I", "getSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)Lcom/medicmedia/medilink/domain/model/SearchRequestInfo;", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SearchRequestInfo {
    private final int from;
    private final Integer mode;
    private final String operation;
    private final String query;
    private final int size;
    private final String sortField;
    private final String sortOrder;
    private final String userId;

    public static /* synthetic */ SearchRequestInfo copy$default(SearchRequestInfo searchRequestInfo, String str, Integer num, String str2, String str3, String str4, String str5, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = searchRequestInfo.userId;
        }
        if ((i3 & 2) != 0) {
            num = searchRequestInfo.mode;
        }
        if ((i3 & 4) != 0) {
            str2 = searchRequestInfo.query;
        }
        if ((i3 & 8) != 0) {
            str3 = searchRequestInfo.sortField;
        }
        if ((i3 & 16) != 0) {
            str4 = searchRequestInfo.sortOrder;
        }
        if ((i3 & 32) != 0) {
            str5 = searchRequestInfo.operation;
        }
        if ((i3 & 64) != 0) {
            i = searchRequestInfo.from;
        }
        if ((i3 & 128) != 0) {
            i2 = searchRequestInfo.size;
        }
        int i4 = i;
        int i5 = i2;
        String str6 = str4;
        String str7 = str5;
        return searchRequestInfo.copy(str, num, str2, str3, str6, str7, i4, i5);
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

    public final SearchRequestInfo copy(String userId, Integer mode, String query, String sortField, String sortOrder, String operation, int from, int size) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(sortField, "sortField");
        Intrinsics.checkNotNullParameter(sortOrder, "sortOrder");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return new SearchRequestInfo(userId, mode, query, sortField, sortOrder, operation, from, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchRequestInfo)) {
            return false;
        }
        SearchRequestInfo searchRequestInfo = (SearchRequestInfo) other;
        return Intrinsics.areEqual(this.userId, searchRequestInfo.userId) && Intrinsics.areEqual(this.mode, searchRequestInfo.mode) && Intrinsics.areEqual(this.query, searchRequestInfo.query) && Intrinsics.areEqual(this.sortField, searchRequestInfo.sortField) && Intrinsics.areEqual(this.sortOrder, searchRequestInfo.sortOrder) && Intrinsics.areEqual(this.operation, searchRequestInfo.operation) && this.from == searchRequestInfo.from && this.size == searchRequestInfo.size;
    }

    public int hashCode() {
        int iHashCode = this.userId.hashCode() * 31;
        Integer num = this.mode;
        return ((((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.query.hashCode()) * 31) + this.sortField.hashCode()) * 31) + this.sortOrder.hashCode()) * 31) + this.operation.hashCode()) * 31) + Integer.hashCode(this.from)) * 31) + Integer.hashCode(this.size);
    }

    public String toString() {
        return "SearchRequestInfo(userId=" + this.userId + ", mode=" + this.mode + ", query=" + this.query + ", sortField=" + this.sortField + ", sortOrder=" + this.sortOrder + ", operation=" + this.operation + ", from=" + this.from + ", size=" + this.size + ")";
    }

    public SearchRequestInfo(String userId, Integer num, String query, String sortField, String sortOrder, String operation, int i, int i2) {
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
