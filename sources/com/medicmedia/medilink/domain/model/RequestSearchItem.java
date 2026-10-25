package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchResultItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0003Jo\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010HÆ\u0001J\u0013\u0010-\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0007HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001d¨\u00061"}, d2 = {"Lcom/medicmedia/medilink/domain/model/RequestSearchItem;", "", SearchIntents.EXTRA_QUERY, "", "mode", "Lcom/medicmedia/medilink/domain/model/RequestSearchMode;", "from", "", "size", AnalyticsEvent.Param.OPERATION, "Lcom/medicmedia/medilink/domain/model/SearchOperation;", "onlyPurchase", "", "sortField", "sortOrder", "contentsCodes", "", "<init>", "(Ljava/lang/String;Lcom/medicmedia/medilink/domain/model/RequestSearchMode;IILcom/medicmedia/medilink/domain/model/SearchOperation;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getQuery", "()Ljava/lang/String;", "getMode", "()Lcom/medicmedia/medilink/domain/model/RequestSearchMode;", "getFrom", "()I", "getSize", "getOperation", "()Lcom/medicmedia/medilink/domain/model/SearchOperation;", "getOnlyPurchase", "()Z", "getSortField", "getSortOrder", "getContentsCodes", "()Ljava/util/List;", "isAllContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class RequestSearchItem {
    private final List<String> contentsCodes;
    private final int from;
    private final RequestSearchMode mode;
    private final boolean onlyPurchase;
    private final SearchOperation operation;
    private final String query;
    private final int size;
    private final String sortField;
    private final String sortOrder;

    public RequestSearchItem() {
        this(null, null, 0, 0, null, false, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestSearchItem copy$default(RequestSearchItem requestSearchItem, String str, RequestSearchMode requestSearchMode, int i, int i2, SearchOperation searchOperation, boolean z, String str2, String str3, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = requestSearchItem.query;
        }
        if ((i3 & 2) != 0) {
            requestSearchMode = requestSearchItem.mode;
        }
        if ((i3 & 4) != 0) {
            i = requestSearchItem.from;
        }
        if ((i3 & 8) != 0) {
            i2 = requestSearchItem.size;
        }
        if ((i3 & 16) != 0) {
            searchOperation = requestSearchItem.operation;
        }
        if ((i3 & 32) != 0) {
            z = requestSearchItem.onlyPurchase;
        }
        if ((i3 & 64) != 0) {
            str2 = requestSearchItem.sortField;
        }
        if ((i3 & 128) != 0) {
            str3 = requestSearchItem.sortOrder;
        }
        if ((i3 & 256) != 0) {
            list = requestSearchItem.contentsCodes;
        }
        String str4 = str3;
        List list2 = list;
        boolean z2 = z;
        String str5 = str2;
        SearchOperation searchOperation2 = searchOperation;
        int i4 = i;
        return requestSearchItem.copy(str, requestSearchMode, i4, i2, searchOperation2, z2, str5, str4, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RequestSearchMode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SearchOperation getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getOnlyPurchase() {
        return this.onlyPurchase;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSortField() {
        return this.sortField;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSortOrder() {
        return this.sortOrder;
    }

    public final List<String> component9() {
        return this.contentsCodes;
    }

    public final RequestSearchItem copy(String query, RequestSearchMode mode, int from, int size, SearchOperation operation, boolean onlyPurchase, String sortField, String sortOrder, List<String> contentsCodes) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(operation, "operation");
        return new RequestSearchItem(query, mode, from, size, operation, onlyPurchase, sortField, sortOrder, contentsCodes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestSearchItem)) {
            return false;
        }
        RequestSearchItem requestSearchItem = (RequestSearchItem) other;
        return Intrinsics.areEqual(this.query, requestSearchItem.query) && this.mode == requestSearchItem.mode && this.from == requestSearchItem.from && this.size == requestSearchItem.size && this.operation == requestSearchItem.operation && this.onlyPurchase == requestSearchItem.onlyPurchase && Intrinsics.areEqual(this.sortField, requestSearchItem.sortField) && Intrinsics.areEqual(this.sortOrder, requestSearchItem.sortOrder) && Intrinsics.areEqual(this.contentsCodes, requestSearchItem.contentsCodes);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.query.hashCode() * 31) + this.mode.hashCode()) * 31) + Integer.hashCode(this.from)) * 31) + Integer.hashCode(this.size)) * 31) + this.operation.hashCode()) * 31) + Boolean.hashCode(this.onlyPurchase)) * 31;
        String str = this.sortField;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sortOrder;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.contentsCodes;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "RequestSearchItem(query=" + this.query + ", mode=" + this.mode + ", from=" + this.from + ", size=" + this.size + ", operation=" + this.operation + ", onlyPurchase=" + this.onlyPurchase + ", sortField=" + this.sortField + ", sortOrder=" + this.sortOrder + ", contentsCodes=" + this.contentsCodes + ")";
    }

    public RequestSearchItem(String query, RequestSearchMode mode, int i, int i2, SearchOperation operation, boolean z, String str, String str2, List<String> list) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.query = query;
        this.mode = mode;
        this.from = i;
        this.size = i2;
        this.operation = operation;
        this.onlyPurchase = z;
        this.sortField = str;
        this.sortOrder = str2;
        this.contentsCodes = list;
    }

    public /* synthetic */ RequestSearchItem(String str, RequestSearchMode requestSearchMode, int i, int i2, SearchOperation searchOperation, boolean z, String str2, String str3, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? RequestSearchMode.COMPOUND : requestSearchMode, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 100 : i2, (i3 & 16) != 0 ? SearchOperation.AND : searchOperation, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? null : str2, (i3 & 128) != 0 ? null : str3, (i3 & 256) != 0 ? null : list);
    }

    public final String getQuery() {
        return this.query;
    }

    public final RequestSearchMode getMode() {
        return this.mode;
    }

    public final int getFrom() {
        return this.from;
    }

    public final int getSize() {
        return this.size;
    }

    public final SearchOperation getOperation() {
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

    public final boolean isAllContents() {
        return this.contentsCodes == null;
    }
}
