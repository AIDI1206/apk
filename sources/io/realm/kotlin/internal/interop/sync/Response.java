package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NetworkTransport.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0013¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/Response;", "", "httpResponseCode", "", "customResponseCode", "headers", "", "", "body", "<init>", "(IILjava/util/Map;Ljava/lang/String;)V", "getHttpResponseCode", "()I", "getCustomResponseCode", "getHeaders", "()Ljava/util/Map;", "getBody", "()Ljava/lang/String;", "getJNIFriendlyHeaders", "", "()[Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class Response {
    private final String body;
    private final int customResponseCode;
    private final Map<String, String> headers;
    private final int httpResponseCode;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Response copy$default(Response response, int i, int i2, Map map, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = response.httpResponseCode;
        }
        if ((i3 & 2) != 0) {
            i2 = response.customResponseCode;
        }
        if ((i3 & 4) != 0) {
            map = response.headers;
        }
        if ((i3 & 8) != 0) {
            str = response.body;
        }
        return response.copy(i, i2, map, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getHttpResponseCode() {
        return this.httpResponseCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCustomResponseCode() {
        return this.customResponseCode;
    }

    public final Map<String, String> component3() {
        return this.headers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    public final Response copy(int httpResponseCode, int customResponseCode, Map<String, String> headers, String body) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        return new Response(httpResponseCode, customResponseCode, headers, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Response)) {
            return false;
        }
        Response response = (Response) other;
        return this.httpResponseCode == response.httpResponseCode && this.customResponseCode == response.customResponseCode && Intrinsics.areEqual(this.headers, response.headers) && Intrinsics.areEqual(this.body, response.body);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.httpResponseCode) * 31) + Integer.hashCode(this.customResponseCode)) * 31) + this.headers.hashCode()) * 31) + this.body.hashCode();
    }

    public String toString() {
        return "Response(httpResponseCode=" + this.httpResponseCode + ", customResponseCode=" + this.customResponseCode + ", headers=" + this.headers + ", body=" + this.body + ')';
    }

    public Response(int i, int i2, Map<String, String> headers, String body) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        this.httpResponseCode = i;
        this.customResponseCode = i2;
        this.headers = headers;
        this.body = body;
    }

    public final int getHttpResponseCode() {
        return this.httpResponseCode;
    }

    public final int getCustomResponseCode() {
        return this.customResponseCode;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final String getBody() {
        return this.body;
    }

    public final String[] getJNIFriendlyHeaders() {
        String[] strArr = new String[this.headers.size() * 2];
        int i = 0;
        for (Map.Entry<String, String> entry : this.headers.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            strArr[i] = key;
            strArr[i + 1] = value;
            i += 2;
        }
        return strArr;
    }
}
