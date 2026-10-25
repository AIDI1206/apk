package com.medicmedia.medilink.util.rate;

import android.app.Dialog;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: DialogManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0004J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/medicmedia/medilink/util/rate/DialogManager;", "", "createDialog", "Landroid/app/Dialog;", "Factory", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface DialogManager {

    /* JADX INFO: compiled from: DialogManager.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/util/rate/DialogManager$Factory;", "", "clearDialogManager", "", "createDialogManager", "Lcom/medicmedia/medilink/util/rate/DialogManager;", "context", "Landroid/content/Context;", "dialogOptions", "Lcom/medicmedia/medilink/util/rate/DialogOptions;", "storeOptions", "Lcom/medicmedia/medilink/util/rate/StoreOptions;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface Factory {
        void clearDialogManager();

        DialogManager createDialogManager(Context context, DialogOptions dialogOptions, StoreOptions storeOptions);
    }

    Dialog createDialog();
}
