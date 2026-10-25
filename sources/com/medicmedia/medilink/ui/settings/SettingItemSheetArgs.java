package com.medicmedia.medilink.ui.settings;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.medicmedia.medilink.domain.model.SettingsItemLabel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SettingsViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\t\u0010\u0018\u001a\u00020\u0019H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/settings/SettingItemSheetArgs;", "", "titleId", "", FirebaseAnalytics.Param.ITEMS, "", "Lcom/medicmedia/medilink/domain/model/SettingsItemLabel;", "currentValue", "<init>", "(ILjava/util/List;Lcom/medicmedia/medilink/domain/model/SettingsItemLabel;)V", "getTitleId", "()I", "getItems", "()Ljava/util/List;", "getCurrentValue", "()Lcom/medicmedia/medilink/domain/model/SettingsItemLabel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SettingItemSheetArgs {
    public static final int $stable = 8;
    private final SettingsItemLabel currentValue;
    private final List<SettingsItemLabel> items;
    private final int titleId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SettingItemSheetArgs copy$default(SettingItemSheetArgs settingItemSheetArgs, int i, List list, SettingsItemLabel settingsItemLabel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = settingItemSheetArgs.titleId;
        }
        if ((i2 & 2) != 0) {
            list = settingItemSheetArgs.items;
        }
        if ((i2 & 4) != 0) {
            settingsItemLabel = settingItemSheetArgs.currentValue;
        }
        return settingItemSheetArgs.copy(i, list, settingsItemLabel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTitleId() {
        return this.titleId;
    }

    public final List<SettingsItemLabel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SettingsItemLabel getCurrentValue() {
        return this.currentValue;
    }

    public final SettingItemSheetArgs copy(int titleId, List<? extends SettingsItemLabel> items, SettingsItemLabel currentValue) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        return new SettingItemSheetArgs(titleId, items, currentValue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingItemSheetArgs)) {
            return false;
        }
        SettingItemSheetArgs settingItemSheetArgs = (SettingItemSheetArgs) other;
        return this.titleId == settingItemSheetArgs.titleId && Intrinsics.areEqual(this.items, settingItemSheetArgs.items) && Intrinsics.areEqual(this.currentValue, settingItemSheetArgs.currentValue);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.titleId) * 31) + this.items.hashCode()) * 31) + this.currentValue.hashCode();
    }

    public String toString() {
        return "SettingItemSheetArgs(titleId=" + this.titleId + ", items=" + this.items + ", currentValue=" + this.currentValue + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingItemSheetArgs(int i, List<? extends SettingsItemLabel> items, SettingsItemLabel currentValue) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        this.titleId = i;
        this.items = items;
        this.currentValue = currentValue;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    public final List<SettingsItemLabel> getItems() {
        return this.items;
    }

    public final SettingsItemLabel getCurrentValue() {
        return this.currentValue;
    }
}
