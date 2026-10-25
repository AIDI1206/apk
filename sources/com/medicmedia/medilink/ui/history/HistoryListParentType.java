package com.medicmedia.medilink.ui.history;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.ContentsFilterBrowsingListItem;
import com.medicmedia.medilink.domain.model.ContentsFilterParentType;
import com.medicmedia.medilink.domain.model.ContentsFilterWritingListItem;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HistoryListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListParentType;", "Lcom/medicmedia/medilink/domain/model/ContentsFilterParentType;", "MainTab", "ContentsDetail", "Lcom/medicmedia/medilink/ui/history/HistoryListParentType$ContentsDetail;", "Lcom/medicmedia/medilink/ui/history/HistoryListParentType$MainTab;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface HistoryListParentType extends ContentsFilterParentType {

    /* JADX INFO: compiled from: HistoryListItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListParentType$MainTab;", "Lcom/medicmedia/medilink/ui/history/HistoryListParentType;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class MainTab implements HistoryListParentType {
        public static final int $stable = 0;
        public static final MainTab INSTANCE = new MainTab();

        private MainTab() {
        }
    }

    /* JADX INFO: compiled from: HistoryListItem.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListParentType$ContentsDetail;", "Lcom/medicmedia/medilink/ui/history/HistoryListParentType;", "contentsId", "", "<init>", "(Ljava/lang/String;)V", "getContentsId", "()Ljava/lang/String;", "_filterWritingListItem", "Lcom/medicmedia/medilink/domain/model/ContentsFilterWritingListItem;", "filterWritingListItem", "getFilterWritingListItem", "()Lcom/medicmedia/medilink/domain/model/ContentsFilterWritingListItem;", "_filterBrowsingListItem", "Lcom/medicmedia/medilink/domain/model/ContentsFilterBrowsingListItem;", "filterBrowsingListItem", "getFilterBrowsingListItem", "()Lcom/medicmedia/medilink/domain/model/ContentsFilterBrowsingListItem;", "updateFilterWritingListItem", "", "item", "updateFilterBrowsingListItem", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ContentsDetail implements HistoryListParentType {
        public static final int $stable = 8;
        private ContentsFilterBrowsingListItem _filterBrowsingListItem;
        private ContentsFilterWritingListItem _filterWritingListItem;
        private final String contentsId;

        public static /* synthetic */ ContentsDetail copy$default(ContentsDetail contentsDetail, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = contentsDetail.contentsId;
            }
            return contentsDetail.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        public final ContentsDetail copy(String contentsId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            return new ContentsDetail(contentsId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContentsDetail) && Intrinsics.areEqual(this.contentsId, ((ContentsDetail) other).contentsId);
        }

        public int hashCode() {
            return this.contentsId.hashCode();
        }

        public String toString() {
            return "ContentsDetail(contentsId=" + this.contentsId + ")";
        }

        public ContentsDetail(String contentsId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            this.contentsId = contentsId;
            this._filterWritingListItem = new ContentsFilterWritingListItem(SetsKt.setOf(contentsId), null, false, false, 14, null);
            this._filterBrowsingListItem = new ContentsFilterBrowsingListItem(SetsKt.setOf(contentsId));
        }

        public final String getContentsId() {
            return this.contentsId;
        }

        /* JADX INFO: renamed from: getFilterWritingListItem, reason: from getter */
        public final ContentsFilterWritingListItem get_filterWritingListItem() {
            return this._filterWritingListItem;
        }

        /* JADX INFO: renamed from: getFilterBrowsingListItem, reason: from getter */
        public final ContentsFilterBrowsingListItem get_filterBrowsingListItem() {
            return this._filterBrowsingListItem;
        }

        public final void updateFilterWritingListItem(ContentsFilterWritingListItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this._filterWritingListItem = item;
        }

        public final void updateFilterBrowsingListItem(ContentsFilterBrowsingListItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this._filterBrowsingListItem = item;
        }
    }
}
