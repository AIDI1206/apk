package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: Callback.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007H&¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/interop/SyncBeforeClientResetHandler;", "", "onBeforeReset", "", "realmBefore", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/FrozenRealmT;", "Lio/realm/kotlin/internal/interop/FrozenRealmPointer;", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface SyncBeforeClientResetHandler {
    void onBeforeReset(NativePointer<FrozenRealmT> realmBefore);
}
