package com.medicmedia.medilink.ui.search;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.medicmedia.medilink.domain.model.AnalyticsEvent;
import com.medicmedia.medilink.domain.model.SearchOperation;
import com.medicmedia.medilink.ui.R;
import com.medicmedia.medilink.ui.common.ContentsListFilterType;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchListFilterType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000b2\u00020\u0001:\u0004\u000b\f\r\u000eB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListFilterType;", "Lcom/medicmedia/medilink/ui/common/ContentsListFilterType;", "resourceId", "", "isSelected", "", "<init>", "(IZ)V", "getResourceId", "()I", "()Z", "Companion", "UnPurchasedContents", "Operation", "Contents", "Lcom/medicmedia/medilink/ui/search/SearchListFilterType$Contents;", "Lcom/medicmedia/medilink/ui/search/SearchListFilterType$Operation;", "Lcom/medicmedia/medilink/ui/search/SearchListFilterType$UnPurchasedContents;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class SearchListFilterType implements ContentsListFilterType {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isSelected;
    private final int resourceId;

    public /* synthetic */ SearchListFilterType(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    private SearchListFilterType(int i, boolean z) {
        this.resourceId = i;
        this.isSelected = z;
    }

    @Override // com.medicmedia.medilink.ui.common.ContentsListFilterType
    public int getResourceId() {
        return this.resourceId;
    }

    @Override // com.medicmedia.medilink.ui.common.ContentsListFilterType
    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: compiled from: SearchListFilterType.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListFilterType$Companion;", "", "<init>", "()V", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "Lcom/medicmedia/medilink/ui/search/SearchListFilterType;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<SearchListFilterType> entries() {
            int i = 1;
            return CollectionsKt.listOf((Object[]) new SearchListFilterType[]{new UnPurchasedContents(false, i, null), new Operation(0 == true ? 1 : 0, i, 0 == true ? 1 : 0), new Contents(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0)});
        }
    }

    /* JADX INFO: compiled from: SearchListFilterType.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListFilterType$UnPurchasedContents;", "Lcom/medicmedia/medilink/ui/search/SearchListFilterType;", "isSelected", "", "<init>", "(Z)V", "()Z", "resourceId", "", "getResourceId", "()I", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class UnPurchasedContents extends SearchListFilterType {
        public static final int $stable = 0;
        private final boolean isSelected;

        public UnPurchasedContents() {
            this(false, 1, null);
        }

        public static /* synthetic */ UnPurchasedContents copy$default(UnPurchasedContents unPurchasedContents, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = unPurchasedContents.isSelected;
            }
            return unPurchasedContents.copy(z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final UnPurchasedContents copy(boolean isSelected) {
            return new UnPurchasedContents(isSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnPurchasedContents) && this.isSelected == ((UnPurchasedContents) other).isSelected;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isSelected);
        }

        public String toString() {
            return "UnPurchasedContents(isSelected=" + this.isSelected + ")";
        }

        public /* synthetic */ UnPurchasedContents(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        @Override // com.medicmedia.medilink.ui.search.SearchListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        /* JADX INFO: renamed from: isSelected */
        public boolean getIsSelected() {
            return this.isSelected;
        }

        public UnPurchasedContents(boolean z) {
            super(-1, z, null);
            this.isSelected = z;
        }

        @Override // com.medicmedia.medilink.ui.search.SearchListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        public int getResourceId() {
            if (getIsSelected()) {
                return R.string.search_filter_include_purchase;
            }
            return R.string.search_filter_exclude_purchase;
        }
    }

    /* JADX INFO: compiled from: SearchListFilterType.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\tH×\u0001J\t\u0010\u0015\u001a\u00020\u0016H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListFilterType$Operation;", "Lcom/medicmedia/medilink/ui/search/SearchListFilterType;", AnalyticsEvent.Param.OPERATION, "Lcom/medicmedia/medilink/domain/model/SearchOperation;", "<init>", "(Lcom/medicmedia/medilink/domain/model/SearchOperation;)V", "getOperation", "()Lcom/medicmedia/medilink/domain/model/SearchOperation;", "resourceId", "", "getResourceId", "()I", "isSelected", "", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Operation extends SearchListFilterType {
        public static final int $stable = 0;
        private final SearchOperation operation;

        public Operation() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Operation copy$default(Operation operation, SearchOperation searchOperation, int i, Object obj) {
            if ((i & 1) != 0) {
                searchOperation = operation.operation;
            }
            return operation.copy(searchOperation);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SearchOperation getOperation() {
            return this.operation;
        }

        public final Operation copy(SearchOperation operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return new Operation(operation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Operation) && this.operation == ((Operation) other).operation;
        }

        public int hashCode() {
            return this.operation.hashCode();
        }

        public String toString() {
            return "Operation(operation=" + this.operation + ")";
        }

        public /* synthetic */ Operation(SearchOperation searchOperation, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SearchOperation.AND : searchOperation);
        }

        public final SearchOperation getOperation() {
            return this.operation;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Operation(SearchOperation operation) {
            super(-1, false, null);
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.operation = operation;
        }

        @Override // com.medicmedia.medilink.ui.search.SearchListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        public int getResourceId() {
            if (getIsSelected()) {
                return R.string.search_filter_operation_and;
            }
            return R.string.search_filter_operation_or;
        }

        @Override // com.medicmedia.medilink.ui.search.SearchListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        /* JADX INFO: renamed from: isSelected */
        public boolean getIsSelected() {
            return this.operation == SearchOperation.AND;
        }
    }

    /* JADX INFO: compiled from: SearchListFilterType.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0011\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0006H×\u0001J\t\u0010\u0015\u001a\u00020\u0004H×\u0001R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListFilterType$Contents;", "Lcom/medicmedia/medilink/ui/search/SearchListFilterType;", "contentsId", "", "", "resourceId", "", "<init>", "(Ljava/util/Set;I)V", "getResourceId", "()I", "isSelected", "", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Contents extends SearchListFilterType {
        public static final int $stable = 8;
        private final Set<String> contentsId;
        private final boolean isSelected;
        private final int resourceId;

        public Contents() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        private final Set<String> component1() {
            return this.contentsId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Contents copy$default(Contents contents, Set set, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                set = contents.contentsId;
            }
            if ((i2 & 2) != 0) {
                i = contents.resourceId;
            }
            return contents.copy(set, i);
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getResourceId() {
            return this.resourceId;
        }

        public final Contents copy(Set<String> contentsId, int resourceId) {
            return new Contents(contentsId, resourceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Contents)) {
                return false;
            }
            Contents contents = (Contents) other;
            return Intrinsics.areEqual(this.contentsId, contents.contentsId) && this.resourceId == contents.resourceId;
        }

        public int hashCode() {
            Set<String> set = this.contentsId;
            return ((set == null ? 0 : set.hashCode()) * 31) + Integer.hashCode(this.resourceId);
        }

        public String toString() {
            return "Contents(contentsId=" + this.contentsId + ", resourceId=" + this.resourceId + ")";
        }

        @Override // com.medicmedia.medilink.ui.search.SearchListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        public int getResourceId() {
            return this.resourceId;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Contents(Set set, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            set = (i2 & 1) != 0 ? null : set;
            if ((i2 & 2) != 0) {
                if (set != null) {
                    i = R.string.history_list_filter_contents;
                } else {
                    i = R.string.history_list_filter_contents_all;
                }
            }
            this(set, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Contents(Set<String> set, int i) {
            boolean z = false;
            super(i, z, null);
            this.contentsId = set;
            this.resourceId = i;
            if (set != null && set.isEmpty()) {
                z = true;
            }
            this.isSelected = !z;
        }

        @Override // com.medicmedia.medilink.ui.search.SearchListFilterType, com.medicmedia.medilink.ui.common.ContentsListFilterType
        /* JADX INFO: renamed from: isSelected, reason: from getter */
        public boolean getIsSelected() {
            return this.isSelected;
        }
    }
}
