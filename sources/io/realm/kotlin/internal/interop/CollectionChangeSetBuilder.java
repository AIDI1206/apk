package io.realm.kotlin.internal.interop;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionChangeSetBuilder.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010+\u001a\u00020,J7\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020&2%\u0010/\u001a!\u0012\u0013\u0012\u00110&¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020&00j\u0002`4H&Ji\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010.\u001a\u00020&2%\u00106\u001a!\u0012\u0013\u0012\u00110&¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020&00j\u0002`42%\u00107\u001a!\u0012\u0013\u0012\u00110&¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020&00j\u0002`4H&¢\u0006\u0002\u00108J\r\u00109\u001a\u00028\u0000H&¢\u0006\u0002\u0010:R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0007X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016X\u0086.¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016X\u0086.¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016X\u0086.¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b \u0010\u0018\"\u0004\b!\u0010\u001aR\"\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0016X\u0086.¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006;"}, d2 = {"Lio/realm/kotlin/internal/interop/CollectionChangeSetBuilder;", ExifInterface.GPS_DIRECTION_TRUE, "R", "", "<init>", "()V", "insertionIndices", "", "getInsertionIndices", "()[I", "setInsertionIndices", "([I)V", "deletionIndices", "getDeletionIndices", "setDeletionIndices", "modificationIndices", "getModificationIndices", "setModificationIndices", "modificationIndicesAfter", "getModificationIndicesAfter", "setModificationIndicesAfter", "deletionRanges", "", "getDeletionRanges", "()[Ljava/lang/Object;", "setDeletionRanges", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "insertionRanges", "getInsertionRanges", "setInsertionRanges", "modificationRanges", "getModificationRanges", "setModificationRanges", "modificationRangesAfter", "getModificationRangesAfter", "setModificationRangesAfter", "movesCount", "", "getMovesCount", "()I", "setMovesCount", "(I)V", "isEmpty", "", "initIndicesArray", "size", "indicesAccessor", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "Lio/realm/kotlin/internal/interop/ArrayAccessor;", "initRangesArray", "fromAccessor", "toAccessor", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "build", "()Ljava/lang/Object;", "cinterop_release"}, k = 1, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public abstract class CollectionChangeSetBuilder<T, R> {
    public int[] deletionIndices;
    public R[] deletionRanges;
    public int[] insertionIndices;
    public R[] insertionRanges;
    public int[] modificationIndices;
    public int[] modificationIndicesAfter;
    public R[] modificationRanges;
    public R[] modificationRangesAfter;
    private int movesCount;

    public abstract T build();

    public abstract int[] initIndicesArray(int size, Function1<? super Integer, Integer> indicesAccessor);

    public abstract R[] initRangesArray(int size, Function1<? super Integer, Integer> fromAccessor, Function1<? super Integer, Integer> toAccessor);

    public final int[] getInsertionIndices() {
        int[] iArr = this.insertionIndices;
        if (iArr != null) {
            return iArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("insertionIndices");
        return null;
    }

    public final void setInsertionIndices(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.insertionIndices = iArr;
    }

    public final int[] getDeletionIndices() {
        int[] iArr = this.deletionIndices;
        if (iArr != null) {
            return iArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deletionIndices");
        return null;
    }

    public final void setDeletionIndices(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.deletionIndices = iArr;
    }

    public final int[] getModificationIndices() {
        int[] iArr = this.modificationIndices;
        if (iArr != null) {
            return iArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("modificationIndices");
        return null;
    }

    public final void setModificationIndices(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.modificationIndices = iArr;
    }

    public final int[] getModificationIndicesAfter() {
        int[] iArr = this.modificationIndicesAfter;
        if (iArr != null) {
            return iArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("modificationIndicesAfter");
        return null;
    }

    public final void setModificationIndicesAfter(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.modificationIndicesAfter = iArr;
    }

    public final R[] getDeletionRanges() {
        R[] rArr = this.deletionRanges;
        if (rArr != null) {
            return rArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deletionRanges");
        return null;
    }

    public final void setDeletionRanges(R[] rArr) {
        Intrinsics.checkNotNullParameter(rArr, "<set-?>");
        this.deletionRanges = rArr;
    }

    public final R[] getInsertionRanges() {
        R[] rArr = this.insertionRanges;
        if (rArr != null) {
            return rArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("insertionRanges");
        return null;
    }

    public final void setInsertionRanges(R[] rArr) {
        Intrinsics.checkNotNullParameter(rArr, "<set-?>");
        this.insertionRanges = rArr;
    }

    public final R[] getModificationRanges() {
        R[] rArr = this.modificationRanges;
        if (rArr != null) {
            return rArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("modificationRanges");
        return null;
    }

    public final void setModificationRanges(R[] rArr) {
        Intrinsics.checkNotNullParameter(rArr, "<set-?>");
        this.modificationRanges = rArr;
    }

    public final R[] getModificationRangesAfter() {
        R[] rArr = this.modificationRangesAfter;
        if (rArr != null) {
            return rArr;
        }
        Intrinsics.throwUninitializedPropertyAccessException("modificationRangesAfter");
        return null;
    }

    public final void setModificationRangesAfter(R[] rArr) {
        Intrinsics.checkNotNullParameter(rArr, "<set-?>");
        this.modificationRangesAfter = rArr;
    }

    public final int getMovesCount() {
        return this.movesCount;
    }

    public final void setMovesCount(int i) {
        this.movesCount = i;
    }

    public final boolean isEmpty() {
        return getInsertionIndices().length == 0 && getModificationIndices().length == 0 && getDeletionIndices().length == 0 && this.movesCount == 0;
    }
}
