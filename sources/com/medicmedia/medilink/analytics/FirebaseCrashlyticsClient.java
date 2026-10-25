package com.medicmedia.medilink.analytics;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.crashlytics.CustomKeysAndValues;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CrashAnalyticsClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/analytics/FirebaseCrashlyticsClient;", "Lcom/medicmedia/medilink/analytics/CrashAnalyticsClient;", "firebaseCrashlytics", "Lcom/google/firebase/crashlytics/FirebaseCrashlytics;", "<init>", "(Lcom/google/firebase/crashlytics/FirebaseCrashlytics;)V", "recordException", "", "throwable", "", "keyValues", "", "", "", "setUserId", "id", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class FirebaseCrashlyticsClient implements CrashAnalyticsClient {
    private final FirebaseCrashlytics firebaseCrashlytics;

    @Inject
    public FirebaseCrashlyticsClient(FirebaseCrashlytics firebaseCrashlytics) {
        Intrinsics.checkNotNullParameter(firebaseCrashlytics, "firebaseCrashlytics");
        this.firebaseCrashlytics = firebaseCrashlytics;
    }

    @Override // com.medicmedia.medilink.analytics.CrashAnalyticsClient
    public void recordException(Throwable throwable, Map<String, ? extends Object> keyValues) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(keyValues, "keyValues");
        CustomKeysAndValues.Builder builder = new CustomKeysAndValues.Builder();
        for (Map.Entry<String, ? extends Object> entry : keyValues.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                builder.putString(entry.getKey(), (String) value);
            } else if (value instanceof Integer) {
                builder.putInt(entry.getKey(), ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                builder.putBoolean(entry.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof Float) {
                builder.putFloat(entry.getKey(), ((Number) value).floatValue());
            } else if (value instanceof Long) {
                builder.putLong(entry.getKey(), ((Number) value).longValue());
            } else if (value instanceof Double) {
                builder.putDouble(entry.getKey(), ((Number) value).doubleValue());
            }
        }
        this.firebaseCrashlytics.recordException(throwable, builder.build());
    }

    @Override // com.medicmedia.medilink.analytics.CrashAnalyticsClient
    public void setUserId(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.firebaseCrashlytics.setUserId(id);
    }
}
