package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.CapiT;
import io.realm.kotlin.internal.interop.NativePointer;
import kotlin.Metadata;

/* JADX INFO: compiled from: WebSocketTransport.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/WebSocketClient;", "", "send", "", "message", "", "handlerCallback", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/CapiT;", "Lio/realm/kotlin/internal/interop/RealmWebsocketHandlerCallbackPointer;", "close", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface WebSocketClient {
    void close();

    void send(byte[] message, NativePointer<CapiT> handlerCallback);
}
