package com.medicmedia.medilink.ui.scan;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CameraScanScreen.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/scan/CameraScanUiState;", "", "showPopupMenu", "", "bottomSheetUiModel", "Lcom/medicmedia/medilink/ui/scan/BottomSheetUiModel;", "<init>", "(ZLcom/medicmedia/medilink/ui/scan/BottomSheetUiModel;)V", "getShowPopupMenu", "()Z", "getBottomSheetUiModel", "()Lcom/medicmedia/medilink/ui/scan/BottomSheetUiModel;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
final /* data */ class CameraScanUiState {
    private final BottomSheetUiModel bottomSheetUiModel;
    private final boolean showPopupMenu;

    public CameraScanUiState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CameraScanUiState copy$default(CameraScanUiState cameraScanUiState, boolean z, BottomSheetUiModel bottomSheetUiModel, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cameraScanUiState.showPopupMenu;
        }
        if ((i & 2) != 0) {
            bottomSheetUiModel = cameraScanUiState.bottomSheetUiModel;
        }
        return cameraScanUiState.copy(z, bottomSheetUiModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowPopupMenu() {
        return this.showPopupMenu;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BottomSheetUiModel getBottomSheetUiModel() {
        return this.bottomSheetUiModel;
    }

    public final CameraScanUiState copy(boolean showPopupMenu, BottomSheetUiModel bottomSheetUiModel) {
        return new CameraScanUiState(showPopupMenu, bottomSheetUiModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CameraScanUiState)) {
            return false;
        }
        CameraScanUiState cameraScanUiState = (CameraScanUiState) other;
        return this.showPopupMenu == cameraScanUiState.showPopupMenu && Intrinsics.areEqual(this.bottomSheetUiModel, cameraScanUiState.bottomSheetUiModel);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showPopupMenu) * 31;
        BottomSheetUiModel bottomSheetUiModel = this.bottomSheetUiModel;
        return iHashCode + (bottomSheetUiModel == null ? 0 : bottomSheetUiModel.hashCode());
    }

    public String toString() {
        return "CameraScanUiState(showPopupMenu=" + this.showPopupMenu + ", bottomSheetUiModel=" + this.bottomSheetUiModel + ")";
    }

    public CameraScanUiState(boolean z, BottomSheetUiModel bottomSheetUiModel) {
        this.showPopupMenu = z;
        this.bottomSheetUiModel = bottomSheetUiModel;
    }

    public /* synthetic */ CameraScanUiState(boolean z, BottomSheetUiModel bottomSheetUiModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : bottomSheetUiModel);
    }

    public final boolean getShowPopupMenu() {
        return this.showPopupMenu;
    }

    public final BottomSheetUiModel getBottomSheetUiModel() {
        return this.bottomSheetUiModel;
    }
}
