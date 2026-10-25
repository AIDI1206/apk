package com.medicmedia.medilink.ui.online;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.common.BottomBarTabType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: OnlineContentsTabType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB'\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/ui/online/OnlineContentsTabType;", "Lcom/medicmedia/medilink/ui/common/BottomBarTabType;", "", "value", "", "iconId", "labelId", "<init>", "(Ljava/lang/String;IIII)V", "getValue", "()I", "getIconId", "getLabelId", "GO_BACK", "REFERENCE_VALUE", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum OnlineContentsTabType implements BottomBarTabType {
    GO_BACK(0, R.drawable.ic_go_back_library_24px, R.string.online_contents_tab_go_back),
    REFERENCE_VALUE(1, R.drawable.ic_reference_value, R.string.online_contents_tab_reference_value);

    private final int iconId;
    private final int labelId;
    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<OnlineContentsTabType> getEntries() {
        return $ENTRIES;
    }

    OnlineContentsTabType(int i, int i2, int i3) {
        this.value = i;
        this.iconId = i2;
        this.labelId = i3;
    }

    /* synthetic */ OnlineContentsTabType(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
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

    /* JADX INFO: compiled from: OnlineContentsTabType.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/ui/online/OnlineContentsTabType$Companion;", "", "<init>", "()V", "values", "", "Lcom/medicmedia/medilink/ui/online/OnlineContentsTabType;", "isHiddenReference", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<OnlineContentsTabType> values(boolean isHiddenReference) {
            return isHiddenReference ? CollectionsKt.listOf(OnlineContentsTabType.GO_BACK) : OnlineContentsTabType.getEntries();
        }
    }
}
