package com.medicmedia.medilink.ui.history;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.ContentsFilterListType;
import com.medicmedia.medilink.domain.model.TutorialStep;
import com.medicmedia.medilink.ui.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: HistoryListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListType;", "Lcom/medicmedia/medilink/domain/model/ContentsFilterListType;", "", "value", "", "resourceId", "deleteTitleId", "tutorialStep", "Lcom/medicmedia/medilink/domain/model/TutorialStep;", "<init>", "(Ljava/lang/String;IIIILcom/medicmedia/medilink/domain/model/TutorialStep;)V", "getValue", "()I", "getResourceId", "getDeleteTitleId", "getTutorialStep", "()Lcom/medicmedia/medilink/domain/model/TutorialStep;", "WRITING", "BROWSING", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum HistoryListType implements ContentsFilterListType {
    WRITING(0, R.string.history_list_tab_writing, R.string.history_list_option_menu_delete_writing, TutorialStep.STEP4),
    BROWSING(1, R.string.history_list_tab_browsing, R.string.history_list_option_menu_delete_browsing, TutorialStep.STEP7);

    private final int deleteTitleId;
    private final int resourceId;
    private final TutorialStep tutorialStep;
    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<HistoryListType> getEntries() {
        return $ENTRIES;
    }

    HistoryListType(int i, int i2, int i3, TutorialStep tutorialStep) {
        this.value = i;
        this.resourceId = i2;
        this.deleteTitleId = i3;
        this.tutorialStep = tutorialStep;
    }

    public final int getValue() {
        return this.value;
    }

    public final int getResourceId() {
        return this.resourceId;
    }

    public final int getDeleteTitleId() {
        return this.deleteTitleId;
    }

    public final TutorialStep getTutorialStep() {
        return this.tutorialStep;
    }

    /* JADX INFO: compiled from: HistoryListItem.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/history/HistoryListType$Companion;", "", "<init>", "()V", "find", "Lcom/medicmedia/medilink/ui/history/HistoryListType;", "value", "", "(Ljava/lang/Integer;)Lcom/medicmedia/medilink/ui/history/HistoryListType;", "isWritingList", "", "(Ljava/lang/Integer;)Z", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HistoryListType find(Integer value) {
            HistoryListType historyListType = null;
            if (value == null) {
                return null;
            }
            value.intValue();
            for (HistoryListType historyListType2 : HistoryListType.getEntries()) {
                int value2 = historyListType2.getValue();
                if (value != null && value2 == value.intValue()) {
                    historyListType = historyListType2;
                    break;
                }
            }
            return historyListType;
        }

        public final boolean isWritingList(Integer value) {
            return value != null && HistoryListType.WRITING.getValue() == value.intValue();
        }
    }
}
