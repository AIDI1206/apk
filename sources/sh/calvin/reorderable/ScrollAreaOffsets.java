package sh.calvin.reorderable;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: ReorderableLazyCollection.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lsh/calvin/reorderable/ScrollAreaOffsets;", "", TtmlNode.START, "", TtmlNode.END, "(FF)V", "getEnd", "()F", "getStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "reorderable_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ScrollAreaOffsets {
    public static final int $stable = 0;
    private final float end;
    private final float start;

    public static /* synthetic */ ScrollAreaOffsets copy$default(ScrollAreaOffsets scrollAreaOffsets, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = scrollAreaOffsets.start;
        }
        if ((i & 2) != 0) {
            f2 = scrollAreaOffsets.end;
        }
        return scrollAreaOffsets.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    public final ScrollAreaOffsets copy(float start, float end) {
        return new ScrollAreaOffsets(start, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollAreaOffsets)) {
            return false;
        }
        ScrollAreaOffsets scrollAreaOffsets = (ScrollAreaOffsets) other;
        return Float.compare(this.start, scrollAreaOffsets.start) == 0 && Float.compare(this.end, scrollAreaOffsets.end) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.start) * 31) + Float.hashCode(this.end);
    }

    public String toString() {
        return "ScrollAreaOffsets(start=" + this.start + ", end=" + this.end + ')';
    }

    public ScrollAreaOffsets(float f, float f2) {
        this.start = f;
        this.end = f2;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getEnd() {
        return this.end;
    }
}
