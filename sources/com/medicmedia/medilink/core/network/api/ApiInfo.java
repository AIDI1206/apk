package com.medicmedia.medilink.core.network.api;

import android.util.Base64;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: ApiInfo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/ApiInfo;", "", "<init>", "()V", "Companion", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ApiInfo {
    public static final String ACCOUNTS_URL = "https://accounts.medilink-study.com/api/";
    public static final String BARISTA_CALLBACK = "medilinkclient://auth_callback";
    private static final String BARISTA_CLIENT = "medilink-app-client";
    private static final String BARISTA_SECRET = "htRYVX3ifBkJw7GeYhDbkJRGLYnpKAwa2sLwVHqm";
    public static final String BARISTA_URL = "https://login.medilink-study.com/";
    public static final String CONTENTS_LOGIN_URL = "https://card.medilink-study.com/medilink/";
    public static final String PDF_URL = "https://dw76ea4d7raa4ctvyrtyzlda3a0wzhbu.lambda-url.ap-northeast-1.on.aws";
    public static final String SEARCH_URL = "https://search.medilink-study.com/";
    public static final String STORE_URL = "https://app.medilink-study.com/";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String baristaClaims = "{\"userinfo\":{\"sub\": {\"essential\": true},\"given_name\": {\"essential\": true},\"nickname\": null,\"email\": {\"essential\": true},\"member_id\": {\"essential\": true},\"job_category_id\": null,\"college_id\": null,\"college_grade\": null,\"college_department_id\": null,\"college_year\": null,\"picture\": null}}";

    /* JADX INFO: compiled from: ApiInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/ApiInfo$Companion;", "", "<init>", "()V", "BARISTA_URL", "", "ACCOUNTS_URL", "STORE_URL", "SEARCH_URL", "CONTENTS_LOGIN_URL", "PDF_URL", "BARISTA_CALLBACK", "BARISTA_CLIENT", "BARISTA_SECRET", "base64EncodedBasic", "getBase64EncodedBasic", "()Ljava/lang/String;", "baristaClaims", "getBaristaClaims", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getBase64EncodedBasic() {
            byte[] bytes = "medilink-app-client:htRYVX3ifBkJw7GeYhDbkJRGLYnpKAwa2sLwVHqm".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return "Basic " + Base64.encodeToString(bytes, 2);
        }

        public final String getBaristaClaims() {
            return ApiInfo.baristaClaims;
        }
    }
}
