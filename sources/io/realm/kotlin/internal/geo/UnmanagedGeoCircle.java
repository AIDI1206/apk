package io.realm.kotlin.internal.geo;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.realm.kotlin.types.geo.Distance;
import io.realm.kotlin.types.geo.GeoCircle;
import io.realm.kotlin.types.geo.GeoPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnmanagedGeoCircle.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lio/realm/kotlin/internal/geo/UnmanagedGeoCircle;", "Lio/realm/kotlin/types/geo/GeoCircle;", TtmlNode.CENTER, "Lio/realm/kotlin/types/geo/GeoPoint;", "radius", "Lio/realm/kotlin/types/geo/Distance;", "<init>", "(Lio/realm/kotlin/types/geo/GeoPoint;Lio/realm/kotlin/types/geo/Distance;)V", "getCenter", "()Lio/realm/kotlin/types/geo/GeoPoint;", "getRadius", "()Lio/realm/kotlin/types/geo/Distance;", "toString", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class UnmanagedGeoCircle implements GeoCircle {
    private final GeoPoint center;
    private final Distance radius;

    public static /* synthetic */ UnmanagedGeoCircle copy$default(UnmanagedGeoCircle unmanagedGeoCircle, GeoPoint geoPoint, Distance distance, int i, Object obj) {
        if ((i & 1) != 0) {
            geoPoint = unmanagedGeoCircle.center;
        }
        if ((i & 2) != 0) {
            distance = unmanagedGeoCircle.radius;
        }
        return unmanagedGeoCircle.copy(geoPoint, distance);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GeoPoint getCenter() {
        return this.center;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Distance getRadius() {
        return this.radius;
    }

    public final UnmanagedGeoCircle copy(GeoPoint center, Distance radius) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(radius, "radius");
        return new UnmanagedGeoCircle(center, radius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnmanagedGeoCircle)) {
            return false;
        }
        UnmanagedGeoCircle unmanagedGeoCircle = (UnmanagedGeoCircle) other;
        return Intrinsics.areEqual(this.center, unmanagedGeoCircle.center) && Intrinsics.areEqual(this.radius, unmanagedGeoCircle.radius);
    }

    public int hashCode() {
        return (this.center.hashCode() * 31) + this.radius.hashCode();
    }

    public UnmanagedGeoCircle(GeoPoint center, Distance radius) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(radius, "radius");
        this.center = center;
        this.radius = radius;
        if (getRadius().getInRadians() < 0.0d) {
            throw new IllegalArgumentException("A negative radius is not allowed: " + getRadius());
        }
    }

    @Override // io.realm.kotlin.types.geo.GeoCircle
    public GeoPoint getCenter() {
        return this.center;
    }

    @Override // io.realm.kotlin.types.geo.GeoCircle
    public Distance getRadius() {
        return this.radius;
    }

    @Override // io.realm.kotlin.types.geo.GeoCircle
    public String toString() {
        return "geoCircle([" + getCenter().getLongitude() + ", " + getCenter().getLatitude() + "], " + getRadius().getInRadians() + ')';
    }
}
