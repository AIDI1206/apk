package sh.calvin.reorderable;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReorderableLazyCollection.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u001c\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001e\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001dH\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u0012X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Lsh/calvin/reorderable/LazyCollectionLayoutInfo;", ExifInterface.GPS_DIRECTION_TRUE, "", "beforeContentPadding", "", "getBeforeContentPadding", "()I", "mainAxisViewportSize", "getMainAxisViewportSize", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "reverseLayout", "", "getReverseLayout", "()Z", "viewportSize", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "()J", "visibleItemsInfo", "", "Lsh/calvin/reorderable/LazyCollectionItemInfo;", "getVisibleItemsInfo", "()Ljava/util/List;", "getItemsInContentArea", "padding", "Lsh/calvin/reorderable/AbsolutePixelPadding;", "Lsh/calvin/reorderable/CollectionScrollPadding;", "getScrollAreaOffsets", "Lsh/calvin/reorderable/ScrollAreaOffsets;", "reorderable_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public interface LazyCollectionLayoutInfo<T> {

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

    int getBeforeContentPadding();

    List<LazyCollectionItemInfo<T>> getItemsInContentArea(AbsolutePixelPadding padding);

    List<LazyCollectionItemInfo<T>> getItemsInContentArea(CollectionScrollPadding padding);

    int getMainAxisViewportSize();

    Orientation getOrientation();

    boolean getReverseLayout();

    ScrollAreaOffsets getScrollAreaOffsets(AbsolutePixelPadding padding);

    ScrollAreaOffsets getScrollAreaOffsets(CollectionScrollPadding padding);

    /* JADX INFO: renamed from: getViewportSize-YbymL2g, reason: not valid java name */
    long mo13410getViewportSizeYbymL2g();

    List<LazyCollectionItemInfo<T>> getVisibleItemsInfo();

    /* JADX INFO: compiled from: ReorderableLazyCollection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static <T> int getMainAxisViewportSize(LazyCollectionLayoutInfo<? extends T> lazyCollectionLayoutInfo) {
            int i = WhenMappings.$EnumSwitchMapping$0[lazyCollectionLayoutInfo.getOrientation().ordinal()];
            if (i == 1) {
                return IntSize.m8873getHeightimpl(lazyCollectionLayoutInfo.mo13410getViewportSizeYbymL2g());
            }
            if (i == 2) {
                return IntSize.m8874getWidthimpl(lazyCollectionLayoutInfo.mo13410getViewportSizeYbymL2g());
            }
            throw new NoWhenBranchMatchedException();
        }

        public static <T> ScrollAreaOffsets getScrollAreaOffsets(LazyCollectionLayoutInfo<? extends T> lazyCollectionLayoutInfo, AbsolutePixelPadding padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            return lazyCollectionLayoutInfo.getScrollAreaOffsets(CollectionScrollPadding.INSTANCE.fromAbsolutePixelPadding(lazyCollectionLayoutInfo.getOrientation(), padding, lazyCollectionLayoutInfo.getReverseLayout()));
        }

        public static <T> ScrollAreaOffsets getScrollAreaOffsets(LazyCollectionLayoutInfo<? extends T> lazyCollectionLayoutInfo, CollectionScrollPadding padding) {
            int iM8873getHeightimpl;
            Intrinsics.checkNotNullParameter(padding, "padding");
            float start = padding.getStart();
            float end = padding.getEnd();
            int i = WhenMappings.$EnumSwitchMapping$0[lazyCollectionLayoutInfo.getOrientation().ordinal()];
            if (i == 1) {
                iM8873getHeightimpl = IntSize.m8873getHeightimpl(lazyCollectionLayoutInfo.mo13410getViewportSizeYbymL2g());
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iM8873getHeightimpl = IntSize.m8874getWidthimpl(lazyCollectionLayoutInfo.mo13410getViewportSizeYbymL2g());
            }
            return new ScrollAreaOffsets(start, iM8873getHeightimpl - end);
        }

        public static <T> List<LazyCollectionItemInfo<T>> getItemsInContentArea(LazyCollectionLayoutInfo<? extends T> lazyCollectionLayoutInfo, AbsolutePixelPadding padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            return lazyCollectionLayoutInfo.getItemsInContentArea(CollectionScrollPadding.INSTANCE.fromAbsolutePixelPadding(lazyCollectionLayoutInfo.getOrientation(), padding, lazyCollectionLayoutInfo.getReverseLayout()));
        }

        public static /* synthetic */ List getItemsInContentArea$default(LazyCollectionLayoutInfo lazyCollectionLayoutInfo, CollectionScrollPadding collectionScrollPadding, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getItemsInContentArea");
            }
            if ((i & 1) != 0) {
                collectionScrollPadding = CollectionScrollPadding.INSTANCE.getZero();
            }
            return lazyCollectionLayoutInfo.getItemsInContentArea(collectionScrollPadding);
        }

        public static <T> List<LazyCollectionItemInfo<T>> getItemsInContentArea(LazyCollectionLayoutInfo<? extends T> lazyCollectionLayoutInfo, CollectionScrollPadding padding) {
            Intrinsics.checkNotNullParameter(padding, "padding");
            ScrollAreaOffsets scrollAreaOffsets = lazyCollectionLayoutInfo.getScrollAreaOffsets(padding);
            float start = scrollAreaOffsets.getStart();
            float end = scrollAreaOffsets.getEnd();
            int i = WhenMappings.$EnumSwitchMapping$0[lazyCollectionLayoutInfo.getOrientation().ordinal()];
            if (i == 1) {
                List<LazyCollectionItemInfo<? extends T>> visibleItemsInfo = lazyCollectionLayoutInfo.getVisibleItemsInfo();
                ArrayList arrayList = new ArrayList();
                for (T t : visibleItemsInfo) {
                    LazyCollectionItemInfo lazyCollectionItemInfo = (LazyCollectionItemInfo) t;
                    if (IntOffset.m8832getYimpl(lazyCollectionItemInfo.mo13407getOffsetnOccac()) >= start && IntOffset.m8832getYimpl(lazyCollectionItemInfo.mo13407getOffsetnOccac()) + IntSize.m8873getHeightimpl(lazyCollectionItemInfo.mo13408getSizeYbymL2g()) <= end) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
            if (i == 2) {
                List<LazyCollectionItemInfo<? extends T>> visibleItemsInfo2 = lazyCollectionLayoutInfo.getVisibleItemsInfo();
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : visibleItemsInfo2) {
                    LazyCollectionItemInfo lazyCollectionItemInfo2 = (LazyCollectionItemInfo) t2;
                    if (IntOffset.m8831getXimpl(lazyCollectionItemInfo2.mo13407getOffsetnOccac()) >= start && IntOffset.m8831getXimpl(lazyCollectionItemInfo2.mo13407getOffsetnOccac()) + IntSize.m8874getWidthimpl(lazyCollectionItemInfo2.mo13408getSizeYbymL2g()) <= end) {
                        arrayList2.add(t2);
                    }
                }
                return arrayList2;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
