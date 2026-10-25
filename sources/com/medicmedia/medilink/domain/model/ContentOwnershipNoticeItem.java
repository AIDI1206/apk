package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentOwnershipNoticeItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeItem;", "", "cardTitle", "", "displayIntervalDay", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeItem$Row;", "snoozeId", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;)V", "getCardTitle", "()Ljava/lang/String;", "getDisplayIntervalDay", "()I", "getItems", "()Ljava/util/List;", "getSnoozeId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Row", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentOwnershipNoticeItem {
    private final String cardTitle;
    private final int displayIntervalDay;
    private final List<Row> items;
    private final String snoozeId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentOwnershipNoticeItem copy$default(ContentOwnershipNoticeItem contentOwnershipNoticeItem, String str, int i, List list, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = contentOwnershipNoticeItem.cardTitle;
        }
        if ((i2 & 2) != 0) {
            i = contentOwnershipNoticeItem.displayIntervalDay;
        }
        if ((i2 & 4) != 0) {
            list = contentOwnershipNoticeItem.items;
        }
        if ((i2 & 8) != 0) {
            str2 = contentOwnershipNoticeItem.snoozeId;
        }
        return contentOwnershipNoticeItem.copy(str, i, list, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDisplayIntervalDay() {
        return this.displayIntervalDay;
    }

    public final List<Row> component3() {
        return this.items;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSnoozeId() {
        return this.snoozeId;
    }

    public final ContentOwnershipNoticeItem copy(String cardTitle, int displayIntervalDay, List<Row> items, String snoozeId) {
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(snoozeId, "snoozeId");
        return new ContentOwnershipNoticeItem(cardTitle, displayIntervalDay, items, snoozeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentOwnershipNoticeItem)) {
            return false;
        }
        ContentOwnershipNoticeItem contentOwnershipNoticeItem = (ContentOwnershipNoticeItem) other;
        return Intrinsics.areEqual(this.cardTitle, contentOwnershipNoticeItem.cardTitle) && this.displayIntervalDay == contentOwnershipNoticeItem.displayIntervalDay && Intrinsics.areEqual(this.items, contentOwnershipNoticeItem.items) && Intrinsics.areEqual(this.snoozeId, contentOwnershipNoticeItem.snoozeId);
    }

    public int hashCode() {
        return (((((this.cardTitle.hashCode() * 31) + Integer.hashCode(this.displayIntervalDay)) * 31) + this.items.hashCode()) * 31) + this.snoozeId.hashCode();
    }

    public String toString() {
        return "ContentOwnershipNoticeItem(cardTitle=" + this.cardTitle + ", displayIntervalDay=" + this.displayIntervalDay + ", items=" + this.items + ", snoozeId=" + this.snoozeId + ")";
    }

    public ContentOwnershipNoticeItem(String cardTitle, int i, List<Row> items, String snoozeId) {
        Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(snoozeId, "snoozeId");
        this.cardTitle = cardTitle;
        this.displayIntervalDay = i;
        this.items = items;
        this.snoozeId = snoozeId;
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final int getDisplayIntervalDay() {
        return this.displayIntervalDay;
    }

    public /* synthetic */ ContentOwnershipNoticeItem(String str, int i, List list, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, str2);
    }

    public final List<Row> getItems() {
        return this.items;
    }

    public final String getSnoozeId() {
        return this.snoozeId;
    }

    /* JADX INFO: compiled from: ContentOwnershipNoticeItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeItem$Row;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "message", "buttonTitle", "buttonUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "getButtonTitle", "getButtonUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Row {
        private final String buttonTitle;
        private final String buttonUrl;
        private final String message;
        private final String title;

        public static /* synthetic */ Row copy$default(Row row, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = row.title;
            }
            if ((i & 2) != 0) {
                str2 = row.message;
            }
            if ((i & 4) != 0) {
                str3 = row.buttonTitle;
            }
            if ((i & 8) != 0) {
                str4 = row.buttonUrl;
            }
            return row.copy(str, str2, str3, str4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getButtonUrl() {
            return this.buttonUrl;
        }

        public final Row copy(String title, String message, String buttonTitle, String buttonUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            Intrinsics.checkNotNullParameter(buttonUrl, "buttonUrl");
            return new Row(title, message, buttonTitle, buttonUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.areEqual(this.title, row.title) && Intrinsics.areEqual(this.message, row.message) && Intrinsics.areEqual(this.buttonTitle, row.buttonTitle) && Intrinsics.areEqual(this.buttonUrl, row.buttonUrl);
        }

        public int hashCode() {
            return (((((this.title.hashCode() * 31) + this.message.hashCode()) * 31) + this.buttonTitle.hashCode()) * 31) + this.buttonUrl.hashCode();
        }

        public String toString() {
            return "Row(title=" + this.title + ", message=" + this.message + ", buttonTitle=" + this.buttonTitle + ", buttonUrl=" + this.buttonUrl + ")";
        }

        public Row(String title, String message, String buttonTitle, String buttonUrl) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            Intrinsics.checkNotNullParameter(buttonUrl, "buttonUrl");
            this.title = title;
            this.message = message;
            this.buttonTitle = buttonTitle;
            this.buttonUrl = buttonUrl;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        public final String getButtonUrl() {
            return this.buttonUrl;
        }
    }
}
