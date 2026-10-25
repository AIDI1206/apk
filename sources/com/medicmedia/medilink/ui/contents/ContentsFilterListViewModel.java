package com.medicmedia.medilink.ui.contents;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import com.medicmedia.medilink.database.realm.QueryType;
import com.medicmedia.medilink.domain.model.BookShelfViewItem;
import com.medicmedia.medilink.domain.model.ContentsFilterBrowsingListItem;
import com.medicmedia.medilink.domain.model.ContentsFilterListType;
import com.medicmedia.medilink.domain.model.ContentsFilterParentType;
import com.medicmedia.medilink.domain.model.ContentsFilterSearchListItem;
import com.medicmedia.medilink.domain.model.ContentsFilterWritingListItem;
import com.medicmedia.medilink.domain.usecase.BookShelfUseCase;
import com.medicmedia.medilink.domain.usecase.ContentsFilterUseCase;
import com.medicmedia.medilink.ui.history.HistoryListParentType;
import com.medicmedia.medilink.ui.history.HistoryListType;
import com.medicmedia.medilink.ui.search.SearchListParentType;
import com.medicmedia.medilink.ui.search.SearchListType;
import io.realm.kotlin.query.Sort;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: ContentsFilterListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u001cJ\u0006\u0010&\u001a\u00020\u001cJ\u000e\u0010'\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/medicmedia/medilink/ui/contents/ContentsFilterListViewModel;", "Landroidx/lifecycle/ViewModel;", "bookShelfUseCase", "Lcom/medicmedia/medilink/domain/usecase/BookShelfUseCase;", "contentsFilterUseCase", "Lcom/medicmedia/medilink/domain/usecase/ContentsFilterUseCase;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/BookShelfUseCase;Lcom/medicmedia/medilink/domain/usecase/ContentsFilterUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/medicmedia/medilink/ui/contents/ContentsFilterListUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_contentsItems", "", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "contentsItems", "getContentsItems", "_checkedIds", "", "", "checkedIds", "getCheckedIds", "parentType", "Lcom/medicmedia/medilink/domain/model/ContentsFilterParentType;", "onCreate", "", "listType", "Lcom/medicmedia/medilink/domain/model/ContentsFilterListType;", "fetchContentsItems", "setupCheckIds", "onCheckedChange", "item", "isChecked", "", "onCheckAll", "onUncheckAll", "saveCheckIds", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ContentsFilterListViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<Set<String>> _checkedIds;
    private final MutableStateFlow<List<BookShelfViewItem>> _contentsItems;
    private final MutableStateFlow<ContentsFilterListUiState> _uiState;
    private final BookShelfUseCase bookShelfUseCase;
    private final StateFlow<Set<String>> checkedIds;
    private final ContentsFilterUseCase contentsFilterUseCase;
    private final StateFlow<List<BookShelfViewItem>> contentsItems;
    private ContentsFilterParentType parentType;
    private final StateFlow<ContentsFilterListUiState> uiState;

    @Inject
    public ContentsFilterListViewModel(BookShelfUseCase bookShelfUseCase, ContentsFilterUseCase contentsFilterUseCase) {
        Intrinsics.checkNotNullParameter(bookShelfUseCase, "bookShelfUseCase");
        Intrinsics.checkNotNullParameter(contentsFilterUseCase, "contentsFilterUseCase");
        this.bookShelfUseCase = bookShelfUseCase;
        this.contentsFilterUseCase = contentsFilterUseCase;
        MutableStateFlow<ContentsFilterListUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(ContentsFilterListUiState.INSTANCE.getDefault());
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<BookShelfViewItem>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._contentsItems = MutableStateFlow2;
        this.contentsItems = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Set<String>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this._checkedIds = MutableStateFlow3;
        this.checkedIds = FlowKt.asStateFlow(MutableStateFlow3);
        this.parentType = HistoryListParentType.MainTab.INSTANCE;
    }

    public final StateFlow<ContentsFilterListUiState> getUiState() {
        return this.uiState;
    }

    public final StateFlow<List<BookShelfViewItem>> getContentsItems() {
        return this.contentsItems;
    }

    public final StateFlow<Set<String>> getCheckedIds() {
        return this.checkedIds;
    }

    public final void onCreate(ContentsFilterParentType parentType, ContentsFilterListType listType) {
        Intrinsics.checkNotNullParameter(parentType, "parentType");
        Intrinsics.checkNotNullParameter(listType, "listType");
        this.parentType = parentType;
        fetchContentsItems(listType);
        setupCheckIds(listType, parentType);
    }

    private final void fetchContentsItems(ContentsFilterListType listType) {
        ArrayList arrayListEmptyList;
        List<String> listBookCategorySort = this.bookShelfUseCase.bookCategorySort();
        MutableStateFlow<List<BookShelfViewItem>> mutableStateFlow = this._contentsItems;
        if (listType == HistoryListType.BROWSING || listType == HistoryListType.WRITING) {
            List<String> list = listBookCategorySort;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(this.bookShelfUseCase.findBookShelfItems("category == $0 AND possession == $1", new Object[]{(String) it.next(), 1}, new QueryType.Sort("id", Sort.ASCENDING)));
            }
            List listFlatten = CollectionsKt.flatten(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listFlatten) {
                if (!((BookShelfViewItem) obj).isChatbot()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = arrayList2;
            if (listType == HistoryListType.WRITING) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (!((BookShelfViewItem) obj2).isOnline()) {
                        arrayList4.add(obj2);
                    }
                }
                arrayListEmptyList = arrayList4;
            } else {
                arrayListEmptyList = arrayList3;
            }
        } else if (Intrinsics.areEqual(listType, SearchListType.INSTANCE)) {
            List<String> list2 = listBookCategorySort;
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList5.add(this.bookShelfUseCase.findBookShelfItems("category == $0 AND possession == $1", new Object[]{(String) it2.next(), 1}, new QueryType.Sort("id", Sort.ASCENDING)));
            }
            List listFlatten2 = CollectionsKt.flatten(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : listFlatten2) {
                BookShelfViewItem bookShelfViewItem = (BookShelfViewItem) obj3;
                if (!bookShelfViewItem.isOnline() && !bookShelfViewItem.isChatbot()) {
                    arrayList6.add(obj3);
                }
            }
            arrayListEmptyList = arrayList6;
        } else {
            arrayListEmptyList = CollectionsKt.emptyList();
        }
        mutableStateFlow.setValue(arrayListEmptyList);
    }

    private final void setupCheckIds(ContentsFilterListType listType, ContentsFilterParentType parentType) {
        Set<String> set;
        ContentsFilterSearchListItem contentsFilterSearchListItemSearchListFilterItem = null;
        if (listType == HistoryListType.WRITING) {
            if (parentType instanceof HistoryListParentType.MainTab) {
                contentsFilterSearchListItemSearchListFilterItem = this.contentsFilterUseCase.writingListFilterItem();
            } else if (parentType instanceof HistoryListParentType.ContentsDetail) {
                contentsFilterSearchListItemSearchListFilterItem = ((HistoryListParentType.ContentsDetail) parentType).get_filterWritingListItem();
            }
            contentsFilterSearchListItemSearchListFilterItem = contentsFilterSearchListItemSearchListFilterItem;
        } else if (listType == HistoryListType.BROWSING) {
            if (parentType instanceof HistoryListParentType.MainTab) {
                contentsFilterSearchListItemSearchListFilterItem = this.contentsFilterUseCase.browsingListFilterItem();
            } else if (parentType instanceof HistoryListParentType.ContentsDetail) {
                contentsFilterSearchListItemSearchListFilterItem = ((HistoryListParentType.ContentsDetail) parentType).get_filterBrowsingListItem();
            }
            contentsFilterSearchListItemSearchListFilterItem = contentsFilterSearchListItemSearchListFilterItem;
        } else if (Intrinsics.areEqual(listType, SearchListType.INSTANCE)) {
            contentsFilterSearchListItemSearchListFilterItem = this.contentsFilterUseCase.searchListFilterItem();
        }
        MutableStateFlow<Set<String>> mutableStateFlow = this._checkedIds;
        if (contentsFilterSearchListItemSearchListFilterItem == null || (set = contentsFilterSearchListItemSearchListFilterItem.getContents()) == null) {
            List<BookShelfViewItem> value = this._contentsItems.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(((BookShelfViewItem) it.next()).getId());
            }
            set = CollectionsKt.toSet(arrayList);
        }
        mutableStateFlow.setValue(set);
    }

    public final void onCheckedChange(BookShelfViewItem item, boolean isChecked) {
        Intrinsics.checkNotNullParameter(item, "item");
        String id = item.getId();
        Set<String> mutableSet = CollectionsKt.toMutableSet(this.checkedIds.getValue());
        if (isChecked) {
            mutableSet.add(id);
        } else {
            mutableSet.remove(id);
        }
        this._checkedIds.setValue(mutableSet);
    }

    public final void onCheckAll() {
        MutableStateFlow<Set<String>> mutableStateFlow = this._checkedIds;
        List<BookShelfViewItem> value = this._contentsItems.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(((BookShelfViewItem) it.next()).getId());
        }
        mutableStateFlow.setValue(CollectionsKt.toSet(arrayList));
    }

    public final void onUncheckAll() {
        this._checkedIds.setValue(SetsKt.emptySet());
    }

    public final void saveCheckIds(ContentsFilterListType listType) {
        Intrinsics.checkNotNullParameter(listType, "listType");
        ContentsFilterSearchListItem contentsFilterSearchListItemCopy$default = null;
        Set<String> value = this._checkedIds.getValue().size() == this._contentsItems.getValue().size() ? null : this._checkedIds.getValue();
        if (listType == HistoryListType.BROWSING) {
            contentsFilterSearchListItemCopy$default = new ContentsFilterBrowsingListItem(value);
        } else if (listType == HistoryListType.WRITING) {
            ContentsFilterParentType contentsFilterParentType = this.parentType;
            if (contentsFilterParentType instanceof HistoryListParentType.MainTab) {
                contentsFilterSearchListItemCopy$default = ContentsFilterWritingListItem.copy$default(this.contentsFilterUseCase.writingListFilterItem(), value, null, false, false, 14, null);
            } else if (contentsFilterParentType instanceof HistoryListParentType.ContentsDetail) {
                Intrinsics.checkNotNull(contentsFilterParentType, "null cannot be cast to non-null type com.medicmedia.medilink.ui.history.HistoryListParentType.ContentsDetail");
                contentsFilterSearchListItemCopy$default = ContentsFilterWritingListItem.copy$default(((HistoryListParentType.ContentsDetail) contentsFilterParentType).get_filterWritingListItem(), value, null, false, false, 14, null);
            }
            contentsFilterSearchListItemCopy$default = contentsFilterSearchListItemCopy$default;
        } else if (Intrinsics.areEqual(listType, SearchListType.INSTANCE)) {
            contentsFilterSearchListItemCopy$default = ContentsFilterSearchListItem.copy$default(this.contentsFilterUseCase.searchListFilterItem(), value, false, null, 6, null);
        }
        ContentsFilterParentType contentsFilterParentType2 = this.parentType;
        if (contentsFilterParentType2 instanceof HistoryListParentType.MainTab) {
            if (contentsFilterSearchListItemCopy$default != null) {
                this.contentsFilterUseCase.updateContentsFilterItem(contentsFilterSearchListItemCopy$default);
                return;
            }
            return;
        }
        if (contentsFilterParentType2 instanceof HistoryListParentType.ContentsDetail) {
            Intrinsics.checkNotNull(contentsFilterParentType2, "null cannot be cast to non-null type com.medicmedia.medilink.ui.history.HistoryListParentType.ContentsDetail");
            HistoryListParentType.ContentsDetail contentsDetail = (HistoryListParentType.ContentsDetail) contentsFilterParentType2;
            if (contentsFilterSearchListItemCopy$default instanceof ContentsFilterBrowsingListItem) {
                contentsDetail.updateFilterBrowsingListItem((ContentsFilterBrowsingListItem) contentsFilterSearchListItemCopy$default);
                return;
            } else {
                if (contentsFilterSearchListItemCopy$default instanceof ContentsFilterWritingListItem) {
                    contentsDetail.updateFilterWritingListItem((ContentsFilterWritingListItem) contentsFilterSearchListItemCopy$default);
                    return;
                }
                return;
            }
        }
        if (((contentsFilterParentType2 instanceof SearchListParentType.MainTab) || (contentsFilterParentType2 instanceof SearchListParentType.ContentsDetail)) && contentsFilterSearchListItemCopy$default != null) {
            this.contentsFilterUseCase.updateContentsFilterItem(contentsFilterSearchListItemCopy$default);
        }
    }
}
