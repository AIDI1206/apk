package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BookShelfViewItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentsEditItem;", "Lcom/medicmedia/medilink/domain/model/RecyclerViewItem;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/domain/model/ContentsEditType;", "titleId", "", "<init>", "(Lcom/medicmedia/medilink/domain/model/ContentsEditType;I)V", "getType", "()Lcom/medicmedia/medilink/domain/model/ContentsEditType;", "getTitleId", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsEditItem extends RecyclerViewItem {
    private final int titleId;
    private final ContentsEditType type;

    public static /* synthetic */ ContentsEditItem copy$default(ContentsEditItem contentsEditItem, ContentsEditType contentsEditType, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            contentsEditType = contentsEditItem.type;
        }
        if ((i2 & 2) != 0) {
            i = contentsEditItem.titleId;
        }
        return contentsEditItem.copy(contentsEditType, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ContentsEditType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTitleId() {
        return this.titleId;
    }

    public final ContentsEditItem copy(ContentsEditType type, int titleId) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new ContentsEditItem(type, titleId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentsEditItem)) {
            return false;
        }
        ContentsEditItem contentsEditItem = (ContentsEditItem) other;
        return this.type == contentsEditItem.type && this.titleId == contentsEditItem.titleId;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + Integer.hashCode(this.titleId);
    }

    public String toString() {
        return "ContentsEditItem(type=" + this.type + ", titleId=" + this.titleId + ")";
    }

    public final ContentsEditType getType() {
        return this.type;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentsEditItem(ContentsEditType type, int i) {
        super(ContentsItemLevel.TOP.getValue());
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.titleId = i;
    }
}
