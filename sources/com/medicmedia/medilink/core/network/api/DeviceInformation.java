package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StoreApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003Jw\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006."}, d2 = {"Lcom/medicmedia/medilink/core/network/api/DeviceInformation;", "", "carrierName", "", "mobileCountryCode", "mobileNetworkCode", "isoCountryCode", "allowsVoip", "systemVersion", "deviceModel", "deviceOs", "languageSetting", "fcmTokenId", "deviceKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCarrierName", "()Ljava/lang/String;", "getMobileCountryCode", "getMobileNetworkCode", "getIsoCountryCode", "getAllowsVoip", "getSystemVersion", "getDeviceModel", "getDeviceOs", "getLanguageSetting", "getFcmTokenId", "getDeviceKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DeviceInformation {
    private final String allowsVoip;
    private final String carrierName;
    private final String deviceKey;
    private final String deviceModel;
    private final String deviceOs;
    private final String fcmTokenId;
    private final String isoCountryCode;
    private final String languageSetting;
    private final String mobileCountryCode;
    private final String mobileNetworkCode;
    private final String systemVersion;

    public static /* synthetic */ DeviceInformation copy$default(DeviceInformation deviceInformation, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceInformation.carrierName;
        }
        if ((i & 2) != 0) {
            str2 = deviceInformation.mobileCountryCode;
        }
        if ((i & 4) != 0) {
            str3 = deviceInformation.mobileNetworkCode;
        }
        if ((i & 8) != 0) {
            str4 = deviceInformation.isoCountryCode;
        }
        if ((i & 16) != 0) {
            str5 = deviceInformation.allowsVoip;
        }
        if ((i & 32) != 0) {
            str6 = deviceInformation.systemVersion;
        }
        if ((i & 64) != 0) {
            str7 = deviceInformation.deviceModel;
        }
        if ((i & 128) != 0) {
            str8 = deviceInformation.deviceOs;
        }
        if ((i & 256) != 0) {
            str9 = deviceInformation.languageSetting;
        }
        if ((i & 512) != 0) {
            str10 = deviceInformation.fcmTokenId;
        }
        if ((i & 1024) != 0) {
            str11 = deviceInformation.deviceKey;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return deviceInformation.copy(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCarrierName() {
        return this.carrierName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFcmTokenId() {
        return this.fcmTokenId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDeviceKey() {
        return this.deviceKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMobileNetworkCode() {
        return this.mobileNetworkCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAllowsVoip() {
        return this.allowsVoip;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSystemVersion() {
        return this.systemVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceOs() {
        return this.deviceOs;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLanguageSetting() {
        return this.languageSetting;
    }

    public final DeviceInformation copy(String carrierName, String mobileCountryCode, String mobileNetworkCode, String isoCountryCode, String allowsVoip, String systemVersion, String deviceModel, String deviceOs, String languageSetting, String fcmTokenId, String deviceKey) {
        Intrinsics.checkNotNullParameter(carrierName, "carrierName");
        Intrinsics.checkNotNullParameter(mobileCountryCode, "mobileCountryCode");
        Intrinsics.checkNotNullParameter(mobileNetworkCode, "mobileNetworkCode");
        Intrinsics.checkNotNullParameter(isoCountryCode, "isoCountryCode");
        Intrinsics.checkNotNullParameter(allowsVoip, "allowsVoip");
        Intrinsics.checkNotNullParameter(systemVersion, "systemVersion");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceOs, "deviceOs");
        Intrinsics.checkNotNullParameter(languageSetting, "languageSetting");
        Intrinsics.checkNotNullParameter(fcmTokenId, "fcmTokenId");
        Intrinsics.checkNotNullParameter(deviceKey, "deviceKey");
        return new DeviceInformation(carrierName, mobileCountryCode, mobileNetworkCode, isoCountryCode, allowsVoip, systemVersion, deviceModel, deviceOs, languageSetting, fcmTokenId, deviceKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInformation)) {
            return false;
        }
        DeviceInformation deviceInformation = (DeviceInformation) other;
        return Intrinsics.areEqual(this.carrierName, deviceInformation.carrierName) && Intrinsics.areEqual(this.mobileCountryCode, deviceInformation.mobileCountryCode) && Intrinsics.areEqual(this.mobileNetworkCode, deviceInformation.mobileNetworkCode) && Intrinsics.areEqual(this.isoCountryCode, deviceInformation.isoCountryCode) && Intrinsics.areEqual(this.allowsVoip, deviceInformation.allowsVoip) && Intrinsics.areEqual(this.systemVersion, deviceInformation.systemVersion) && Intrinsics.areEqual(this.deviceModel, deviceInformation.deviceModel) && Intrinsics.areEqual(this.deviceOs, deviceInformation.deviceOs) && Intrinsics.areEqual(this.languageSetting, deviceInformation.languageSetting) && Intrinsics.areEqual(this.fcmTokenId, deviceInformation.fcmTokenId) && Intrinsics.areEqual(this.deviceKey, deviceInformation.deviceKey);
    }

    public int hashCode() {
        return (((((((((((((((((((this.carrierName.hashCode() * 31) + this.mobileCountryCode.hashCode()) * 31) + this.mobileNetworkCode.hashCode()) * 31) + this.isoCountryCode.hashCode()) * 31) + this.allowsVoip.hashCode()) * 31) + this.systemVersion.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.deviceOs.hashCode()) * 31) + this.languageSetting.hashCode()) * 31) + this.fcmTokenId.hashCode()) * 31) + this.deviceKey.hashCode();
    }

    public String toString() {
        return "DeviceInformation(carrierName=" + this.carrierName + ", mobileCountryCode=" + this.mobileCountryCode + ", mobileNetworkCode=" + this.mobileNetworkCode + ", isoCountryCode=" + this.isoCountryCode + ", allowsVoip=" + this.allowsVoip + ", systemVersion=" + this.systemVersion + ", deviceModel=" + this.deviceModel + ", deviceOs=" + this.deviceOs + ", languageSetting=" + this.languageSetting + ", fcmTokenId=" + this.fcmTokenId + ", deviceKey=" + this.deviceKey + ")";
    }

    public DeviceInformation(String carrierName, String mobileCountryCode, String mobileNetworkCode, String isoCountryCode, String allowsVoip, String systemVersion, String deviceModel, String deviceOs, String languageSetting, String fcmTokenId, String deviceKey) {
        Intrinsics.checkNotNullParameter(carrierName, "carrierName");
        Intrinsics.checkNotNullParameter(mobileCountryCode, "mobileCountryCode");
        Intrinsics.checkNotNullParameter(mobileNetworkCode, "mobileNetworkCode");
        Intrinsics.checkNotNullParameter(isoCountryCode, "isoCountryCode");
        Intrinsics.checkNotNullParameter(allowsVoip, "allowsVoip");
        Intrinsics.checkNotNullParameter(systemVersion, "systemVersion");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceOs, "deviceOs");
        Intrinsics.checkNotNullParameter(languageSetting, "languageSetting");
        Intrinsics.checkNotNullParameter(fcmTokenId, "fcmTokenId");
        Intrinsics.checkNotNullParameter(deviceKey, "deviceKey");
        this.carrierName = carrierName;
        this.mobileCountryCode = mobileCountryCode;
        this.mobileNetworkCode = mobileNetworkCode;
        this.isoCountryCode = isoCountryCode;
        this.allowsVoip = allowsVoip;
        this.systemVersion = systemVersion;
        this.deviceModel = deviceModel;
        this.deviceOs = deviceOs;
        this.languageSetting = languageSetting;
        this.fcmTokenId = fcmTokenId;
        this.deviceKey = deviceKey;
    }

    public /* synthetic */ DeviceInformation(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, str6, str7, (i & 128) != 0 ? "Android" : str8, str9, str10, str11);
    }

    public final String getCarrierName() {
        return this.carrierName;
    }

    public final String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    public final String getMobileNetworkCode() {
        return this.mobileNetworkCode;
    }

    public final String getIsoCountryCode() {
        return this.isoCountryCode;
    }

    public final String getAllowsVoip() {
        return this.allowsVoip;
    }

    public final String getSystemVersion() {
        return this.systemVersion;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceOs() {
        return this.deviceOs;
    }

    public final String getLanguageSetting() {
        return this.languageSetting;
    }

    public final String getFcmTokenId() {
        return this.fcmTokenId;
    }

    public final String getDeviceKey() {
        return this.deviceKey;
    }
}
