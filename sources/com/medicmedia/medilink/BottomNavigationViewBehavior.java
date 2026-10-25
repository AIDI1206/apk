package com.medicmedia.medilink;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public class BottomNavigationViewBehavior extends CoordinatorLayout.Behavior<View> {
    protected int height;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.height = view.getHeight();
        return super.onLayoutChild(coordinatorLayout, view, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (i2 > 0) {
            slideUp(view);
        } else if (i2 < 0) {
            slideDown(view);
        }
    }

    protected void slideUp(View view) {
        view.clearAnimation();
        view.animate().translationY(0.0f).setDuration(200L);
    }

    protected void slideDown(View view) {
        view.clearAnimation();
        view.animate().translationY(this.height).setDuration(200L);
    }
}
