package com.medicmedia.medilink.util.rate;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UriHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0007J\u001a\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/medicmedia/medilink/util/rate/UriHelper;", "", "<init>", "()V", "DEFAULT_STORE_URI", "", "AMAZON_APPSTORE", "AMAZON_APPSTORE_WEB", "APPLE_APP_STORE_WEB", "BLACKBERRY_WORLD", "BLACKBERRY_WORLD_WEB", "CAFE_BAZAAR", "CAFE_BAZAAR_WEB", "CHINESE_STORES", "GOOGLE_PLAY", "GOOGLE_PLAY_WEB", "MI_APPSTORE", "MI_APPSTORE_WEB", "SAMSUNG_GALAXY_APPS", "SAMSUNG_GALAXY_APPS_WEB", "SLIDEME_MARKETPLACE", "SLIDEME_MARKETPLACE_WEB", "TENCENT_APP_STORE", "TENCENT_APP_STORE_WEB", "YANDEX_STORE", "YANDEX_STORE_WEB", "formUri", "Landroid/net/Uri;", "part1", "part2", "getStoreUri", "appStore", "", "paramName", "getStoreWebUri", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UriHelper {
    public static final int $stable = 0;
    private static final String AMAZON_APPSTORE = "amzn://apps/android?p=";
    private static final String AMAZON_APPSTORE_WEB = "https://www.amazon.com/gp/mas/dl/android?p=";
    private static final String APPLE_APP_STORE_WEB = "https://itunes.apple.com/app/id";
    private static final String BLACKBERRY_WORLD = "appworld://content/";
    private static final String BLACKBERRY_WORLD_WEB = "https://appworld.blackberry.com/webstore/content/";
    private static final String CAFE_BAZAAR = "bazaar://details?id=";
    private static final String CAFE_BAZAAR_WEB = "https://cafebazaar.ir/app/";
    private static final String CHINESE_STORES = "market://details?id=";
    private static final String DEFAULT_STORE_URI = "market://details?id=";
    private static final String GOOGLE_PLAY = "market://details?id=";
    private static final String GOOGLE_PLAY_WEB = "https://play.google.com/store/apps/details?id=";
    public static final UriHelper INSTANCE = new UriHelper();
    private static final String MI_APPSTORE = "market://details?id=";
    private static final String MI_APPSTORE_WEB = "http://app.xiaomi.com/details?id=";
    private static final String SAMSUNG_GALAXY_APPS = "samsungapps://ProductDetail/";
    private static final String SAMSUNG_GALAXY_APPS_WEB = "https://apps.samsung.com/appquery/appDetail.as?appId=";
    private static final String SLIDEME_MARKETPLACE = "sam://details?id=";
    private static final String SLIDEME_MARKETPLACE_WEB = "http://slideme.org/app/";
    private static final String TENCENT_APP_STORE = "market://details?id=";
    private static final String TENCENT_APP_STORE_WEB = "http://a.app.qq.com/o/simple.jsp?pkgname=";
    private static final String YANDEX_STORE = "yastore://details?id=";
    private static final String YANDEX_STORE_WEB = "https://store.yandex.com/apps/details?id=";

    private UriHelper() {
    }

    private final Uri formUri(String part1, String part2) {
        Uri uri = Uri.parse(part1 + part2);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        return uri;
    }

    @JvmStatic
    public static final Uri getStoreUri(int appStore, String paramName) {
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        switch (appStore) {
            case 0:
                return INSTANCE.formUri(AMAZON_APPSTORE, paramName);
            case 1:
                return null;
            case 2:
                return INSTANCE.formUri(CAFE_BAZAAR, paramName);
            case 3:
                return INSTANCE.formUri(BLACKBERRY_WORLD, paramName);
            case 4:
                return INSTANCE.formUri("market://details?id=", paramName);
            case 5:
            default:
                return INSTANCE.formUri("market://details?id=", paramName);
            case 6:
                return INSTANCE.formUri("market://details?id=", paramName);
            case 7:
                return INSTANCE.formUri(SAMSUNG_GALAXY_APPS, paramName);
            case 8:
                return INSTANCE.formUri(SLIDEME_MARKETPLACE, paramName);
            case 9:
                return INSTANCE.formUri("market://details?id=", paramName);
            case 10:
                return INSTANCE.formUri(YANDEX_STORE, paramName);
        }
    }

    @JvmStatic
    public static final Uri getStoreWebUri(int appStore, String paramName) {
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        switch (appStore) {
            case 0:
                return INSTANCE.formUri(AMAZON_APPSTORE_WEB, paramName);
            case 1:
                return INSTANCE.formUri(APPLE_APP_STORE_WEB, paramName);
            case 2:
                return INSTANCE.formUri(CAFE_BAZAAR_WEB, paramName);
            case 3:
                return INSTANCE.formUri(BLACKBERRY_WORLD_WEB, paramName);
            case 4:
                return null;
            case 5:
            default:
                return INSTANCE.formUri(GOOGLE_PLAY_WEB, paramName);
            case 6:
                return INSTANCE.formUri(MI_APPSTORE_WEB, paramName);
            case 7:
                return INSTANCE.formUri(SAMSUNG_GALAXY_APPS_WEB, paramName);
            case 8:
                return INSTANCE.formUri(SLIDEME_MARKETPLACE_WEB, paramName);
            case 9:
                return INSTANCE.formUri(TENCENT_APP_STORE_WEB, paramName);
            case 10:
                return INSTANCE.formUri(YANDEX_STORE_WEB, paramName);
        }
    }
}
