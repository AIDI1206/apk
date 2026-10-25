package com.medicmedia.medilink.ui.offline;

import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OfflineContentsItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/offline/TocThirdLabelType;", "", "value", "", FirebaseAnalytics.Param.LEVEL, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getValue", "()Ljava/lang/String;", "getLevel", "()I", "DAI", "CHU0", "CHU2", "SHO", "titlePaddingStart", "Landroidx/compose/ui/unit/Dp;", "getTitlePaddingStart-D9Ej5fM", "()F", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum TocThirdLabelType {
    DAI("daimenu", 1002),
    CHU0("chu0menu", 1003),
    CHU2("chu2menu", 1004),
    SHO("shomenu", 1005);

    private final int level;
    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: OfflineContentsItem.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TocThirdLabelType.values().length];
            try {
                iArr[TocThirdLabelType.DAI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TocThirdLabelType.CHU0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TocThirdLabelType.CHU2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TocThirdLabelType.SHO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static EnumEntries<TocThirdLabelType> getEntries() {
        return $ENTRIES;
    }

    TocThirdLabelType(String str, int i) {
        this.value = str;
        this.level = i;
    }

    public final String getValue() {
        return this.value;
    }

    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: compiled from: OfflineContentsItem.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/ui/offline/TocThirdLabelType$Companion;", "", "<init>", "()V", "find", "Lcom/medicmedia/medilink/ui/offline/TocThirdLabelType;", "contentsClass", "", FirebaseAnalytics.Param.LEVEL, "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TocThirdLabelType find(String contentsClass) {
            TocThirdLabelType next;
            Iterator<TocThirdLabelType> it = TocThirdLabelType.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.getValue(), contentsClass)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public final TocThirdLabelType find(int level) {
            TocThirdLabelType next;
            Iterator<TocThirdLabelType> it = TocThirdLabelType.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.getLevel() == level) {
                    return next;
                }
            }
            next = null;
            return next;
        }
    }

    /* JADX INFO: renamed from: getTitlePaddingStart-D9Ej5fM, reason: not valid java name */
    public final float m10895getTitlePaddingStartD9Ej5fM() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            return Dp.m8703constructorimpl(6);
        }
        if (i == 3) {
            return Dp.m8703constructorimpl(22);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return Dp.m8703constructorimpl(38);
    }
}
