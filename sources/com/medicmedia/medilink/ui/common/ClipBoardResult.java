package com.medicmedia.medilink.ui.common;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ClipBoardHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/ui/common/ClipBoardResult;", "", "messageId", "", "getMessageId", "()I", "Success", "Failure", "Lcom/medicmedia/medilink/ui/common/ClipBoardResult$Failure;", "Lcom/medicmedia/medilink/ui/common/ClipBoardResult$Success;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ClipBoardResult {
    int getMessageId();

    /* JADX INFO: compiled from: ClipBoardHelper.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/ClipBoardResult$Success;", "Lcom/medicmedia/medilink/ui/common/ClipBoardResult;", "messageId", "", "<init>", "(I)V", "getMessageId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Success implements ClipBoardResult {
        public static final int $stable = 0;
        private final int messageId;

        public Success() {
            this(0, 1, null);
        }

        public static /* synthetic */ Success copy$default(Success success, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = success.messageId;
            }
            return success.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        public final Success copy(int messageId) {
            return new Success(messageId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && this.messageId == ((Success) other).messageId;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageId);
        }

        public String toString() {
            return "Success(messageId=" + this.messageId + ")";
        }

        public Success(int i) {
            this.messageId = i;
        }

        public /* synthetic */ Success(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.offline_contents_image_copy : i);
        }

        @Override // com.medicmedia.medilink.ui.common.ClipBoardResult
        public int getMessageId() {
            return this.messageId;
        }
    }

    /* JADX INFO: compiled from: ClipBoardHelper.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/ClipBoardResult$Failure;", "Lcom/medicmedia/medilink/ui/common/ClipBoardResult;", "messageId", "", "<init>", "(I)V", "getMessageId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Failure implements ClipBoardResult {
        public static final int $stable = 0;
        private final int messageId;

        public Failure() {
            this(0, 1, null);
        }

        public static /* synthetic */ Failure copy$default(Failure failure, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = failure.messageId;
            }
            return failure.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        public final Failure copy(int messageId) {
            return new Failure(messageId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && this.messageId == ((Failure) other).messageId;
        }

        public int hashCode() {
            return Integer.hashCode(this.messageId);
        }

        public String toString() {
            return "Failure(messageId=" + this.messageId + ")";
        }

        public Failure(int i) {
            this.messageId = i;
        }

        public /* synthetic */ Failure(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.offline_contents_image_copy_error : i);
        }

        @Override // com.medicmedia.medilink.ui.common.ClipBoardResult
        public int getMessageId() {
            return this.messageId;
        }
    }
}
