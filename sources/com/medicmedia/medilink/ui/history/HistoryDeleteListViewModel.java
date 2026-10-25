package com.medicmedia.medilink.ui.history;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.model.history.BrowsingHistoryItem;
import com.medicmedia.medilink.domain.model.history.CommonHistoryItem;
import com.medicmedia.medilink.domain.model.history.WritingHistoryItem;
import com.medicmedia.medilink.domain.usecase.ContentsFilterUseCase;
import com.medicmedia.medilink.domain.usecase.HistoryUseCase;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: HistoryDeleteListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u001a\u0010\u001e\u001a\u00020\u001c2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u001cJ\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0010H\u0002J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00100\tX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u00100\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryDeleteListViewModel;", "Landroidx/lifecycle/ViewModel;", "historyUseCase", "Lcom/medicmedia/medilink/domain/usecase/HistoryUseCase;", "contentsFilterUseCase", "Lcom/medicmedia/medilink/domain/usecase/ContentsFilterUseCase;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/HistoryUseCase;Lcom/medicmedia/medilink/domain/usecase/ContentsFilterUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/medicmedia/medilink/ui/history/HistoryDeleteListUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_deleteItems", "", "Lcom/medicmedia/medilink/domain/model/history/CommonHistoryItem;", "deleteItems", "getDeleteItems", "_checkedIds", "", "", "checkedIds", "getCheckedIds", "historyListType", "Lcom/medicmedia/medilink/ui/history/HistoryListType;", "onCreate", "", "fetchDeleteItems", "onCheckedChange", "item", "isChecked", "", "onDelete", "getWritingHistoryByContentsFilter", "Lcom/medicmedia/medilink/domain/model/history/WritingHistoryItem;", FirebaseAnalytics.Param.ITEMS, "getBrowsingHistoryByContentsFilter", "Lcom/medicmedia/medilink/domain/model/history/BrowsingHistoryItem;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class HistoryDeleteListViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<Set<String>> _checkedIds;
    private final MutableStateFlow<List<CommonHistoryItem<?>>> _deleteItems;
    private final MutableStateFlow<HistoryDeleteListUiState> _uiState;
    private final StateFlow<Set<String>> checkedIds;
    private final ContentsFilterUseCase contentsFilterUseCase;
    private final StateFlow<List<CommonHistoryItem<?>>> deleteItems;
    private HistoryListType historyListType;
    private final HistoryUseCase historyUseCase;
    private final StateFlow<HistoryDeleteListUiState> uiState;

    @Inject
    public HistoryDeleteListViewModel(HistoryUseCase historyUseCase, ContentsFilterUseCase contentsFilterUseCase) {
        Intrinsics.checkNotNullParameter(historyUseCase, "historyUseCase");
        Intrinsics.checkNotNullParameter(contentsFilterUseCase, "contentsFilterUseCase");
        this.historyUseCase = historyUseCase;
        this.contentsFilterUseCase = contentsFilterUseCase;
        MutableStateFlow<HistoryDeleteListUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(HistoryDeleteListUiState.INSTANCE.getDefault());
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<CommonHistoryItem<?>>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._deleteItems = MutableStateFlow2;
        this.deleteItems = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<Set<String>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        this._checkedIds = MutableStateFlow3;
        this.checkedIds = FlowKt.asStateFlow(MutableStateFlow3);
        this.historyListType = HistoryListType.WRITING;
    }

    public final StateFlow<HistoryDeleteListUiState> getUiState() {
        return this.uiState;
    }

    public final StateFlow<List<CommonHistoryItem<?>>> getDeleteItems() {
        return this.deleteItems;
    }

    public final StateFlow<Set<String>> getCheckedIds() {
        return this.checkedIds;
    }

    public final void onCreate(HistoryListType historyListType) {
        Intrinsics.checkNotNullParameter(historyListType, "historyListType");
        this.historyListType = historyListType;
        fetchDeleteItems();
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.history.HistoryDeleteListViewModel$fetchDeleteItems$1, reason: invalid class name */
    /* JADX INFO: compiled from: HistoryDeleteListViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.history.HistoryDeleteListViewModel$fetchDeleteItems$1", f = "HistoryDeleteListViewModel.kt", i = {}, l = {58, 65}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.medicmedia.medilink.ui.history.HistoryDeleteListViewModel$fetchDeleteItems$1$WhenMappings */
        /* JADX INFO: compiled from: HistoryDeleteListViewModel.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HistoryListType.values().length];
                try {
                    iArr[HistoryListType.WRITING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HistoryListType.BROWSING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HistoryDeleteListViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
        
            if (r11 == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instruction units count: 290
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medicmedia.medilink.ui.history.HistoryDeleteListViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void fetchDeleteItems() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    public final void onCheckedChange(CommonHistoryItem<?> item, boolean isChecked) {
        Intrinsics.checkNotNullParameter(item, "item");
        String documentReferenceId = item.getDocumentReferenceId();
        Set<String> mutableSet = CollectionsKt.toMutableSet(this.checkedIds.getValue());
        if (isChecked) {
            mutableSet.add(documentReferenceId);
        } else {
            mutableSet.remove(documentReferenceId);
        }
        this._checkedIds.setValue(mutableSet);
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.history.HistoryDeleteListViewModel$onDelete$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: HistoryDeleteListViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.history.HistoryDeleteListViewModel$onDelete$1", f = "HistoryDeleteListViewModel.kt", i = {0, 1}, l = {100, 103}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    static final class C08761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.medicmedia.medilink.ui.history.HistoryDeleteListViewModel$onDelete$1$WhenMappings */
        /* JADX INFO: compiled from: HistoryDeleteListViewModel.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HistoryListType.values().length];
                try {
                    iArr[HistoryListType.WRITING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HistoryListType.BROWSING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C08761(Continuation<? super C08761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C08761 c08761 = HistoryDeleteListViewModel.this.new C08761(continuation);
            c08761.L$0 = obj;
            return c08761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
        
            if (r11.this$0.historyUseCase.deleteWritingHistoryItems((java.util.Set) r11.this$0._checkedIds.getValue(), r11) == r0) goto L29;
         */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 331
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medicmedia.medilink.ui.history.HistoryDeleteListViewModel.C08761.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void onDelete() {
        if (this._checkedIds.getValue().isEmpty()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C08761(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<WritingHistoryItem> getWritingHistoryByContentsFilter(List<WritingHistoryItem> items) {
        return HistoryListItemKt.applyHistoryItems(this.contentsFilterUseCase.writingListFilterItem(), items);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<BrowsingHistoryItem> getBrowsingHistoryByContentsFilter(List<BrowsingHistoryItem> items) {
        return HistoryListItemKt.applyHistoryItems(this.contentsFilterUseCase.browsingListFilterItem(), items);
    }
}
