package com.medicmedia.medilink.ui.reference;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import com.medicmedia.medilink.domain.model.ReferenceItem;
import com.medicmedia.medilink.domain.usecase.ContentsDetailUseCase;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: ContentsReferenceListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/ui/reference/ContentsReferenceListViewModel;", "Landroidx/lifecycle/ViewModel;", "contentsDetailUseCase", "Lcom/medicmedia/medilink/domain/usecase/ContentsDetailUseCase;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/ContentsDetailUseCase;)V", "_referenceItems", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/medicmedia/medilink/domain/model/ReferenceItem;", "referenceItems", "Lkotlinx/coroutines/flow/StateFlow;", "getReferenceItems", "()Lkotlinx/coroutines/flow/StateFlow;", "onCreate", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ContentsReferenceListViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<List<ReferenceItem>> _referenceItems;
    private final ContentsDetailUseCase contentsDetailUseCase;
    private final StateFlow<List<ReferenceItem>> referenceItems;

    @Inject
    public ContentsReferenceListViewModel(ContentsDetailUseCase contentsDetailUseCase) {
        Intrinsics.checkNotNullParameter(contentsDetailUseCase, "contentsDetailUseCase");
        this.contentsDetailUseCase = contentsDetailUseCase;
        MutableStateFlow<List<ReferenceItem>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._referenceItems = MutableStateFlow;
        this.referenceItems = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow<List<ReferenceItem>> getReferenceItems() {
        return this.referenceItems;
    }

    public final void onCreate() {
        this._referenceItems.setValue(this.contentsDetailUseCase.getReferenceItems());
    }
}
