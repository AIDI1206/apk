package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SuggestItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SuggestItem;", "", "value", "", "docCount", "", "record", "system", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getValue", "()Ljava/lang/String;", "getDocCount", "()I", "getRecord", "getSystem", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SuggestItem {
    private final int docCount;
    private final String record;
    private final boolean system;
    private final String value;

    public SuggestItem() {
        this(null, 0, null, false, 15, null);
    }

    public static /* synthetic */ SuggestItem copy$default(SuggestItem suggestItem, String str, int i, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = suggestItem.value;
        }
        if ((i2 & 2) != 0) {
            i = suggestItem.docCount;
        }
        if ((i2 & 4) != 0) {
            str2 = suggestItem.record;
        }
        if ((i2 & 8) != 0) {
            z = suggestItem.system;
        }
        return suggestItem.copy(str, i, str2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDocCount() {
        return this.docCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRecord() {
        return this.record;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSystem() {
        return this.system;
    }

    public final SuggestItem copy(String value, int docCount, String record, boolean system) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(record, "record");
        return new SuggestItem(value, docCount, record, system);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestItem)) {
            return false;
        }
        SuggestItem suggestItem = (SuggestItem) other;
        return Intrinsics.areEqual(this.value, suggestItem.value) && this.docCount == suggestItem.docCount && Intrinsics.areEqual(this.record, suggestItem.record) && this.system == suggestItem.system;
    }

    public int hashCode() {
        return (((((this.value.hashCode() * 31) + Integer.hashCode(this.docCount)) * 31) + this.record.hashCode()) * 31) + Boolean.hashCode(this.system);
    }

    public String toString() {
        return "SuggestItem(value=" + this.value + ", docCount=" + this.docCount + ", record=" + this.record + ", system=" + this.system + ")";
    }

    public SuggestItem(String value, int i, String record, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(record, "record");
        this.value = value;
        this.docCount = i;
        this.record = record;
        this.system = z;
    }

    public /* synthetic */ SuggestItem(String str, int i, String str2, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? false : z);
    }

    public final String getValue() {
        return this.value;
    }

    public final int getDocCount() {
        return this.docCount;
    }

    public final String getRecord() {
        return this.record;
    }

    public final boolean getSystem() {
        return this.system;
    }
}
