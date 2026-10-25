package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CourseLicenseResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u001d\u001eB%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/CourseLicenseResponse;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface;", "Lcom/medicmedia/medilink/core/network/api/response/CourseLicenseResponse$Unique;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface;", "common", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "unique", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "<init>", "(Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;Lcom/medicmedia/medilink/core/network/api/response/CourseLicenseResponse$Unique;Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;)V", "getCommon", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "getUnique", "()Lcom/medicmedia/medilink/core/network/api/response/CourseLicenseResponse$Unique;", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Unique", "CourseLicense", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class CourseLicenseResponse implements ApiResponseInterface<Unique>, ApiResponseErrorInterface {
    private final ApiResponseInterface.CommonResponse common;
    private final ApiResponseErrorInterface.ErrorResponse error;
    private final Unique unique;

    public static /* synthetic */ CourseLicenseResponse copy$default(CourseLicenseResponse courseLicenseResponse, ApiResponseInterface.CommonResponse commonResponse, Unique unique, ApiResponseErrorInterface.ErrorResponse errorResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            commonResponse = courseLicenseResponse.common;
        }
        if ((i & 2) != 0) {
            unique = courseLicenseResponse.unique;
        }
        if ((i & 4) != 0) {
            errorResponse = courseLicenseResponse.error;
        }
        return courseLicenseResponse.copy(commonResponse, unique, errorResponse);
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

    public final CourseLicenseResponse copy(ApiResponseInterface.CommonResponse common, Unique unique, ApiResponseErrorInterface.ErrorResponse error) {
        return new CourseLicenseResponse(common, unique, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseLicenseResponse)) {
            return false;
        }
        CourseLicenseResponse courseLicenseResponse = (CourseLicenseResponse) other;
        return Intrinsics.areEqual(this.common, courseLicenseResponse.common) && Intrinsics.areEqual(this.unique, courseLicenseResponse.unique) && Intrinsics.areEqual(this.error, courseLicenseResponse.error);
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
        return "CourseLicenseResponse(common=" + this.common + ", unique=" + this.unique + ", error=" + this.error + ")";
    }

    public CourseLicenseResponse(ApiResponseInterface.CommonResponse commonResponse, Unique unique, ApiResponseErrorInterface.ErrorResponse errorResponse) {
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

    /* JADX INFO: compiled from: CourseLicenseResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/CourseLicenseResponse$Unique;", "", "courses", "", "Lcom/medicmedia/medilink/core/network/api/response/CourseLicenseResponse$CourseLicense;", "<init>", "(Ljava/util/List;)V", "getCourses", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Unique {
        private final List<CourseLicense> courses;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unique copy$default(Unique unique, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = unique.courses;
            }
            return unique.copy(list);
        }

        public final List<CourseLicense> component1() {
            return this.courses;
        }

        public final Unique copy(List<CourseLicense> courses) {
            return new Unique(courses);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unique) && Intrinsics.areEqual(this.courses, ((Unique) other).courses);
        }

        public int hashCode() {
            List<CourseLicense> list = this.courses;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            return "Unique(courses=" + this.courses + ")";
        }

        public Unique(List<CourseLicense> list) {
            this.courses = list;
        }

        public final List<CourseLicense> getCourses() {
            return this.courses;
        }
    }

    /* JADX INFO: compiled from: CourseLicenseResponse.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/CourseLicenseResponse$CourseLicense;", "", "id", "", "name", "", TypedValues.CycleType.S_WAVE_PERIOD, "available", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Z)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getPeriod", "getAvailable", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class CourseLicense {
        private final boolean available;
        private final int id;
        private final String name;
        private final String period;

        public static /* synthetic */ CourseLicense copy$default(CourseLicense courseLicense, int i, String str, String str2, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = courseLicense.id;
            }
            if ((i2 & 2) != 0) {
                str = courseLicense.name;
            }
            if ((i2 & 4) != 0) {
                str2 = courseLicense.period;
            }
            if ((i2 & 8) != 0) {
                z = courseLicense.available;
            }
            return courseLicense.copy(i, str, str2, z);
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
        public final String getPeriod() {
            return this.period;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getAvailable() {
            return this.available;
        }

        public final CourseLicense copy(int id, String name, String period, boolean available) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new CourseLicense(id, name, period, available);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CourseLicense)) {
                return false;
            }
            CourseLicense courseLicense = (CourseLicense) other;
            return this.id == courseLicense.id && Intrinsics.areEqual(this.name, courseLicense.name) && Intrinsics.areEqual(this.period, courseLicense.period) && this.available == courseLicense.available;
        }

        public int hashCode() {
            int iHashCode = ((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31;
            String str = this.period;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.available);
        }

        public String toString() {
            return "CourseLicense(id=" + this.id + ", name=" + this.name + ", period=" + this.period + ", available=" + this.available + ")";
        }

        public CourseLicense(int i, String name, String str, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = i;
            this.name = name;
            this.period = str;
            this.available = z;
        }

        public final int getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPeriod() {
            return this.period;
        }

        public final boolean getAvailable() {
            return this.available;
        }
    }
}
