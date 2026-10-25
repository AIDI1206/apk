package com.medicmedia.medilink.ui.build;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.ui.common.OptionDropdownMenuType;
import kotlin.Metadata;

/* JADX INFO: compiled from: UiBuildTypeBehaviorImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/medicmedia/medilink/ui/build/UiBuildTypeBehaviorImpl;", "Lcom/medicmedia/medilink/ui/build/UiBuildTypeBehavior;", "<init>", "()V", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UiBuildTypeBehaviorImpl implements UiBuildTypeBehavior {
    public static final int $stable = 0;

    @Override // com.medicmedia.medilink.ui.build.UiBuildTypeBehavior
    public OptionDropdownMenuType baseOptionMenuType() {
        return UiBuildTypeBehavior.DefaultImpls.baseOptionMenuType(this);
    }

    @Override // com.medicmedia.medilink.ui.build.UiBuildTypeBehavior
    public OptionDropdownMenuType optionMenuType(int i) {
        return UiBuildTypeBehavior.DefaultImpls.optionMenuType(this, i);
    }
}
