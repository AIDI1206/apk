package com.medicmedia.medilink.domain.usecase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.model.RequestSearchItem;
import com.medicmedia.medilink.domain.model.RequestSearchMode;
import com.medicmedia.medilink.domain.model.SearchHistoryItem;
import com.medicmedia.medilink.domain.model.SearchHits;
import com.medicmedia.medilink.domain.model.SearchResultItems;
import com.medicmedia.medilink.domain.model.SuggestItems;
import com.medicmedia.medilink.loader.TtsService;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: SearchContentsUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H¦@¢\u0006\u0002\u0010\u0005J\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH¦@¢\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\u0006\u0010\u0014\u001a\u00020\t2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016H&J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0004H¦@¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H&J\"\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H¦@¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0013H¦@¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\"H&J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\"H&J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u0003H&J\b\u0010&\u001a\u00020\"H&J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\"H&J\u0017\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\u0013H&¢\u0006\u0002\u0010)¨\u0006*"}, d2 = {"Lcom/medicmedia/medilink/domain/usecase/SearchContentsUseCase;", "", "fetchSearchHistories", "", "Lcom/medicmedia/medilink/domain/model/SearchHistoryItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestSuggest", "Lcom/medicmedia/medilink/domain/model/SuggestItems;", SearchIntents.EXTRA_QUERY, "", "mode", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestOnlineSearch", "Lcom/medicmedia/medilink/domain/model/SearchResultItems;", "requestItem", "Lcom/medicmedia/medilink/domain/model/RequestSearchItem;", "(Lcom/medicmedia/medilink/domain/model/RequestSearchItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchOfflineSearch", "Lcom/medicmedia/medilink/domain/model/SearchHits;", TtsService.EXTRA_WORD, "contentsCodes", "", "deleteSearchHistory", "", "item", "(Lcom/medicmedia/medilink/domain/model/SearchHistoryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addContentsInfoToSearchHits", FirebaseAnalytics.Param.ITEMS, "addVideoContentsInfoToSearchHits", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSearchItem", "(Ljava/lang/String;Lcom/medicmedia/medilink/domain/model/SearchHits;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDisplayedSearchTips", "", "setFlagToDisplaySearchTips", "value", "getForceOfflineSearchContentsList", "isOnlineSearch", "setOnlineSearch", "findTabNoForQuickReference", "(Lcom/medicmedia/medilink/domain/model/SearchHits;)Ljava/lang/Integer;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SearchContentsUseCase {
    List<SearchHits> addContentsInfoToSearchHits(List<SearchHits> items);

    Object addVideoContentsInfoToSearchHits(List<SearchHits> list, Continuation<? super List<SearchHits>> continuation);

    Object deleteSearchHistory(SearchHistoryItem searchHistoryItem, Continuation<? super Unit> continuation);

    List<SearchHits> fetchOfflineSearch(String word, Set<String> contentsCodes);

    Object fetchSearchHistories(Continuation<? super List<SearchHistoryItem>> continuation);

    Integer findTabNoForQuickReference(SearchHits item);

    List<String> getForceOfflineSearchContentsList();

    boolean isDisplayedSearchTips();

    boolean isOnlineSearch();

    Object requestOnlineSearch(RequestSearchItem requestSearchItem, Continuation<? super SearchResultItems> continuation);

    Object requestSuggest(String str, int i, Continuation<? super SuggestItems> continuation);

    void setFlagToDisplaySearchTips(boolean value);

    void setOnlineSearch(boolean value);

    Object updateSearchItem(String str, SearchHits searchHits, Continuation<? super Unit> continuation);

    /* JADX INFO: compiled from: SearchContentsUseCase.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ Object requestSuggest$default(SearchContentsUseCase searchContentsUseCase, String str, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestSuggest");
            }
            if ((i2 & 2) != 0) {
                i = RequestSearchMode.COMPOUND.getValue();
            }
            return searchContentsUseCase.requestSuggest(str, i, continuation);
        }
    }
}
