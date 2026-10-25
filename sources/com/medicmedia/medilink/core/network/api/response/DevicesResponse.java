package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DevicesResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u001d\u001eB%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/DevicesResponse;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface;", "Lcom/medicmedia/medilink/core/network/api/response/DevicesResponse$Unique;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "common", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "unique", "<init>", "(Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;Lcom/medicmedia/medilink/core/network/api/response/DevicesResponse$Unique;)V", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "getCommon", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "getUnique", "()Lcom/medicmedia/medilink/core/network/api/response/DevicesResponse$Unique;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Unique", "Device", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DevicesResponse implements ApiResponseInterface<Unique>, ApiResponseErrorInterface {
    private final ApiResponseInterface.CommonResponse common;
    private final ApiResponseErrorInterface.ErrorResponse error;
    private final Unique unique;

    public static /* synthetic */ DevicesResponse copy$default(DevicesResponse devicesResponse, ApiResponseErrorInterface.ErrorResponse errorResponse, ApiResponseInterface.CommonResponse commonResponse, Unique unique, int i, Object obj) {
        if ((i & 1) != 0) {
            errorResponse = devicesResponse.error;
        }
        if ((i & 2) != 0) {
            commonResponse = devicesResponse.common;
        }
        if ((i & 4) != 0) {
            unique = devicesResponse.unique;
        }
        return devicesResponse.copy(errorResponse, commonResponse, unique);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ApiResponseInterface.CommonResponse getCommon() {
        return this.common;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Unique getUnique() {
        return this.unique;
    }

    public final DevicesResponse copy(ApiResponseErrorInterface.ErrorResponse error, ApiResponseInterface.CommonResponse common, Unique unique) {
        return new DevicesResponse(error, common, unique);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevicesResponse)) {
            return false;
        }
        DevicesResponse devicesResponse = (DevicesResponse) other;
        return Intrinsics.areEqual(this.error, devicesResponse.error) && Intrinsics.areEqual(this.common, devicesResponse.common) && Intrinsics.areEqual(this.unique, devicesResponse.unique);
    }

    public int hashCode() {
        ApiResponseErrorInterface.ErrorResponse errorResponse = this.error;
        int iHashCode = (errorResponse == null ? 0 : errorResponse.hashCode()) * 31;
        ApiResponseInterface.CommonResponse commonResponse = this.common;
        int iHashCode2 = (iHashCode + (commonResponse == null ? 0 : commonResponse.hashCode())) * 31;
        Unique unique = this.unique;
        return iHashCode2 + (unique != null ? unique.hashCode() : 0);
    }

    public String toString() {
        return "DevicesResponse(error=" + this.error + ", common=" + this.common + ", unique=" + this.unique + ")";
    }

    public DevicesResponse(ApiResponseErrorInterface.ErrorResponse errorResponse, ApiResponseInterface.CommonResponse commonResponse, Unique unique) {
        this.error = errorResponse;
        this.common = commonResponse;
        this.unique = unique;
    }

    @Override // com.medicmedia.medilink.core.network.api.response.ApiResponseErrorInterface
    public ApiResponseErrorInterface.ErrorResponse getError() {
        return this.error;
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

    /* JADX INFO: compiled from: DevicesResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/DevicesResponse$Unique;", "", "devices", "", "Lcom/medicmedia/medilink/core/network/api/response/DevicesResponse$Device;", "<init>", "(Ljava/util/List;)V", "getDevices", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Unique {
        private final List<Device> devices;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unique copy$default(Unique unique, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = unique.devices;
            }
            return unique.copy(list);
        }

        public final List<Device> component1() {
            return this.devices;
        }

        public final Unique copy(List<Device> devices) {
            Intrinsics.checkNotNullParameter(devices, "devices");
            return new Unique(devices);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unique) && Intrinsics.areEqual(this.devices, ((Unique) other).devices);
        }

        public int hashCode() {
            return this.devices.hashCode();
        }

        public String toString() {
            return "Unique(devices=" + this.devices + ")";
        }

        public Unique(List<Device> devices) {
            Intrinsics.checkNotNullParameter(devices, "devices");
            this.devices = devices;
        }

        public final List<Device> getDevices() {
            return this.devices;
        }
    }

    /* JADX INFO: compiled from: DevicesResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/DevicesResponse$Device;", "", "name", "", "key", "date", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getKey", "getDate", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Device {
        private final String date;
        private final String key;
        private final String name;

        public static /* synthetic */ Device copy$default(Device device, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = device.name;
            }
            if ((i & 2) != 0) {
                str2 = device.key;
            }
            if ((i & 4) != 0) {
                str3 = device.date;
            }
            return device.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public final Device copy(String name, String key, String date) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(date, "date");
            return new Device(name, key, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Device)) {
                return false;
            }
            Device device = (Device) other;
            return Intrinsics.areEqual(this.name, device.name) && Intrinsics.areEqual(this.key, device.key) && Intrinsics.areEqual(this.date, device.date);
        }

        public int hashCode() {
            return (((this.name.hashCode() * 31) + this.key.hashCode()) * 31) + this.date.hashCode();
        }

        public String toString() {
            return "Device(name=" + this.name + ", key=" + this.key + ", date=" + this.date + ")";
        }

        public Device(String name, String key, String date) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(date, "date");
            this.name = name;
            this.key = key;
            this.date = date;
        }

        public final String getName() {
            return this.name;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getDate() {
            return this.date;
        }
    }
}
