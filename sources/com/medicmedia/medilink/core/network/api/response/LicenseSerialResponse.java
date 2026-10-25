package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.medicmedia.medilink.domain.model.AnalyticsEvent;
import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LicenseSerialResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0016B9\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/LicenseSerialResponse;", "Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface;", "memberId", "", "serialCode", "", "activated", "", "Lcom/medicmedia/medilink/core/network/api/response/LicenseSerialResponse$Activated;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$ErrorResponse;", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$ErrorResponse;)V", "getMemberId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSerialCode", "()Ljava/lang/String;", "getActivated", "()Ljava/util/List;", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/AccountsApiErrorInterface$ErrorResponse;", "Activated", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class LicenseSerialResponse implements AccountsApiErrorInterface {
    private final List<Activated> activated;
    private final AccountsApiErrorInterface.ErrorResponse error;
    private final Integer memberId;
    private final String serialCode;

    public LicenseSerialResponse(@Json(name = "member_id") Integer num, @Json(name = AnalyticsEvent.Param.SERIAL_CODE) String str, List<Activated> list, AccountsApiErrorInterface.ErrorResponse errorResponse) {
        this.memberId = num;
        this.serialCode = str;
        this.activated = list;
        this.error = errorResponse;
    }

    public final Integer getMemberId() {
        return this.memberId;
    }

    public final String getSerialCode() {
        return this.serialCode;
    }

    public final List<Activated> getActivated() {
        return this.activated;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.AccountsApiErrorInterface
    public AccountsApiErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    /* JADX INFO: compiled from: LicenseSerialResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/LicenseSerialResponse$Activated;", "", "licenseClass", "", "licenseName", "licenseCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLicenseClass", "()Ljava/lang/String;", "getLicenseName", "getLicenseCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Activated {
        private final String licenseClass;
        private final String licenseCode;
        private final String licenseName;

        public static /* synthetic */ Activated copy$default(Activated activated, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activated.licenseClass;
            }
            if ((i & 2) != 0) {
                str2 = activated.licenseName;
            }
            if ((i & 4) != 0) {
                str3 = activated.licenseCode;
            }
            return activated.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLicenseClass() {
            return this.licenseClass;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLicenseName() {
            return this.licenseName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLicenseCode() {
            return this.licenseCode;
        }

        public final Activated copy(@Json(name = "license_class") String licenseClass, @Json(name = "license_name") String licenseName, @Json(name = AnalyticsEvent.Param.LICENSE_CODE) String licenseCode) {
            Intrinsics.checkNotNullParameter(licenseClass, "licenseClass");
            Intrinsics.checkNotNullParameter(licenseName, "licenseName");
            Intrinsics.checkNotNullParameter(licenseCode, "licenseCode");
            return new Activated(licenseClass, licenseName, licenseCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Activated)) {
                return false;
            }
            Activated activated = (Activated) other;
            return Intrinsics.areEqual(this.licenseClass, activated.licenseClass) && Intrinsics.areEqual(this.licenseName, activated.licenseName) && Intrinsics.areEqual(this.licenseCode, activated.licenseCode);
        }

        public int hashCode() {
            return (((this.licenseClass.hashCode() * 31) + this.licenseName.hashCode()) * 31) + this.licenseCode.hashCode();
        }

        public String toString() {
            return "Activated(licenseClass=" + this.licenseClass + ", licenseName=" + this.licenseName + ", licenseCode=" + this.licenseCode + ")";
        }

        public Activated(@Json(name = "license_class") String licenseClass, @Json(name = "license_name") String licenseName, @Json(name = AnalyticsEvent.Param.LICENSE_CODE) String licenseCode) {
            Intrinsics.checkNotNullParameter(licenseClass, "licenseClass");
            Intrinsics.checkNotNullParameter(licenseName, "licenseName");
            Intrinsics.checkNotNullParameter(licenseCode, "licenseCode");
            this.licenseClass = licenseClass;
            this.licenseName = licenseName;
            this.licenseCode = licenseCode;
        }

        public final String getLicenseClass() {
            return this.licenseClass;
        }

        public final String getLicenseName() {
            return this.licenseName;
        }

        public final String getLicenseCode() {
            return this.licenseCode;
        }
    }
}
