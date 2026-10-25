package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.CoreError;
import io.realm.kotlin.internal.interop.SyncSessionTransferCompletionCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JVMSyncSessionTransferCompletionCallback.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/JVMSyncSessionTransferCompletionCallback;", "", "callback", "Lio/realm/kotlin/internal/interop/SyncSessionTransferCompletionCallback;", "<init>", "(Lio/realm/kotlin/internal/interop/SyncSessionTransferCompletionCallback;)V", "onSuccess", "", "onError", "categoryFlags", "", "value", "message", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class JVMSyncSessionTransferCompletionCallback {
    private final SyncSessionTransferCompletionCallback callback;

    public JVMSyncSessionTransferCompletionCallback(SyncSessionTransferCompletionCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callback = callback;
    }

    public final void onSuccess() {
        this.callback.invoke(null);
    }

    public final void onError(int categoryFlags, int value, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.callback.invoke(new CoreError(categoryFlags, value, message));
    }
}
