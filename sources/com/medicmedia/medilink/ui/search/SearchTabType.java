package com.medicmedia.medilink.ui.search;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.medicmedia.medilink.ui.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchTabType;", "", "value", "", "resourceId", "<init>", "(II)V", "getValue", "()I", "getResourceId", "ThisContent", "AllContents", "Companion", "Lcom/medicmedia/medilink/ui/search/SearchTabType$AllContents;", "Lcom/medicmedia/medilink/ui/search/SearchTabType$ThisContent;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class SearchTabType {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int resourceId;
    private final int value;

    public /* synthetic */ SearchTabType(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    private SearchTabType(int i, int i2) {
        this.value = i;
        this.resourceId = i2;
    }

    public int getValue() {
        return this.value;
    }

    public int getResourceId() {
        return this.resourceId;
    }

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0003H×\u0001J\t\u0010\u0017\u001a\u00020\u0006H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchTabType$ThisContent;", "Lcom/medicmedia/medilink/ui/search/SearchTabType;", "value", "", "resourceId", "contentsId", "", "<init>", "(IILjava/lang/String;)V", "getValue", "()I", "getResourceId", "getContentsId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ThisContent extends SearchTabType {
        public static final int $stable = 0;
        private final String contentsId;
        private final int resourceId;
        private final int value;

        public ThisContent() {
            this(0, 0, null, 7, null);
        }

        public static /* synthetic */ ThisContent copy$default(ThisContent thisContent, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = thisContent.value;
            }
            if ((i3 & 2) != 0) {
                i2 = thisContent.resourceId;
            }
            if ((i3 & 4) != 0) {
                str = thisContent.contentsId;
            }
            return thisContent.copy(i, i2, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getResourceId() {
            return this.resourceId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        public final ThisContent copy(int value, int resourceId, String contentsId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            return new ThisContent(value, resourceId, contentsId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ThisContent)) {
                return false;
            }
            ThisContent thisContent = (ThisContent) other;
            return this.value == thisContent.value && this.resourceId == thisContent.resourceId && Intrinsics.areEqual(this.contentsId, thisContent.contentsId);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.value) * 31) + Integer.hashCode(this.resourceId)) * 31) + this.contentsId.hashCode();
        }

        public String toString() {
            return "ThisContent(value=" + this.value + ", resourceId=" + this.resourceId + ", contentsId=" + this.contentsId + ")";
        }

        @Override // com.medicmedia.medilink.ui.search.SearchTabType
        public int getValue() {
            return this.value;
        }

        public /* synthetic */ ThisContent(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? R.string.search_list_tab_this_content : i2, (i3 & 4) != 0 ? "" : str);
        }

        @Override // com.medicmedia.medilink.ui.search.SearchTabType
        public int getResourceId() {
            return this.resourceId;
        }

        public final String getContentsId() {
            return this.contentsId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ThisContent(int i, int i2, String contentsId) {
            super(i, i2, null);
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            this.value = i;
            this.resourceId = i2;
            this.contentsId = contentsId;
        }
    }

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchTabType$AllContents;", "Lcom/medicmedia/medilink/ui/search/SearchTabType;", "value", "", "resourceId", "<init>", "(II)V", "getValue", "()I", "getResourceId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class AllContents extends SearchTabType {
        public static final int $stable = 0;
        private final int resourceId;
        private final int value;

        /* JADX WARN: Illegal instructions before constructor call */
        public AllContents() {
            int i = 0;
            this(i, i, 3, null);
        }

        public static /* synthetic */ AllContents copy$default(AllContents allContents, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = allContents.value;
            }
            if ((i3 & 2) != 0) {
                i2 = allContents.resourceId;
            }
            return allContents.copy(i, i2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getResourceId() {
            return this.resourceId;
        }

        public final AllContents copy(int value, int resourceId) {
            return new AllContents(value, resourceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AllContents)) {
                return false;
            }
            AllContents allContents = (AllContents) other;
            return this.value == allContents.value && this.resourceId == allContents.resourceId;
        }

        public int hashCode() {
            return (Integer.hashCode(this.value) * 31) + Integer.hashCode(this.resourceId);
        }

        public String toString() {
            return "AllContents(value=" + this.value + ", resourceId=" + this.resourceId + ")";
        }

        @Override // com.medicmedia.medilink.ui.search.SearchTabType
        public int getValue() {
            return this.value;
        }

        public /* synthetic */ AllContents(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 1 : i, (i3 & 2) != 0 ? R.string.search_list_tab_all_contents : i2);
        }

        @Override // com.medicmedia.medilink.ui.search.SearchTabType
        public int getResourceId() {
            return this.resourceId;
        }

        public AllContents(int i, int i2) {
            super(i, i2, null);
            this.value = i;
            this.resourceId = i2;
        }
    }

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchTabType$Companion;", "", "<init>", "()V", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "Lcom/medicmedia/medilink/ui/search/SearchTabType;", "contentsId", "", "find", "value", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ List entries$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return companion.entries(str);
        }

        public final List<SearchTabType> entries(String contentsId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            ThisContent thisContent = new ThisContent(0, 0, contentsId, 3, null);
            int i = 0;
            return CollectionsKt.listOf((Object[]) new SearchTabType[]{thisContent, new AllContents(i, i, 3, null)});
        }

        public final SearchTabType find(int value) {
            Object obj = null;
            for (Object obj2 : entries$default(this, null, 1, null)) {
                if (((SearchTabType) obj2).getValue() == value) {
                    obj = obj2;
                    break;
                }
            }
            return (SearchTabType) obj;
        }
    }
}
