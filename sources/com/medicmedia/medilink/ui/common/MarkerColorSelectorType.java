package com.medicmedia.medilink.ui.common;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.theme.ColorKt;
import com.medicmedia.medilink.ui.theme.MarkerColor;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'RED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: MarkerColorSelectorBar.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001#BU\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u00020\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b \u0010\"j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006$"}, d2 = {"Lcom/medicmedia/medilink/ui/common/MarkerColorSelectorType;", "", "value", "", "urlIndex", "", "color", "Landroidx/compose/ui/graphics/Color;", "documentPath", "borderColor", "iconResourceId", "Lkotlin/Pair;", "<init>", "(Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;Landroidx/compose/ui/graphics/Color;Lkotlin/Pair;)V", "getValue", "()Ljava/lang/String;", "getUrlIndex", "()I", "getColor-0d7_KjU", "()J", "J", "getDocumentPath", "getBorderColor-QN2ZGVo", "()Landroidx/compose/ui/graphics/Color;", "getIconResourceId", "()Lkotlin/Pair;", "RED", "YELLOW", "GREEN", "BLUE", "ERASER", "DELETE_ALL", "isTypeDelete", "", "()Z", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class MarkerColorSelectorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MarkerColorSelectorType[] $VALUES;
    public static final MarkerColorSelectorType BLUE;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MarkerColorSelectorType DELETE_ALL;
    public static final MarkerColorSelectorType ERASER;
    public static final MarkerColorSelectorType GREEN;
    public static final MarkerColorSelectorType RED;
    public static final MarkerColorSelectorType YELLOW;
    private final Color borderColor;
    private final long color;
    private final String documentPath;
    private final Pair<Integer, Integer> iconResourceId;
    private final int urlIndex;
    private final String value;

    private static final /* synthetic */ MarkerColorSelectorType[] $values() {
        return new MarkerColorSelectorType[]{RED, YELLOW, GREEN, BLUE, ERASER, DELETE_ALL};
    }

    public static EnumEntries<MarkerColorSelectorType> getEntries() {
        return $ENTRIES;
    }

    private MarkerColorSelectorType(String str, int i, String str2, int i2, long j, String str3, Color color, Pair pair) {
        super(str, i);
        this.value = str2;
        this.urlIndex = i2;
        this.color = j;
        this.documentPath = str3;
        this.borderColor = color;
        this.iconResourceId = pair;
    }

    /* synthetic */ MarkerColorSelectorType(String str, int i, String str2, int i2, long j, String str3, Color color, Pair pair, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 1) != 0 ? "" : str2, (i3 & 2) != 0 ? -1 : i2, j, (i3 & 8) != 0 ? null : str3, (i3 & 16) != 0 ? null : color, (i3 & 32) != 0 ? null : pair);
    }

    public final String getValue() {
        return this.value;
    }

    public final int getUrlIndex() {
        return this.urlIndex;
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getColor() {
        return this.color;
    }

    public final String getDocumentPath() {
        return this.documentPath;
    }

    /* JADX INFO: renamed from: getBorderColor-QN2ZGVo, reason: not valid java name and from getter */
    public final Color getBorderColor() {
        return this.borderColor;
    }

    public final Pair<Integer, Integer> getIconResourceId() {
        return this.iconResourceId;
    }

    static {
        int i = 48;
        DefaultConstructorMarker defaultConstructorMarker = null;
        Pair pair = null;
        RED = new MarkerColorSelectorType("RED", 0, "ff0000", 3, MarkerColor.INSTANCE.m11016getRed0d7_KjU(), "marker_red", null, pair, i, defaultConstructorMarker);
        YELLOW = new MarkerColorSelectorType("YELLOW", 1, "ffff00", 1, MarkerColor.INSTANCE.m11017getYellow0d7_KjU(), "marker_yellow", 0 == true ? 1 : 0, pair, i, defaultConstructorMarker);
        GREEN = new MarkerColorSelectorType("GREEN", 2, "7fff00", 2, MarkerColor.INSTANCE.m11015getGreen0d7_KjU(), "marker_green", 0 == true ? 1 : 0, pair, i, defaultConstructorMarker);
        BLUE = new MarkerColorSelectorType("BLUE", 3, "00bfff", 4, MarkerColor.INSTANCE.m11013getBlue0d7_KjU(), "marker_blue", 0 == true ? 1 : 0, pair, i, defaultConstructorMarker);
        long white = ColorKt.getWhite();
        long jM11014getEraser0d7_KjU = MarkerColor.INSTANCE.m11014getEraser0d7_KjU();
        Pair pair2 = new Pair(Integer.valueOf(R.drawable.ic_icon_eraser), Integer.valueOf(R.string.marker_button_eraser));
        ERASER = new MarkerColorSelectorType("ERASER", 4, "ffffff", 0, white, 0 == true ? 1 : 0, Color.m5949boximpl(jM11014getEraser0d7_KjU), pair2, 8, null);
        DELETE_ALL = new MarkerColorSelectorType("DELETE_ALL", 5, null, 0, ColorKt.getWhite(), null, Color.m5949boximpl(MarkerColor.INSTANCE.m11014getEraser0d7_KjU()), new Pair(Integer.valueOf(R.drawable.ic_baseline_delete_24px_black), Integer.valueOf(R.string.marker_button_delete_all)), 11, null);
        MarkerColorSelectorType[] markerColorSelectorTypeArr$values = $values();
        $VALUES = markerColorSelectorTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(markerColorSelectorTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* JADX INFO: compiled from: MarkerColorSelectorBar.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/ui/common/MarkerColorSelectorType$Companion;", "", "<init>", "()V", "find", "Lcom/medicmedia/medilink/ui/common/MarkerColorSelectorType;", "value", "", "urlIndex", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MarkerColorSelectorType find(String value) {
            MarkerColorSelectorType next;
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator<MarkerColorSelectorType> it = MarkerColorSelectorType.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                MarkerColorSelectorType markerColorSelectorType = next;
                if (markerColorSelectorType.getValue().length() > 0 && Intrinsics.areEqual(markerColorSelectorType.getValue(), value)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public final MarkerColorSelectorType find(int urlIndex) {
            MarkerColorSelectorType next;
            Iterator<MarkerColorSelectorType> it = MarkerColorSelectorType.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                MarkerColorSelectorType markerColorSelectorType = next;
                if (markerColorSelectorType.getUrlIndex() != -1 && markerColorSelectorType.getUrlIndex() == urlIndex) {
                    return next;
                }
            }
            next = null;
            return next;
        }
    }

    public final boolean isTypeDelete() {
        return this == ERASER;
    }

    public static MarkerColorSelectorType valueOf(String str) {
        return (MarkerColorSelectorType) Enum.valueOf(MarkerColorSelectorType.class, str);
    }

    public static MarkerColorSelectorType[] values() {
        return (MarkerColorSelectorType[]) $VALUES.clone();
    }
}
