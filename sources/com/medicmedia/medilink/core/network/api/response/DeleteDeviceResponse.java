package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DeleteDeviceResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/DeleteDeviceResponse;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface;", "result", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "<init>", "(Ljava/lang/String;Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;)V", "getResult", "()Ljava/lang/String;", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DeleteDeviceResponse implements ApiResponseErrorInterface {
    private final ApiResponseErrorInterface.ErrorResponse error;
    private final String result;

    public static /* synthetic */ DeleteDeviceResponse copy$default(DeleteDeviceResponse deleteDeviceResponse, String str, ApiResponseErrorInterface.ErrorResponse errorResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deleteDeviceResponse.result;
        }
        if ((i & 2) != 0) {
            errorResponse = deleteDeviceResponse.error;
        }
        return deleteDeviceResponse.copy(str, errorResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    public final DeleteDeviceResponse copy(String result, ApiResponseErrorInterface.ErrorResponse error) {
        return new DeleteDeviceResponse(result, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteDeviceResponse)) {
            return false;
        }
        DeleteDeviceResponse deleteDeviceResponse = (DeleteDeviceResponse) other;
        return Intrinsics.areEqual(this.result, deleteDeviceResponse.result) && Intrinsics.areEqual(this.error, deleteDeviceResponse.error);
    }

    public int hashCode() {
        String str = this.result;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ApiResponseErrorInterface.ErrorResponse errorResponse = this.error;
        return iHashCode + (errorResponse != null ? errorResponse.hashCode() : 0);
    }

    public String toString() {
        return "DeleteDeviceResponse(result=" + this.result + ", error=" + this.error + ")";
    }

    public DeleteDeviceResponse(String str, ApiResponseErrorInterface.ErrorResponse errorResponse) {
        this.result = str;
        this.error = errorResponse;
    }

    public final String getResult() {
        return this.result;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseErrorInterface
    public ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }
}
