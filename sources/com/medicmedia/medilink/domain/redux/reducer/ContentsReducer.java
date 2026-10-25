package com.medicmedia.medilink.domain.redux.reducer;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.medicmedia.medilink.domain.redux.Action;
import com.medicmedia.medilink.domain.redux.Reducer;
import com.medicmedia.medilink.domain.redux.state.ContentsState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsReducer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/reducer/ContentsReducer;", "Lcom/medicmedia/medilink/domain/redux/Reducer;", "Lcom/medicmedia/medilink/domain/redux/state/ContentsState;", "<init>", "()V", "reduce", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "Lcom/medicmedia/medilink/domain/redux/Action;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ContentsReducer implements Reducer<ContentsState> {
    @Override // com.medicmedia.medilink.domain.redux.Reducer
    public ContentsState reduce(ContentsState state, Action action) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(action, "action");
        return state;
    }

    @Inject
    public ContentsReducer() {
    }
}
