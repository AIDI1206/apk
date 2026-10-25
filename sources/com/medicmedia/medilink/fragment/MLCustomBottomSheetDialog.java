package com.medicmedia.medilink.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.medicmedia.medilink.MLConst;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class MLCustomBottomSheetDialog extends BottomSheetDialog {
    public MLCustomBottomSheetDialog(Context context) {
        super(context);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Display defaultDisplay = ((WindowManager) Objects.requireNonNull((WindowManager) getContext().getSystemService("window"))).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = MLConst.MLBottomsSheet.MAX_WIDTH;
        if (i < 1440) {
            i2 = displayMetrics.widthPixels;
        }
        ((Window) Objects.requireNonNull(getWindow())).setLayout(i2, -1);
    }
}
