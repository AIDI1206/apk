package com.medicmedia.medilink.ui.scan;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.ui.common.UiText;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BottomSheetUiModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/ui/scan/BottomSheetUiModel;", "", HistoryRepositoryImpl.FieldName.TITLE, "Lcom/medicmedia/medilink/ui/common/UiText;", "message", "<init>", "(Lcom/medicmedia/medilink/ui/common/UiText;Lcom/medicmedia/medilink/ui/common/UiText;)V", "getTitle", "()Lcom/medicmedia/medilink/ui/common/UiText;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BottomSheetUiModel {
    public static final int $stable = 0;
    private final UiText message;
    private final UiText title;

    public static /* synthetic */ BottomSheetUiModel copy$default(BottomSheetUiModel bottomSheetUiModel, UiText uiText, UiText uiText2, int i, Object obj) {
        if ((i & 1) != 0) {
            uiText = bottomSheetUiModel.title;
        }
        if ((i & 2) != 0) {
            uiText2 = bottomSheetUiModel.message;
        }
        return bottomSheetUiModel.copy(uiText, uiText2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UiText getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UiText getMessage() {
        return this.message;
    }

    public final BottomSheetUiModel copy(UiText title, UiText message) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new BottomSheetUiModel(title, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetUiModel)) {
            return false;
        }
        BottomSheetUiModel bottomSheetUiModel = (BottomSheetUiModel) other;
        return Intrinsics.areEqual(this.title, bottomSheetUiModel.title) && Intrinsics.areEqual(this.message, bottomSheetUiModel.message);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        UiText uiText = this.message;
        return iHashCode + (uiText == null ? 0 : uiText.hashCode());
    }

    public String toString() {
        return "BottomSheetUiModel(title=" + this.title + ", message=" + this.message + ")";
    }

    public BottomSheetUiModel(UiText title, UiText uiText) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.message = uiText;
    }

    public /* synthetic */ BottomSheetUiModel(UiText uiText, UiText uiText2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiText, (i & 2) != 0 ? null : uiText2);
    }

    public final UiText getTitle() {
        return this.title;
    }

    public final UiText getMessage() {
        return this.message;
    }
}
