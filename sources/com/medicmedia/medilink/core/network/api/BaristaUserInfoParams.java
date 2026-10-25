package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaristaApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/BaristaUserInfoParams;", "", "claims", "", "<init>", "(Ljava/lang/String;)V", "getClaims", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class BaristaUserInfoParams {
    private final String claims;

    public static /* synthetic */ BaristaUserInfoParams copy$default(BaristaUserInfoParams baristaUserInfoParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baristaUserInfoParams.claims;
        }
        return baristaUserInfoParams.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClaims() {
        return this.claims;
    }

    public final BaristaUserInfoParams copy(@Json(name = "claims") String claims) {
        Intrinsics.checkNotNullParameter(claims, "claims");
        return new BaristaUserInfoParams(claims);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BaristaUserInfoParams) && Intrinsics.areEqual(this.claims, ((BaristaUserInfoParams) other).claims);
    }

    public int hashCode() {
        return this.claims.hashCode();
    }

    public String toString() {
        return "BaristaUserInfoParams(claims=" + this.claims + ")";
    }

    public BaristaUserInfoParams(@Json(name = "claims") String claims) {
        Intrinsics.checkNotNullParameter(claims, "claims");
        this.claims = claims;
    }

    public final String getClaims() {
        return this.claims;
    }
}
