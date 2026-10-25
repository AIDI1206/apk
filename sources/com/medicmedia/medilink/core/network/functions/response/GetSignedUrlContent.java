package com.medicmedia.medilink.core.network.functions.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SignedUrlResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/response/GetSignedUrlContent;", "", "contentId", "", "contentVersion", "fileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getContentVersion", "getFileName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class GetSignedUrlContent {
    private final String contentId;
    private final String contentVersion;
    private final String fileName;

    public static /* synthetic */ GetSignedUrlContent copy$default(GetSignedUrlContent getSignedUrlContent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getSignedUrlContent.contentId;
        }
        if ((i & 2) != 0) {
            str2 = getSignedUrlContent.contentVersion;
        }
        if ((i & 4) != 0) {
            str3 = getSignedUrlContent.fileName;
        }
        return getSignedUrlContent.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentVersion() {
        return this.contentVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    public final GetSignedUrlContent copy(String contentId, String contentVersion, String fileName) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(contentVersion, "contentVersion");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new GetSignedUrlContent(contentId, contentVersion, fileName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSignedUrlContent)) {
            return false;
        }
        GetSignedUrlContent getSignedUrlContent = (GetSignedUrlContent) other;
        return Intrinsics.areEqual(this.contentId, getSignedUrlContent.contentId) && Intrinsics.areEqual(this.contentVersion, getSignedUrlContent.contentVersion) && Intrinsics.areEqual(this.fileName, getSignedUrlContent.fileName);
    }

    public int hashCode() {
        return (((this.contentId.hashCode() * 31) + this.contentVersion.hashCode()) * 31) + this.fileName.hashCode();
    }

    public String toString() {
        return "GetSignedUrlContent(contentId=" + this.contentId + ", contentVersion=" + this.contentVersion + ", fileName=" + this.fileName + ")";
    }

    public GetSignedUrlContent(String contentId, String contentVersion, String fileName) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(contentVersion, "contentVersion");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.contentId = contentId;
        this.contentVersion = contentVersion;
        this.fileName = fileName;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final String getContentVersion() {
        return this.contentVersion;
    }

    public final String getFileName() {
        return this.fileName;
    }
}
