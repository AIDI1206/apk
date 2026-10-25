package com.medicmedia.medilink.core.network.functions.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SignedUrlResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/core/network/functions/response/GetSignedUrlsParameters;", "", "contents", "", "Lcom/medicmedia/medilink/core/network/functions/response/GetSignedUrlContent;", "expiresIn", "", "<init>", "(Ljava/util/List;I)V", "getContents", "()Ljava/util/List;", "getExpiresIn", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class GetSignedUrlsParameters {
    private final List<GetSignedUrlContent> contents;
    private final int expiresIn;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetSignedUrlsParameters copy$default(GetSignedUrlsParameters getSignedUrlsParameters, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = getSignedUrlsParameters.contents;
        }
        if ((i2 & 2) != 0) {
            i = getSignedUrlsParameters.expiresIn;
        }
        return getSignedUrlsParameters.copy(list, i);
    }

    public final List<GetSignedUrlContent> component1() {
        return this.contents;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getExpiresIn() {
        return this.expiresIn;
    }

    public final GetSignedUrlsParameters copy(List<GetSignedUrlContent> contents, int expiresIn) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        return new GetSignedUrlsParameters(contents, expiresIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSignedUrlsParameters)) {
            return false;
        }
        GetSignedUrlsParameters getSignedUrlsParameters = (GetSignedUrlsParameters) other;
        return Intrinsics.areEqual(this.contents, getSignedUrlsParameters.contents) && this.expiresIn == getSignedUrlsParameters.expiresIn;
    }

    public int hashCode() {
        return (this.contents.hashCode() * 31) + Integer.hashCode(this.expiresIn);
    }

    public String toString() {
        return "GetSignedUrlsParameters(contents=" + this.contents + ", expiresIn=" + this.expiresIn + ")";
    }

    public GetSignedUrlsParameters(List<GetSignedUrlContent> contents, int i) {
        Intrinsics.checkNotNullParameter(contents, "contents");
        this.contents = contents;
        this.expiresIn = i;
    }

    public final List<GetSignedUrlContent> getContents() {
        return this.contents;
    }

    public final int getExpiresIn() {
        return this.expiresIn;
    }
}
