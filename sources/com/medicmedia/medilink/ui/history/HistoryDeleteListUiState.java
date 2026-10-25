package com.medicmedia.medilink.ui.history;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HistoryDeleteListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0006H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryDeleteListUiState;", "", "isLoading", "", "initializationComplete", "errorMessage", "", "<init>", "(ZZLjava/lang/Integer;)V", "()Z", "getInitializationComplete", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ZZLjava/lang/Integer;)Lcom/medicmedia/medilink/ui/history/HistoryDeleteListUiState;", "equals", "other", "hashCode", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class HistoryDeleteListUiState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final HistoryDeleteListUiState f129default = new HistoryDeleteListUiState(false, false, null, 7, null);
    private final Integer errorMessage;
    private final boolean initializationComplete;
    private final boolean isLoading;

    public HistoryDeleteListUiState() {
        this(false, false, null, 7, null);
    }

    public static /* synthetic */ HistoryDeleteListUiState copy$default(HistoryDeleteListUiState historyDeleteListUiState, boolean z, boolean z2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = historyDeleteListUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = historyDeleteListUiState.initializationComplete;
        }
        if ((i & 4) != 0) {
            num = historyDeleteListUiState.errorMessage;
        }
        return historyDeleteListUiState.copy(z, z2, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getInitializationComplete() {
        return this.initializationComplete;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public final HistoryDeleteListUiState copy(boolean isLoading, boolean initializationComplete, Integer errorMessage) {
        return new HistoryDeleteListUiState(isLoading, initializationComplete, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryDeleteListUiState)) {
            return false;
        }
        HistoryDeleteListUiState historyDeleteListUiState = (HistoryDeleteListUiState) other;
        return this.isLoading == historyDeleteListUiState.isLoading && this.initializationComplete == historyDeleteListUiState.initializationComplete && Intrinsics.areEqual(this.errorMessage, historyDeleteListUiState.errorMessage);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.initializationComplete)) * 31;
        Integer num = this.errorMessage;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "HistoryDeleteListUiState(isLoading=" + this.isLoading + ", initializationComplete=" + this.initializationComplete + ", errorMessage=" + this.errorMessage + ")";
    }

    public HistoryDeleteListUiState(boolean z, boolean z2, Integer num) {
        this.isLoading = z;
        this.initializationComplete = z2;
        this.errorMessage = num;
    }

    public /* synthetic */ HistoryDeleteListUiState(boolean z, boolean z2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : num);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getInitializationComplete() {
        return this.initializationComplete;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: compiled from: HistoryDeleteListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryDeleteListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/history/HistoryDeleteListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/history/HistoryDeleteListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HistoryDeleteListUiState getDefault() {
            return HistoryDeleteListUiState.f129default;
        }
    }
}
