package com.medicmedia.medilink.overscroll.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import android.webkit.WebView;
import com.medicmedia.medilink.overscroll.OverScrollDelegate;

/* JADX INFO: loaded from: classes6.dex */
public abstract class WebHostOverScrollStyle extends OverScrollDelegate.OverScrollStyle {
    final int backgroundColor;
    final Rect bounds;
    final TextPaint paint;
    final float textCenterY;
    final int textColor;

    public abstract String formatUrlHost(String str);

    public WebHostOverScrollStyle() {
        this(-14144723, -9538442, 14, 32);
    }

    public WebHostOverScrollStyle(int i, int i2, int i3, int i4) {
        TextPaint textPaint = new TextPaint(1);
        this.paint = textPaint;
        this.bounds = new Rect();
        textPaint.density = SYSTEM_DENSITY;
        textPaint.setTextSize(dp2px(i3));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.backgroundColor = i;
        this.textColor = i2;
        this.textCenterY = dp2px(i4);
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollStyle
    public void drawOverScrollTop(float f, Canvas canvas, View view) {
        String urlHost;
        this.bounds.left = view.getScrollX();
        Rect rect = this.bounds;
        rect.right = rect.left + view.getWidth();
        this.bounds.top = 0;
        this.bounds.bottom = Math.round(f * 0.36f);
        this.paint.setColor(this.backgroundColor);
        canvas.drawRect(this.bounds, this.paint);
        this.paint.setColor(this.textColor);
        canvas.clipRect(this.bounds);
        if (view == null || !(view instanceof WebView) || (urlHost = formatUrlHost(((WebView) view).getUrl())) == null) {
            return;
        }
        canvas.drawText(urlHost, this.bounds.exactCenterX(), this.textCenterY, this.paint);
    }

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollStyle
    public void drawOverScrollBottom(float f, Canvas canvas, View view) {
        this.bounds.left = view.getScrollX();
        Rect rect = this.bounds;
        rect.right = rect.left + view.getWidth();
        this.bounds.bottom = getOverScrollViewCanvasBottom(view);
        Rect rect2 = this.bounds;
        rect2.top = rect2.bottom + Math.round(f * 0.36f);
        this.paint.setColor(this.backgroundColor);
        canvas.drawRect(this.bounds, this.paint);
    }
}
