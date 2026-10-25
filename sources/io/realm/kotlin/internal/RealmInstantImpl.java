package io.realm.kotlin.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.interop.Timestamp;
import io.realm.kotlin.types.RealmInstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealmInstantImpl.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\nJ\u0011\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lio/realm/kotlin/internal/RealmInstantImpl;", "Lio/realm/kotlin/internal/interop/Timestamp;", "Lio/realm/kotlin/types/RealmInstant;", "seconds", "", "nanoSeconds", "", "<init>", "(JI)V", "ts", "(Lio/realm/kotlin/internal/interop/Timestamp;)V", "getSeconds", "()J", "getNanoSeconds", "()I", "epochSeconds", "getEpochSeconds", "nanosecondsOfSecond", "getNanosecondsOfSecond", "compareTo", "other", "toString", "", "component1", "component2", "copy", "equals", "", "", "hashCode", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class RealmInstantImpl implements Timestamp, RealmInstant {
    private final int nanoSeconds;
    private final long seconds;

    public static /* synthetic */ RealmInstantImpl copy$default(RealmInstantImpl realmInstantImpl, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = realmInstantImpl.seconds;
        }
        if ((i2 & 2) != 0) {
            i = realmInstantImpl.nanoSeconds;
        }
        return realmInstantImpl.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getSeconds() {
        return this.seconds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNanoSeconds() {
        return this.nanoSeconds;
    }

    public final RealmInstantImpl copy(long seconds, int nanoSeconds) {
        return new RealmInstantImpl(seconds, nanoSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealmInstantImpl)) {
            return false;
        }
        RealmInstantImpl realmInstantImpl = (RealmInstantImpl) other;
        return this.seconds == realmInstantImpl.seconds && this.nanoSeconds == realmInstantImpl.nanoSeconds;
    }

    public int hashCode() {
        return (Long.hashCode(this.seconds) * 31) + Integer.hashCode(this.nanoSeconds);
    }

    public RealmInstantImpl(long j, int i) {
        this.seconds = j;
        this.nanoSeconds = i;
    }

    @Override // io.realm.kotlin.internal.interop.Timestamp
    public int getNanoSeconds() {
        return this.nanoSeconds;
    }

    @Override // io.realm.kotlin.internal.interop.Timestamp
    public long getSeconds() {
        return this.seconds;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RealmInstantImpl(Timestamp ts) {
        this(ts.getSeconds(), ts.getNanoSeconds());
        Intrinsics.checkNotNullParameter(ts, "ts");
    }

    @Override // io.realm.kotlin.types.RealmInstant
    public long getEpochSeconds() {
        return getSeconds();
    }

    @Override // io.realm.kotlin.types.RealmInstant
    public int getNanosecondsOfSecond() {
        return getNanoSeconds();
    }

    @Override // java.lang.Comparable
    public int compareTo(RealmInstant other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (getEpochSeconds() < other.getEpochSeconds()) {
            return -1;
        }
        if (getEpochSeconds() > other.getEpochSeconds()) {
            return 1;
        }
        return Intrinsics.compare(getNanosecondsOfSecond(), other.getNanosecondsOfSecond());
    }

    public String toString() {
        return "RealmInstant(epochSeconds=" + getEpochSeconds() + ", nanosecondsOfSecond=" + getNanosecondsOfSecond() + ')';
    }
}
