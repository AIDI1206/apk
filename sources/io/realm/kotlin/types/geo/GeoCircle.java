package io.realm.kotlin.types.geo;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.realm.kotlin.annotations.ExperimentalGeoSpatialApi;
import io.realm.kotlin.internal.geo.UnmanagedGeoCircle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GeoCircle.kt */
/* JADX INFO: loaded from: classes7.dex */
@ExperimentalGeoSpatialApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\b\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lio/realm/kotlin/types/geo/GeoCircle;", "", TtmlNode.CENTER, "Lio/realm/kotlin/types/geo/GeoPoint;", "getCenter", "()Lio/realm/kotlin/types/geo/GeoPoint;", "radius", "Lio/realm/kotlin/types/geo/Distance;", "getRadius", "()Lio/realm/kotlin/types/geo/Distance;", "toString", "", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface GeoCircle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    GeoPoint getCenter();

    Distance getRadius();

    String toString();

    /* JADX INFO: compiled from: GeoCircle.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lio/realm/kotlin/types/geo/GeoCircle$Companion;", "", "<init>", "()V", "create", "Lio/realm/kotlin/types/geo/GeoCircle;", TtmlNode.CENTER, "Lio/realm/kotlin/types/geo/GeoPoint;", "radius", "Lio/realm/kotlin/types/geo/Distance;", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final GeoCircle create(GeoPoint center, Distance radius) {
            Intrinsics.checkNotNullParameter(center, "center");
            Intrinsics.checkNotNullParameter(radius, "radius");
            return new UnmanagedGeoCircle(center, radius);
        }
    }
}
