package io.realm.kotlin.ext;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.realm.kotlin.annotations.ExperimentalGeoSpatialApi;
import io.realm.kotlin.types.geo.Distance;
import kotlin.Metadata;

/* JADX INFO: compiled from: DoubleExt.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"\u001f\u0010\n\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\"\u001f\u0010\r\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"km", "Lio/realm/kotlin/types/geo/Distance;", "", "getKm$annotations", "(D)V", "getKm", "(D)Lio/realm/kotlin/types/geo/Distance;", "miles", "getMiles$annotations", "getMiles", "radians", "getRadians$annotations", "getRadians", "degrees", "getDegrees$annotations", "getDegrees", "io.realm.kotlin.library"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class DoubleExtKt {
    @ExperimentalGeoSpatialApi
    public static /* synthetic */ void getDegrees$annotations(double d) {
    }

    @ExperimentalGeoSpatialApi
    public static /* synthetic */ void getKm$annotations(double d) {
    }

    @ExperimentalGeoSpatialApi
    public static /* synthetic */ void getMiles$annotations(double d) {
    }

    @ExperimentalGeoSpatialApi
    public static /* synthetic */ void getRadians$annotations(double d) {
    }

    public static final Distance getKm(double d) {
        return Distance.INSTANCE.fromKilometers(d);
    }

    public static final Distance getMiles(double d) {
        return Distance.INSTANCE.fromMiles(d);
    }

    public static final Distance getRadians(double d) {
        return Distance.INSTANCE.fromRadians(d);
    }

    public static final Distance getDegrees(double d) {
        return Distance.INSTANCE.fromDegrees(d);
    }
}
