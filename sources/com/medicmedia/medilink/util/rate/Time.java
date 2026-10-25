package com.medicmedia.medilink.util.rate;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.MustBeDocumented;

/* JADX INFO: compiled from: Time.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00052\u00020\u0001:\u0002\u0004\u0005B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/medicmedia/medilink/util/rate/Time;", "", "<init>", "()V", "TimeUnits", "Companion", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public class Time {
    public static final int $stable = 0;
    public static final long DAY = 86400000;
    public static final long HOUR = 3600000;
    public static final long MILLISECOND = 1;
    public static final long MINUTE = 60000;
    public static final long MONTH = 2592000000L;
    public static final long SECOND = 1000;
    public static final long WEEK = 604800000;
    public static final long YEAR = 31536000000L;

    /* JADX INFO: compiled from: Time.kt */
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/medicmedia/medilink/util/rate/Time$TimeUnits;", "", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TimeUnits {
    }
}
