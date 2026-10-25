package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.FirebasePerformance;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: NetworkTransport.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J<\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u000bH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/NetworkTransport;", "", "authorizationHeaderName", "", "getAuthorizationHeaderName", "()Ljava/lang/String;", "customHeaders", "", "getCustomHeaders", "()Ljava/util/Map;", "sendRequest", "", FirebaseAnalytics.Param.METHOD, "url", "headers", "body", "callback", "Lio/realm/kotlin/internal/interop/sync/ResponseCallback;", "close", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface NetworkTransport {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String DELETE = "delete";
    public static final String GET = "get";
    public static final String PATCH = "patch";
    public static final String POST = "post";
    public static final String PUT = "put";

    void close();

    String getAuthorizationHeaderName();

    Map<String, String> getCustomHeaders();

    void sendRequest(String method, String url, Map<String, String> headers, String body, ResponseCallback callback);

    /* JADX INFO: compiled from: NetworkTransport.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/NetworkTransport$Companion;", "", "<init>", "()V", "GET", "", "POST", "PATCH", FirebasePerformance.HttpMethod.PUT, FirebasePerformance.HttpMethod.DELETE, "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String DELETE = "delete";
        public static final String GET = "get";
        public static final String PATCH = "patch";
        public static final String POST = "post";
        public static final String PUT = "put";

        private Companion() {
        }
    }
}
