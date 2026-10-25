package com.medicmedia.medilink.ui.scan;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.common.UiText;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ScanEvent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/ui/scan/ScanEvent;", "", "<init>", "()V", "StartCamera", "InvokeNativeMethod", "ShowBottomSheet", "ShowSnackbar", "ShowToastAndReset", "Lcom/medicmedia/medilink/ui/scan/ScanEvent$InvokeNativeMethod;", "Lcom/medicmedia/medilink/ui/scan/ScanEvent$ShowBottomSheet;", "Lcom/medicmedia/medilink/ui/scan/ScanEvent$ShowSnackbar;", "Lcom/medicmedia/medilink/ui/scan/ScanEvent$ShowToastAndReset;", "Lcom/medicmedia/medilink/ui/scan/ScanEvent$StartCamera;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class ScanEvent {
    public static final int $stable = 0;

    public /* synthetic */ ScanEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ScanEvent() {
    }

    /* JADX INFO: compiled from: ScanEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/scan/ScanEvent$StartCamera;", "Lcom/medicmedia/medilink/ui/scan/ScanEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class StartCamera extends ScanEvent {
        public static final int $stable = 0;
        public static final StartCamera INSTANCE = new StartCamera();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartCamera)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1050216085;
        }

        public String toString() {
            return "StartCamera";
        }

        private StartCamera() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ScanEvent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/scan/ScanEvent$InvokeNativeMethod;", "Lcom/medicmedia/medilink/ui/scan/ScanEvent;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class InvokeNativeMethod extends ScanEvent {
        public static final int $stable = 0;
        private final String url;

        public static /* synthetic */ InvokeNativeMethod copy$default(InvokeNativeMethod invokeNativeMethod, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = invokeNativeMethod.url;
            }
            return invokeNativeMethod.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final InvokeNativeMethod copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new InvokeNativeMethod(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvokeNativeMethod) && Intrinsics.areEqual(this.url, ((InvokeNativeMethod) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "InvokeNativeMethod(url=" + this.url + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvokeNativeMethod(String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public final String getUrl() {
            return this.url;
        }
    }

    /* JADX INFO: compiled from: ScanEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/scan/ScanEvent$ShowBottomSheet;", "Lcom/medicmedia/medilink/ui/scan/ScanEvent;", "model", "Lcom/medicmedia/medilink/ui/scan/BottomSheetUiModel;", "<init>", "(Lcom/medicmedia/medilink/ui/scan/BottomSheetUiModel;)V", "getModel", "()Lcom/medicmedia/medilink/ui/scan/BottomSheetUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ShowBottomSheet extends ScanEvent {
        public static final int $stable = 0;
        private final BottomSheetUiModel model;

        public static /* synthetic */ ShowBottomSheet copy$default(ShowBottomSheet showBottomSheet, BottomSheetUiModel bottomSheetUiModel, int i, Object obj) {
            if ((i & 1) != 0) {
                bottomSheetUiModel = showBottomSheet.model;
            }
            return showBottomSheet.copy(bottomSheetUiModel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BottomSheetUiModel getModel() {
            return this.model;
        }

        public final ShowBottomSheet copy(BottomSheetUiModel model) {
            Intrinsics.checkNotNullParameter(model, "model");
            return new ShowBottomSheet(model);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowBottomSheet) && Intrinsics.areEqual(this.model, ((ShowBottomSheet) other).model);
        }

        public int hashCode() {
            return this.model.hashCode();
        }

        public String toString() {
            return "ShowBottomSheet(model=" + this.model + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowBottomSheet(BottomSheetUiModel model) {
            super(null);
            Intrinsics.checkNotNullParameter(model, "model");
            this.model = model;
        }

        public final BottomSheetUiModel getModel() {
            return this.model;
        }
    }

    /* JADX INFO: compiled from: ScanEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/scan/ScanEvent$ShowSnackbar;", "Lcom/medicmedia/medilink/ui/scan/ScanEvent;", "message", "Lcom/medicmedia/medilink/ui/common/UiText;", "<init>", "(Lcom/medicmedia/medilink/ui/common/UiText;)V", "getMessage", "()Lcom/medicmedia/medilink/ui/common/UiText;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ShowSnackbar extends ScanEvent {
        public static final int $stable = 0;
        private final UiText message;

        public static /* synthetic */ ShowSnackbar copy$default(ShowSnackbar showSnackbar, UiText uiText, int i, Object obj) {
            if ((i & 1) != 0) {
                uiText = showSnackbar.message;
            }
            return showSnackbar.copy(uiText);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UiText getMessage() {
            return this.message;
        }

        public final ShowSnackbar copy(UiText message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ShowSnackbar(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowSnackbar) && Intrinsics.areEqual(this.message, ((ShowSnackbar) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "ShowSnackbar(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowSnackbar(UiText message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final UiText getMessage() {
            return this.message;
        }
    }

    /* JADX INFO: compiled from: ScanEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/scan/ScanEvent$ShowToastAndReset;", "Lcom/medicmedia/medilink/ui/scan/ScanEvent;", "message", "Lcom/medicmedia/medilink/ui/common/UiText;", "<init>", "(Lcom/medicmedia/medilink/ui/common/UiText;)V", "getMessage", "()Lcom/medicmedia/medilink/ui/common/UiText;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ShowToastAndReset extends ScanEvent {
        public static final int $stable = 0;
        private final UiText message;

        public static /* synthetic */ ShowToastAndReset copy$default(ShowToastAndReset showToastAndReset, UiText uiText, int i, Object obj) {
            if ((i & 1) != 0) {
                uiText = showToastAndReset.message;
            }
            return showToastAndReset.copy(uiText);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final UiText getMessage() {
            return this.message;
        }

        public final ShowToastAndReset copy(UiText message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new ShowToastAndReset(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowToastAndReset) && Intrinsics.areEqual(this.message, ((ShowToastAndReset) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "ShowToastAndReset(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowToastAndReset(UiText message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final UiText getMessage() {
            return this.message;
        }
    }
}
