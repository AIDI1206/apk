package io.realm.kotlin;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.medicmedia.medilink.domain.model.WorkerKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VersionId.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\tHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/realm/kotlin/VersionId;", "", WorkerKey.KEY_VERSION, "", "<init>", "(J)V", "getVersion", "()J", "compareTo", "", "other", "component1", "copy", "equals", "", "", "hashCode", "toString", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class VersionId implements Comparable<VersionId> {
    private final long version;

    public static /* synthetic */ VersionId copy$default(VersionId versionId, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = versionId.version;
        }
        return versionId.copy(j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    public final VersionId copy(long version) {
        return new VersionId(version);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VersionId) && this.version == ((VersionId) other).version;
    }

    public int hashCode() {
        return Long.hashCode(this.version);
    }

    public String toString() {
        return "VersionId(version=" + this.version + ')';
    }

    public VersionId(long j) {
        this.version = j;
        if (j < 0) {
            throw new IllegalArgumentException("'version' must both be numbers >= 0. It was: " + j);
        }
    }

    public final long getVersion() {
        return this.version;
    }

    @Override // java.lang.Comparable
    public int compareTo(VersionId other) {
        Intrinsics.checkNotNullParameter(other, "other");
        long j = this.version;
        long j2 = other.version;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }
}
