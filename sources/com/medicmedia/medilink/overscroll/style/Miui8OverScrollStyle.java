package com.medicmedia.medilink.overscroll.style;

import android.graphics.Canvas;
import android.view.View;
import com.medicmedia.medilink.overscroll.OverScrollDelegate;

/* JADX INFO: loaded from: classes6.dex */
public class Miui8OverScrollStyle extends OverScrollDelegate.OverScrollStyle {
    final float scaleRate = 0.2f;

    @Override // com.medicmedia.medilink.overscroll.OverScrollDelegate.OverScrollStyle
    public void transformOverScrollCanvas(float f, Canvas canvas, View view) {
        int height = view.getHeight();
        float width = view.getWidth();
        canvas.scale(1.0f, (Math.abs(0.2f * f) + width) / width, width / 2.0f, f < 0.0f ? height + view.getScrollY() : 0.0f);
    }
}
