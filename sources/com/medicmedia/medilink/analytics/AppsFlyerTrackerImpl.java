package com.medicmedia.medilink.analytics;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import dagger.hilt.android.qualifiers.ApplicationContext;
import io.reactivex.subjects.PublishSubject;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppsFlyerTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Singleton
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/analytics/AppsFlyerTrackerImpl;", "Lcom/medicmedia/medilink/analytics/AppsFlyerTracker;", "context", "Landroid/content/Context;", "appsFlyer", "Lcom/appsflyer/AppsFlyerLib;", "<init>", "(Landroid/content/Context;Lcom/appsflyer/AppsFlyerLib;)V", "tag", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "deepLinkSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/appsflyer/deeplink/DeepLink;", "init", "", "subscribeForOneLink", "performOnDeepLinking", "intent", "Landroid/content/Intent;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class AppsFlyerTrackerImpl implements AppsFlyerTracker {
    private final AppsFlyerLib appsFlyer;
    private final Context context;
    private final PublishSubject<DeepLink> deepLinkSubject;
    private final String tag;

    /* JADX INFO: compiled from: AppsFlyerTracker.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeepLinkResult.Status.values().length];
            try {
                iArr[DeepLinkResult.Status.FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeepLinkResult.Status.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public AppsFlyerTrackerImpl(@ApplicationContext Context context, AppsFlyerLib appsFlyer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appsFlyer, "appsFlyer");
        this.context = context;
        this.appsFlyer = appsFlyer;
        this.tag = AppsFlyerTrackerImpl.class.getName();
        PublishSubject<DeepLink> publishSubjectCreate = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(publishSubjectCreate, "create(...)");
        this.deepLinkSubject = publishSubjectCreate;
    }

    @Override // com.medicmedia.medilink.analytics.AppsFlyerTracker
    public void init() {
        this.appsFlyer.init(BuildConfig.APPSFLYER_DEV_KEY, new AppsFlyerConversionListener() { // from class: com.medicmedia.medilink.analytics.AppsFlyerTrackerImpl.init.1
            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataSuccess(Map<String, Object> data) {
                Log.d(AppsFlyerTrackerImpl.this.tag, "Conversion data: " + data);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onConversionDataFail(String error) {
                if (error != null) {
                    FirebaseCrashlytics.getInstance().recordException(new Exception(error));
                }
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAppOpenAttribution(Map<String, String> data) {
                Log.d(AppsFlyerTrackerImpl.this.tag, "App Open Attribution: " + data);
            }

            @Override // com.appsflyer.AppsFlyerConversionListener
            public void onAttributionFailure(String error) {
                if (error != null) {
                    FirebaseCrashlytics.getInstance().recordException(new Exception(error));
                }
            }
        }, this.context);
        this.appsFlyer.setDebugLog(false);
        this.appsFlyer.subscribeForDeepLink(new DeepLinkListener() { // from class: com.medicmedia.medilink.analytics.AppsFlyerTrackerImpl$$ExternalSyntheticLambda0
            @Override // com.appsflyer.deeplink.DeepLinkListener
            public final void onDeepLinking(DeepLinkResult deepLinkResult) {
                AppsFlyerTrackerImpl.init$lambda$0(this.f$0, deepLinkResult);
            }
        });
        this.appsFlyer.start(this.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(AppsFlyerTrackerImpl appsFlyerTrackerImpl, DeepLinkResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        int i = WhenMappings.$EnumSwitchMapping$0[result.getStatus().ordinal()];
        if (i == 1) {
            appsFlyerTrackerImpl.deepLinkSubject.onNext(result.getDeepLink());
        } else {
            if (i != 2) {
                return;
            }
            DeepLinkResult.Error error = result.getError();
            Intrinsics.checkNotNullExpressionValue(error, "getError(...)");
            appsFlyerTrackerImpl.deepLinkSubject.onError(AppsFlyerTrackerKt.convertToException(error, appsFlyerTrackerImpl.context));
        }
    }

    @Override // com.medicmedia.medilink.analytics.AppsFlyerTracker
    public PublishSubject<DeepLink> subscribeForOneLink() {
        return this.deepLinkSubject;
    }

    @Override // com.medicmedia.medilink.analytics.AppsFlyerTracker
    public void performOnDeepLinking(Intent intent, Context context) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(context, "context");
        this.appsFlyer.performOnDeepLinking(intent, context);
    }
}
