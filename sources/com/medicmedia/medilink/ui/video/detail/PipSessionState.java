package com.medicmedia.medilink.ui.video.detail;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: VideoDetailItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\r\u0010\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/ui/video/detail/PipSessionState;", "", "<init>", "(Ljava/lang/String;I)V", "Idle", "Entering", "Active", "Restoring", "Closed", "suppressBackgroundPlayback", "", "getSuppressBackgroundPlayback", "()Z", "isPipRelated", "shouldHandlePipClosed", "isChangingConfigurations", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum PipSessionState {
    Idle,
    Entering,
    Active,
    Restoring,
    Closed;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    public static EnumEntries<PipSessionState> getEntries() {
        return $ENTRIES;
    }

    public final boolean getSuppressBackgroundPlayback() {
        return this == Entering || this == Active || this == Restoring || this == Closed;
    }

    public final boolean isPipRelated() {
        return this == Entering || this == Active || this == Restoring;
    }

    public final boolean shouldHandlePipClosed(boolean isChangingConfigurations) {
        if (isChangingConfigurations) {
            return false;
        }
        return isPipRelated();
    }
}
