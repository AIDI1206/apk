package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: CoreErrorConverter.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\r"}, d2 = {"Lio/realm/kotlin/internal/interop/CoreErrorConverter;", "", "<init>", "()V", "asThrowable", "", "categoriesNativeValue", "", "errorCodeNativeValue", "messageNativeValue", "", "path", "userError", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CoreErrorConverter {
    public static final CoreErrorConverter INSTANCE = new CoreErrorConverter();

    private CoreErrorConverter() {
    }

    @JvmStatic
    public static final Throwable asThrowable(int categoriesNativeValue, int errorCodeNativeValue, String messageNativeValue, String path, Throwable userError) {
        CategoryFlags categoryFlags = new CategoryFlags(categoriesNativeValue);
        ErrorCode errorCodeOf = ErrorCode.INSTANCE.of(errorCodeNativeValue);
        String str = "[" + errorCodeOf + "]: " + messageNativeValue;
        if (userError != null) {
            return userError;
        }
        if (ErrorCode.RLM_ERR_INDEX_OUT_OF_BOUNDS == errorCodeOf) {
            return new IndexOutOfBoundsException(str);
        }
        if (categoryFlags.contains(ErrorCategory.RLM_ERR_CAT_INVALID_ARG) && !categoryFlags.contains(ErrorCategory.RLM_ERR_CAT_SYNC_ERROR)) {
            return new IllegalArgumentException(str);
        }
        if (categoryFlags.contains(ErrorCategory.RLM_ERR_CAT_LOGIC) || categoryFlags.contains(ErrorCategory.RLM_ERR_CAT_RUNTIME)) {
            return new IllegalStateException(str);
        }
        return new Error(str);
    }
}
