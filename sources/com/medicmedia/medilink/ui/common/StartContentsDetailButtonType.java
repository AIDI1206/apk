package com.medicmedia.medilink.ui.common;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: StartContentsDetailBottomSheet.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/common/StartContentsDetailButtonType;", "", "titleId", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "<init>", "(Ljava/lang/String;IIJJ)V", "getTitleId", "()I", "getContainerColor-0d7_KjU", "()J", "J", "getContentColor-0d7_KjU", "CANCEL", "START", "CONTINUE", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum StartContentsDetailButtonType {
    CANCEL(R.string.dialog_download_comp_cancel, ColorKt.getSectionBgColor(), ColorKt.getBlack()),
    START(R.string.dialog_download_comp_read, 0, 0, 6, null),
    CONTINUE(R.string.dialog_resume_read, 0, 0, 6, null);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final long containerColor;
    private final long contentColor;
    private final int titleId;

    public static EnumEntries<StartContentsDetailButtonType> getEntries() {
        return $ENTRIES;
    }

    StartContentsDetailButtonType(int i, long j, long j2) {
        this.titleId = i;
        this.containerColor = j;
        this.contentColor = j2;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    /* synthetic */ StartContentsDetailButtonType(int i, long j, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? ColorKt.getPrimary() : j, (i2 & 4) != 0 ? ColorKt.getWhite() : j2);
    }

    /* JADX INFO: renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: getContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColor() {
        return this.contentColor;
    }
}
