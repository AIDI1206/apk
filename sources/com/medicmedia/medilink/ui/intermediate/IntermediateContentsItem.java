package com.medicmedia.medilink.ui.intermediate;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.domain.BundleKey;
import com.medicmedia.medilink.domain.model.MultiLevelViewItem;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: IntermediatePageItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u001bH×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/ui/intermediate/IntermediateContentsItem;", "Lcom/medicmedia/medilink/domain/model/MultiLevelViewItem;", HistoryRepositoryImpl.FieldName.TITLE, "", "mode", "detail", BundleKey.THUMBNAIL, "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMode", "getDetail", "getThumbnail", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class IntermediateContentsItem extends MultiLevelViewItem {
    public static final int $stable = 0;
    private final String detail;
    private final String mode;
    private final String thumbnail;
    private final String title;
    private final String url;

    public static /* synthetic */ IntermediateContentsItem copy$default(IntermediateContentsItem intermediateContentsItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = intermediateContentsItem.title;
        }
        if ((i & 2) != 0) {
            str2 = intermediateContentsItem.mode;
        }
        if ((i & 4) != 0) {
            str3 = intermediateContentsItem.detail;
        }
        if ((i & 8) != 0) {
            str4 = intermediateContentsItem.thumbnail;
        }
        if ((i & 16) != 0) {
            str5 = intermediateContentsItem.url;
        }
        String str6 = str5;
        String str7 = str3;
        return intermediateContentsItem.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final IntermediateContentsItem copy(String title, String mode, String detail, String thumbnail, String url) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new IntermediateContentsItem(title, mode, detail, thumbnail, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntermediateContentsItem)) {
            return false;
        }
        IntermediateContentsItem intermediateContentsItem = (IntermediateContentsItem) other;
        return Intrinsics.areEqual(this.title, intermediateContentsItem.title) && Intrinsics.areEqual(this.mode, intermediateContentsItem.mode) && Intrinsics.areEqual(this.detail, intermediateContentsItem.detail) && Intrinsics.areEqual(this.thumbnail, intermediateContentsItem.thumbnail) && Intrinsics.areEqual(this.url, intermediateContentsItem.url);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.mode.hashCode()) * 31) + this.detail.hashCode()) * 31;
        String str = this.thumbnail;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "IntermediateContentsItem(title=" + this.title + ", mode=" + this.mode + ", detail=" + this.detail + ", thumbnail=" + this.thumbnail + ", url=" + this.url + ")";
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMode() {
        return this.mode;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IntermediateContentsItem(String title, String mode, String detail, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(detail, "detail");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        super(string, IntermediateItemLevel.CONTENTS.getValue());
        this.title = title;
        this.mode = mode;
        this.detail = detail;
        this.thumbnail = str;
        this.url = str2;
    }
}
