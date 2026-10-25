package com.medicmedia.medilink.ui.web;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.medicmedia.medilink.data.repository.HistoryRepositoryImpl;
import com.medicmedia.medilink.ui.common.UIError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtherWebViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003Jg\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\bHÇ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010'\u001a\u00020\u000bH×\u0001J\t\u0010(\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0016¨\u0006)"}, d2 = {"Lcom/medicmedia/medilink/ui/web/OtherWebUiState;", "", "initialUrl", "", "currentUrl", HistoryRepositoryImpl.FieldName.TITLE, "subtitle", "isLoading", "", "isRefreshing", "progress", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/medicmedia/medilink/ui/common/UIError;", "isAppBarPrimaryColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZILcom/medicmedia/medilink/ui/common/UIError;Z)V", "getInitialUrl", "()Ljava/lang/String;", "getCurrentUrl", "getTitle", "getSubtitle", "()Z", "getProgress", "()I", "getError", "()Lcom/medicmedia/medilink/ui/common/UIError;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class OtherWebUiState {
    public static final int $stable = 8;
    private final String currentUrl;
    private final UIError error;
    private final String initialUrl;
    private final boolean isAppBarPrimaryColor;
    private final boolean isLoading;
    private final boolean isRefreshing;
    private final int progress;
    private final String subtitle;
    private final String title;

    public OtherWebUiState() {
        this(null, null, null, null, false, false, 0, null, false, 511, null);
    }

    public static /* synthetic */ OtherWebUiState copy$default(OtherWebUiState otherWebUiState, String str, String str2, String str3, String str4, boolean z, boolean z2, int i, UIError uIError, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = otherWebUiState.initialUrl;
        }
        if ((i2 & 2) != 0) {
            str2 = otherWebUiState.currentUrl;
        }
        if ((i2 & 4) != 0) {
            str3 = otherWebUiState.title;
        }
        if ((i2 & 8) != 0) {
            str4 = otherWebUiState.subtitle;
        }
        if ((i2 & 16) != 0) {
            z = otherWebUiState.isLoading;
        }
        if ((i2 & 32) != 0) {
            z2 = otherWebUiState.isRefreshing;
        }
        if ((i2 & 64) != 0) {
            i = otherWebUiState.progress;
        }
        if ((i2 & 128) != 0) {
            uIError = otherWebUiState.error;
        }
        if ((i2 & 256) != 0) {
            z3 = otherWebUiState.isAppBarPrimaryColor;
        }
        UIError uIError2 = uIError;
        boolean z4 = z3;
        boolean z5 = z2;
        int i3 = i;
        boolean z6 = z;
        String str5 = str3;
        return otherWebUiState.copy(str, str2, str5, str4, z6, z5, i3, uIError2, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInitialUrl() {
        return this.initialUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsRefreshing() {
        return this.isRefreshing;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final UIError getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsAppBarPrimaryColor() {
        return this.isAppBarPrimaryColor;
    }

    public final OtherWebUiState copy(String initialUrl, String currentUrl, String title, String subtitle, boolean isLoading, boolean isRefreshing, int progress, UIError error, boolean isAppBarPrimaryColor) {
        Intrinsics.checkNotNullParameter(initialUrl, "initialUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new OtherWebUiState(initialUrl, currentUrl, title, subtitle, isLoading, isRefreshing, progress, error, isAppBarPrimaryColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherWebUiState)) {
            return false;
        }
        OtherWebUiState otherWebUiState = (OtherWebUiState) other;
        return Intrinsics.areEqual(this.initialUrl, otherWebUiState.initialUrl) && Intrinsics.areEqual(this.currentUrl, otherWebUiState.currentUrl) && Intrinsics.areEqual(this.title, otherWebUiState.title) && Intrinsics.areEqual(this.subtitle, otherWebUiState.subtitle) && this.isLoading == otherWebUiState.isLoading && this.isRefreshing == otherWebUiState.isRefreshing && this.progress == otherWebUiState.progress && Intrinsics.areEqual(this.error, otherWebUiState.error) && this.isAppBarPrimaryColor == otherWebUiState.isAppBarPrimaryColor;
    }

    public int hashCode() {
        int iHashCode = this.initialUrl.hashCode() * 31;
        String str = this.currentUrl;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.isRefreshing)) * 31) + Integer.hashCode(this.progress)) * 31;
        UIError uIError = this.error;
        return ((iHashCode2 + (uIError != null ? uIError.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAppBarPrimaryColor);
    }

    public String toString() {
        return "OtherWebUiState(initialUrl=" + this.initialUrl + ", currentUrl=" + this.currentUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", isLoading=" + this.isLoading + ", isRefreshing=" + this.isRefreshing + ", progress=" + this.progress + ", error=" + this.error + ", isAppBarPrimaryColor=" + this.isAppBarPrimaryColor + ")";
    }

    public OtherWebUiState(String initialUrl, String str, String title, String subtitle, boolean z, boolean z2, int i, UIError uIError, boolean z3) {
        Intrinsics.checkNotNullParameter(initialUrl, "initialUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.initialUrl = initialUrl;
        this.currentUrl = str;
        this.title = title;
        this.subtitle = subtitle;
        this.isLoading = z;
        this.isRefreshing = z2;
        this.progress = i;
        this.error = uIError;
        this.isAppBarPrimaryColor = z3;
    }

    public /* synthetic */ OtherWebUiState(String str, String str2, String str3, String str4, boolean z, boolean z2, int i, UIError uIError, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? null : uIError, (i2 & 256) != 0 ? true : z3);
    }

    public final String getInitialUrl() {
        return this.initialUrl;
    }

    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final UIError getError() {
        return this.error;
    }

    public final boolean isAppBarPrimaryColor() {
        return this.isAppBarPrimaryColor;
    }
}
