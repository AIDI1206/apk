package com.medicmedia.medilink.ui.search;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import com.medicmedia.medilink.domain.model.ContentsFilterListType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 02\u00020\u0001:\u00010B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003Jf\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÇ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010.\u001a\u00020\u0007H×\u0001J\t\u0010/\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00061"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListUiState;", "", "isLoading", "", SearchIntents.EXTRA_QUERY, "", "errorMessage", "", "showHeaderView", "Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType;", "showResultEmptyView", "Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType;", "showSearchFilterPopup", "showContentsFilter", "Lcom/medicmedia/medilink/domain/model/ContentsFilterListType;", "ai", "Lcom/medicmedia/medilink/ui/search/SearchAIUiState;", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType;Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType;ZLcom/medicmedia/medilink/domain/model/ContentsFilterListType;Lcom/medicmedia/medilink/ui/search/SearchAIUiState;)V", "()Z", "getQuery", "()Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowHeaderView", "()Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType;", "getShowResultEmptyView", "()Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType;", "getShowSearchFilterPopup", "getShowContentsFilter", "()Lcom/medicmedia/medilink/domain/model/ContentsFilterListType;", "getAi", "()Lcom/medicmedia/medilink/ui/search/SearchAIUiState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType;Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType;ZLcom/medicmedia/medilink/domain/model/ContentsFilterListType;Lcom/medicmedia/medilink/ui/search/SearchAIUiState;)Lcom/medicmedia/medilink/ui/search/SearchListUiState;", "equals", "other", "hashCode", "toString", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SearchListUiState {
    private final SearchAIUiState ai;
    private final Integer errorMessage;
    private final boolean isLoading;
    private final String query;
    private final ContentsFilterListType showContentsFilter;
    private final SearchHeaderMessageType showHeaderView;
    private final SearchResultEmptyType showResultEmptyView;
    private final boolean showSearchFilterPopup;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final SearchListUiState f168default = new SearchListUiState(false, null, null, null, null, false, null, null, 255, null);

    public SearchListUiState() {
        this(false, null, null, null, null, false, null, null, 255, null);
    }

    public static /* synthetic */ SearchListUiState copy$default(SearchListUiState searchListUiState, boolean z, String str, Integer num, SearchHeaderMessageType searchHeaderMessageType, SearchResultEmptyType searchResultEmptyType, boolean z2, ContentsFilterListType contentsFilterListType, SearchAIUiState searchAIUiState, int i, Object obj) {
        if ((i & 1) != 0) {
            z = searchListUiState.isLoading;
        }
        if ((i & 2) != 0) {
            str = searchListUiState.query;
        }
        if ((i & 4) != 0) {
            num = searchListUiState.errorMessage;
        }
        if ((i & 8) != 0) {
            searchHeaderMessageType = searchListUiState.showHeaderView;
        }
        if ((i & 16) != 0) {
            searchResultEmptyType = searchListUiState.showResultEmptyView;
        }
        if ((i & 32) != 0) {
            z2 = searchListUiState.showSearchFilterPopup;
        }
        if ((i & 64) != 0) {
            contentsFilterListType = searchListUiState.showContentsFilter;
        }
        if ((i & 128) != 0) {
            searchAIUiState = searchListUiState.ai;
        }
        ContentsFilterListType contentsFilterListType2 = contentsFilterListType;
        SearchAIUiState searchAIUiState2 = searchAIUiState;
        SearchResultEmptyType searchResultEmptyType2 = searchResultEmptyType;
        boolean z3 = z2;
        return searchListUiState.copy(z, str, num, searchHeaderMessageType, searchResultEmptyType2, z3, contentsFilterListType2, searchAIUiState2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SearchHeaderMessageType getShowHeaderView() {
        return this.showHeaderView;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SearchResultEmptyType getShowResultEmptyView() {
        return this.showResultEmptyView;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShowSearchFilterPopup() {
        return this.showSearchFilterPopup;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ContentsFilterListType getShowContentsFilter() {
        return this.showContentsFilter;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SearchAIUiState getAi() {
        return this.ai;
    }

    public final SearchListUiState copy(boolean isLoading, String query, Integer errorMessage, SearchHeaderMessageType showHeaderView, SearchResultEmptyType showResultEmptyView, boolean showSearchFilterPopup, ContentsFilterListType showContentsFilter, SearchAIUiState ai) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(ai, "ai");
        return new SearchListUiState(isLoading, query, errorMessage, showHeaderView, showResultEmptyView, showSearchFilterPopup, showContentsFilter, ai);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchListUiState)) {
            return false;
        }
        SearchListUiState searchListUiState = (SearchListUiState) other;
        return this.isLoading == searchListUiState.isLoading && Intrinsics.areEqual(this.query, searchListUiState.query) && Intrinsics.areEqual(this.errorMessage, searchListUiState.errorMessage) && Intrinsics.areEqual(this.showHeaderView, searchListUiState.showHeaderView) && Intrinsics.areEqual(this.showResultEmptyView, searchListUiState.showResultEmptyView) && this.showSearchFilterPopup == searchListUiState.showSearchFilterPopup && Intrinsics.areEqual(this.showContentsFilter, searchListUiState.showContentsFilter) && Intrinsics.areEqual(this.ai, searchListUiState.ai);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + this.query.hashCode()) * 31;
        Integer num = this.errorMessage;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        SearchHeaderMessageType searchHeaderMessageType = this.showHeaderView;
        int iHashCode3 = (iHashCode2 + (searchHeaderMessageType == null ? 0 : searchHeaderMessageType.hashCode())) * 31;
        SearchResultEmptyType searchResultEmptyType = this.showResultEmptyView;
        int iHashCode4 = (((iHashCode3 + (searchResultEmptyType == null ? 0 : searchResultEmptyType.hashCode())) * 31) + Boolean.hashCode(this.showSearchFilterPopup)) * 31;
        ContentsFilterListType contentsFilterListType = this.showContentsFilter;
        return ((iHashCode4 + (contentsFilterListType != null ? contentsFilterListType.hashCode() : 0)) * 31) + this.ai.hashCode();
    }

    public String toString() {
        return "SearchListUiState(isLoading=" + this.isLoading + ", query=" + this.query + ", errorMessage=" + this.errorMessage + ", showHeaderView=" + this.showHeaderView + ", showResultEmptyView=" + this.showResultEmptyView + ", showSearchFilterPopup=" + this.showSearchFilterPopup + ", showContentsFilter=" + this.showContentsFilter + ", ai=" + this.ai + ")";
    }

    public SearchListUiState(boolean z, String query, Integer num, SearchHeaderMessageType searchHeaderMessageType, SearchResultEmptyType searchResultEmptyType, boolean z2, ContentsFilterListType contentsFilterListType, SearchAIUiState ai) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(ai, "ai");
        this.isLoading = z;
        this.query = query;
        this.errorMessage = num;
        this.showHeaderView = searchHeaderMessageType;
        this.showResultEmptyView = searchResultEmptyType;
        this.showSearchFilterPopup = z2;
        this.showContentsFilter = contentsFilterListType;
        this.ai = ai;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ SearchListUiState(boolean z, String str, Integer num, SearchHeaderMessageType searchHeaderMessageType, SearchResultEmptyType searchResultEmptyType, boolean z2, ContentsFilterListType contentsFilterListType, SearchAIUiState searchAIUiState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : searchHeaderMessageType, (i & 16) != 0 ? null : searchResultEmptyType, (i & 32) == 0 ? z2 : false, (i & 64) == 0 ? contentsFilterListType : null, (i & 128) != 0 ? new SearchAIUiState(false, null, null, 0, 0, false, null, 127, null) : searchAIUiState);
    }

    public final String getQuery() {
        return this.query;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public final SearchHeaderMessageType getShowHeaderView() {
        return this.showHeaderView;
    }

    public final SearchResultEmptyType getShowResultEmptyView() {
        return this.showResultEmptyView;
    }

    public final boolean getShowSearchFilterPopup() {
        return this.showSearchFilterPopup;
    }

    public final ContentsFilterListType getShowContentsFilter() {
        return this.showContentsFilter;
    }

    public final SearchAIUiState getAi() {
        return this.ai;
    }

    /* JADX INFO: compiled from: SearchListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/search/SearchListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/search/SearchListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SearchListUiState getDefault() {
            return SearchListUiState.f168default;
        }
    }
}
