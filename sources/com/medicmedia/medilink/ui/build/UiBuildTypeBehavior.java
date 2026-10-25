package com.medicmedia.medilink.ui.build;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.BookShelfSort;
import com.medicmedia.medilink.ui.bookshelf.BookList;
import com.medicmedia.medilink.ui.common.OptionDropdownMenuType;
import kotlin.Metadata;

/* JADX INFO: compiled from: UiBuildTypeBehavior.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/medicmedia/medilink/ui/build/UiBuildTypeBehavior;", "", "optionMenuType", "Lcom/medicmedia/medilink/ui/common/OptionDropdownMenuType;", "index", "", "baseOptionMenuType", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface UiBuildTypeBehavior {
    OptionDropdownMenuType baseOptionMenuType();

    OptionDropdownMenuType optionMenuType(int index);

    /* JADX INFO: compiled from: UiBuildTypeBehavior.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static OptionDropdownMenuType optionMenuType(UiBuildTypeBehavior uiBuildTypeBehavior, int i) {
            return i == BookShelfSort.User.INSTANCE.getValue() ? BookList.OptionMenuType.USER : uiBuildTypeBehavior.baseOptionMenuType();
        }

        public static OptionDropdownMenuType baseOptionMenuType(UiBuildTypeBehavior uiBuildTypeBehavior) {
            return BookList.OptionMenuType.CATEGORY;
        }
    }
}
