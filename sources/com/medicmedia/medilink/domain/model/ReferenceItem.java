package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReferenceItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ReferenceItem;", "", HistoryRepositoryImpl.FieldName.TITLE, "", "category", "", "message", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getCategory", "()I", "getMessage", "categoryType", "Lcom/medicmedia/medilink/domain/model/ReferenceCategoryType;", "getCategoryType", "()Lcom/medicmedia/medilink/domain/model/ReferenceCategoryType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ReferenceItem {
    private final int category;
    private final String message;
    private final String title;

    public static /* synthetic */ ReferenceItem copy$default(ReferenceItem referenceItem, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = referenceItem.title;
        }
        if ((i2 & 2) != 0) {
            i = referenceItem.category;
        }
        if ((i2 & 4) != 0) {
            str2 = referenceItem.message;
        }
        return referenceItem.copy(str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final ReferenceItem copy(String title, int category, String message) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new ReferenceItem(title, category, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReferenceItem)) {
            return false;
        }
        ReferenceItem referenceItem = (ReferenceItem) other;
        return Intrinsics.areEqual(this.title, referenceItem.title) && this.category == referenceItem.category && Intrinsics.areEqual(this.message, referenceItem.message);
    }

    public int hashCode() {
        int iHashCode = ((this.title.hashCode() * 31) + Integer.hashCode(this.category)) * 31;
        String str = this.message;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReferenceItem(title=" + this.title + ", category=" + this.category + ", message=" + this.message + ")";
    }

    public ReferenceItem(String title, int i, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.category = i;
        this.message = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getCategory() {
        return this.category;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ReferenceCategoryType getCategoryType() {
        ReferenceCategoryType next;
        Iterator<ReferenceCategoryType> it = ReferenceCategoryType.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (this.category == next.getValue()) {
                return next;
            }
        }
        next = null;
        return next;
    }
}
