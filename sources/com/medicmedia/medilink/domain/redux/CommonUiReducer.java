package com.medicmedia.medilink.domain.redux;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonUi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/CommonUiReducer;", "", "<init>", "()V", "reduce", "Lcom/medicmedia/medilink/domain/redux/ReduceResult;", "Lcom/medicmedia/medilink/domain/redux/CommonUiState;", "Lcom/medicmedia/medilink/domain/redux/CommonUiEvent;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "Lcom/medicmedia/medilink/domain/redux/CommonUiAction;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CommonUiReducer {
    @Inject
    public CommonUiReducer() {
    }

    public final ReduceResult<CommonUiState, CommonUiEvent> reduce(CommonUiState state, CommonUiAction action) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof CommonUiAction.UpdateAnnounceBadge) {
            return new ReduceResult<>(CommonUiState.copy$default(state, null, Unit.INSTANCE, null, 5, null), CommonUiEvent.UpdateAnnounceBadge.INSTANCE);
        }
        if (action instanceof CommonUiAction.SelectLibraryTab) {
            return new ReduceResult<>(state, CommonUiEvent.SelectLibraryTab.INSTANCE);
        }
        if (action instanceof CommonUiAction.SelectHistoryTab) {
            CommonUiAction.SelectHistoryTab selectHistoryTab = (CommonUiAction.SelectHistoryTab) action;
            return new ReduceResult<>(CommonUiState.copy$default(state, Integer.valueOf(selectHistoryTab.getValue()), null, null, 6, null), new CommonUiEvent.SelectHistoryTab(selectHistoryTab.getValue()));
        }
        if (!(action instanceof CommonUiAction.NextTutorialStep)) {
            throw new NoWhenBranchMatchedException();
        }
        CommonUiAction.NextTutorialStep nextTutorialStep = (CommonUiAction.NextTutorialStep) action;
        return new ReduceResult<>(CommonUiState.copy$default(state, null, null, nextTutorialStep.getStep(), 3, null), new CommonUiEvent.NextTutorialStep(nextTutorialStep.getStep()));
    }
}
