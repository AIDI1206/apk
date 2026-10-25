package com.medicmedia.medilink.domain.model;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.core.network.api.UserActionLogParams;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ApiLog.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Lcom/medicmedia/medilink/domain/model/ApiLog;", "", "logLevel", "Lcom/medicmedia/medilink/domain/model/LogLevel;", AnalyticsEvent.Param.OPERATION, "Lcom/medicmedia/medilink/domain/model/LogOperation;", "logDetail", "Lcom/medicmedia/medilink/domain/model/LogDetail;", "arguments", "", "<init>", "(Lcom/medicmedia/medilink/domain/model/LogLevel;Lcom/medicmedia/medilink/domain/model/LogOperation;Lcom/medicmedia/medilink/domain/model/LogDetail;Ljava/util/List;)V", "getLogLevel", "()Lcom/medicmedia/medilink/domain/model/LogLevel;", "getOperation", "()Lcom/medicmedia/medilink/domain/model/LogOperation;", "getLogDetail", "()Lcom/medicmedia/medilink/domain/model/LogDetail;", "getArguments", "()Ljava/util/List;", "toParams", "Lcom/medicmedia/medilink/core/network/api/UserActionLogParams;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ApiLog {
    private final List<Object> arguments;
    private final LogDetail logDetail;
    private final LogLevel logLevel;
    private final LogOperation operation;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiLog copy$default(ApiLog apiLog, LogLevel logLevel, LogOperation logOperation, LogDetail logDetail, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            logLevel = apiLog.logLevel;
        }
        if ((i & 2) != 0) {
            logOperation = apiLog.operation;
        }
        if ((i & 4) != 0) {
            logDetail = apiLog.logDetail;
        }
        if ((i & 8) != 0) {
            list = apiLog.arguments;
        }
        return apiLog.copy(logLevel, logOperation, logDetail, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LogOperation getOperation() {
        return this.operation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LogDetail getLogDetail() {
        return this.logDetail;
    }

    public final List<Object> component4() {
        return this.arguments;
    }

    public final ApiLog copy(LogLevel logLevel, LogOperation operation, LogDetail logDetail, List<? extends Object> arguments) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(logDetail, "logDetail");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return new ApiLog(logLevel, operation, logDetail, arguments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiLog)) {
            return false;
        }
        ApiLog apiLog = (ApiLog) other;
        return this.logLevel == apiLog.logLevel && this.operation == apiLog.operation && this.logDetail == apiLog.logDetail && Intrinsics.areEqual(this.arguments, apiLog.arguments);
    }

    public int hashCode() {
        return (((((this.logLevel.hashCode() * 31) + this.operation.hashCode()) * 31) + this.logDetail.hashCode()) * 31) + this.arguments.hashCode();
    }

    public String toString() {
        return "ApiLog(logLevel=" + this.logLevel + ", operation=" + this.operation + ", logDetail=" + this.logDetail + ", arguments=" + this.arguments + ")";
    }

    public ApiLog(LogLevel logLevel, LogOperation operation, LogDetail logDetail, List<? extends Object> arguments) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(logDetail, "logDetail");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.logLevel = logLevel;
        this.operation = operation;
        this.logDetail = logDetail;
        this.arguments = arguments;
    }

    public final LogLevel getLogLevel() {
        return this.logLevel;
    }

    public final LogOperation getOperation() {
        return this.operation;
    }

    public final LogDetail getLogDetail() {
        return this.logDetail;
    }

    public /* synthetic */ ApiLog(LogLevel logLevel, LogOperation logOperation, LogDetail logDetail, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(logLevel, logOperation, logDetail, (i & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<Object> getArguments() {
        return this.arguments;
    }

    public final UserActionLogParams toParams() {
        String value = this.logLevel.getValue();
        String value2 = this.operation.getValue();
        LogDetail logDetail = this.logDetail;
        Object[] array = this.arguments.toArray(new Object[0]);
        return new UserActionLogParams(value, value2, logDetail.format(Arrays.copyOf(array, array.length)));
    }
}
