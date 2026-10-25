package com.medicmedia.medilink.multilevelview.animators;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes6.dex */
public final class ViewHelper {
    public static void clear(View view) {
        ViewCompat.setAlpha(view, 1.0f);
        ViewCompat.setScaleY(view, 1.0f);
        ViewCompat.setScaleX(view, 1.0f);
        ViewCompat.setTranslationY(view, 0.0f);
        ViewCompat.setTranslationX(view, 0.0f);
        ViewCompat.setRotation(view, 0.0f);
        ViewCompat.setRotationY(view, 0.0f);
        ViewCompat.setRotationX(view, 0.0f);
        ViewCompat.setPivotY(view, view.getMeasuredHeight() / 2);
        ViewCompat.setPivotX(view, view.getMeasuredWidth() / 2);
        ViewCompat.animate(view).setInterpolator(null).setStartDelay(0L);
    }
}
