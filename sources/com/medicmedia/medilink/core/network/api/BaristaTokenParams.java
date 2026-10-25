package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.QueryParameterKey;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaristaApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/BaristaTokenParams;", "", "grantType", "Lcom/medicmedia/medilink/core/network/api/BaristaTokenGrantType;", QueryParameterKey.CODE, "", "refreshToken", "redirectUri", "<init>", "(Lcom/medicmedia/medilink/core/network/api/BaristaTokenGrantType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGrantType", "()Lcom/medicmedia/medilink/core/network/api/BaristaTokenGrantType;", "getCode", "()Ljava/lang/String;", "getRefreshToken", "getRedirectUri", "toMap", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BaristaTokenParams {
    private final String code;
    private final BaristaTokenGrantType grantType;
    private final String redirectUri;
    private final String refreshToken;

    /* JADX INFO: compiled from: BaristaApi.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BaristaTokenGrantType.values().length];
            try {
                iArr[BaristaTokenGrantType.AUTHORIZATION_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BaristaTokenGrantType.REFRESH_TOKEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ BaristaTokenParams copy$default(BaristaTokenParams baristaTokenParams, BaristaTokenGrantType baristaTokenGrantType, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            baristaTokenGrantType = baristaTokenParams.grantType;
        }
        if ((i & 2) != 0) {
            str = baristaTokenParams.code;
        }
        if ((i & 4) != 0) {
            str2 = baristaTokenParams.refreshToken;
        }
        if ((i & 8) != 0) {
            str3 = baristaTokenParams.redirectUri;
        }
        return baristaTokenParams.copy(baristaTokenGrantType, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BaristaTokenGrantType getGrantType() {
        return this.grantType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public final BaristaTokenParams copy(BaristaTokenGrantType grantType, String code, String refreshToken, String redirectUri) {
        Intrinsics.checkNotNullParameter(grantType, "grantType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        return new BaristaTokenParams(grantType, code, refreshToken, redirectUri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaristaTokenParams)) {
            return false;
        }
        BaristaTokenParams baristaTokenParams = (BaristaTokenParams) other;
        return this.grantType == baristaTokenParams.grantType && Intrinsics.areEqual(this.code, baristaTokenParams.code) && Intrinsics.areEqual(this.refreshToken, baristaTokenParams.refreshToken) && Intrinsics.areEqual(this.redirectUri, baristaTokenParams.redirectUri);
    }

    public int hashCode() {
        return (((((this.grantType.hashCode() * 31) + this.code.hashCode()) * 31) + this.refreshToken.hashCode()) * 31) + this.redirectUri.hashCode();
    }

    public String toString() {
        return "BaristaTokenParams(grantType=" + this.grantType + ", code=" + this.code + ", refreshToken=" + this.refreshToken + ", redirectUri=" + this.redirectUri + ")";
    }

    public BaristaTokenParams(BaristaTokenGrantType grantType, String code, String refreshToken, String redirectUri) {
        Intrinsics.checkNotNullParameter(grantType, "grantType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        this.grantType = grantType;
        this.code = code;
        this.refreshToken = refreshToken;
        this.redirectUri = redirectUri;
    }

    public /* synthetic */ BaristaTokenParams(BaristaTokenGrantType baristaTokenGrantType, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baristaTokenGrantType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }

    public final BaristaTokenGrantType getGrantType() {
        return this.grantType;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getRedirectUri() {
        return this.redirectUri;
    }

    public final Map<String, String> toMap() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.grantType.ordinal()];
        if (i == 1) {
            return MapsKt.mapOf(TuplesKt.to("grant_type", this.grantType.getValue()), TuplesKt.to(QueryParameterKey.CODE, this.code), TuplesKt.to("redirect_uri", this.redirectUri));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return MapsKt.mapOf(TuplesKt.to("grant_type", this.grantType.getValue()), TuplesKt.to("refresh_token", this.refreshToken));
    }
}
