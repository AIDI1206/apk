package com.medicmedia.medilink.core.network.api;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.AnalyticsEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StoreApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/medicmedia/medilink/core/network/api/UserActionLogParams;", "", "logLevel", "", AnalyticsEvent.Param.OPERATION, "logDetail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLogLevel", "()Ljava/lang/String;", "getOperation", "getLogDetail", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class UserActionLogParams {
    private final String logDetail;
    private final String logLevel;
    private final String operation;

    public static /* synthetic */ UserActionLogParams copy$default(UserActionLogParams userActionLogParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userActionLogParams.logLevel;
        }
        if ((i & 2) != 0) {
            str2 = userActionLogParams.operation;
        }
        if ((i & 4) != 0) {
            str3 = userActionLogParams.logDetail;
        }
        return userActionLogParams.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLogLevel() {
        return this.logLevel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogDetail() {
        return this.logDetail;
    }

    public final UserActionLogParams copy(String logLevel, String operation, String logDetail) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(logDetail, "logDetail");
        return new UserActionLogParams(logLevel, operation, logDetail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserActionLogParams)) {
            return false;
        }
        UserActionLogParams userActionLogParams = (UserActionLogParams) other;
        return Intrinsics.areEqual(this.logLevel, userActionLogParams.logLevel) && Intrinsics.areEqual(this.operation, userActionLogParams.operation) && Intrinsics.areEqual(this.logDetail, userActionLogParams.logDetail);
    }

    public int hashCode() {
        return (((this.logLevel.hashCode() * 31) + this.operation.hashCode()) * 31) + this.logDetail.hashCode();
    }

    public String toString() {
        return "UserActionLogParams(logLevel=" + this.logLevel + ", operation=" + this.operation + ", logDetail=" + this.logDetail + ")";
    }

    public UserActionLogParams(String logLevel, String operation, String logDetail) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(logDetail, "logDetail");
        this.logLevel = logLevel;
        this.operation = operation;
        this.logDetail = logDetail;
    }

    public final String getLogLevel() {
        return this.logLevel;
    }

    public final String getOperation() {
        return this.operation;
    }

    public final String getLogDetail() {
        return this.logDetail;
    }
}
