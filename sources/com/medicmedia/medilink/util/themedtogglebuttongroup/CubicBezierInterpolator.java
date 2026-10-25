package com.medicmedia.medilink.util.themedtogglebuttongroup;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CubicBezierInterpolator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\fB)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\r\u0012\u0006\u0010\u000b\u001a\u00020\r¢\u0006\u0004\b\u0005\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/medicmedia/medilink/util/themedtogglebuttongroup/CubicBezierInterpolator;", "Landroid/view/animation/Interpolator;", TtmlNode.START, "Landroid/graphics/PointF;", TtmlNode.END, "<init>", "(Landroid/graphics/PointF;Landroid/graphics/PointF;)V", "startX", "", "startY", "endX", "endY", "(FFFF)V", "", "(DDDD)V", "a", "b", "c", "getInterpolation", "time", "getBezierCoordinateY", "getXForTime", "getXDerivate", "t", "getBezierCoordinateX", "Companion", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class CubicBezierInterpolator implements Interpolator {
    private PointF a;
    private PointF b;
    private PointF c;
    private PointF end;
    private PointF start;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final CubicBezierInterpolator STANDARD_CURVE = new CubicBezierInterpolator(0.3d, 0.0d, 0.25d, 1.0d);

    public CubicBezierInterpolator(PointF start, PointF end) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.start = start;
        this.end = end;
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public CubicBezierInterpolator(float f, float f2, float f3, float f4) {
        this(new PointF(f, f2), new PointF(f3, f4));
    }

    public CubicBezierInterpolator(double d, double d2, double d3, double d4) {
        this((float) d, (float) d2, (float) d3, (float) d4);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float time) {
        return getBezierCoordinateY(getXForTime(time));
    }

    private final float getBezierCoordinateY(float time) {
        float f = 3;
        this.c.y = this.start.y * f;
        this.b.y = (f * (this.end.y - this.start.y)) - this.c.y;
        this.a.y = (1 - this.c.y) - this.b.y;
        return time * (this.c.y + ((this.b.y + (this.a.y * time)) * time));
    }

    private final float getXForTime(float time) {
        float xDerivate = time;
        for (int i = 1; i < 14; i++) {
            float bezierCoordinateX = getBezierCoordinateX(xDerivate) - time;
            if (Math.abs(bezierCoordinateX) < 0.001d) {
                break;
            }
            xDerivate -= bezierCoordinateX / getXDerivate(xDerivate);
        }
        return xDerivate;
    }

    private final float getXDerivate(float t) {
        return this.c.x + (t * ((2 * this.b.x) + (3 * this.a.x * t)));
    }

    private final float getBezierCoordinateX(float time) {
        float f = 3;
        this.c.x = this.start.x * f;
        this.b.x = (f * (this.end.x - this.start.x)) - this.c.x;
        this.a.x = (1 - this.c.x) - this.b.x;
        return time * (this.c.x + ((this.b.x + (this.a.x * time)) * time));
    }

    /* JADX INFO: compiled from: CubicBezierInterpolator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/medicmedia/medilink/util/themedtogglebuttongroup/CubicBezierInterpolator$Companion;", "", "<init>", "()V", "STANDARD_CURVE", "Lcom/medicmedia/medilink/util/themedtogglebuttongroup/CubicBezierInterpolator;", "getSTANDARD_CURVE", "()Lcom/medicmedia/medilink/util/themedtogglebuttongroup/CubicBezierInterpolator;", "app_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CubicBezierInterpolator getSTANDARD_CURVE() {
            return CubicBezierInterpolator.STANDARD_CURVE;
        }
    }
}
