package com.medicmedia.medilink.datastore.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaristaToken.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/BaristaToken;", "", "accessToken", "", "refreshToken", "accessTokenLimit", "", "refreshTokenLimit", "tokenId", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "getAccessTokenLimit", "()J", "getRefreshTokenLimit", "getTokenId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BaristaToken {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int tokenInterval = 300;
    private final String accessToken;
    private final long accessTokenLimit;
    private final String refreshToken;
    private final long refreshTokenLimit;
    private final String tokenId;

    public static /* synthetic */ BaristaToken copy$default(BaristaToken baristaToken, String str, String str2, long j, long j2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baristaToken.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = baristaToken.refreshToken;
        }
        if ((i & 4) != 0) {
            j = baristaToken.accessTokenLimit;
        }
        if ((i & 8) != 0) {
            j2 = baristaToken.refreshTokenLimit;
        }
        if ((i & 16) != 0) {
            str3 = baristaToken.tokenId;
        }
        String str4 = str3;
        long j3 = j2;
        return baristaToken.copy(str, str2, j, j3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAccessTokenLimit() {
        return this.accessTokenLimit;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getRefreshTokenLimit() {
        return this.refreshTokenLimit;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    public final BaristaToken copy(String accessToken, String refreshToken, long accessTokenLimit, long refreshTokenLimit, String tokenId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        return new BaristaToken(accessToken, refreshToken, accessTokenLimit, refreshTokenLimit, tokenId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaristaToken)) {
            return false;
        }
        BaristaToken baristaToken = (BaristaToken) other;
        return Intrinsics.areEqual(this.accessToken, baristaToken.accessToken) && Intrinsics.areEqual(this.refreshToken, baristaToken.refreshToken) && this.accessTokenLimit == baristaToken.accessTokenLimit && this.refreshTokenLimit == baristaToken.refreshTokenLimit && Intrinsics.areEqual(this.tokenId, baristaToken.tokenId);
    }

    public int hashCode() {
        return (((((((this.accessToken.hashCode() * 31) + this.refreshToken.hashCode()) * 31) + Long.hashCode(this.accessTokenLimit)) * 31) + Long.hashCode(this.refreshTokenLimit)) * 31) + this.tokenId.hashCode();
    }

    public String toString() {
        return "BaristaToken(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", accessTokenLimit=" + this.accessTokenLimit + ", refreshTokenLimit=" + this.refreshTokenLimit + ", tokenId=" + this.tokenId + ")";
    }

    public BaristaToken(String accessToken, String refreshToken, long j, long j2, String tokenId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.accessTokenLimit = j;
        this.refreshTokenLimit = j2;
        this.tokenId = tokenId;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final long getAccessTokenLimit() {
        return this.accessTokenLimit;
    }

    public final long getRefreshTokenLimit() {
        return this.refreshTokenLimit;
    }

    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX INFO: compiled from: BaristaToken.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/datastore/model/BaristaToken$Companion;", "", "<init>", "()V", "tokenInterval", "", "getTokenInterval", "()I", "datastore_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getTokenInterval() {
            return BaristaToken.tokenInterval;
        }
    }
}
