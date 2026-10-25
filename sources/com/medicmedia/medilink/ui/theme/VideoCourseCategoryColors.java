package com.medicmedia.medilink.ui.theme;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Color.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/theme/VideoCourseCategoryColors;", "", "typeId", "", "bgColor", "Landroidx/compose/ui/graphics/Color;", "textColor", "<init>", "(Ljava/lang/String;IIJJ)V", "getTypeId", "()I", "getBgColor-0d7_KjU", "()J", "J", "getTextColor-0d7_KjU", "INDEX", "ALL", "IMAGE", "EIYOU", "YAKUGAKU", "PTOT", "HUKUSHI", "RINSHOU", "HOKEN", "SHAHUKU", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum VideoCourseCategoryColors {
    INDEX(0, androidx.compose.ui.graphics.ColorKt.Color(4293131002L), androidx.compose.ui.graphics.ColorKt.Color(4278356104L)),
    ALL(1, androidx.compose.ui.graphics.ColorKt.Color(4292927735L), androidx.compose.ui.graphics.ColorKt.Color(4278453413L)),
    IMAGE(2, androidx.compose.ui.graphics.ColorKt.Color(4294632428L), androidx.compose.ui.graphics.ColorKt.Color(4287103553L)),
    EIYOU(3, androidx.compose.ui.graphics.ColorKt.Color(4294956228L), androidx.compose.ui.graphics.ColorKt.Color(4292241728L)),
    YAKUGAKU(4, androidx.compose.ui.graphics.ColorKt.Color(4291226856L), androidx.compose.ui.graphics.ColorKt.Color(4278234014L)),
    PTOT(5, androidx.compose.ui.graphics.ColorKt.Color(4294631423L), androidx.compose.ui.graphics.ColorKt.Color(4289224117L)),
    HUKUSHI(6, androidx.compose.ui.graphics.ColorKt.Color(4294962900L), androidx.compose.ui.graphics.ColorKt.Color(4285749552L)),
    RINSHOU(7, androidx.compose.ui.graphics.ColorKt.Color(4290887119L), androidx.compose.ui.graphics.ColorKt.Color(4283120774L)),
    HOKEN(8, androidx.compose.ui.graphics.ColorKt.Color(4292607231L), androidx.compose.ui.graphics.ColorKt.Color(4278290066L)),
    SHAHUKU(9, androidx.compose.ui.graphics.ColorKt.Color(4294958810L), androidx.compose.ui.graphics.ColorKt.Color(4288567889L));

    private final long bgColor;
    private final long textColor;
    private final int typeId;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<VideoCourseCategoryColors> getEntries() {
        return $ENTRIES;
    }

    VideoCourseCategoryColors(int i, long j, long j2) {
        this.typeId = i;
        this.bgColor = j;
        this.textColor = j2;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    /* JADX INFO: renamed from: getBgColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getBgColor() {
        return this.bgColor;
    }

    /* JADX INFO: renamed from: getTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: compiled from: Color.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/theme/VideoCourseCategoryColors$Companion;", "", "<init>", "()V", "find", "Lcom/medicmedia/medilink/ui/theme/VideoCourseCategoryColors;", "typeId", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final VideoCourseCategoryColors find(int typeId) {
            VideoCourseCategoryColors next;
            Iterator<VideoCourseCategoryColors> it = VideoCourseCategoryColors.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.getTypeId() == typeId) {
                    return next;
                }
            }
            next = null;
            return next;
        }
    }
}
