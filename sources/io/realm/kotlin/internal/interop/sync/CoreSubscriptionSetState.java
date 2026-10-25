package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.realm.kotlin.internal.interop.NativeEnumerated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: CoreSubscriptionSetState.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/CoreSubscriptionSetState;", "Lio/realm/kotlin/internal/interop/NativeEnumerated;", "", "nativeValue", "", "<init>", "(Ljava/lang/String;II)V", "getNativeValue", "()I", "RLM_SYNC_SUBSCRIPTION_UNCOMMITTED", "RLM_SYNC_SUBSCRIPTION_PENDING", "RLM_SYNC_SUBSCRIPTION_BOOTSTRAPPING", "RLM_SYNC_SUBSCRIPTION_COMPLETE", "RLM_SYNC_SUBSCRIPTION_ERROR", "RLM_SYNC_SUBSCRIPTION_SUPERSEDED", "RLM_SYNC_SUBSCRIPTION_AWAITING_MARK", "Companion", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public enum CoreSubscriptionSetState implements NativeEnumerated {
    RLM_SYNC_SUBSCRIPTION_UNCOMMITTED(0),
    RLM_SYNC_SUBSCRIPTION_PENDING(1),
    RLM_SYNC_SUBSCRIPTION_BOOTSTRAPPING(2),
    RLM_SYNC_SUBSCRIPTION_COMPLETE(3),
    RLM_SYNC_SUBSCRIPTION_ERROR(4),
    RLM_SYNC_SUBSCRIPTION_SUPERSEDED(5),
    RLM_SYNC_SUBSCRIPTION_AWAITING_MARK(6);

    private final int nativeValue;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static EnumEntries<CoreSubscriptionSetState> getEntries() {
        return $ENTRIES;
    }

    CoreSubscriptionSetState(int i) {
        this.nativeValue = i;
    }

    @Override // io.realm.kotlin.internal.interop.NativeEnumerated
    public int getNativeValue() {
        return this.nativeValue;
    }

    /* JADX INFO: compiled from: CoreSubscriptionSetState.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/CoreSubscriptionSetState$Companion;", "", "<init>", "()V", "of", "Lio/realm/kotlin/internal/interop/sync/CoreSubscriptionSetState;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CoreSubscriptionSetState of(int state) {
            for (CoreSubscriptionSetState coreSubscriptionSetState : CoreSubscriptionSetState.getEntries()) {
                if (coreSubscriptionSetState.getNativeValue() == state) {
                    return coreSubscriptionSetState;
                }
            }
            throw new IllegalStateException(("Unknown subscription set state: " + state).toString());
        }
    }
}
