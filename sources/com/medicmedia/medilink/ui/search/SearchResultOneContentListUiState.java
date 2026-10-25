package com.medicmedia.medilink.ui.search;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import com.medicmedia.medilink.domain.model.VideoContentsUrlResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchResultOneContentListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003J\\\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÇ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u00032\b\u0010*\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010+\u001a\u00020\u0007H×\u0001J\t\u0010,\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006."}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchResultOneContentListUiState;", "", "isLoading", "", SearchIntents.EXTRA_QUERY, "", "errorMessage", "", "showHeaderView", "Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType;", "showResultEmptyView", "Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType;", "showVideoContents", "Lcom/medicmedia/medilink/domain/model/VideoContentsUrlResult;", "ai", "Lcom/medicmedia/medilink/ui/search/SearchAIUiState;", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType;Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType;Lcom/medicmedia/medilink/domain/model/VideoContentsUrlResult;Lcom/medicmedia/medilink/ui/search/SearchAIUiState;)V", "()Z", "getQuery", "()Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getShowHeaderView", "()Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType;", "getShowResultEmptyView", "()Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType;", "getShowVideoContents", "()Lcom/medicmedia/medilink/domain/model/VideoContentsUrlResult;", "getAi", "()Lcom/medicmedia/medilink/ui/search/SearchAIUiState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType;Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType;Lcom/medicmedia/medilink/domain/model/VideoContentsUrlResult;Lcom/medicmedia/medilink/ui/search/SearchAIUiState;)Lcom/medicmedia/medilink/ui/search/SearchResultOneContentListUiState;", "equals", "other", "hashCode", "toString", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SearchResultOneContentListUiState {
    private final SearchAIUiState ai;
    private final Integer errorMessage;
    private final boolean isLoading;
    private final String query;
    private final SearchHeaderMessageType showHeaderView;
    private final SearchResultEmptyType showResultEmptyView;
    private final VideoContentsUrlResult showVideoContents;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final SearchResultOneContentListUiState f169default = new SearchResultOneContentListUiState(false, null, null, null, null, null, null, 127, null);

    public SearchResultOneContentListUiState() {
        this(false, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ SearchResultOneContentListUiState copy$default(SearchResultOneContentListUiState searchResultOneContentListUiState, boolean z, String str, Integer num, SearchHeaderMessageType searchHeaderMessageType, SearchResultEmptyType searchResultEmptyType, VideoContentsUrlResult videoContentsUrlResult, SearchAIUiState searchAIUiState, int i, Object obj) {
        if ((i & 1) != 0) {
            z = searchResultOneContentListUiState.isLoading;
        }
        if ((i & 2) != 0) {
            str = searchResultOneContentListUiState.query;
        }
        if ((i & 4) != 0) {
            num = searchResultOneContentListUiState.errorMessage;
        }
        if ((i & 8) != 0) {
            searchHeaderMessageType = searchResultOneContentListUiState.showHeaderView;
        }
        if ((i & 16) != 0) {
            searchResultEmptyType = searchResultOneContentListUiState.showResultEmptyView;
        }
        if ((i & 32) != 0) {
            videoContentsUrlResult = searchResultOneContentListUiState.showVideoContents;
        }
        if ((i & 64) != 0) {
            searchAIUiState = searchResultOneContentListUiState.ai;
        }
        VideoContentsUrlResult videoContentsUrlResult2 = videoContentsUrlResult;
        SearchAIUiState searchAIUiState2 = searchAIUiState;
        SearchResultEmptyType searchResultEmptyType2 = searchResultEmptyType;
        Integer num2 = num;
        return searchResultOneContentListUiState.copy(z, str, num2, searchHeaderMessageType, searchResultEmptyType2, videoContentsUrlResult2, searchAIUiState2);
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
    public final VideoContentsUrlResult getShowVideoContents() {
        return this.showVideoContents;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SearchAIUiState getAi() {
        return this.ai;
    }

    public final SearchResultOneContentListUiState copy(boolean isLoading, String query, Integer errorMessage, SearchHeaderMessageType showHeaderView, SearchResultEmptyType showResultEmptyView, VideoContentsUrlResult showVideoContents, SearchAIUiState ai) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(ai, "ai");
        return new SearchResultOneContentListUiState(isLoading, query, errorMessage, showHeaderView, showResultEmptyView, showVideoContents, ai);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResultOneContentListUiState)) {
            return false;
        }
        SearchResultOneContentListUiState searchResultOneContentListUiState = (SearchResultOneContentListUiState) other;
        return this.isLoading == searchResultOneContentListUiState.isLoading && Intrinsics.areEqual(this.query, searchResultOneContentListUiState.query) && Intrinsics.areEqual(this.errorMessage, searchResultOneContentListUiState.errorMessage) && Intrinsics.areEqual(this.showHeaderView, searchResultOneContentListUiState.showHeaderView) && Intrinsics.areEqual(this.showResultEmptyView, searchResultOneContentListUiState.showResultEmptyView) && Intrinsics.areEqual(this.showVideoContents, searchResultOneContentListUiState.showVideoContents) && Intrinsics.areEqual(this.ai, searchResultOneContentListUiState.ai);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + this.query.hashCode()) * 31;
        Integer num = this.errorMessage;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        SearchHeaderMessageType searchHeaderMessageType = this.showHeaderView;
        int iHashCode3 = (iHashCode2 + (searchHeaderMessageType == null ? 0 : searchHeaderMessageType.hashCode())) * 31;
        SearchResultEmptyType searchResultEmptyType = this.showResultEmptyView;
        int iHashCode4 = (iHashCode3 + (searchResultEmptyType == null ? 0 : searchResultEmptyType.hashCode())) * 31;
        VideoContentsUrlResult videoContentsUrlResult = this.showVideoContents;
        return ((iHashCode4 + (videoContentsUrlResult != null ? videoContentsUrlResult.hashCode() : 0)) * 31) + this.ai.hashCode();
    }

    public String toString() {
        return "SearchResultOneContentListUiState(isLoading=" + this.isLoading + ", query=" + this.query + ", errorMessage=" + this.errorMessage + ", showHeaderView=" + this.showHeaderView + ", showResultEmptyView=" + this.showResultEmptyView + ", showVideoContents=" + this.showVideoContents + ", ai=" + this.ai + ")";
    }

    public SearchResultOneContentListUiState(boolean z, String query, Integer num, SearchHeaderMessageType searchHeaderMessageType, SearchResultEmptyType searchResultEmptyType, VideoContentsUrlResult videoContentsUrlResult, SearchAIUiState ai) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(ai, "ai");
        this.isLoading = z;
        this.query = query;
        this.errorMessage = num;
        this.showHeaderView = searchHeaderMessageType;
        this.showResultEmptyView = searchResultEmptyType;
        this.showVideoContents = videoContentsUrlResult;
        this.ai = ai;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ SearchResultOneContentListUiState(boolean z, String str, Integer num, SearchHeaderMessageType searchHeaderMessageType, SearchResultEmptyType searchResultEmptyType, VideoContentsUrlResult videoContentsUrlResult, SearchAIUiState searchAIUiState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : searchHeaderMessageType, (i & 16) != 0 ? null : searchResultEmptyType, (i & 32) == 0 ? videoContentsUrlResult : null, (i & 64) != 0 ? new SearchAIUiState(false, null, null, 0, 0, false, null, 127, null) : searchAIUiState);
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

    public final VideoContentsUrlResult getShowVideoContents() {
        return this.showVideoContents;
    }

    public final SearchAIUiState getAi() {
        return this.ai;
    }

    /* JADX INFO: compiled from: SearchResultOneContentListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchResultOneContentListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/search/SearchResultOneContentListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/search/SearchResultOneContentListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SearchResultOneContentListUiState getDefault() {
            return SearchResultOneContentListUiState.f169default;
        }
    }
}
