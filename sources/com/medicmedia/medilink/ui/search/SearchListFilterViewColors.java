package com.medicmedia.medilink.ui.search;

import androidx.compose.ui.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.medicmedia.medilink.ui.common.ContentsFilterViewColors;
import com.medicmedia.medilink.ui.theme.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\rJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\rJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\rJ\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\rJV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H×\u0003J\t\u0010*\u001a\u00020+H×\u0001J\t\u0010,\u001a\u00020-H×\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0014\u0010\r¨\u0006/"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListFilterViewColors;", "Lcom/medicmedia/medilink/ui/common/ContentsFilterViewColors;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "containerColor", "selectedContainerColor", "labelColor", "selectedLabelColor", "borderColor", "selectedBorderColor", "<init>", "(JJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackgroundColor-0d7_KjU", "()J", "J", "getContainerColor-0d7_KjU", "getSelectedContainerColor-0d7_KjU", "getLabelColor-0d7_KjU", "getSelectedLabelColor-0d7_KjU", "getBorderColor-0d7_KjU", "getSelectedBorderColor-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "component6", "component6-0d7_KjU", "component7", "component7-0d7_KjU", "copy", "copy-4JmcsL4", "(JJJJJJJ)Lcom/medicmedia/medilink/ui/search/SearchListFilterViewColors;", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SearchListFilterViewColors implements ContentsFilterViewColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long backgroundColor;
    private final long borderColor;
    private final long containerColor;
    private final long labelColor;
    private final long selectedBorderColor;
    private final long selectedContainerColor;
    private final long selectedLabelColor;

    public /* synthetic */ SearchListFilterViewColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* JADX INFO: renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedContainerColor() {
        return this.selectedContainerColor;
    }

    /* JADX INFO: renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getLabelColor() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedLabelColor() {
        return this.selectedLabelColor;
    }

    /* JADX INFO: renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorderColor() {
        return this.borderColor;
    }

    /* JADX INFO: renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedBorderColor() {
        return this.selectedBorderColor;
    }

    /* JADX INFO: renamed from: copy-4JmcsL4, reason: not valid java name */
    public final SearchListFilterViewColors m10939copy4JmcsL4(long backgroundColor, long containerColor, long selectedContainerColor, long labelColor, long selectedLabelColor, long borderColor, long selectedBorderColor) {
        return new SearchListFilterViewColors(backgroundColor, containerColor, selectedContainerColor, labelColor, selectedLabelColor, borderColor, selectedBorderColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchListFilterViewColors)) {
            return false;
        }
        SearchListFilterViewColors searchListFilterViewColors = (SearchListFilterViewColors) other;
        return Color.m5960equalsimpl0(this.backgroundColor, searchListFilterViewColors.backgroundColor) && Color.m5960equalsimpl0(this.containerColor, searchListFilterViewColors.containerColor) && Color.m5960equalsimpl0(this.selectedContainerColor, searchListFilterViewColors.selectedContainerColor) && Color.m5960equalsimpl0(this.labelColor, searchListFilterViewColors.labelColor) && Color.m5960equalsimpl0(this.selectedLabelColor, searchListFilterViewColors.selectedLabelColor) && Color.m5960equalsimpl0(this.borderColor, searchListFilterViewColors.borderColor) && Color.m5960equalsimpl0(this.selectedBorderColor, searchListFilterViewColors.selectedBorderColor);
    }

    public int hashCode() {
        return (((((((((((Color.m5966hashCodeimpl(this.backgroundColor) * 31) + Color.m5966hashCodeimpl(this.containerColor)) * 31) + Color.m5966hashCodeimpl(this.selectedContainerColor)) * 31) + Color.m5966hashCodeimpl(this.labelColor)) * 31) + Color.m5966hashCodeimpl(this.selectedLabelColor)) * 31) + Color.m5966hashCodeimpl(this.borderColor)) * 31) + Color.m5966hashCodeimpl(this.selectedBorderColor);
    }

    public String toString() {
        return "SearchListFilterViewColors(backgroundColor=" + Color.m5967toStringimpl(this.backgroundColor) + ", containerColor=" + Color.m5967toStringimpl(this.containerColor) + ", selectedContainerColor=" + Color.m5967toStringimpl(this.selectedContainerColor) + ", labelColor=" + Color.m5967toStringimpl(this.labelColor) + ", selectedLabelColor=" + Color.m5967toStringimpl(this.selectedLabelColor) + ", borderColor=" + Color.m5967toStringimpl(this.borderColor) + ", selectedBorderColor=" + Color.m5967toStringimpl(this.selectedBorderColor) + ")";
    }

    private SearchListFilterViewColors(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.backgroundColor = j;
        this.containerColor = j2;
        this.selectedContainerColor = j3;
        this.labelColor = j4;
        this.selectedLabelColor = j5;
        this.borderColor = j6;
        this.selectedBorderColor = j7;
    }

    @Override // com.medicmedia.medilink.ui.common.ContentsFilterViewColors
    /* JADX INFO: renamed from: getBackgroundColor-0d7_KjU */
    public long mo10636getBackgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    @Override // com.medicmedia.medilink.ui.common.ContentsFilterViewColors
    /* JADX INFO: renamed from: getContainerColor-0d7_KjU */
    public long mo10638getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    @Override // com.medicmedia.medilink.ui.common.ContentsFilterViewColors
    /* JADX INFO: renamed from: getSelectedContainerColor-0d7_KjU */
    public long mo10641getSelectedContainerColor0d7_KjU() {
        return this.selectedContainerColor;
    }

    @Override // com.medicmedia.medilink.ui.common.ContentsFilterViewColors
    /* JADX INFO: renamed from: getLabelColor-0d7_KjU */
    public long mo10639getLabelColor0d7_KjU() {
        return this.labelColor;
    }

    @Override // com.medicmedia.medilink.ui.common.ContentsFilterViewColors
    /* JADX INFO: renamed from: getSelectedLabelColor-0d7_KjU */
    public long mo10642getSelectedLabelColor0d7_KjU() {
        return this.selectedLabelColor;
    }

    @Override // com.medicmedia.medilink.ui.common.ContentsFilterViewColors
    /* JADX INFO: renamed from: getBorderColor-0d7_KjU */
    public long mo10637getBorderColor0d7_KjU() {
        return this.borderColor;
    }

    @Override // com.medicmedia.medilink.ui.common.ContentsFilterViewColors
    /* JADX INFO: renamed from: getSelectedBorderColor-0d7_KjU */
    public long mo10640getSelectedBorderColor0d7_KjU() {
        return this.selectedBorderColor;
    }

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListFilterViewColors$Companion;", "", "<init>", "()V", "colors", "Lcom/medicmedia/medilink/ui/search/SearchListFilterViewColors;", "listType", "Lcom/medicmedia/medilink/ui/search/SearchListParentType;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SearchListFilterViewColors colors(SearchListParentType listType) {
            Intrinsics.checkNotNullParameter(listType, "listType");
            if (listType instanceof SearchListParentType.MainTab) {
                return new SearchListFilterViewColors(ColorKt.getPrimary(), ColorKt.getMaskingPrimary(), ColorKt.getPrimary(), ColorKt.getMaskingWhite(), ColorKt.getWhite(), ColorKt.getMaskingWhite(), ColorKt.getWhite(), null);
            }
            return new SearchListFilterViewColors(ColorKt.getAppBarBg(), ColorKt.getMaskingAppBarBg(), ColorKt.getAppBarBg(), Color.INSTANCE.m5989getGray0d7_KjU(), Color.INSTANCE.m5989getGray0d7_KjU(), Color.INSTANCE.m5989getGray0d7_KjU(), Color.INSTANCE.m5989getGray0d7_KjU(), null);
        }
    }
}
