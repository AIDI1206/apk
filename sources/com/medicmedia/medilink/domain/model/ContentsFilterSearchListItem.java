package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsFilterListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB-\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentsFilterSearchListItem;", "Lcom/medicmedia/medilink/domain/model/ContentsFilterListItem;", "contents", "", "", "isPurchase", "", AnalyticsEvent.Param.OPERATION, "<init>", "(Ljava/util/Set;ZLjava/lang/String;)V", "getContents", "()Ljava/util/Set;", "()Z", "getOperation", "()Ljava/lang/String;", "isAllContents", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsFilterSearchListItem implements ContentsFilterListItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Set<String> contents;
    private final boolean isPurchase;
    private final String operation;

    public ContentsFilterSearchListItem() {
        this(null, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentsFilterSearchListItem copy$default(ContentsFilterSearchListItem contentsFilterSearchListItem, Set set, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            set = contentsFilterSearchListItem.contents;
        }
        if ((i & 2) != 0) {
            z = contentsFilterSearchListItem.isPurchase;
        }
        if ((i & 4) != 0) {
            str = contentsFilterSearchListItem.operation;
        }
        return contentsFilterSearchListItem.copy(set, z, str);
    }

    public final Set<String> component1() {
        return this.contents;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsPurchase() {
        return this.isPurchase;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOperation() {
        return this.operation;
    }

    public final ContentsFilterSearchListItem copy(Set<String> contents, boolean isPurchase, String operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return new ContentsFilterSearchListItem(contents, isPurchase, operation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentsFilterSearchListItem)) {
            return false;
        }
        ContentsFilterSearchListItem contentsFilterSearchListItem = (ContentsFilterSearchListItem) other;
        return Intrinsics.areEqual(this.contents, contentsFilterSearchListItem.contents) && this.isPurchase == contentsFilterSearchListItem.isPurchase && Intrinsics.areEqual(this.operation, contentsFilterSearchListItem.operation);
    }

    public int hashCode() {
        Set<String> set = this.contents;
        return ((((set == null ? 0 : set.hashCode()) * 31) + Boolean.hashCode(this.isPurchase)) * 31) + this.operation.hashCode();
    }

    public String toString() {
        return "ContentsFilterSearchListItem(contents=" + this.contents + ", isPurchase=" + this.isPurchase + ", operation=" + this.operation + ")";
    }

    public ContentsFilterSearchListItem(Set<String> set, boolean z, String operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.contents = set;
        this.isPurchase = z;
        this.operation = operation;
    }

    @Override // com.medicmedia.medilink.domain.model.ContentsFilterListItem
    public Set<String> getContents() {
        return this.contents;
    }

    public final boolean isPurchase() {
        return this.isPurchase;
    }

    public /* synthetic */ ContentsFilterSearchListItem(Set set, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : set, (i & 2) != 0 ? true : z, (i & 4) != 0 ? SearchOperation.AND.getValue() : str);
    }

    public final String getOperation() {
        return this.operation;
    }

    /* JADX INFO: compiled from: ContentsFilterListItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentsFilterSearchListItem$Companion;", "", "<init>", "()V", "convertTo", "Lcom/medicmedia/medilink/domain/model/ContentsFilterSearchListItem;", "jsonString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentsFilterSearchListItem convertTo(String jsonString) {
            if (jsonString != null) {
                try {
                    return (ContentsFilterSearchListItem) new Gson().fromJson(jsonString, ContentsFilterSearchListItem.class);
                } catch (Exception e) {
                    Logger logger = Logger.INSTANCE;
                    String simpleName = ContentsFilterSearchListItem.INSTANCE.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    logger.error(simpleName, e);
                    return new ContentsFilterSearchListItem(null, false, null, 7, null);
                }
            }
            return new ContentsFilterSearchListItem(null, false, null, 7, null);
        }
    }

    public final boolean isAllContents() {
        return getContents() == null;
    }
}
