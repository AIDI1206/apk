package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiErrorResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ApiErrorResponse;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorExtraInterface;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "errorExtra", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorExtraInterface$ErrorExtraResponse;", "<init>", "(Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorExtraInterface$ErrorExtraResponse;)V", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "getErrorExtra", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorExtraInterface$ErrorExtraResponse;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ApiErrorResponse implements ApiResponseErrorInterface, ApiResponseErrorExtraInterface {
    private final ApiResponseErrorInterface.ErrorResponse error;
    private final ApiResponseErrorExtraInterface.ErrorExtraResponse errorExtra;

    public static /* synthetic */ ApiErrorResponse copy$default(ApiErrorResponse apiErrorResponse, ApiResponseErrorInterface.ErrorResponse errorResponse, ApiResponseErrorExtraInterface.ErrorExtraResponse errorExtraResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            errorResponse = apiErrorResponse.error;
        }
        if ((i & 2) != 0) {
            errorExtraResponse = apiErrorResponse.errorExtra;
        }
        return apiErrorResponse.copy(errorResponse, errorExtraResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ApiResponseErrorExtraInterface.ErrorExtraResponse getErrorExtra() {
        return this.errorExtra;
    }

    public final ApiErrorResponse copy(ApiResponseErrorInterface.ErrorResponse error, @Json(name = "error_extra") ApiResponseErrorExtraInterface.ErrorExtraResponse errorExtra) {
        return new ApiErrorResponse(error, errorExtra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiErrorResponse)) {
            return false;
        }
        ApiErrorResponse apiErrorResponse = (ApiErrorResponse) other;
        return Intrinsics.areEqual(this.error, apiErrorResponse.error) && Intrinsics.areEqual(this.errorExtra, apiErrorResponse.errorExtra);
    }

    public int hashCode() {
        ApiResponseErrorInterface.ErrorResponse errorResponse = this.error;
        int iHashCode = (errorResponse == null ? 0 : errorResponse.hashCode()) * 31;
        ApiResponseErrorExtraInterface.ErrorExtraResponse errorExtraResponse = this.errorExtra;
        return iHashCode + (errorExtraResponse != null ? errorExtraResponse.hashCode() : 0);
    }

    public String toString() {
        return "ApiErrorResponse(error=" + this.error + ", errorExtra=" + this.errorExtra + ")";
    }

    public ApiErrorResponse(ApiResponseErrorInterface.ErrorResponse errorResponse, @Json(name = "error_extra") ApiResponseErrorExtraInterface.ErrorExtraResponse errorExtraResponse) {
        this.error = errorResponse;
        this.errorExtra = errorExtraResponse;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseErrorInterface
    public ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseErrorExtraInterface
    public ApiResponseErrorExtraInterface.ErrorExtraResponse getErrorExtra() {
        return this.errorExtra;
    }
}
