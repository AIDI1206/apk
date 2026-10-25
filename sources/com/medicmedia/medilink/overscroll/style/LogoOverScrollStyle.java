package com.medicmedia.medilink.overscroll.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.medicmedia.medilink.overscroll.OverScrollDelegate;

/* JADX INFO: loaded from: classes6.dex */
public class LogoOverScrollStyle extends OverScrollDelegate.OverScrollStyle {
    private final Rect bounds;
    private final Drawable logo;
    private final int logoHeight;
    private final int logoMarginBottom;
    private final int logoWidth;
    private final Paint paint;

    public LogoOverScrollStyle(Drawable drawable) {
        this(drawable, 32, 32, 24, -1381648);
    }

    public LogoOverScrollStyle(Drawable drawable, int i, int i2, int i3, int i4) {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.bounds = new Rect();
        this.logo = drawable;
        this.logoWidth = dp2px(i);
        this.logoHeight = dp2px(i2);
        this.logoMarginBottom = dp2px(i3);
        paint.setColor(i4);
        if (drawable == null) {
            throw new IllegalArgumentException("The logo should NOT be NULL.");
        }
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollStyle
    public void drawOverScrollTop(float f, Canvas canvas, View view) {
        int width = view.getWidth();
        this.bounds.left = 0;
        this.bounds.right = view.getWidth();
        this.bounds.top = 0;
        this.bounds.bottom = Math.round(f * 0.36f);
        canvas.drawRect(this.bounds, this.paint);
        int i = width / 2;
        int i2 = this.logoWidth;
        int i3 = i - (i2 / 2);
        int i4 = i + (i2 / 2);
        int i5 = this.bounds.bottom - this.logoMarginBottom;
        this.logo.setBounds(i3, i5 - this.logoHeight, i4, i5);
        this.logo.draw(canvas);
    }
}
