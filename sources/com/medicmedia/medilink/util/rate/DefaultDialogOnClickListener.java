package com.medicmedia.medilink.util.rate;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import com.medicmedia.medilink.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
final class DefaultDialogOnClickListener implements View.OnClickListener, DialogInterface.OnClickListener {
    private static volatile WeakReference<DefaultDialogOnClickListener> singleton;
    private OnClickButtonListener buttonListener;
    private Context context;
    private final StoreOptions storeOptions;

    private DefaultDialogOnClickListener(Context context, StoreOptions storeOptions, OnClickButtonListener onClickButtonListener) {
        this.context = context;
        this.storeOptions = storeOptions;
        this.buttonListener = onClickButtonListener;
    }

    static DefaultDialogOnClickListener getInstance(Context context, StoreOptions storeOptions, OnClickButtonListener onClickButtonListener) {
        if (singleton == null || singleton.get() == null) {
            synchronized (DefaultDialogOnClickListener.class) {
                if (singleton == null || singleton.get() == null) {
                    if (singleton != null) {
                        singleton.clear();
                    }
                    singleton = new WeakReference<>(new DefaultDialogOnClickListener(context, storeOptions, onClickButtonListener));
                } else {
                    singleton.get().context = context;
                    singleton.get().buttonListener = onClickButtonListener;
                }
            }
        } else {
            singleton.get().context = context;
            singleton.get().buttonListener = onClickButtonListener;
        }
        return singleton.get();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.rate_dialog_button_positive) {
            onClick(null, -1);
        } else if (id == R.id.rate_dialog_button_negative) {
            onClick(null, -2);
        } else if (id == R.id.rate_dialog_button_neutral) {
            onClick(null, -3);
        } else {
            Log.w(Constants.Utils.TAG, "Failed to rate app, dialog button with the given ResId doesn't exist.");
        }
        AppRate.with(this.context).dismissRateDialog();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -3) {
            onNeutralButtonClick();
        } else if (i == -2) {
            onNegativeButtonClick();
        } else if (i == -1) {
            onPositiveButtonClick();
        } else {
            Log.w(Constants.Utils.TAG, "Failed to rate app, dialog button with the given identifier doesn't exist.");
            return;
        }
        OnClickButtonListener onClickButtonListener = this.buttonListener;
        if (onClickButtonListener != null) {
            onClickButtonListener.onClickButton((byte) i);
        }
    }

    private void onPositiveButtonClick() {
        String packageName = AppInformation.getPackageName(this.context);
        if (packageName.hashCode() != "".hashCode()) {
            Intent[] intentsForStores = getIntentsForStores(packageName);
            try {
                if (intentsForStores.length == 0) {
                    Log.w(Constants.Utils.TAG, "Failed to rate app, no intent found for startActivity (intentsToAppStores.length == 0).");
                } else {
                    Intent intent = intentsForStores[0];
                    if (intent == null) {
                        throw new ActivityNotFoundException("Failed to rate app, no intent found for startActivity (intentsToAppStores[0] == null).");
                    }
                    this.context.startActivity(intent);
                }
            } catch (ActivityNotFoundException e) {
                Log.w(Constants.Utils.TAG, "Failed to rate app, no activity found for " + intentsForStores[0], e);
                byte length = (byte) intentsForStores.length;
                if (length > 1) {
                    for (byte b = 1; b < length; b = (byte) (b + 1)) {
                        try {
                            Intent intent2 = intentsForStores[b];
                            if (intent2 == null) {
                                throw new ActivityNotFoundException("Failed to rate app, no intent found for startActivity (intentsToAppStores[" + ((int) b) + "] == null).");
                            }
                            this.context.startActivity(intent2);
                            break;
                        } catch (ActivityNotFoundException e2) {
                            Log.w(Constants.Utils.TAG, "Failed to rate app, no activity found for " + intentsForStores[b], e2);
                        }
                    }
                }
            }
        } else {
            Log.w(Constants.Utils.TAG, "Failed to rate app, can't get app package name.");
        }
        PreferenceHelper.setIsAgreeShowDialog(this.context, false);
    }

    private void onNegativeButtonClick() {
        PreferenceHelper.setIsAgreeShowDialog(this.context, false);
    }

    private void onNeutralButtonClick() {
        PreferenceHelper.setRemindInterval(this.context);
        PreferenceHelper.setRemindLaunchesNumber(this.context);
    }

    private Intent[] getIntentsForStores(String str) {
        switch (this.storeOptions.getStoreType()) {
            case 0:
                return IntentHelper.createIntentsForStore(this.context, 0, str);
            case 1:
                return IntentHelper.createIntentsForStore(this.context, 1, this.storeOptions.getApplicationId());
            case 2:
                return IntentHelper.createIntentsForStore(this.context, 2, str);
            case 3:
                return IntentHelper.createIntentsForStore(this.context, 3, this.storeOptions.getApplicationId());
            case 4:
                return IntentHelper.createIntentsForStore(this.context, 4, str);
            case 5:
            default:
                return IntentHelper.createIntentsForStore(this.context, 5, str);
            case 6:
                return IntentHelper.createIntentsForStore(this.context, 6, str);
            case 7:
                return IntentHelper.createIntentsForStore(this.context, 7, str);
            case 8:
                return IntentHelper.createIntentsForStore(this.context, 8, str);
            case 9:
                return IntentHelper.createIntentsForStore(this.context, 9, str);
            case 10:
                return IntentHelper.createIntentsForStore(this.context, 10, str);
            case 11:
            case 12:
                return this.storeOptions.getIntents();
        }
    }
}
