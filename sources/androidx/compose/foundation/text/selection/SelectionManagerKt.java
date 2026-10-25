package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: SelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001e\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0007H\u0002\u001a*\u0010\t\u001a\u00020\u00052\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b0\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a\u001f\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\f\u0010\u001c\u001a\u00020\u0005*\u00020\u000eH\u0000\u001a\u001b\u0010\u001d\u001a\u00020\u001e*\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0010H\u0000¢\u0006\u0004\b \u0010!\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"merge", "Landroidx/compose/foundation/text/selection/Selection;", "lhs", "rhs", "invertedInfiniteRect", "Landroidx/compose/ui/geometry/Rect;", "firstAndLast", "", ExifInterface.GPS_DIRECTION_TRUE, "getSelectedRegionRect", "selectableSubSelectionPairs", "Lkotlin/Pair;", "Landroidx/compose/foundation/text/selection/Selectable;", "containerCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "manager", "Landroidx/compose/foundation/text/selection/SelectionManager;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/SelectionManager;J)J", "getMagnifierCenter", "anchor", "Landroidx/compose/foundation/text/selection/Selection$AnchorInfo;", "getMagnifierCenter-JVtK1S4", "(Landroidx/compose/foundation/text/selection/SelectionManager;JLandroidx/compose/foundation/text/selection/Selection$AnchorInfo;)J", "visibleBounds", "containsInclusive", "", TypedValues.CycleType.S_WAVE_OFFSET, "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "foundation_release"}, k = 2, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class SelectionManagerKt {
    private static final Rect invertedInfiniteRect = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* JADX INFO: compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Selection merge(Selection selection, Selection selection2) {
        Selection selectionMerge;
        return (selection == null || (selectionMerge = selection.merge(selection2)) == null) ? selection2 : selectionMerge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> firstAndLast(List<? extends T> list) {
        int size = list.size();
        return (size == 0 || size == 1) ? list : CollectionsKt.listOf(CollectionsKt.first((List) list), CollectionsKt.last((List) list));
    }

    public static final Rect getSelectedRegionRect(List<? extends Pair<? extends Selectable, Selection>> list, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        int[] iArr;
        List<? extends Pair<? extends Selectable, Selection>> list2 = list;
        if (list2.isEmpty()) {
            return invertedInfiniteRect;
        }
        Rect rect = invertedInfiniteRect;
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        int size = list2.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            Pair<? extends Selectable, Selection> pair = list2.get(i);
            Selectable selectableComponent1 = pair.component1();
            Selection selectionComponent2 = pair.component2();
            int offset = selectionComponent2.getStart().getOffset();
            int offset2 = selectionComponent2.getEnd().getOffset();
            if (offset != offset2 && (layoutCoordinates2 = selectableComponent1.getLayoutCoordinates()) != null) {
                int iMin = Math.min(offset, offset2);
                int iMax = Math.max(offset, offset2) - 1;
                if (iMin == iMax) {
                    iArr = new int[1];
                    iArr[c] = iMin;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c] = iMin;
                    iArr2[1] = iMax;
                    iArr = iArr2;
                }
                Rect rect2 = invertedInfiniteRect;
                float left2 = rect2.getLeft();
                float top2 = rect2.getTop();
                float right2 = rect2.getRight();
                float bottom2 = rect2.getBottom();
                int length = iArr.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2;
                    Rect boundingBox = selectableComponent1.getBoundingBox(iArr[i3]);
                    left2 = Math.min(left2, boundingBox.getLeft());
                    top2 = Math.min(top2, boundingBox.getTop());
                    right2 = Math.max(right2, boundingBox.getRight());
                    bottom2 = Math.max(bottom2, boundingBox.getBottom());
                    i2 = i3 + 1;
                }
                long jM5707constructorimpl = Offset.m5707constructorimpl((((long) Float.floatToRawIntBits(left2)) << 32) | (((long) Float.floatToRawIntBits(top2)) & 4294967295L));
                long jM5707constructorimpl2 = Offset.m5707constructorimpl((((long) Float.floatToRawIntBits(bottom2)) & 4294967295L) | (((long) Float.floatToRawIntBits(right2)) << 32));
                long jMo7386localPositionOfR5De75A = layoutCoordinates.mo7386localPositionOfR5De75A(layoutCoordinates2, jM5707constructorimpl);
                long jMo7386localPositionOfR5De75A2 = layoutCoordinates.mo7386localPositionOfR5De75A(layoutCoordinates2, jM5707constructorimpl2);
                left = Math.min(left, Float.intBitsToFloat((int) (jMo7386localPositionOfR5De75A >> 32)));
                top = Math.min(top, Float.intBitsToFloat((int) (jMo7386localPositionOfR5De75A & 4294967295L)));
                right = Math.max(right, Float.intBitsToFloat((int) (jMo7386localPositionOfR5De75A2 >> 32)));
                bottom = Math.max(bottom, Float.intBitsToFloat((int) (jMo7386localPositionOfR5De75A2 & 4294967295L)));
            }
            i++;
            list2 = list;
            c = 0;
        }
        return new Rect(left, top, right, bottom);
    }

    /* JADX INFO: renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m2096calculateSelectionMagnifierCenterAndroidO0kMr_c(SelectionManager selectionManager, long j) {
        Selection selection = selectionManager.getSelection();
        if (selection == null) {
            return Offset.INSTANCE.m5730getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = selectionManager.getDraggingHandle();
        int i = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i == -1) {
            return Offset.INSTANCE.m5730getUnspecifiedF1C5BW0();
        }
        if (i == 1) {
            return m2098getMagnifierCenterJVtK1S4(selectionManager, j, selection.getStart());
        }
        if (i == 2) {
            return m2098getMagnifierCenterJVtK1S4(selectionManager, j, selection.getEnd());
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("SelectionContainer does not support cursor".toString());
    }

    /* JADX INFO: renamed from: getMagnifierCenter-JVtK1S4, reason: not valid java name */
    private static final long m2098getMagnifierCenterJVtK1S4(SelectionManager selectionManager, long j, Selection.AnchorInfo anchorInfo) {
        LayoutCoordinates containerLayoutCoordinates;
        LayoutCoordinates layoutCoordinates;
        int offset;
        float fCoerceIn;
        Selectable anchorSelectable$foundation_release = selectionManager.getAnchorSelectable$foundation_release(anchorInfo);
        if (anchorSelectable$foundation_release != null && (containerLayoutCoordinates = selectionManager.getContainerLayoutCoordinates()) != null && (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) != null && (offset = anchorInfo.getOffset()) <= anchorSelectable$foundation_release.getLastVisibleOffset()) {
            Offset offsetM2087getCurrentDragPosition_m7T9E = selectionManager.m2087getCurrentDragPosition_m7T9E();
            Intrinsics.checkNotNull(offsetM2087getCurrentDragPosition_m7T9E);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinates.mo7386localPositionOfR5De75A(containerLayoutCoordinates, offsetM2087getCurrentDragPosition_m7T9E.m5725unboximpl()) >> 32));
            long jMo2035getRangeOfLineContainingjx7JFs = anchorSelectable$foundation_release.mo2035getRangeOfLineContainingjx7JFs(offset);
            if (TextRange.m8131getCollapsedimpl(jMo2035getRangeOfLineContainingjx7JFs)) {
                fCoerceIn = anchorSelectable$foundation_release.getLineLeft(offset);
            } else {
                float lineLeft = anchorSelectable$foundation_release.getLineLeft(TextRange.m8137getStartimpl(jMo2035getRangeOfLineContainingjx7JFs));
                float lineRight = anchorSelectable$foundation_release.getLineRight(TextRange.m8132getEndimpl(jMo2035getRangeOfLineContainingjx7JFs) - 1);
                fCoerceIn = RangesKt.coerceIn(fIntBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
            }
            if (fCoerceIn == -1.0f) {
                return Offset.INSTANCE.m5730getUnspecifiedF1C5BW0();
            }
            if (!IntSize.m8872equalsimpl0(j, IntSize.INSTANCE.m8879getZeroYbymL2g()) && Math.abs(fIntBitsToFloat - fCoerceIn) > ((int) (j >> 32)) / 2) {
                return Offset.INSTANCE.m5730getUnspecifiedF1C5BW0();
            }
            float centerYForOffset = anchorSelectable$foundation_release.getCenterYForOffset(offset);
            if (centerYForOffset == -1.0f) {
                return Offset.INSTANCE.m5730getUnspecifiedF1C5BW0();
            }
            return containerLayoutCoordinates.mo7386localPositionOfR5De75A(layoutCoordinates, Offset.m5707constructorimpl((((long) Float.floatToRawIntBits(fCoerceIn)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(centerYForOffset)))));
        }
        return Offset.INSTANCE.m5730getUnspecifiedF1C5BW0();
    }

    public static final Rect visibleBounds(LayoutCoordinates layoutCoordinates) {
        Rect rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
        return RectKt.m5753Rect0a9Yr6o(layoutCoordinates.mo7394windowToLocalMKHz9U(rectBoundsInWindow.m5750getTopLeftF1C5BW0()), layoutCoordinates.mo7394windowToLocalMKHz9U(rectBoundsInWindow.m5744getBottomRightF1C5BW0()));
    }

    /* JADX INFO: renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    public static final boolean m2097containsInclusiveUv8p0NA(Rect rect, long j) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (left > fIntBitsToFloat || fIntBitsToFloat > right) {
            return false;
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return top <= fIntBitsToFloat2 && fIntBitsToFloat2 <= bottom;
    }
}
