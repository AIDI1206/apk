package com.medicmedia.medilink.ui.edit;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.medicmedia.medilink.domain.model.BookShelfViewItem;
import com.medicmedia.medilink.domain.model.ContentsEditItemsType;
import com.medicmedia.medilink.domain.usecase.BookShelfUseCase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: ContentsDisplayListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/ContentsDisplayListViewModel;", "Landroidx/lifecycle/ViewModel;", "bookShelfUseCase", "Lcom/medicmedia/medilink/domain/usecase/BookShelfUseCase;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/BookShelfUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/medicmedia/medilink/ui/edit/ContentsDisplayListUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onCreate", "", "setupDisplayEditItems", "updateItemDisplayFlag", "item", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ContentsDisplayListViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<ContentsDisplayListUiState> _uiState;
    private final BookShelfUseCase bookShelfUseCase;
    private final StateFlow<ContentsDisplayListUiState> uiState;

    @Inject
    public ContentsDisplayListViewModel(BookShelfUseCase bookShelfUseCase) {
        Intrinsics.checkNotNullParameter(bookShelfUseCase, "bookShelfUseCase");
        this.bookShelfUseCase = bookShelfUseCase;
        MutableStateFlow<ContentsDisplayListUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(ContentsDisplayListUiState.INSTANCE.getDefault());
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow<ContentsDisplayListUiState> getUiState() {
        return this.uiState;
    }

    public final void onCreate() {
        setupDisplayEditItems();
    }

    private final void setupDisplayEditItems() {
        ContentsDisplayListUiState value;
        List<BookShelfViewItem> editItemsByCategorySort = this.bookShelfUseCase.getEditItemsByCategorySort(ContentsEditItemsType.DISPLAY);
        MutableStateFlow<ContentsDisplayListUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, value.copy(editItemsByCategorySort)));
    }

    public final void updateItemDisplayFlag(BookShelfViewItem item) {
        int i;
        List<BookShelfViewItem> list;
        ContentsDisplayListUiState value;
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z = !item.isUnDisplay();
        BookShelfViewItem bookShelfViewItemFindBookShelfByContentId = this.bookShelfUseCase.findBookShelfByContentId(item.getId());
        if (bookShelfViewItemFindBookShelfByContentId != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ContentsDisplayListViewModel$updateItemDisplayFlag$1$1(this, bookShelfViewItemFindBookShelfByContentId, z, null), 3, null);
        }
        List<BookShelfViewItem> mutableList = CollectionsKt.toMutableList((Collection) this._uiState.getValue().getDisplayItems());
        Iterator<BookShelfViewItem> it = mutableList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else {
                if (Intrinsics.areEqual(it.next().getId(), item.getId())) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        if (i != -1) {
            list = mutableList;
            list.set(i, BookShelfViewItem.copy$default(mutableList.get(i), 0, null, null, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, 0L, 0, null, z, null, null, null, null, 0, 1056964607, null));
        } else {
            list = mutableList;
        }
        MutableStateFlow<ContentsDisplayListUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, value.copy(list)));
    }
}
