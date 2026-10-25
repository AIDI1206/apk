package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: VideoChapterListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007j\u0002\b\u0004j\u0002\b\u0005¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/ui/video/ProgressType;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING", "REFRESH", "isLoading", "", "isRefresh", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum ProgressType {
    LOADING,
    REFRESH;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    public static EnumEntries<ProgressType> getEntries() {
        return $ENTRIES;
    }

    public final boolean isLoading() {
        return this == LOADING;
    }

    public final boolean isRefresh() {
        return this == REFRESH;
    }
}
