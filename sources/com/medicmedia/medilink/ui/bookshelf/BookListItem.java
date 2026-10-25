package com.medicmedia.medilink.ui.bookshelf;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.WorkerKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BookListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001a\u001a\u00020\u0007H×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/BookListItem;", "", "contentId", "", WorkerKey.KEY_DOWNLOAD_ID, "", "section", "", "position", "<init>", "(Ljava/lang/String;JII)V", "getContentId", "()Ljava/lang/String;", "getDownloadId", "()J", "getSection", "()I", "getPosition", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BookListItem {
    public static final int $stable = 0;
    private final String contentId;
    private final long downloadId;
    private final int position;
    private final int section;

    public static /* synthetic */ BookListItem copy$default(BookListItem bookListItem, String str, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bookListItem.contentId;
        }
        if ((i3 & 2) != 0) {
            j = bookListItem.downloadId;
        }
        if ((i3 & 4) != 0) {
            i = bookListItem.section;
        }
        if ((i3 & 8) != 0) {
            i2 = bookListItem.position;
        }
        return bookListItem.copy(str, j, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDownloadId() {
        return this.downloadId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSection() {
        return this.section;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    public final BookListItem copy(String contentId, long downloadId, int section, int position) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        return new BookListItem(contentId, downloadId, section, position);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BookListItem)) {
            return false;
        }
        BookListItem bookListItem = (BookListItem) other;
        return Intrinsics.areEqual(this.contentId, bookListItem.contentId) && this.downloadId == bookListItem.downloadId && this.section == bookListItem.section && this.position == bookListItem.position;
    }

    public int hashCode() {
        return (((((this.contentId.hashCode() * 31) + Long.hashCode(this.downloadId)) * 31) + Integer.hashCode(this.section)) * 31) + Integer.hashCode(this.position);
    }

    public String toString() {
        return "BookListItem(contentId=" + this.contentId + ", downloadId=" + this.downloadId + ", section=" + this.section + ", position=" + this.position + ")";
    }

    public BookListItem(String contentId, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        this.contentId = contentId;
        this.downloadId = j;
        this.section = i;
        this.position = i2;
    }

    public /* synthetic */ BookListItem(String str, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? -1 : i2);
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final long getDownloadId() {
        return this.downloadId;
    }

    public final int getSection() {
        return this.section;
    }

    public final int getPosition() {
        return this.position;
    }
}
