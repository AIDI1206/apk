package com.medicmedia.medilink.ui.edit;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StorageUsageView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0018\u001a\u00020\u0003H×\u0001J\t\u0010\u0019\u001a\u00020\u0006H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/StorageUsageProgressItem;", "", "max", "", "progress", "usageValue", "", "isLimitOver", "", "<init>", "(IILjava/lang/String;Z)V", "getMax", "()I", "getProgress", "getUsageValue", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class StorageUsageProgressItem {
    public static final int $stable = 0;
    private final boolean isLimitOver;
    private final int max;
    private final int progress;
    private final String usageValue;

    public StorageUsageProgressItem() {
        this(0, 0, null, false, 15, null);
    }

    public static /* synthetic */ StorageUsageProgressItem copy$default(StorageUsageProgressItem storageUsageProgressItem, int i, int i2, String str, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = storageUsageProgressItem.max;
        }
        if ((i3 & 2) != 0) {
            i2 = storageUsageProgressItem.progress;
        }
        if ((i3 & 4) != 0) {
            str = storageUsageProgressItem.usageValue;
        }
        if ((i3 & 8) != 0) {
            z = storageUsageProgressItem.isLimitOver;
        }
        return storageUsageProgressItem.copy(i, i2, str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUsageValue() {
        return this.usageValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsLimitOver() {
        return this.isLimitOver;
    }

    public final StorageUsageProgressItem copy(int max, int progress, String usageValue, boolean isLimitOver) {
        Intrinsics.checkNotNullParameter(usageValue, "usageValue");
        return new StorageUsageProgressItem(max, progress, usageValue, isLimitOver);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageUsageProgressItem)) {
            return false;
        }
        StorageUsageProgressItem storageUsageProgressItem = (StorageUsageProgressItem) other;
        return this.max == storageUsageProgressItem.max && this.progress == storageUsageProgressItem.progress && Intrinsics.areEqual(this.usageValue, storageUsageProgressItem.usageValue) && this.isLimitOver == storageUsageProgressItem.isLimitOver;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.max) * 31) + Integer.hashCode(this.progress)) * 31) + this.usageValue.hashCode()) * 31) + Boolean.hashCode(this.isLimitOver);
    }

    public String toString() {
        return "StorageUsageProgressItem(max=" + this.max + ", progress=" + this.progress + ", usageValue=" + this.usageValue + ", isLimitOver=" + this.isLimitOver + ")";
    }

    public StorageUsageProgressItem(int i, int i2, String usageValue, boolean z) {
        Intrinsics.checkNotNullParameter(usageValue, "usageValue");
        this.max = i;
        this.progress = i2;
        this.usageValue = usageValue;
        this.isLimitOver = z;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getProgress() {
        return this.progress;
    }

    public /* synthetic */ StorageUsageProgressItem(int i, int i2, String str, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? false : z);
    }

    public final String getUsageValue() {
        return this.usageValue;
    }

    public final boolean isLimitOver() {
        return this.isLimitOver;
    }
}
