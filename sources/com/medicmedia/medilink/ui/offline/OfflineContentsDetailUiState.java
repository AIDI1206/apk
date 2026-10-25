package com.medicmedia.medilink.ui.offline;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.medicmedia.medilink.domain.model.NoteViewItem;
import com.medicmedia.medilink.ui.common.JavascriptAction;
import com.medicmedia.medilink.ui.common.UIError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OfflineContentsDetailViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001>B\u0095\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\t\u00102\u001a\u00020\rHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u009c\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÇ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010<\u001a\u00020\bH×\u0001J\t\u0010=\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006?"}, d2 = {"Lcom/medicmedia/medilink/ui/offline/OfflineContentsDetailUiState;", "", "initialUrl", "", "currentUrl", "isLoading", "", "progress", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/ui/common/UIError;", "errorMessage", "args", "Lcom/medicmedia/medilink/ui/offline/OfflineContentsWebViewArgs;", "currentTagId", "searchByApp", "showImagePreview", "showMemoBottomSheet", "Lcom/medicmedia/medilink/domain/model/NoteViewItem;", "javascriptActions", "", "Lcom/medicmedia/medilink/ui/common/JavascriptAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILcom/medicmedia/medilink/ui/common/UIError;Ljava/lang/Integer;Lcom/medicmedia/medilink/ui/offline/OfflineContentsWebViewArgs;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/medicmedia/medilink/domain/model/NoteViewItem;Ljava/util/List;)V", "getInitialUrl", "()Ljava/lang/String;", "getCurrentUrl", "()Z", "getProgress", "()I", "getError", "()Lcom/medicmedia/medilink/ui/common/UIError;", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getArgs", "()Lcom/medicmedia/medilink/ui/offline/OfflineContentsWebViewArgs;", "getCurrentTagId", "getSearchByApp", "getShowImagePreview", "getShowMemoBottomSheet", "()Lcom/medicmedia/medilink/domain/model/NoteViewItem;", "getJavascriptActions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;ZILcom/medicmedia/medilink/ui/common/UIError;Ljava/lang/Integer;Lcom/medicmedia/medilink/ui/offline/OfflineContentsWebViewArgs;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/medicmedia/medilink/domain/model/NoteViewItem;Ljava/util/List;)Lcom/medicmedia/medilink/ui/offline/OfflineContentsDetailUiState;", "equals", "other", "hashCode", "toString", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class OfflineContentsDetailUiState {
    private final OfflineContentsWebViewArgs args;
    private final String currentTagId;
    private final String currentUrl;
    private final UIError error;
    private final Integer errorMessage;
    private final String initialUrl;
    private final boolean isLoading;
    private final List<JavascriptAction> javascriptActions;
    private final int progress;
    private final String searchByApp;
    private final String showImagePreview;
    private final NoteViewItem showMemoBottomSheet;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final OfflineContentsDetailUiState f146default = new OfflineContentsDetailUiState(null, null, false, 0, null, null, null, null, null, null, null, null, 4095, null);

    public OfflineContentsDetailUiState() {
        this(null, null, false, 0, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfflineContentsDetailUiState copy$default(OfflineContentsDetailUiState offlineContentsDetailUiState, String str, String str2, boolean z, int i, UIError uIError, Integer num, OfflineContentsWebViewArgs offlineContentsWebViewArgs, String str3, String str4, String str5, NoteViewItem noteViewItem, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = offlineContentsDetailUiState.initialUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = offlineContentsDetailUiState.currentUrl;
        }
        if ((i2 & 4) != 0) {
            z = offlineContentsDetailUiState.isLoading;
        }
        if ((i2 & 8) != 0) {
            i = offlineContentsDetailUiState.progress;
        }
        if ((i2 & 16) != 0) {
            uIError = offlineContentsDetailUiState.error;
        }
        if ((i2 & 32) != 0) {
            num = offlineContentsDetailUiState.errorMessage;
        }
        if ((i2 & 64) != 0) {
            offlineContentsWebViewArgs = offlineContentsDetailUiState.args;
        }
        if ((i2 & 128) != 0) {
            str3 = offlineContentsDetailUiState.currentTagId;
        }
        if ((i2 & 256) != 0) {
            str4 = offlineContentsDetailUiState.searchByApp;
        }
        if ((i2 & 512) != 0) {
            str5 = offlineContentsDetailUiState.showImagePreview;
        }
        if ((i2 & 1024) != 0) {
            noteViewItem = offlineContentsDetailUiState.showMemoBottomSheet;
        }
        if ((i2 & 2048) != 0) {
            list = offlineContentsDetailUiState.javascriptActions;
        }
        NoteViewItem noteViewItem2 = noteViewItem;
        List list2 = list;
        String str6 = str4;
        String str7 = str5;
        OfflineContentsWebViewArgs offlineContentsWebViewArgs2 = offlineContentsWebViewArgs;
        String str8 = str3;
        UIError uIError2 = uIError;
        Integer num2 = num;
        return offlineContentsDetailUiState.copy(str, str2, z, i, uIError2, num2, offlineContentsWebViewArgs2, str8, str6, str7, noteViewItem2, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInitialUrl() {
        return this.initialUrl;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getShowImagePreview() {
        return this.showImagePreview;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final NoteViewItem getShowMemoBottomSheet() {
        return this.showMemoBottomSheet;
    }

    public final List<JavascriptAction> component12() {
        return this.javascriptActions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final UIError getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final OfflineContentsWebViewArgs getArgs() {
        return this.args;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCurrentTagId() {
        return this.currentTagId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSearchByApp() {
        return this.searchByApp;
    }

    public final OfflineContentsDetailUiState copy(String initialUrl, String currentUrl, boolean isLoading, int progress, UIError error, Integer errorMessage, OfflineContentsWebViewArgs args, String currentTagId, String searchByApp, String showImagePreview, NoteViewItem showMemoBottomSheet, List<? extends JavascriptAction> javascriptActions) {
        Intrinsics.checkNotNullParameter(initialUrl, "initialUrl");
        Intrinsics.checkNotNullParameter(args, "args");
        return new OfflineContentsDetailUiState(initialUrl, currentUrl, isLoading, progress, error, errorMessage, args, currentTagId, searchByApp, showImagePreview, showMemoBottomSheet, javascriptActions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineContentsDetailUiState)) {
            return false;
        }
        OfflineContentsDetailUiState offlineContentsDetailUiState = (OfflineContentsDetailUiState) other;
        return Intrinsics.areEqual(this.initialUrl, offlineContentsDetailUiState.initialUrl) && Intrinsics.areEqual(this.currentUrl, offlineContentsDetailUiState.currentUrl) && this.isLoading == offlineContentsDetailUiState.isLoading && this.progress == offlineContentsDetailUiState.progress && Intrinsics.areEqual(this.error, offlineContentsDetailUiState.error) && Intrinsics.areEqual(this.errorMessage, offlineContentsDetailUiState.errorMessage) && Intrinsics.areEqual(this.args, offlineContentsDetailUiState.args) && Intrinsics.areEqual(this.currentTagId, offlineContentsDetailUiState.currentTagId) && Intrinsics.areEqual(this.searchByApp, offlineContentsDetailUiState.searchByApp) && Intrinsics.areEqual(this.showImagePreview, offlineContentsDetailUiState.showImagePreview) && Intrinsics.areEqual(this.showMemoBottomSheet, offlineContentsDetailUiState.showMemoBottomSheet) && Intrinsics.areEqual(this.javascriptActions, offlineContentsDetailUiState.javascriptActions);
    }

    public int hashCode() {
        int iHashCode = this.initialUrl.hashCode() * 31;
        String str = this.currentUrl;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Integer.hashCode(this.progress)) * 31;
        UIError uIError = this.error;
        int iHashCode3 = (iHashCode2 + (uIError == null ? 0 : uIError.hashCode())) * 31;
        Integer num = this.errorMessage;
        int iHashCode4 = (((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + this.args.hashCode()) * 31;
        String str2 = this.currentTagId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.searchByApp;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.showImagePreview;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        NoteViewItem noteViewItem = this.showMemoBottomSheet;
        int iHashCode8 = (iHashCode7 + (noteViewItem == null ? 0 : noteViewItem.hashCode())) * 31;
        List<JavascriptAction> list = this.javascriptActions;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "OfflineContentsDetailUiState(initialUrl=" + this.initialUrl + ", currentUrl=" + this.currentUrl + ", isLoading=" + this.isLoading + ", progress=" + this.progress + ", error=" + this.error + ", errorMessage=" + this.errorMessage + ", args=" + this.args + ", currentTagId=" + this.currentTagId + ", searchByApp=" + this.searchByApp + ", showImagePreview=" + this.showImagePreview + ", showMemoBottomSheet=" + this.showMemoBottomSheet + ", javascriptActions=" + this.javascriptActions + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OfflineContentsDetailUiState(String initialUrl, String str, boolean z, int i, UIError uIError, Integer num, OfflineContentsWebViewArgs args, String str2, String str3, String str4, NoteViewItem noteViewItem, List<? extends JavascriptAction> list) {
        Intrinsics.checkNotNullParameter(initialUrl, "initialUrl");
        Intrinsics.checkNotNullParameter(args, "args");
        this.initialUrl = initialUrl;
        this.currentUrl = str;
        this.isLoading = z;
        this.progress = i;
        this.error = uIError;
        this.errorMessage = num;
        this.args = args;
        this.currentTagId = str2;
        this.searchByApp = str3;
        this.showImagePreview = str4;
        this.showMemoBottomSheet = noteViewItem;
        this.javascriptActions = list;
    }

    public /* synthetic */ OfflineContentsDetailUiState(String str, String str2, boolean z, int i, UIError uIError, Integer num, OfflineContentsWebViewArgs offlineContentsWebViewArgs, String str3, String str4, String str5, NoteViewItem noteViewItem, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : uIError, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? new OfflineContentsWebViewArgs(null, null, null, 0, null, null, 63, null) : offlineContentsWebViewArgs, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4, (i2 & 512) != 0 ? null : str5, (i2 & 1024) != 0 ? null : noteViewItem, (i2 & 2048) != 0 ? null : list);
    }

    public final String getInitialUrl() {
        return this.initialUrl;
    }

    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final UIError getError() {
        return this.error;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public final OfflineContentsWebViewArgs getArgs() {
        return this.args;
    }

    public final String getCurrentTagId() {
        return this.currentTagId;
    }

    public final String getSearchByApp() {
        return this.searchByApp;
    }

    public final String getShowImagePreview() {
        return this.showImagePreview;
    }

    public final NoteViewItem getShowMemoBottomSheet() {
        return this.showMemoBottomSheet;
    }

    public final List<JavascriptAction> getJavascriptActions() {
        return this.javascriptActions;
    }

    /* JADX INFO: compiled from: OfflineContentsDetailViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/offline/OfflineContentsDetailUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/offline/OfflineContentsDetailUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/offline/OfflineContentsDetailUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OfflineContentsDetailUiState getDefault() {
            return OfflineContentsDetailUiState.f146default;
        }
    }
}
