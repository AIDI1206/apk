package io.realm.kotlin.types;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.internal.RealmInstantImpl;
import io.realm.kotlin.internal.platform.SystemUtilsAndroidKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: RealmInstant.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lio/realm/kotlin/types/RealmInstant;", "", "epochSeconds", "", "getEpochSeconds", "()J", "nanosecondsOfSecond", "", "getNanosecondsOfSecond", "()I", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface RealmInstant extends Comparable<RealmInstant> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int SEC_AS_NANOSECOND = 1000000000;

    long getEpochSeconds();

    int getNanosecondsOfSecond();

    /* JADX INFO: compiled from: RealmInstant.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u0006\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0011"}, d2 = {"Lio/realm/kotlin/types/RealmInstant$Companion;", "", "<init>", "()V", "SEC_AS_NANOSECOND", "", "MIN", "Lio/realm/kotlin/types/RealmInstant;", "getMIN", "()Lio/realm/kotlin/types/RealmInstant;", "MAX", "getMAX", "from", "epochSeconds", "", "nanosecondAdjustment", "now", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE;
        private static final RealmInstant MAX;
        private static final RealmInstant MIN;
        public static final int SEC_AS_NANOSECOND = 1000000000;

        private Companion() {
        }

        static {
            Companion companion = new Companion();
            $$INSTANCE = companion;
            MIN = companion.from(Long.MIN_VALUE, -999999999);
            MAX = companion.from(Long.MAX_VALUE, 999999999);
        }

        public final RealmInstant getMIN() {
            return MIN;
        }

        public final RealmInstant getMAX() {
            return MAX;
        }

        public final RealmInstant from(long epochSeconds, int nanosecondAdjustment) {
            if ((epochSeconds > 0 && nanosecondAdjustment < 0) || (epochSeconds < 0 && nanosecondAdjustment > 0)) {
                throw new IllegalArgumentException("Arguments must be both positive or negative.");
            }
            long j = nanosecondAdjustment / 1000000000;
            int i = nanosecondAdjustment % 1000000000;
            long j2 = epochSeconds + j;
            if (((epochSeconds ^ j2) & (j ^ j2)) < 0) {
                return epochSeconds < 0 ? MIN : MAX;
            }
            return new RealmInstantImpl(j2, i);
        }

        public final RealmInstant now() {
            return SystemUtilsAndroidKt.currentTime();
        }
    }
}
