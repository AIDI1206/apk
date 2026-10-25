package com.medicmedia.medilink.domain.redux;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.TutorialStep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonUi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/CommonUiState;", "", "selectedHistoryTab", "", "updateAnnounceBadge", "", "nextTutorialStep", "Lcom/medicmedia/medilink/domain/model/TutorialStep;", "<init>", "(Ljava/lang/Integer;Lkotlin/Unit;Lcom/medicmedia/medilink/domain/model/TutorialStep;)V", "getSelectedHistoryTab", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUpdateAnnounceBadge", "()Lkotlin/Unit;", "Lkotlin/Unit;", "getNextTutorialStep", "()Lcom/medicmedia/medilink/domain/model/TutorialStep;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Lkotlin/Unit;Lcom/medicmedia/medilink/domain/model/TutorialStep;)Lcom/medicmedia/medilink/domain/redux/CommonUiState;", "equals", "", "other", "hashCode", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class CommonUiState {
    private final TutorialStep nextTutorialStep;
    private final Integer selectedHistoryTab;
    private final Unit updateAnnounceBadge;

    public CommonUiState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CommonUiState copy$default(CommonUiState commonUiState, Integer num, Unit unit, TutorialStep tutorialStep, int i, Object obj) {
        if ((i & 1) != 0) {
            num = commonUiState.selectedHistoryTab;
        }
        if ((i & 2) != 0) {
            unit = commonUiState.updateAnnounceBadge;
        }
        if ((i & 4) != 0) {
            tutorialStep = commonUiState.nextTutorialStep;
        }
        return commonUiState.copy(num, unit, tutorialStep);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getSelectedHistoryTab() {
        return this.selectedHistoryTab;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Unit getUpdateAnnounceBadge() {
        return this.updateAnnounceBadge;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TutorialStep getNextTutorialStep() {
        return this.nextTutorialStep;
    }

    public final CommonUiState copy(Integer selectedHistoryTab, Unit updateAnnounceBadge, TutorialStep nextTutorialStep) {
        return new CommonUiState(selectedHistoryTab, updateAnnounceBadge, nextTutorialStep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonUiState)) {
            return false;
        }
        CommonUiState commonUiState = (CommonUiState) other;
        return Intrinsics.areEqual(this.selectedHistoryTab, commonUiState.selectedHistoryTab) && Intrinsics.areEqual(this.updateAnnounceBadge, commonUiState.updateAnnounceBadge) && this.nextTutorialStep == commonUiState.nextTutorialStep;
    }

    public int hashCode() {
        Integer num = this.selectedHistoryTab;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Unit unit = this.updateAnnounceBadge;
        int iHashCode2 = (iHashCode + (unit == null ? 0 : unit.hashCode())) * 31;
        TutorialStep tutorialStep = this.nextTutorialStep;
        return iHashCode2 + (tutorialStep != null ? tutorialStep.hashCode() : 0);
    }

    public String toString() {
        return "CommonUiState(selectedHistoryTab=" + this.selectedHistoryTab + ", updateAnnounceBadge=" + this.updateAnnounceBadge + ", nextTutorialStep=" + this.nextTutorialStep + ")";
    }

    public CommonUiState(Integer num, Unit unit, TutorialStep tutorialStep) {
        this.selectedHistoryTab = num;
        this.updateAnnounceBadge = unit;
        this.nextTutorialStep = tutorialStep;
    }

    public /* synthetic */ CommonUiState(Integer num, Unit unit, TutorialStep tutorialStep, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : unit, (i & 4) != 0 ? null : tutorialStep);
    }

    public final Integer getSelectedHistoryTab() {
        return this.selectedHistoryTab;
    }

    public final Unit getUpdateAnnounceBadge() {
        return this.updateAnnounceBadge;
    }

    public final TutorialStep getNextTutorialStep() {
        return this.nextTutorialStep;
    }
}
