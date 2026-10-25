package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.datastore.model.BookShelfSortType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BookShelfSort.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"convertTo", "Lcom/medicmedia/medilink/domain/model/BookShelfSort;", "Lcom/medicmedia/medilink/datastore/model/BookShelfSortType;", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BookShelfSortKt {

    /* JADX INFO: compiled from: BookShelfSort.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookShelfSortType.values().length];
            try {
                iArr[BookShelfSortType.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookShelfSortType.CATEGORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BookShelfSort convertTo(BookShelfSortType bookShelfSortType) {
        Intrinsics.checkNotNullParameter(bookShelfSortType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[bookShelfSortType.ordinal()];
        if (i == 1) {
            return BookShelfSort.User.INSTANCE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return BookShelfSort.Category.INSTANCE;
    }
}
