package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.Gson;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsFilterListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentsFilterBrowsingListItem;", "Lcom/medicmedia/medilink/domain/model/ContentsFilterListItem;", "contents", "", "", "<init>", "(Ljava/util/Set;)V", "getContents", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsFilterBrowsingListItem implements ContentsFilterListItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Set<String> contents;

    public ContentsFilterBrowsingListItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentsFilterBrowsingListItem copy$default(ContentsFilterBrowsingListItem contentsFilterBrowsingListItem, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = contentsFilterBrowsingListItem.contents;
        }
        return contentsFilterBrowsingListItem.copy(set);
    }

    public final Set<String> component1() {
        return this.contents;
    }

    public final ContentsFilterBrowsingListItem copy(Set<String> contents) {
        return new ContentsFilterBrowsingListItem(contents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ContentsFilterBrowsingListItem) && Intrinsics.areEqual(this.contents, ((ContentsFilterBrowsingListItem) other).contents);
    }

    public int hashCode() {
        Set<String> set = this.contents;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public String toString() {
        return "ContentsFilterBrowsingListItem(contents=" + this.contents + ")";
    }

    public ContentsFilterBrowsingListItem(Set<String> set) {
        this.contents = set;
    }

    public /* synthetic */ ContentsFilterBrowsingListItem(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : set);
    }

    @Override // com.medicmedia.medilink.domain.model.ContentsFilterListItem
    public Set<String> getContents() {
        return this.contents;
    }

    /* JADX INFO: compiled from: ContentsFilterListItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/domain/model/ContentsFilterBrowsingListItem$Companion;", "", "<init>", "()V", "convertTo", "Lcom/medicmedia/medilink/domain/model/ContentsFilterBrowsingListItem;", "jsonString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentsFilterBrowsingListItem convertTo(String jsonString) {
            int i = 1;
            Set set = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            if (jsonString != null) {
                try {
                    return (ContentsFilterBrowsingListItem) new Gson().fromJson(jsonString, ContentsFilterBrowsingListItem.class);
                } catch (Exception e) {
                    Logger logger = Logger.INSTANCE;
                    String simpleName = ContentsFilterBrowsingListItem.INSTANCE.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                    logger.error(simpleName, e);
                    return new ContentsFilterBrowsingListItem(b2 == true ? 1 : 0, i, b == true ? 1 : 0);
                }
            }
            return new ContentsFilterBrowsingListItem(set, i, b3 == true ? 1 : 0);
        }
    }
}
