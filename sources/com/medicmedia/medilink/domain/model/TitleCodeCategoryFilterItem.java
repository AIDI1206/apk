package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TitleCodeCategoryFilterItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\u0014\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ@\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/domain/model/TitleCodeCategoryFilterItem;", ExifInterface.GPS_DIRECTION_TRUE, "", "titleCode", "", "category", "contentsId", "item", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getTitleCode", "()Ljava/lang/String;", "getCategory", "getContentsId", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/medicmedia/medilink/domain/model/TitleCodeCategoryFilterItem;", "equals", "", "other", "hashCode", "", "toString", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class TitleCodeCategoryFilterItem<T> {
    private final String category;
    private final String contentsId;
    private final T item;
    private final String titleCode;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TitleCodeCategoryFilterItem copy$default(TitleCodeCategoryFilterItem titleCodeCategoryFilterItem, String str, String str2, String str3, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = titleCodeCategoryFilterItem.titleCode;
        }
        if ((i & 2) != 0) {
            str2 = titleCodeCategoryFilterItem.category;
        }
        if ((i & 4) != 0) {
            str3 = titleCodeCategoryFilterItem.contentsId;
        }
        if ((i & 8) != 0) {
            obj = titleCodeCategoryFilterItem.item;
        }
        return titleCodeCategoryFilterItem.copy(str, str2, str3, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleCode() {
        return this.titleCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContentsId() {
        return this.contentsId;
    }

    public final T component4() {
        return this.item;
    }

    public final TitleCodeCategoryFilterItem<T> copy(String titleCode, String category, String contentsId, T item) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        return new TitleCodeCategoryFilterItem<>(titleCode, category, contentsId, item);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleCodeCategoryFilterItem)) {
            return false;
        }
        TitleCodeCategoryFilterItem titleCodeCategoryFilterItem = (TitleCodeCategoryFilterItem) other;
        return Intrinsics.areEqual(this.titleCode, titleCodeCategoryFilterItem.titleCode) && Intrinsics.areEqual(this.category, titleCodeCategoryFilterItem.category) && Intrinsics.areEqual(this.contentsId, titleCodeCategoryFilterItem.contentsId) && Intrinsics.areEqual(this.item, titleCodeCategoryFilterItem.item);
    }

    public int hashCode() {
        String str = this.titleCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.category;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.contentsId.hashCode()) * 31;
        T t = this.item;
        return iHashCode2 + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        return "TitleCodeCategoryFilterItem(titleCode=" + this.titleCode + ", category=" + this.category + ", contentsId=" + this.contentsId + ", item=" + this.item + ")";
    }

    public TitleCodeCategoryFilterItem(String str, String str2, String contentsId, T t) {
        Intrinsics.checkNotNullParameter(contentsId, "contentsId");
        this.titleCode = str;
        this.category = str2;
        this.contentsId = contentsId;
        this.item = t;
    }

    public final String getTitleCode() {
        return this.titleCode;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getContentsId() {
        return this.contentsId;
    }

    public final T getItem() {
        return this.item;
    }
}
