package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.CodeDescription;
import io.realm.kotlin.internal.interop.realm_sync_errno_session_e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ProtocolErrorCode.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b,\b\u0086\u0081\u0002\u0018\u0000 12\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u00011B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00062"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/SyncSessionErrorCode;", "Lio/realm/kotlin/internal/interop/CodeDescription;", "", "description", "", "nativeValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "getDescription", "()Ljava/lang/String;", "getNativeValue", "()I", "RLM_SYNC_ERR_SESSION_SESSION_CLOSED", "RLM_SYNC_ERR_SESSION_OTHER_SESSION_ERROR", "RLM_SYNC_ERR_SESSION_TOKEN_EXPIRED", "RLM_SYNC_ERR_SESSION_BAD_AUTHENTICATION", "RLM_SYNC_ERR_SESSION_ILLEGAL_REALM_PATH", "RLM_SYNC_ERR_SESSION_NO_SUCH_REALM", "RLM_SYNC_ERR_SESSION_PERMISSION_DENIED", "RLM_SYNC_ERR_SESSION_BAD_SERVER_FILE_IDENT", "RLM_SYNC_ERR_SESSION_BAD_CLIENT_FILE_IDENT", "RLM_SYNC_ERR_SESSION_BAD_SERVER_VERSION", "RLM_SYNC_ERR_SESSION_BAD_CLIENT_VERSION", "RLM_SYNC_ERR_SESSION_DIVERGING_HISTORIES", "RLM_SYNC_ERR_SESSION_BAD_CHANGESET", "RLM_SYNC_ERR_SESSION_PARTIAL_SYNC_DISABLED", "RLM_SYNC_ERR_SESSION_UNSUPPORTED_SESSION_FEATURE", "RLM_SYNC_ERR_SESSION_BAD_ORIGIN_FILE_IDENT", "RLM_SYNC_ERR_SESSION_BAD_CLIENT_FILE", "RLM_SYNC_ERR_SESSION_SERVER_FILE_DELETED", "RLM_SYNC_ERR_SESSION_CLIENT_FILE_BLACKLISTED", "RLM_SYNC_ERR_SESSION_USER_BLACKLISTED", "RLM_SYNC_ERR_SESSION_TRANSACT_BEFORE_UPLOAD", "RLM_SYNC_ERR_SESSION_CLIENT_FILE_EXPIRED", "RLM_SYNC_ERR_SESSION_USER_MISMATCH", "RLM_SYNC_ERR_SESSION_TOO_MANY_SESSIONS", "RLM_SYNC_ERR_SESSION_INVALID_SCHEMA_CHANGE", "RLM_SYNC_ERR_SESSION_BAD_QUERY", "RLM_SYNC_ERR_SESSION_OBJECT_ALREADY_EXISTS", "RLM_SYNC_ERR_SESSION_SERVER_PERMISSIONS_CHANGED", "RLM_SYNC_ERR_SESSION_INITIAL_SYNC_NOT_COMPLETED", "RLM_SYNC_ERR_SESSION_WRITE_NOT_ALLOWED", "RLM_SYNC_ERR_SESSION_COMPENSATING_WRITE", "RLM_SYNC_ERR_SESSION_MIGRATE_TO_FLX", "RLM_SYNC_ERR_SESSION_BAD_PROGRESS", "RLM_SYNC_ERR_SESSION_REVERT_TO_PBS", "RLM_SYNC_ERR_SESSION_BAD_SCHEMA_VERSION", "RLM_SYNC_ERR_SESSION_SCHEMA_VERSION_CHANGED", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum SyncSessionErrorCode implements CodeDescription {
    RLM_SYNC_ERR_SESSION_SESSION_CLOSED("SessionClosed", 200),
    RLM_SYNC_ERR_SESSION_OTHER_SESSION_ERROR("OtherSessioError", 201),
    RLM_SYNC_ERR_SESSION_TOKEN_EXPIRED("TokenExpired", 202),
    RLM_SYNC_ERR_SESSION_BAD_AUTHENTICATION("BadAuthentication", 203),
    RLM_SYNC_ERR_SESSION_ILLEGAL_REALM_PATH("IllegalRealmPath", 204),
    RLM_SYNC_ERR_SESSION_NO_SUCH_REALM("NoSuchRealm", 205),
    RLM_SYNC_ERR_SESSION_PERMISSION_DENIED("PermissionDenied", 206),
    RLM_SYNC_ERR_SESSION_BAD_SERVER_FILE_IDENT("BadServerFileIdent", 207),
    RLM_SYNC_ERR_SESSION_BAD_CLIENT_FILE_IDENT("BadClientFileIdent", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_CLIENT_FILE_IDENT),
    RLM_SYNC_ERR_SESSION_BAD_SERVER_VERSION("BadServerVersion", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_SERVER_VERSION),
    RLM_SYNC_ERR_SESSION_BAD_CLIENT_VERSION("BadClientVersion", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_CLIENT_VERSION),
    RLM_SYNC_ERR_SESSION_DIVERGING_HISTORIES("DivergingHistories", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_DIVERGING_HISTORIES),
    RLM_SYNC_ERR_SESSION_BAD_CHANGESET("BadChangeset", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_CHANGESET),
    RLM_SYNC_ERR_SESSION_PARTIAL_SYNC_DISABLED("PartialSyncDisabled", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_PARTIAL_SYNC_DISABLED),
    RLM_SYNC_ERR_SESSION_UNSUPPORTED_SESSION_FEATURE("UnsupportedSessionFeature", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_UNSUPPORTED_SESSION_FEATURE),
    RLM_SYNC_ERR_SESSION_BAD_ORIGIN_FILE_IDENT("BadOriginFileIdent", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_ORIGIN_FILE_IDENT),
    RLM_SYNC_ERR_SESSION_BAD_CLIENT_FILE("BadClientFile", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_CLIENT_FILE),
    RLM_SYNC_ERR_SESSION_SERVER_FILE_DELETED("ServerFileDeleted", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_SERVER_FILE_DELETED),
    RLM_SYNC_ERR_SESSION_CLIENT_FILE_BLACKLISTED("ClientFileBlacklisted", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_CLIENT_FILE_BLACKLISTED),
    RLM_SYNC_ERR_SESSION_USER_BLACKLISTED("UserBlacklisted", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_USER_BLACKLISTED),
    RLM_SYNC_ERR_SESSION_TRANSACT_BEFORE_UPLOAD("TransactBeforeUpload", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_TRANSACT_BEFORE_UPLOAD),
    RLM_SYNC_ERR_SESSION_CLIENT_FILE_EXPIRED("ClientFileExpired", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_CLIENT_FILE_EXPIRED),
    RLM_SYNC_ERR_SESSION_USER_MISMATCH("UserMismatch", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_USER_MISMATCH),
    RLM_SYNC_ERR_SESSION_TOO_MANY_SESSIONS("TooManySession", 224),
    RLM_SYNC_ERR_SESSION_INVALID_SCHEMA_CHANGE("InvalidSchemaChange", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_INVALID_SCHEMA_CHANGE),
    RLM_SYNC_ERR_SESSION_BAD_QUERY("BadQuery", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_QUERY),
    RLM_SYNC_ERR_SESSION_OBJECT_ALREADY_EXISTS("ObjectAlreadyExists", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_OBJECT_ALREADY_EXISTS),
    RLM_SYNC_ERR_SESSION_SERVER_PERMISSIONS_CHANGED("ServerPermissionsChanged", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_SERVER_PERMISSIONS_CHANGED),
    RLM_SYNC_ERR_SESSION_INITIAL_SYNC_NOT_COMPLETED("InitialSyncNotCompleted", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_INITIAL_SYNC_NOT_COMPLETED),
    RLM_SYNC_ERR_SESSION_WRITE_NOT_ALLOWED("WriteNotAllowed", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_WRITE_NOT_ALLOWED),
    RLM_SYNC_ERR_SESSION_COMPENSATING_WRITE("CompensatingWrite", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_COMPENSATING_WRITE),
    RLM_SYNC_ERR_SESSION_MIGRATE_TO_FLX("MigrateToFlexibleSync", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_MIGRATE_TO_FLX),
    RLM_SYNC_ERR_SESSION_BAD_PROGRESS("BadProgress", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_PROGRESS),
    RLM_SYNC_ERR_SESSION_REVERT_TO_PBS("RevertToPartitionBasedSync", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_REVERT_TO_PBS),
    RLM_SYNC_ERR_SESSION_BAD_SCHEMA_VERSION("BadSchemaVersion", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_BAD_SCHEMA_VERSION),
    RLM_SYNC_ERR_SESSION_SCHEMA_VERSION_CHANGED("SchemaVersionChanged", realm_sync_errno_session_e.RLM_SYNC_ERR_SESSION_SCHEMA_VERSION_CHANGED);

    private final String description;
    private final int nativeValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<SyncSessionErrorCode> getEntries() {
        return $ENTRIES;
    }

    SyncSessionErrorCode(String str, int i) {
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
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/SyncSessionErrorCode$Companion;", "", "<init>", "()V", "of", "Lio/realm/kotlin/internal/interop/sync/SyncSessionErrorCode;", "nativeValue", "", "of$cinterop_release", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SyncSessionErrorCode of$cinterop_release(int nativeValue) {
            SyncSessionErrorCode next;
            Iterator<SyncSessionErrorCode> it = SyncSessionErrorCode.getEntries().iterator();
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
