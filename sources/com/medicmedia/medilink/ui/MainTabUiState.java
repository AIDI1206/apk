package com.medicmedia.medilink.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.TutorialStep;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainTabViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001bJZ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÇ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010(\u001a\u00020\u0005H×\u0001J\t\u0010)\u001a\u00020*H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/medicmedia/medilink/ui/MainTabUiState;", "", "isLoading", "", "errorMessage", "", "selectedTabType", "Lcom/medicmedia/medilink/ui/MainTabType;", "showDashboard", "showContinuousCheckMode", "tutorialStep", "Lcom/medicmedia/medilink/domain/model/TutorialStep;", "selectedLibraryTab", "", "<init>", "(ZLjava/lang/Integer;Lcom/medicmedia/medilink/ui/MainTabType;ZZLcom/medicmedia/medilink/domain/model/TutorialStep;Lkotlin/Unit;)V", "()Z", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSelectedTabType", "()Lcom/medicmedia/medilink/ui/MainTabType;", "getShowDashboard", "getShowContinuousCheckMode", "getTutorialStep", "()Lcom/medicmedia/medilink/domain/model/TutorialStep;", "getSelectedLibraryTab", "()Lkotlin/Unit;", "Lkotlin/Unit;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ZLjava/lang/Integer;Lcom/medicmedia/medilink/ui/MainTabType;ZZLcom/medicmedia/medilink/domain/model/TutorialStep;Lkotlin/Unit;)Lcom/medicmedia/medilink/ui/MainTabUiState;", "equals", "other", "hashCode", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class MainTabUiState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final MainTabUiState f60default = new MainTabUiState(false, null, null, false, false, null, null, 127, null);
    private final Integer errorMessage;
    private final boolean isLoading;
    private final Unit selectedLibraryTab;
    private final MainTabType selectedTabType;
    private final boolean showContinuousCheckMode;
    private final boolean showDashboard;
    private final TutorialStep tutorialStep;

    public MainTabUiState() {
        this(false, null, null, false, false, null, null, 127, null);
    }

    public static /* synthetic */ MainTabUiState copy$default(MainTabUiState mainTabUiState, boolean z, Integer num, MainTabType mainTabType, boolean z2, boolean z3, TutorialStep tutorialStep, Unit unit, int i, Object obj) {
        if ((i & 1) != 0) {
            z = mainTabUiState.isLoading;
        }
        if ((i & 2) != 0) {
            num = mainTabUiState.errorMessage;
        }
        if ((i & 4) != 0) {
            mainTabType = mainTabUiState.selectedTabType;
        }
        if ((i & 8) != 0) {
            z2 = mainTabUiState.showDashboard;
        }
        if ((i & 16) != 0) {
            z3 = mainTabUiState.showContinuousCheckMode;
        }
        if ((i & 32) != 0) {
            tutorialStep = mainTabUiState.tutorialStep;
        }
        if ((i & 64) != 0) {
            unit = mainTabUiState.selectedLibraryTab;
        }
        TutorialStep tutorialStep2 = tutorialStep;
        Unit unit2 = unit;
        boolean z4 = z3;
        MainTabType mainTabType2 = mainTabType;
        return mainTabUiState.copy(z, num, mainTabType2, z2, z4, tutorialStep2, unit2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MainTabType getSelectedTabType() {
        return this.selectedTabType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShowDashboard() {
        return this.showDashboard;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowContinuousCheckMode() {
        return this.showContinuousCheckMode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TutorialStep getTutorialStep() {
        return this.tutorialStep;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Unit getSelectedLibraryTab() {
        return this.selectedLibraryTab;
    }

    public final MainTabUiState copy(boolean isLoading, Integer errorMessage, MainTabType selectedTabType, boolean showDashboard, boolean showContinuousCheckMode, TutorialStep tutorialStep, Unit selectedLibraryTab) {
        Intrinsics.checkNotNullParameter(selectedTabType, "selectedTabType");
        return new MainTabUiState(isLoading, errorMessage, selectedTabType, showDashboard, showContinuousCheckMode, tutorialStep, selectedLibraryTab);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainTabUiState)) {
            return false;
        }
        MainTabUiState mainTabUiState = (MainTabUiState) other;
        return this.isLoading == mainTabUiState.isLoading && Intrinsics.areEqual(this.errorMessage, mainTabUiState.errorMessage) && this.selectedTabType == mainTabUiState.selectedTabType && this.showDashboard == mainTabUiState.showDashboard && this.showContinuousCheckMode == mainTabUiState.showContinuousCheckMode && this.tutorialStep == mainTabUiState.tutorialStep && Intrinsics.areEqual(this.selectedLibraryTab, mainTabUiState.selectedLibraryTab);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        Integer num = this.errorMessage;
        int iHashCode2 = (((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.selectedTabType.hashCode()) * 31) + Boolean.hashCode(this.showDashboard)) * 31) + Boolean.hashCode(this.showContinuousCheckMode)) * 31;
        TutorialStep tutorialStep = this.tutorialStep;
        int iHashCode3 = (iHashCode2 + (tutorialStep == null ? 0 : tutorialStep.hashCode())) * 31;
        Unit unit = this.selectedLibraryTab;
        return iHashCode3 + (unit != null ? unit.hashCode() : 0);
    }

    public String toString() {
        return "MainTabUiState(isLoading=" + this.isLoading + ", errorMessage=" + this.errorMessage + ", selectedTabType=" + this.selectedTabType + ", showDashboard=" + this.showDashboard + ", showContinuousCheckMode=" + this.showContinuousCheckMode + ", tutorialStep=" + this.tutorialStep + ", selectedLibraryTab=" + this.selectedLibraryTab + ")";
    }

    public MainTabUiState(boolean z, Integer num, MainTabType selectedTabType, boolean z2, boolean z3, TutorialStep tutorialStep, Unit unit) {
        Intrinsics.checkNotNullParameter(selectedTabType, "selectedTabType");
        this.isLoading = z;
        this.errorMessage = num;
        this.selectedTabType = selectedTabType;
        this.showDashboard = z2;
        this.showContinuousCheckMode = z3;
        this.tutorialStep = tutorialStep;
        this.selectedLibraryTab = unit;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public /* synthetic */ MainTabUiState(boolean z, Integer num, MainTabType mainTabType, boolean z2, boolean z3, TutorialStep tutorialStep, Unit unit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? MainTabType.BOOK_LIST : mainTabType, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : tutorialStep, (i & 64) != 0 ? null : unit);
    }

    public final MainTabType getSelectedTabType() {
        return this.selectedTabType;
    }

    public final boolean getShowDashboard() {
        return this.showDashboard;
    }

    public final boolean getShowContinuousCheckMode() {
        return this.showContinuousCheckMode;
    }

    public final TutorialStep getTutorialStep() {
        return this.tutorialStep;
    }

    public final Unit getSelectedLibraryTab() {
        return this.selectedLibraryTab;
    }

    /* JADX INFO: compiled from: MainTabViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/MainTabUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/MainTabUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/MainTabUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MainTabUiState getDefault() {
            return MainTabUiState.f60default;
        }
    }
}
