package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: Callback.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\t0\u0005j\u0002`\n2\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\f0\u0005j\u0002`\rH&¨\u0006\u000e"}, d2 = {"Lio/realm/kotlin/internal/interop/MigrationCallback;", "", "migrate", "", "oldRealm", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/FrozenRealmT;", "Lio/realm/kotlin/internal/interop/FrozenRealmPointer;", "newRealm", "Lio/realm/kotlin/internal/interop/LiveRealmT;", "Lio/realm/kotlin/internal/interop/LiveRealmPointer;", "schema", "Lio/realm/kotlin/internal/interop/RealmSchemaT;", "Lio/realm/kotlin/internal/interop/RealmSchemaPointer;", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface MigrationCallback {
    void migrate(NativePointer<FrozenRealmT> oldRealm, NativePointer<LiveRealmT> newRealm, NativePointer<RealmSchemaT> schema);
}
