package com.medicmedia.medilink.database.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BookShelfItemExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/database/models/ChipItem;", "", "name", "", "value", "", "filterMode", "<init>", "(Ljava/lang/String;II)V", "getName", "()Ljava/lang/String;", "getValue", "()I", "getFilterMode", "setFilterMode", "(I)V", "isOn", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChipItem {
    private int filterMode;

    @SerializedName("name")
    private final String name;

    @SerializedName("value")
    private final int value;

    public static /* synthetic */ ChipItem copy$default(ChipItem chipItem, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = chipItem.name;
        }
        if ((i3 & 2) != 0) {
            i = chipItem.value;
        }
        if ((i3 & 4) != 0) {
            i2 = chipItem.filterMode;
        }
        return chipItem.copy(str, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getFilterMode() {
        return this.filterMode;
    }

    public final ChipItem copy(String name, int value, int filterMode) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ChipItem(name, value, filterMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChipItem)) {
            return false;
        }
        ChipItem chipItem = (ChipItem) other;
        return Intrinsics.areEqual(this.name, chipItem.name) && this.value == chipItem.value && this.filterMode == chipItem.filterMode;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + Integer.hashCode(this.value)) * 31) + Integer.hashCode(this.filterMode);
    }

    public String toString() {
        return "ChipItem(name=" + this.name + ", value=" + this.value + ", filterMode=" + this.filterMode + ")";
    }

    public ChipItem(String name, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = i;
        this.filterMode = i2;
    }

    public /* synthetic */ ChipItem(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 4) != 0 ? 0 : i2);
    }

    public final String getName() {
        return this.name;
    }

    public final int getValue() {
        return this.value;
    }

    public final int getFilterMode() {
        return this.filterMode;
    }

    public final void setFilterMode(int i) {
        this.filterMode = i;
    }

    public final boolean isOn() {
        return this.value == this.filterMode;
    }
}
