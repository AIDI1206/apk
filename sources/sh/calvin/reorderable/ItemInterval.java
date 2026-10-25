package sh.calvin.reorderable;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ReorderableList.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u0018"}, d2 = {"Lsh/calvin/reorderable/ItemInterval;", "", TtmlNode.START, "", "size", "", "(FI)V", TtmlNode.CENTER, "getCenter", "()F", TtmlNode.END, "getEnd", "getSize", "()I", "getStart", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "reorderable_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final /* data */ class ItemInterval {
    public static final int $stable = 0;
    private final int size;
    private final float start;

    public ItemInterval() {
        this(0.0f, 0, 3, null);
    }

    public static /* synthetic */ ItemInterval copy$default(ItemInterval itemInterval, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = itemInterval.start;
        }
        if ((i2 & 2) != 0) {
            i = itemInterval.size;
        }
        return itemInterval.copy(f, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public final ItemInterval copy(float start, int size) {
        return new ItemInterval(start, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemInterval)) {
            return false;
        }
        ItemInterval itemInterval = (ItemInterval) other;
        return Float.compare(this.start, itemInterval.start) == 0 && this.size == itemInterval.size;
    }

    public int hashCode() {
        return (Float.hashCode(this.start) * 31) + Integer.hashCode(this.size);
    }

    public String toString() {
        return "ItemInterval(start=" + this.start + ", size=" + this.size + ')';
    }

    public ItemInterval(float f, int i) {
        this.start = f;
        this.size = i;
    }

    public /* synthetic */ ItemInterval(float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0 : i);
    }

    public final int getSize() {
        return this.size;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getCenter() {
        return this.start + (this.size / 2);
    }

    public final float getEnd() {
        return this.start + this.size;
    }
}
