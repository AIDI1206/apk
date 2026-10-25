package com.medicmedia.medilink.domain.redux.action;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.medicmedia.medilink.domain.model.ReloadContentsType;
import com.medicmedia.medilink.domain.redux.Action;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonAction.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/action/CommonAction;", "Lcom/medicmedia/medilink/domain/redux/Action;", "<init>", "()V", "ReloadContents", "SelectHistoryTab", "DashboardButtonDistance", "Lcom/medicmedia/medilink/domain/redux/action/CommonAction$DashboardButtonDistance;", "Lcom/medicmedia/medilink/domain/redux/action/CommonAction$ReloadContents;", "Lcom/medicmedia/medilink/domain/redux/action/CommonAction$SelectHistoryTab;", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class CommonAction implements Action {
    public /* synthetic */ CommonAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CommonAction() {
    }

    /* JADX INFO: compiled from: CommonAction.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/action/CommonAction$ReloadContents;", "Lcom/medicmedia/medilink/domain/redux/action/CommonAction;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/medicmedia/medilink/domain/model/ReloadContentsType;", "<init>", "(Lcom/medicmedia/medilink/domain/model/ReloadContentsType;)V", "getType", "()Lcom/medicmedia/medilink/domain/model/ReloadContentsType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class ReloadContents extends CommonAction {
        private final ReloadContentsType type;

        public static /* synthetic */ ReloadContents copy$default(ReloadContents reloadContents, ReloadContentsType reloadContentsType, int i, Object obj) {
            if ((i & 1) != 0) {
                reloadContentsType = reloadContents.type;
            }
            return reloadContents.copy(reloadContentsType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ReloadContentsType getType() {
            return this.type;
        }

        public final ReloadContents copy(ReloadContentsType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return new ReloadContents(type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ReloadContents) && this.type == ((ReloadContents) other).type;
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "ReloadContents(type=" + this.type + ")";
        }

        public final ReloadContentsType getType() {
            return this.type;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReloadContents(ReloadContentsType type) {
            super(null);
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }
    }

    /* JADX INFO: compiled from: CommonAction.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/action/CommonAction$SelectHistoryTab;", "Lcom/medicmedia/medilink/domain/redux/action/CommonAction;", "index", "", "<init>", "(I)V", "getIndex", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class SelectHistoryTab extends CommonAction {
        private final int index;

        public static /* synthetic */ SelectHistoryTab copy$default(SelectHistoryTab selectHistoryTab, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = selectHistoryTab.index;
            }
            return selectHistoryTab.copy(i);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public final SelectHistoryTab copy(int index) {
            return new SelectHistoryTab(index);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectHistoryTab) && this.index == ((SelectHistoryTab) other).index;
        }

        public int hashCode() {
            return Integer.hashCode(this.index);
        }

        public String toString() {
            return "SelectHistoryTab(index=" + this.index + ")";
        }

        public final int getIndex() {
            return this.index;
        }

        public SelectHistoryTab(int i) {
            super(null);
            this.index = i;
        }
    }

    /* JADX INFO: compiled from: CommonAction.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/medicmedia/medilink/domain/redux/action/CommonAction$DashboardButtonDistance;", "Lcom/medicmedia/medilink/domain/redux/action/CommonAction;", "value", "", "<init>", "(Ljava/lang/Integer;)V", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/medicmedia/medilink/domain/redux/action/CommonAction$DashboardButtonDistance;", "equals", "", "other", "", "hashCode", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class DashboardButtonDistance extends CommonAction {
        private final Integer value;

        public DashboardButtonDistance() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ DashboardButtonDistance copy$default(DashboardButtonDistance dashboardButtonDistance, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = dashboardButtonDistance.value;
            }
            return dashboardButtonDistance.copy(num);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getValue() {
            return this.value;
        }

        public final DashboardButtonDistance copy(Integer value) {
            return new DashboardButtonDistance(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DashboardButtonDistance) && Intrinsics.areEqual(this.value, ((DashboardButtonDistance) other).value);
        }

        public int hashCode() {
            Integer num = this.value;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "DashboardButtonDistance(value=" + this.value + ")";
        }

        public /* synthetic */ DashboardButtonDistance(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num);
        }

        public final Integer getValue() {
            return this.value;
        }

        public DashboardButtonDistance(Integer num) {
            super(null);
            this.value = num;
        }
    }
}
