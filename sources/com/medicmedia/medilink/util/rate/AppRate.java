package com.medicmedia.medilink.util.rate;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AppRate {
    private static volatile AppRate singleton;
    private final Context context;
    private final DialogOptions dialogOptions = new DialogOptions();
    private final StoreOptions storeOptions = new StoreOptions();
    private boolean isDebug = false;
    private boolean isVersionCodeCheck = false;
    private boolean isVersionNameCheck = false;
    private long installDate = 864000000;
    private byte appLaunchTimes = 10;
    private long remindInterval = 86400000;
    private byte remindLaunchesNumber = 0;
    private byte selectedAppLaunches = 1;
    private short dialogLaunchTimes = ShortCompanionObject.MAX_VALUE;
    private WeakReference<Dialog> dialog = null;
    private DialogManager.Factory dialogManagerFactory = new DefaultDialogManager.Factory();
    private final Map<String, Short> customEventsCounts = new ArrayMap();

    private AppRate(Context context) {
        this.context = context.getApplicationContext();
    }

    public static AppRate with(Context context) {
        if (singleton == null) {
            synchronized (AppRate.class) {
                if (singleton == null) {
                    singleton = new AppRate(context);
                }
            }
        }
        return singleton;
    }

    public static boolean showRateDialogIfMeetsConditions(Activity activity) {
        boolean z = singleton != null && (singleton.isDebug() || singleton.shouldShowRateDialog());
        if (z) {
            singleton.showRateDialog(activity);
        }
        return z;
    }

    public static boolean quickStart(Activity activity) {
        with(activity).monitor();
        return showRateDialogIfMeetsConditions(activity);
    }

    private boolean isOverDate(long j, long j2) {
        return new Date().getTime() - j >= j2;
    }

    private boolean isBelow365DayPeriodMaxNumberDialogLaunchTimes() {
        return this.dialogLaunchTimes == Short.MAX_VALUE || PreferenceHelper.get365DayPeriodDialogLaunchTimes(this.context) < this.dialogLaunchTimes;
    }

    private void setRateDialog(WeakReference<Dialog> weakReference) {
        this.dialog = weakReference;
    }

    private void clearRateDialog() {
        WeakReference<Dialog> weakReference = this.dialog;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    public AppRate set365DayPeriodMaxNumberDialogLaunchTimes(short s) {
        this.dialogLaunchTimes = s;
        return this;
    }

    public AppRate setLaunchTimes(byte b) {
        this.appLaunchTimes = b;
        return this;
    }

    public AppRate setInstallDays(byte b) {
        return setTimeToWait(86400000L, b);
    }

    public AppRate setTimeToWait(long j, short s) {
        this.installDate = j * ((long) s);
        return this;
    }

    public AppRate setRemindInterval(byte b) {
        return setRemindTimeToWait(86400000L, b);
    }

    public AppRate setRemindTimeToWait(long j, short s) {
        this.remindInterval = j * ((long) s);
        return this;
    }

    public AppRate setRemindLaunchesNumber(byte b) {
        this.remindLaunchesNumber = b;
        return this;
    }

    public AppRate clearRemindButtonClick() {
        PreferenceHelper.clearRemindButtonClick(this.context);
        return this;
    }

    public AppRate setMinimumEventCount(String str, short s) {
        this.customEventsCounts.put(str, Short.valueOf(s));
        return this;
    }

    public AppRate setSelectedAppLaunches(byte b) {
        this.selectedAppLaunches = b;
        return this;
    }

    @Deprecated
    public AppRate setRemindLaunchTimes(byte b) {
        return setSelectedAppLaunches(b);
    }

    public AppRate setShowLaterButton(boolean z) {
        this.dialogOptions.setShowNeutralButton(z);
        return this;
    }

    public AppRate setShowNeverButton(boolean z) {
        this.dialogOptions.setShowNegativeButton(z);
        return this;
    }

    public AppRate setShowTitle(boolean z) {
        this.dialogOptions.setShowTitle(z);
        return this;
    }

    public AppRate setShowMessage(boolean z) {
        this.dialogOptions.setShowMessage(z);
        return this;
    }

    public AppRate setShowDialogIcon(boolean z) {
        this.dialogOptions.setShowIcon(Boolean.valueOf(z));
        return this;
    }

    public AppRate clearSettingsParam() {
        PreferenceHelper.clearSharedPreferences(this.context);
        return this;
    }

    public AppRate clearAgreeShowDialog() {
        return setAgreeShowDialog(true);
    }

    public boolean getAgreeShowDialog() {
        return PreferenceHelper.getIsAgreeShowDialog(this.context);
    }

    public AppRate setAgreeShowDialog(boolean z) {
        PreferenceHelper.setIsAgreeShowDialog(this.context, z);
        return this;
    }

    public AppRate setView(View view) {
        this.dialogOptions.setView(view);
        return this;
    }

    public AppRate setOnClickButtonListener(OnClickButtonListener onClickButtonListener) {
        this.dialogOptions.setButtonListener(onClickButtonListener);
        return this;
    }

    public AppRate setDialogIcon(int i) {
        this.dialogOptions.setIconResId(i);
        return this;
    }

    public AppRate setDialogIcon(Drawable drawable) {
        this.dialogOptions.setIcon(drawable);
        return this;
    }

    public AppRate setTitle(int i) {
        this.dialogOptions.setTitleTextResId(i);
        return this;
    }

    public AppRate setTitle(String str) {
        this.dialogOptions.setTitleText(str);
        return this;
    }

    public AppRate setMessage(int i) {
        this.dialogOptions.setMessageTextResId(i);
        return this;
    }

    public AppRate setMessage(String str) {
        this.dialogOptions.setMessageText(str);
        return this;
    }

    public AppRate setTextRateNow(int i) {
        this.dialogOptions.setPositiveTextResId(i);
        return this;
    }

    public AppRate setTextRateNow(String str) {
        this.dialogOptions.setPositiveText(str);
        return this;
    }

    public AppRate setTextLater(int i) {
        this.dialogOptions.setNeutralTextResId(i);
        return this;
    }

    public AppRate setTextLater(String str) {
        this.dialogOptions.setNeutralText(str);
        return this;
    }

    public AppRate setTextNever(int i) {
        this.dialogOptions.setNegativeTextResId(i);
        return this;
    }

    public AppRate setTextNever(String str) {
        this.dialogOptions.setNegativeText(str);
        return this;
    }

    public AppRate setCancelable(boolean z) {
        this.dialogOptions.setCancelable(z);
        return this;
    }

    public AppRate setDialogType(int i) {
        this.dialogOptions.setType(i);
        return this;
    }

    public AppRate setStoreType(int i) throws IllegalArgumentException {
        if (i == 1 || i == 3) {
            throw new IllegalArgumentException("For StoreType.APPLE/StoreType.BLACKBERRY you must use setStoreType(StoreType.APPLE/StoreType.BLACKBERRY, long applicationId).");
        }
        if (i < 0 || i > 10) {
            throw new IllegalArgumentException("StoreType must be one of: AMAZON, APPLE, BAZAAR, BLACKBERRY, CHINESESTORES, GOOGLEPLAY, MI, SAMSUNG, SLIDEME, TENCENT, YANDEX.");
        }
        return setStoreType(i, null, null);
    }

    public AppRate setStoreType(int i, long j) throws IllegalArgumentException {
        if (i < 0 || i > 10) {
            throw new IllegalArgumentException("StoreType must be one of: AMAZON, APPLE, BAZAAR, BLACKBERRY, CHINESESTORES, GOOGLEPLAY, MI, SAMSUNG, SLIDEME, TENCENT, YANDEX.");
        }
        return (i == 1 || i == 3) ? setStoreType(i, new String[]{String.valueOf(j)}, null) : setStoreType(i, null, null);
    }

    public AppRate setStoreType(String... strArr) throws IllegalArgumentException {
        if (strArr == null) {
            throw new IllegalArgumentException("setStoreType(String... uris): 'uris' must be != null.");
        }
        return setStoreType(12, strArr, null);
    }

    public AppRate setStoreType(Intent... intentArr) throws IllegalArgumentException {
        if (intentArr == null) {
            throw new IllegalArgumentException("setStoreType(Intent... intents): 'intents' must be != null.");
        }
        return setStoreType(11, null, intentArr);
    }

    private AppRate setStoreType(int i, String[] strArr, Intent[] intentArr) {
        this.storeOptions.setStoreType(i, strArr, intentArr);
        return this;
    }

    public int getStoreType() {
        return this.storeOptions.getStoreType();
    }

    public AppRate incrementEventCount(String str) {
        return setEventCountValue(str, (short) (PreferenceHelper.getCustomEventCount(this.context, str) + 1));
    }

    public AppRate setEventCountValue(String str, short s) {
        PreferenceHelper.setCustomEventCount(this.context, str, s);
        return this;
    }

    public AppRate setThemeResId(int i) {
        this.dialogOptions.setThemeResId(Integer.valueOf(i));
        return this;
    }

    public AppRate setDialogManagerFactory(DialogManager.Factory factory) {
        this.dialogManagerFactory.clearDialogManager();
        if (factory == null) {
            this.dialogManagerFactory = new DefaultDialogManager.Factory();
            return this;
        }
        factory.clearDialogManager();
        this.dialogManagerFactory = factory;
        return this;
    }

    public AppRate setVersionCodeCheck(boolean z) {
        this.isVersionCodeCheck = z;
        return this;
    }

    public AppRate setVersionNameCheck(boolean z) {
        this.isVersionNameCheck = z;
        return this;
    }

    public void monitor() {
        if (PreferenceHelper.isFirstLaunch(this.context)) {
            PreferenceHelper.setFirstLaunchSharedPreferences(this.context);
            return;
        }
        Context context = this.context;
        PreferenceHelper.setLaunchTimes(context, (short) (PreferenceHelper.getLaunchTimes(context) + 1));
        if (AppInformation.getLongVersionCode(this.context) != PreferenceHelper.getVersionCode(this.context)) {
            if (this.isVersionCodeCheck) {
                setAgreeShowDialog(true);
            }
            PreferenceHelper.setVersionCode(this.context);
        }
        if (AppInformation.getVersionName(this.context).equals(PreferenceHelper.getVersionName(this.context))) {
            return;
        }
        if (this.isVersionNameCheck) {
            setAgreeShowDialog(true);
        }
        PreferenceHelper.setVersionName(this.context);
    }

    public void showRateDialog(Activity activity) {
        WeakReference<Dialog> weakReference = this.dialog;
        boolean z = (weakReference == null || weakReference.get() == null) ? false : true;
        try {
            dismissRateDialog();
            z = false;
        } catch (Exception e) {
            Log.i(Constants.Utils.TAG, "Can't dismiss Rate Dialog, because unpredictable exception.", e);
            clearRateDialog();
        }
        setRateDialog(new WeakReference<>(this.dialogManagerFactory.createDialogManager(activity, this.dialogOptions, this.storeOptions).createDialog()));
        if (this.dialog.get() == null) {
            Log.w(Constants.Utils.TAG, "Failed to rate app, can't create Rate Dialog.");
        } else {
            try {
                if (activity.isFinishing()) {
                    Log.w(Constants.Utils.TAG, "Failed to rate app, can't show Rate Dialog, because activity is in the process of finishing.");
                } else if (activity.isDestroyed()) {
                    Log.w(Constants.Utils.TAG, "Failed to rate app, can't show Rate Dialog, because the final #onDestroy() call has been made on the Activity, so this instance is now dead.");
                } else {
                    this.dialog.get().show();
                    this.dialogOptions.setRedrawn(false);
                }
            } catch (Exception e2) {
                Log.w(Constants.Utils.TAG, "Failed to rate app, can't show Rate Dialog, because unpredictable exception.", e2);
            }
        }
        if (z) {
            ((DefaultDialogManager) this.dialogManagerFactory.createDialogManager(this.context, this.dialogOptions, this.storeOptions)).dismissListener.onDismiss(null);
        }
    }

    public boolean isShowingRateDialog() {
        WeakReference<Dialog> weakReference = this.dialog;
        return (weakReference == null || weakReference.get() == null || !this.dialog.get().isShowing()) ? false : true;
    }

    public void dismissRateDialog() {
        WeakReference<Dialog> weakReference = this.dialog;
        if (weakReference != null && weakReference.get() != null && this.dialog.get().isShowing()) {
            this.dialog.get().dismiss();
        }
        clearRateDialog();
    }

    public void rateNow(Activity activity) {
        DialogInterface.OnClickListener onClickListener = ((DefaultDialogManager) this.dialogManagerFactory.createDialogManager(activity, this.dialogOptions, this.storeOptions)).positiveListener;
        WeakReference<Dialog> weakReference = this.dialog;
        onClickListener.onClick(weakReference != null ? weakReference.get() : null, -1);
        dismissRateDialog();
    }

    public boolean shouldShowRateDialog() {
        return getAgreeShowDialog() && isOverLaunchTimes() && isSelectedAppLaunch() && isOverInstallDate() && isOverRemindDate() && isOverRemindLaunchesNumber() && isOverCustomEventsRequirements() && isBelow365DayPeriodMaxNumberDialogLaunchTimes();
    }

    private boolean isOverLaunchTimes() {
        return this.appLaunchTimes == 0 || PreferenceHelper.getLaunchTimes(this.context) >= this.appLaunchTimes;
    }

    private boolean isSelectedAppLaunch() {
        byte b = this.selectedAppLaunches;
        return b == 1 || (b != 0 && PreferenceHelper.getLaunchTimes(this.context) % this.selectedAppLaunches == 0);
    }

    private boolean isOverInstallDate() {
        return this.installDate == 0 || isOverDate(PreferenceHelper.getInstallDate(this.context), this.installDate);
    }

    private boolean isOverRemindDate() {
        return this.remindInterval == 0 || PreferenceHelper.getRemindInterval(this.context) == 0 || isOverDate(PreferenceHelper.getRemindInterval(this.context), this.remindInterval);
    }

    private boolean isOverRemindLaunchesNumber() {
        return this.remindLaunchesNumber == 0 || PreferenceHelper.getRemindLaunchesNumber(this.context) == 0 || PreferenceHelper.getLaunchTimes(this.context) - PreferenceHelper.getRemindLaunchesNumber(this.context) >= this.remindLaunchesNumber;
    }

    private boolean isOverCustomEventsRequirements() {
        if (this.customEventsCounts.isEmpty()) {
            return true;
        }
        for (Map.Entry<String, Short> entry : this.customEventsCounts.entrySet()) {
            if (Short.valueOf(PreferenceHelper.getCustomEventCount(this.context, entry.getKey())).shortValue() < entry.getValue().shortValue()) {
                return false;
            }
        }
        return true;
    }

    public boolean isDebug() {
        return this.isDebug;
    }

    public AppRate setDebug(boolean z) {
        this.isDebug = z;
        return this;
    }
}
