package com.tapadoo.alerter.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.core.content.ContextCompat;
import com.tapadoo.alerter.Alert;
import com.tapadoo.alerter.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExAlert.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0006\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"getDimenPixelSize", "", "Lcom/tapadoo/alerter/Alert;", "id", "getRippleDrawable", "Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "notchHeight", "alerter_release"}, k = 2, mv = {1, 4, 1})
public final class ExAlertKt {
    public static final int getDimenPixelSize(Alert getDimenPixelSize, int i) {
        Intrinsics.checkNotNullParameter(getDimenPixelSize, "$this$getDimenPixelSize");
        return getDimenPixelSize.getResources().getDimensionPixelSize(i);
    }

    public static final int notchHeight(Alert notchHeight) {
        DisplayCutout displayCutout;
        Intrinsics.checkNotNullParameter(notchHeight, "$this$notchHeight");
        WindowInsets rootWindowInsets = notchHeight.getRootWindowInsets();
        if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            return 0;
        }
        return displayCutout.getSafeInsetTop();
    }

    public static final Drawable getRippleDrawable(Context getRippleDrawable) {
        Intrinsics.checkNotNullParameter(getRippleDrawable, "$this$getRippleDrawable");
        TypedValue typedValue = new TypedValue();
        getRippleDrawable.getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        return ContextCompat.getDrawable(getRippleDrawable, typedValue.resourceId);
    }
}
