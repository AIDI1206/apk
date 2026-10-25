package com.medicmedia.medilink.core.network.functions.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SignedUrlResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/response/SignedUrlsApiResponse;", "", NotificationCompat.CATEGORY_STATUS, "", "signedUrls", "", "Lcom/medicmedia/medilink/core/network/functions/response/SignedUrlsApiResponseItem;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "<init>", "(ILjava/util/List;Ljava/lang/String;)V", "getStatus", "()I", "getSignedUrls", "()Ljava/util/List;", "getError", "()Ljava/lang/String;", "Companion", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SignedUrlsApiResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String error;
    private final List<SignedUrlsApiResponseItem> signedUrls;
    private final int status;

    public SignedUrlsApiResponse(int i, List<SignedUrlsApiResponseItem> list, String str) {
        this.status = i;
        this.signedUrls = list;
        this.error = str;
    }

    public final int getStatus() {
        return this.status;
    }

    public final List<SignedUrlsApiResponseItem> getSignedUrls() {
        return this.signedUrls;
    }

    public final String getError() {
        return this.error;
    }

    /* JADX INFO: compiled from: SignedUrlResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¨\u0006\u0007"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/response/SignedUrlsApiResponse$Companion;", "", "<init>", "()V", "fromJson", "Lcom/medicmedia/medilink/core/network/functions/response/SignedUrlsApiResponse;", "data", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SignedUrlsApiResponse fromJson(Object data) {
            Object objFromJson = new Gson().fromJson(new Gson().toJson(data), (Class<Object>) SignedUrlsApiResponse.class);
            Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
            return (SignedUrlsApiResponse) objFromJson;
        }
    }
}
