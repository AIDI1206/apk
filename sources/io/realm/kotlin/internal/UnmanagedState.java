package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.WorkerKey;
import io.realm.kotlin.VersionId;
import kotlin.Metadata;

/* JADX INFO: compiled from: RealmState.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lio/realm/kotlin/internal/UnmanagedState;", "Lio/realm/kotlin/internal/RealmState;", "<init>", "()V", WorkerKey.KEY_VERSION, "Lio/realm/kotlin/VersionId;", "isFrozen", "", "isClosed", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class UnmanagedState implements RealmState {
    public static final UnmanagedState INSTANCE = new UnmanagedState();

    private UnmanagedState() {
    }

    @Override // io.realm.kotlin.Versioned, io.realm.kotlin.internal.RealmStateHolder
    public VersionId version() {
        throw new IllegalArgumentException("Cannot access life cycle information on unmanaged object");
    }

    @Override // io.realm.kotlin.internal.RealmState
    public boolean isFrozen() {
        throw new IllegalArgumentException("Cannot access life cycle information on unmanaged object");
    }

    @Override // io.realm.kotlin.internal.RealmState
    public boolean isClosed() {
        throw new IllegalArgumentException("Cannot access life cycle information on unmanaged object");
    }
}
