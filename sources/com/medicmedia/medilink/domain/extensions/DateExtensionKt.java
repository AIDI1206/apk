package com.medicmedia.medilink.domain.extensions;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.types.RealmInstant;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DateExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0002*\u00020\u0002¨\u0006\u0007"}, d2 = {"toRealmInstant", "Lio/realm/kotlin/types/RealmInstant;", "Ljava/util/Date;", "toDate", "toEpochMillis", "", "toZeroTime", "domain_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DateExtensionKt {
    public static final RealmInstant toRealmInstant(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        long time = date.getTime();
        long j = 1000;
        return RealmInstant.INSTANCE.from(time / j, (int) ((time % j) * ((long) 1000000)));
    }

    public static final Date toDate(RealmInstant realmInstant) {
        Intrinsics.checkNotNullParameter(realmInstant, "<this>");
        return new Date(toEpochMillis(realmInstant));
    }

    public static final long toEpochMillis(RealmInstant realmInstant) {
        Intrinsics.checkNotNullParameter(realmInstant, "<this>");
        return (realmInstant.getEpochSeconds() * ((long) 1000)) + ((long) (realmInstant.getNanosecondsOfSecond() / 1000000));
    }

    public static final Date toZeroTime(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }
}
