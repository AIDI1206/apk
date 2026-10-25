package com.medicmedia.medilink.util.rate;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
final class IntentHelper {
    private static final String AMAZON_APPSTORE_PACKAGE_NAME = "com.amazon.venezia";
    private static final String BLACKBERRY_WORLD_PACKAGE_NAME = "net.rim.bb.appworld";
    private static final String CAFE_BAZAAR_PACKAGE_NAME = "com.farsitel.bazaar";
    private static final String GOOGLE_PLAY_PACKAGE_NAME = "com.android.vending";
    private static final String SAMSUNG_GALAXY_APPS_PACKAGE_NAME = "com.sec.android.app.samsungapps";
    private static final String SLIDEME_MARKETPLACE_PACKAGE_NAME = "com.slideme.sam.manager";
    private static final String YANDEX_STORE_PACKAGE_NAME = "com.yandex.store";
    private static final String[] BROWSERS_PACKAGES_NAMES = {"com.android.chrome", "org.mozilla.firefox", "com.opera.browser", "com.opera.mini.native", "com.sec.android.app.sbrowser", "com.UCMobile.intl", "com.tencent.mtt", "com.android.browser"};
    private static final String TENCENT_PACKAGE_NAME = "com.tencent.android.qqdownloader";
    private static final String MI_PACKAGE_NAME = "com.xiaomi.market";
    private static final String[] CHINESE_STORES_PACKAGES_NAMES = {TENCENT_PACKAGE_NAME, "com.qihoo.appstore", MI_PACKAGE_NAME, "com.huawei.appmarket", "com.baidu.appsearch", "com.oppo.market", "zte.com.market", "com.bbk.appstore", "com.wandoujia.phoenix2", "com.pp.assistant", "com.hiapk.marketpho", "com.dragon.android.pandaspace", "com.yingyonghui.market", "com.tencent.qqpimsecure", "com.mappn.gfan", "cn.goapk.market", "com.yulong.android.coolmart", "com.lenovo.leos.appstore", "com.coolapk.market"};

    private static boolean getHasWebUriIntentFlagForStore(int i) {
        return i != 4;
    }

    private static boolean getNeedStorePackageFlagForStore(int i) {
        return i == 4 || i == 7 || i == 10;
    }

    private IntentHelper() {
        throw new UnsupportedOperationException("IntentHelper is a utility class and it can't be instantiated!");
    }

    private static String[] getPackagesNamesForStore(int i) {
        switch (i) {
            case 0:
                return new String[]{AMAZON_APPSTORE_PACKAGE_NAME};
            case 1:
                return Constants.Utils.EMPTY_STRING_ARRAY;
            case 2:
                return new String[]{CAFE_BAZAAR_PACKAGE_NAME};
            case 3:
                return new String[]{BLACKBERRY_WORLD_PACKAGE_NAME};
            case 4:
                return CHINESE_STORES_PACKAGES_NAMES;
            case 5:
            default:
                return new String[]{"com.android.vending"};
            case 6:
                return new String[]{MI_PACKAGE_NAME};
            case 7:
                return new String[]{SAMSUNG_GALAXY_APPS_PACKAGE_NAME};
            case 8:
                return new String[]{SLIDEME_MARKETPLACE_PACKAGE_NAME};
            case 9:
                return new String[]{TENCENT_PACKAGE_NAME};
            case 10:
                return new String[]{YANDEX_STORE_PACKAGE_NAME};
        }
    }

    private static void setIntentForStore(Intent intent) {
        intent.addFlags(268435456);
        intent.addFlags(2097152);
        intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
    }

    static Intent[] createIntentsForStore(Context context, int i, String str) {
        Intent[] intentArr;
        if (context == null) {
            Log.w(Constants.Utils.TAG, "Failed to rate app, can't check the availability of stores packages on the user device (context == null).");
            return new Intent[0];
        }
        boolean needStorePackageFlagForStore = getNeedStorePackageFlagForStore(i);
        boolean hasWebUriIntentFlagForStore = getHasWebUriIntentFlagForStore(i);
        String[] packagesNamesForStore = getPackagesNamesForStore(i);
        String[] strArrIsPackagesExists = Utils.isPackagesExists(context, packagesNamesForStore);
        int length = (byte) strArrIsPackagesExists.length;
        if (length > 0) {
            if (hasWebUriIntentFlagForStore) {
                intentArr = new Intent[length + 1];
                intentArr[length] = new Intent("android.intent.action.VIEW", UriHelper.getStoreWebUri(i, str));
            } else {
                intentArr = new Intent[length];
            }
            for (byte b = 0; b < length; b = (byte) (b + 1)) {
                Intent intent = new Intent("android.intent.action.VIEW", UriHelper.getStoreUri(i, str));
                intentArr[b] = intent;
                setIntentForStore(intent);
                intentArr[b].setPackage(strArrIsPackagesExists[b]);
            }
            return intentArr;
        }
        if (!needStorePackageFlagForStore) {
            Intent[] intentArr2 = {new Intent("android.intent.action.VIEW", UriHelper.getStoreWebUri(i, str))};
            if (i == 1) {
                String[] strArrIsPackagesExists2 = Utils.isPackagesExists(context, BROWSERS_PACKAGES_NAMES);
                if (strArrIsPackagesExists2.length > 0) {
                    intentArr2[0].setPackage(strArrIsPackagesExists2[0]);
                }
            }
            return intentArr2;
        }
        Intent[] intentArr3 = new Intent[0];
        if (hasWebUriIntentFlagForStore) {
            Log.w(Constants.Utils.TAG, Constants.Utils.LOG_MESSAGE_PART_1 + Arrays.toString(packagesNamesForStore) + " not exist on the user device and the user device can't start the app store (" + i + ") web (http/https) uri activity without it.");
            return intentArr3;
        }
        Log.w(Constants.Utils.TAG, Constants.Utils.LOG_MESSAGE_PART_1 + Arrays.toString(packagesNamesForStore) + " not exist on the user device and the app store (" + i + ") hasn't web (http/https) uri.");
        return intentArr3;
    }
}
