package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PdfUrlResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/PdfUrlResponse;", "", "viewerUrl", "", "timestamp", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getViewerUrl", "()Ljava/lang/String;", "getTimestamp", "getError", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class PdfUrlResponse {
    private final String error;
    private final String timestamp;
    private final String viewerUrl;

    public static /* synthetic */ PdfUrlResponse copy$default(PdfUrlResponse pdfUrlResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pdfUrlResponse.viewerUrl;
        }
        if ((i & 2) != 0) {
            str2 = pdfUrlResponse.timestamp;
        }
        if ((i & 4) != 0) {
            str3 = pdfUrlResponse.error;
        }
        return pdfUrlResponse.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getViewerUrl() {
        return this.viewerUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final PdfUrlResponse copy(@Json(name = "viewer_url") String viewerUrl, String timestamp, String error) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return new PdfUrlResponse(viewerUrl, timestamp, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PdfUrlResponse)) {
            return false;
        }
        PdfUrlResponse pdfUrlResponse = (PdfUrlResponse) other;
        return Intrinsics.areEqual(this.viewerUrl, pdfUrlResponse.viewerUrl) && Intrinsics.areEqual(this.timestamp, pdfUrlResponse.timestamp) && Intrinsics.areEqual(this.error, pdfUrlResponse.error);
    }

    public int hashCode() {
        String str = this.viewerUrl;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.timestamp.hashCode()) * 31;
        String str2 = this.error;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "PdfUrlResponse(viewerUrl=" + this.viewerUrl + ", timestamp=" + this.timestamp + ", error=" + this.error + ")";
    }

    public PdfUrlResponse(@Json(name = "viewer_url") String str, String timestamp, String str2) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.viewerUrl = str;
        this.timestamp = timestamp;
        this.error = str2;
    }

    public final String getViewerUrl() {
        return this.viewerUrl;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getError() {
        return this.error;
    }
}
