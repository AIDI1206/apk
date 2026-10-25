package com.medicmedia.medilink.ui.checkmode;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.offline.OfflineUrlOption;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: ContinuousCheckModeItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u0004\u0018\u00010\nj\u0002\b\u0004j\u0002\b\u0005¨\u0006\u000b"}, d2 = {"Lcom/medicmedia/medilink/ui/checkmode/OfflineWebViewOverScrollType;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "index", "", "value", "urlOption", "Lcom/medicmedia/medilink/ui/offline/OfflineUrlOption;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum OfflineWebViewOverScrollType {
    TOP,
    BOTTOM;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: compiled from: ContinuousCheckModeItem.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OfflineWebViewOverScrollType.values().length];
            try {
                iArr[OfflineWebViewOverScrollType.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineWebViewOverScrollType.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static EnumEntries<OfflineWebViewOverScrollType> getEntries() {
        return $ENTRIES;
    }

    public final int index(int value) {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return value - 1;
        }
        if (i == 2) {
            return value + 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final OfflineUrlOption urlOption() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return new OfflineUrlOption.End(null, 1, null);
        }
        if (i == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
