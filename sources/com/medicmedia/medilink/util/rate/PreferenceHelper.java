package com.medicmedia.medilink.util.rate;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Date;
import org.apache.commons.cli.HelpFormatter;

/* JADX INFO: loaded from: classes6.dex */
final class PreferenceHelper {
    private static final String CURRENT_DAY_LAUNCHES_MASK = "-(0|[1-9][0-9]*):";
    private static final String DEFAULT_DIALOG_LAUNCH_TIMES = ":0y0-0:";
    private static final String NUMERIC_MASK = "(0|[1-9][0-9]*)";
    private static final String PREF_FILE_NAME = "androidrate_pref_file";
    private static final String PREF_KEY_365_DAY_PERIOD_DIALOG_LAUNCH_TIMES = "androidrate_365_day_period_dialog_launch_times";
    private static final String PREF_KEY_CUSTOM_EVENT_PREFIX = "androidrate_custom_event_prefix_";
    private static final String PREF_KEY_DIALOG_FIRST_LAUNCH_TIME = "androidrate_dialog_first_launch_time";
    private static final String PREF_KEY_INSTALL_DATE = "androidrate_install_date";
    private static final String PREF_KEY_IS_AGREE_SHOW_DIALOG = "androidrate_is_agree_show_dialog";
    private static final String PREF_KEY_LAUNCH_TIMES = "androidrate_launch_times";
    private static final String PREF_KEY_REMIND_INTERVAL = "androidrate_remind_interval";
    private static final String PREF_KEY_REMIND_LAUNCHES_NUMBER = "androidrate_remind_launches_number";
    private static final String PREF_KEY_VERSION_CODE = "androidrate_version_code";
    private static final String PREF_KEY_VERSION_NAME = "androidrate_version_name";

