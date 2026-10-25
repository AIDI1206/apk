package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WithdrawalAuthItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/WithdrawalAuthItem;", "", "baristaToken", "", "tokenId", "refreshToken", "loginTime", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getBaristaToken", "()Ljava/lang/String;", "getTokenId", "getRefreshToken", "getLoginTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class WithdrawalAuthItem {
    private final String baristaToken;
    private final long loginTime;
    private final String refreshToken;
    private final String tokenId;

    public static /* synthetic */ WithdrawalAuthItem copy$default(WithdrawalAuthItem withdrawalAuthItem, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = withdrawalAuthItem.baristaToken;
        }
        if ((i & 2) != 0) {
            str2 = withdrawalAuthItem.tokenId;
        }
        if ((i & 4) != 0) {
            str3 = withdrawalAuthItem.refreshToken;
        }
        if ((i & 8) != 0) {
            j = withdrawalAuthItem.loginTime;
        }
        String str4 = str3;
        return withdrawalAuthItem.copy(str, str2, str4, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBaristaToken() {
        return this.baristaToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLoginTime() {
        return this.loginTime;
    }

    public final WithdrawalAuthItem copy(String baristaToken, String tokenId, String refreshToken, long loginTime) {
        Intrinsics.checkNotNullParameter(baristaToken, "baristaToken");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        return new WithdrawalAuthItem(baristaToken, tokenId, refreshToken, loginTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WithdrawalAuthItem)) {
            return false;
        }
        WithdrawalAuthItem withdrawalAuthItem = (WithdrawalAuthItem) other;
        return Intrinsics.areEqual(this.baristaToken, withdrawalAuthItem.baristaToken) && Intrinsics.areEqual(this.tokenId, withdrawalAuthItem.tokenId) && Intrinsics.areEqual(this.refreshToken, withdrawalAuthItem.refreshToken) && this.loginTime == withdrawalAuthItem.loginTime;
    }

    public int hashCode() {
        return (((((this.baristaToken.hashCode() * 31) + this.tokenId.hashCode()) * 31) + this.refreshToken.hashCode()) * 31) + Long.hashCode(this.loginTime);
    }

    public String toString() {
        return "WithdrawalAuthItem(baristaToken=" + this.baristaToken + ", tokenId=" + this.tokenId + ", refreshToken=" + this.refreshToken + ", loginTime=" + this.loginTime + ")";
    }

    public WithdrawalAuthItem(String baristaToken, String tokenId, String refreshToken, long j) {
        Intrinsics.checkNotNullParameter(baristaToken, "baristaToken");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        this.baristaToken = baristaToken;
        this.tokenId = tokenId;
        this.refreshToken = refreshToken;
        this.loginTime = j;
    }

    public final String getBaristaToken() {
        return this.baristaToken;
    }

    public final String getTokenId() {
        return this.tokenId;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final long getLoginTime() {
        return this.loginTime;
    }
}
