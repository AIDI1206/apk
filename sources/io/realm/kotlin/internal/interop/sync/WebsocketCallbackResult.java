package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.CodeDescription;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ProtocolErrorCode.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0015B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/WebsocketCallbackResult;", "Lio/realm/kotlin/internal/interop/CodeDescription;", "", "description", "", "nativeValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getNativeValue", "()I", "RLM_ERR_SYNC_SOCKET_SUCCESS", "RLM_ERR_SYNC_SOCKET_OPERATION_ABORTED", "RLM_ERR_SYNC_SOCKET_RUNTIME", "RLM_ERR_SYNC_SOCKET_OUT_OF_MEMORY", "RLM_ERR_SYNC_SOCKET_ADDRESS_SPACE_EXHAUSTED", "RLM_ERR_SYNC_SOCKET_CONNECTION_CLOSED", "RLM_ERR_SYNC_SOCKET_NOT_SUPPORTED", "RLM_ERR_SYNC_SOCKET_INVALID_ARGUMENT", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum WebsocketCallbackResult implements CodeDescription {
    RLM_ERR_SYNC_SOCKET_SUCCESS("Websocket callback success", 0),
    RLM_ERR_SYNC_SOCKET_OPERATION_ABORTED("Websocket callback aborted", 1027),
    RLM_ERR_SYNC_SOCKET_RUNTIME("Websocket Runtime error", 1000),
    RLM_ERR_SYNC_SOCKET_OUT_OF_MEMORY("Websocket out of memory ", 1003),
    RLM_ERR_SYNC_SOCKET_ADDRESS_SPACE_EXHAUSTED("Websocket address space exhausted", 1005),
    RLM_ERR_SYNC_SOCKET_CONNECTION_CLOSED("Websocket connection closed", 1030),
    RLM_ERR_SYNC_SOCKET_NOT_SUPPORTED("Websocket not supported", 2001),
    RLM_ERR_SYNC_SOCKET_INVALID_ARGUMENT("Websocket invalid argument", 3000);

    private final String description;
    private final int nativeValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<WebsocketCallbackResult> getEntries() {
        return $ENTRIES;
    }

    WebsocketCallbackResult(String str, int i) {
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

    /* JADX INFO: compiled from: ProtocolErrorCode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/WebsocketCallbackResult$Companion;", "", "<init>", "()V", "of", "Lio/realm/kotlin/internal/interop/sync/WebsocketCallbackResult;", "nativeValue", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WebsocketCallbackResult of(int nativeValue) {
            WebsocketCallbackResult next;
            Iterator<WebsocketCallbackResult> it = WebsocketCallbackResult.getEntries().iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next.getNativeValue() == nativeValue) {
                    return next;
                }
            }
            next = null;
            return next;
        }
    }
}
