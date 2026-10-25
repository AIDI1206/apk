package io.realm.kotlin.types.geo;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.realm.kotlin.annotations.ExperimentalGeoSpatialApi;
import io.realm.kotlin.internal.geo.UnmanagedGeoBox;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GeoBox.kt */
/* JADX INFO: loaded from: classes7.dex */
@ExperimentalGeoSpatialApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\b\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Lio/realm/kotlin/types/geo/GeoBox;", "", "bottomLeft", "Lio/realm/kotlin/types/geo/GeoPoint;", "getBottomLeft", "()Lio/realm/kotlin/types/geo/GeoPoint;", "topRight", "getTopRight", "toString", "", "Companion", "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface GeoBox {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    GeoPoint getBottomLeft();

    GeoPoint getTopRight();

    String toString();

    /* JADX INFO: compiled from: GeoBox.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¨\u0006\u000e"}, d2 = {"Lio/realm/kotlin/types/geo/GeoBox$Companion;", "", "<init>", "()V", "create", "Lio/realm/kotlin/types/geo/GeoBox;", "bottomLeft", "Lio/realm/kotlin/types/geo/GeoPoint;", "topRight", "top", "", TtmlNode.LEFT, "bottom", TtmlNode.RIGHT, "io.realm.kotlin.library"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final GeoBox create(GeoPoint bottomLeft, GeoPoint topRight) {
            Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
            Intrinsics.checkNotNullParameter(topRight, "topRight");
            return new UnmanagedGeoBox(bottomLeft, topRight);
        }

        public final GeoBox create(double top, double left, double bottom, double right) {
            return create(GeoPoint.INSTANCE.create(left, bottom), GeoPoint.INSTANCE.create(right, top));
        }
    }
}
