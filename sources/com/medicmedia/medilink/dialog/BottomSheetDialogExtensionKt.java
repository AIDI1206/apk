package com.medicmedia.medilink.dialog;

import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.medicmedia.medilink.MLConst;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: BottomSheetDialogExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"setupLayout", "", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "app_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class BottomSheetDialogExtensionKt {
    public static final void setupLayout(BottomSheetDialog bottomSheetDialog) {
        int iCoerceAtMost;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "<this>");
        WindowManager windowManager = (WindowManager) bottomSheetDialog.getContext().getSystemService(WindowManager.class);
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "getCurrentWindowMetrics(...)");
            iCoerceAtMost = RangesKt.coerceAtMost(currentWindowMetrics.getBounds().width(), MLConst.MLBottomsSheet.MAX_WIDTH);
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            iCoerceAtMost = RangesKt.coerceAtMost(displayMetrics.widthPixels, MLConst.MLBottomsSheet.MAX_WIDTH);
        }
        Window window = bottomSheetDialog.getWindow();
        if (window != null) {
            window.setLayout(iCoerceAtMost, -1);
        }
    }
}
