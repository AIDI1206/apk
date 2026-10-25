package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.VersionId;
import io.realm.kotlin.internal.interop.FrozenRealmT;
import io.realm.kotlin.internal.interop.NativePointer;
import kotlin.Metadata;

/* JADX INFO: compiled from: RealmReference.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001c\u0010\u0002\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/realm/kotlin/internal/FrozenRealmReference;", "Lio/realm/kotlin/internal/RealmReference;", "dbPointer", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/FrozenRealmT;", "Lio/realm/kotlin/internal/interop/FrozenRealmPointer;", "getDbPointer", "()Lio/realm/kotlin/internal/interop/NativePointer;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface FrozenRealmReference extends RealmReference {
    @Override // io.realm.kotlin.internal.RealmReference
    NativePointer<FrozenRealmT> getDbPointer();

    /* JADX INFO: compiled from: RealmReference.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static LiveRealmReference asValidLiveRealmReference(FrozenRealmReference frozenRealmReference) {
            return RealmReference.DefaultImpls.asValidLiveRealmReference(frozenRealmReference);
        }

        public static void checkClosed(FrozenRealmReference frozenRealmReference) {
            RealmReference.DefaultImpls.checkClosed(frozenRealmReference);
        }

        public static void close(FrozenRealmReference frozenRealmReference) {
            RealmReference.DefaultImpls.close(frozenRealmReference);
        }

        public static boolean isClosed(FrozenRealmReference frozenRealmReference) {
            return RealmReference.DefaultImpls.isClosed(frozenRealmReference);
        }

        public static boolean isFrozen(FrozenRealmReference frozenRealmReference) {
            return RealmReference.DefaultImpls.isFrozen(frozenRealmReference);
        }

        public static VersionId uncheckedVersion(FrozenRealmReference frozenRealmReference) {
            return RealmReference.DefaultImpls.uncheckedVersion(frozenRealmReference);
        }

        public static VersionId version(FrozenRealmReference frozenRealmReference) {
            return RealmReference.DefaultImpls.version(frozenRealmReference);
        }
    }
}
