package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: ContentsEditListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentsEditListItem;", "Lcom/medicmedia/medilink/domain/model/MultiLevelViewItem;", "titleId", "", "<init>", "(I)V", "getTitleId", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsEditListItem extends MultiLevelViewItem {
    private final int titleId;

    public static /* synthetic */ ContentsEditListItem copy$default(ContentsEditListItem contentsEditListItem, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contentsEditListItem.titleId;
        }
        return contentsEditListItem.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTitleId() {
        return this.titleId;
    }

    public final ContentsEditListItem copy(int titleId) {
        return new ContentsEditListItem(titleId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContentsEditListItem) && this.titleId == ((ContentsEditListItem) other).titleId;
    }

    public int hashCode() {
        return Integer.hashCode(this.titleId);
    }

    public String toString() {
        return "ContentsEditListItem(titleId=" + this.titleId + ")";
    }

    public final int getTitleId() {
        return this.titleId;
    }

    public ContentsEditListItem(int i) {
        super(String.valueOf(i), ContentsItemLevel.TOP.getValue());
        this.titleId = i;
    }
}
