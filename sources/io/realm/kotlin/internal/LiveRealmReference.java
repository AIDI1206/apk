package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.VersionId;
import io.realm.kotlin.internal.interop.LiveRealmT;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.RealmInterop;
import io.realm.kotlin.internal.schema.CachedSchemaMetadata;
import io.realm.kotlin.internal.schema.SchemaMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicRef;

/* JADX INFO: compiled from: RealmReference.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007HÆ\u0003J'\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lio/realm/kotlin/internal/LiveRealmReference;", "Lio/realm/kotlin/internal/RealmReference;", "owner", "Lio/realm/kotlin/internal/BaseRealmImpl;", "dbPointer", "Lio/realm/kotlin/internal/interop/NativePointer;", "Lio/realm/kotlin/internal/interop/LiveRealmT;", "Lio/realm/kotlin/internal/interop/LiveRealmPointer;", "<init>", "(Lio/realm/kotlin/internal/BaseRealmImpl;Lio/realm/kotlin/internal/interop/NativePointer;)V", "getOwner", "()Lio/realm/kotlin/internal/BaseRealmImpl;", "getDbPointer", "()Lio/realm/kotlin/internal/interop/NativePointer;", "schemaMetadata", "Lio/realm/kotlin/internal/schema/SchemaMetadata;", "getSchemaMetadata", "()Lio/realm/kotlin/internal/schema/SchemaMetadata;", "_schemaMetadata", "Lkotlinx/atomicfu/AtomicRef;", "snapshot", "Lio/realm/kotlin/internal/FrozenRealmReference;", "refreshSchemaMetadata", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class LiveRealmReference implements RealmReference {
    private final AtomicRef<SchemaMetadata> _schemaMetadata;
    private final NativePointer<LiveRealmT> dbPointer;
    private final BaseRealmImpl owner;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveRealmReference copy$default(LiveRealmReference liveRealmReference, BaseRealmImpl baseRealmImpl, NativePointer nativePointer, int i, Object obj) {
        if ((i & 1) != 0) {
            baseRealmImpl = liveRealmReference.owner;
        }
        if ((i & 2) != 0) {
            nativePointer = liveRealmReference.dbPointer;
        }
        return liveRealmReference.copy(baseRealmImpl, nativePointer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BaseRealmImpl getOwner() {
        return this.owner;
    }

    public final NativePointer<LiveRealmT> component2() {
        return this.dbPointer;
    }

    public final LiveRealmReference copy(BaseRealmImpl owner, NativePointer<LiveRealmT> dbPointer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(dbPointer, "dbPointer");
        return new LiveRealmReference(owner, dbPointer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveRealmReference)) {
            return false;
        }
        LiveRealmReference liveRealmReference = (LiveRealmReference) other;
        return Intrinsics.areEqual(this.owner, liveRealmReference.owner) && Intrinsics.areEqual(this.dbPointer, liveRealmReference.dbPointer);
    }

    public int hashCode() {
        return (this.owner.hashCode() * 31) + this.dbPointer.hashCode();
    }

    public String toString() {
        return "LiveRealmReference(owner=" + this.owner + ", dbPointer=" + this.dbPointer + ')';
    }

    public LiveRealmReference(BaseRealmImpl owner, NativePointer<LiveRealmT> dbPointer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(dbPointer, "dbPointer");
        this.owner = owner;
        this.dbPointer = dbPointer;
        this._schemaMetadata = AtomicFU.atomic(new CachedSchemaMetadata(getDbPointer(), getOwner().getConfiguration().getMapOfKClassWithCompanion().values()));
    }

    @Override // io.realm.kotlin.internal.RealmReference
    public LiveRealmReference asValidLiveRealmReference() {
        return RealmReference.DefaultImpls.asValidLiveRealmReference(this);
    }

    @Override // io.realm.kotlin.internal.RealmReference
    public void checkClosed() {
        RealmReference.DefaultImpls.checkClosed(this);
    }

    @Override // io.realm.kotlin.internal.RealmReference
    public void close() {
        RealmReference.DefaultImpls.close(this);
    }

    @Override // io.realm.kotlin.internal.RealmReference, io.realm.kotlin.internal.RealmState
    public boolean isClosed() {
        return RealmReference.DefaultImpls.isClosed(this);
    }

    @Override // io.realm.kotlin.internal.RealmReference, io.realm.kotlin.internal.RealmState
    public boolean isFrozen() {
        return RealmReference.DefaultImpls.isFrozen(this);
    }

    @Override // io.realm.kotlin.internal.RealmReference
    public VersionId uncheckedVersion() {
        return RealmReference.DefaultImpls.uncheckedVersion(this);
    }

    @Override // io.realm.kotlin.internal.RealmReference, io.realm.kotlin.Versioned, io.realm.kotlin.internal.RealmStateHolder
    public VersionId version() {
        return RealmReference.DefaultImpls.version(this);
    }

    @Override // io.realm.kotlin.internal.RealmReference
    public BaseRealmImpl getOwner() {
        return this.owner;
    }

    @Override // io.realm.kotlin.internal.RealmReference
    public NativePointer<LiveRealmT> getDbPointer() {
        return this.dbPointer;
    }

    @Override // io.realm.kotlin.internal.RealmReference
    public SchemaMetadata getSchemaMetadata() {
        return this._schemaMetadata.getValue();
    }

    public final FrozenRealmReference snapshot(BaseRealmImpl owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return new FrozenRealmReferenceImpl(owner, RealmInterop.INSTANCE.realm_freeze(getDbPointer()), getSchemaMetadata());
    }

    public final void refreshSchemaMetadata() {
        this._schemaMetadata.setValue(new CachedSchemaMetadata(getDbPointer(), getOwner().getConfiguration().getMapOfKClassWithCompanion().values()));
    }
}
