package io.realm.kotlin.internal.geo;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.types.geo.GeoPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: UnmanagedGeoPoint.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lio/realm/kotlin/internal/geo/UnmanagedGeoPoint;", "Lio/realm/kotlin/types/geo/GeoPoint;", "latitude", "", "longitude", "<init>", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class UnmanagedGeoPoint implements GeoPoint {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final double MAX_LATITUDE = 90.0d;

    @Deprecated
    public static final double MAX_LONGITUDE = 180.0d;

    @Deprecated
    public static final double MIN_LATITUDE = -90.0d;

    @Deprecated
    public static final double MIN_LONGITUDE = -180.0d;
    private final double latitude;
    private final double longitude;

    public static /* synthetic */ UnmanagedGeoPoint copy$default(UnmanagedGeoPoint unmanagedGeoPoint, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = unmanagedGeoPoint.latitude;
        }
        if ((i & 2) != 0) {
            d2 = unmanagedGeoPoint.longitude;
        }
        return unmanagedGeoPoint.copy(d, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final UnmanagedGeoPoint copy(double latitude, double longitude) {
        return new UnmanagedGeoPoint(latitude, longitude);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnmanagedGeoPoint)) {
            return false;
        }
        UnmanagedGeoPoint unmanagedGeoPoint = (UnmanagedGeoPoint) other;
        return Double.compare(this.latitude, unmanagedGeoPoint.latitude) == 0 && Double.compare(this.longitude, unmanagedGeoPoint.longitude) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude);
    }

    public String toString() {
        return "UnmanagedGeoPoint(latitude=" + this.latitude + ", longitude=" + this.longitude + ')';
    }

    public UnmanagedGeoPoint(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
        if (getLatitude() < -90.0d || getLatitude() > 90.0d) {
            throw new IllegalArgumentException("Latitude is outside the valid range -90 <= lat <= 90: " + getLatitude());
        }
        if (getLongitude() < -180.0d || getLongitude() > 180.0d) {
            throw new IllegalArgumentException("Longitude is outside the valid range -180 <= lat <= 180: " + getLongitude());
        }
    }

    @Override // io.realm.kotlin.types.geo.GeoPoint
    public double getLatitude() {
        return this.latitude;
    }

    @Override // io.realm.kotlin.types.geo.GeoPoint
    public double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: compiled from: UnmanagedGeoPoint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/realm/kotlin/internal/geo/UnmanagedGeoPoint$Companion;", "", "<init>", "()V", "MIN_LATITUDE", "", "MAX_LATITUDE", "MIN_LONGITUDE", "MAX_LONGITUDE", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
