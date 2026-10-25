package com.medicmedia.medilink.ui.online;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnlineContentsViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\"\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJd\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÇ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010(\u001a\u00020\tH×\u0001J\t\u0010)\u001a\u00020\u0007H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001a¨\u0006+"}, d2 = {"Lcom/medicmedia/medilink/ui/online/OnlineContentsUiState;", "", "isLoading", "", "selectedTabType", "Lcom/medicmedia/medilink/ui/online/OnlineContentsTabType;", "subTitle", "", "progress", "", "initialUrl", "currentUrl", "isQBv4", "errorMessage", "<init>", "(ZLcom/medicmedia/medilink/ui/online/OnlineContentsTabType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)V", "()Z", "getSelectedTabType", "()Lcom/medicmedia/medilink/ui/online/OnlineContentsTabType;", "getSubTitle", "()Ljava/lang/String;", "getProgress", "()I", "getInitialUrl", "getCurrentUrl", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLcom/medicmedia/medilink/ui/online/OnlineContentsTabType;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)Lcom/medicmedia/medilink/ui/online/OnlineContentsUiState;", "equals", "other", "hashCode", "toString", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class OnlineContentsUiState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final OnlineContentsUiState f149default = new OnlineContentsUiState(false, null, null, 0, null, null, false, null, 255, null);
    private final String currentUrl;
    private final Integer errorMessage;
    private final String initialUrl;
    private final boolean isLoading;
    private final boolean isQBv4;
    private final int progress;
    private final OnlineContentsTabType selectedTabType;
    private final String subTitle;

    public OnlineContentsUiState() {
        this(false, null, null, 0, null, null, false, null, 255, null);
    }

    public static /* synthetic */ OnlineContentsUiState copy$default(OnlineContentsUiState onlineContentsUiState, boolean z, OnlineContentsTabType onlineContentsTabType, String str, int i, String str2, String str3, boolean z2, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = onlineContentsUiState.isLoading;
        }
        if ((i2 & 2) != 0) {
            onlineContentsTabType = onlineContentsUiState.selectedTabType;
        }
        if ((i2 & 4) != 0) {
            str = onlineContentsUiState.subTitle;
        }
        if ((i2 & 8) != 0) {
            i = onlineContentsUiState.progress;
        }
        if ((i2 & 16) != 0) {
            str2 = onlineContentsUiState.initialUrl;
        }
        if ((i2 & 32) != 0) {
            str3 = onlineContentsUiState.currentUrl;
        }
        if ((i2 & 64) != 0) {
            z2 = onlineContentsUiState.isQBv4;
        }
        if ((i2 & 128) != 0) {
            num = onlineContentsUiState.errorMessage;
        }
        boolean z3 = z2;
        Integer num2 = num;
        String str4 = str2;
        String str5 = str3;
        return onlineContentsUiState.copy(z, onlineContentsTabType, str, i, str4, str5, z3, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OnlineContentsTabType getSelectedTabType() {
        return this.selectedTabType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getInitialUrl() {
        return this.initialUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsQBv4() {
        return this.isQBv4;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public final OnlineContentsUiState copy(boolean isLoading, OnlineContentsTabType selectedTabType, String subTitle, int progress, String initialUrl, String currentUrl, boolean isQBv4, Integer errorMessage) {
        Intrinsics.checkNotNullParameter(selectedTabType, "selectedTabType");
        Intrinsics.checkNotNullParameter(initialUrl, "initialUrl");
        return new OnlineContentsUiState(isLoading, selectedTabType, subTitle, progress, initialUrl, currentUrl, isQBv4, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnlineContentsUiState)) {
            return false;
        }
        OnlineContentsUiState onlineContentsUiState = (OnlineContentsUiState) other;
        return this.isLoading == onlineContentsUiState.isLoading && this.selectedTabType == onlineContentsUiState.selectedTabType && Intrinsics.areEqual(this.subTitle, onlineContentsUiState.subTitle) && this.progress == onlineContentsUiState.progress && Intrinsics.areEqual(this.initialUrl, onlineContentsUiState.initialUrl) && Intrinsics.areEqual(this.currentUrl, onlineContentsUiState.currentUrl) && this.isQBv4 == onlineContentsUiState.isQBv4 && Intrinsics.areEqual(this.errorMessage, onlineContentsUiState.errorMessage);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + this.selectedTabType.hashCode()) * 31;
        String str = this.subTitle;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.progress)) * 31) + this.initialUrl.hashCode()) * 31;
        String str2 = this.currentUrl;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isQBv4)) * 31;
        Integer num = this.errorMessage;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "OnlineContentsUiState(isLoading=" + this.isLoading + ", selectedTabType=" + this.selectedTabType + ", subTitle=" + this.subTitle + ", progress=" + this.progress + ", initialUrl=" + this.initialUrl + ", currentUrl=" + this.currentUrl + ", isQBv4=" + this.isQBv4 + ", errorMessage=" + this.errorMessage + ")";
    }

    public OnlineContentsUiState(boolean z, OnlineContentsTabType selectedTabType, String str, int i, String initialUrl, String str2, boolean z2, Integer num) {
        Intrinsics.checkNotNullParameter(selectedTabType, "selectedTabType");
        Intrinsics.checkNotNullParameter(initialUrl, "initialUrl");
        this.isLoading = z;
        this.selectedTabType = selectedTabType;
        this.subTitle = str;
        this.progress = i;
        this.initialUrl = initialUrl;
        this.currentUrl = str2;
        this.isQBv4 = z2;
        this.errorMessage = num;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ OnlineContentsUiState(boolean z, OnlineContentsTabType onlineContentsTabType, String str, int i, String str2, String str3, boolean z2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? OnlineContentsTabType.GO_BACK : onlineContentsTabType, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? null : num);
    }

    public final OnlineContentsTabType getSelectedTabType() {
        return this.selectedTabType;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final String getInitialUrl() {
        return this.initialUrl;
    }

    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    public final boolean isQBv4() {
        return this.isQBv4;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: compiled from: OnlineContentsViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/online/OnlineContentsUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/online/OnlineContentsUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/online/OnlineContentsUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OnlineContentsUiState getDefault() {
            return OnlineContentsUiState.f149default;
        }
    }
}
