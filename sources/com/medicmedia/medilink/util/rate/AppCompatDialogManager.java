package com.medicmedia.medilink.util.rate;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AlertDialog;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class AppCompatDialogManager extends DefaultDialogManager implements DialogManager {
    private static volatile WeakReference<DialogManager> singleton;

    protected AppCompatDialogManager(Context context, DialogOptions dialogOptions, StoreOptions storeOptions) {
        super(context, dialogOptions, storeOptions);
    }

    protected AlertDialog.Builder getAppCompatDialogBuilder(Context context, int i) {
        return Utils.getAppCompatDialogBuilder(context, i);
    }

    protected void supplyAppCompatClassicDialogArguments(AlertDialog.Builder builder, Context context) {
        if (this.dialogOptions.isShowIcon().booleanValue()) {
            builder.setIcon(this.dialogOptions.getIcon(context));
        }
        if (this.dialogOptions.getIsShowTitle()) {
            builder.setTitle(this.dialogOptions.getTitleText(this.context));
        }
        if (this.dialogOptions.getIsShowMessage()) {
            builder.setMessage(this.dialogOptions.getMessageText(this.context));
        }
        if (this.dialogOptions.getIsShowNeutralButton()) {
            builder.setNeutralButton(this.dialogOptions.getNeutralText(this.context), this.neutralListener);
        }
        if (this.dialogOptions.getIsShowNegativeButton()) {
            builder.setNegativeButton(this.dialogOptions.getNegativeText(this.context), this.negativeListener);
        }
        builder.setPositiveButton(this.dialogOptions.getPositiveText(this.context), this.positiveListener);
    }

    @Override // com.medicmedia.medilink.util.rate.DefaultDialogManager, com.medicmedia.medilink.util.rate.DialogManager
    public Dialog createDialog() {
        AlertDialog.Builder appCompatDialogBuilder = getAppCompatDialogBuilder(this.context, this.dialogOptions.getThemeResId().intValue());
        Context context = appCompatDialogBuilder.getContext();
        View view = this.dialogOptions.getView(context);
        if (this.dialogOptions.getType() == 1 || view == null) {
            if (this.dialogOptions.getType() != 1) {
                appCompatDialogBuilder = getAppCompatDialogBuilder(this.context, 0);
                context = appCompatDialogBuilder.getContext();
            }
            supplyAppCompatClassicDialogArguments(appCompatDialogBuilder, context);
        } else {
            supplyNonClassicDialogArguments(view, context);
        }
        AlertDialog alertDialogCreate = appCompatDialogBuilder.setCancelable(this.dialogOptions.getCancelable()).setView(view).create();
        alertDialogCreate.setOnShowListener(this.showListener);
        alertDialogCreate.setOnDismissListener(this.dismissListener);
        return alertDialogCreate;
    }

    public static class Factory implements DialogManager.Factory {
        public Factory() {
            if (AppCompatDialogManager.singleton != null) {
                AppCompatDialogManager.singleton.clear();
            }
        }

        @Override // com.medicmedia.medilink.util.rate.DialogManager.Factory
        public void clearDialogManager() {
            if (AppCompatDialogManager.singleton != null) {
                AppCompatDialogManager.singleton.clear();
            }
        }

        @Override // com.medicmedia.medilink.util.rate.DialogManager.Factory
        public DialogManager createDialogManager(Context context, DialogOptions dialogOptions, StoreOptions storeOptions) {
            DefaultDialogManager.Factory factory = new DefaultDialogManager.Factory();
            AppRate.with(context).setDialogManagerFactory(factory);
            return factory.createDialogManager(context, dialogOptions, storeOptions);
        }
    }
}
