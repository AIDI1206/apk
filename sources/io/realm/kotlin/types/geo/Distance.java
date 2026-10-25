package io.realm.kotlin.types.geo;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.annotations.ExperimentalGeoSpatialApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Distance.kt */
/* JADX INFO: loaded from: classes7.dex */
@ExperimentalGeoSpatialApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0019"}, d2 = {"Lio/realm/kotlin/types/geo/Distance;", "", "radians", "", "<init>", "(D)V", "inRadians", "getInRadians", "()D", "inDegrees", "getInDegrees", "inKilometers", "getInKilometers", "inMiles", "getInMiles", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class Distance {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final double DEGREE_TO_RADIAN = 0.017453292519943295d;
    public static final double EARTH_RADIUS_KM = 6371.0d;
    public static final double KM_PR_MILE = 1.609344d;
    private static final double RADIAN_TO_DEGREE = 57.29577951308232d;
    private final double radians;

    public /* synthetic */ Distance(double d, DefaultConstructorMarker defaultConstructorMarker) {
        this(d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final double getRadians() {
        return this.radians;
    }

    public static /* synthetic */ Distance copy$default(Distance distance, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = distance.radians;
        }
        return distance.copy(d);
    }

    public final Distance copy(double radians) {
        return new Distance(radians);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Distance) && Double.compare(this.radians, ((Distance) other).radians) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.radians);
    }

    public String toString() {
        return "Distance(radians=" + this.radians + ')';
    }

    private Distance(double d) {
        this.radians = d;
        if (d < 0.0d) {
            throw new IllegalArgumentException("Negative distance is now allowed: " + d);
        }
    }

    /* JADX INFO: compiled from: Distance.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/realm/kotlin/types/geo/Distance$Companion;", "", "<init>", "()V", "DEGREE_TO_RADIAN", "", "RADIAN_TO_DEGREE", "EARTH_RADIUS_KM", "KM_PR_MILE", "fromKilometers", "Lio/realm/kotlin/types/geo/Distance;", "km", "fromMiles", "miles", "fromRadians", "radians", "fromDegrees", "degrees", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Distance fromKilometers(double km) {
            double d = 0.0d;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (km == 0.0d) {
                return new Distance(d, defaultConstructorMarker);
            }
            return new Distance(km / 6371.0d, defaultConstructorMarker);
        }

        public final Distance fromMiles(double miles) {
            double d = 0.0d;
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (miles == 0.0d) {
                return new Distance(d, defaultConstructorMarker);
            }
            return new Distance((miles * 1.609344d) / 6371.0d, defaultConstructorMarker);
        }

        public final Distance fromRadians(double radians) {
            return new Distance(radians, null);
        }

        public final Distance fromDegrees(double degrees) {
            return new Distance(degrees * Distance.DEGREE_TO_RADIAN, null);
        }
    }

    public final double getInRadians() {
        return this.radians;
    }

    public final double getInDegrees() {
        return this.radians * RADIAN_TO_DEGREE;
    }

    public final double getInKilometers() {
        double d = this.radians;
        double d2 = 6371.0d * d;
        if (d == 0.0d) {
            return 0.0d;
        }
        if (d2 < d) {
            return Double.POSITIVE_INFINITY;
        }
        return d2;
    }

    public final double getInMiles() {
        double d = this.radians;
        double d2 = (6371.0d * d) / 1.609344d;
        if (d == 0.0d) {
            return 0.0d;
        }
        if (d2 < d) {
            return Double.POSITIVE_INFINITY;
        }
        return d2;
    }
}
