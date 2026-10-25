package com.medicmedia.medilink.core.network.functions.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SignedUrlResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/response/SignedUrlsApiResponseItem;", "", "contentId", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SignedUrlsApiResponseItem {
    private final String contentId;
    private final String url;

    public static /* synthetic */ SignedUrlsApiResponseItem copy$default(SignedUrlsApiResponseItem signedUrlsApiResponseItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signedUrlsApiResponseItem.contentId;
        }
        if ((i & 2) != 0) {
            str2 = signedUrlsApiResponseItem.url;
        }
        return signedUrlsApiResponseItem.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final SignedUrlsApiResponseItem copy(String contentId, String url) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(url, "url");
        return new SignedUrlsApiResponseItem(contentId, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignedUrlsApiResponseItem)) {
            return false;
        }
        SignedUrlsApiResponseItem signedUrlsApiResponseItem = (SignedUrlsApiResponseItem) other;
        return Intrinsics.areEqual(this.contentId, signedUrlsApiResponseItem.contentId) && Intrinsics.areEqual(this.url, signedUrlsApiResponseItem.url);
    }

    public int hashCode() {
        return (this.contentId.hashCode() * 31) + this.url.hashCode();
    }

    public String toString() {
        return "SignedUrlsApiResponseItem(contentId=" + this.contentId + ", url=" + this.url + ")";
    }

    public SignedUrlsApiResponseItem(String contentId, String url) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(url, "url");
        this.contentId = contentId;
        this.url = url;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getUrl() {
        return this.url;
    }
}
