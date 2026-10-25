package com.medicmedia.medilink.ui.offline;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OfflineContentsTocViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0004H×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/offline/OfflineContentsTocUiState;", "", "initializeIds", "", "", "scrollToIdOnStart", "<init>", "(Ljava/util/Set;Ljava/lang/String;)V", "getInitializeIds", "()Ljava/util/Set;", "getScrollToIdOnStart", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class OfflineContentsTocUiState {
    private final Set<String> initializeIds;
    private final String scrollToIdOnStart;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final OfflineContentsTocUiState f147default = new OfflineContentsTocUiState(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    public OfflineContentsTocUiState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfflineContentsTocUiState copy$default(OfflineContentsTocUiState offlineContentsTocUiState, Set set, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            set = offlineContentsTocUiState.initializeIds;
        }
        if ((i & 2) != 0) {
            str = offlineContentsTocUiState.scrollToIdOnStart;
        }
        return offlineContentsTocUiState.copy(set, str);
    }

    public final Set<String> component1() {
        return this.initializeIds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getScrollToIdOnStart() {
        return this.scrollToIdOnStart;
    }

    public final OfflineContentsTocUiState copy(Set<String> initializeIds, String scrollToIdOnStart) {
        Intrinsics.checkNotNullParameter(initializeIds, "initializeIds");
        return new OfflineContentsTocUiState(initializeIds, scrollToIdOnStart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OfflineContentsTocUiState)) {
            return false;
        }
        OfflineContentsTocUiState offlineContentsTocUiState = (OfflineContentsTocUiState) other;
        return Intrinsics.areEqual(this.initializeIds, offlineContentsTocUiState.initializeIds) && Intrinsics.areEqual(this.scrollToIdOnStart, offlineContentsTocUiState.scrollToIdOnStart);
    }

    public int hashCode() {
        int iHashCode = this.initializeIds.hashCode() * 31;
        String str = this.scrollToIdOnStart;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OfflineContentsTocUiState(initializeIds=" + this.initializeIds + ", scrollToIdOnStart=" + this.scrollToIdOnStart + ")";
    }

    public OfflineContentsTocUiState(Set<String> initializeIds, String str) {
        Intrinsics.checkNotNullParameter(initializeIds, "initializeIds");
        this.initializeIds = initializeIds;
        this.scrollToIdOnStart = str;
    }

    public /* synthetic */ OfflineContentsTocUiState(Set set, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SetsKt.emptySet() : set, (i & 2) != 0 ? null : str);
    }

    public final Set<String> getInitializeIds() {
        return this.initializeIds;
    }

    public final String getScrollToIdOnStart() {
        return this.scrollToIdOnStart;
    }

    /* JADX INFO: compiled from: OfflineContentsTocViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/offline/OfflineContentsTocUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/offline/OfflineContentsTocUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/offline/OfflineContentsTocUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OfflineContentsTocUiState getDefault() {
            return OfflineContentsTocUiState.f147default;
        }
    }
}
