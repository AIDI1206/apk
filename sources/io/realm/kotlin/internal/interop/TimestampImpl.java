package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

/* JADX INFO: compiled from: Timestamp.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/realm/kotlin/internal/interop/TimestampImpl;", "Lio/realm/kotlin/internal/interop/Timestamp;", "seconds", "", "nanoSeconds", "", "<init>", "(JI)V", "getSeconds", "()J", "getNanoSeconds", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class TimestampImpl implements Timestamp {
    private final int nanoSeconds;
    private final long seconds;

    public static /* synthetic */ TimestampImpl copy$default(TimestampImpl timestampImpl, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = timestampImpl.seconds;
        }
        if ((i2 & 2) != 0) {
            i = timestampImpl.nanoSeconds;
        }
        return timestampImpl.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getSeconds() {
        return this.seconds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNanoSeconds() {
        return this.nanoSeconds;
    }

    public final TimestampImpl copy(long seconds, int nanoSeconds) {
        return new TimestampImpl(seconds, nanoSeconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimestampImpl)) {
            return false;
        }
        TimestampImpl timestampImpl = (TimestampImpl) other;
        return this.seconds == timestampImpl.seconds && this.nanoSeconds == timestampImpl.nanoSeconds;
    }

    public int hashCode() {
        return (Long.hashCode(this.seconds) * 31) + Integer.hashCode(this.nanoSeconds);
    }

    public String toString() {
        return "TimestampImpl(seconds=" + this.seconds + ", nanoSeconds=" + this.nanoSeconds + ')';
    }

    public TimestampImpl(long j, int i) {
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
}
