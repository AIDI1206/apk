package com.medicmedia.medilink.ui.video;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.common.BottomBarTabType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: VideoListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B'\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/video/VideoListTabType;", "Lcom/medicmedia/medilink/ui/common/BottomBarTabType;", "", "value", "", "iconId", "labelId", "<init>", "(Ljava/lang/String;IIII)V", "getValue", "()I", "getIconId", "getLabelId", "GO_BACK", "DOWNLOAD", "HISTORY", "SEARCH", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum VideoListTabType implements BottomBarTabType {
    GO_BACK(0, R.drawable.ic_go_back_library_24px, R.string.video_list_tab_go_back),
    DOWNLOAD(1, R.drawable.ic_round_save_alt_24px, R.string.video_list_tab_download),
    HISTORY(2, R.drawable.ic_history_list_24px, R.string.video_list_tab_history),
    SEARCH(3, R.drawable.ic_search_24px, R.string.video_list_tab_search);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int iconId;
    private final int labelId;
    private final int value;

    public static EnumEntries<VideoListTabType> getEntries() {
        return $ENTRIES;
    }

    VideoListTabType(int i, int i2, int i3) {
        this.value = i;
        this.iconId = i2;
        this.labelId = i3;
    }

    /* synthetic */ VideoListTabType(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
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
}
