package com.medicmedia.medilink.ui.intermediate;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.model.MultiLevelViewItem;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntermediatePageItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/intermediate/IntermediateSectionItem;", "Lcom/medicmedia/medilink/domain/model/MultiLevelViewItem;", HistoryRepositoryImpl.FieldName.TITLE, "", "<init>", "(Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class IntermediateSectionItem extends MultiLevelViewItem {
    public static final int $stable = 0;
    private final String title;

    public static /* synthetic */ IntermediateSectionItem copy$default(IntermediateSectionItem intermediateSectionItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = intermediateSectionItem.title;
        }
        return intermediateSectionItem.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final IntermediateSectionItem copy(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new IntermediateSectionItem(title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IntermediateSectionItem) && Intrinsics.areEqual(this.title, ((IntermediateSectionItem) other).title);
    }

    public int hashCode() {
        return this.title.hashCode();
    }

    public String toString() {
        return "IntermediateSectionItem(title=" + this.title + ")";
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntermediateSectionItem(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        super(string, IntermediateItemLevel.SECTION.getValue());
        this.title = title;
    }
}
