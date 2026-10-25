package com.medicmedia.medilink.domain.redux.state;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.redux.State;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ContentsState.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/state/ContentsState;", "Lcom/medicmedia/medilink/domain/redux/State;", "<init>", "()V", "RequestStartUpApi", "GetContents", "Lcom/medicmedia/medilink/domain/redux/state/ContentsState$GetContents;", "Lcom/medicmedia/medilink/domain/redux/state/ContentsState$RequestStartUpApi;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class ContentsState implements State {
    public /* synthetic */ ContentsState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ContentsState() {
    }

    /* JADX INFO: compiled from: ContentsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/state/ContentsState$RequestStartUpApi;", "Lcom/medicmedia/medilink/domain/redux/state/ContentsState;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class RequestStartUpApi extends ContentsState {
        public static final RequestStartUpApi INSTANCE = new RequestStartUpApi();

        private RequestStartUpApi() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ContentsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/state/ContentsState$GetContents;", "Lcom/medicmedia/medilink/domain/redux/state/ContentsState;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class GetContents extends ContentsState {
        public static final GetContents INSTANCE = new GetContents();

        private GetContents() {
            super(null);
        }
    }
}
