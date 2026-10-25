package com.medicmedia.medilink.ui.search;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SearchListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType;", "", "messageId", "", "getMessageId", "()I", "buttonTitleId", "getButtonTitleId", "RetryOffline", "DisableOnline", "Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType$DisableOnline;", "Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType$RetryOffline;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SearchHeaderMessageType {
    int getButtonTitleId();

    int getMessageId();

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType$RetryOffline;", "Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType;", "messageId", "", "buttonTitleId", "<init>", "(II)V", "getMessageId", "()I", "getButtonTitleId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class RetryOffline implements SearchHeaderMessageType {
        public static final int $stable = 0;
        private final int buttonTitleId;
        private final int messageId;

        /* JADX WARN: Illegal instructions before constructor call */
        public RetryOffline() {
            int i = 0;
            this(i, i, 3, null);
        }

        public static /* synthetic */ RetryOffline copy$default(RetryOffline retryOffline, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = retryOffline.messageId;
            }
            if ((i3 & 2) != 0) {
                i2 = retryOffline.buttonTitleId;
            }
            return retryOffline.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getButtonTitleId() {
            return this.buttonTitleId;
        }

        public final RetryOffline copy(int messageId, int buttonTitleId) {
            return new RetryOffline(messageId, buttonTitleId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RetryOffline)) {
                return false;
            }
            RetryOffline retryOffline = (RetryOffline) other;
            return this.messageId == retryOffline.messageId && this.buttonTitleId == retryOffline.buttonTitleId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.messageId) * 31) + Integer.hashCode(this.buttonTitleId);
        }

        public String toString() {
            return "RetryOffline(messageId=" + this.messageId + ", buttonTitleId=" + this.buttonTitleId + ")";
        }

        public RetryOffline(int i, int i2) {
            this.messageId = i;
            this.buttonTitleId = i2;
        }

        public /* synthetic */ RetryOffline(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.string.search_list_offline_search_message : i, (i3 & 2) != 0 ? R.string.search_list_offline_search_button : i2);
        }

        @Override // com.medicmedia.medilink.ui.search.SearchHeaderMessageType
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.ui.search.SearchHeaderMessageType
        public int getButtonTitleId() {
            return this.buttonTitleId;
        }
    }

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType$DisableOnline;", "Lcom/medicmedia/medilink/ui/search/SearchHeaderMessageType;", "messageId", "", "buttonTitleId", "<init>", "(II)V", "getMessageId", "()I", "getButtonTitleId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DisableOnline implements SearchHeaderMessageType {
        public static final int $stable = 0;
        private final int buttonTitleId;
        private final int messageId;

        /* JADX WARN: Illegal instructions before constructor call */
        public DisableOnline() {
            int i = 0;
            this(i, i, 3, null);
        }

        public static /* synthetic */ DisableOnline copy$default(DisableOnline disableOnline, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = disableOnline.messageId;
            }
            if ((i3 & 2) != 0) {
                i2 = disableOnline.buttonTitleId;
            }
            return disableOnline.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getButtonTitleId() {
            return this.buttonTitleId;
        }

        public final DisableOnline copy(int messageId, int buttonTitleId) {
            return new DisableOnline(messageId, buttonTitleId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisableOnline)) {
                return false;
            }
            DisableOnline disableOnline = (DisableOnline) other;
            return this.messageId == disableOnline.messageId && this.buttonTitleId == disableOnline.buttonTitleId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.messageId) * 31) + Integer.hashCode(this.buttonTitleId);
        }

        public String toString() {
            return "DisableOnline(messageId=" + this.messageId + ", buttonTitleId=" + this.buttonTitleId + ")";
        }

        public DisableOnline(int i, int i2) {
            this.messageId = i;
            this.buttonTitleId = i2;
        }

        public /* synthetic */ DisableOnline(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.string.search_list_disable_online_search_message : i, (i3 & 2) != 0 ? R.string.search_list_disable_online_search_button : i2);
        }

        @Override // com.medicmedia.medilink.ui.search.SearchHeaderMessageType
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.ui.search.SearchHeaderMessageType
        public int getButtonTitleId() {
            return this.buttonTitleId;
        }
    }
}
