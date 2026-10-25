package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SuggestResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0017B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/SuggestResponse;", "Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface;", "took", "", "timedOut", "", "suggests", "", "Lcom/medicmedia/medilink/core/network/api/response/SuggestResponse$Suggest;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$ErrorResponse;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$ErrorResponse;)V", "getTook", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimedOut", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSuggests", "()Ljava/util/List;", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$ErrorResponse;", "Suggest", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SuggestResponse implements AccountsApiErrorInterface {
    private final AccountsApiErrorInterface.ErrorResponse error;
    private final List<Suggest> suggests;
    private final Boolean timedOut;
    private final Integer took;

    public SuggestResponse(Integer num, Boolean bool, List<Suggest> list, AccountsApiErrorInterface.ErrorResponse errorResponse) {
        this.took = num;
        this.timedOut = bool;
        this.suggests = list;
        this.error = errorResponse;
    }

    public final Integer getTook() {
        return this.took;
    }

    public final Boolean getTimedOut() {
        return this.timedOut;
    }

    public final List<Suggest> getSuggests() {
        return this.suggests;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.AccountsApiErrorInterface
    public AccountsApiErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    /* JADX INFO: compiled from: SuggestResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/SuggestResponse$Suggest;", "", "value", "", "docCount", "", "record", "system", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getValue", "()Ljava/lang/String;", "getDocCount", "()I", "getRecord", "getSystem", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Suggest {
        private final int docCount;
        private final String record;
        private final boolean system;
        private final String value;

        public static /* synthetic */ Suggest copy$default(Suggest suggest, String str, int i, String str2, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = suggest.value;
            }
            if ((i2 & 2) != 0) {
                i = suggest.docCount;
            }
            if ((i2 & 4) != 0) {
                str2 = suggest.record;
            }
            if ((i2 & 8) != 0) {
                z = suggest.system;
            }
            return suggest.copy(str, i, str2, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getDocCount() {
            return this.docCount;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRecord() {
            return this.record;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getSystem() {
            return this.system;
        }

        public final Suggest copy(String value, @Json(name = "doc_count") int docCount, String record, boolean system) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(record, "record");
            return new Suggest(value, docCount, record, system);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Suggest)) {
                return false;
            }
            Suggest suggest = (Suggest) other;
            return Intrinsics.areEqual(this.value, suggest.value) && this.docCount == suggest.docCount && Intrinsics.areEqual(this.record, suggest.record) && this.system == suggest.system;
        }

        public int hashCode() {
            return (((((this.value.hashCode() * 31) + Integer.hashCode(this.docCount)) * 31) + this.record.hashCode()) * 31) + Boolean.hashCode(this.system);
        }

        public String toString() {
            return "Suggest(value=" + this.value + ", docCount=" + this.docCount + ", record=" + this.record + ", system=" + this.system + ")";
        }

        public Suggest(String value, @Json(name = "doc_count") int i, String record, boolean z) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(record, "record");
            this.value = value;
            this.docCount = i;
            this.record = record;
            this.system = z;
        }

        public final String getValue() {
            return this.value;
        }

        public final int getDocCount() {
            return this.docCount;
        }

        public final String getRecord() {
            return this.record;
        }

        public final boolean getSystem() {
            return this.system;
        }
    }
}
