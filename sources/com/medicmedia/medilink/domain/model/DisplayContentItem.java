package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QrContentsItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/domain/model/DisplayContentItem;", "", "titleName", "", "mode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitleName", "()Ljava/lang/String;", "getMode", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class DisplayContentItem {
    private final String mode;

    @SerializedName("title_name")
    private final String titleName;

    public static /* synthetic */ DisplayContentItem copy$default(DisplayContentItem displayContentItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayContentItem.titleName;
        }
        if ((i & 2) != 0) {
            str2 = displayContentItem.mode;
        }
        return displayContentItem.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleName() {
        return this.titleName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    public final DisplayContentItem copy(String titleName, String mode) {
        Intrinsics.checkNotNullParameter(titleName, "titleName");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new DisplayContentItem(titleName, mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayContentItem)) {
            return false;
        }
        DisplayContentItem displayContentItem = (DisplayContentItem) other;
        return Intrinsics.areEqual(this.titleName, displayContentItem.titleName) && Intrinsics.areEqual(this.mode, displayContentItem.mode);
    }

    public int hashCode() {
        return (this.titleName.hashCode() * 31) + this.mode.hashCode();
    }

    public String toString() {
        return "DisplayContentItem(titleName=" + this.titleName + ", mode=" + this.mode + ")";
    }

    public DisplayContentItem(String titleName, String mode) {
        Intrinsics.checkNotNullParameter(titleName, "titleName");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.titleName = titleName;
        this.mode = mode;
    }

    public final String getTitleName() {
        return this.titleName;
    }

    public final String getMode() {
        return this.mode;
    }
}
