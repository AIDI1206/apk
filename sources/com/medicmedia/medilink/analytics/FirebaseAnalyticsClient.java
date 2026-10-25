package com.medicmedia.medilink.analytics;

import android.os.Build;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.datastore.model.BookShelfSortType;
import com.medicmedia.medilink.datastore.model.ContinuousCheckModeLayoutType;
import com.medicmedia.medilink.datastore.preferences.LoginDataStore;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: AnalyticsClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J$\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u000bH\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0002J\b\u0010\u0017\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/analytics/FirebaseAnalyticsClient;", "Lcom/medicmedia/medilink/analytics/AnalyticsClient;", "firebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "crashAnalyticsClient", "Lcom/medicmedia/medilink/analytics/CrashAnalyticsClient;", "loginDataStore", "Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;", "<init>", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Lcom/medicmedia/medilink/analytics/CrashAnalyticsClient;Lcom/medicmedia/medilink/datastore/preferences/LoginDataStore;)V", "setUserId", "", "userId", "", "logEvent", "name", "params", "", "", "buildBaseParams", "Landroid/os/Bundle;", "setUserProperty", "setSortTypeUserProperty", "setCheckModeButtonLayoutProperty", "UserPropertyKey", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class FirebaseAnalyticsClient implements AnalyticsClient {
    private final CrashAnalyticsClient crashAnalyticsClient;
    private final FirebaseAnalytics firebaseAnalytics;
    private final LoginDataStore loginDataStore;

    /* JADX INFO: compiled from: AnalyticsClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/medicmedia/medilink/analytics/FirebaseAnalyticsClient$UserPropertyKey;", "", "<init>", "()V", "Companion", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class UserPropertyKey {
        public static final String BOOK_SHELF_SORT_TYPE = "book_shelf_sort_type";
        public static final String CHECK_MODE_BUTTON_LAYOUT = "check_mode_button_layout";
        public static final String COLLEGE_DEPARTMENT_ID = "college_department_id";
        public static final String COLLEGE_GRADE = "college_grade";
        public static final String COLLEGE_ID = "college_id";
        public static final String JOB_CATEGORY_ID = "job_category_id";
    }

    /* JADX INFO: compiled from: AnalyticsClient.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BookShelfSortType.values().length];
            try {
                iArr[BookShelfSortType.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BookShelfSortType.CATEGORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public FirebaseAnalyticsClient(FirebaseAnalytics firebaseAnalytics, CrashAnalyticsClient crashAnalyticsClient, LoginDataStore loginDataStore) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "firebaseAnalytics");
        Intrinsics.checkNotNullParameter(crashAnalyticsClient, "crashAnalyticsClient");
        Intrinsics.checkNotNullParameter(loginDataStore, "loginDataStore");
        this.firebaseAnalytics = firebaseAnalytics;
        this.crashAnalyticsClient = crashAnalyticsClient;
        this.loginDataStore = loginDataStore;
    }

    @Override // com.medicmedia.medilink.analytics.AnalyticsClient
    public void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.firebaseAnalytics.setUserId(userId);
    }

    @Override // com.medicmedia.medilink.analytics.AnalyticsClient
    public void logEvent(String name, Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(params, "params");
        setUserProperty();
        Bundle bundleBuildBaseParams = buildBaseParams();
        for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                bundleBuildBaseParams.putString(entry.getKey(), (String) value);
            } else if (value instanceof Integer) {
                bundleBuildBaseParams.putInt(entry.getKey(), ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                bundleBuildBaseParams.putBoolean(entry.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof Long) {
                bundleBuildBaseParams.putLong(entry.getKey(), ((Number) value).longValue());
            }
        }
        this.firebaseAnalytics.logEvent(name, bundleBuildBaseParams);
    }

    private final Bundle buildBaseParams() {
        Bundle bundle = new Bundle();
        Integer intOrNull = StringsKt.toIntOrNull(this.loginDataStore.getMediLinkId());
        bundle.putInt("member_id", intOrNull != null ? intOrNull.intValue() : 0);
        bundle.putString("os", "Android");
        bundle.putString("device", Build.MANUFACTURER + "(" + Build.MODEL + ")");
        bundle.putString("app_ver", this.loginDataStore.versionName());
        bundle.putInt("os_ver", Build.VERSION.SDK_INT);
        return bundle;
    }

    private final void setUserProperty() {
        String strUserInfo = this.loginDataStore.userInfo();
        if (strUserInfo == null || strUserInfo.length() <= 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(strUserInfo);
            if (jSONObject.has(UserPropertyKey.JOB_CATEGORY_ID)) {
                this.firebaseAnalytics.setUserProperty(UserPropertyKey.JOB_CATEGORY_ID, jSONObject.getString(UserPropertyKey.JOB_CATEGORY_ID));
            }
            if (jSONObject.has(UserPropertyKey.COLLEGE_GRADE)) {
                this.firebaseAnalytics.setUserProperty(UserPropertyKey.COLLEGE_GRADE, jSONObject.getString(UserPropertyKey.COLLEGE_GRADE));
            }
            if (jSONObject.has(UserPropertyKey.COLLEGE_ID)) {
                this.firebaseAnalytics.setUserProperty(UserPropertyKey.COLLEGE_ID, jSONObject.getString(UserPropertyKey.COLLEGE_ID));
            }
            if (jSONObject.has(UserPropertyKey.COLLEGE_DEPARTMENT_ID)) {
                this.firebaseAnalytics.setUserProperty(UserPropertyKey.COLLEGE_DEPARTMENT_ID, jSONObject.getString(UserPropertyKey.COLLEGE_DEPARTMENT_ID));
            }
            setSortTypeUserProperty();
            setCheckModeButtonLayoutProperty();
        } catch (Exception e) {
            CrashAnalyticsClient.DefaultImpls.recordException$default(this.crashAnalyticsClient, e, null, 2, null);
        }
    }

    private final void setSortTypeUserProperty() {
        String str;
        int i = WhenMappings.$EnumSwitchMapping$0[this.loginDataStore.sortMode().ordinal()];
        if (i == 1) {
            str = "shelf_sort_by_user";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "shelf_sort_by_category";
        }
        this.firebaseAnalytics.setUserProperty(UserPropertyKey.BOOK_SHELF_SORT_TYPE, str);
    }

    private final void setCheckModeButtonLayoutProperty() {
        ContinuousCheckModeLayoutType continuousCheckModeLayoutTypeFindOrNull = ContinuousCheckModeLayoutType.INSTANCE.findOrNull(this.loginDataStore.reviewModeUi());
        if (continuousCheckModeLayoutTypeFindOrNull != null) {
            this.firebaseAnalytics.setUserProperty(UserPropertyKey.CHECK_MODE_BUTTON_LAYOUT, continuousCheckModeLayoutTypeFindOrNull.getValue());
        }
    }
}
