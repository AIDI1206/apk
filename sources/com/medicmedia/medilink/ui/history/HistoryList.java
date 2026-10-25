package com.medicmedia.medilink.ui.history;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.WritingMode;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.common.OptionDropdownMenuType;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HistoryListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryList;", "", "<init>", "()V", "MenuType", "WritingIcon", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class HistoryList {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: HistoryListItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0017\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryList$MenuType;", "Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuType;", "", "titles", "", "", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getTitles", "()Ljava/util/List;", "WRITING", "BROWSING", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public enum MenuType implements OptionDropdownMenuType {
        WRITING(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.history_list_option_menu_delete_writing), Integer.valueOf(R.string.setting_title)})),
        BROWSING(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.history_list_option_menu_delete_browsing), Integer.valueOf(R.string.setting_title)}));

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
        private final List<Integer> titles;

        public static EnumEntries<MenuType> getEntries() {
            return $ENTRIES;
        }

        MenuType(List list) {
            this.titles = list;
        }

        @Override // com.medicmedia.medilink.ui.common.OptionDropdownMenuType
        public List<Integer> getTitles() {
            return this.titles;
        }
    }

    /* JADX INFO: compiled from: HistoryListItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011j\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryList$WritingIcon;", "", "mode", "", "resourceId", "size", "<init>", "(Ljava/lang/String;IIII)V", "getMode", "()I", "getResourceId", "getSize", "MEMO", "BOOKMARK", "MARKER", "isMarker", "", "()Z", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public enum WritingIcon {
        MEMO(WritingMode.MEMO.getValue(), R.drawable.ic_memo_bluegreen, 30),
        BOOKMARK(WritingMode.BOOKMARK.getValue(), R.drawable.ic_bookmark_bluegreen, 30),
        MARKER(WritingMode.MARKER.getValue(), R.drawable.ic_marker_bk_20, 40);

        private final int mode;
        private final int resourceId;
        private final int size;
        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public static EnumEntries<WritingIcon> getEntries() {
            return $ENTRIES;
        }

        WritingIcon(int i, int i2, int i3) {
            this.mode = i;
            this.resourceId = i2;
            this.size = i3;
        }

        public final int getMode() {
            return this.mode;
        }

        public final int getResourceId() {
            return this.resourceId;
        }

        public final int getSize() {
            return this.size;
        }

        /* JADX INFO: compiled from: HistoryListItem.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryList$WritingIcon$Companion;", "", "<init>", "()V", "convertTo", "Lcom/medicmedia/medilink/ui/history/HistoryList$WritingIcon;", "mode", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final WritingIcon convertTo(int mode) {
                WritingIcon next;
                Iterator<WritingIcon> it = WritingIcon.getEntries().iterator();
                while (it.hasNext()) {
                    next = it.next();
                    if (next.getMode() == mode) {
                        return next;
                    }
                }
                next = null;
                return next;
            }
        }

        public final boolean isMarker() {
            return this == MARKER;
        }
    }
}
