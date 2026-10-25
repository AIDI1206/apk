package com.medicmedia.medilink.ui.history;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.TutorialStep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HistoryListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JH\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÇ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u001fH×\u0001J\t\u0010 \u001a\u00020!H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListUiState;", "", "selectedListType", "Lcom/medicmedia/medilink/ui/history/HistoryListType;", "showContentsFilter", "showContentsColorFilter", "scrollToTopWithAnimation", "", "tutorialStep", "Lcom/medicmedia/medilink/domain/model/TutorialStep;", "<init>", "(Lcom/medicmedia/medilink/ui/history/HistoryListType;Lcom/medicmedia/medilink/ui/history/HistoryListType;Lcom/medicmedia/medilink/ui/history/HistoryListType;Ljava/lang/Boolean;Lcom/medicmedia/medilink/domain/model/TutorialStep;)V", "getSelectedListType", "()Lcom/medicmedia/medilink/ui/history/HistoryListType;", "getShowContentsFilter", "getShowContentsColorFilter", "getScrollToTopWithAnimation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTutorialStep", "()Lcom/medicmedia/medilink/domain/model/TutorialStep;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/medicmedia/medilink/ui/history/HistoryListType;Lcom/medicmedia/medilink/ui/history/HistoryListType;Lcom/medicmedia/medilink/ui/history/HistoryListType;Ljava/lang/Boolean;Lcom/medicmedia/medilink/domain/model/TutorialStep;)Lcom/medicmedia/medilink/ui/history/HistoryListUiState;", "equals", "other", "hashCode", "", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class HistoryListUiState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final HistoryListUiState f130default = new HistoryListUiState(null, null, null, null, null, 31, null);
    private final Boolean scrollToTopWithAnimation;
    private final HistoryListType selectedListType;
    private final HistoryListType showContentsColorFilter;
    private final HistoryListType showContentsFilter;
    private final TutorialStep tutorialStep;

    public HistoryListUiState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ HistoryListUiState copy$default(HistoryListUiState historyListUiState, HistoryListType historyListType, HistoryListType historyListType2, HistoryListType historyListType3, Boolean bool, TutorialStep tutorialStep, int i, Object obj) {
        if ((i & 1) != 0) {
            historyListType = historyListUiState.selectedListType;
        }
        if ((i & 2) != 0) {
            historyListType2 = historyListUiState.showContentsFilter;
        }
        if ((i & 4) != 0) {
            historyListType3 = historyListUiState.showContentsColorFilter;
        }
        if ((i & 8) != 0) {
            bool = historyListUiState.scrollToTopWithAnimation;
        }
        if ((i & 16) != 0) {
            tutorialStep = historyListUiState.tutorialStep;
        }
        TutorialStep tutorialStep2 = tutorialStep;
        HistoryListType historyListType4 = historyListType3;
        return historyListUiState.copy(historyListType, historyListType2, historyListType4, bool, tutorialStep2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HistoryListType getSelectedListType() {
        return this.selectedListType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HistoryListType getShowContentsFilter() {
        return this.showContentsFilter;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HistoryListType getShowContentsColorFilter() {
        return this.showContentsColorFilter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getScrollToTopWithAnimation() {
        return this.scrollToTopWithAnimation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TutorialStep getTutorialStep() {
        return this.tutorialStep;
    }

    public final HistoryListUiState copy(HistoryListType selectedListType, HistoryListType showContentsFilter, HistoryListType showContentsColorFilter, Boolean scrollToTopWithAnimation, TutorialStep tutorialStep) {
        Intrinsics.checkNotNullParameter(selectedListType, "selectedListType");
        return new HistoryListUiState(selectedListType, showContentsFilter, showContentsColorFilter, scrollToTopWithAnimation, tutorialStep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryListUiState)) {
            return false;
        }
        HistoryListUiState historyListUiState = (HistoryListUiState) other;
        return this.selectedListType == historyListUiState.selectedListType && this.showContentsFilter == historyListUiState.showContentsFilter && this.showContentsColorFilter == historyListUiState.showContentsColorFilter && Intrinsics.areEqual(this.scrollToTopWithAnimation, historyListUiState.scrollToTopWithAnimation) && this.tutorialStep == historyListUiState.tutorialStep;
    }

    public int hashCode() {
        int iHashCode = this.selectedListType.hashCode() * 31;
        HistoryListType historyListType = this.showContentsFilter;
        int iHashCode2 = (iHashCode + (historyListType == null ? 0 : historyListType.hashCode())) * 31;
        HistoryListType historyListType2 = this.showContentsColorFilter;
        int iHashCode3 = (iHashCode2 + (historyListType2 == null ? 0 : historyListType2.hashCode())) * 31;
        Boolean bool = this.scrollToTopWithAnimation;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        TutorialStep tutorialStep = this.tutorialStep;
        return iHashCode4 + (tutorialStep != null ? tutorialStep.hashCode() : 0);
    }

    public String toString() {
        return "HistoryListUiState(selectedListType=" + this.selectedListType + ", showContentsFilter=" + this.showContentsFilter + ", showContentsColorFilter=" + this.showContentsColorFilter + ", scrollToTopWithAnimation=" + this.scrollToTopWithAnimation + ", tutorialStep=" + this.tutorialStep + ")";
    }

    public HistoryListUiState(HistoryListType selectedListType, HistoryListType historyListType, HistoryListType historyListType2, Boolean bool, TutorialStep tutorialStep) {
        Intrinsics.checkNotNullParameter(selectedListType, "selectedListType");
        this.selectedListType = selectedListType;
        this.showContentsFilter = historyListType;
        this.showContentsColorFilter = historyListType2;
        this.scrollToTopWithAnimation = bool;
        this.tutorialStep = tutorialStep;
    }

    public /* synthetic */ HistoryListUiState(HistoryListType historyListType, HistoryListType historyListType2, HistoryListType historyListType3, Boolean bool, TutorialStep tutorialStep, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HistoryListType.WRITING : historyListType, (i & 2) != 0 ? null : historyListType2, (i & 4) != 0 ? null : historyListType3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : tutorialStep);
    }

    public final HistoryListType getSelectedListType() {
        return this.selectedListType;
    }

    public final HistoryListType getShowContentsFilter() {
        return this.showContentsFilter;
    }

    public final HistoryListType getShowContentsColorFilter() {
        return this.showContentsColorFilter;
    }

    public final Boolean getScrollToTopWithAnimation() {
        return this.scrollToTopWithAnimation;
    }

    public final TutorialStep getTutorialStep() {
        return this.tutorialStep;
    }

    /* JADX INFO: compiled from: HistoryListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/history/HistoryListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/history/HistoryListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HistoryListUiState getDefault() {
            return HistoryListUiState.f130default;
        }
    }
}
