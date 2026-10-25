package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.CodeDescription;
import io.realm.kotlin.internal.interop.realm_sync_errno_connection_e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ProtocolErrorCode.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001cB\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001d"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/SyncConnectionErrorCode;", "Lio/realm/kotlin/internal/interop/CodeDescription;", "", "description", "", "nativeValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getNativeValue", "()I", "RLM_SYNC_ERR_CONNECTION_CONNECTION_CLOSED", "RLM_SYNC_ERR_CONNECTION_OTHER_ERROR", "RLM_SYNC_ERR_CONNECTION_UNKNOWN_MESSAGE", "RLM_SYNC_ERR_CONNECTION_BAD_SYNTAX", "RLM_SYNC_ERR_CONNECTION_LIMITS_EXCEEDED", "RLM_SYNC_ERR_CONNECTION_WRONG_PROTOCOL_VERSION", "RLM_SYNC_ERR_CONNECTION_BAD_SESSION_IDENT", "RLM_SYNC_ERR_CONNECTION_REUSE_OF_SESSION_IDENT", "RLM_SYNC_ERR_CONNECTION_BOUND_IN_OTHER_SESSION", "RLM_SYNC_ERR_CONNECTION_BAD_MESSAGE_ORDER", "RLM_SYNC_ERR_CONNECTION_BAD_DECOMPRESSION", "RLM_SYNC_ERR_CONNECTION_BAD_CHANGESET_HEADER_SYNTAX", "RLM_SYNC_ERR_CONNECTION_BAD_CHANGESET_SIZE", "RLM_SYNC_ERR_CONNECTION_SWITCH_TO_FLX_SYNC", "RLM_SYNC_ERR_CONNECTION_SWITCH_TO_PBS", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum SyncConnectionErrorCode implements CodeDescription {
    RLM_SYNC_ERR_CONNECTION_CONNECTION_CLOSED("ConnectionClosed", 100),
    RLM_SYNC_ERR_CONNECTION_OTHER_ERROR("OtherError", 101),
    RLM_SYNC_ERR_CONNECTION_UNKNOWN_MESSAGE("UnknownMessage", 102),
    RLM_SYNC_ERR_CONNECTION_BAD_SYNTAX("BadSyntax", 103),
    RLM_SYNC_ERR_CONNECTION_LIMITS_EXCEEDED("LimitsExceeded", 104),
    RLM_SYNC_ERR_CONNECTION_WRONG_PROTOCOL_VERSION("WrongBadSyncPartitionValueProtocolVersion", realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_WRONG_PROTOCOL_VERSION),
    RLM_SYNC_ERR_CONNECTION_BAD_SESSION_IDENT("BadSessionIdent", realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_BAD_SESSION_IDENT),
    RLM_SYNC_ERR_CONNECTION_REUSE_OF_SESSION_IDENT("ReuseOfSessionIdent", realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_REUSE_OF_SESSION_IDENT),
    RLM_SYNC_ERR_CONNECTION_BOUND_IN_OTHER_SESSION("BoundInOtherSession", 108),
    RLM_SYNC_ERR_CONNECTION_BAD_MESSAGE_ORDER("BadMessageOrder", 109),
    RLM_SYNC_ERR_CONNECTION_BAD_DECOMPRESSION("BadDecompression", realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_BAD_DECOMPRESSION),
    RLM_SYNC_ERR_CONNECTION_BAD_CHANGESET_HEADER_SYNTAX("BadChangesetHeaderSyntax", realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_BAD_CHANGESET_HEADER_SYNTAX),
    RLM_SYNC_ERR_CONNECTION_BAD_CHANGESET_SIZE("BadChangesetSize", realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_BAD_CHANGESET_SIZE),
    RLM_SYNC_ERR_CONNECTION_SWITCH_TO_FLX_SYNC("SwitchToFlxSync", realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_SWITCH_TO_FLX_SYNC),
    RLM_SYNC_ERR_CONNECTION_SWITCH_TO_PBS("SwitchToPbs", realm_sync_errno_connection_e.RLM_SYNC_ERR_CONNECTION_SWITCH_TO_PBS);

    private final String description;
    private final int nativeValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<SyncConnectionErrorCode> getEntries() {
        return $ENTRIES;
    }

    SyncConnectionErrorCode(String str, int i) {
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
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/SyncConnectionErrorCode$Companion;", "", "<init>", "()V", "of", "Lio/realm/kotlin/internal/interop/sync/SyncConnectionErrorCode;", "nativeValue", "", "of$cinterop_release", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SyncConnectionErrorCode of$cinterop_release(int nativeValue) {
            SyncConnectionErrorCode next;
            Iterator<SyncConnectionErrorCode> it = SyncConnectionErrorCode.getEntries().iterator();
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
