package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoursePdfsResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u001d\u001eB%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/CoursePdfsResponse;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface;", "Lcom/medicmedia/medilink/core/network/api/response/CoursePdfsResponse$Unique;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface;", "common", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "unique", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "<init>", "(Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;Lcom/medicmedia/medilink/core/network/api/response/CoursePdfsResponse$Unique;Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;)V", "getCommon", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "getUnique", "()Lcom/medicmedia/medilink/core/network/api/response/CoursePdfsResponse$Unique;", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Unique", "Pdf", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class CoursePdfsResponse implements ApiResponseInterface<Unique>, ApiResponseErrorInterface {
    private final ApiResponseInterface.CommonResponse common;
    private final ApiResponseErrorInterface.ErrorResponse error;
    private final Unique unique;

    public static /* synthetic */ CoursePdfsResponse copy$default(CoursePdfsResponse coursePdfsResponse, ApiResponseInterface.CommonResponse commonResponse, Unique unique, ApiResponseErrorInterface.ErrorResponse errorResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            commonResponse = coursePdfsResponse.common;
        }
        if ((i & 2) != 0) {
            unique = coursePdfsResponse.unique;
        }
        if ((i & 4) != 0) {
            errorResponse = coursePdfsResponse.error;
        }
        return coursePdfsResponse.copy(commonResponse, unique, errorResponse);
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

    public final CoursePdfsResponse copy(ApiResponseInterface.CommonResponse common, Unique unique, ApiResponseErrorInterface.ErrorResponse error) {
        return new CoursePdfsResponse(common, unique, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoursePdfsResponse)) {
            return false;
        }
        CoursePdfsResponse coursePdfsResponse = (CoursePdfsResponse) other;
        return Intrinsics.areEqual(this.common, coursePdfsResponse.common) && Intrinsics.areEqual(this.unique, coursePdfsResponse.unique) && Intrinsics.areEqual(this.error, coursePdfsResponse.error);
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
        return "CoursePdfsResponse(common=" + this.common + ", unique=" + this.unique + ", error=" + this.error + ")";
    }

    public CoursePdfsResponse(ApiResponseInterface.CommonResponse commonResponse, Unique unique, ApiResponseErrorInterface.ErrorResponse errorResponse) {
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

    /* JADX INFO: compiled from: CoursePdfsResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/CoursePdfsResponse$Unique;", "", "pdfs", "", "Lcom/medicmedia/medilink/core/network/api/response/CoursePdfsResponse$Pdf;", "<init>", "(Ljava/util/List;)V", "getPdfs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Unique {
        private final List<Pdf> pdfs;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unique copy$default(Unique unique, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = unique.pdfs;
            }
            return unique.copy(list);
        }

        public final List<Pdf> component1() {
            return this.pdfs;
        }

        public final Unique copy(List<Pdf> pdfs) {
            return new Unique(pdfs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unique) && Intrinsics.areEqual(this.pdfs, ((Unique) other).pdfs);
        }

        public int hashCode() {
            List<Pdf> list = this.pdfs;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Unique(pdfs=" + this.pdfs + ")";
        }

        public Unique(List<Pdf> list) {
            this.pdfs = list;
        }

        public final List<Pdf> getPdfs() {
            return this.pdfs;
        }
    }

    /* JADX INFO: compiled from: CoursePdfsResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/CoursePdfsResponse$Pdf;", "", "id", "", "name", "", "downloadUrl", "displayOrder", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getDownloadUrl", "getDisplayOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/medicmedia/medilink/core/network/api/response/CoursePdfsResponse$Pdf;", "equals", "", "other", "hashCode", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Pdf {
        private final Integer displayOrder;
        private final String downloadUrl;
        private final int id;
        private final String name;

        public static /* synthetic */ Pdf copy$default(Pdf pdf, int i, String str, String str2, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pdf.id;
            }
            if ((i2 & 2) != 0) {
                str = pdf.name;
            }
            if ((i2 & 4) != 0) {
                str2 = pdf.downloadUrl;
            }
            if ((i2 & 8) != 0) {
                num = pdf.displayOrder;
            }
            return pdf.copy(i, str, str2, num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDownloadUrl() {
            return this.downloadUrl;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getDisplayOrder() {
            return this.displayOrder;
        }

        public final Pdf copy(int id, String name, @Json(name = "downloadUrl") String downloadUrl, @Json(name = "displayOrder") Integer displayOrder) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
            return new Pdf(id, name, downloadUrl, displayOrder);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pdf)) {
                return false;
            }
            Pdf pdf = (Pdf) other;
            return this.id == pdf.id && Intrinsics.areEqual(this.name, pdf.name) && Intrinsics.areEqual(this.downloadUrl, pdf.downloadUrl) && Intrinsics.areEqual(this.displayOrder, pdf.displayOrder);
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.downloadUrl.hashCode()) * 31;
            Integer num = this.displayOrder;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Pdf(id=" + this.id + ", name=" + this.name + ", downloadUrl=" + this.downloadUrl + ", displayOrder=" + this.displayOrder + ")";
        }

        public Pdf(int i, String name, @Json(name = "downloadUrl") String downloadUrl, @Json(name = "displayOrder") Integer num) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
            this.id = i;
            this.name = name;
            this.downloadUrl = downloadUrl;
            this.displayOrder = num;
        }

        public final int getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getDownloadUrl() {
            return this.downloadUrl;
        }

        public final Integer getDisplayOrder() {
            return this.displayOrder;
        }
    }
}
