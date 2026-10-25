package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.QueryParameterKey;
import io.realm.kotlin.internal.interop.CodeDescription;
import io.realm.kotlin.internal.interop.ErrorCategory;
import io.realm.kotlin.internal.interop.ErrorCode;
import io.realm.kotlin.internal.interop.UnknownCodeDescription;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppError.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B5\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086\u0002J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006#"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/AppError;", "", "categoryFlags", "", QueryParameterKey.CODE, "Lio/realm/kotlin/internal/interop/CodeDescription;", "httpStatusCode", "message", "", "linkToServerLog", "<init>", "(ILio/realm/kotlin/internal/interop/CodeDescription;ILjava/lang/String;Ljava/lang/String;)V", "getCategoryFlags", "()I", "getCode", "()Lio/realm/kotlin/internal/interop/CodeDescription;", "getHttpStatusCode", "getMessage", "()Ljava/lang/String;", "getLinkToServerLog", "contains", "", "flag", "Lio/realm/kotlin/internal/interop/ErrorCategory;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class AppError {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int categoryFlags;
    private final CodeDescription code;
    private final int httpStatusCode;
    private final String linkToServerLog;
    private final String message;

    public static /* synthetic */ AppError copy$default(AppError appError, int i, CodeDescription codeDescription, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = appError.categoryFlags;
        }
        if ((i3 & 2) != 0) {
            codeDescription = appError.code;
        }
        if ((i3 & 4) != 0) {
            i2 = appError.httpStatusCode;
        }
        if ((i3 & 8) != 0) {
            str = appError.message;
        }
        if ((i3 & 16) != 0) {
            str2 = appError.linkToServerLog;
        }
        String str3 = str2;
        int i4 = i2;
        return appError.copy(i, codeDescription, i4, str, str3);
    }

    @JvmStatic
    public static final AppError newInstance(int i, int i2, int i3, String str, String str2) {
        return INSTANCE.newInstance(i, i2, i3, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCategoryFlags() {
        return this.categoryFlags;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CodeDescription getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLinkToServerLog() {
        return this.linkToServerLog;
    }

    public final AppError copy(int categoryFlags, CodeDescription code, int httpStatusCode, String message, String linkToServerLog) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new AppError(categoryFlags, code, httpStatusCode, message, linkToServerLog);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppError)) {
            return false;
        }
        AppError appError = (AppError) other;
        return this.categoryFlags == appError.categoryFlags && Intrinsics.areEqual(this.code, appError.code) && this.httpStatusCode == appError.httpStatusCode && Intrinsics.areEqual(this.message, appError.message) && Intrinsics.areEqual(this.linkToServerLog, appError.linkToServerLog);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.categoryFlags) * 31) + this.code.hashCode()) * 31) + Integer.hashCode(this.httpStatusCode)) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.linkToServerLog;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "AppError(categoryFlags=" + this.categoryFlags + ", code=" + this.code + ", httpStatusCode=" + this.httpStatusCode + ", message=" + this.message + ", linkToServerLog=" + this.linkToServerLog + ')';
    }

    public AppError(int i, CodeDescription code, int i2, String str, String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.categoryFlags = i;
        this.code = code;
        this.httpStatusCode = i2;
        this.message = str;
        this.linkToServerLog = str2;
    }

    public final int getCategoryFlags() {
        return this.categoryFlags;
    }

    public final CodeDescription getCode() {
        return this.code;
    }

    public final int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getLinkToServerLog() {
        return this.linkToServerLog;
    }

    /* JADX INFO: compiled from: AppError.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\r"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/AppError$Companion;", "", "<init>", "()V", "newInstance", "Lio/realm/kotlin/internal/interop/sync/AppError;", "categoryFlags", "", "errorCode", "httpStatusCode", "message", "", "linkToServerLog", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AppError newInstance(int categoryFlags, int errorCode, int httpStatusCode, String message, String linkToServerLog) {
            CodeDescription codeDescriptionOf = ErrorCode.INSTANCE.of(errorCode);
            if (codeDescriptionOf == null) {
                codeDescriptionOf = new UnknownCodeDescription(errorCode);
            }
            return new AppError(categoryFlags, codeDescriptionOf, httpStatusCode, message, linkToServerLog);
        }
    }

    public final boolean contains(ErrorCategory flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return (flag.getNativeValue() & this.categoryFlags) != 0;
    }
}
