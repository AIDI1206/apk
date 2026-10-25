package com.medicmedia.medilink.core.network.api.interceptor;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.QueryParameterKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ResponseErrorInterceptor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/interceptor/ErrorPayload;", "", QueryParameterKey.CODE, "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ErrorPayload {
    private final String code;
    private final String message;

    public static /* synthetic */ ErrorPayload copy$default(ErrorPayload errorPayload, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = errorPayload.code;
        }
        if ((i & 2) != 0) {
            str2 = errorPayload.message;
        }
        return errorPayload.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final ErrorPayload copy(String code, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new ErrorPayload(code, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorPayload)) {
            return false;
        }
        ErrorPayload errorPayload = (ErrorPayload) other;
        return Intrinsics.areEqual(this.code, errorPayload.code) && Intrinsics.areEqual(this.message, errorPayload.message);
    }

    public int hashCode() {
        String str = this.code;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "ErrorPayload(code=" + this.code + ", message=" + this.message + ")";
    }

    public ErrorPayload(String str, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = str;
        this.message = message;
    }

    public /* synthetic */ ErrorPayload(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }
}
