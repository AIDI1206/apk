package com.medicmedia.medilink.ui.history;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WritingHistoryListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u0006H×\u0001J\t\u0010\u001d\u001a\u00020\u001eH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/medicmedia/medilink/ui/history/WritingHistoryListUiState;", "", "isLoading", "", "isRefresh", "errorMessage", "", "initializationComplete", "scrollToTopWithAnimation", "<init>", "(ZZLjava/lang/Integer;ZLjava/lang/Boolean;)V", "()Z", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInitializationComplete", "getScrollToTopWithAnimation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "copy", "(ZZLjava/lang/Integer;ZLjava/lang/Boolean;)Lcom/medicmedia/medilink/ui/history/WritingHistoryListUiState;", "equals", "other", "hashCode", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class WritingHistoryListUiState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final WritingHistoryListUiState f131default = new WritingHistoryListUiState(false, false, null, false, null, 31, null);
    private final Integer errorMessage;
    private final boolean initializationComplete;
    private final boolean isLoading;
    private final boolean isRefresh;
    private final Boolean scrollToTopWithAnimation;

    public WritingHistoryListUiState() {
        this(false, false, null, false, null, 31, null);
    }

    public static /* synthetic */ WritingHistoryListUiState copy$default(WritingHistoryListUiState writingHistoryListUiState, boolean z, boolean z2, Integer num, boolean z3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = writingHistoryListUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = writingHistoryListUiState.isRefresh;
        }
        if ((i & 4) != 0) {
            num = writingHistoryListUiState.errorMessage;
        }
        if ((i & 8) != 0) {
            z3 = writingHistoryListUiState.initializationComplete;
        }
        if ((i & 16) != 0) {
            bool = writingHistoryListUiState.scrollToTopWithAnimation;
        }
        Boolean bool2 = bool;
        Integer num2 = num;
        return writingHistoryListUiState.copy(z, z2, num2, z3, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsRefresh() {
        return this.isRefresh;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getInitializationComplete() {
        return this.initializationComplete;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getScrollToTopWithAnimation() {
        return this.scrollToTopWithAnimation;
    }

    public final WritingHistoryListUiState copy(boolean isLoading, boolean isRefresh, Integer errorMessage, boolean initializationComplete, Boolean scrollToTopWithAnimation) {
        return new WritingHistoryListUiState(isLoading, isRefresh, errorMessage, initializationComplete, scrollToTopWithAnimation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WritingHistoryListUiState)) {
            return false;
        }
        WritingHistoryListUiState writingHistoryListUiState = (WritingHistoryListUiState) other;
        return this.isLoading == writingHistoryListUiState.isLoading && this.isRefresh == writingHistoryListUiState.isRefresh && Intrinsics.areEqual(this.errorMessage, writingHistoryListUiState.errorMessage) && this.initializationComplete == writingHistoryListUiState.initializationComplete && Intrinsics.areEqual(this.scrollToTopWithAnimation, writingHistoryListUiState.scrollToTopWithAnimation);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isRefresh)) * 31;
        Integer num = this.errorMessage;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.initializationComplete)) * 31;
        Boolean bool = this.scrollToTopWithAnimation;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "WritingHistoryListUiState(isLoading=" + this.isLoading + ", isRefresh=" + this.isRefresh + ", errorMessage=" + this.errorMessage + ", initializationComplete=" + this.initializationComplete + ", scrollToTopWithAnimation=" + this.scrollToTopWithAnimation + ")";
    }

    public WritingHistoryListUiState(boolean z, boolean z2, Integer num, boolean z3, Boolean bool) {
        this.isLoading = z;
        this.isRefresh = z2;
        this.errorMessage = num;
        this.initializationComplete = z3;
        this.scrollToTopWithAnimation = bool;
    }

    public /* synthetic */ WritingHistoryListUiState(boolean z, boolean z2, Integer num, boolean z3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : bool);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isRefresh() {
        return this.isRefresh;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getInitializationComplete() {
        return this.initializationComplete;
    }

    public final Boolean getScrollToTopWithAnimation() {
        return this.scrollToTopWithAnimation;
    }

    /* JADX INFO: compiled from: WritingHistoryListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/history/WritingHistoryListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/history/WritingHistoryListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/history/WritingHistoryListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WritingHistoryListUiState getDefault() {
            return WritingHistoryListUiState.f131default;
        }
    }
}
