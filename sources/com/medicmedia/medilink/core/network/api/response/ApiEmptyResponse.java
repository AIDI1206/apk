package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

/* JADX INFO: compiled from: ApiResponseInterface.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/ApiEmptyResponse;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "<init>", "(Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;)V", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class ApiEmptyResponse implements ApiResponseErrorInterface {
    private final ApiResponseErrorInterface.ErrorResponse error;

    public ApiEmptyResponse(ApiResponseErrorInterface.ErrorResponse errorResponse) {
        this.error = errorResponse;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseErrorInterface
    public ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }
}