    private PreferenceHelper() {
        throw new UnsupportedOperationException("PreferenceHelper is a utility class and it can't be instantiated!");
    }

    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREF_FILE_NAME, 0);
    }

    private static SharedPreferences.Editor getPreferencesEditor(Context context) {
        return getPreferences(context).edit();
    }

    private static void setCurrentDayDialogLaunchTimes(Context context, String str, byte b, short s, short s2) {
        String strReplaceAll;
        if (str != null) {
            strReplaceAll = str.replaceAll(":" + ((int) s) + "y" + ((int) b) + CURRENT_DAY_LAUNCHES_MASK, ":" + ((int) s) + "y" + ((int) b) + HelpFormatter.DEFAULT_OPT_PREFIX + ((int) s2) + ":");
        } else {
            strReplaceAll = ":" + ((int) s) + "y" + ((int) b) + HelpFormatter.DEFAULT_OPT_PREFIX + ((int) s2) + ":";
        }
        if (b > 1) {
            for (byte b2 = 0; b2 < b - 1; b2 = (byte) (b2 + 1)) {
                strReplaceAll = strReplaceAll.replaceAll(":" + ((int) s) + "y" + ((int) b2) + CURRENT_DAY_LAUNCHES_MASK, ":");
            }
        }
        getPreferencesEditor(context).putString(PREF_KEY_365_DAY_PERIOD_DIALOG_LAUNCH_TIMES, strReplaceAll).apply();
    }

    static void clearSharedPreferences(Context context) {
        getPreferencesEditor(context).clear().apply();
    }

    static boolean isFirstLaunch(Context context) {
        return getPreferences(context).getLong(PREF_KEY_INSTALL_DATE, 0L) == 0;
    }

    static void setFirstLaunchSharedPreferences(Context context) {
        getPreferencesEditor(context).putString(PREF_KEY_365_DAY_PERIOD_DIALOG_LAUNCH_TIMES, DEFAULT_DIALOG_LAUNCH_TIMES).putLong(PREF_KEY_DIALOG_FIRST_LAUNCH_TIME, 0L).putLong(PREF_KEY_INSTALL_DATE, new Date().getTime()).putInt(PREF_KEY_LAUNCH_TIMES, 1).putLong(PREF_KEY_REMIND_INTERVAL, 0L).putInt(PREF_KEY_REMIND_LAUNCHES_NUMBER, 0).putLong(PREF_KEY_VERSION_CODE, AppInformation.getLongVersionCode(context)).putString(PREF_KEY_VERSION_NAME, AppInformation.getVersionName(context)).apply();
        if (getIsAgreeShowDialog(context)) {
            setIsAgreeShowDialog(context, true);
        }
    }

    static void increment365DayPeriodDialogLaunchTimes(Context context) {
        short time = (short) ((new Date().getTime() - getDialogFirstLaunchTime(context)) / 86400000);
        byte b = (byte) (time / Constants.Date.YEAR_IN_DAYS);
        String string = getPreferences(context).getString(PREF_KEY_365_DAY_PERIOD_DIALOG_LAUNCH_TIMES, DEFAULT_DIALOG_LAUNCH_TIMES);
        if (b > 0) {
            time = (short) (time % Constants.Date.YEAR_IN_DAYS);
        }
        if (string != null && string.matches("(.*):" + ((int) time) + "y" + ((int) b) + CURRENT_DAY_LAUNCHES_MASK)) {
            short length = (short) string.length();
            String str = "" + string.charAt(length - 2);
            int i = length - 3;
            while (true) {
                short s = (short) i;
                if (s <= 0 || !Character.isDigit(string.charAt(s))) {
                    break;
                }
                str = string.charAt(s) + str;
                i = s - 1;
            }
            setCurrentDayDialogLaunchTimes(context, string, b, time, (short) (Short.valueOf(str).shortValue() + 1));
            return;
        }
        setCurrentDayDialogLaunchTimes(context, string, b, time, (short) 1);
    }

    static short get365DayPeriodDialogLaunchTimes(Context context) {
        short time = (short) ((new Date().getTime() - getDialogFirstLaunchTime(context)) / 86400000);
        byte b = (byte) (time / Constants.Date.YEAR_IN_DAYS);
        SharedPreferences preferences = getPreferences(context);
        String strReplaceAll = DEFAULT_DIALOG_LAUNCH_TIMES;
        String string = preferences.getString(PREF_KEY_365_DAY_PERIOD_DIALOG_LAUNCH_TIMES, DEFAULT_DIALOG_LAUNCH_TIMES);
        if (string != null) {
            strReplaceAll = string.replaceAll(":(0|[1-9][0-9]*)y" + ((int) b) + HelpFormatter.DEFAULT_OPT_PREFIX, ":");
        }
        if (b > 0) {
            int i = time % Constants.Date.YEAR_IN_DAYS;
            while (true) {
                short s = (short) i;
                if (s >= 365) {
                    break;
                }
                strReplaceAll = strReplaceAll.replaceAll(":" + ((int) s) + "y" + String.valueOf(b - 1) + HelpFormatter.DEFAULT_OPT_PREFIX, ":");
                i = s + 1;
            }
        }
        String strReplaceAll2 = strReplaceAll.replaceAll(":(0|[1-9][0-9]*)y(0|[1-9][0-9]*)-(0|[1-9][0-9]*):", ":");
        if (strReplaceAll2.length() > 2) {
            strReplaceAll2 = strReplaceAll2.substring(1, strReplaceAll2.length() - 1);
        }
        short sShortValue = 0;
        for (String str : strReplaceAll2.split(":")) {
            sShortValue = (short) (sShortValue + Short.valueOf(str).shortValue());
        }
        return sShortValue;
    }

    static void setCustomEventCount(Context context, String str, short s) {
        getPreferencesEditor(context).putInt(PREF_KEY_CUSTOM_EVENT_PREFIX + str, s).apply();
    }

    static short getCustomEventCount(Context context, String str) {
        return (short) getPreferences(context).getInt(PREF_KEY_CUSTOM_EVENT_PREFIX + str, 0);
    }

    static void setDialogFirstLaunchTime(Context context) {
        getPreferencesEditor(context).putLong(PREF_KEY_DIALOG_FIRST_LAUNCH_TIME, new Date().getTime()).apply();
    }

    static long getDialogFirstLaunchTime(Context context) {
        return getPreferences(context).getLong(PREF_KEY_DIALOG_FIRST_LAUNCH_TIME, 0L);
    }

    static long getInstallDate(Context context) {
        return getPreferences(context).getLong(PREF_KEY_INSTALL_DATE, 0L);
    }

    static void setIsAgreeShowDialog(Context context, boolean z) {
        getPreferencesEditor(context).putBoolean(PREF_KEY_IS_AGREE_SHOW_DIALOG, z).apply();
    }

    static boolean getIsAgreeShowDialog(Context context) {
        return getPreferences(context).getBoolean(PREF_KEY_IS_AGREE_SHOW_DIALOG, true);
    }

    static void setLaunchTimes(Context context, short s) {
        getPreferencesEditor(context).putInt(PREF_KEY_LAUNCH_TIMES, s).apply();
    }

    static short getLaunchTimes(Context context) {
        return (short) getPreferences(context).getInt(PREF_KEY_LAUNCH_TIMES, 0);
    }

    static void setRemindInterval(Context context) {
        getPreferencesEditor(context).putLong(PREF_KEY_REMIND_INTERVAL, new Date().getTime()).apply();
    }

    static long getRemindInterval(Context context) {
        return getPreferences(context).getLong(PREF_KEY_REMIND_INTERVAL, 0L);
    }

    static void setRemindLaunchesNumber(Context context) {
        getPreferencesEditor(context).putInt(PREF_KEY_REMIND_LAUNCHES_NUMBER, getLaunchTimes(context)).apply();
    }

    static short getRemindLaunchesNumber(Context context) {
        return (short) getPreferences(context).getInt(PREF_KEY_REMIND_LAUNCHES_NUMBER, 0);
    }

    static void clearRemindButtonClick(Context context) {
        getPreferencesEditor(context).putLong(PREF_KEY_REMIND_INTERVAL, 0L).putInt(PREF_KEY_REMIND_LAUNCHES_NUMBER, 0).apply();
    }

    static void setVersionCode(Context context) {
        getPreferencesEditor(context).putLong(PREF_KEY_VERSION_CODE, AppInformation.getLongVersionCode(context)).apply();
    }

    static long getVersionCode(Context context) {
        return getPreferences(context).getLong(PREF_KEY_VERSION_CODE, 0L);
    }

    static void setVersionName(Context context) {
        getPreferencesEditor(context).putString(PREF_KEY_VERSION_NAME, AppInformation.getVersionName(context)).apply();
    }

    static String getVersionName(Context context) {
        return getPreferences(context).getString(PREF_KEY_VERSION_NAME, "");
    }
}
