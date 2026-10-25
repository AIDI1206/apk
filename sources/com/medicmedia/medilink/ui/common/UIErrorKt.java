package com.medicmedia.medilink.ui.common;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UIError.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"message", "", "Lcom/medicmedia/medilink/ui/common/UIError;", "context", "Landroid/content/Context;", "ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UIErrorKt {
    public static final String message(UIError uIError, Context context) {
        String string;
        Intrinsics.checkNotNullParameter(uIError, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String args = uIError.getArgs();
        if (args != null && (string = context.getString(uIError.getResourceId(), args)) != null) {
            return string;
        }
        String string2 = context.getString(uIError.getResourceId());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }
}
