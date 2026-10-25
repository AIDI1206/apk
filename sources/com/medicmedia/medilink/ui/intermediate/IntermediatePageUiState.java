package com.medicmedia.medilink.ui.intermediate;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntermediatePageViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÇ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u0005H×\u0001J\t\u0010\u001b\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/ui/intermediate/IntermediatePageUiState;", "", "isLoading", "", "errorMessage", "", "appBarTitle", "", "externalBrowser", "<init>", "(ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAppBarTitle", "()Ljava/lang/String;", "getExternalBrowser", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/medicmedia/medilink/ui/intermediate/IntermediatePageUiState;", "equals", "other", "hashCode", "toString", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class IntermediatePageUiState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final IntermediatePageUiState f134default = new IntermediatePageUiState(false, null, null, null, 15, null);
    private final String appBarTitle;
    private final Integer errorMessage;
    private final String externalBrowser;
    private final boolean isLoading;

    public IntermediatePageUiState() {
        this(false, null, null, null, 15, null);
    }

    public static /* synthetic */ IntermediatePageUiState copy$default(IntermediatePageUiState intermediatePageUiState, boolean z, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = intermediatePageUiState.isLoading;
        }
        if ((i & 2) != 0) {
            num = intermediatePageUiState.errorMessage;
        }
        if ((i & 4) != 0) {
            str = intermediatePageUiState.appBarTitle;
        }
        if ((i & 8) != 0) {
            str2 = intermediatePageUiState.externalBrowser;
        }
        return intermediatePageUiState.copy(z, num, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppBarTitle() {
        return this.appBarTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExternalBrowser() {
        return this.externalBrowser;
    }

    public final IntermediatePageUiState copy(boolean isLoading, Integer errorMessage, String appBarTitle, String externalBrowser) {
        Intrinsics.checkNotNullParameter(appBarTitle, "appBarTitle");
        return new IntermediatePageUiState(isLoading, errorMessage, appBarTitle, externalBrowser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntermediatePageUiState)) {
            return false;
        }
        IntermediatePageUiState intermediatePageUiState = (IntermediatePageUiState) other;
        return this.isLoading == intermediatePageUiState.isLoading && Intrinsics.areEqual(this.errorMessage, intermediatePageUiState.errorMessage) && Intrinsics.areEqual(this.appBarTitle, intermediatePageUiState.appBarTitle) && Intrinsics.areEqual(this.externalBrowser, intermediatePageUiState.externalBrowser);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        Integer num = this.errorMessage;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.appBarTitle.hashCode()) * 31;
        String str = this.externalBrowser;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "IntermediatePageUiState(isLoading=" + this.isLoading + ", errorMessage=" + this.errorMessage + ", appBarTitle=" + this.appBarTitle + ", externalBrowser=" + this.externalBrowser + ")";
    }

    public IntermediatePageUiState(boolean z, Integer num, String appBarTitle, String str) {
        Intrinsics.checkNotNullParameter(appBarTitle, "appBarTitle");
        this.isLoading = z;
        this.errorMessage = num;
        this.appBarTitle = appBarTitle;
        this.externalBrowser = str;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ IntermediatePageUiState(boolean z, Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : str2);
    }

    public final String getAppBarTitle() {
        return this.appBarTitle;
    }

    public final String getExternalBrowser() {
        return this.externalBrowser;
    }

    /* JADX INFO: compiled from: IntermediatePageViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/intermediate/IntermediatePageUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/intermediate/IntermediatePageUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/intermediate/IntermediatePageUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IntermediatePageUiState getDefault() {
            return IntermediatePageUiState.f134default;
        }
    }
}
