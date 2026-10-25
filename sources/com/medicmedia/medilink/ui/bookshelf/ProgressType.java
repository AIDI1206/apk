package com.medicmedia.medilink.ui.bookshelf;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.BookShelfViewItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: BookListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/ProgressType;", "", "item", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "getItem", "()Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "DownloadCountZero", "Downloading", "Completed", "Other", "Lcom/medicmedia/medilink/ui/bookshelf/ProgressType$Completed;", "Lcom/medicmedia/medilink/ui/bookshelf/ProgressType$DownloadCountZero;", "Lcom/medicmedia/medilink/ui/bookshelf/ProgressType$Downloading;", "Lcom/medicmedia/medilink/ui/bookshelf/ProgressType$Other;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ProgressType {
    BookShelfViewItem getItem();

    /* JADX INFO: compiled from: BookListItem.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/ProgressType$DownloadCountZero;", "Lcom/medicmedia/medilink/ui/bookshelf/ProgressType;", "item", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "isMinorUpdate", "", "<init>", "(Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;Z)V", "getItem", "()Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DownloadCountZero implements ProgressType {
        public static final int $stable = 8;
        private final boolean isMinorUpdate;
        private final BookShelfViewItem item;

        public static /* synthetic */ DownloadCountZero copy$default(DownloadCountZero downloadCountZero, BookShelfViewItem bookShelfViewItem, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                bookShelfViewItem = downloadCountZero.item;
            }
            if ((i & 2) != 0) {
                z = downloadCountZero.isMinorUpdate;
            }
            return downloadCountZero.copy(bookShelfViewItem, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BookShelfViewItem getItem() {
            return this.item;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsMinorUpdate() {
            return this.isMinorUpdate;
        }

        public final DownloadCountZero copy(BookShelfViewItem item, boolean isMinorUpdate) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new DownloadCountZero(item, isMinorUpdate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DownloadCountZero)) {
                return false;
            }
            DownloadCountZero downloadCountZero = (DownloadCountZero) other;
            return Intrinsics.areEqual(this.item, downloadCountZero.item) && this.isMinorUpdate == downloadCountZero.isMinorUpdate;
        }

        public int hashCode() {
            return (this.item.hashCode() * 31) + Boolean.hashCode(this.isMinorUpdate);
        }

        public String toString() {
            return "DownloadCountZero(item=" + this.item + ", isMinorUpdate=" + this.isMinorUpdate + ")";
        }

        public DownloadCountZero(BookShelfViewItem item, boolean z) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.isMinorUpdate = z;
        }

        @Override // com.medicmedia.medilink.ui.bookshelf.ProgressType
        public BookShelfViewItem getItem() {
            return this.item;
        }

        public final boolean isMinorUpdate() {
            return this.isMinorUpdate;
        }
    }

    /* JADX INFO: compiled from: BookListItem.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0005H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/ProgressType$Downloading;", "Lcom/medicmedia/medilink/ui/bookshelf/ProgressType;", "item", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "downloadProgress", "", "isPendingOrPaused", "", "<init>", "(Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;IZ)V", "getItem", "()Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "getDownloadProgress", "()I", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Downloading implements ProgressType {
        public static final int $stable = 8;
        private final int downloadProgress;
        private final boolean isPendingOrPaused;
        private final BookShelfViewItem item;

        public static /* synthetic */ Downloading copy$default(Downloading downloading, BookShelfViewItem bookShelfViewItem, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                bookShelfViewItem = downloading.item;
            }
            if ((i2 & 2) != 0) {
                i = downloading.downloadProgress;
            }
            if ((i2 & 4) != 0) {
                z = downloading.isPendingOrPaused;
            }
            return downloading.copy(bookShelfViewItem, i, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BookShelfViewItem getItem() {
            return this.item;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getDownloadProgress() {
            return this.downloadProgress;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIsPendingOrPaused() {
            return this.isPendingOrPaused;
        }

        public final Downloading copy(BookShelfViewItem item, int downloadProgress, boolean isPendingOrPaused) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new Downloading(item, downloadProgress, isPendingOrPaused);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Downloading)) {
                return false;
            }
            Downloading downloading = (Downloading) other;
            return Intrinsics.areEqual(this.item, downloading.item) && this.downloadProgress == downloading.downloadProgress && this.isPendingOrPaused == downloading.isPendingOrPaused;
        }

        public int hashCode() {
            return (((this.item.hashCode() * 31) + Integer.hashCode(this.downloadProgress)) * 31) + Boolean.hashCode(this.isPendingOrPaused);
        }

        public String toString() {
            return "Downloading(item=" + this.item + ", downloadProgress=" + this.downloadProgress + ", isPendingOrPaused=" + this.isPendingOrPaused + ")";
        }

        public Downloading(BookShelfViewItem item, int i, boolean z) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.downloadProgress = i;
            this.isPendingOrPaused = z;
        }

        public /* synthetic */ Downloading(BookShelfViewItem bookShelfViewItem, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? new BookShelfViewItem(0, null, null, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, 0L, 0, null, false, null, null, null, null, 0, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, null) : bookShelfViewItem, i, z);
        }

        @Override // com.medicmedia.medilink.ui.bookshelf.ProgressType
        public BookShelfViewItem getItem() {
            return this.item;
        }

        public final int getDownloadProgress() {
            return this.downloadProgress;
        }

        public final boolean isPendingOrPaused() {
            return this.isPendingOrPaused;
        }
    }

    /* JADX INFO: compiled from: BookListItem.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/ProgressType$Completed;", "Lcom/medicmedia/medilink/ui/bookshelf/ProgressType;", "item", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "<init>", "(Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;)V", "getItem", "()Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Completed implements ProgressType {
        public static final int $stable = 8;
        private final BookShelfViewItem item;

        public static /* synthetic */ Completed copy$default(Completed completed, BookShelfViewItem bookShelfViewItem, int i, Object obj) {
            if ((i & 1) != 0) {
                bookShelfViewItem = completed.item;
            }
            return completed.copy(bookShelfViewItem);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BookShelfViewItem getItem() {
            return this.item;
        }

        public final Completed copy(BookShelfViewItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new Completed(item);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Completed) && Intrinsics.areEqual(this.item, ((Completed) other).item);
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "Completed(item=" + this.item + ")";
        }

        public Completed(BookShelfViewItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        @Override // com.medicmedia.medilink.ui.bookshelf.ProgressType
        public BookShelfViewItem getItem() {
            return this.item;
        }
    }

    /* JADX INFO: compiled from: BookListItem.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0005H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/ProgressType$Other;", "Lcom/medicmedia/medilink/ui/bookshelf/ProgressType;", "item", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "downloadStatus", "", "cursorCount", "<init>", "(Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;II)V", "getItem", "()Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "getDownloadStatus", "()I", "getCursorCount", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Other implements ProgressType {
        public static final int $stable = 8;
        private final int cursorCount;
        private final int downloadStatus;
        private final BookShelfViewItem item;

        public static /* synthetic */ Other copy$default(Other other, BookShelfViewItem bookShelfViewItem, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                bookShelfViewItem = other.item;
            }
            if ((i3 & 2) != 0) {
                i = other.downloadStatus;
            }
            if ((i3 & 4) != 0) {
                i2 = other.cursorCount;
            }
            return other.copy(bookShelfViewItem, i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final BookShelfViewItem getItem() {
            return this.item;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getDownloadStatus() {
            return this.downloadStatus;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getCursorCount() {
            return this.cursorCount;
        }

        public final Other copy(BookShelfViewItem item, int downloadStatus, int cursorCount) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new Other(item, downloadStatus, cursorCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Other)) {
                return false;
            }
            Other other2 = (Other) other;
            return Intrinsics.areEqual(this.item, other2.item) && this.downloadStatus == other2.downloadStatus && this.cursorCount == other2.cursorCount;
        }

        public int hashCode() {
            return (((this.item.hashCode() * 31) + Integer.hashCode(this.downloadStatus)) * 31) + Integer.hashCode(this.cursorCount);
        }

        public String toString() {
            return "Other(item=" + this.item + ", downloadStatus=" + this.downloadStatus + ", cursorCount=" + this.cursorCount + ")";
        }

        public Other(BookShelfViewItem item, int i, int i2) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.downloadStatus = i;
            this.cursorCount = i2;
        }

        @Override // com.medicmedia.medilink.ui.bookshelf.ProgressType
        public BookShelfViewItem getItem() {
            return this.item;
        }

        public final int getDownloadStatus() {
            return this.downloadStatus;
        }

        public final int getCursorCount() {
            return this.cursorCount;
        }
    }
}
