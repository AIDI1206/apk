package com.medicmedia.medilink.domain.redux.store;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.medicmedia.medilink.domain.model.VideoPipDestination;
import com.medicmedia.medilink.domain.model.VideoPipState;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: VideoPipStateStore.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0015\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/store/VideoPipStateStore;", "", "<init>", "()V", "lock", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/medicmedia/medilink/domain/model/VideoPipState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "enter", "", FirebaseAnalytics.Param.DESTINATION, "Lcom/medicmedia/medilink/domain/model/VideoPipDestination;", "onPictureInPictureModeChanged", "isInPictureInPictureMode", "", "isActive", "consumeDestination", "clear", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class VideoPipStateStore {
    private final MutableStateFlow<VideoPipState> _state;
    private final Object lock = new Object();
    private final StateFlow<VideoPipState> state;

    @Inject
    public VideoPipStateStore() {
        MutableStateFlow<VideoPipState> MutableStateFlow = StateFlowKt.MutableStateFlow(VideoPipState.None.INSTANCE);
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final StateFlow<VideoPipState> getState() {
        return this.state;
    }

    public static /* synthetic */ void enter$default(VideoPipStateStore videoPipStateStore, VideoPipDestination videoPipDestination, int i, Object obj) {
        if ((i & 1) != 0) {
            videoPipDestination = null;
        }
        videoPipStateStore.enter(videoPipDestination);
    }

    public final void enter(VideoPipDestination destination) {
        synchronized (this.lock) {
            this._state.setValue(new VideoPipState.Active(destination));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        synchronized (this.lock) {
            try {
                if (isInPictureInPictureMode) {
                    if (!(this._state.getValue() instanceof VideoPipState.Active)) {
                        this._state.setValue(new VideoPipState.Active(null));
                    }
                } else {
                    this._state.setValue(VideoPipState.None.INSTANCE);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isActive() {
        boolean z;
        synchronized (this.lock) {
            z = this._state.getValue() instanceof VideoPipState.Active;
        }
        return z;
    }

    public final VideoPipDestination consumeDestination() {
        VideoPipDestination videoPipDestination;
        VideoPipDestination destination;
        synchronized (this.lock) {
            VideoPipState value = this._state.getValue();
            videoPipDestination = null;
            VideoPipState.Active active = value instanceof VideoPipState.Active ? (VideoPipState.Active) value : null;
            if (active != null && (destination = active.getDestination()) != null) {
                this._state.setValue(active.copy(null));
                videoPipDestination = destination;
            }
        }
        return videoPipDestination;
    }

    public final void clear() {
        synchronized (this.lock) {
            this._state.setValue(VideoPipState.None.INSTANCE);
            Unit unit = Unit.INSTANCE;
        }
    }
}
