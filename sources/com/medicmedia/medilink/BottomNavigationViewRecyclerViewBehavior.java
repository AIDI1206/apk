package com.medicmedia.medilink;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes6.dex */
public class BottomNavigationViewRecyclerViewBehavior extends BottomNavigationViewBehavior {
    @Override // com.medicmedia.medilink.BottomNavigationViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        if (i2 > 0) {
            slideDown(view);
        } else if (i2 < 0) {
            slideUp(view);
        }
    }
}
