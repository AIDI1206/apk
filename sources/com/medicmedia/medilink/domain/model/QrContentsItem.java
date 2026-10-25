package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: QrContentsItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB1\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bJ\u0006\u0010\u0012\u001a\u00020\bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QrContentsItem;", "", "displayContents", "", "Lcom/medicmedia/medilink/domain/model/DisplayContentItem;", "displayData", "Lcom/medicmedia/medilink/domain/model/DisplayDataItem;", OptionalModuleUtils.BARCODE, "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getDisplayContents", "()Ljava/util/List;", "getDisplayData", "getBarcode", "()Ljava/lang/String;", "convertToJsonFromContentItem", "convertToJsonFromDataItem", "convertToJsonString", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class QrContentsItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String barcode;
    private final List<DisplayContentItem> displayContents;
    private final List<DisplayDataItem> displayData;

    public QrContentsItem() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QrContentsItem copy$default(QrContentsItem qrContentsItem, List list, List list2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = qrContentsItem.displayContents;
        }
        if ((i & 2) != 0) {
            list2 = qrContentsItem.displayData;
        }
        if ((i & 4) != 0) {
            str = qrContentsItem.barcode;
        }
        return qrContentsItem.copy(list, list2, str);
    }

    public final List<DisplayContentItem> component1() {
        return this.displayContents;
    }

    public final List<DisplayDataItem> component2() {
        return this.displayData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBarcode() {
        return this.barcode;
    }

    public final QrContentsItem copy(List<DisplayContentItem> displayContents, List<DisplayDataItem> displayData, String barcode) {
        Intrinsics.checkNotNullParameter(displayContents, "displayContents");
        Intrinsics.checkNotNullParameter(displayData, "displayData");
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        return new QrContentsItem(displayContents, displayData, barcode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrContentsItem)) {
            return false;
        }
        QrContentsItem qrContentsItem = (QrContentsItem) other;
        return Intrinsics.areEqual(this.displayContents, qrContentsItem.displayContents) && Intrinsics.areEqual(this.displayData, qrContentsItem.displayData) && Intrinsics.areEqual(this.barcode, qrContentsItem.barcode);
    }

    public int hashCode() {
        return (((this.displayContents.hashCode() * 31) + this.displayData.hashCode()) * 31) + this.barcode.hashCode();
    }

    public String toString() {
        return "QrContentsItem(displayContents=" + this.displayContents + ", displayData=" + this.displayData + ", barcode=" + this.barcode + ")";
    }

    public QrContentsItem(List<DisplayContentItem> displayContents, List<DisplayDataItem> displayData, String barcode) {
        Intrinsics.checkNotNullParameter(displayContents, "displayContents");
        Intrinsics.checkNotNullParameter(displayData, "displayData");
        Intrinsics.checkNotNullParameter(barcode, "barcode");
        this.displayContents = displayContents;
        this.displayData = displayData;
        this.barcode = barcode;
    }

    public /* synthetic */ QrContentsItem(List list, List list2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? "" : str);
    }

    public final List<DisplayContentItem> getDisplayContents() {
        return this.displayContents;
    }

    public final List<DisplayDataItem> getDisplayData() {
        return this.displayData;
    }

    public final String getBarcode() {
        return this.barcode;
    }

    /* JADX INFO: compiled from: QrContentsItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/QrContentsItem$Companion;", "", "<init>", "()V", "convertTo", "Lcom/medicmedia/medilink/domain/model/QrContentsItem;", "jsonString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final QrContentsItem convertTo(String jsonString) {
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            try {
                return (QrContentsItem) new Gson().fromJson(jsonString, QrContentsItem.class);
            } catch (JsonSyntaxException e) {
                Logger logger = Logger.INSTANCE;
                String simpleName = getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                logger.error(simpleName, e);
                return new QrContentsItem(null, null, null, 7, null);
            }
        }
    }

    public final String convertToJsonFromContentItem() {
        String json = new Gson().toJson(this.displayContents);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    public final String convertToJsonFromDataItem() {
        String json = new Gson().toJson(this.displayData);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    public final String convertToJsonString() {
        String json = new Gson().toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }
}
