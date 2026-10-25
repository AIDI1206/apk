package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.medicmedia.medilink.domain.QueryParameterKey;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiErrorResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$ErrorResponse;", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$ErrorResponse;", "ErrorResponse", "Details", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface AccountsApiErrorInterface {
    ErrorResponse getError();

    /* JADX INFO: compiled from: ApiErrorResponse.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$ErrorResponse;", "", "message", "", QueryParameterKey.CODE, "details", "", "Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$Details;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMessage", "()Ljava/lang/String;", "getCode", "getDetails", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ErrorResponse {
        private final String code;
        private final List<Details> details;
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, String str, String str2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorResponse.message;
            }
            if ((i & 2) != 0) {
                str2 = errorResponse.code;
            }
            if ((i & 4) != 0) {
                list = errorResponse.details;
            }
            return errorResponse.copy(str, str2, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        public final List<Details> component3() {
            return this.details;
        }

        public final ErrorResponse copy(String message, String code, List<Details> details) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(details, "details");
            return new ErrorResponse(message, code, details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorResponse)) {
                return false;
            }
            ErrorResponse errorResponse = (ErrorResponse) other;
            return Intrinsics.areEqual(this.message, errorResponse.message) && Intrinsics.areEqual(this.code, errorResponse.code) && Intrinsics.areEqual(this.details, errorResponse.details);
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + this.code.hashCode()) * 31) + this.details.hashCode();
        }

        public String toString() {
            return "ErrorResponse(message=" + this.message + ", code=" + this.code + ", details=" + this.details + ")";
        }

        public ErrorResponse(String message, String code, List<Details> details) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(details, "details");
            this.message = message;
            this.code = code;
            this.details = details;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getCode() {
            return this.code;
        }

        public final List<Details> getDetails() {
            return this.details;
        }
    }

    /* JADX INFO: compiled from: ApiErrorResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$Details;", "", "messageDetail", "", "<init>", "(Ljava/lang/String;)V", "getMessageDetail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Details {
        private final String messageDetail;

        public static /* synthetic */ Details copy$default(Details details, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = details.messageDetail;
            }
            return details.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessageDetail() {
            return this.messageDetail;
        }

        public final Details copy(@Json(name = "message_detail") String messageDetail) {
            Intrinsics.checkNotNullParameter(messageDetail, "messageDetail");
            return new Details(messageDetail);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Details) && Intrinsics.areEqual(this.messageDetail, ((Details) other).messageDetail);
        }

        public int hashCode() {
            return this.messageDetail.hashCode();
        }

        public String toString() {
            return "Details(messageDetail=" + this.messageDetail + ")";
        }

        public Details(@Json(name = "message_detail") String messageDetail) {
            Intrinsics.checkNotNullParameter(messageDetail, "messageDetail");
            this.messageDetail = messageDetail;
        }

        public final String getMessageDetail() {
            return this.messageDetail;
        }
    }
}
