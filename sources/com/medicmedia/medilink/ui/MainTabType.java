package com.medicmedia.medilink.ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.TutorialStep;
import com.medicmedia.medilink.ui.common.BottomBarTabType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: MainTabItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B/\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/ui/MainTabType;", "Lcom/medicmedia/medilink/ui/common/BottomBarTabType;", "", "value", "", "iconId", "labelId", "tutorialStep", "Lcom/medicmedia/medilink/domain/model/TutorialStep;", "<init>", "(Ljava/lang/String;IIIILcom/medicmedia/medilink/domain/model/TutorialStep;)V", "getValue", "()I", "getIconId", "getLabelId", "getTutorialStep", "()Lcom/medicmedia/medilink/domain/model/TutorialStep;", "BOOK_LIST", "HISTORY_LIST", "isHistoryList", "", "()Z", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum MainTabType implements BottomBarTabType {
    BOOK_LIST(0, R.drawable.ic_book_list_24px, R.string.main_tab_book_list, TutorialStep.STEP1),
    HISTORY_LIST(1, R.drawable.ic_history_list_24px, R.string.main_tab_history_list, TutorialStep.STEP2);

    private final int iconId;
    private final int labelId;
    private final TutorialStep tutorialStep;
    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<MainTabType> getEntries() {
        return $ENTRIES;
    }

    MainTabType(int i, int i2, int i3, TutorialStep tutorialStep) {
        this.value = i;
        this.iconId = i2;
        this.labelId = i3;
        this.tutorialStep = tutorialStep;
    }

    /* synthetic */ MainTabType(int i, int i2, int i3, TutorialStep tutorialStep, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, tutorialStep);
    }

    @Override // com.medicmedia.medilink.ui.common.BottomBarTabType
    public int getValue() {
        return this.value;
    }

    @Override // com.medicmedia.medilink.ui.common.BottomBarTabType
    public int getIconId() {
        return this.iconId;
    }

    @Override // com.medicmedia.medilink.ui.common.BottomBarTabType
    public int getLabelId() {
        return this.labelId;
    }

    public final TutorialStep getTutorialStep() {
        return this.tutorialStep;
    }

    /* JADX INFO: compiled from: MainTabItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/MainTabType$Companion;", "", "<init>", "()V", "find", "Lcom/medicmedia/medilink/ui/MainTabType;", "value", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MainTabType find(int value) {
            MainTabType next;
            Iterator<MainTabType> it = MainTabType.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.getValue() == value) {
                    return next;
                }
            }
            next = null;
            return next;
        }
    }

    public final boolean isHistoryList() {
        return this == HISTORY_LIST;
    }
}
