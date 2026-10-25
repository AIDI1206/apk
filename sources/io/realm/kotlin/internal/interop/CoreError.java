package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CoreError.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0086\u0002R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lio/realm/kotlin/internal/interop/CoreError;", "", "categoriesNativeValue", "", "errorCodeNativeValue", "messageNativeValue", "", "<init>", "(IILjava/lang/String;)V", "getErrorCodeNativeValue", "()I", "categories", "Lio/realm/kotlin/internal/interop/CategoryFlags;", "getCategories", "()Lio/realm/kotlin/internal/interop/CategoryFlags;", "errorCode", "Lio/realm/kotlin/internal/interop/ErrorCode;", "getErrorCode", "()Lio/realm/kotlin/internal/interop/ErrorCode;", "message", "getMessage", "()Ljava/lang/String;", "contains", "", "category", "Lio/realm/kotlin/internal/interop/ErrorCategory;", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CoreError {
    private final CategoryFlags categories;
    private final ErrorCode errorCode;
    private final int errorCodeNativeValue;
    private final String message;

    public CoreError(int i, int i2, String str) {
        this.errorCodeNativeValue = i2;
        this.categories = new CategoryFlags(i);
        this.errorCode = ErrorCode.INSTANCE.of(i2);
        this.message = str;
    }

    public final int getErrorCodeNativeValue() {
        return this.errorCodeNativeValue;
    }

    public final CategoryFlags getCategories() {
        return this.categories;
    }

    public final ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean contains(ErrorCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        return this.categories.contains(category);
    }
}
