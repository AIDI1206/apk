package com.medicmedia.medilink.ui.bookshelf;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.BookShelfViewItem;
import com.medicmedia.medilink.domain.model.history.BrowsingHistoryItem;
import com.medicmedia.medilink.ui.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: BookListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/ui/bookshelf/StartContentsDetailBottomSheetItem;", "", "accessed", "", "item", "Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "history", "Lcom/medicmedia/medilink/domain/model/history/BrowsingHistoryItem;", "<init>", "(Ljava/lang/String;Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;Lcom/medicmedia/medilink/domain/model/history/BrowsingHistoryItem;)V", "getAccessed", "()Ljava/lang/String;", "getItem", "()Lcom/medicmedia/medilink/domain/model/BookShelfViewItem;", "getHistory", "()Lcom/medicmedia/medilink/domain/model/history/BrowsingHistoryItem;", "isContinue", "", "()Z", "message", "context", "Landroid/content/Context;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class StartContentsDetailBottomSheetItem {
    public static final int $stable = 8;
    private final String accessed;
    private final BrowsingHistoryItem history;
    private final BookShelfViewItem item;

    public static /* synthetic */ StartContentsDetailBottomSheetItem copy$default(StartContentsDetailBottomSheetItem startContentsDetailBottomSheetItem, String str, BookShelfViewItem bookShelfViewItem, BrowsingHistoryItem browsingHistoryItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startContentsDetailBottomSheetItem.accessed;
        }
        if ((i & 2) != 0) {
            bookShelfViewItem = startContentsDetailBottomSheetItem.item;
        }
        if ((i & 4) != 0) {
            browsingHistoryItem = startContentsDetailBottomSheetItem.history;
        }
        return startContentsDetailBottomSheetItem.copy(str, bookShelfViewItem, browsingHistoryItem);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessed() {
        return this.accessed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BookShelfViewItem getItem() {
        return this.item;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BrowsingHistoryItem getHistory() {
        return this.history;
    }

    public final StartContentsDetailBottomSheetItem copy(String accessed, BookShelfViewItem item, BrowsingHistoryItem history) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new StartContentsDetailBottomSheetItem(accessed, item, history);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartContentsDetailBottomSheetItem)) {
            return false;
        }
        StartContentsDetailBottomSheetItem startContentsDetailBottomSheetItem = (StartContentsDetailBottomSheetItem) other;
        return Intrinsics.areEqual(this.accessed, startContentsDetailBottomSheetItem.accessed) && Intrinsics.areEqual(this.item, startContentsDetailBottomSheetItem.item) && Intrinsics.areEqual(this.history, startContentsDetailBottomSheetItem.history);
    }

    public int hashCode() {
        String str = this.accessed;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.item.hashCode()) * 31;
        BrowsingHistoryItem browsingHistoryItem = this.history;
        return iHashCode + (browsingHistoryItem != null ? browsingHistoryItem.hashCode() : 0);
    }

    public String toString() {
        return "StartContentsDetailBottomSheetItem(accessed=" + this.accessed + ", item=" + this.item + ", history=" + this.history + ")";
    }

    public StartContentsDetailBottomSheetItem(String str, BookShelfViewItem item, BrowsingHistoryItem browsingHistoryItem) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.accessed = str;
        this.item = item;
        this.history = browsingHistoryItem;
    }

    public /* synthetic */ StartContentsDetailBottomSheetItem(String str, BookShelfViewItem bookShelfViewItem, BrowsingHistoryItem browsingHistoryItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, bookShelfViewItem, (i & 4) != 0 ? null : browsingHistoryItem);
    }

    public final String getAccessed() {
        return this.accessed;
    }

    public final BookShelfViewItem getItem() {
        return this.item;
    }

    public final BrowsingHistoryItem getHistory() {
        return this.history;
    }

    public final boolean isContinue() {
        return this.accessed != null;
    }

    public final String message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = this.accessed;
        if (str != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = context.getString(R.string.book_list_download_comp_message);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String str2 = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            if (str2 != null) {
                return str2;
            }
        }
        String string2 = context.getString(R.string.dialog_download_comp_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
