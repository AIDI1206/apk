package com.medicmedia.medilink.analytics.di;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.medicmedia.medilink.analytics.AnalyticsClient;
import com.medicmedia.medilink.analytics.AppsFlyerTracker;
import com.medicmedia.medilink.analytics.AppsFlyerTrackerImpl;
import com.medicmedia.medilink.analytics.CrashAnalyticsClient;
import com.medicmedia.medilink.analytics.FirebaseAnalyticsClient;
import com.medicmedia.medilink.analytics.FirebaseCrashlyticsClient;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AnalyticsModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\r\u001a\u00020\u000eH\u0007J\u001a\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u000eH\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/analytics/di/AnalyticsModule;", "", "<init>", "()V", "provideAnalytics", "Lcom/medicmedia/medilink/analytics/AnalyticsClient;", "context", "Landroid/content/Context;", "crashAnalyticsClient", "Lcom/medicmedia/medilink/analytics/CrashAnalyticsClient;", "loginDataStore", "Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;", "provideCrashAnalytics", "provideAppsFlyerLib", "Lcom/appsflyer/AppsFlyerLib;", "provideAppsFlyerTracker", "Lcom/medicmedia/medilink/analytics/AppsFlyerTracker;", "appsFlyerLib", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
public final class AnalyticsModule {
    public static final AnalyticsModule INSTANCE = new AnalyticsModule();

    private AnalyticsModule() {
    }

    @Provides
    @Singleton
    public final AnalyticsClient provideAnalytics(@ApplicationContext Context context, CrashAnalyticsClient crashAnalyticsClient, LoginDataStore loginDataStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(crashAnalyticsClient, "crashAnalyticsClient");
        Intrinsics.checkNotNullParameter(loginDataStore, "loginDataStore");
        if (FirebaseApp.getApps(context).isEmpty()) {
            FirebaseApp.initializeApp(context);
        }
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
        return new FirebaseAnalyticsClient(firebaseAnalytics, crashAnalyticsClient, loginDataStore);
    }

    @Provides
    @Singleton
    public final CrashAnalyticsClient provideCrashAnalytics(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (FirebaseApp.getApps(context).isEmpty()) {
            FirebaseApp.initializeApp(context);
        }
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
        return new FirebaseCrashlyticsClient(firebaseCrashlytics);
    }

    @Provides
    @Singleton
    public final AppsFlyerLib provideAppsFlyerLib() {
        AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
        Intrinsics.checkNotNullExpressionValue(appsFlyerLib, "getInstance(...)");
        return appsFlyerLib;
    }

    @Provides
    @Singleton
    public final AppsFlyerTracker provideAppsFlyerTracker(@ApplicationContext Context context, AppsFlyerLib appsFlyerLib) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appsFlyerLib, "appsFlyerLib");
        return new AppsFlyerTrackerImpl(context, appsFlyerLib);
    }
}
