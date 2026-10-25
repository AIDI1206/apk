package io.realm.kotlin.notifications.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: Cancellable.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lio/realm/kotlin/notifications/internal/Cancellable;", "", "cancel", "", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface Cancellable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    void cancel();

    /* JADX INFO: compiled from: Cancellable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/notifications/internal/Cancellable$Companion;", "", "<init>", "()V", "NO_OP_NOTIFICATION_TOKEN", "Lio/realm/kotlin/notifications/internal/Cancellable;", "getNO_OP_NOTIFICATION_TOKEN", "()Lio/realm/kotlin/notifications/internal/Cancellable;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Cancellable NO_OP_NOTIFICATION_TOKEN = new Cancellable() { // from class: io.realm.kotlin.notifications.internal.Cancellable$Companion$NO_OP_NOTIFICATION_TOKEN$1
            @Override // io.realm.kotlin.notifications.internal.Cancellable
            public void cancel() {
            }
        };

        private Companion() {
        }

        public final Cancellable getNO_OP_NOTIFICATION_TOKEN() {
            return NO_OP_NOTIFICATION_TOKEN;
        }
    }
}
