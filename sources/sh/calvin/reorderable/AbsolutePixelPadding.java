package sh.calvin.reorderable;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReorderableLazyCollection.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, d2 = {"Lsh/calvin/reorderable/AbsolutePixelPadding;", "", TtmlNode.START, "", TtmlNode.END, "top", "bottom", "(FFFF)V", "getBottom", "()F", "getEnd", "getStart", "getTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "reorderable_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class AbsolutePixelPadding {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final AbsolutePixelPadding Zero = new AbsolutePixelPadding(0.0f, 0.0f, 0.0f, 0.0f);
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    public static /* synthetic */ AbsolutePixelPadding copy$default(AbsolutePixelPadding absolutePixelPadding, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = absolutePixelPadding.start;
        }
        if ((i & 2) != 0) {
            f2 = absolutePixelPadding.end;
        }
        if ((i & 4) != 0) {
            f3 = absolutePixelPadding.top;
        }
        if ((i & 8) != 0) {
            f4 = absolutePixelPadding.bottom;
        }
        return absolutePixelPadding.copy(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public final AbsolutePixelPadding copy(float start, float end, float top, float bottom) {
        return new AbsolutePixelPadding(start, end, top, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbsolutePixelPadding)) {
            return false;
        }
        AbsolutePixelPadding absolutePixelPadding = (AbsolutePixelPadding) other;
        return Float.compare(this.start, absolutePixelPadding.start) == 0 && Float.compare(this.end, absolutePixelPadding.end) == 0 && Float.compare(this.top, absolutePixelPadding.top) == 0 && Float.compare(this.bottom, absolutePixelPadding.bottom) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.start) * 31) + Float.hashCode(this.end)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.bottom);
    }

    public String toString() {
        return "AbsolutePixelPadding(start=" + this.start + ", end=" + this.end + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }

    public AbsolutePixelPadding(float f, float f2, float f3, float f4) {
        this.start = f;
        this.end = f2;
        this.top = f3;
        this.bottom = f4;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getTop() {
        return this.top;
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: compiled from: ReorderableLazyCollection.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lsh/calvin/reorderable/AbsolutePixelPadding$Companion;", "", "()V", "Zero", "Lsh/calvin/reorderable/AbsolutePixelPadding;", "getZero", "()Lsh/calvin/reorderable/AbsolutePixelPadding;", "fromPaddingValues", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Lsh/calvin/reorderable/AbsolutePixelPadding;", "reorderable_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AbsolutePixelPadding getZero() {
            return AbsolutePixelPadding.Zero;
        }

        public final AbsolutePixelPadding fromPaddingValues(PaddingValues paddingValues, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            composer.startReplaceGroup(1811515208);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1811515208, i, -1, "sh.calvin.reorderable.AbsolutePixelPadding.Companion.fromPaddingValues (ReorderableLazyCollection.kt:81)");
            }
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composer.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) objConsume;
            ProvidableCompositionLocal<LayoutDirection> localLayoutDirection = CompositionLocalsKt.getLocalLayoutDirection();
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composer.consume(localLayoutDirection);
            ComposerKt.sourceInformationMarkerEnd(composer);
            LayoutDirection layoutDirection = (LayoutDirection) objConsume2;
            AbsolutePixelPadding absolutePixelPadding = new AbsolutePixelPadding(density.mo724toPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, layoutDirection)), density.mo724toPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, layoutDirection)), density.mo724toPx0680j_4(paddingValues.getTop()), density.mo724toPx0680j_4(paddingValues.getBottom()));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return absolutePixelPadding;
        }
    }
}
