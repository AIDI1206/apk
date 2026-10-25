package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ErrorCategory.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u0000 \u001a2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001aB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lio/realm/kotlin/internal/interop/ErrorCategory;", "Lio/realm/kotlin/internal/interop/CodeDescription;", "", "description", "", "nativeValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getNativeValue", "()I", "RLM_ERR_CAT_LOGIC", "RLM_ERR_CAT_RUNTIME", "RLM_ERR_CAT_INVALID_ARG", "RLM_ERR_CAT_FILE_ACCESS", "RLM_ERR_CAT_SYSTEM_ERROR", "RLM_ERR_CAT_APP_ERROR", "RLM_ERR_CAT_CLIENT_ERROR", "RLM_ERR_CAT_JSON_ERROR", "RLM_ERR_CAT_SERVICE_ERROR", "RLM_ERR_CAT_HTTP_ERROR", "RLM_ERR_CAT_CUSTOM_ERROR", "RLM_ERR_CAT_WEBSOCKET_ERROR", "RLM_ERR_CAT_SYNC_ERROR", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum ErrorCategory implements CodeDescription {
    RLM_ERR_CAT_LOGIC("Logic", 2),
    RLM_ERR_CAT_RUNTIME("Runtime", 4),
    RLM_ERR_CAT_INVALID_ARG("InvalidArg", 8),
    RLM_ERR_CAT_FILE_ACCESS("File", 16),
    RLM_ERR_CAT_SYSTEM_ERROR("System", 32),
    RLM_ERR_CAT_APP_ERROR("App", 64),
    RLM_ERR_CAT_CLIENT_ERROR("Client", 128),
    RLM_ERR_CAT_JSON_ERROR("Json", 256),
    RLM_ERR_CAT_SERVICE_ERROR("Service", 512),
    RLM_ERR_CAT_HTTP_ERROR("Http", 1024),
    RLM_ERR_CAT_CUSTOM_ERROR(TypedValues.Custom.NAME, 2048),
    RLM_ERR_CAT_WEBSOCKET_ERROR("Websocket", 4096),
    RLM_ERR_CAT_SYNC_ERROR("Sync", 8192);

    private final String description;
    private final int nativeValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<ErrorCategory> getEntries() {
        return $ENTRIES;
    }

    ErrorCategory(String str, int i) {
        this.description = str;
        this.nativeValue = i;
    }

    @Override // io.realm.kotlin.internal.interop.CodeDescription
    public String getDescription() {
        return this.description;
    }

    @Override // io.realm.kotlin.internal.interop.CodeDescription
    public int getNativeValue() {
        return this.nativeValue;
    }

    /* JADX INFO: compiled from: ErrorCategory.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lio/realm/kotlin/internal/interop/ErrorCategory$Companion;", "", "<init>", "()V", "of", "Lio/realm/kotlin/internal/interop/ErrorCategory;", "nativeValue", "", "of$cinterop_release", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ErrorCategory of$cinterop_release(int nativeValue) {
            for (ErrorCategory errorCategory : ErrorCategory.values()) {
                if (errorCategory.getNativeValue() == nativeValue) {
                    return errorCategory;
                }
            }
            return null;
        }
    }
}
