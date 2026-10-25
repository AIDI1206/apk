package com.medicmedia.medilink.domain.redux.store;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.redux.Action;
import com.medicmedia.medilink.domain.redux.Reducer;
import com.medicmedia.medilink.domain.redux.Store;
import com.medicmedia.medilink.domain.redux.action.ContentsAction;
import com.medicmedia.medilink.domain.redux.state.ContentsState;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsStore.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\f0\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/store/ContentsStore;", "Lcom/medicmedia/medilink/domain/redux/Store;", "Lcom/medicmedia/medilink/domain/redux/state/ContentsState;", "reducer", "Lcom/medicmedia/medilink/domain/redux/Reducer;", "<init>", "(Lcom/medicmedia/medilink/domain/redux/Reducer;)V", "_requestStartUpApi", "Lio/reactivex/subjects/PublishSubject;", "Lcom/medicmedia/medilink/domain/redux/state/ContentsState$RequestStartUpApi;", "kotlin.jvm.PlatformType", "_getContentsState", "Lcom/medicmedia/medilink/domain/redux/state/ContentsState$GetContents;", "requestStartUp", "Lio/reactivex/Observable;", "getContentsState", "dispatch", "", "action", "Lcom/medicmedia/medilink/domain/redux/Action;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ContentsStore implements Store<ContentsState> {
    private final PublishSubject<ContentsState.GetContents> _getContentsState;
    private final PublishSubject<ContentsState.RequestStartUpApi> _requestStartUpApi;
    private final Reducer<ContentsState> reducer;

    @Inject
    public ContentsStore(Reducer<ContentsState> reducer) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        this.reducer = reducer;
        PublishSubject<ContentsState.RequestStartUpApi> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        this._requestStartUpApi = publishSubjectCreate;
        PublishSubject<ContentsState.GetContents> publishSubjectCreate2 = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate2, "create(...)");
        this._getContentsState = publishSubjectCreate2;
    }

    public final Observable<ContentsState.RequestStartUpApi> requestStartUp() {
        Observable<ContentsState.RequestStartUpApi> observableHide = this._requestStartUpApi.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    public final Observable<ContentsState.GetContents> getContentsState() {
        Observable<ContentsState.GetContents> observableHide = this._getContentsState.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    @Override // com.medicmedia.medilink.domain.redux.Store
    public void dispatch(Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof ContentsAction.RequestStartUpApi) {
            ContentsState contentsState = (ContentsState) this.reducer.reduce(ContentsState.RequestStartUpApi.INSTANCE, action);
            if (contentsState instanceof ContentsState.RequestStartUpApi) {
                this._requestStartUpApi.onNext((ContentsState.RequestStartUpApi) contentsState);
                return;
            }
            return;
        }
        if (action instanceof ContentsAction.GetContents) {
            ContentsState contentsState2 = (ContentsState) this.reducer.reduce(ContentsState.GetContents.INSTANCE, action);
            if (contentsState2 instanceof ContentsState.GetContents) {
                this._getContentsState.onNext((ContentsState.GetContents) contentsState2);
            }
        }
    }
}
