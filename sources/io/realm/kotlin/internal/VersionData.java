package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.realm.kotlin.VersionId;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VersionData.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lio/realm/kotlin/internal/VersionData;", "", "current", "Lio/realm/kotlin/VersionId;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "<init>", "(Lio/realm/kotlin/VersionId;Ljava/util/Set;)V", "getCurrent", "()Lio/realm/kotlin/VersionId;", "getActive", "()Ljava/util/Set;", "versions", "getVersions", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VersionData {
    private final Set<VersionId> active;
    private final VersionId current;
    private final Set<VersionId> versions;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VersionData copy$default(VersionData versionData, VersionId versionId, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            versionId = versionData.current;
        }
        if ((i & 2) != 0) {
            set = versionData.active;
        }
        return versionData.copy(versionId, set);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VersionId getCurrent() {
        return this.current;
    }

    public final Set<VersionId> component2() {
        return this.active;
    }

    public final VersionData copy(VersionId current, Set<VersionId> active) {
        Intrinsics.checkNotNullParameter(active, "active");
        return new VersionData(current, active);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionData)) {
            return false;
        }
        VersionData versionData = (VersionData) other;
        return Intrinsics.areEqual(this.current, versionData.current) && Intrinsics.areEqual(this.active, versionData.active);
    }

    public int hashCode() {
        VersionId versionId = this.current;
        return ((versionId == null ? 0 : versionId.hashCode()) * 31) + this.active.hashCode();
    }

    public String toString() {
        return "VersionData(current=" + this.current + ", active=" + this.active + ')';
    }

    public VersionData(VersionId versionId, Set<VersionId> active) {
        Set of;
        Intrinsics.checkNotNullParameter(active, "active");
        this.current = versionId;
        this.active = active;
        this.versions = SetsKt.plus((versionId == null || (of = SetsKt.setOf(versionId)) == null) ? SetsKt.emptySet() : of, (Iterable) active);
    }

    public final Set<VersionId> getActive() {
        return this.active;
    }

    public final VersionId getCurrent() {
        return this.current;
    }

    public final Set<VersionId> getVersions() {
        return this.versions;
    }
}
