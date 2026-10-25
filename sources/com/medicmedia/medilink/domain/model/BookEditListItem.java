package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsEditListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/domain/model/BookEditListItem;", "Lcom/medicmedia/medilink/domain/model/MultiLevelViewItem;", "item", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "<init>", "(Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;)V", "getItem", "()Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BookEditListItem extends MultiLevelViewItem {
    private final BookShelfViewItem item;

    public static /* synthetic */ BookEditListItem copy$default(BookEditListItem bookEditListItem, BookShelfViewItem bookShelfViewItem, int i, Object obj) {
        if ((i & 1) != 0) {
            bookShelfViewItem = bookEditListItem.item;
        }
        return bookEditListItem.copy(bookShelfViewItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BookShelfViewItem getItem() {
        return this.item;
    }

    public final BookEditListItem copy(BookShelfViewItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new BookEditListItem(item);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BookEditListItem) && Intrinsics.areEqual(this.item, ((BookEditListItem) other).item);
    }

    public int hashCode() {
        return this.item.hashCode();
    }

    public String toString() {
        return "BookEditListItem(item=" + this.item + ")";
    }

    public final BookShelfViewItem getItem() {
        return this.item;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookEditListItem(BookShelfViewItem item) {
        super(item.getId(), ContentsItemLevel.BOOK.getValue());
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
    }
}
