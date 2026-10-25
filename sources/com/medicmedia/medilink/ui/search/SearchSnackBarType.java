package com.medicmedia.medilink.ui.search;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\t\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchSnackBarType;", "", "messageId", "", "getMessageId", "()I", "actionLabelId", "getActionLabelId", "()Ljava/lang/Integer;", "NotPurchase", "NotDownloadWithButton", "NotDownload", "Lcom/medicmedia/medilink/ui/search/SearchSnackBarType$NotDownload;", "Lcom/medicmedia/medilink/ui/search/SearchSnackBarType$NotDownloadWithButton;", "Lcom/medicmedia/medilink/ui/search/SearchSnackBarType$NotPurchase;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SearchSnackBarType {
    Integer getActionLabelId();

    int getMessageId();

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0003H×\u0001J\t\u0010\u001a\u001a\u00020\u0006H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchSnackBarType$NotPurchase;", "Lcom/medicmedia/medilink/ui/search/SearchSnackBarType;", "messageId", "", "actionLabelId", "storeUrl", "", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;)V", "getMessageId", "()I", "getActionLabelId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStoreUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/String;)Lcom/medicmedia/medilink/ui/search/SearchSnackBarType$NotPurchase;", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class NotPurchase implements SearchSnackBarType {
        public static final int $stable = 0;
        private final Integer actionLabelId;
        private final int messageId;
        private final String storeUrl;

        public static /* synthetic */ NotPurchase copy$default(NotPurchase notPurchase, int i, Integer num, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = notPurchase.messageId;
            }
            if ((i2 & 2) != 0) {
                num = notPurchase.actionLabelId;
            }
            if ((i2 & 4) != 0) {
                str = notPurchase.storeUrl;
            }
            return notPurchase.copy(i, num, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getActionLabelId() {
            return this.actionLabelId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getStoreUrl() {
            return this.storeUrl;
        }

        public final NotPurchase copy(int messageId, Integer actionLabelId, String storeUrl) {
            return new NotPurchase(messageId, actionLabelId, storeUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotPurchase)) {
                return false;
            }
            NotPurchase notPurchase = (NotPurchase) other;
            return this.messageId == notPurchase.messageId && Intrinsics.areEqual(this.actionLabelId, notPurchase.actionLabelId) && Intrinsics.areEqual(this.storeUrl, notPurchase.storeUrl);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.messageId) * 31;
            Integer num = this.actionLabelId;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.storeUrl;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "NotPurchase(messageId=" + this.messageId + ", actionLabelId=" + this.actionLabelId + ", storeUrl=" + this.storeUrl + ")";
        }

        public NotPurchase(int i, Integer num, String str) {
            this.messageId = i;
            this.actionLabelId = num;
            this.storeUrl = str;
        }

        public /* synthetic */ NotPurchase(int i, Integer num, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.search_list_not_purchase_message : i, (i2 & 2) != 0 ? Integer.valueOf(R.string.search_list_not_purchase_button) : num, str);
        }

        @Override // com.medicmedia.medilink.ui.search.SearchSnackBarType
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.ui.search.SearchSnackBarType
        public Integer getActionLabelId() {
            return this.actionLabelId;
        }

        public final String getStoreUrl() {
            return this.storeUrl;
        }
    }

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0003H×\u0001J\t\u0010\u001a\u001a\u00020\u0006H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchSnackBarType$NotDownloadWithButton;", "Lcom/medicmedia/medilink/ui/search/SearchSnackBarType;", "messageId", "", "actionLabelId", "contentCode", "", "<init>", "(ILjava/lang/Integer;Ljava/lang/String;)V", "getMessageId", "()I", "getActionLabelId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getContentCode", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/Integer;Ljava/lang/String;)Lcom/medicmedia/medilink/ui/search/SearchSnackBarType$NotDownloadWithButton;", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class NotDownloadWithButton implements SearchSnackBarType {
        public static final int $stable = 0;
        private final Integer actionLabelId;
        private final String contentCode;
        private final int messageId;

        public static /* synthetic */ NotDownloadWithButton copy$default(NotDownloadWithButton notDownloadWithButton, int i, Integer num, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = notDownloadWithButton.messageId;
            }
            if ((i2 & 2) != 0) {
                num = notDownloadWithButton.actionLabelId;
            }
            if ((i2 & 4) != 0) {
                str = notDownloadWithButton.contentCode;
            }
            return notDownloadWithButton.copy(i, num, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getActionLabelId() {
            return this.actionLabelId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getContentCode() {
            return this.contentCode;
        }

        public final NotDownloadWithButton copy(int messageId, Integer actionLabelId, String contentCode) {
            Intrinsics.checkNotNullParameter(contentCode, "contentCode");
            return new NotDownloadWithButton(messageId, actionLabelId, contentCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotDownloadWithButton)) {
                return false;
            }
            NotDownloadWithButton notDownloadWithButton = (NotDownloadWithButton) other;
            return this.messageId == notDownloadWithButton.messageId && Intrinsics.areEqual(this.actionLabelId, notDownloadWithButton.actionLabelId) && Intrinsics.areEqual(this.contentCode, notDownloadWithButton.contentCode);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.messageId) * 31;
            Integer num = this.actionLabelId;
            return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.contentCode.hashCode();
        }

        public String toString() {
            return "NotDownloadWithButton(messageId=" + this.messageId + ", actionLabelId=" + this.actionLabelId + ", contentCode=" + this.contentCode + ")";
        }

        public NotDownloadWithButton(int i, Integer num, String contentCode) {
            Intrinsics.checkNotNullParameter(contentCode, "contentCode");
            this.messageId = i;
            this.actionLabelId = num;
            this.contentCode = contentCode;
        }

        public /* synthetic */ NotDownloadWithButton(int i, Integer num, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.not_download_message : i, (i2 & 2) != 0 ? Integer.valueOf(R.string.not_download_button) : num, str);
        }

        @Override // com.medicmedia.medilink.ui.search.SearchSnackBarType
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.ui.search.SearchSnackBarType
        public Integer getActionLabelId() {
            return this.actionLabelId;
        }

        public final String getContentCode() {
            return this.contentCode;
        }
    }

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchSnackBarType$NotDownload;", "Lcom/medicmedia/medilink/ui/search/SearchSnackBarType;", "messageId", "", "actionLabelId", "<init>", "(ILjava/lang/Integer;)V", "getMessageId", "()I", "getActionLabelId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ILjava/lang/Integer;)Lcom/medicmedia/medilink/ui/search/SearchSnackBarType$NotDownload;", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class NotDownload implements SearchSnackBarType {
        public static final int $stable = 0;
        private final Integer actionLabelId;
        private final int messageId;

        public NotDownload() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ NotDownload copy$default(NotDownload notDownload, int i, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = notDownload.messageId;
            }
            if ((i2 & 2) != 0) {
                num = notDownload.actionLabelId;
            }
            return notDownload.copy(i, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Integer getActionLabelId() {
            return this.actionLabelId;
        }

        public final NotDownload copy(int messageId, Integer actionLabelId) {
            return new NotDownload(messageId, actionLabelId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotDownload)) {
                return false;
            }
            NotDownload notDownload = (NotDownload) other;
            return this.messageId == notDownload.messageId && Intrinsics.areEqual(this.actionLabelId, notDownload.actionLabelId);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.messageId) * 31;
            Integer num = this.actionLabelId;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "NotDownload(messageId=" + this.messageId + ", actionLabelId=" + this.actionLabelId + ")";
        }

        public NotDownload(int i, Integer num) {
            this.messageId = i;
            this.actionLabelId = num;
        }

        public /* synthetic */ NotDownload(int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.not_download_message : i, (i2 & 2) != 0 ? null : num);
        }

        @Override // com.medicmedia.medilink.ui.search.SearchSnackBarType
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.ui.search.SearchSnackBarType
        public Integer getActionLabelId() {
            return this.actionLabelId;
        }
    }
}
