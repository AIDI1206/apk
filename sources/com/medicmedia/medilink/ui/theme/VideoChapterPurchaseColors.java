package com.medicmedia.medilink.ui.theme;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/medicmedia/medilink/ui/theme/VideoChapterPurchaseColors;", "", "bgColor", "Landroidx/compose/ui/graphics/Color;", "textColor", "<init>", "(Ljava/lang/String;IJJ)V", "getBgColor-0d7_KjU", "()J", "J", "getTextColor-0d7_KjU", "NOT_PURCHASE", "LIMIT_DATE", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum VideoChapterPurchaseColors {
    NOT_PURCHASE(androidx.compose.ui.graphics.ColorKt.Color(4294632428L), androidx.compose.ui.graphics.ColorKt.Color(4291728344L)),
    LIMIT_DATE(ColorKt.getWhite(), androidx.compose.ui.graphics.ColorKt.Color(4294915584L));

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final long bgColor;
    private final long textColor;

    public static EnumEntries<VideoChapterPurchaseColors> getEntries() {
        return $ENTRIES;
    }

    VideoChapterPurchaseColors(long j, long j2) {
        this.bgColor = j;
        this.textColor = j2;
    }

    /* JADX INFO: renamed from: getBgColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }
}
