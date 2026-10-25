package com.medicmedia.medilink.ui.bookshelf;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.BookShelfViewItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BookListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0005H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/AddBookShelfItem;", "", "item", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "section", "", "insertPosition", "<init>", "(Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;II)V", "getItem", "()Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "getSection", "()I", "getInsertPosition", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class AddBookShelfItem {
    public static final int $stable = 8;
    private final int insertPosition;
    private final BookShelfViewItem item;
    private final int section;

    public static /* synthetic */ AddBookShelfItem copy$default(AddBookShelfItem addBookShelfItem, BookShelfViewItem bookShelfViewItem, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bookShelfViewItem = addBookShelfItem.item;
        }
        if ((i3 & 2) != 0) {
            i = addBookShelfItem.section;
        }
        if ((i3 & 4) != 0) {
            i2 = addBookShelfItem.insertPosition;
        }
        return addBookShelfItem.copy(bookShelfViewItem, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BookShelfViewItem getItem() {
        return this.item;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSection() {
        return this.section;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getInsertPosition() {
        return this.insertPosition;
    }

    public final AddBookShelfItem copy(BookShelfViewItem item, int section, int insertPosition) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new AddBookShelfItem(item, section, insertPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddBookShelfItem)) {
            return false;
        }
        AddBookShelfItem addBookShelfItem = (AddBookShelfItem) other;
        return Intrinsics.areEqual(this.item, addBookShelfItem.item) && this.section == addBookShelfItem.section && this.insertPosition == addBookShelfItem.insertPosition;
    }

    public int hashCode() {
        return (((this.item.hashCode() * 31) + Integer.hashCode(this.section)) * 31) + Integer.hashCode(this.insertPosition);
    }

    public String toString() {
        return "AddBookShelfItem(item=" + this.item + ", section=" + this.section + ", insertPosition=" + this.insertPosition + ")";
    }

    public AddBookShelfItem(BookShelfViewItem item, int i, int i2) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.item = item;
        this.section = i;
        this.insertPosition = i2;
    }

    public final BookShelfViewItem getItem() {
        return this.item;
    }

    public final int getSection() {
        return this.section;
    }

    public final int getInsertPosition() {
        return this.insertPosition;
    }
}
