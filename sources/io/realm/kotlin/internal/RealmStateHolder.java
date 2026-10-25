package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.WorkerKey;
import io.realm.kotlin.VersionId;
import kotlin.Metadata;

/* JADX INFO: compiled from: RealmState.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0001H&J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/RealmStateHolder;", "Lio/realm/kotlin/internal/RealmState;", "realmState", WorkerKey.KEY_VERSION, "Lio/realm/kotlin/VersionId;", "isFrozen", "", "isClosed", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmStateHolder extends RealmState {
    @Override // io.realm.kotlin.internal.RealmState
    boolean isClosed();

    @Override // io.realm.kotlin.internal.RealmState
    boolean isFrozen();

    RealmState realmState();

    VersionId version();

    /* JADX INFO: compiled from: RealmState.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static VersionId version(RealmStateHolder realmStateHolder) {
            return realmStateHolder.realmState().version();
        }

        public static boolean isFrozen(RealmStateHolder realmStateHolder) {
            return realmStateHolder.realmState().isFrozen();
        }

        public static boolean isClosed(RealmStateHolder realmStateHolder) {
            return realmStateHolder.realmState().isClosed();
        }
    }
}
