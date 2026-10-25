package io.realm.kotlin.internal.geo;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.types.geo.GeoBox;
import io.realm.kotlin.types.geo.GeoPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnmanagedGeoBox.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lio/realm/kotlin/internal/geo/UnmanagedGeoBox;", "Lio/realm/kotlin/types/geo/GeoBox;", "bottomLeft", "Lio/realm/kotlin/types/geo/GeoPoint;", "topRight", "<init>", "(Lio/realm/kotlin/types/geo/GeoPoint;Lio/realm/kotlin/types/geo/GeoPoint;)V", "getBottomLeft", "()Lio/realm/kotlin/types/geo/GeoPoint;", "getTopRight", "toString", "", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class UnmanagedGeoBox implements GeoBox {
    private final GeoPoint bottomLeft;
    private final GeoPoint topRight;

    public static /* synthetic */ UnmanagedGeoBox copy$default(UnmanagedGeoBox unmanagedGeoBox, GeoPoint geoPoint, GeoPoint geoPoint2, int i, Object obj) {
        if ((i & 1) != 0) {
            geoPoint = unmanagedGeoBox.bottomLeft;
        }
        if ((i & 2) != 0) {
            geoPoint2 = unmanagedGeoBox.topRight;
        }
        return unmanagedGeoBox.copy(geoPoint, geoPoint2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GeoPoint getBottomLeft() {
        return this.bottomLeft;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GeoPoint getTopRight() {
        return this.topRight;
    }

    public final UnmanagedGeoBox copy(GeoPoint bottomLeft, GeoPoint topRight) {
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        return new UnmanagedGeoBox(bottomLeft, topRight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnmanagedGeoBox)) {
            return false;
        }
        UnmanagedGeoBox unmanagedGeoBox = (UnmanagedGeoBox) other;
        return Intrinsics.areEqual(this.bottomLeft, unmanagedGeoBox.bottomLeft) && Intrinsics.areEqual(this.topRight, unmanagedGeoBox.topRight);
    }

    public int hashCode() {
        return (this.bottomLeft.hashCode() * 31) + this.topRight.hashCode();
    }

    public UnmanagedGeoBox(GeoPoint bottomLeft, GeoPoint topRight) {
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    @Override // io.realm.kotlin.types.geo.GeoBox
    public GeoPoint getBottomLeft() {
        return this.bottomLeft;
    }

    @Override // io.realm.kotlin.types.geo.GeoBox
    public GeoPoint getTopRight() {
        return this.topRight;
    }

    @Override // io.realm.kotlin.types.geo.GeoBox
    public String toString() {
        return "geoBox([" + getBottomLeft().getLongitude() + ", " + getBottomLeft().getLatitude() + "], [" + getTopRight().getLongitude() + ", " + getTopRight().getLatitude() + "])";
    }
}
