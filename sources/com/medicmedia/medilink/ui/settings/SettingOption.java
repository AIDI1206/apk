package com.medicmedia.medilink.ui.settings;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SettingsConfig.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0005H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/ui/settings/SettingOption;", "", "url", "", "sort", "", "<init>", "(Ljava/lang/String;I)V", "getUrl", "()Ljava/lang/String;", "getSort", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SettingOption {
    public static final int $stable = 0;
    private final int sort;
    private final String url;

    public SettingOption() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SettingOption copy$default(SettingOption settingOption, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = settingOption.url;
        }
        if ((i2 & 2) != 0) {
            i = settingOption.sort;
        }
        return settingOption.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    public final SettingOption copy(String url, int sort) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new SettingOption(url, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingOption)) {
            return false;
        }
        SettingOption settingOption = (SettingOption) other;
        return Intrinsics.areEqual(this.url, settingOption.url) && this.sort == settingOption.sort;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + Integer.hashCode(this.sort);
    }

    public String toString() {
        return "SettingOption(url=" + this.url + ", sort=" + this.sort + ")";
    }

    public SettingOption(String url, int i) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.sort = i;
    }

    public /* synthetic */ SettingOption(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getSort() {
        return this.sort;
    }
}
