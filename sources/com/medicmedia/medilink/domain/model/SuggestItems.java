package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SuggestItems.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J6\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/medicmedia/medilink/domain/model/SuggestItems;", "", "took", "", "timedOut", "", "suggests", "", "Lcom/medicmedia/medilink/domain/model/SuggestItem;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)V", "getTook", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimedOut", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSuggests", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/List;)Lcom/medicmedia/medilink/domain/model/SuggestItems;", "equals", "other", "hashCode", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SuggestItems {
    private final List<SuggestItem> suggests;
    private final Boolean timedOut;
    private final Integer took;

    public SuggestItems() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestItems copy$default(SuggestItems suggestItems, Integer num, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = suggestItems.took;
        }
        if ((i & 2) != 0) {
            bool = suggestItems.timedOut;
        }
        if ((i & 4) != 0) {
            list = suggestItems.suggests;
        }
        return suggestItems.copy(num, bool, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTook() {
        return this.took;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getTimedOut() {
        return this.timedOut;
    }

    public final List<SuggestItem> component3() {
        return this.suggests;
    }

    public final SuggestItems copy(Integer took, Boolean timedOut, List<SuggestItem> suggests) {
        Intrinsics.checkNotNullParameter(suggests, "suggests");
        return new SuggestItems(took, timedOut, suggests);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuggestItems)) {
            return false;
        }
        SuggestItems suggestItems = (SuggestItems) other;
        return Intrinsics.areEqual(this.took, suggestItems.took) && Intrinsics.areEqual(this.timedOut, suggestItems.timedOut) && Intrinsics.areEqual(this.suggests, suggestItems.suggests);
    }

    public int hashCode() {
        Integer num = this.took;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.timedOut;
        return ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31) + this.suggests.hashCode();
    }

    public String toString() {
        return "SuggestItems(took=" + this.took + ", timedOut=" + this.timedOut + ", suggests=" + this.suggests + ")";
    }

    public SuggestItems(Integer num, Boolean bool, List<SuggestItem> suggests) {
        Intrinsics.checkNotNullParameter(suggests, "suggests");
        this.took = num;
        this.timedOut = bool;
        this.suggests = suggests;
    }

    public final Integer getTook() {
        return this.took;
    }

    public final Boolean getTimedOut() {
        return this.timedOut;
    }

    public /* synthetic */ SuggestItems(Integer num, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<SuggestItem> getSuggests() {
        return this.suggests;
    }
}
