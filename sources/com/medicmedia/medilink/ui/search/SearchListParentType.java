package com.medicmedia.medilink.ui.search;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.ContentsFilterParentType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchListItem.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListParentType;", "Lcom/medicmedia/medilink/domain/model/ContentsFilterParentType;", "mode", "", "getMode", "()I", "MainTab", "ContentsDetail", "OnlineContents", "Lcom/medicmedia/medilink/ui/search/SearchListParentType$ContentsDetail;", "Lcom/medicmedia/medilink/ui/search/SearchListParentType$MainTab;", "Lcom/medicmedia/medilink/ui/search/SearchListParentType$OnlineContents;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SearchListParentType extends ContentsFilterParentType {
    int getMode();

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListParentType$MainTab;", "Lcom/medicmedia/medilink/ui/search/SearchListParentType;", "mode", "", "<init>", "(I)V", "getMode", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class MainTab implements SearchListParentType {
        public static final int $stable = 0;
        private final int mode;

        public MainTab() {
            this(0, 1, null);
        }

        public static /* synthetic */ MainTab copy$default(MainTab mainTab, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = mainTab.mode;
            }
            return mainTab.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMode() {
            return this.mode;
        }

        public final MainTab copy(int mode) {
            return new MainTab(mode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MainTab) && this.mode == ((MainTab) other).mode;
        }

        public int hashCode() {
            return Integer.hashCode(this.mode);
        }

        public String toString() {
            return "MainTab(mode=" + this.mode + ")";
        }

        public MainTab(int i) {
            this.mode = i;
        }

        public /* synthetic */ MainTab(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }

        @Override // com.medicmedia.medilink.ui.search.SearchListParentType
        public int getMode() {
            return this.mode;
        }
    }

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0003H×\u0001J\t\u0010\u0014\u001a\u00020\u0005H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListParentType$ContentsDetail;", "Lcom/medicmedia/medilink/ui/search/SearchListParentType;", "mode", "", "contentsId", "", "<init>", "(ILjava/lang/String;)V", "getMode", "()I", "getContentsId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ContentsDetail implements SearchListParentType {
        public static final int $stable = 0;
        private final String contentsId;
        private final int mode;

        public ContentsDetail() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ContentsDetail copy$default(ContentsDetail contentsDetail, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = contentsDetail.mode;
            }
            if ((i2 & 2) != 0) {
                str = contentsDetail.contentsId;
            }
            return contentsDetail.copy(i, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getContentsId() {
            return this.contentsId;
        }

        public final ContentsDetail copy(int mode, String contentsId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            return new ContentsDetail(mode, contentsId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentsDetail)) {
                return false;
            }
            ContentsDetail contentsDetail = (ContentsDetail) other;
            return this.mode == contentsDetail.mode && Intrinsics.areEqual(this.contentsId, contentsDetail.contentsId);
        }

        public int hashCode() {
            return (Integer.hashCode(this.mode) * 31) + this.contentsId.hashCode();
        }

        public String toString() {
            return "ContentsDetail(mode=" + this.mode + ", contentsId=" + this.contentsId + ")";
        }

        public ContentsDetail(int i, String contentsId) {
            Intrinsics.checkNotNullParameter(contentsId, "contentsId");
            this.mode = i;
            this.contentsId = contentsId;
        }

        @Override // com.medicmedia.medilink.ui.search.SearchListParentType
        public int getMode() {
            return this.mode;
        }

        public /* synthetic */ ContentsDetail(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? "" : str);
        }

        public final String getContentsId() {
            return this.contentsId;
        }
    }

    /* JADX INFO: compiled from: SearchListItem.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u0003H×\u0001J\t\u0010\u000f\u001a\u00020\u0010H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/ui/search/SearchListParentType$OnlineContents;", "Lcom/medicmedia/medilink/ui/search/SearchListParentType;", "mode", "", "<init>", "(I)V", "getMode", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class OnlineContents implements SearchListParentType {
        public static final int $stable = 0;
        private final int mode;

        public OnlineContents() {
            this(0, 1, null);
        }

        public static /* synthetic */ OnlineContents copy$default(OnlineContents onlineContents, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = onlineContents.mode;
            }
            return onlineContents.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMode() {
            return this.mode;
        }

        public final OnlineContents copy(int mode) {
            return new OnlineContents(mode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnlineContents) && this.mode == ((OnlineContents) other).mode;
        }

        public int hashCode() {
            return Integer.hashCode(this.mode);
        }

        public String toString() {
            return "OnlineContents(mode=" + this.mode + ")";
        }

        public OnlineContents(int i) {
            this.mode = i;
        }

        public /* synthetic */ OnlineContents(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 2 : i);
        }

        @Override // com.medicmedia.medilink.ui.search.SearchListParentType
        public int getMode() {
            return this.mode;
        }
    }
}
