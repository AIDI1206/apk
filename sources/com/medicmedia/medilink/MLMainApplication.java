package com.medicmedia.medilink;

import android.app.Activity;
import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewDatabase;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.stetho.Stetho;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreSettings;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.medicmedia.medilink.domain.usecase.DeepLinkUseCase;
import com.medicmedia.medilink.domain.usecase.LaunchUseCase;
import com.medicmedia.medilink.domain.usecase.ThreatDetectionUseCase;
import com.medicmedia.medilink.domain.usecase.VideoUseCase;
import dagger.hilt.android.HiltAndroidApp;
import javax.inject.Inject;

/* JADX INFO: loaded from: classes6.dex */
@HiltAndroidApp
public class MLMainApplication extends Hilt_MLMainApplication {
    public static String NOTIFICATION_CHANNEL_ID = "NOTIFICATION_CHANNEL_ID";
    private static final String TAG = "MM-APPLICATION";
    public static boolean is_not_launch = false;
    public static FirebaseAnalytics mFirebaseAnalytics;
    private Activity currentActivity = null;

    @Inject
    DeepLinkUseCase deepLinkUseCase;

    @Inject
    LaunchUseCase launchUseCase;

    @Inject
    ThreatDetectionUseCase threatDetectionUseCase;

    @Inject
    VideoUseCase videoUseCase;

    @Override // com.medicmedia.medilink.Hilt_MLMainApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        this.threatDetectionUseCase.isThreatDetected();
        this.threatDetectionUseCase.observeThreatDetected(new Runnable() { // from class: com.medicmedia.medilink.MLMainApplication$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m10007lambda$onCreate$1$commedicmediamedilinkMLMainApplication();
            }
        });
        WebViewDatabase.getInstance(this).clearHttpAuthUsernamePassword();
        if (!FirebaseApp.getApps(this).isEmpty()) {
            FirebaseMessaging.getInstance().subscribeToTopic(TtmlNode.COMBINE_ALL);
            mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
            Log.v(TAG, "firebase success");
        } else {
            Log.v(TAG, "firebase failed");
        }
        FirebaseFirestore.getInstance().setFirestoreSettings(new FirebaseFirestoreSettings.Builder().build());
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        firebaseRemoteConfig.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(3600L).build());
        firebaseRemoteConfig.setDefaultsAsync(R.xml.remote_config_defaults);
        this.deepLinkUseCase.initTracker();
        Stetho.initializeWithDefaults(this);
        ApplicationInfo applicationInfo = getApplicationInfo();
        int i = applicationInfo.flags & 2;
        applicationInfo.flags = i;
        if (i != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        registerActivityLifecycle();
    }

    /* JADX INFO: renamed from: lambda$onCreate$1$com-medicmedia-medilink-MLMainApplication, reason: not valid java name */
    /* synthetic */ void m10007lambda$onCreate$1$commedicmediamedilinkMLMainApplication() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.medicmedia.medilink.MLMainApplication$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m10006lambda$onCreate$0$commedicmediamedilinkMLMainApplication();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onCreate$0$com-medicmedia-medilink-MLMainApplication, reason: not valid java name */
    /* synthetic */ void m10006lambda$onCreate$0$commedicmediamedilinkMLMainApplication() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            showThreatDetectedDialog(currentActivity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldForcedUpdate() {
        return this.launchUseCase.shouldForcedUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showForceUpdateDialog(Activity activity) {
        showDialog(activity, AppUpdateDialog.newInstance(), "SplashActivity_showForceUpdateIfNeeded");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showThreatDetectedDialog(Activity activity) {
        showDialog(activity, ThreatDetectedDialogFragment.newInstance(), "SplashActivity_showRootedIfNeeded");
        this.threatDetectionUseCase.recordNonFatalException();
    }

    private void showDialog(Activity activity, TermOfServiceDialog termOfServiceDialog, String str) {
        if (activity instanceof AppCompatActivity) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
            if (appCompatActivity.getSupportFragmentManager().findFragmentByTag(str) != null) {
                return;
            }
            setTheme(R.style.AppTheme_Base);
            termOfServiceDialog.setCancelable(false);
            if (appCompatActivity.isFinishing() || appCompatActivity.isDestroyed()) {
                return;
            }
            termOfServiceDialog.show(appCompatActivity.getSupportFragmentManager(), str);
        }
    }

    private void registerActivityLifecycle() {
        registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.medicmedia.medilink.MLMainApplication.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                if (MLMainApplication.this.threatDetectionUseCase.isThreatDetected()) {
                    MLMainApplication.this.showThreatDetectedDialog(activity);
                } else if (MLMainApplication.this.shouldForcedUpdate()) {
                    MLMainApplication.this.showForceUpdateDialog(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                MLMainApplication.this.currentActivity = activity;
                if (MLMainApplication.this.threatDetectionUseCase.isThreatDetected()) {
                    MLMainApplication.this.showThreatDetectedDialog(activity);
                } else if (MLMainApplication.this.shouldForcedUpdate()) {
                    MLMainApplication.this.showForceUpdateDialog(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (MLMainApplication.this.currentActivity == activity) {
                    MLMainApplication.this.currentActivity = null;
                }
            }
        });
    }

    public Activity getCurrentActivity() {
        return this.currentActivity;
    }
}
