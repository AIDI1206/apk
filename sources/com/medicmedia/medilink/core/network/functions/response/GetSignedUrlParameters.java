package com.medicmedia.medilink.core.network.functions.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SignedUrlResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/response/GetSignedUrlParameters;", "", "contentId", "", "contentVersion", "fileName", "expiresIn", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getContentId", "()Ljava/lang/String;", "getContentVersion", "getFileName", "getExpiresIn", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class GetSignedUrlParameters {
    private final String contentId;
    private final String contentVersion;
    private final int expiresIn;
    private final String fileName;

    public static /* synthetic */ GetSignedUrlParameters copy$default(GetSignedUrlParameters getSignedUrlParameters, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getSignedUrlParameters.contentId;
        }
        if ((i2 & 2) != 0) {
            str2 = getSignedUrlParameters.contentVersion;
        }
        if ((i2 & 4) != 0) {
            str3 = getSignedUrlParameters.fileName;
        }
        if ((i2 & 8) != 0) {
            i = getSignedUrlParameters.expiresIn;
        }
        return getSignedUrlParameters.copy(str, str2, str3, i);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getExpiresIn() {
        return this.expiresIn;
    }

    public final GetSignedUrlParameters copy(String contentId, String contentVersion, String fileName, int expiresIn) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(contentVersion, "contentVersion");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return new GetSignedUrlParameters(contentId, contentVersion, fileName, expiresIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSignedUrlParameters)) {
            return false;
        }
        GetSignedUrlParameters getSignedUrlParameters = (GetSignedUrlParameters) other;
        return Intrinsics.areEqual(this.contentId, getSignedUrlParameters.contentId) && Intrinsics.areEqual(this.contentVersion, getSignedUrlParameters.contentVersion) && Intrinsics.areEqual(this.fileName, getSignedUrlParameters.fileName) && this.expiresIn == getSignedUrlParameters.expiresIn;
    }

    public int hashCode() {
        return (((((this.contentId.hashCode() * 31) + this.contentVersion.hashCode()) * 31) + this.fileName.hashCode()) * 31) + Integer.hashCode(this.expiresIn);
    }

    public String toString() {
        return "GetSignedUrlParameters(contentId=" + this.contentId + ", contentVersion=" + this.contentVersion + ", fileName=" + this.fileName + ", expiresIn=" + this.expiresIn + ")";
    }

    public GetSignedUrlParameters(String contentId, String contentVersion, String fileName, int i) {
        Intrinsics.checkNotNullParameter(contentId, "contentId");
        Intrinsics.checkNotNullParameter(contentVersion, "contentVersion");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.contentId = contentId;
        this.contentVersion = contentVersion;
        this.fileName = fileName;
        this.expiresIn = i;
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

    public final int getExpiresIn() {
        return this.expiresIn;
    }
}
