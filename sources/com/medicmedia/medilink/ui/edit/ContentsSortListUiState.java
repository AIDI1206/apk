package com.medicmedia.medilink.ui.edit;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ContentsSortListViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0005H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/ContentsSortListUiState;", "", "isLoading", "", "errorMessage", "", "<init>", "(ZLjava/lang/Integer;)V", "()Z", "getErrorMessage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(ZLjava/lang/Integer;)Lcom/medicmedia/medilink/ui/edit/ContentsSortListUiState;", "equals", "other", "hashCode", "toString", "", "Companion", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ContentsSortListUiState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private static final ContentsSortListUiState f122default = new ContentsSortListUiState(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    private final Integer errorMessage;
    private final boolean isLoading;

    public ContentsSortListUiState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ContentsSortListUiState copy$default(ContentsSortListUiState contentsSortListUiState, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            z = contentsSortListUiState.isLoading;
        }
        if ((i & 2) != 0) {
            num = contentsSortListUiState.errorMessage;
        }
        return contentsSortListUiState.copy(z, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    public final ContentsSortListUiState copy(boolean isLoading, Integer errorMessage) {
        return new ContentsSortListUiState(isLoading, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentsSortListUiState)) {
            return false;
        }
        ContentsSortListUiState contentsSortListUiState = (ContentsSortListUiState) other;
        return this.isLoading == contentsSortListUiState.isLoading && Intrinsics.areEqual(this.errorMessage, contentsSortListUiState.errorMessage);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        Integer num = this.errorMessage;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ContentsSortListUiState(isLoading=" + this.isLoading + ", errorMessage=" + this.errorMessage + ")";
    }

    public ContentsSortListUiState(boolean z, Integer num) {
        this.isLoading = z;
        this.errorMessage = num;
    }

    public /* synthetic */ ContentsSortListUiState(boolean z, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Integer getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: compiled from: ContentsSortListViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/ui/edit/ContentsSortListUiState$Companion;", "", "<init>", "()V", "default", "Lcom/medicmedia/medilink/ui/edit/ContentsSortListUiState;", "getDefault", "()Lcom/medicmedia/medilink/ui/edit/ContentsSortListUiState;", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ContentsSortListUiState getDefault() {
            return ContentsSortListUiState.f122default;
        }
    }
}
