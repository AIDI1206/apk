package io.realm.kotlin.types.geo;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.annotations.ExperimentalGeoSpatialApi;
import io.realm.kotlin.internal.geo.UnmanagedGeoPoint;
import kotlin.Metadata;

/* JADX INFO: compiled from: GeoPoint.kt */
/* JADX INFO: loaded from: classes7.dex */
@ExperimentalGeoSpatialApi
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\bg\u0018\u0000 \b2\u00020\u0001:\u0001\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lio/realm/kotlin/types/geo/GeoPoint;", "", "latitude", "", "getLatitude", "()D", "longitude", "getLongitude", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface GeoPoint {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    double getLatitude();

    double getLongitude();

    /* JADX INFO: compiled from: GeoPoint.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lio/realm/kotlin/types/geo/GeoPoint$Companion;", "", "<init>", "()V", "create", "Lio/realm/kotlin/types/geo/GeoPoint;", "latitude", "", "longitude", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final GeoPoint create(double latitude, double longitude) {
            return new UnmanagedGeoPoint(latitude, longitude);
        }
    }
}
