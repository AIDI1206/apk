package com.medicmedia.medilink.analytics;

import android.content.Context;
import android.content.Intent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.deeplink.DeepLink;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppsFlyerTracker.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/analytics/AppsFlyerTracker;", "", "init", "", "subscribeForOneLink", "Lio/reactivex/subjects/PublishSubject;", "Lcom/appsflyer/deeplink/DeepLink;", "performOnDeepLinking", "intent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface AppsFlyerTracker {
    void init();

    void performOnDeepLinking(Intent intent, Context context);

    PublishSubject<DeepLink> subscribeForOneLink();
}
