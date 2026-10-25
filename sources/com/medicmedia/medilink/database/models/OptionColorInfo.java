package com.medicmedia.medilink.database.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BookShelfItemExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/database/models/OptionColorInfo;", "", "secondColor", "", "thirdColor", "priorityColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSecondColor", "()Ljava/lang/String;", "getThirdColor", "getPriorityColor", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class OptionColorInfo {

    @SerializedName("priority_color")
    private final String priorityColor;

    @SerializedName("second_color")
    private final String secondColor;

    @SerializedName("third_color")
    private final String thirdColor;

    public OptionColorInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OptionColorInfo copy$default(OptionColorInfo optionColorInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionColorInfo.secondColor;
        }
        if ((i & 2) != 0) {
            str2 = optionColorInfo.thirdColor;
        }
        if ((i & 4) != 0) {
            str3 = optionColorInfo.priorityColor;
        }
        return optionColorInfo.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSecondColor() {
        return this.secondColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getThirdColor() {
        return this.thirdColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPriorityColor() {
        return this.priorityColor;
    }

    public final OptionColorInfo copy(String secondColor, String thirdColor, String priorityColor) {
        return new OptionColorInfo(secondColor, thirdColor, priorityColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionColorInfo)) {
            return false;
        }
        OptionColorInfo optionColorInfo = (OptionColorInfo) other;
        return Intrinsics.areEqual(this.secondColor, optionColorInfo.secondColor) && Intrinsics.areEqual(this.thirdColor, optionColorInfo.thirdColor) && Intrinsics.areEqual(this.priorityColor, optionColorInfo.priorityColor);
    }

    public int hashCode() {
        String str = this.secondColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.thirdColor;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.priorityColor;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "OptionColorInfo(secondColor=" + this.secondColor + ", thirdColor=" + this.thirdColor + ", priorityColor=" + this.priorityColor + ")";
    }

    public OptionColorInfo(String str, String str2, String str3) {
        this.secondColor = str;
        this.thirdColor = str2;
        this.priorityColor = str3;
    }

    public /* synthetic */ OptionColorInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final String getSecondColor() {
        return this.secondColor;
    }

    public final String getThirdColor() {
        return this.thirdColor;
    }

    public final String getPriorityColor() {
        return this.priorityColor;
    }
}
