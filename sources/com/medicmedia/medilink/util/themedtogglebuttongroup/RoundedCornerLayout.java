package com.medicmedia.medilink.util.themedtogglebuttongroup;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RoundedCornerLayout.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/util/themedtogglebuttongroup/RoundedCornerLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "paint", "Landroid/graphics/Paint;", "cornerRadius", "", "getCornerRadius", "()F", "setCornerRadius", "(F)V", "borderWidth", "getBorderWidth", "setBorderWidth", "borderColor", "", "getBorderColor", "()I", "setBorderColor", "(I)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class RoundedCornerLayout extends FrameLayout {
    public static final int $stable = 8;
    private int borderColor;
    private float borderWidth;
    private float cornerRadius;
    private Paint paint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedCornerLayout(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint(5);
        this.borderColor = ColorUtilsKt.getDarkGray();
    }

    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    public final void setCornerRadius(float f) {
        this.cornerRadius = f;
    }

    public final float getBorderWidth() {
        return this.borderWidth;
    }

    public final void setBorderWidth(float f) {
        this.borderWidth = f;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final void setBorderColor(int i) {
        this.borderColor = i;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f = this.borderWidth / 2;
        int iSave = canvas.save();
        Path path = new Path();
        if (this.borderWidth > 0.0f) {
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setColor(this.borderColor);
            this.paint.setStrokeWidth(this.borderWidth);
        } else {
            Paint paint = this.paint;
            Drawable background = getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            paint.setColor(((ColorDrawable) background).getColor());
        }
        RectF rectF = new RectF(f, f, getWidth() - f, getHeight() - f);
        float f2 = this.cornerRadius;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        canvas.drawPath(path, this.paint);
        canvas.clipPath(path);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
