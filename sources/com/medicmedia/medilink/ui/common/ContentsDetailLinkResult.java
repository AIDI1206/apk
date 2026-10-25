package com.medicmedia.medilink.ui.common;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsDetailLinkHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/ui/common/ContentsDetailLinkResult;", "", "Success", "Failure", "Lcom/medicmedia/medilink/ui/common/ContentsDetailLinkResult$Failure;", "Lcom/medicmedia/medilink/ui/common/ContentsDetailLinkResult$Success;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ContentsDetailLinkResult {

    /* JADX INFO: compiled from: ContentsDetailLinkHandler.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/common/ContentsDetailLinkResult$Success;", "Lcom/medicmedia/medilink/ui/common/ContentsDetailLinkResult;", "item", "Lcom/medicmedia/medilink/ui/common/ContentsDetailHandlingItem;", "<init>", "(Lcom/medicmedia/medilink/ui/common/ContentsDetailHandlingItem;)V", "getItem", "()Lcom/medicmedia/medilink/ui/common/ContentsDetailHandlingItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Success implements ContentsDetailLinkResult {
        public static final int $stable = 8;
        private final ContentsDetailHandlingItem item;

        public static /* synthetic */ Success copy$default(Success success, ContentsDetailHandlingItem contentsDetailHandlingItem, int i, Object obj) {
            if ((i & 1) != 0) {
                contentsDetailHandlingItem = success.item;
            }
            return success.copy(contentsDetailHandlingItem);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ContentsDetailHandlingItem getItem() {
            return this.item;
        }

        public final Success copy(ContentsDetailHandlingItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new Success(item);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.item, ((Success) other).item);
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "Success(item=" + this.item + ")";
        }

        public Success(ContentsDetailHandlingItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public final ContentsDetailHandlingItem getItem() {
            return this.item;
        }
    }

    /* JADX INFO: compiled from: ContentsDetailLinkHandler.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/common/ContentsDetailLinkResult$Failure;", "Lcom/medicmedia/medilink/ui/common/ContentsDetailLinkResult;", "messageId", "", "<init>", "(I)V", "getMessageId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Failure implements ContentsDetailLinkResult {
        public static final int $stable = 0;
        private final int messageId;

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

        public final int getMessageId() {
            return this.messageId;
        }
    }
}
