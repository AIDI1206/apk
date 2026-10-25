package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LicensesResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u001d\u001eB%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/LicensesResponse;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface;", "Lcom/medicmedia/medilink/core/network/api/response/LicensesResponse$Unique;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface;", "common", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "unique", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "<init>", "(Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;Lcom/medicmedia/medilink/core/network/api/response/LicensesResponse$Unique;Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;)V", "getCommon", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "getUnique", "()Lcom/medicmedia/medilink/core/network/api/response/LicensesResponse$Unique;", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Unique", "License", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class LicensesResponse implements ApiResponseInterface<Unique>, ApiResponseErrorInterface {
    private final ApiResponseInterface.CommonResponse common;
    private final ApiResponseErrorInterface.ErrorResponse error;
    private final Unique unique;

    public static /* synthetic */ LicensesResponse copy$default(LicensesResponse licensesResponse, ApiResponseInterface.CommonResponse commonResponse, Unique unique, ApiResponseErrorInterface.ErrorResponse errorResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            commonResponse = licensesResponse.common;
        }
        if ((i & 2) != 0) {
            unique = licensesResponse.unique;
        }
        if ((i & 4) != 0) {
            errorResponse = licensesResponse.error;
        }
        return licensesResponse.copy(commonResponse, unique, errorResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiResponseInterface.CommonResponse getCommon() {
        return this.common;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Unique getUnique() {
        return this.unique;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    public final LicensesResponse copy(ApiResponseInterface.CommonResponse common, Unique unique, ApiResponseErrorInterface.ErrorResponse error) {
        return new LicensesResponse(common, unique, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LicensesResponse)) {
            return false;
        }
        LicensesResponse licensesResponse = (LicensesResponse) other;
        return Intrinsics.areEqual(this.common, licensesResponse.common) && Intrinsics.areEqual(this.unique, licensesResponse.unique) && Intrinsics.areEqual(this.error, licensesResponse.error);
    }

    public int hashCode() {
        ApiResponseInterface.CommonResponse commonResponse = this.common;
        int iHashCode = (commonResponse == null ? 0 : commonResponse.hashCode()) * 31;
        Unique unique = this.unique;
        int iHashCode2 = (iHashCode + (unique == null ? 0 : unique.hashCode())) * 31;
        ApiResponseErrorInterface.ErrorResponse errorResponse = this.error;
        return iHashCode2 + (errorResponse != null ? errorResponse.hashCode() : 0);
    }

    public String toString() {
        return "LicensesResponse(common=" + this.common + ", unique=" + this.unique + ", error=" + this.error + ")";
    }

    public LicensesResponse(ApiResponseInterface.CommonResponse commonResponse, Unique unique, ApiResponseErrorInterface.ErrorResponse errorResponse) {
        this.common = commonResponse;
        this.unique = unique;
        this.error = errorResponse;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseInterface
    public ApiResponseInterface.CommonResponse getCommon() {
        return this.common;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseInterface
    public Unique getUnique() {
        return this.unique;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseErrorInterface
    public ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    /* JADX INFO: compiled from: LicensesResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/LicensesResponse$Unique;", "", "licenses", "", "Lcom/medicmedia/medilink/core/network/api/response/LicensesResponse$License;", "<init>", "(Ljava/util/List;)V", "getLicenses", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Unique {
        private final List<License> licenses;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unique copy$default(Unique unique, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = unique.licenses;
            }
            return unique.copy(list);
        }

        public final List<License> component1() {
            return this.licenses;
        }

        public final Unique copy(List<License> licenses) {
            return new Unique(licenses);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unique) && Intrinsics.areEqual(this.licenses, ((Unique) other).licenses);
        }

        public int hashCode() {
            List<License> list = this.licenses;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Unique(licenses=" + this.licenses + ")";
        }

        public Unique(List<License> list) {
            this.licenses = list;
        }

        public final List<License> getLicenses() {
            return this.licenses;
        }
    }

    /* JADX INFO: compiled from: LicensesResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/LicensesResponse$License;", "", "contentCode", "", "contentTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContentCode", "()Ljava/lang/String;", "getContentTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class License {
        private final String contentCode;
        private final String contentTitle;

        public static /* synthetic */ License copy$default(License license, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = license.contentCode;
            }
            if ((i & 2) != 0) {
                str2 = license.contentTitle;
            }
            return license.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentCode() {
            return this.contentCode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getContentTitle() {
            return this.contentTitle;
        }

        public final License copy(@Json(name = "content_code") String contentCode, @Json(name = "content_title") String contentTitle) {
            Intrinsics.checkNotNullParameter(contentCode, "contentCode");
            return new License(contentCode, contentTitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof License)) {
                return false;
            }
            License license = (License) other;
            return Intrinsics.areEqual(this.contentCode, license.contentCode) && Intrinsics.areEqual(this.contentTitle, license.contentTitle);
        }

        public int hashCode() {
            int iHashCode = this.contentCode.hashCode() * 31;
            String str = this.contentTitle;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "License(contentCode=" + this.contentCode + ", contentTitle=" + this.contentTitle + ")";
        }

        public License(@Json(name = "content_code") String contentCode, @Json(name = "content_title") String str) {
            Intrinsics.checkNotNullParameter(contentCode, "contentCode");
            this.contentCode = contentCode;
            this.contentTitle = str;
        }

        public final String getContentCode() {
            return this.contentCode;
        }

        public final String getContentTitle() {
            return this.contentTitle;
        }
    }
}
