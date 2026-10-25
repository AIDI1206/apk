package com.medicmedia.medilink.ui.settings;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.google.firebase.messaging.Constants;
import com.medicmedia.medilink.domain.model.SettingsItemLabel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SettingsConfig.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J=\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÇ\u0001J\u0013\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010#\u001a\u00020\u0005H×\u0001J\t\u0010$\u001a\u00020%H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001a¨\u0006&"}, d2 = {"Lcom/medicmedia/medilink/ui/settings/SettingDefinition;", "", "id", "Lcom/medicmedia/medilink/ui/settings/SettingId;", "titleId", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/ui/settings/SettingType;", "option", "Lcom/medicmedia/medilink/ui/settings/SettingOption;", Constants.ScionAnalytics.PARAM_LABEL, "Lcom/medicmedia/medilink/domain/model/SettingsItemLabel;", "<init>", "(Lcom/medicmedia/medilink/ui/settings/SettingId;ILcom/medicmedia/medilink/ui/settings/SettingType;Lcom/medicmedia/medilink/ui/settings/SettingOption;Lcom/medicmedia/medilink/domain/model/SettingsItemLabel;)V", "getId", "()Lcom/medicmedia/medilink/ui/settings/SettingId;", "getTitleId", "()I", "getType", "()Lcom/medicmedia/medilink/ui/settings/SettingType;", "getOption", "()Lcom/medicmedia/medilink/ui/settings/SettingOption;", "getLabel", "()Lcom/medicmedia/medilink/domain/model/SettingsItemLabel;", "isShowArrow", "", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SettingDefinition {
    public static final int $stable = 8;
    private final SettingId id;
    private final SettingsItemLabel label;
    private final SettingOption option;
    private final int titleId;
    private final SettingType type;

    public static /* synthetic */ SettingDefinition copy$default(SettingDefinition settingDefinition, SettingId settingId, int i, SettingType settingType, SettingOption settingOption, SettingsItemLabel settingsItemLabel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            settingId = settingDefinition.id;
        }
        if ((i2 & 2) != 0) {
            i = settingDefinition.titleId;
        }
        if ((i2 & 4) != 0) {
            settingType = settingDefinition.type;
        }
        if ((i2 & 8) != 0) {
            settingOption = settingDefinition.option;
        }
        if ((i2 & 16) != 0) {
            settingsItemLabel = settingDefinition.label;
        }
        SettingsItemLabel settingsItemLabel2 = settingsItemLabel;
        SettingType settingType2 = settingType;
        return settingDefinition.copy(settingId, i, settingType2, settingOption, settingsItemLabel2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SettingId getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTitleId() {
        return this.titleId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SettingType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SettingOption getOption() {
        return this.option;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SettingsItemLabel getLabel() {
        return this.label;
    }

    public final SettingDefinition copy(SettingId id, int titleId, SettingType type, SettingOption option, SettingsItemLabel label) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(option, "option");
        return new SettingDefinition(id, titleId, type, option, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingDefinition)) {
            return false;
        }
        SettingDefinition settingDefinition = (SettingDefinition) other;
        return this.id == settingDefinition.id && this.titleId == settingDefinition.titleId && this.type == settingDefinition.type && Intrinsics.areEqual(this.option, settingDefinition.option) && Intrinsics.areEqual(this.label, settingDefinition.label);
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + Integer.hashCode(this.titleId)) * 31) + this.type.hashCode()) * 31) + this.option.hashCode()) * 31;
        SettingsItemLabel settingsItemLabel = this.label;
        return iHashCode + (settingsItemLabel == null ? 0 : settingsItemLabel.hashCode());
    }

    public String toString() {
        return "SettingDefinition(id=" + this.id + ", titleId=" + this.titleId + ", type=" + this.type + ", option=" + this.option + ", label=" + this.label + ")";
    }

    public SettingDefinition(SettingId id, int i, SettingType type, SettingOption option, SettingsItemLabel settingsItemLabel) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(option, "option");
        this.id = id;
        this.titleId = i;
        this.type = type;
        this.option = option;
        this.label = settingsItemLabel;
    }

    public final SettingId getId() {
        return this.id;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    public /* synthetic */ SettingDefinition(SettingId settingId, int i, SettingType settingType, SettingOption settingOption, SettingsItemLabel settingsItemLabel, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(settingId, i, (i2 & 4) != 0 ? SettingType.DIALOG : settingType, (i2 & 8) != 0 ? new SettingOption(null, 0, 3, null) : settingOption, (i2 & 16) != 0 ? null : settingsItemLabel);
    }

    public final SettingType getType() {
        return this.type;
    }

    public final SettingOption getOption() {
        return this.option;
    }

    public final SettingsItemLabel getLabel() {
        return this.label;
    }

    public final boolean isShowArrow() {
        return this.type == SettingType.TRANSITION || this.id == SettingId.TermsOfService || this.id == SettingId.Withdrawal;
    }
}
