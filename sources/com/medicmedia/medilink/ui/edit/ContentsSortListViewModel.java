package com.medicmedia.medilink.ui.edit;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.medicmedia.medilink.domain.model.BookShelfViewItem;
import com.medicmedia.medilink.domain.usecase.BookShelfUseCase;
import io.realm.kotlin.internal.interop.realm_sync_errno_connection_e;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: ContentsSortListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0016\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/medicmedia/medilink/ui/edit/ContentsSortListViewModel;", "Landroidx/lifecycle/ViewModel;", "bookShelfUseCase", "Lcom/medicmedia/medilink/domain/usecase/BookShelfUseCase;", "<init>", "(Lcom/medicmedia/medilink/domain/usecase/BookShelfUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/medicmedia/medilink/ui/edit/ContentsSortListUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_sortedItems", "", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "sortedItems", "getSortedItems", "isDirty", "", "saveMutex", "Lkotlinx/coroutines/sync/Mutex;", "saveJob", "Lkotlinx/coroutines/Job;", "errorMessageHandled", "", "fetchUserSortedItems", "updateSortedItems", "fromIndex", "", "toIndex", "saveIfNeeded", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ContentsSortListViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<List<BookShelfViewItem>> _sortedItems;
    private final MutableStateFlow<ContentsSortListUiState> _uiState;
    private final BookShelfUseCase bookShelfUseCase;
    private final MutableStateFlow<Boolean> isDirty;
    private Job saveJob;
    private final Mutex saveMutex;
    private final StateFlow<List<BookShelfViewItem>> sortedItems;
    private final StateFlow<ContentsSortListUiState> uiState;

    @Inject
    public ContentsSortListViewModel(BookShelfUseCase bookShelfUseCase) {
        Intrinsics.checkNotNullParameter(bookShelfUseCase, "bookShelfUseCase");
        this.bookShelfUseCase = bookShelfUseCase;
        MutableStateFlow<ContentsSortListUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(ContentsSortListUiState.INSTANCE.getDefault());
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<BookShelfViewItem>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._sortedItems = MutableStateFlow2;
        this.sortedItems = FlowKt.asStateFlow(MutableStateFlow2);
        this.isDirty = StateFlowKt.MutableStateFlow(false);
        this.saveMutex = MutexKt.Mutex$default(false, 1, null);
    }

    public final StateFlow<ContentsSortListUiState> getUiState() {
        return this.uiState;
    }

    public final StateFlow<List<BookShelfViewItem>> getSortedItems() {
        return this.sortedItems;
    }

    public final void errorMessageHandled() {
        ContentsSortListUiState value;
        MutableStateFlow<ContentsSortListUiState> mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ContentsSortListUiState.copy$default(value, false, null, 1, null)));
    }

    public final void fetchUserSortedItems() {
        this._sortedItems.setValue(this.bookShelfUseCase.getUserSortItems());
        this.isDirty.setValue(false);
    }

    public final void updateSortedItems(int fromIndex, int toIndex) {
        List<BookShelfViewItem> mutableList = CollectionsKt.toMutableList((Collection) this._sortedItems.getValue());
        mutableList.add(toIndex, mutableList.remove(fromIndex));
        this._sortedItems.setValue(mutableList);
        this.isDirty.setValue(true);
    }

    public final void saveIfNeeded() {
        if (this.isDirty.getValue().booleanValue()) {
            Job job = this.saveJob;
            if (job == null || !job.isActive()) {
                this.saveJob = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(this._sortedItems.getValue(), null), 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.medicmedia.medilink.ui.edit.ContentsSortListViewModel$saveIfNeeded$1, reason: invalid class name */
    /* JADX INFO: compiled from: ContentsSortListViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(c = "com.medicmedia.medilink.ui.edit.ContentsSortListViewModel$saveIfNeeded$1", f = "ContentsSortListViewModel.kt", i = {0, 0, 1, 1}, l = {realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_REUSE_OF_SESSION_IDENT, TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend", n = {"$this$launch", "$this$withLock_u24default$iv", "$this$launch", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<BookShelfViewItem> $snapshot;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<BookShelfViewItem> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$snapshot = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ContentsSortListViewModel.this.new AnonymousClass1(this.$snapshot, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
        
            r13 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
        
            r0 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00cd, code lost:
        
            r11 = r6;
            r6 = r13;
            r13 = r0;
            r0 = r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
        
            r0 = r0._uiState;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:
        
            r2 = r0.getValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x012c, code lost:
        
            throw r13;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medicmedia.medilink.ui.edit.ContentsSortListViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
