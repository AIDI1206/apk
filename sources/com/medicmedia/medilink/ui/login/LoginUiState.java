package com.medicmedia.medilink.ui.login;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.DeviceItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LoginViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u001d\u0010(\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\rHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0090\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bHÇ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\u00032\b\u0010.\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010/\u001a\u00020\u0006H×\u0001J\t\u00100\u001a\u00020\bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R%\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019¨\u00061"}, d2 = {"Lcom/medicmedia/medilink/ui/login/LoginUiState;", "", "isOnline", "", "isLoading", "resultFinish", "", "initUserNoteTab", "", "startBaristaAuth", "showWithdrawalDialog", "showTermOfServiceDialog", "showDeviceListDialog", "Lkotlin/Pair;", "", "Lcom/medicmedia/medilink/domain/model/DeviceItem;", "errorMessageId", "errorMessage", "<init>", "(ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/Pair;Ljava/lang/Integer;Ljava/lang/String;)V", "()Z", "getResultFinish", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInitUserNoteTab", "()Ljava/lang/String;", "getStartBaristaAuth", "getShowWithdrawalDialog", "getShowTermOfServiceDialog", "getShowDeviceListDialog", "()Lkotlin/Pair;", "getErrorMessageId", "getErrorMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(ZZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/Pair;Ljava/lang/Integer;Ljava/lang/String;)Lcom/medicmedia/medilink/ui/login/LoginUiState;", "equals", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class LoginUiState {
    public static final int $stable = 8;
    private final String errorMessage;
    private final Integer errorMessageId;
    private final String initUserNoteTab;
    private final boolean isLoading;
    private final boolean isOnline;
    private final Integer resultFinish;
    private final Pair<String, List<DeviceItem>> showDeviceListDialog;
    private final boolean showTermOfServiceDialog;
    private final boolean showWithdrawalDialog;
    private final String startBaristaAuth;

    public LoginUiState() {
        this(false, false, null, null, null, false, false, null, null, null, 1023, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoginUiState copy$default(LoginUiState loginUiState, boolean z, boolean z2, Integer num, String str, String str2, boolean z3, boolean z4, Pair pair, Integer num2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = loginUiState.isOnline;
        }
        if ((i & 2) != 0) {
            z2 = loginUiState.isLoading;
        }
        if ((i & 4) != 0) {
            num = loginUiState.resultFinish;
        }
        if ((i & 8) != 0) {
            str = loginUiState.initUserNoteTab;
        }
        if ((i & 16) != 0) {
            str2 = loginUiState.startBaristaAuth;
        }
        if ((i & 32) != 0) {
            z3 = loginUiState.showWithdrawalDialog;
        }
        if ((i & 64) != 0) {
            z4 = loginUiState.showTermOfServiceDialog;
        }
        if ((i & 128) != 0) {
            pair = loginUiState.showDeviceListDialog;
        }
        if ((i & 256) != 0) {
            num2 = loginUiState.errorMessageId;
        }
        if ((i & 512) != 0) {
            str3 = loginUiState.errorMessage;
        }
        Integer num3 = num2;
        String str4 = str3;
        boolean z5 = z4;
        Pair pair2 = pair;
        String str5 = str2;
        boolean z6 = z3;
        return loginUiState.copy(z, z2, num, str, str5, z6, z5, pair2, num3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsOnline() {
        return this.isOnline;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getResultFinish() {
        return this.resultFinish;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInitUserNoteTab() {
        return this.initUserNoteTab;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStartBaristaAuth() {
        return this.startBaristaAuth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShowWithdrawalDialog() {
        return this.showWithdrawalDialog;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShowTermOfServiceDialog() {
        return this.showTermOfServiceDialog;
    }

    public final Pair<String, List<DeviceItem>> component8() {
        return this.showDeviceListDialog;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getErrorMessageId() {
        return this.errorMessageId;
    }

    public final LoginUiState copy(boolean isOnline, boolean isLoading, Integer resultFinish, String initUserNoteTab, String startBaristaAuth, boolean showWithdrawalDialog, boolean showTermOfServiceDialog, Pair<String, ? extends List<DeviceItem>> showDeviceListDialog, Integer errorMessageId, String errorMessage) {
        return new LoginUiState(isOnline, isLoading, resultFinish, initUserNoteTab, startBaristaAuth, showWithdrawalDialog, showTermOfServiceDialog, showDeviceListDialog, errorMessageId, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginUiState)) {
            return false;
        }
        LoginUiState loginUiState = (LoginUiState) other;
        return this.isOnline == loginUiState.isOnline && this.isLoading == loginUiState.isLoading && Intrinsics.areEqual(this.resultFinish, loginUiState.resultFinish) && Intrinsics.areEqual(this.initUserNoteTab, loginUiState.initUserNoteTab) && Intrinsics.areEqual(this.startBaristaAuth, loginUiState.startBaristaAuth) && this.showWithdrawalDialog == loginUiState.showWithdrawalDialog && this.showTermOfServiceDialog == loginUiState.showTermOfServiceDialog && Intrinsics.areEqual(this.showDeviceListDialog, loginUiState.showDeviceListDialog) && Intrinsics.areEqual(this.errorMessageId, loginUiState.errorMessageId) && Intrinsics.areEqual(this.errorMessage, loginUiState.errorMessage);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isOnline) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        Integer num = this.resultFinish;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.initUserNoteTab;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startBaristaAuth;
        int iHashCode4 = (((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.showWithdrawalDialog)) * 31) + Boolean.hashCode(this.showTermOfServiceDialog)) * 31;
        Pair<String, List<DeviceItem>> pair = this.showDeviceListDialog;
        int iHashCode5 = (iHashCode4 + (pair == null ? 0 : pair.hashCode())) * 31;
        Integer num2 = this.errorMessageId;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.errorMessage;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "LoginUiState(isOnline=" + this.isOnline + ", isLoading=" + this.isLoading + ", resultFinish=" + this.resultFinish + ", initUserNoteTab=" + this.initUserNoteTab + ", startBaristaAuth=" + this.startBaristaAuth + ", showWithdrawalDialog=" + this.showWithdrawalDialog + ", showTermOfServiceDialog=" + this.showTermOfServiceDialog + ", showDeviceListDialog=" + this.showDeviceListDialog + ", errorMessageId=" + this.errorMessageId + ", errorMessage=" + this.errorMessage + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LoginUiState(boolean z, boolean z2, Integer num, String str, String str2, boolean z3, boolean z4, Pair<String, ? extends List<DeviceItem>> pair, Integer num2, String str3) {
        this.isOnline = z;
        this.isLoading = z2;
        this.resultFinish = num;
        this.initUserNoteTab = str;
        this.startBaristaAuth = str2;
        this.showWithdrawalDialog = z3;
        this.showTermOfServiceDialog = z4;
        this.showDeviceListDialog = pair;
        this.errorMessageId = num2;
        this.errorMessage = str3;
    }

    public /* synthetic */ LoginUiState(boolean z, boolean z2, Integer num, String str, String str2, boolean z3, boolean z4, Pair pair, Integer num2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? false : z4, (i & 128) != 0 ? null : pair, (i & 256) != 0 ? null : num2, (i & 512) != 0 ? null : str3);
    }

    public final boolean isOnline() {
        return this.isOnline;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Integer getResultFinish() {
        return this.resultFinish;
    }

    public final String getInitUserNoteTab() {
        return this.initUserNoteTab;
    }

    public final String getStartBaristaAuth() {
        return this.startBaristaAuth;
    }

    public final boolean getShowWithdrawalDialog() {
        return this.showWithdrawalDialog;
    }

    public final boolean getShowTermOfServiceDialog() {
        return this.showTermOfServiceDialog;
    }

    public final Pair<String, List<DeviceItem>> getShowDeviceListDialog() {
        return this.showDeviceListDialog;
    }

    public final Integer getErrorMessageId() {
        return this.errorMessageId;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
