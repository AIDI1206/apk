package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: Callback.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lio/realm/kotlin/internal/interop/SyncThreadObserver;", "", "threadName", "", "onCreated", "", "onDestroyed", "onError", com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SyncThreadObserver {
    void onCreated();

    void onDestroyed();

    void onError(String error);

    String threadName();
}
