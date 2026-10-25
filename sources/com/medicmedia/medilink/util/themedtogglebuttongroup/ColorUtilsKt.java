package com.medicmedia.medilink.util.themedtogglebuttongroup;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ColorUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\rH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003¨\u0006\u0010"}, d2 = {"lightGray", "", "getLightGray", "()I", "darkGray", "getDarkGray", "denim", "getDenim", "setTintColor", "", "Landroid/widget/ImageView;", "color", "blendMode", "Landroid/graphics/PorterDuff$Mode;", "Landroid/content/Context;", "id", "app_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ColorUtilsKt {
    private static final int lightGray = Color.parseColor("#ebebeb");
    private static final int darkGray = Color.parseColor("#5e5e5e");
    private static final int denim = Color.parseColor("#5e6fed");

    public static final int getLightGray() {
        return lightGray;
    }

    public static final int getDarkGray() {
        return darkGray;
    }

    public static final int getDenim() {
        return denim;
    }

    public static /* synthetic */ void setTintColor$default(ImageView imageView, int i, PorterDuff.Mode mode, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        setTintColor(imageView, i, mode);
    }

    public static final void setTintColor(ImageView imageView, int i, PorterDuff.Mode blendMode) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(blendMode, "blendMode");
        imageView.setColorFilter(i, blendMode);
    }

    public static final int color(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return ContextCompat.getColor(context, i);
    }
}
