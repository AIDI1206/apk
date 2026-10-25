package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.CodeDescription;
import io.realm.kotlin.internal.interop.realm_web_socket_errno_e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ProtocolErrorCode.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u0000 #2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001#B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006$"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/WebsocketErrorCode;", "Lio/realm/kotlin/internal/interop/CodeDescription;", "", "description", "", "nativeValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getNativeValue", "()I", "RLM_ERR_WEBSOCKET_OK", "RLM_ERR_WEBSOCKET_GOINGAWAY", "RLM_ERR_WEBSOCKET_PROTOCOLERROR", "RLM_ERR_WEBSOCKET_UNSUPPORTEDDATA", "RLM_ERR_WEBSOCKET_RESERVED", "RLM_ERR_WEBSOCKET_NOSTATUSRECEIVED", "RLM_ERR_WEBSOCKET_ABNORMALCLOSURE", "RLM_ERR_WEBSOCKET_INVALIDPAYLOADDATA", "RLM_ERR_WEBSOCKET_POLICYVIOLATION", "RLM_ERR_WEBSOCKET_MESSAGETOOBIG", "RLM_ERR_WEBSOCKET_INAVALIDEXTENSION", "RLM_ERR_WEBSOCKET_INTERNALSERVERERROR", "RLM_ERR_WEBSOCKET_TLSHANDSHAKEFAILED", "RLM_ERR_WEBSOCKET_UNAUTHORIZED", "RLM_ERR_WEBSOCKET_FORBIDDEN", "RLM_ERR_WEBSOCKET_MOVEDPERMANENTLY", "RLM_ERR_WEBSOCKET_RESOLVE_FAILED", "RLM_ERR_WEBSOCKET_CONNECTION_FAILED", "RLM_ERR_WEBSOCKET_READ_ERROR", "RLM_ERR_WEBSOCKET_WRITE_ERROR", "RLM_ERR_WEBSOCKET_RETRY_ERROR", "RLM_ERR_WEBSOCKET_FATAL_ERROR", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum WebsocketErrorCode implements CodeDescription {
    RLM_ERR_WEBSOCKET_OK("Ok", 1000),
    RLM_ERR_WEBSOCKET_GOINGAWAY("GoingAway", 1001),
    RLM_ERR_WEBSOCKET_PROTOCOLERROR("ProtocolError", 1002),
    RLM_ERR_WEBSOCKET_UNSUPPORTEDDATA("UnsupportedData", 1003),
    RLM_ERR_WEBSOCKET_RESERVED("Reserved", 1004),
    RLM_ERR_WEBSOCKET_NOSTATUSRECEIVED("NoStatusReceived", 1005),
    RLM_ERR_WEBSOCKET_ABNORMALCLOSURE("AbnormalClosure", 1006),
    RLM_ERR_WEBSOCKET_INVALIDPAYLOADDATA("InvalidPayloadData", 1007),
    RLM_ERR_WEBSOCKET_POLICYVIOLATION("PolicyViolation", 1008),
    RLM_ERR_WEBSOCKET_MESSAGETOOBIG("MessageToBig", 1009),
    RLM_ERR_WEBSOCKET_INAVALIDEXTENSION("InvalidExtension", 1010),
    RLM_ERR_WEBSOCKET_INTERNALSERVERERROR("InternalServerError", 1011),
    RLM_ERR_WEBSOCKET_TLSHANDSHAKEFAILED("TlsHandshakeFailed", 1015),
    RLM_ERR_WEBSOCKET_UNAUTHORIZED("Unauthorized", realm_web_socket_errno_e.RLM_ERR_WEBSOCKET_UNAUTHORIZED),
    RLM_ERR_WEBSOCKET_FORBIDDEN("Forbidden", realm_web_socket_errno_e.RLM_ERR_WEBSOCKET_FORBIDDEN),
    RLM_ERR_WEBSOCKET_MOVEDPERMANENTLY("MovedPermanently", realm_web_socket_errno_e.RLM_ERR_WEBSOCKET_MOVEDPERMANENTLY),
    RLM_ERR_WEBSOCKET_RESOLVE_FAILED("ResolveFailed", realm_web_socket_errno_e.RLM_ERR_WEBSOCKET_RESOLVE_FAILED),
    RLM_ERR_WEBSOCKET_CONNECTION_FAILED("ConnectionFailed", realm_web_socket_errno_e.RLM_ERR_WEBSOCKET_CONNECTION_FAILED),
    RLM_ERR_WEBSOCKET_READ_ERROR("ReadError", realm_web_socket_errno_e.RLM_ERR_WEBSOCKET_READ_ERROR),
    RLM_ERR_WEBSOCKET_WRITE_ERROR("WriteError", realm_web_socket_errno_e.RLM_ERR_WEBSOCKET_WRITE_ERROR),
    RLM_ERR_WEBSOCKET_RETRY_ERROR("RetryError", realm_web_socket_errno_e.RLM_ERR_WEBSOCKET_RETRY_ERROR),
    RLM_ERR_WEBSOCKET_FATAL_ERROR("FatalError", realm_web_socket_errno_e.RLM_ERR_WEBSOCKET_FATAL_ERROR);

    private final String description;
    private final int nativeValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<WebsocketErrorCode> getEntries() {
        return $ENTRIES;
    }

    WebsocketErrorCode(String str, int i) {
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
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/WebsocketErrorCode$Companion;", "", "<init>", "()V", "of", "Lio/realm/kotlin/internal/interop/sync/WebsocketErrorCode;", "nativeValue", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WebsocketErrorCode of(int nativeValue) {
            WebsocketErrorCode next;
            Iterator<WebsocketErrorCode> it = WebsocketErrorCode.getEntries().iterator();
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
