package com.medicmedia.medilink.ui.contents;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import com.medicmedia.medilink.domain.model.ContentsFilterWritingListItem;
import com.medicmedia.medilink.domain.usecase.ContentsFilterUseCase;
import com.medicmedia.medilink.ui.extension.ComposeExtensionKt;
import com.medicmedia.medilink.ui.extension.StringExtension;
import com.medicmedia.medilink.ui.history.HistoryListParentType;
import com.medicmedia.medilink.ui.theme.ContentsColorFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: ContentsColorFilterViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0011J\u0015\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/contents/ContentsColorFilterViewModel;", "Landroidx/lifecycle/ViewModel;", "contentsFilterUseCase", "Lcom/medicmedia/medilink/domain/usecase/ContentsFilterUseCase;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/ContentsFilterUseCase;)V", "_checkedIds", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Landroidx/compose/ui/graphics/Color;", "checkedIds", "Lkotlinx/coroutines/flow/StateFlow;", "getCheckedIds", "()Lkotlinx/coroutines/flow/StateFlow;", "parentType", "Lcom/medicmedia/medilink/ui/history/HistoryListParentType;", "onCreate", "", "setupColors", "onCheckAll", "onUncheckAll", "onClick", "color", "onClick-8_81llA", "(J)V", "saveColors", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ContentsColorFilterViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<Set<Color>> _checkedIds;
    private final StateFlow<Set<Color>> checkedIds;
    private final ContentsFilterUseCase contentsFilterUseCase;
    private HistoryListParentType parentType;

    @Inject
    public ContentsColorFilterViewModel(ContentsFilterUseCase contentsFilterUseCase) {
        Intrinsics.checkNotNullParameter(contentsFilterUseCase, "contentsFilterUseCase");
        this.contentsFilterUseCase = contentsFilterUseCase;
        MutableStateFlow<Set<Color>> MutableStateFlow = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this._checkedIds = MutableStateFlow;
        this.checkedIds = FlowKt.asStateFlow(MutableStateFlow);
        this.parentType = HistoryListParentType.MainTab.INSTANCE;
    }

    public final StateFlow<Set<Color>> getCheckedIds() {
        return this.checkedIds;
    }

    public final void onCreate(HistoryListParentType parentType) {
        Intrinsics.checkNotNullParameter(parentType, "parentType");
        this.parentType = parentType;
    }

    public final void setupColors() {
        ContentsFilterWritingListItem filterWritingListItem;
        HistoryListParentType historyListParentType = this.parentType;
        if (historyListParentType instanceof HistoryListParentType.MainTab) {
            filterWritingListItem = this.contentsFilterUseCase.writingListFilterItem();
        } else {
            if (!(historyListParentType instanceof HistoryListParentType.ContentsDetail)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(historyListParentType, "null cannot be cast to non-null type com.medicmedia.medilink.ui.history.HistoryListParentType.ContentsDetail");
            filterWritingListItem = ((HistoryListParentType.ContentsDetail) historyListParentType).get_filterWritingListItem();
        }
        Set<String> markerColors = filterWritingListItem.getMarkerColors();
        if (markerColors != null) {
            MutableStateFlow<Set<Color>> mutableStateFlow = this._checkedIds;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = markerColors.iterator();
            while (it.hasNext()) {
                Color colorColorFromHex$default = StringExtension.colorFromHex$default((String) it.next(), 0.0f, 1, null);
                if (colorColorFromHex$default != null) {
                    arrayList.add(colorColorFromHex$default);
                }
            }
            mutableStateFlow.setValue(CollectionsKt.toSet(arrayList));
            return;
        }
        this._checkedIds.setValue(ContentsColorFilter.INSTANCE.entries());
    }

    public final void onCheckAll() {
        this._checkedIds.setValue(ContentsColorFilter.INSTANCE.entries());
    }

    public final void onUncheckAll() {
        this._checkedIds.setValue(SetsKt.emptySet());
    }

    /* JADX INFO: renamed from: onClick-8_81llA, reason: not valid java name */
    public final void m10728onClick8_81llA(long color) {
        Set mutableSet = CollectionsKt.toMutableSet(this._checkedIds.getValue());
        if (this._checkedIds.getValue().contains(Color.m5949boximpl(color))) {
            mutableSet.remove(Color.m5949boximpl(color));
        } else {
            mutableSet.add(Color.m5949boximpl(color));
        }
        this._checkedIds.setValue(CollectionsKt.toSet(mutableSet));
    }

    public final void saveColors() {
        ContentsFilterWritingListItem filterWritingListItem;
        Set<Color> value = this._checkedIds.getValue();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(value, 10));
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(ComposeExtensionKt.m10794toHexRgb8_81llA(((Color) it.next()).m5969unboximpl()));
        }
        Set set = CollectionsKt.toSet(arrayList);
        boolean z = set.size() == ContentsColorFilter.INSTANCE.entries().size();
        HistoryListParentType historyListParentType = this.parentType;
        if (historyListParentType instanceof HistoryListParentType.MainTab) {
            filterWritingListItem = this.contentsFilterUseCase.writingListFilterItem();
        } else {
            if (!(historyListParentType instanceof HistoryListParentType.ContentsDetail)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(historyListParentType, "null cannot be cast to non-null type com.medicmedia.medilink.ui.history.HistoryListParentType.ContentsDetail");
            filterWritingListItem = ((HistoryListParentType.ContentsDetail) historyListParentType).get_filterWritingListItem();
        }
        ContentsFilterWritingListItem contentsFilterWritingListItem = filterWritingListItem;
        if (z) {
            set = null;
        }
        ContentsFilterWritingListItem contentsFilterWritingListItemCopy$default = ContentsFilterWritingListItem.copy$default(contentsFilterWritingListItem, null, set, false, false, 13, null);
        HistoryListParentType historyListParentType2 = this.parentType;
        if (historyListParentType2 instanceof HistoryListParentType.MainTab) {
            this.contentsFilterUseCase.updateContentsFilterItem(contentsFilterWritingListItemCopy$default);
        } else {
            if (!(historyListParentType2 instanceof HistoryListParentType.ContentsDetail)) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNull(historyListParentType2, "null cannot be cast to non-null type com.medicmedia.medilink.ui.history.HistoryListParentType.ContentsDetail");
            ((HistoryListParentType.ContentsDetail) historyListParentType2).updateFilterWritingListItem(contentsFilterWritingListItemCopy$default);
        }
    }
}
