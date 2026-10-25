package com.medicmedia.medilink.ui.scan;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.perf.util.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: QrReadingProgress.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bj\u0002\b\u0004j\u0002\b\u0005¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/ui/scan/QrReadingProgress;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLE", "DISABLE", Constants.ENABLE_DISABLE, "", "()Z", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum QrReadingProgress {
    ENABLE,
    DISABLE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    public static EnumEntries<QrReadingProgress> getEntries() {
        return $ENTRIES;
    }

    public final boolean isEnabled() {
        return this == ENABLE;
    }
}
