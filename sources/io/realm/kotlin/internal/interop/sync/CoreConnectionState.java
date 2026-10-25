package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CoreConnectionState.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/CoreConnectionState;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RLM_SYNC_CONNECTION_STATE_DISCONNECTED", "RLM_SYNC_CONNECTION_STATE_CONNECTING", "RLM_SYNC_CONNECTION_STATE_CONNECTED", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum CoreConnectionState {
    RLM_SYNC_CONNECTION_STATE_DISCONNECTED(0),
    RLM_SYNC_CONNECTION_STATE_CONNECTING(1),
    RLM_SYNC_CONNECTION_STATE_CONNECTED(2);

    private final int value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<CoreConnectionState> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static final CoreConnectionState of(int i) {
        return INSTANCE.of(i);
    }

    CoreConnectionState(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: compiled from: CoreConnectionState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/CoreConnectionState$Companion;", "", "<init>", "()V", "of", "Lio/realm/kotlin/internal/interop/sync/CoreConnectionState;", "value", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CoreConnectionState of(int value) {
            CoreConnectionState next;
            Iterator<CoreConnectionState> it = CoreConnectionState.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.getValue() != value);
            CoreConnectionState coreConnectionState = next;
            if (coreConnectionState != null) {
                return coreConnectionState;
            }
            throw new IllegalStateException(("Unknown connection state: " + value).toString());
        }
    }
}
