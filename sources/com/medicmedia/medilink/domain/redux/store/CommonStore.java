package com.medicmedia.medilink.domain.redux.store;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.redux.Action;
import com.medicmedia.medilink.domain.redux.Reducer;
import com.medicmedia.medilink.domain.redux.Store;
import com.medicmedia.medilink.domain.redux.action.CommonAction;
import com.medicmedia.medilink.domain.redux.state.CommonState;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonStore.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\f0\f0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000e0\u000e0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/store/CommonStore;", "Lcom/medicmedia/medilink/domain/redux/Store;", "Lcom/medicmedia/medilink/domain/redux/state/CommonState;", "reducer", "Lcom/medicmedia/medilink/domain/redux/Reducer;", "<init>", "(Lcom/medicmedia/medilink/domain/redux/Reducer;)V", "_reloadContents", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/medicmedia/medilink/domain/redux/state/CommonState$ReloadContents;", "kotlin.jvm.PlatformType", "_selectHistoryTab", "Lcom/medicmedia/medilink/domain/redux/state/CommonState$SelectHistoryTab;", "_dashboardDistance", "Lcom/medicmedia/medilink/domain/redux/state/CommonState$DashboardButtonDistance;", "reloadContents", "Lio/reactivex/Observable;", "selectHistoryTab", "dashboardDistance", "dispatch", "", "action", "Lcom/medicmedia/medilink/domain/redux/Action;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CommonStore implements Store<CommonState> {
    private final BehaviorSubject<CommonState.DashboardButtonDistance> _dashboardDistance;
    private final BehaviorSubject<CommonState.ReloadContents> _reloadContents;
    private final BehaviorSubject<CommonState.SelectHistoryTab> _selectHistoryTab;
    private final Reducer<CommonState> reducer;

    @Inject
    public CommonStore(Reducer<CommonState> reducer) {
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        this.reducer = reducer;
        BehaviorSubject<CommonState.ReloadContents> behaviorSubjectCreateDefault = BehaviorSubject.createDefault(new CommonState.ReloadContents(null, 1, null));
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault, "createDefault(...)");
        this._reloadContents = behaviorSubjectCreateDefault;
        BehaviorSubject<CommonState.SelectHistoryTab> behaviorSubjectCreateDefault2 = BehaviorSubject.createDefault(new CommonState.SelectHistoryTab(null, 1, null));
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault2, "createDefault(...)");
        this._selectHistoryTab = behaviorSubjectCreateDefault2;
        BehaviorSubject<CommonState.DashboardButtonDistance> behaviorSubjectCreateDefault3 = BehaviorSubject.createDefault(new CommonState.DashboardButtonDistance(null, 1, null));
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectCreateDefault3, "createDefault(...)");
        this._dashboardDistance = behaviorSubjectCreateDefault3;
    }

    public final Observable<CommonState.ReloadContents> reloadContents() {
        Observable<CommonState.ReloadContents> observableHide = this._reloadContents.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    public final Observable<CommonState.SelectHistoryTab> selectHistoryTab() {
        return this._selectHistoryTab;
    }

    public final Observable<CommonState.DashboardButtonDistance> dashboardDistance() {
        Observable<CommonState.DashboardButtonDistance> observableHide = this._dashboardDistance.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }

    @Override // com.medicmedia.medilink.domain.redux.Store
    public void dispatch(Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof CommonAction.ReloadContents) {
            Reducer<CommonState> reducer = this.reducer;
            CommonState.ReloadContents value = this._reloadContents.getValue();
            if (value == null) {
                value = new CommonState.ReloadContents(null, 1, null);
            }
            CommonState commonState = (CommonState) reducer.reduce(value, action);
            if (commonState instanceof CommonState.ReloadContents) {
                this._reloadContents.onNext((CommonState.ReloadContents) commonState);
                return;
            }
            return;
        }
        if (action instanceof CommonAction.SelectHistoryTab) {
            Reducer<CommonState> reducer2 = this.reducer;
            CommonState.SelectHistoryTab value2 = this._selectHistoryTab.getValue();
            if (value2 == null) {
                value2 = new CommonState.SelectHistoryTab(null, 1, null);
            }
            CommonState commonState2 = (CommonState) reducer2.reduce(value2, action);
            if (commonState2 instanceof CommonState.SelectHistoryTab) {
                this._selectHistoryTab.onNext((CommonState.SelectHistoryTab) commonState2);
                return;
            }
            return;
        }
        if (action instanceof CommonAction.DashboardButtonDistance) {
            Reducer<CommonState> reducer3 = this.reducer;
            CommonState.DashboardButtonDistance value3 = this._dashboardDistance.getValue();
            if (value3 == null) {
                value3 = new CommonState.DashboardButtonDistance(null, 1, null);
            }
            CommonState commonState3 = (CommonState) reducer3.reduce(value3, action);
            if (commonState3 instanceof CommonState.DashboardButtonDistance) {
                this._dashboardDistance.onNext((CommonState.DashboardButtonDistance) commonState3);
            }
        }
    }
}
