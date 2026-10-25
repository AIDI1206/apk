package com.medicmedia.medilink.ui.history;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.medicmedia.medilink.domain.model.ContentsFilterListItem;
import com.medicmedia.medilink.domain.model.ContentsFilterWritingListItem;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.common.ContentsListFilterType;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HistoryListFilterType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010B\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListFilterType;", "Lcom/medicmedia/medilink/ui/common/ContentsListFilterType;", "resourceId", "", "isSelected", "", "<init>", "(IZ)V", "getResourceId", "()I", "()Z", "Companion", "All", "Marker", "BookMark", "Memo", "Contents", "Lcom/medicmedia/medilink/ui/history/HistoryListFilterType$All;", "Lcom/medicmedia/medilink/ui/history/HistoryListFilterType$BookMark;", "Lcom/medicmedia/medilink/ui/history/HistoryListFilterType$Contents;", "Lcom/medicmedia/medilink/ui/history/HistoryListFilterType$Marker;", "Lcom/medicmedia/medilink/ui/history/HistoryListFilterType$Memo;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class HistoryListFilterType implements ContentsListFilterType {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isSelected;
    private final int resourceId;

    public /* synthetic */ HistoryListFilterType(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    private HistoryListFilterType(int i, boolean z) {
        this.resourceId = i;
        this.isSelected = z;
    }

    @Override // com.medicmedia.medilink.ui.common.ContentsListFilterType
    public int getResourceId() {
        return this.resourceId;
    }

    @Override // com.medicmedia.medilink.ui.common.ContentsListFilterType
    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: compiled from: HistoryListFilterType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListFilterType$Companion;", "", "<init>", "()V", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "Lcom/medicmedia/medilink/ui/history/HistoryListFilterType;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<HistoryListFilterType> entries() {
            int i = 3;
            return CollectionsKt.listOf((Object[]) new HistoryListFilterType[]{new All(0, null, i, 0 == true ? 1 : 0), new Marker(0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), new BookMark(0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), new Memo(0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0), new Contents(0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0)});
        }
    }

    /* JADX INFO: compiled from: HistoryListFilterType.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÂ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0003H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListFilterType$All;", "Lcom/medicmedia/medilink/ui/history/HistoryListFilterType;", "resourceId", "", "filterItem", "Lcom/medicmedia/medilink/domain/model/ContentsFilterListItem;", "<init>", "(ILcom/medicmedia/medilink/domain/model/ContentsFilterListItem;)V", "getResourceId", "()I", "isSelected", "", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class All extends HistoryListFilterType {
        public static final int $stable = 8;
        private final ContentsFilterListItem filterItem;
        private final int resourceId;

        public All() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        private final ContentsFilterListItem getFilterItem() {
            return this.filterItem;
        }

        public static /* synthetic */ All copy$default(All all, int i, ContentsFilterListItem contentsFilterListItem, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = all.resourceId;
            }
            if ((i2 & 2) != 0) {
                contentsFilterListItem = all.filterItem;
            }
            return all.copy(i, contentsFilterListItem);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getResourceId() {
            return this.resourceId;
        }

        public final All copy(int resourceId, ContentsFilterListItem filterItem) {
            Intrinsics.checkNotNullParameter(filterItem, "filterItem");
            return new All(resourceId, filterItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof All)) {
                return false;
            }
            All all = (All) other;
            return this.resourceId == all.resourceId && Intrinsics.areEqual(this.filterItem, all.filterItem);
        }

        public int hashCode() {
            return (Integer.hashCode(this.resourceId) * 31) + this.filterItem.hashCode();
        }

        public String toString() {
            return "All(resourceId=" + this.resourceId + ", filterItem=" + this.filterItem + ")";
        }

        public /* synthetic */ All(int i, ContentsFilterWritingListItem contentsFilterWritingListItem, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.history_list_filter_all : i, (i2 & 2) != 0 ? new ContentsFilterWritingListItem(null, null, false, false, 15, null) : contentsFilterWritingListItem);
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        public int getResourceId() {
            return this.resourceId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public All(int i, ContentsFilterListItem filterItem) {
            super(i, false, null);
            Intrinsics.checkNotNullParameter(filterItem, "filterItem");
            this.resourceId = i;
            this.filterItem = filterItem;
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        /* JADX INFO: renamed from: isSelected */
        public boolean getIsSelected() {
            ContentsFilterListItem contentsFilterListItem = this.filterItem;
            if (contentsFilterListItem instanceof ContentsFilterWritingListItem) {
                return ((ContentsFilterWritingListItem) contentsFilterListItem).isSelectedAll();
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: HistoryListFilterType.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\t\u0010\u0017\u001a\u00020\u0006H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListFilterType$Marker;", "Lcom/medicmedia/medilink/ui/history/HistoryListFilterType;", "resourceId", "", "colors", "", "", "<init>", "(ILjava/util/Set;)V", "getResourceId", "()I", "getColors", "()Ljava/util/Set;", "isSelected", "", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Marker extends HistoryListFilterType {
        public static final int $stable = 8;
        private final Set<String> colors;
        private final int resourceId;

        public Marker() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Marker copy$default(Marker marker, int i, Set set, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = marker.resourceId;
            }
            if ((i2 & 2) != 0) {
                set = marker.colors;
            }
            return marker.copy(i, set);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getResourceId() {
            return this.resourceId;
        }

        public final Set<String> component2() {
            return this.colors;
        }

        public final Marker copy(int resourceId, Set<String> colors) {
            return new Marker(resourceId, colors);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Marker)) {
                return false;
            }
            Marker marker = (Marker) other;
            return this.resourceId == marker.resourceId && Intrinsics.areEqual(this.colors, marker.colors);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.resourceId) * 31;
            Set<String> set = this.colors;
            return iHashCode + (set == null ? 0 : set.hashCode());
        }

        public String toString() {
            return "Marker(resourceId=" + this.resourceId + ", colors=" + this.colors + ")";
        }

        public /* synthetic */ Marker(int i, Set set, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.history_list_filter_marker : i, (i2 & 2) != 0 ? null : set);
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        public int getResourceId() {
            return this.resourceId;
        }

        public final Set<String> getColors() {
            return this.colors;
        }

        public Marker(int i, Set<String> set) {
            super(i, false, null);
            this.resourceId = i;
            this.colors = set;
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        /* JADX INFO: renamed from: isSelected */
        public boolean getIsSelected() {
            return this.colors == null;
        }
    }

    /* JADX INFO: compiled from: HistoryListFilterType.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0003H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListFilterType$BookMark;", "Lcom/medicmedia/medilink/ui/history/HistoryListFilterType;", "resourceId", "", "isActive", "", "<init>", "(IZ)V", "getResourceId", "()I", "()Z", "isSelected", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class BookMark extends HistoryListFilterType {
        public static final int $stable = 0;
        private final boolean isActive;
        private final int resourceId;

        public BookMark() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public static /* synthetic */ BookMark copy$default(BookMark bookMark, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bookMark.resourceId;
            }
            if ((i2 & 2) != 0) {
                z = bookMark.isActive;
            }
            return bookMark.copy(i, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getResourceId() {
            return this.resourceId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        public final BookMark copy(int resourceId, boolean isActive) {
            return new BookMark(resourceId, isActive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BookMark)) {
                return false;
            }
            BookMark bookMark = (BookMark) other;
            return this.resourceId == bookMark.resourceId && this.isActive == bookMark.isActive;
        }

        public int hashCode() {
            return (Integer.hashCode(this.resourceId) * 31) + Boolean.hashCode(this.isActive);
        }

        public String toString() {
            return "BookMark(resourceId=" + this.resourceId + ", isActive=" + this.isActive + ")";
        }

        public /* synthetic */ BookMark(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.history_list_filter_bookmark : i, (i2 & 2) != 0 ? true : z);
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        public int getResourceId() {
            return this.resourceId;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public BookMark(int i, boolean z) {
            super(i, false, null);
            this.resourceId = i;
            this.isActive = z;
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        /* JADX INFO: renamed from: isSelected */
        public boolean getIsSelected() {
            return this.isActive;
        }
    }

    /* JADX INFO: compiled from: HistoryListFilterType.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0003H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListFilterType$Memo;", "Lcom/medicmedia/medilink/ui/history/HistoryListFilterType;", "resourceId", "", "isActive", "", "<init>", "(IZ)V", "getResourceId", "()I", "()Z", "isSelected", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Memo extends HistoryListFilterType {
        public static final int $stable = 0;
        private final boolean isActive;
        private final int resourceId;

        public Memo() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public static /* synthetic */ Memo copy$default(Memo memo, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = memo.resourceId;
            }
            if ((i2 & 2) != 0) {
                z = memo.isActive;
            }
            return memo.copy(i, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getResourceId() {
            return this.resourceId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        public final Memo copy(int resourceId, boolean isActive) {
            return new Memo(resourceId, isActive);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Memo)) {
                return false;
            }
            Memo memo = (Memo) other;
            return this.resourceId == memo.resourceId && this.isActive == memo.isActive;
        }

        public int hashCode() {
            return (Integer.hashCode(this.resourceId) * 31) + Boolean.hashCode(this.isActive);
        }

        public String toString() {
            return "Memo(resourceId=" + this.resourceId + ", isActive=" + this.isActive + ")";
        }

        public /* synthetic */ Memo(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? R.string.history_list_filter_memo : i, (i2 & 2) != 0 ? true : z);
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        public int getResourceId() {
            return this.resourceId;
        }

        public final boolean isActive() {
            return this.isActive;
        }

        public Memo(int i, boolean z) {
            super(i, false, null);
            this.resourceId = i;
            this.isActive = z;
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        /* JADX INFO: renamed from: isSelected */
        public boolean getIsSelected() {
            return this.isActive;
        }
    }

    /* JADX INFO: compiled from: HistoryListFilterType.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0006H×\u0001J\t\u0010\u0015\u001a\u00020\u0004H×\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListFilterType$Contents;", "Lcom/medicmedia/medilink/ui/history/HistoryListFilterType;", "contentsId", "", "", "resourceId", "", "<init>", "(Ljava/util/Set;I)V", "getResourceId", "()I", "isSelected", "", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Contents extends HistoryListFilterType {
        public static final int $stable = 8;
        private final Set<String> contentsId;
        private final boolean isSelected;
        private final int resourceId;

        public Contents() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        private final Set<String> component1() {
            return this.contentsId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Contents copy$default(Contents contents, Set set, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                set = contents.contentsId;
            }
            if ((i2 & 2) != 0) {
                i = contents.resourceId;
            }
            return contents.copy(set, i);
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getResourceId() {
            return this.resourceId;
        }

        public final Contents copy(Set<String> contentsId, int resourceId) {
            return new Contents(contentsId, resourceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Contents)) {
                return false;
            }
            Contents contents = (Contents) other;
            return Intrinsics.areEqual(this.contentsId, contents.contentsId) && this.resourceId == contents.resourceId;
        }

        public int hashCode() {
            Set<String> set = this.contentsId;
            return ((set == null ? 0 : set.hashCode()) * 31) + Integer.hashCode(this.resourceId);
        }

        public String toString() {
            return "Contents(contentsId=" + this.contentsId + ", resourceId=" + this.resourceId + ")";
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        public int getResourceId() {
            return this.resourceId;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Contents(Set set, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            set = (i2 & 1) != 0 ? null : set;
            if ((i2 & 2) != 0) {
                if (set != null) {
                    i = R.string.history_list_filter_contents;
                } else {
                    i = R.string.history_list_filter_contents_all;
                }
            }
            this(set, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Contents(Set<String> set, int i) {
            boolean z = false;
            super(i, z, null);
            this.contentsId = set;
            this.resourceId = i;
            if (set != null && set.isEmpty()) {
                z = true;
            }
            this.isSelected = !z;
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        /* JADX INFO: renamed from: isSelected, reason: from getter */
        public boolean getIsSelected() {
            return this.isSelected;
        }
    }
}
