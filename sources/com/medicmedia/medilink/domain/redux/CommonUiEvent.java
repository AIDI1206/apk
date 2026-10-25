package com.medicmedia.medilink.domain.redux;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.TutorialStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonUi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/CommonUiEvent;", "", "UpdateAnnounceBadge", "SelectLibraryTab", "SelectHistoryTab", "NextTutorialStep", "Lcom/medicmedia/medilink/domain/redux/CommonUiEvent$NextTutorialStep;", "Lcom/medicmedia/medilink/domain/redux/CommonUiEvent$SelectHistoryTab;", "Lcom/medicmedia/medilink/domain/redux/CommonUiEvent$SelectLibraryTab;", "Lcom/medicmedia/medilink/domain/redux/CommonUiEvent$UpdateAnnounceBadge;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface CommonUiEvent {

    /* JADX INFO: compiled from: CommonUi.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/CommonUiEvent$UpdateAnnounceBadge;", "Lcom/medicmedia/medilink/domain/redux/CommonUiEvent;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class UpdateAnnounceBadge implements CommonUiEvent {
        public static final UpdateAnnounceBadge INSTANCE = new UpdateAnnounceBadge();

        private UpdateAnnounceBadge() {
        }
    }

    /* JADX INFO: compiled from: CommonUi.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/CommonUiEvent$SelectLibraryTab;", "Lcom/medicmedia/medilink/domain/redux/CommonUiEvent;", "<init>", "()V", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SelectLibraryTab implements CommonUiEvent {
        public static final SelectLibraryTab INSTANCE = new SelectLibraryTab();

        private SelectLibraryTab() {
        }
    }

    /* JADX INFO: compiled from: CommonUi.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/CommonUiEvent$SelectHistoryTab;", "Lcom/medicmedia/medilink/domain/redux/CommonUiEvent;", "value", "", "<init>", "(I)V", "getValue", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SelectHistoryTab implements CommonUiEvent {
        private final int value;

        public static /* synthetic */ SelectHistoryTab copy$default(SelectHistoryTab selectHistoryTab, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = selectHistoryTab.value;
            }
            return selectHistoryTab.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        public final SelectHistoryTab copy(int value) {
            return new SelectHistoryTab(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectHistoryTab) && this.value == ((SelectHistoryTab) other).value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        public String toString() {
            return "SelectHistoryTab(value=" + this.value + ")";
        }

        public SelectHistoryTab(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: CommonUi.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/CommonUiEvent$NextTutorialStep;", "Lcom/medicmedia/medilink/domain/redux/CommonUiEvent;", "step", "Lcom/medicmedia/medilink/domain/model/TutorialStep;", "<init>", "(Lcom/medicmedia/medilink/domain/model/TutorialStep;)V", "getStep", "()Lcom/medicmedia/medilink/domain/model/TutorialStep;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class NextTutorialStep implements CommonUiEvent {
        private final TutorialStep step;

        public static /* synthetic */ NextTutorialStep copy$default(NextTutorialStep nextTutorialStep, TutorialStep tutorialStep, int i, Object obj) {
            if ((i & 1) != 0) {
                tutorialStep = nextTutorialStep.step;
            }
            return nextTutorialStep.copy(tutorialStep);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final TutorialStep getStep() {
            return this.step;
        }

        public final NextTutorialStep copy(TutorialStep step) {
            Intrinsics.checkNotNullParameter(step, "step");
            return new NextTutorialStep(step);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NextTutorialStep) && this.step == ((NextTutorialStep) other).step;
        }

        public int hashCode() {
            return this.step.hashCode();
        }

        public String toString() {
            return "NextTutorialStep(step=" + this.step + ")";
        }

        public NextTutorialStep(TutorialStep step) {
            Intrinsics.checkNotNullParameter(step, "step");
            this.step = step;
        }

        public final TutorialStep getStep() {
            return this.step;
        }
    }
}
