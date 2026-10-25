package com.medicmedia.medilink.ui.history;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HistoryListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryChildCommand;", "", TypedValues.AttributesType.S_TARGET, "Lcom/medicmedia/medilink/ui/history/HistoryListType;", "getTarget", "()Lcom/medicmedia/medilink/ui/history/HistoryListType;", "ResetFilter", "UpdateContentsFilter", "ScrollToTop", "Lcom/medicmedia/medilink/ui/history/HistoryChildCommand$ResetFilter;", "Lcom/medicmedia/medilink/ui/history/HistoryChildCommand$ScrollToTop;", "Lcom/medicmedia/medilink/ui/history/HistoryChildCommand$UpdateContentsFilter;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface HistoryChildCommand {
    HistoryListType getTarget();

    /* JADX INFO: compiled from: HistoryListViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryChildCommand$ResetFilter;", "Lcom/medicmedia/medilink/ui/history/HistoryChildCommand;", TypedValues.AttributesType.S_TARGET, "Lcom/medicmedia/medilink/ui/history/HistoryListType;", "isSelectedAll", "", "<init>", "(Lcom/medicmedia/medilink/ui/history/HistoryListType;Z)V", "getTarget", "()Lcom/medicmedia/medilink/ui/history/HistoryListType;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ResetFilter implements HistoryChildCommand {
        public static final int $stable = 0;
        private final boolean isSelectedAll;
        private final HistoryListType target;

        public static /* synthetic */ ResetFilter copy$default(ResetFilter resetFilter, HistoryListType historyListType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                historyListType = resetFilter.target;
            }
            if ((i & 2) != 0) {
                z = resetFilter.isSelectedAll;
            }
            return resetFilter.copy(historyListType, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HistoryListType getTarget() {
            return this.target;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getIsSelectedAll() {
            return this.isSelectedAll;
        }

        public final ResetFilter copy(HistoryListType target, boolean isSelectedAll) {
            Intrinsics.checkNotNullParameter(target, "target");
            return new ResetFilter(target, isSelectedAll);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResetFilter)) {
                return false;
            }
            ResetFilter resetFilter = (ResetFilter) other;
            return this.target == resetFilter.target && this.isSelectedAll == resetFilter.isSelectedAll;
        }

        public int hashCode() {
            return (this.target.hashCode() * 31) + Boolean.hashCode(this.isSelectedAll);
        }

        public String toString() {
            return "ResetFilter(target=" + this.target + ", isSelectedAll=" + this.isSelectedAll + ")";
        }

        public ResetFilter(HistoryListType target, boolean z) {
            Intrinsics.checkNotNullParameter(target, "target");
            this.target = target;
            this.isSelectedAll = z;
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryChildCommand
        public HistoryListType getTarget() {
            return this.target;
        }

        public final boolean isSelectedAll() {
            return this.isSelectedAll;
        }
    }

    /* JADX INFO: compiled from: HistoryListViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryChildCommand$UpdateContentsFilter;", "Lcom/medicmedia/medilink/ui/history/HistoryChildCommand;", TypedValues.AttributesType.S_TARGET, "Lcom/medicmedia/medilink/ui/history/HistoryListType;", "<init>", "(Lcom/medicmedia/medilink/ui/history/HistoryListType;)V", "getTarget", "()Lcom/medicmedia/medilink/ui/history/HistoryListType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class UpdateContentsFilter implements HistoryChildCommand {
        public static final int $stable = 0;
        private final HistoryListType target;

        public static /* synthetic */ UpdateContentsFilter copy$default(UpdateContentsFilter updateContentsFilter, HistoryListType historyListType, int i, Object obj) {
            if ((i & 1) != 0) {
                historyListType = updateContentsFilter.target;
            }
            return updateContentsFilter.copy(historyListType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HistoryListType getTarget() {
            return this.target;
        }

        public final UpdateContentsFilter copy(HistoryListType target) {
            Intrinsics.checkNotNullParameter(target, "target");
            return new UpdateContentsFilter(target);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateContentsFilter) && this.target == ((UpdateContentsFilter) other).target;
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            return "UpdateContentsFilter(target=" + this.target + ")";
        }

        public UpdateContentsFilter(HistoryListType target) {
            Intrinsics.checkNotNullParameter(target, "target");
            this.target = target;
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryChildCommand
        public HistoryListType getTarget() {
            return this.target;
        }
    }

    /* JADX INFO: compiled from: HistoryListViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0015H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryChildCommand$ScrollToTop;", "Lcom/medicmedia/medilink/ui/history/HistoryChildCommand;", TypedValues.AttributesType.S_TARGET, "Lcom/medicmedia/medilink/ui/history/HistoryListType;", "animate", "", "<init>", "(Lcom/medicmedia/medilink/ui/history/HistoryListType;Z)V", "getTarget", "()Lcom/medicmedia/medilink/ui/history/HistoryListType;", "getAnimate", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ScrollToTop implements HistoryChildCommand {
        public static final int $stable = 0;
        private final boolean animate;
        private final HistoryListType target;

        public static /* synthetic */ ScrollToTop copy$default(ScrollToTop scrollToTop, HistoryListType historyListType, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                historyListType = scrollToTop.target;
            }
            if ((i & 2) != 0) {
                z = scrollToTop.animate;
            }
            return scrollToTop.copy(historyListType, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HistoryListType getTarget() {
            return this.target;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getAnimate() {
            return this.animate;
        }

        public final ScrollToTop copy(HistoryListType target, boolean animate) {
            Intrinsics.checkNotNullParameter(target, "target");
            return new ScrollToTop(target, animate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrollToTop)) {
                return false;
            }
            ScrollToTop scrollToTop = (ScrollToTop) other;
            return this.target == scrollToTop.target && this.animate == scrollToTop.animate;
        }

        public int hashCode() {
            return (this.target.hashCode() * 31) + Boolean.hashCode(this.animate);
        }

        public String toString() {
            return "ScrollToTop(target=" + this.target + ", animate=" + this.animate + ")";
        }

        public ScrollToTop(HistoryListType target, boolean z) {
            Intrinsics.checkNotNullParameter(target, "target");
            this.target = target;
            this.animate = z;
        }

        @Override // com.medicmedia.medilink.ui.history.HistoryChildCommand
        public HistoryListType getTarget() {
            return this.target;
        }

        public final boolean getAnimate() {
            return this.animate;
        }
    }
}
