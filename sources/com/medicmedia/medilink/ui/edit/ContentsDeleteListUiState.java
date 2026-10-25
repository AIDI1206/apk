package com.medicmedia.medilink.ui.edit;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.MultiLevelViewItem;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsDeleteListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00014Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J|\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fHÇ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u00102\u001a\u00020\u0006H×\u0001J\t\u00103\u001a\u00020\fH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0015R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#¨\u00065"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/ContentsDeleteListUiState;", "", "isLoading", "", "isDeleting", "errorMessage", "", "deleteItems", "", "Lcom/medicmedia/medilink/domain/model/MultiLevelViewItem;", "checkedIds", "", "", "storageUsageProgressItem", "Lcom/medicmedia/medilink/ui/edit/StorageUsageProgressItem;", "deleteCompleted", "", "secondColor", "priorityColor", "<init>", "(ZZLjava/lang/Integer;Ljava/util/List;Ljava/util/Set;Lcom/medicmedia/medilink/ui/edit/StorageUsageProgressItem;Lkotlin/Unit;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeleteItems", "()Ljava/util/List;", "getCheckedIds", "()Ljava/util/Set;", "getStorageUsageProgressItem", "()Lcom/medicmedia/medilink/ui/edit/StorageUsageProgressItem;", "getDeleteCompleted", "()Lkotlin/Unit;", "Lkotlin/Unit;", "getSecondColor", "()Ljava/lang/String;", "getPriorityColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZLjava/lang/Integer;Ljava/util/List;Ljava/util/Set;Lcom/medicmedia/medilink/ui/edit/StorageUsageProgressItem;Lkotlin/Unit;Ljava/lang/String;Ljava/lang/String;)Lcom/medicmedia/medilink/ui/edit/ContentsDeleteListUiState;", "equals", "other", "hashCode", "toString", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsDeleteListUiState {
    private final Set<String> checkedIds;
    private final Unit deleteCompleted;
    private final List<MultiLevelViewItem> deleteItems;
    private final Integer errorMessage;
    private final boolean isDeleting;
    private final boolean isLoading;
    private final String priorityColor;
    private final String secondColor;
    private final StorageUsageProgressItem storageUsageProgressItem;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final ContentsDeleteListUiState f119default = new ContentsDeleteListUiState(false, false, null, null, null, null, null, null, null, 511, null);

    public ContentsDeleteListUiState() {
        this(false, false, null, null, null, null, null, null, null, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentsDeleteListUiState copy$default(ContentsDeleteListUiState contentsDeleteListUiState, boolean z, boolean z2, Integer num, List list, Set set, StorageUsageProgressItem storageUsageProgressItem, Unit unit, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = contentsDeleteListUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = contentsDeleteListUiState.isDeleting;
        }
        if ((i & 4) != 0) {
            num = contentsDeleteListUiState.errorMessage;
        }
        if ((i & 8) != 0) {
            list = contentsDeleteListUiState.deleteItems;
        }
        if ((i & 16) != 0) {
            set = contentsDeleteListUiState.checkedIds;
        }
        if ((i & 32) != 0) {
            storageUsageProgressItem = contentsDeleteListUiState.storageUsageProgressItem;
        }
        if ((i & 64) != 0) {
            unit = contentsDeleteListUiState.deleteCompleted;
        }
        if ((i & 128) != 0) {
            str = contentsDeleteListUiState.secondColor;
        }
        if ((i & 256) != 0) {
            str2 = contentsDeleteListUiState.priorityColor;
        }
        String str3 = str;
        String str4 = str2;
        StorageUsageProgressItem storageUsageProgressItem2 = storageUsageProgressItem;
        Unit unit2 = unit;
        Set set2 = set;
        Integer num2 = num;
        return contentsDeleteListUiState.copy(z, z2, num2, list, set2, storageUsageProgressItem2, unit2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsDeleting() {
        return this.isDeleting;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public final List<MultiLevelViewItem> component4() {
        return this.deleteItems;
    }

    public final Set<String> component5() {
        return this.checkedIds;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final StorageUsageProgressItem getStorageUsageProgressItem() {
        return this.storageUsageProgressItem;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Unit getDeleteCompleted() {
        return this.deleteCompleted;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSecondColor() {
        return this.secondColor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPriorityColor() {
        return this.priorityColor;
    }

    public final ContentsDeleteListUiState copy(boolean isLoading, boolean isDeleting, Integer errorMessage, List<? extends MultiLevelViewItem> deleteItems, Set<String> checkedIds, StorageUsageProgressItem storageUsageProgressItem, Unit deleteCompleted, String secondColor, String priorityColor) {
        Intrinsics.checkNotNullParameter(deleteItems, "deleteItems");
        Intrinsics.checkNotNullParameter(checkedIds, "checkedIds");
        Intrinsics.checkNotNullParameter(storageUsageProgressItem, "storageUsageProgressItem");
        return new ContentsDeleteListUiState(isLoading, isDeleting, errorMessage, deleteItems, checkedIds, storageUsageProgressItem, deleteCompleted, secondColor, priorityColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentsDeleteListUiState)) {
            return false;
        }
        ContentsDeleteListUiState contentsDeleteListUiState = (ContentsDeleteListUiState) other;
        return this.isLoading == contentsDeleteListUiState.isLoading && this.isDeleting == contentsDeleteListUiState.isDeleting && Intrinsics.areEqual(this.errorMessage, contentsDeleteListUiState.errorMessage) && Intrinsics.areEqual(this.deleteItems, contentsDeleteListUiState.deleteItems) && Intrinsics.areEqual(this.checkedIds, contentsDeleteListUiState.checkedIds) && Intrinsics.areEqual(this.storageUsageProgressItem, contentsDeleteListUiState.storageUsageProgressItem) && Intrinsics.areEqual(this.deleteCompleted, contentsDeleteListUiState.deleteCompleted) && Intrinsics.areEqual(this.secondColor, contentsDeleteListUiState.secondColor) && Intrinsics.areEqual(this.priorityColor, contentsDeleteListUiState.priorityColor);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isDeleting)) * 31;
        Integer num = this.errorMessage;
        int iHashCode2 = (((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.deleteItems.hashCode()) * 31) + this.checkedIds.hashCode()) * 31) + this.storageUsageProgressItem.hashCode()) * 31;
        Unit unit = this.deleteCompleted;
        int iHashCode3 = (iHashCode2 + (unit == null ? 0 : unit.hashCode())) * 31;
        String str = this.secondColor;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.priorityColor;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ContentsDeleteListUiState(isLoading=" + this.isLoading + ", isDeleting=" + this.isDeleting + ", errorMessage=" + this.errorMessage + ", deleteItems=" + this.deleteItems + ", checkedIds=" + this.checkedIds + ", storageUsageProgressItem=" + this.storageUsageProgressItem + ", deleteCompleted=" + this.deleteCompleted + ", secondColor=" + this.secondColor + ", priorityColor=" + this.priorityColor + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ContentsDeleteListUiState(boolean z, boolean z2, Integer num, List<? extends MultiLevelViewItem> deleteItems, Set<String> checkedIds, StorageUsageProgressItem storageUsageProgressItem, Unit unit, String str, String str2) {
        Intrinsics.checkNotNullParameter(deleteItems, "deleteItems");
        Intrinsics.checkNotNullParameter(checkedIds, "checkedIds");
        Intrinsics.checkNotNullParameter(storageUsageProgressItem, "storageUsageProgressItem");
        this.isLoading = z;
        this.isDeleting = z2;
        this.errorMessage = num;
        this.deleteItems = deleteItems;
        this.checkedIds = checkedIds;
        this.storageUsageProgressItem = storageUsageProgressItem;
        this.deleteCompleted = unit;
        this.secondColor = str;
        this.priorityColor = str2;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isDeleting() {
        return this.isDeleting;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ ContentsDeleteListUiState(boolean z, boolean z2, Integer num, List list, Set set, StorageUsageProgressItem storageUsageProgressItem, Unit unit, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? null : num, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? SetsKt.emptySet() : set, (i & 32) != 0 ? new StorageUsageProgressItem(0, 0, null, false, 15, null) : storageUsageProgressItem, (i & 64) != 0 ? null : unit, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : str2);
    }

    public final List<MultiLevelViewItem> getDeleteItems() {
        return this.deleteItems;
    }

    public final Set<String> getCheckedIds() {
        return this.checkedIds;
    }

    public final StorageUsageProgressItem getStorageUsageProgressItem() {
        return this.storageUsageProgressItem;
    }

    public final Unit getDeleteCompleted() {
        return this.deleteCompleted;
    }

    public final String getSecondColor() {
        return this.secondColor;
    }

    public final String getPriorityColor() {
        return this.priorityColor;
    }

    /* JADX INFO: compiled from: ContentsDeleteListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/ContentsDeleteListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/edit/ContentsDeleteListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/edit/ContentsDeleteListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentsDeleteListUiState getDefault() {
            return ContentsDeleteListUiState.f119default;
        }
    }
}
