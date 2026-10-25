package com.medicmedia.medilink.ui.edit;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.BookShelfViewItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsDisplayListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/ContentsDisplayListUiState;", "", "displayItems", "", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "<init>", "(Ljava/util/List;)V", "getDisplayItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsDisplayListUiState {
    private final List<BookShelfViewItem> displayItems;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final ContentsDisplayListUiState f120default = new ContentsDisplayListUiState(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);

    public ContentsDisplayListUiState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentsDisplayListUiState copy$default(ContentsDisplayListUiState contentsDisplayListUiState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = contentsDisplayListUiState.displayItems;
        }
        return contentsDisplayListUiState.copy(list);
    }

    public final List<BookShelfViewItem> component1() {
        return this.displayItems;
    }

    public final ContentsDisplayListUiState copy(List<BookShelfViewItem> displayItems) {
        Intrinsics.checkNotNullParameter(displayItems, "displayItems");
        return new ContentsDisplayListUiState(displayItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContentsDisplayListUiState) && Intrinsics.areEqual(this.displayItems, ((ContentsDisplayListUiState) other).displayItems);
    }

    public int hashCode() {
        return this.displayItems.hashCode();
    }

    public String toString() {
        return "ContentsDisplayListUiState(displayItems=" + this.displayItems + ")";
    }

    public ContentsDisplayListUiState(List<BookShelfViewItem> displayItems) {
        Intrinsics.checkNotNullParameter(displayItems, "displayItems");
        this.displayItems = displayItems;
    }

    public /* synthetic */ ContentsDisplayListUiState(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<BookShelfViewItem> getDisplayItems() {
        return this.displayItems;
    }

    /* JADX INFO: compiled from: ContentsDisplayListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/ContentsDisplayListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/edit/ContentsDisplayListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/edit/ContentsDisplayListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentsDisplayListUiState getDefault() {
            return ContentsDisplayListUiState.f120default;
        }
    }
}
