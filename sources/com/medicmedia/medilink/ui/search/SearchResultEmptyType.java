package com.medicmedia.medilink.ui.search;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: SearchListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType;", "", "messageId", "", "getMessageId", "()I", "buttonTitleId", "getButtonTitleId", "Offline", "Online", "Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType$Offline;", "Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType$Online;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SearchResultEmptyType {
    int getButtonTitleId();

    int getMessageId();

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType$Offline;", "Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType;", "messageId", "", "buttonTitleId", "<init>", "(II)V", "getMessageId", "()I", "getButtonTitleId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Offline implements SearchResultEmptyType {
        public static final int $stable = 0;
        private final int buttonTitleId;
        private final int messageId;

        /* JADX WARN: Illegal instructions before constructor call */
        public Offline() {
            int i = 0;
            this(i, i, 3, null);
        }

        public static /* synthetic */ Offline copy$default(Offline offline, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = offline.messageId;
            }
            if ((i3 & 2) != 0) {
                i2 = offline.buttonTitleId;
            }
            return offline.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getButtonTitleId() {
            return this.buttonTitleId;
        }

        public final Offline copy(int messageId, int buttonTitleId) {
            return new Offline(messageId, buttonTitleId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Offline)) {
                return false;
            }
            Offline offline = (Offline) other;
            return this.messageId == offline.messageId && this.buttonTitleId == offline.buttonTitleId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.messageId) * 31) + Integer.hashCode(this.buttonTitleId);
        }

        public String toString() {
            return "Offline(messageId=" + this.messageId + ", buttonTitleId=" + this.buttonTitleId + ")";
        }

        public Offline(int i, int i2) {
            this.messageId = i;
            this.buttonTitleId = i2;
        }

        public /* synthetic */ Offline(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.string.search_list_offline_no_result_message : i, (i3 & 2) != 0 ? R.string.search_list_no_result_button : i2);
        }

        @Override // com.medicmedia.medilink.ui.search.SearchResultEmptyType
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.ui.search.SearchResultEmptyType
        public int getButtonTitleId() {
            return this.buttonTitleId;
        }
    }

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType$Online;", "Lcom/medicmedia/medilink/ui/search/SearchResultEmptyType;", "messageId", "", "buttonTitleId", "<init>", "(II)V", "getMessageId", "()I", "getButtonTitleId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Online implements SearchResultEmptyType {
        public static final int $stable = 0;
        private final int buttonTitleId;
        private final int messageId;

        /* JADX WARN: Illegal instructions before constructor call */
        public Online() {
            int i = 0;
            this(i, i, 3, null);
        }

        public static /* synthetic */ Online copy$default(Online online, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = online.messageId;
            }
            if ((i3 & 2) != 0) {
                i2 = online.buttonTitleId;
            }
            return online.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getButtonTitleId() {
            return this.buttonTitleId;
        }

        public final Online copy(int messageId, int buttonTitleId) {
            return new Online(messageId, buttonTitleId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Online)) {
                return false;
            }
            Online online = (Online) other;
            return this.messageId == online.messageId && this.buttonTitleId == online.buttonTitleId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.messageId) * 31) + Integer.hashCode(this.buttonTitleId);
        }

        public String toString() {
            return "Online(messageId=" + this.messageId + ", buttonTitleId=" + this.buttonTitleId + ")";
        }

        public Online(int i, int i2) {
            this.messageId = i;
            this.buttonTitleId = i2;
        }

        public /* synthetic */ Online(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? R.string.search_list_online_no_result_message : i, (i3 & 2) != 0 ? R.string.search_list_no_result_button : i2);
        }

        @Override // com.medicmedia.medilink.ui.search.SearchResultEmptyType
        public int getMessageId() {
            return this.messageId;
        }

        @Override // com.medicmedia.medilink.ui.search.SearchResultEmptyType
        public int getButtonTitleId() {
            return this.buttonTitleId;
        }
    }
}
