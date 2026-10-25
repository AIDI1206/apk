package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.datastore.preferences.LoginPreferencesKey;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiErrorResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorExtraInterface;", "", "errorExtra", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorExtraInterface$ErrorExtraResponse;", "getErrorExtra$annotations", "()V", "getErrorExtra", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorExtraInterface$ErrorExtraResponse;", "ErrorExtraResponse", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface ApiResponseErrorExtraInterface {

    /* JADX INFO: compiled from: ApiErrorResponse.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Json(name = "error_extra")
        public static /* synthetic */ void getErrorExtra$annotations() {
        }
    }

    ErrorExtraResponse getErrorExtra();

    /* JADX INFO: compiled from: ApiErrorResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorExtraInterface$ErrorExtraResponse;", "", "tokenRefresh", "", "<init>", "(Ljava/lang/String;)V", "getTokenRefresh", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ErrorExtraResponse {
        private final String tokenRefresh;

        public static /* synthetic */ ErrorExtraResponse copy$default(ErrorExtraResponse errorExtraResponse, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorExtraResponse.tokenRefresh;
            }
            return errorExtraResponse.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTokenRefresh() {
            return this.tokenRefresh;
        }

        public final ErrorExtraResponse copy(@Json(name = LoginPreferencesKey.COGNITO_TOKEN_REFRESH) String tokenRefresh) {
            return new ErrorExtraResponse(tokenRefresh);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorExtraResponse) && Intrinsics.areEqual(this.tokenRefresh, ((ErrorExtraResponse) other).tokenRefresh);
        }

        public int hashCode() {
            String str = this.tokenRefresh;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "ErrorExtraResponse(tokenRefresh=" + this.tokenRefresh + ")";
        }

        public ErrorExtraResponse(@Json(name = LoginPreferencesKey.COGNITO_TOKEN_REFRESH) String str) {
            this.tokenRefresh = str;
        }

        public final String getTokenRefresh() {
            return this.tokenRefresh;
        }
    }
}
