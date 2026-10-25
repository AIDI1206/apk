package com.medicmedia.medilink.ui.history;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BrowsingHistoryListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0001!BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012JN\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u0007H×\u0001J\t\u0010\u001f\u001a\u00020 H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lcom/medicmedia/medilink/ui/history/BrowsingHistoryLisUiState;", "", "isOnline", "", "isLoading", "isRefresh", "errorMessage", "", "initializationComplete", "scrollToTopWithAnimation", "<init>", "(ZZZLjava/lang/Integer;ZLjava/lang/Boolean;)V", "()Z", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInitializationComplete", "getScrollToTopWithAnimation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZZZLjava/lang/Integer;ZLjava/lang/Boolean;)Lcom/medicmedia/medilink/ui/history/BrowsingHistoryLisUiState;", "equals", "other", "hashCode", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BrowsingHistoryLisUiState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final BrowsingHistoryLisUiState f123default = new BrowsingHistoryLisUiState(false, false, false, null, false, null, 63, null);
    private final Integer errorMessage;
    private final boolean initializationComplete;
    private final boolean isLoading;
    private final boolean isOnline;
    private final boolean isRefresh;
    private final Boolean scrollToTopWithAnimation;

    public BrowsingHistoryLisUiState() {
        this(false, false, false, null, false, null, 63, null);
    }

    public static /* synthetic */ BrowsingHistoryLisUiState copy$default(BrowsingHistoryLisUiState browsingHistoryLisUiState, boolean z, boolean z2, boolean z3, Integer num, boolean z4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = browsingHistoryLisUiState.isOnline;
        }
        if ((i & 2) != 0) {
            z2 = browsingHistoryLisUiState.isLoading;
        }
        if ((i & 4) != 0) {
            z3 = browsingHistoryLisUiState.isRefresh;
        }
        if ((i & 8) != 0) {
            num = browsingHistoryLisUiState.errorMessage;
        }
        if ((i & 16) != 0) {
            z4 = browsingHistoryLisUiState.initializationComplete;
        }
        if ((i & 32) != 0) {
            bool = browsingHistoryLisUiState.scrollToTopWithAnimation;
        }
        boolean z5 = z4;
        Boolean bool2 = bool;
        return browsingHistoryLisUiState.copy(z, z2, z3, num, z5, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsOnline() {
        return this.isOnline;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsRefresh() {
        return this.isRefresh;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getInitializationComplete() {
        return this.initializationComplete;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getScrollToTopWithAnimation() {
        return this.scrollToTopWithAnimation;
    }

    public final BrowsingHistoryLisUiState copy(boolean isOnline, boolean isLoading, boolean isRefresh, Integer errorMessage, boolean initializationComplete, Boolean scrollToTopWithAnimation) {
        return new BrowsingHistoryLisUiState(isOnline, isLoading, isRefresh, errorMessage, initializationComplete, scrollToTopWithAnimation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrowsingHistoryLisUiState)) {
            return false;
        }
        BrowsingHistoryLisUiState browsingHistoryLisUiState = (BrowsingHistoryLisUiState) other;
        return this.isOnline == browsingHistoryLisUiState.isOnline && this.isLoading == browsingHistoryLisUiState.isLoading && this.isRefresh == browsingHistoryLisUiState.isRefresh && Intrinsics.areEqual(this.errorMessage, browsingHistoryLisUiState.errorMessage) && this.initializationComplete == browsingHistoryLisUiState.initializationComplete && Intrinsics.areEqual(this.scrollToTopWithAnimation, browsingHistoryLisUiState.scrollToTopWithAnimation);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.isOnline) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isRefresh)) * 31;
        Integer num = this.errorMessage;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.initializationComplete)) * 31;
        Boolean bool = this.scrollToTopWithAnimation;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "BrowsingHistoryLisUiState(isOnline=" + this.isOnline + ", isLoading=" + this.isLoading + ", isRefresh=" + this.isRefresh + ", errorMessage=" + this.errorMessage + ", initializationComplete=" + this.initializationComplete + ", scrollToTopWithAnimation=" + this.scrollToTopWithAnimation + ")";
    }

    public BrowsingHistoryLisUiState(boolean z, boolean z2, boolean z3, Integer num, boolean z4, Boolean bool) {
        this.isOnline = z;
        this.isLoading = z2;
        this.isRefresh = z3;
        this.errorMessage = num;
        this.initializationComplete = z4;
        this.scrollToTopWithAnimation = bool;
    }

    public /* synthetic */ BrowsingHistoryLisUiState(boolean z, boolean z2, boolean z3, Integer num, boolean z4, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? null : bool);
    }

    public final boolean isOnline() {
        return this.isOnline;
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

    /* JADX INFO: compiled from: BrowsingHistoryListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/history/BrowsingHistoryLisUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/history/BrowsingHistoryLisUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/history/BrowsingHistoryLisUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final BrowsingHistoryLisUiState getDefault() {
            return BrowsingHistoryLisUiState.f123default;
        }
    }
}
