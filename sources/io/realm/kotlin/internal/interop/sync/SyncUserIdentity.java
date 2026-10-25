package io.realm.kotlin.internal.interop.sync;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SyncUserIdentity.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/realm/kotlin/internal/interop/sync/SyncUserIdentity;", "", "id", "", "provider", "Lio/realm/kotlin/internal/interop/sync/AuthProvider;", "<init>", "(Ljava/lang/String;Lio/realm/kotlin/internal/interop/sync/AuthProvider;)V", "getId", "()Ljava/lang/String;", "getProvider", "()Lio/realm/kotlin/internal/interop/sync/AuthProvider;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class SyncUserIdentity {
    private final String id;
    private final AuthProvider provider;

    public static /* synthetic */ SyncUserIdentity copy$default(SyncUserIdentity syncUserIdentity, String str, AuthProvider authProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            str = syncUserIdentity.id;
        }
        if ((i & 2) != 0) {
            authProvider = syncUserIdentity.provider;
        }
        return syncUserIdentity.copy(str, authProvider);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AuthProvider getProvider() {
        return this.provider;
    }

    public final SyncUserIdentity copy(String id, AuthProvider provider) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new SyncUserIdentity(id, provider);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncUserIdentity)) {
            return false;
        }
        SyncUserIdentity syncUserIdentity = (SyncUserIdentity) other;
        return Intrinsics.areEqual(this.id, syncUserIdentity.id) && this.provider == syncUserIdentity.provider;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.provider.hashCode();
    }

    public String toString() {
        return "SyncUserIdentity(id=" + this.id + ", provider=" + this.provider + ')';
    }

    public SyncUserIdentity(String id, AuthProvider provider) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.id = id;
        this.provider = provider;
    }

    public final String getId() {
        return this.id;
    }

    public final AuthProvider getProvider() {
        return this.provider;
    }
}
