package com.medicmedia.medilink.ui.entry;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.StartContentsDetailItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExternalEntryViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/ui/entry/ExternalEntryEvent;", "", "OpenOfflineContents", "OpenLibrary", "Lcom/medicmedia/medilink/ui/entry/ExternalEntryEvent$OpenLibrary;", "Lcom/medicmedia/medilink/ui/entry/ExternalEntryEvent$OpenOfflineContents;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ExternalEntryEvent {

    /* JADX INFO: compiled from: ExternalEntryViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/entry/ExternalEntryEvent$OpenOfflineContents;", "Lcom/medicmedia/medilink/ui/entry/ExternalEntryEvent;", "detailItem", "Lcom/medicmedia/medilink/domain/model/StartContentsDetailItem;", "<init>", "(Lcom/medicmedia/medilink/domain/model/StartContentsDetailItem;)V", "getDetailItem", "()Lcom/medicmedia/medilink/domain/model/StartContentsDetailItem;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OpenOfflineContents implements ExternalEntryEvent {
        public static final int $stable = 8;
        private final StartContentsDetailItem detailItem;

        public static /* synthetic */ OpenOfflineContents copy$default(OpenOfflineContents openOfflineContents, StartContentsDetailItem startContentsDetailItem, int i, Object obj) {
            if ((i & 1) != 0) {
                startContentsDetailItem = openOfflineContents.detailItem;
            }
            return openOfflineContents.copy(startContentsDetailItem);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final StartContentsDetailItem getDetailItem() {
            return this.detailItem;
        }

        public final OpenOfflineContents copy(StartContentsDetailItem detailItem) {
            Intrinsics.checkNotNullParameter(detailItem, "detailItem");
            return new OpenOfflineContents(detailItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenOfflineContents) && Intrinsics.areEqual(this.detailItem, ((OpenOfflineContents) other).detailItem);
        }

        public int hashCode() {
            return this.detailItem.hashCode();
        }

        public String toString() {
            return "OpenOfflineContents(detailItem=" + this.detailItem + ")";
        }

        public OpenOfflineContents(StartContentsDetailItem detailItem) {
            Intrinsics.checkNotNullParameter(detailItem, "detailItem");
            this.detailItem = detailItem;
        }

        public final StartContentsDetailItem getDetailItem() {
            return this.detailItem;
        }
    }

    /* JADX INFO: compiled from: ExternalEntryViewModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/entry/ExternalEntryEvent$OpenLibrary;", "Lcom/medicmedia/medilink/ui/entry/ExternalEntryEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OpenLibrary implements ExternalEntryEvent {
        public static final int $stable = 0;
        public static final OpenLibrary INSTANCE = new OpenLibrary();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenLibrary)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1944170216;
        }

        public String toString() {
            return "OpenLibrary";
        }

        private OpenLibrary() {
        }
    }
}
