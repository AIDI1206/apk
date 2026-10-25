package com.medicmedia.medilink.database.models;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BookShelfItemExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/database/models/ChipItems;", "", "filterArray", "", "Lcom/medicmedia/medilink/database/models/ChipItem;", "<init>", "(Ljava/util/List;)V", "getFilterArray", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "database_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ChipItems {

    @SerializedName("filter_array")
    private final List<ChipItem> filterArray;

    public ChipItems() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChipItems copy$default(ChipItems chipItems, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = chipItems.filterArray;
        }
        return chipItems.copy(list);
    }

    public final List<ChipItem> component1() {
        return this.filterArray;
    }

    public final ChipItems copy(List<ChipItem> filterArray) {
        Intrinsics.checkNotNullParameter(filterArray, "filterArray");
        return new ChipItems(filterArray);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChipItems) && Intrinsics.areEqual(this.filterArray, ((ChipItems) other).filterArray);
    }

    public int hashCode() {
        return this.filterArray.hashCode();
    }

    public String toString() {
        return "ChipItems(filterArray=" + this.filterArray + ")";
    }

    public ChipItems(List<ChipItem> filterArray) {
        Intrinsics.checkNotNullParameter(filterArray, "filterArray");
        this.filterArray = filterArray;
    }

    public final List<ChipItem> getFilterArray() {
        return this.filterArray;
    }

    public /* synthetic */ ChipItems(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }
}
