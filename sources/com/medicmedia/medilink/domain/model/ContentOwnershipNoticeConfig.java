package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentOwnershipNoticeItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002 !BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeConfig;", "", "cardTitle", "", "displayIntervalDay", "", "rows", "", "Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeConfig$Row;", "cards", "Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeConfig$Card;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "getCardTitle", "()Ljava/lang/String;", "getDisplayIntervalDay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRows", "()Ljava/util/List;", "getCards", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeConfig;", "equals", "", "other", "hashCode", "toString", "Card", "Row", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentOwnershipNoticeConfig {
    private final String cardTitle;
    private final List<Card> cards;
    private final Integer displayIntervalDay;
    private final List<Row> rows;

    public ContentOwnershipNoticeConfig() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentOwnershipNoticeConfig copy$default(ContentOwnershipNoticeConfig contentOwnershipNoticeConfig, String str, Integer num, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentOwnershipNoticeConfig.cardTitle;
        }
        if ((i & 2) != 0) {
            num = contentOwnershipNoticeConfig.displayIntervalDay;
        }
        if ((i & 4) != 0) {
            list = contentOwnershipNoticeConfig.rows;
        }
        if ((i & 8) != 0) {
            list2 = contentOwnershipNoticeConfig.cards;
        }
        return contentOwnershipNoticeConfig.copy(str, num, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardTitle() {
        return this.cardTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDisplayIntervalDay() {
        return this.displayIntervalDay;
    }

    public final List<Row> component3() {
        return this.rows;
    }

    public final List<Card> component4() {
        return this.cards;
    }

    public final ContentOwnershipNoticeConfig copy(String cardTitle, Integer displayIntervalDay, List<Row> rows, List<Card> cards) {
        return new ContentOwnershipNoticeConfig(cardTitle, displayIntervalDay, rows, cards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentOwnershipNoticeConfig)) {
            return false;
        }
        ContentOwnershipNoticeConfig contentOwnershipNoticeConfig = (ContentOwnershipNoticeConfig) other;
        return Intrinsics.areEqual(this.cardTitle, contentOwnershipNoticeConfig.cardTitle) && Intrinsics.areEqual(this.displayIntervalDay, contentOwnershipNoticeConfig.displayIntervalDay) && Intrinsics.areEqual(this.rows, contentOwnershipNoticeConfig.rows) && Intrinsics.areEqual(this.cards, contentOwnershipNoticeConfig.cards);
    }

    public int hashCode() {
        String str = this.cardTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.displayIntervalDay;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Row> list = this.rows;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Card> list2 = this.cards;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "ContentOwnershipNoticeConfig(cardTitle=" + this.cardTitle + ", displayIntervalDay=" + this.displayIntervalDay + ", rows=" + this.rows + ", cards=" + this.cards + ")";
    }

    public ContentOwnershipNoticeConfig(String str, Integer num, List<Row> list, List<Card> list2) {
        this.cardTitle = str;
        this.displayIntervalDay = num;
        this.rows = list;
        this.cards = list2;
    }

    public /* synthetic */ ContentOwnershipNoticeConfig(String str, Integer num, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2);
    }

    public final String getCardTitle() {
        return this.cardTitle;
    }

    public final Integer getDisplayIntervalDay() {
        return this.displayIntervalDay;
    }

    public final List<Row> getRows() {
        return this.rows;
    }

    public final List<Card> getCards() {
        return this.cards;
    }

    /* JADX INFO: compiled from: ContentOwnershipNoticeItem.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeConfig$Card;", "", "cardTitle", "", "displayIntervalDay", "", "rows", "", "Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeConfig$Row;", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getCardTitle", "()Ljava/lang/String;", "getDisplayIntervalDay", "()I", "getRows", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Card {
        private final String cardTitle;
        private final int displayIntervalDay;
        private final List<Row> rows;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Card copy$default(Card card, String str, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = card.cardTitle;
            }
            if ((i2 & 2) != 0) {
                i = card.displayIntervalDay;
            }
            if ((i2 & 4) != 0) {
                list = card.rows;
            }
            return card.copy(str, i, list);
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
            return this.rows;
        }

        public final Card copy(String cardTitle, int displayIntervalDay, List<Row> rows) {
            Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
            return new Card(cardTitle, displayIntervalDay, rows);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Card)) {
                return false;
            }
            Card card = (Card) other;
            return Intrinsics.areEqual(this.cardTitle, card.cardTitle) && this.displayIntervalDay == card.displayIntervalDay && Intrinsics.areEqual(this.rows, card.rows);
        }

        public int hashCode() {
            int iHashCode = ((this.cardTitle.hashCode() * 31) + Integer.hashCode(this.displayIntervalDay)) * 31;
            List<Row> list = this.rows;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Card(cardTitle=" + this.cardTitle + ", displayIntervalDay=" + this.displayIntervalDay + ", rows=" + this.rows + ")";
        }

        public Card(String cardTitle, int i, List<Row> list) {
            Intrinsics.checkNotNullParameter(cardTitle, "cardTitle");
            this.cardTitle = cardTitle;
            this.displayIntervalDay = i;
            this.rows = list;
        }

        public final String getCardTitle() {
            return this.cardTitle;
        }

        public final int getDisplayIntervalDay() {
            return this.displayIntervalDay;
        }

        public final List<Row> getRows() {
            return this.rows;
        }
    }

    /* JADX INFO: compiled from: ContentOwnershipNoticeItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentOwnershipNoticeConfig$Row;", "", "hasContentsCode", "", "hasNotContentsCode", HistoryRepositoryImpl.FieldName.TITLE, "message", "buttonTitle", "buttonUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHasContentsCode", "()Ljava/lang/String;", "getHasNotContentsCode", "getTitle", "getMessage", "getButtonTitle", "getButtonUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Row {
        private final String buttonTitle;
        private final String buttonUrl;
        private final String hasContentsCode;
        private final String hasNotContentsCode;
        private final String message;
        private final String title;

        public static /* synthetic */ Row copy$default(Row row, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = row.hasContentsCode;
            }
            if ((i & 2) != 0) {
                str2 = row.hasNotContentsCode;
            }
            if ((i & 4) != 0) {
                str3 = row.title;
            }
            if ((i & 8) != 0) {
                str4 = row.message;
            }
            if ((i & 16) != 0) {
                str5 = row.buttonTitle;
            }
            if ((i & 32) != 0) {
                str6 = row.buttonUrl;
            }
            String str7 = str5;
            String str8 = str6;
            return row.copy(str, str2, str3, str4, str7, str8);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getHasContentsCode() {
            return this.hasContentsCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getHasNotContentsCode() {
            return this.hasNotContentsCode;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getButtonUrl() {
            return this.buttonUrl;
        }

        public final Row copy(String hasContentsCode, String hasNotContentsCode, String title, String message, String buttonTitle, String buttonUrl) {
            Intrinsics.checkNotNullParameter(hasContentsCode, "hasContentsCode");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            Intrinsics.checkNotNullParameter(buttonUrl, "buttonUrl");
            return new Row(hasContentsCode, hasNotContentsCode, title, message, buttonTitle, buttonUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Row)) {
                return false;
            }
            Row row = (Row) other;
            return Intrinsics.areEqual(this.hasContentsCode, row.hasContentsCode) && Intrinsics.areEqual(this.hasNotContentsCode, row.hasNotContentsCode) && Intrinsics.areEqual(this.title, row.title) && Intrinsics.areEqual(this.message, row.message) && Intrinsics.areEqual(this.buttonTitle, row.buttonTitle) && Intrinsics.areEqual(this.buttonUrl, row.buttonUrl);
        }

        public int hashCode() {
            int iHashCode = this.hasContentsCode.hashCode() * 31;
            String str = this.hasNotContentsCode;
            return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.buttonTitle.hashCode()) * 31) + this.buttonUrl.hashCode();
        }

        public String toString() {
            return "Row(hasContentsCode=" + this.hasContentsCode + ", hasNotContentsCode=" + this.hasNotContentsCode + ", title=" + this.title + ", message=" + this.message + ", buttonTitle=" + this.buttonTitle + ", buttonUrl=" + this.buttonUrl + ")";
        }

        public Row(String hasContentsCode, String str, String title, String message, String buttonTitle, String buttonUrl) {
            Intrinsics.checkNotNullParameter(hasContentsCode, "hasContentsCode");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
            Intrinsics.checkNotNullParameter(buttonUrl, "buttonUrl");
            this.hasContentsCode = hasContentsCode;
            this.hasNotContentsCode = str;
            this.title = title;
            this.message = message;
            this.buttonTitle = buttonTitle;
            this.buttonUrl = buttonUrl;
        }

        public final String getHasContentsCode() {
            return this.hasContentsCode;
        }

        public final String getHasNotContentsCode() {
            return this.hasNotContentsCode;
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
