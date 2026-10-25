package com.medicmedia.medilink.util.rate;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import com.medicmedia.medilink.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class DefaultDialogManager implements DialogManager {
    private static volatile WeakReference<DefaultDialogManager> singleton;
    protected final View.OnClickListener buttonListener;
    protected Context context;
    protected DialogOptions dialogOptions;
    protected final DialogInterface.OnClickListener negativeListener;
    protected final DialogInterface.OnClickListener neutralListener;
    protected final DialogInterface.OnClickListener positiveListener;
    protected final DialogInterface.OnShowListener showListener = new DialogInterface.OnShowListener() { // from class: com.medicmedia.medilink.util.rate.DefaultDialogManager.1
        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            if (DefaultDialogManager.this.dialogOptions.getIsRedrawn()) {
                DefaultDialogManager.this.dialogOptions.getType();
                return;
            }
            if (PreferenceHelper.getDialogFirstLaunchTime(DefaultDialogManager.this.context) == 0) {
                PreferenceHelper.setDialogFirstLaunchTime(DefaultDialogManager.this.context);
            }
            PreferenceHelper.increment365DayPeriodDialogLaunchTimes(DefaultDialogManager.this.context);
        }
    };
    protected final DialogInterface.OnDismissListener dismissListener = new DialogInterface.OnDismissListener() { // from class: com.medicmedia.medilink.util.rate.DefaultDialogManager.2
        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            DefaultDialogManager.this.dialogOptions.setRedrawn(true);
        }
    };
    protected final RatingBar.OnRatingBarChangeListener ratingBarListener = new RatingBar.OnRatingBarChangeListener() { // from class: com.medicmedia.medilink.util.rate.DefaultDialogManager.3
        @Override // android.widget.RatingBar.OnRatingBarChangeListener
        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            View rootView = ratingBar.getRootView();
            View viewFindViewById = rootView.findViewById(R.id.rate_dialog_button_neutral);
            View viewFindViewById2 = rootView.findViewById(R.id.rate_dialog_button_negative);
            View viewFindViewById3 = rootView.findViewById(R.id.rate_dialog_button_positive);
            boolean z2 = DefaultDialogManager.this.dialogOptions.getIsShowNeutralButton() && viewFindViewById != null;
            boolean z3 = DefaultDialogManager.this.dialogOptions.getIsShowNegativeButton() && viewFindViewById2 != null;
            boolean z4 = viewFindViewById3 != null;
            if (z) {
                DefaultDialogManager.this.dialogOptions.setCurrentRating((byte) f);
            }
            if (!z3 && z4) {
                viewFindViewById3.setVisibility(0);
            } else if (z3 && !z4) {
                viewFindViewById2.setVisibility(0);
            } else if (z3) {
                viewFindViewById2.setVisibility(0);
                viewFindViewById3.setVisibility(0);
            }
            if (z2) {
                viewFindViewById.setVisibility(8);
            }
        }
    };

    protected DefaultDialogManager(Context context, DialogOptions dialogOptions, StoreOptions storeOptions) {
        this.dialogOptions = null;
        this.context = null;
        this.context = context;
        this.dialogOptions = dialogOptions;
        DefaultDialogOnClickListener defaultDialogOnClickListener = DefaultDialogOnClickListener.getInstance(context, storeOptions, dialogOptions.getButtonListener());
        this.positiveListener = defaultDialogOnClickListener;
        this.negativeListener = defaultDialogOnClickListener;
        this.neutralListener = defaultDialogOnClickListener;
        this.buttonListener = defaultDialogOnClickListener;
    }

    protected void setContext(Context context) {
        this.context = context;
    }

    protected AlertDialog.Builder getDialogBuilder(Context context, int i) {
        return Utils.getDialogBuilder(context, i);
    }

    protected void supplyClassicDialogArguments(AlertDialog.Builder builder, Context context) {
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

    protected void supplyNonClassicDialogArguments(View view, Context context) {
        ViewGroup.LayoutParams layoutParams;
        view.findViewById(R.id.rate_dialog_layout_head);
        View viewFindViewById = view.findViewById(R.id.rate_dialog_icon);
        View viewFindViewById2 = view.findViewById(R.id.rate_dialog_text_dialog_title);
        View viewFindViewById3 = view.findViewById(R.id.rate_dialog_text_dialog_message);
        View viewFindViewById4 = view.findViewById(R.id.rate_dialog_button_neutral);
        View viewFindViewById5 = view.findViewById(R.id.rate_dialog_button_negative);
        View viewFindViewById6 = view.findViewById(R.id.rate_dialog_button_positive);
        boolean z = this.dialogOptions.isShowIcon().booleanValue() && viewFindViewById != null;
        boolean z2 = this.dialogOptions.getIsShowTitle() && viewFindViewById2 != null;
        boolean z3 = this.dialogOptions.getIsShowMessage() && viewFindViewById3 != null;
        boolean z4 = this.dialogOptions.getIsShowNeutralButton() && viewFindViewById4 != null;
        if (z) {
            ((ImageView) viewFindViewById).setImageDrawable(this.dialogOptions.getIcon(context));
        } else {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            if (z2 && (layoutParams = viewFindViewById2.getLayoutParams()) != null) {
                ((LinearLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, 0);
                viewFindViewById2.setLayoutParams(layoutParams);
            }
        }
        if (z2) {
            ((TextView) viewFindViewById2).setText(this.dialogOptions.getTitleText(this.context));
        } else if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        if (z3) {
            ((TextView) viewFindViewById3).setText(this.dialogOptions.getMessageText(this.context));
        } else if (viewFindViewById3 != null) {
            viewFindViewById3.setVisibility(8);
        }
        if (z4) {
            ((Button) viewFindViewById4).setText(this.dialogOptions.getNeutralText(this.context));
            viewFindViewById4.setOnClickListener(this.buttonListener);
            viewFindViewById4.setBackgroundColor(-1);
        } else if (viewFindViewById4 != null) {
            viewFindViewById4.setVisibility(8);
        }
        if (this.dialogOptions.getIsShowNegativeButton() && viewFindViewById5 != null) {
            Button button = (Button) viewFindViewById5;
            button.setText(this.dialogOptions.getNegativeText(this.context));
            viewFindViewById5.setOnClickListener(this.buttonListener);
            button.setBackgroundColor(-1);
        } else if (viewFindViewById5 != null) {
            viewFindViewById5.setVisibility(8);
        }
        if (viewFindViewById6 != null) {
            ((Button) viewFindViewById6).setText(this.dialogOptions.getPositiveText(this.context));
            viewFindViewById6.setOnClickListener(this.buttonListener);
        }
    }

    @Override // com.medicmedia.medilink.util.rate.DialogManager
    public Dialog createDialog() {
        AlertDialog.Builder dialogBuilder = getDialogBuilder(this.context, this.dialogOptions.getThemeResId().intValue());
        Context context = dialogBuilder.getContext();
        View view = this.dialogOptions.getView(context);
        if (this.dialogOptions.getType() == 1 || view == null) {
            if (this.dialogOptions.getType() != 1) {
                dialogBuilder = getDialogBuilder(this.context, 0);
                context = dialogBuilder.getContext();
            }
            supplyClassicDialogArguments(dialogBuilder, context);
        } else {
            supplyNonClassicDialogArguments(view, context);
        }
        AlertDialog alertDialogCreate = dialogBuilder.setCancelable(this.dialogOptions.getCancelable()).setView(view).create();
        alertDialogCreate.setOnShowListener(this.showListener);
        alertDialogCreate.setOnDismissListener(this.dismissListener);
        return alertDialogCreate;
    }

    static class Factory implements DialogManager.Factory {
        Factory() {
            if (DefaultDialogManager.singleton != null) {
                DefaultDialogManager.singleton.clear();
            }
        }

        @Override // com.medicmedia.medilink.util.rate.DialogManager.Factory
        public void clearDialogManager() {
            if (DefaultDialogManager.singleton != null) {
                DefaultDialogManager.singleton.clear();
            }
        }

        @Override // com.medicmedia.medilink.util.rate.DialogManager.Factory
        public DialogManager createDialogManager(Context context, DialogOptions dialogOptions, StoreOptions storeOptions) {
            if (DefaultDialogManager.singleton == null || DefaultDialogManager.singleton.get() == null) {
                synchronized (DefaultDialogManager.class) {
                    if (DefaultDialogManager.singleton == null || DefaultDialogManager.singleton.get() == null) {
                        if (DefaultDialogManager.singleton != null) {
                            DefaultDialogManager.singleton.clear();
                        }
                        DefaultDialogManager.singleton = new WeakReference(new DefaultDialogManager(context, dialogOptions, storeOptions));
                    } else {
                        ((DefaultDialogManager) DefaultDialogManager.singleton.get()).setContext(context);
                    }
                }
            } else {
                ((DefaultDialogManager) DefaultDialogManager.singleton.get()).setContext(context);
            }
            return (DialogManager) DefaultDialogManager.singleton.get();
        }
    }
}
