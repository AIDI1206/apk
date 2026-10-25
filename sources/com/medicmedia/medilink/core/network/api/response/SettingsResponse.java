package com.medicmedia.medilink.core.network.api.response;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SettingsResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u001d\u001e\u001fB%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/SettingsResponse;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface;", "Lcom/medicmedia/medilink/core/network/api/response/SettingsResponse$Unique;", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface;", "common", "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "unique", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "<init>", "(Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;Lcom/medicmedia/medilink/core/network/api/response/SettingsResponse$Unique;Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;)V", "getCommon", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseInterface$CommonResponse;", "getUnique", "()Lcom/medicmedia/medilink/core/network/api/response/SettingsResponse$Unique;", "getError", "()Lcom/medicmedia/medilink/core/network/api/response/ApiResponseErrorInterface$ErrorResponse;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Unique", "Setting", "SettingLabel", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SettingsResponse implements ApiResponseInterface<Unique>, ApiResponseErrorInterface {
    private final ApiResponseInterface.CommonResponse common;
    private final ApiResponseErrorInterface.ErrorResponse error;
    private final Unique unique;

    public static /* synthetic */ SettingsResponse copy$default(SettingsResponse settingsResponse, ApiResponseInterface.CommonResponse commonResponse, Unique unique, ApiResponseErrorInterface.ErrorResponse errorResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            commonResponse = settingsResponse.common;
        }
        if ((i & 2) != 0) {
            unique = settingsResponse.unique;
        }
        if ((i & 4) != 0) {
            errorResponse = settingsResponse.error;
        }
        return settingsResponse.copy(commonResponse, unique, errorResponse);
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

    public final SettingsResponse copy(ApiResponseInterface.CommonResponse common, Unique unique, ApiResponseErrorInterface.ErrorResponse error) {
        return new SettingsResponse(common, unique, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsResponse)) {
            return false;
        }
        SettingsResponse settingsResponse = (SettingsResponse) other;
        return Intrinsics.areEqual(this.common, settingsResponse.common) && Intrinsics.areEqual(this.unique, settingsResponse.unique) && Intrinsics.areEqual(this.error, settingsResponse.error);
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
        return "SettingsResponse(common=" + this.common + ", unique=" + this.unique + ", error=" + this.error + ")";
    }

    public SettingsResponse(ApiResponseInterface.CommonResponse commonResponse, Unique unique, ApiResponseErrorInterface.ErrorResponse errorResponse) {
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

    /* JADX INFO: compiled from: SettingsResponse.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/SettingsResponse$Unique;", "", "settings", "", "Lcom/medicmedia/medilink/core/network/api/response/SettingsResponse$Setting;", "<init>", "(Ljava/util/List;)V", "getSettings", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Unique {
        private final List<Setting> settings;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unique copy$default(Unique unique, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = unique.settings;
            }
            return unique.copy(list);
        }

        public final List<Setting> component1() {
            return this.settings;
        }

        public final Unique copy(List<Setting> settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            return new Unique(settings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Unique) && Intrinsics.areEqual(this.settings, ((Unique) other).settings);
        }

        public int hashCode() {
            return this.settings.hashCode();
        }

        public String toString() {
            return "Unique(settings=" + this.settings + ")";
        }

        public Unique(List<Setting> settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.settings = settings;
        }

        public final List<Setting> getSettings() {
            return this.settings;
        }
    }

    /* JADX INFO: compiled from: SettingsResponse.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/SettingsResponse$Setting;", "", "name", "", "key", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "description", "option", "labels", "", "Lcom/medicmedia/medilink/core/network/api/response/SettingsResponse$SettingLabel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getKey", "getType", "()I", "getDescription", "getOption", "getLabels", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Setting {
        private final String description;
        private final String key;
        private final List<SettingLabel> labels;
        private final String name;
        private final String option;
        private final int type;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Setting copy$default(Setting setting, String str, String str2, int i, String str3, String str4, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = setting.name;
            }
            if ((i2 & 2) != 0) {
                str2 = setting.key;
            }
            if ((i2 & 4) != 0) {
                i = setting.type;
            }
            if ((i2 & 8) != 0) {
                str3 = setting.description;
            }
            if ((i2 & 16) != 0) {
                str4 = setting.option;
            }
            if ((i2 & 32) != 0) {
                list = setting.labels;
            }
            String str5 = str4;
            List list2 = list;
            return setting.copy(str, str2, i, str3, str5, list2);
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
        public final int getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getOption() {
            return this.option;
        }

        public final List<SettingLabel> component6() {
            return this.labels;
        }

        public final Setting copy(String name, String key, int type, String description, String option, List<SettingLabel> labels) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(key, "key");
            return new Setting(name, key, type, description, option, labels);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Setting)) {
                return false;
            }
            Setting setting = (Setting) other;
            return Intrinsics.areEqual(this.name, setting.name) && Intrinsics.areEqual(this.key, setting.key) && this.type == setting.type && Intrinsics.areEqual(this.description, setting.description) && Intrinsics.areEqual(this.option, setting.option) && Intrinsics.areEqual(this.labels, setting.labels);
        }

        public int hashCode() {
            int iHashCode = ((((this.name.hashCode() * 31) + this.key.hashCode()) * 31) + Integer.hashCode(this.type)) * 31;
            String str = this.description;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.option;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<SettingLabel> list = this.labels;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Setting(name=" + this.name + ", key=" + this.key + ", type=" + this.type + ", description=" + this.description + ", option=" + this.option + ", labels=" + this.labels + ")";
        }

        public Setting(String name, String key, int i, String str, String str2, List<SettingLabel> list) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(key, "key");
            this.name = name;
            this.key = key;
            this.type = i;
            this.description = str;
            this.option = str2;
            this.labels = list;
        }

        public final String getName() {
            return this.name;
        }

        public final String getKey() {
            return this.key;
        }

        public final int getType() {
            return this.type;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getOption() {
            return this.option;
        }

        public final List<SettingLabel> getLabels() {
            return this.labels;
        }
    }

    /* JADX INFO: compiled from: SettingsResponse.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/response/SettingsResponse$SettingLabel;", "", Constants.ScionAnalytics.PARAM_LABEL, "", "date", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getDate", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SettingLabel {
        private final String date;
        private final String label;

        public static /* synthetic */ SettingLabel copy$default(SettingLabel settingLabel, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = settingLabel.label;
            }
            if ((i & 2) != 0) {
                str2 = settingLabel.date;
            }
            return settingLabel.copy(str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public final SettingLabel copy(String label, String date) {
            return new SettingLabel(label, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingLabel)) {
                return false;
            }
            SettingLabel settingLabel = (SettingLabel) other;
            return Intrinsics.areEqual(this.label, settingLabel.label) && Intrinsics.areEqual(this.date, settingLabel.date);
        }

        public int hashCode() {
            String str = this.label;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.date;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "SettingLabel(label=" + this.label + ", date=" + this.date + ")";
        }

        public SettingLabel(String str, String str2) {
            this.label = str;
            this.date = str2;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getDate() {
            return this.date;
        }
    }
}
