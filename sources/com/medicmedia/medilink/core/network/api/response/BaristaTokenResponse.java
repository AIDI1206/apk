package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaristaTokenResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/BaristaTokenResponse;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface;", "accessToken", "", "expiresIn", "", "refreshToken", "tokenId", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn", "()J", "getRefreshToken", "getTokenId", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BaristaTokenResponse implements ApiResponseErrorInterface {
    private final String accessToken;
    private final ApiResponseErrorInterface.ErrorResponse error;
    private final long expiresIn;
    private final String refreshToken;
    private final String tokenId;

    public static /* synthetic */ BaristaTokenResponse copy$default(BaristaTokenResponse baristaTokenResponse, String str, long j, String str2, String str3, ApiResponseErrorInterface.ErrorResponse errorResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baristaTokenResponse.accessToken;
        }
        if ((i & 2) != 0) {
            j = baristaTokenResponse.expiresIn;
        }
        if ((i & 4) != 0) {
            str2 = baristaTokenResponse.refreshToken;
        }
        if ((i & 8) != 0) {
            str3 = baristaTokenResponse.tokenId;
        }
        if ((i & 16) != 0) {
            errorResponse = baristaTokenResponse.error;
        }
        ApiResponseErrorInterface.ErrorResponse errorResponse2 = errorResponse;
        String str4 = str2;
        return baristaTokenResponse.copy(str, j, str4, str3, errorResponse2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getExpiresIn() {
        return this.expiresIn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    public final BaristaTokenResponse copy(@Json(name = "access_token") String accessToken, @Json(name = "expires_in") long expiresIn, @Json(name = "refresh_token") String refreshToken, @Json(name = "id_token") String tokenId, ApiResponseErrorInterface.ErrorResponse error) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        return new BaristaTokenResponse(accessToken, expiresIn, refreshToken, tokenId, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaristaTokenResponse)) {
            return false;
        }
        BaristaTokenResponse baristaTokenResponse = (BaristaTokenResponse) other;
        return Intrinsics.areEqual(this.accessToken, baristaTokenResponse.accessToken) && this.expiresIn == baristaTokenResponse.expiresIn && Intrinsics.areEqual(this.refreshToken, baristaTokenResponse.refreshToken) && Intrinsics.areEqual(this.tokenId, baristaTokenResponse.tokenId) && Intrinsics.areEqual(this.error, baristaTokenResponse.error);
    }

    public int hashCode() {
        int iHashCode = ((((((this.accessToken.hashCode() * 31) + Long.hashCode(this.expiresIn)) * 31) + this.refreshToken.hashCode()) * 31) + this.tokenId.hashCode()) * 31;
        ApiResponseErrorInterface.ErrorResponse errorResponse = this.error;
        return iHashCode + (errorResponse == null ? 0 : errorResponse.hashCode());
    }

    public String toString() {
        return "BaristaTokenResponse(accessToken=" + this.accessToken + ", expiresIn=" + this.expiresIn + ", refreshToken=" + this.refreshToken + ", tokenId=" + this.tokenId + ", error=" + this.error + ")";
    }

    public BaristaTokenResponse(@Json(name = "access_token") String accessToken, @Json(name = "expires_in") long j, @Json(name = "refresh_token") String refreshToken, @Json(name = "id_token") String tokenId, ApiResponseErrorInterface.ErrorResponse errorResponse) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        this.accessToken = accessToken;
        this.expiresIn = j;
        this.refreshToken = refreshToken;
        this.tokenId = tokenId;
        this.error = errorResponse;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getTokenId() {
        return this.tokenId;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseErrorInterface
    public ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }
}
