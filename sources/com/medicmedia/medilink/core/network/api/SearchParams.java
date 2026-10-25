package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import com.medicmedia.medilink.domain.model.AnalyticsEvent;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0003Jy\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006."}, d2 = {"Lcom/medicmedia/medilink/core/network/api/SearchParams;", "", SearchIntents.EXTRA_QUERY, "", "userId", "mode", "from", "size", AnalyticsEvent.Param.OPERATION, "onlyPurchase", "", "sortField", "sortOrder", "contentsCodes", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getQuery", "()Ljava/lang/String;", "getUserId", "getMode", "getFrom", "getSize", "getOperation", "getOnlyPurchase", "()Z", "getSortField", "getSortOrder", "getContentsCodes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SearchParams {
    private final List<String> contentsCodes;
    private final String from;
    private final String mode;
    private final boolean onlyPurchase;
    private final String operation;
    private final String query;
    private final String size;
    private final String sortField;
    private final String sortOrder;
    private final String userId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchParams copy$default(SearchParams searchParams, String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, String str8, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchParams.query;
        }
        if ((i & 2) != 0) {
            str2 = searchParams.userId;
        }
        if ((i & 4) != 0) {
            str3 = searchParams.mode;
        }
        if ((i & 8) != 0) {
            str4 = searchParams.from;
        }
        if ((i & 16) != 0) {
            str5 = searchParams.size;
        }
        if ((i & 32) != 0) {
            str6 = searchParams.operation;
        }
        if ((i & 64) != 0) {
            z = searchParams.onlyPurchase;
        }
        if ((i & 128) != 0) {
            str7 = searchParams.sortField;
        }
        if ((i & 256) != 0) {
            str8 = searchParams.sortOrder;
        }
        if ((i & 512) != 0) {
            list = searchParams.contentsCodes;
        }
        String str9 = str8;
        List list2 = list;
        boolean z2 = z;
        String str10 = str7;
        String str11 = str5;
        String str12 = str6;
        return searchParams.copy(str, str2, str3, str4, str11, str12, z2, str10, str9, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final List<String> component10() {
        return this.contentsCodes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getOnlyPurchase() {
        return this.onlyPurchase;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSortField() {
        return this.sortField;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSortOrder() {
        return this.sortOrder;
    }

    public final SearchParams copy(@Json(name = "q") String query, String userId, String mode, String from, String size, @Json(name = "op") String operation, boolean onlyPurchase, @Json(name = "sf") String sortField, @Json(name = "so") String sortOrder, List<String> contentsCodes) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return new SearchParams(query, userId, mode, from, size, operation, onlyPurchase, sortField, sortOrder, contentsCodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchParams)) {
            return false;
        }
        SearchParams searchParams = (SearchParams) other;
        return Intrinsics.areEqual(this.query, searchParams.query) && Intrinsics.areEqual(this.userId, searchParams.userId) && Intrinsics.areEqual(this.mode, searchParams.mode) && Intrinsics.areEqual(this.from, searchParams.from) && Intrinsics.areEqual(this.size, searchParams.size) && Intrinsics.areEqual(this.operation, searchParams.operation) && this.onlyPurchase == searchParams.onlyPurchase && Intrinsics.areEqual(this.sortField, searchParams.sortField) && Intrinsics.areEqual(this.sortOrder, searchParams.sortOrder) && Intrinsics.areEqual(this.contentsCodes, searchParams.contentsCodes);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.query.hashCode() * 31) + this.userId.hashCode()) * 31) + this.mode.hashCode()) * 31) + this.from.hashCode()) * 31) + this.size.hashCode()) * 31) + this.operation.hashCode()) * 31) + Boolean.hashCode(this.onlyPurchase)) * 31;
        String str = this.sortField;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sortOrder;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.contentsCodes;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SearchParams(query=" + this.query + ", userId=" + this.userId + ", mode=" + this.mode + ", from=" + this.from + ", size=" + this.size + ", operation=" + this.operation + ", onlyPurchase=" + this.onlyPurchase + ", sortField=" + this.sortField + ", sortOrder=" + this.sortOrder + ", contentsCodes=" + this.contentsCodes + ")";
    }

    public SearchParams(@Json(name = "q") String query, String userId, String mode, String from, String size, @Json(name = "op") String operation, boolean z, @Json(name = "sf") String str, @Json(name = "so") String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.query = query;
        this.userId = userId;
        this.mode = mode;
        this.from = from;
        this.size = size;
        this.operation = operation;
        this.onlyPurchase = z;
        this.sortField = str;
        this.sortOrder = str2;
        this.contentsCodes = list;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getOperation() {
        return this.operation;
    }

    public final boolean getOnlyPurchase() {
        return this.onlyPurchase;
    }

    public final String getSortField() {
        return this.sortField;
    }

    public final String getSortOrder() {
        return this.sortOrder;
    }

    public final List<String> getContentsCodes() {
        return this.contentsCodes;
    }
}
