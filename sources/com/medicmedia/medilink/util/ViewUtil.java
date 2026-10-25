package com.medicmedia.medilink.util;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.medicmedia.medilink.domain.model.QBConstants;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

/* JADX INFO: loaded from: classes6.dex */
public class ViewUtil {
    private static final String TAG = "ViewUtil";
    private static float density;

    public static float density(Context context) {
        if (density == 0.0f) {
            density = context.getResources().getDisplayMetrics().density;
        }
        return density;
    }

    public static boolean getAutoState(Activity activity) {
        try {
            return Settings.System.getInt(activity.getContentResolver(), "auto_time") > 0;
        } catch (Settings.SettingNotFoundException unused) {
            return true;
        }
    }

    public static String convertQBDisp3Str(String str, String str2) {
        str2.hashCode();
        String str3 = "";
        if (!str2.equals(QBConstants.CONTENT_CODE_ISHIKOKUSHI)) {
            return !str2.equals(QBConstants.CONTENT_CODE_IGAKUCBT) ? str : str.replaceAll(HelpFormatter.DEFAULT_OPT_PREFIX, "");
        }
        if (str.contains(HelpFormatter.DEFAULT_OPT_PREFIX)) {
            str = str.substring(0, str.indexOf(HelpFormatter.DEFAULT_OPT_PREFIX));
        }
        String[] strArrSplit = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        for (int i = 0; i < strArrSplit.length; i++) {
            String strReplace = strArrSplit[i];
            if (containsUnicode(strReplace)) {
                if (strReplace.equals("追")) {
                    str3 = str3 + "1";
                }
            } else if (isAlphabet(strReplace)) {
                for (int i2 = 0; i2 < strReplace.length(); i2++) {
                    str3 = str3 + (strReplace.charAt(i2) - '@');
                }
            } else {
                if (i > 0 && strReplace.length() > 0) {
                    strReplace = String.format("%3s", strReplace).replace(" ", "0");
                }
                str3 = str3 + strReplace + "0";
            }
        }
        if (str.contains("103追")) {
            Log.d(TAG, "tmp_nums = " + str + " > " + str3);
        }
        return str3;
    }

    public static boolean isAlphabet(String str) {
        if (str != null) {
            return Pattern.compile("^[a-zA-Z]+$").matcher(str).matches();
        }
        return false;
    }

    public static boolean containsUnicode(String str) {
        for (int i = 0; i < str.length(); i++) {
            Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(str.charAt(i));
            if (Character.UnicodeBlock.HIRAGANA.equals(unicodeBlockOf) || Character.UnicodeBlock.KATAKANA.equals(unicodeBlockOf) || Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS.equals(unicodeBlockOf) || Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS.equals(unicodeBlockOf) || Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION.equals(unicodeBlockOf)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEmailValid(String str) {
        return Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", 2).matcher(str).matches();
    }
}
