package com.medicmedia.medilink.ui.offline;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.common.BottomBarTabType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.medicmedia.medilink.ui.offline.OfflineContentsTabType, still in use, count: 1, list:
  (r0v0 com.medicmedia.medilink.ui.offline.OfflineContentsTabType) from 0x0061: FILLED_NEW_ARRAY 
  (r0v0 com.medicmedia.medilink.ui.offline.OfflineContentsTabType)
  (r2v2 com.medicmedia.medilink.ui.offline.OfflineContentsTabType)
  (r4v4 com.medicmedia.medilink.ui.offline.OfflineContentsTabType)
 A[WRAPPED] (LINE:65) elemType: com.medicmedia.medilink.ui.offline.OfflineContentsTabType
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: OfflineContentsItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B'\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/ui/offline/OfflineContentsTabType;", "Lcom/medicmedia/medilink/ui/common/BottomBarTabType;", "", "value", "", "iconId", "labelId", "<init>", "(Ljava/lang/String;IIII)V", "getValue", "()I", "getIconId", "getLabelId", "GO_BACK", "TOC", "HISTORY", "MARKER", "SEARCH", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class OfflineContentsTabType implements BottomBarTabType {
    GO_BACK(0, R.drawable.ic_go_back_library_24px, R.string.offline_contents_tab_go_back),
    TOC(1, R.drawable.ic_toc_24px, R.string.offline_contents_tab_toc),
    HISTORY(2, R.drawable.ic_history_list_24px, R.string.offline_contents_tab_history),
    MARKER(3, R.drawable.ic_marker_bk_20, R.string.offline_contents_tab_marker),
    SEARCH(4, R.drawable.ic_search_24px, R.string.offline_contents_tab_search);

    private final int iconId;
    private final int labelId;
    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final List<OfflineContentsTabType> tocEntries = CollectionsKt.listOf((Object[]) new OfflineContentsTabType[]{new OfflineContentsTabType(0, R.drawable.ic_go_back_library_24px, R.string.offline_contents_tab_go_back), new OfflineContentsTabType(2, R.drawable.ic_history_list_24px, R.string.offline_contents_tab_history), new OfflineContentsTabType(4, R.drawable.ic_search_24px, R.string.offline_contents_tab_search)});

    public static EnumEntries<OfflineContentsTabType> getEntries() {
        return $ENTRIES;
    }

    private OfflineContentsTabType(int i, int i2, int i3) {
        super(str, i);
        this.value = i;
        this.iconId = i2;
        this.labelId = i3;
    }

    /* synthetic */ OfflineContentsTabType(String str, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? 0 : i4);
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

    static {
    }

    /* JADX INFO: compiled from: OfflineContentsItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/ui/offline/OfflineContentsTabType$Companion;", "", "<init>", "()V", "tocEntries", "", "Lcom/medicmedia/medilink/ui/offline/OfflineContentsTabType;", "getTocEntries", "()Ljava/util/List;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<OfflineContentsTabType> getTocEntries() {
            return OfflineContentsTabType.tocEntries;
        }
    }

    public static OfflineContentsTabType valueOf(String str) {
        return (OfflineContentsTabType) Enum.valueOf(OfflineContentsTabType.class, str);
    }

    public static OfflineContentsTabType[] values() {
        return (OfflineContentsTabType[]) $VALUES.clone();
    }
}
