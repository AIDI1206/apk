package com.medicmedia.medilink;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UserStorage.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0019H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/BaristaToken;", "", "accessToken", "", "refleshToken", "accessTokenDate", "", "refleshTokenDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJ)V", "getAccessToken", "()Ljava/lang/String;", "getRefleshToken", "getAccessTokenDate", "()J", "getRefleshTokenDate", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BaristaToken {
    public static final int $stable = 0;
    private final String accessToken;
    private final long accessTokenDate;
    private final String refleshToken;
    private final long refleshTokenDate;

    public static /* synthetic */ BaristaToken copy$default(BaristaToken baristaToken, String str, String str2, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baristaToken.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = baristaToken.refleshToken;
        }
        if ((i & 4) != 0) {
            j = baristaToken.accessTokenDate;
        }
        if ((i & 8) != 0) {
            j2 = baristaToken.refleshTokenDate;
        }
        long j3 = j2;
        return baristaToken.copy(str, str2, j, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRefleshToken() {
        return this.refleshToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getAccessTokenDate() {
        return this.accessTokenDate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getRefleshTokenDate() {
        return this.refleshTokenDate;
    }

    public final BaristaToken copy(String accessToken, String refleshToken, long accessTokenDate, long refleshTokenDate) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refleshToken, "refleshToken");
        return new BaristaToken(accessToken, refleshToken, accessTokenDate, refleshTokenDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaristaToken)) {
            return false;
        }
        BaristaToken baristaToken = (BaristaToken) other;
        return Intrinsics.areEqual(this.accessToken, baristaToken.accessToken) && Intrinsics.areEqual(this.refleshToken, baristaToken.refleshToken) && this.accessTokenDate == baristaToken.accessTokenDate && this.refleshTokenDate == baristaToken.refleshTokenDate;
    }

    public int hashCode() {
        return (((((this.accessToken.hashCode() * 31) + this.refleshToken.hashCode()) * 31) + Long.hashCode(this.accessTokenDate)) * 31) + Long.hashCode(this.refleshTokenDate);
    }

    public String toString() {
        return "BaristaToken(accessToken=" + this.accessToken + ", refleshToken=" + this.refleshToken + ", accessTokenDate=" + this.accessTokenDate + ", refleshTokenDate=" + this.refleshTokenDate + ")";
    }

    public BaristaToken(String accessToken, String refleshToken, long j, long j2) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(refleshToken, "refleshToken");
        this.accessToken = accessToken;
        this.refleshToken = refleshToken;
        this.accessTokenDate = j;
        this.refleshTokenDate = j2;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getAccessTokenDate() {
        return this.accessTokenDate;
    }

    public final String getRefleshToken() {
        return this.refleshToken;
    }

    public final long getRefleshTokenDate() {
        return this.refleshTokenDate;
    }
}
