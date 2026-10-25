package com.medicmedia.medilink.ui.reference;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.ReferenceCategoryType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsReferenceListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/medicmedia/medilink/ui/reference/ReferenceListIndentedType;", "", "titlePadding", "", "borderPadding", "<init>", "(Ljava/lang/String;III)V", "getTitlePadding", "()I", "getBorderPadding", "ROW1", "ROW2", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum ReferenceListIndentedType {
    ROW1(26, 0),
    ROW2(42, 46);

    private final int borderPadding;
    private final int titlePadding;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<ReferenceListIndentedType> getEntries() {
        return $ENTRIES;
    }

    ReferenceListIndentedType(int i, int i2) {
        this.titlePadding = i;
        this.borderPadding = i2;
    }

    public final int getTitlePadding() {
        return this.titlePadding;
    }

    public final int getBorderPadding() {
        return this.borderPadding;
    }

    /* JADX INFO: compiled from: ContentsReferenceListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/reference/ReferenceListIndentedType$Companion;", "", "<init>", "()V", "find", "Lcom/medicmedia/medilink/ui/reference/ReferenceListIndentedType;", "categoryType", "Lcom/medicmedia/medilink/domain/model/ReferenceCategoryType;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {

        /* JADX INFO: compiled from: ContentsReferenceListViewModel.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReferenceCategoryType.values().length];
                try {
                    iArr[ReferenceCategoryType.ROW1.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReferenceCategoryType.ROW2.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ReferenceListIndentedType find(ReferenceCategoryType categoryType) {
            Intrinsics.checkNotNullParameter(categoryType, "categoryType");
            int i = WhenMappings.$EnumSwitchMapping$0[categoryType.ordinal()];
            if (i == 1) {
                return ReferenceListIndentedType.ROW1;
            }
            if (i != 2) {
                return null;
            }
            return ReferenceListIndentedType.ROW2;
        }
    }
}
