package com.medicmedia.medilink.domain.redux;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: CommonUi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/CommonUiStore;", "", "reducer", "Lcom/medicmedia/medilink/domain/redux/CommonUiReducer;", "<init>", "(Lcom/medicmedia/medilink/domain/redux/CommonUiReducer;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/medicmedia/medilink/domain/redux/CommonUiState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/medicmedia/medilink/domain/redux/CommonUiEvent;", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "dispatch", "", "action", "Lcom/medicmedia/medilink/domain/redux/CommonUiAction;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CommonUiStore {
    private final MutableSharedFlow<CommonUiEvent> _events;
    private final MutableStateFlow<CommonUiState> _state;
    private final SharedFlow<CommonUiEvent> events;
    private final CommonUiReducer reducer;
    private final StateFlow<CommonUiState> state;

    @Inject
    public CommonUiStore(CommonUiReducer reducer) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        this.reducer = reducer;
        MutableStateFlow<CommonUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new CommonUiState(null, null, null, 7, null));
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<CommonUiEvent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 64, BufferOverflow.DROP_OLDEST, 1, null);
        this._events = mutableSharedFlowMutableSharedFlow$default;
        this.events = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    public final StateFlow<CommonUiState> getState() {
        return this.state;
    }

    public final SharedFlow<CommonUiEvent> getEvents() {
        return this.events;
    }

    public final void dispatch(CommonUiAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ReduceResult<CommonUiState, CommonUiEvent> reduceResultReduce = this.reducer.reduce(this._state.getValue(), action);
        this._state.setValue(reduceResultReduce.getState());
        CommonUiEvent event = reduceResultReduce.getEvent();
        if (event != null) {
            this._events.tryEmit(event);
        }
    }
}
