package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsFilterListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB?\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003JA\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentsFilterWritingListItem;", "Lcom/medicmedia/medilink/domain/model/ContentsFilterListItem;", "contents", "", "", "markerColors", "isBookMark", "", "isMemo", "<init>", "(Ljava/util/Set;Ljava/util/Set;ZZ)V", "getContents", "()Ljava/util/Set;", "getMarkerColors", "()Z", "isSelectedAll", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsFilterWritingListItem implements ContentsFilterListItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Set<String> contents;
    private final boolean isBookMark;
    private final boolean isMemo;
    private final Set<String> markerColors;

    public ContentsFilterWritingListItem() {
        this(null, null, false, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentsFilterWritingListItem copy$default(ContentsFilterWritingListItem contentsFilterWritingListItem, Set set, Set set2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            set = contentsFilterWritingListItem.contents;
        }
        if ((i & 2) != 0) {
            set2 = contentsFilterWritingListItem.markerColors;
        }
        if ((i & 4) != 0) {
            z = contentsFilterWritingListItem.isBookMark;
        }
        if ((i & 8) != 0) {
            z2 = contentsFilterWritingListItem.isMemo;
        }
        return contentsFilterWritingListItem.copy(set, set2, z, z2);
    }

    public final Set<String> component1() {
        return this.contents;
    }

    public final Set<String> component2() {
        return this.markerColors;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsBookMark() {
        return this.isBookMark;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsMemo() {
        return this.isMemo;
    }

    public final ContentsFilterWritingListItem copy(Set<String> contents, Set<String> markerColors, boolean isBookMark, boolean isMemo) {
        return new ContentsFilterWritingListItem(contents, markerColors, isBookMark, isMemo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentsFilterWritingListItem)) {
            return false;
        }
        ContentsFilterWritingListItem contentsFilterWritingListItem = (ContentsFilterWritingListItem) other;
        return Intrinsics.areEqual(this.contents, contentsFilterWritingListItem.contents) && Intrinsics.areEqual(this.markerColors, contentsFilterWritingListItem.markerColors) && this.isBookMark == contentsFilterWritingListItem.isBookMark && this.isMemo == contentsFilterWritingListItem.isMemo;
    }

    public int hashCode() {
        Set<String> set = this.contents;
        int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
        Set<String> set2 = this.markerColors;
        return ((((iHashCode + (set2 != null ? set2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isBookMark)) * 31) + Boolean.hashCode(this.isMemo);
    }

    public String toString() {
        return "ContentsFilterWritingListItem(contents=" + this.contents + ", markerColors=" + this.markerColors + ", isBookMark=" + this.isBookMark + ", isMemo=" + this.isMemo + ")";
    }

    public ContentsFilterWritingListItem(Set<String> set, Set<String> set2, boolean z, boolean z2) {
        this.contents = set;
        this.markerColors = set2;
        this.isBookMark = z;
        this.isMemo = z2;
    }

    public /* synthetic */ ContentsFilterWritingListItem(Set set, Set set2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : set, (i & 2) != 0 ? null : set2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
    }

    @Override // com.medicmedia.medilink.domain.model.ContentsFilterListItem
    public Set<String> getContents() {
        return this.contents;
    }

    public final Set<String> getMarkerColors() {
        return this.markerColors;
    }

    public final boolean isBookMark() {
        return this.isBookMark;
    }

    public final boolean isMemo() {
        return this.isMemo;
    }

    /* JADX INFO: compiled from: ContentsFilterListItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentsFilterWritingListItem$Companion;", "", "<init>", "()V", "convertTo", "Lcom/medicmedia/medilink/domain/model/ContentsFilterWritingListItem;", "jsonString", "", "nonSelectAll", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentsFilterWritingListItem convertTo(String jsonString) {
            if (jsonString != null) {
                try {
                    return (ContentsFilterWritingListItem) new Gson().fromJson(jsonString, ContentsFilterWritingListItem.class);
                } catch (Exception e) {
                    Logger logger = Logger.INSTANCE;
                    String simpleName = ContentsFilterWritingListItem.INSTANCE.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    logger.error(simpleName, e);
                    return new ContentsFilterWritingListItem(null, null, false, false, 15, null);
                }
            }
            return new ContentsFilterWritingListItem(null, null, false, false, 15, null);
        }

        public final ContentsFilterWritingListItem nonSelectAll() {
            return new ContentsFilterWritingListItem(SetsKt.emptySet(), SetsKt.emptySet(), false, false);
        }
    }

    public final boolean isSelectedAll() {
        return getContents() == null && this.markerColors == null && this.isBookMark && this.isMemo;
    }
}
