package com.medicmedia.medilink.ui.extension;

import android.graphics.drawable.Drawable;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ButtonExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"setImageDrawableColor", "", "Landroid/widget/ImageButton;", "tintColor", "", "ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ButtonExtensionKt {
    public static final void setImageDrawableColor(ImageButton imageButton, int i) {
        Intrinsics.checkNotNullParameter(imageButton, "<this>");
        Drawable drawableMutate = imageButton.getDrawable().mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
        drawableMutate.setTint(i);
        imageButton.setImageDrawable(drawableMutate);
    }
}
