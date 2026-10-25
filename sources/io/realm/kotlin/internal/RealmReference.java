package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.WorkerKey;
import io.realm.kotlin.VersionId;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.RealmInterop;
import io.realm.kotlin.internal.interop.RealmT;
import io.realm.kotlin.internal.schema.SchemaMetadata;
import kotlin.Metadata;

/* JADX INFO: compiled from: RealmReference.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\f0\u000bj\u0002`\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/realm/kotlin/internal/RealmReference;", "Lio/realm/kotlin/internal/RealmState;", "owner", "Lio/realm/kotlin/internal/BaseRealmImpl;", "getOwner", "()Lio/realm/kotlin/internal/BaseRealmImpl;", "schemaMetadata", "Lio/realm/kotlin/internal/schema/SchemaMetadata;", "getSchemaMetadata", "()Lio/realm/kotlin/internal/schema/SchemaMetadata;", "dbPointer", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/RealmT;", "Lio/realm/kotlin/internal/interop/RealmPointer;", "getDbPointer", "()Lio/realm/kotlin/internal/interop/NativePointer;", WorkerKey.KEY_VERSION, "Lio/realm/kotlin/VersionId;", "uncheckedVersion", "isFrozen", "", "isClosed", "close", "", "asValidLiveRealmReference", "Lio/realm/kotlin/internal/LiveRealmReference;", "checkClosed", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmReference extends RealmState {
    LiveRealmReference asValidLiveRealmReference();

    void checkClosed();

    void close();

    NativePointer<? extends RealmT> getDbPointer();

    BaseRealmImpl getOwner();

    SchemaMetadata getSchemaMetadata();

    @Override // io.realm.kotlin.internal.RealmState
    boolean isClosed();

    @Override // io.realm.kotlin.internal.RealmState
    boolean isFrozen();

    VersionId uncheckedVersion();

    @Override // io.realm.kotlin.Versioned, io.realm.kotlin.internal.RealmStateHolder
    VersionId version();

    /* JADX INFO: compiled from: RealmReference.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static VersionId version(RealmReference realmReference) {
            realmReference.checkClosed();
            return new VersionId(RealmInterop.INSTANCE.realm_get_version_id(realmReference.getDbPointer()));
        }

        public static VersionId uncheckedVersion(RealmReference realmReference) {
            return new VersionId(RealmInterop.INSTANCE.realm_get_version_id(realmReference.getDbPointer()));
        }

        public static boolean isFrozen(RealmReference realmReference) {
            realmReference.checkClosed();
            return RealmInterop.INSTANCE.realm_is_frozen(realmReference.getDbPointer());
        }

        public static boolean isClosed(RealmReference realmReference) {
            return RealmInterop.INSTANCE.realm_is_closed(realmReference.getDbPointer());
        }

        public static void close(RealmReference realmReference) {
            realmReference.checkClosed();
            RealmInterop.INSTANCE.realm_close(realmReference.getDbPointer());
        }

        public static LiveRealmReference asValidLiveRealmReference(RealmReference realmReference) {
            if (!(realmReference instanceof LiveRealmReference)) {
                throw new IllegalStateException("Cannot modify managed objects outside of a write transaction");
            }
            realmReference.checkClosed();
            return (LiveRealmReference) realmReference;
        }

        public static void checkClosed(RealmReference realmReference) {
            if (realmReference.isClosed()) {
                throw new IllegalStateException("Realm has been closed and is no longer accessible: " + realmReference.getOwner().getConfiguration().getPath());
            }
        }
    }
}
