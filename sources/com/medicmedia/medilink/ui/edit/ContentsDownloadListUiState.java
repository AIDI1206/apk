package com.medicmedia.medilink.ui.edit;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsDownloadListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001/Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010'\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jj\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bHÇ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00032\b\u0010,\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010-\u001a\u00020\u0005H×\u0001J\t\u0010.\u001a\u00020\u000bH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001b¨\u00060"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/ContentsDownloadListUiState;", "", "isLoading", "", "errorMessage", "", "storageUsageProgressItem", "Lcom/medicmedia/medilink/ui/edit/StorageUsageProgressItem;", "videoProgressDialog", "Lcom/medicmedia/medilink/ui/edit/ContentProgressInfo;", "workInfo", "", "downloadCompleted", "", "secondColor", "priorityColor", "<init>", "(ZLjava/lang/Integer;Lcom/medicmedia/medilink/ui/edit/StorageUsageProgressItem;Lcom/medicmedia/medilink/ui/edit/ContentProgressInfo;Ljava/lang/String;Lkotlin/Unit;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStorageUsageProgressItem", "()Lcom/medicmedia/medilink/ui/edit/StorageUsageProgressItem;", "getVideoProgressDialog", "()Lcom/medicmedia/medilink/ui/edit/ContentProgressInfo;", "getWorkInfo", "()Ljava/lang/String;", "getDownloadCompleted", "()Lkotlin/Unit;", "Lkotlin/Unit;", "getSecondColor", "getPriorityColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZLjava/lang/Integer;Lcom/medicmedia/medilink/ui/edit/StorageUsageProgressItem;Lcom/medicmedia/medilink/ui/edit/ContentProgressInfo;Ljava/lang/String;Lkotlin/Unit;Ljava/lang/String;Ljava/lang/String;)Lcom/medicmedia/medilink/ui/edit/ContentsDownloadListUiState;", "equals", "other", "hashCode", "toString", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsDownloadListUiState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final ContentsDownloadListUiState f121default = new ContentsDownloadListUiState(false, null, null, null, null, null, null, null, 255, null);
    private final Unit downloadCompleted;
    private final Integer errorMessage;
    private final boolean isLoading;
    private final String priorityColor;
    private final String secondColor;
    private final StorageUsageProgressItem storageUsageProgressItem;
    private final ContentProgressInfo videoProgressDialog;
    private final String workInfo;

    public ContentsDownloadListUiState() {
        this(false, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ ContentsDownloadListUiState copy$default(ContentsDownloadListUiState contentsDownloadListUiState, boolean z, Integer num, StorageUsageProgressItem storageUsageProgressItem, ContentProgressInfo contentProgressInfo, String str, Unit unit, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = contentsDownloadListUiState.isLoading;
        }
        if ((i & 2) != 0) {
            num = contentsDownloadListUiState.errorMessage;
        }
        if ((i & 4) != 0) {
            storageUsageProgressItem = contentsDownloadListUiState.storageUsageProgressItem;
        }
        if ((i & 8) != 0) {
            contentProgressInfo = contentsDownloadListUiState.videoProgressDialog;
        }
        if ((i & 16) != 0) {
            str = contentsDownloadListUiState.workInfo;
        }
        if ((i & 32) != 0) {
            unit = contentsDownloadListUiState.downloadCompleted;
        }
        if ((i & 64) != 0) {
            str2 = contentsDownloadListUiState.secondColor;
        }
        if ((i & 128) != 0) {
            str3 = contentsDownloadListUiState.priorityColor;
        }
        String str4 = str2;
        String str5 = str3;
        String str6 = str;
        Unit unit2 = unit;
        return contentsDownloadListUiState.copy(z, num, storageUsageProgressItem, contentProgressInfo, str6, unit2, str4, str5);
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
    public final StorageUsageProgressItem getStorageUsageProgressItem() {
        return this.storageUsageProgressItem;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ContentProgressInfo getVideoProgressDialog() {
        return this.videoProgressDialog;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWorkInfo() {
        return this.workInfo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Unit getDownloadCompleted() {
        return this.downloadCompleted;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSecondColor() {
        return this.secondColor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPriorityColor() {
        return this.priorityColor;
    }

    public final ContentsDownloadListUiState copy(boolean isLoading, Integer errorMessage, StorageUsageProgressItem storageUsageProgressItem, ContentProgressInfo videoProgressDialog, String workInfo, Unit downloadCompleted, String secondColor, String priorityColor) {
        Intrinsics.checkNotNullParameter(storageUsageProgressItem, "storageUsageProgressItem");
        return new ContentsDownloadListUiState(isLoading, errorMessage, storageUsageProgressItem, videoProgressDialog, workInfo, downloadCompleted, secondColor, priorityColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentsDownloadListUiState)) {
            return false;
        }
        ContentsDownloadListUiState contentsDownloadListUiState = (ContentsDownloadListUiState) other;
        return this.isLoading == contentsDownloadListUiState.isLoading && Intrinsics.areEqual(this.errorMessage, contentsDownloadListUiState.errorMessage) && Intrinsics.areEqual(this.storageUsageProgressItem, contentsDownloadListUiState.storageUsageProgressItem) && Intrinsics.areEqual(this.videoProgressDialog, contentsDownloadListUiState.videoProgressDialog) && Intrinsics.areEqual(this.workInfo, contentsDownloadListUiState.workInfo) && Intrinsics.areEqual(this.downloadCompleted, contentsDownloadListUiState.downloadCompleted) && Intrinsics.areEqual(this.secondColor, contentsDownloadListUiState.secondColor) && Intrinsics.areEqual(this.priorityColor, contentsDownloadListUiState.priorityColor);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        Integer num = this.errorMessage;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.storageUsageProgressItem.hashCode()) * 31;
        ContentProgressInfo contentProgressInfo = this.videoProgressDialog;
        int iHashCode3 = (iHashCode2 + (contentProgressInfo == null ? 0 : contentProgressInfo.hashCode())) * 31;
        String str = this.workInfo;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Unit unit = this.downloadCompleted;
        int iHashCode5 = (iHashCode4 + (unit == null ? 0 : unit.hashCode())) * 31;
        String str2 = this.secondColor;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.priorityColor;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ContentsDownloadListUiState(isLoading=" + this.isLoading + ", errorMessage=" + this.errorMessage + ", storageUsageProgressItem=" + this.storageUsageProgressItem + ", videoProgressDialog=" + this.videoProgressDialog + ", workInfo=" + this.workInfo + ", downloadCompleted=" + this.downloadCompleted + ", secondColor=" + this.secondColor + ", priorityColor=" + this.priorityColor + ")";
    }

    public ContentsDownloadListUiState(boolean z, Integer num, StorageUsageProgressItem storageUsageProgressItem, ContentProgressInfo contentProgressInfo, String str, Unit unit, String str2, String str3) {
        Intrinsics.checkNotNullParameter(storageUsageProgressItem, "storageUsageProgressItem");
        this.isLoading = z;
        this.errorMessage = num;
        this.storageUsageProgressItem = storageUsageProgressItem;
        this.videoProgressDialog = contentProgressInfo;
        this.workInfo = str;
        this.downloadCompleted = unit;
        this.secondColor = str2;
        this.priorityColor = str3;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ ContentsDownloadListUiState(boolean z, Integer num, StorageUsageProgressItem storageUsageProgressItem, ContentProgressInfo contentProgressInfo, String str, Unit unit, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? new StorageUsageProgressItem(0, 0, null, false, 15, null) : storageUsageProgressItem, (i & 8) != 0 ? null : contentProgressInfo, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : unit, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3);
    }

    public final StorageUsageProgressItem getStorageUsageProgressItem() {
        return this.storageUsageProgressItem;
    }

    public final ContentProgressInfo getVideoProgressDialog() {
        return this.videoProgressDialog;
    }

    public final String getWorkInfo() {
        return this.workInfo;
    }

    public final Unit getDownloadCompleted() {
        return this.downloadCompleted;
    }

    public final String getSecondColor() {
        return this.secondColor;
    }

    public final String getPriorityColor() {
        return this.priorityColor;
    }

    /* JADX INFO: compiled from: ContentsDownloadListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/ContentsDownloadListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/edit/ContentsDownloadListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/edit/ContentsDownloadListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentsDownloadListUiState getDefault() {
            return ContentsDownloadListUiState.f121default;
        }
    }
}
