package sh.calvin.reorderable;

import androidx.compose.foundation.gestures.Orientation;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReorderableLazyCollection.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lsh/calvin/reorderable/CollectionScrollPadding;", "", TtmlNode.START, "", TtmlNode.END, "(FF)V", "getEnd", "()F", "getStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "reorderable_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class CollectionScrollPadding {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CollectionScrollPadding Zero = new CollectionScrollPadding(0.0f, 0.0f);
    private final float end;
    private final float start;

    public static /* synthetic */ CollectionScrollPadding copy$default(CollectionScrollPadding collectionScrollPadding, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = collectionScrollPadding.start;
        }
        if ((i & 2) != 0) {
            f2 = collectionScrollPadding.end;
        }
        return collectionScrollPadding.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    public final CollectionScrollPadding copy(float start, float end) {
        return new CollectionScrollPadding(start, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectionScrollPadding)) {
            return false;
        }
        CollectionScrollPadding collectionScrollPadding = (CollectionScrollPadding) other;
        return Float.compare(this.start, collectionScrollPadding.start) == 0 && Float.compare(this.end, collectionScrollPadding.end) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.start) * 31) + Float.hashCode(this.end);
    }

    public String toString() {
        return "CollectionScrollPadding(start=" + this.start + ", end=" + this.end + ')';
    }

    public CollectionScrollPadding(float f, float f2) {
        this.start = f;
        this.end = f2;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getEnd() {
        return this.end;
    }

    /* JADX INFO: compiled from: ReorderableLazyCollection.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lsh/calvin/reorderable/CollectionScrollPadding$Companion;", "", "()V", "Zero", "Lsh/calvin/reorderable/CollectionScrollPadding;", "getZero", "()Lsh/calvin/reorderable/CollectionScrollPadding;", "fromAbsolutePixelPadding", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "padding", "Lsh/calvin/reorderable/AbsolutePixelPadding;", "reverseLayout", "", "reorderable_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {

        /* JADX INFO: compiled from: ReorderableLazyCollection.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Orientation.values().length];
                try {
                    iArr[Orientation.Vertical.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Orientation.Horizontal.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CollectionScrollPadding getZero() {
            return CollectionScrollPadding.Zero;
        }

        public final CollectionScrollPadding fromAbsolutePixelPadding(Orientation orientation, AbsolutePixelPadding padding, boolean reverseLayout) {
            CollectionScrollPadding collectionScrollPadding;
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            Intrinsics.checkNotNullParameter(padding, "padding");
            int i = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
            if (i == 1) {
                collectionScrollPadding = new CollectionScrollPadding(padding.getTop(), padding.getBottom());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                collectionScrollPadding = new CollectionScrollPadding(padding.getStart(), padding.getEnd());
            }
            if (reverseLayout) {
                return new CollectionScrollPadding(collectionScrollPadding.getEnd(), collectionScrollPadding.getStart());
            }
            if (reverseLayout) {
                throw new NoWhenBranchMatchedException();
            }
            return collectionScrollPadding;
        }
    }
}
