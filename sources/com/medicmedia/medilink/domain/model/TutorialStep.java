package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: TutorialStep.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/domain/model/TutorialStep;", "", "index", "", "<init>", "(Ljava/lang/String;II)V", "getIndex", "()I", "STEP1", "STEP2", "STEP3", "STEP4", "STEP5", "STEP6", "STEP7", "COMPLETE", "isMainTabTutorialStep", "", "()Z", "isHistoryTutorialStep", "isComplete", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum TutorialStep {
    STEP1(0),
    STEP2(1),
    STEP3(2),
    STEP4(0),
    STEP5(1),
    STEP6(3),
    STEP7(2),
    COMPLETE(4);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int index;

    public static EnumEntries<TutorialStep> getEntries() {
        return $ENTRIES;
    }

    TutorialStep(int i) {
        this.index = i;
    }

    public final int getIndex() {
        return this.index;
    }

    public final boolean isMainTabTutorialStep() {
        return this == STEP6 || this == COMPLETE;
    }

    public final boolean isHistoryTutorialStep() {
        return this == STEP4 || this == STEP7;
    }

    public final boolean isComplete() {
        return this == COMPLETE;
    }
}
