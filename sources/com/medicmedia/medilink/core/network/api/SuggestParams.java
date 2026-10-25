package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.actions.SearchIntents;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/SuggestParams;", "", SearchIntents.EXTRA_QUERY, "", "userId", "mode", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getQuery", "()Ljava/lang/String;", "getUserId", "getMode", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SuggestParams {
    private final int mode;
    private final String query;
    private final String userId;

    public static /* synthetic */ SuggestParams copy$default(SuggestParams suggestParams, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = suggestParams.query;
        }
        if ((i2 & 2) != 0) {
            str2 = suggestParams.userId;
        }
        if ((i2 & 4) != 0) {
            i = suggestParams.mode;
        }
        return suggestParams.copy(str, str2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    public final SuggestParams copy(@Json(name = "q") String query, String userId, int mode) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new SuggestParams(query, userId, mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestParams)) {
            return false;
        }
        SuggestParams suggestParams = (SuggestParams) other;
        return Intrinsics.areEqual(this.query, suggestParams.query) && Intrinsics.areEqual(this.userId, suggestParams.userId) && this.mode == suggestParams.mode;
    }

    public int hashCode() {
        return (((this.query.hashCode() * 31) + this.userId.hashCode()) * 31) + Integer.hashCode(this.mode);
    }

    public String toString() {
        return "SuggestParams(query=" + this.query + ", userId=" + this.userId + ", mode=" + this.mode + ")";
    }

    public SuggestParams(@Json(name = "q") String query, String userId, int i) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.query = query;
        this.userId = userId;
        this.mode = i;
    }

    public final String getQuery() {
        return this.query;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getMode() {
        return this.mode;
    }
}
